package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    public static final int DEFAULT_TIMEOUT_MS = 1000;
    private static final int MAX_RETRY_COUNT = 10;
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TRANSMIT_TIME_OFFSET = 40;

    @GuardedBy
    private static long elapsedRealtimeOffsetMs = 0;

    @GuardedBy
    private static boolean isInitialized = false;

    @GuardedBy
    private static long lastUpdateElapsedRealtime = -9223372036854775807L;

    @GuardedBy
    private static long maxElapsedTimeUntilUpdateMs = -9223372036854775807L;

    @GuardedBy
    private static String ntpHost = "time.android.com";

    @GuardedBy
    private static int timeoutMs = 1000;
    private static final Object loaderLock = new Object();
    private static final Object valueLock = new Object();

    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    private static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {

        @Nullable
        private final InitializationCallback callback;

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long j2, long j3, boolean z2) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long j2, long j3) {
            if (this.callback != null) {
                if (SntpClient.isInitialized()) {
                    this.callback.onInitialized();
                } else {
                    this.callback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j2, long j3, IOException iOException, int i2) {
            InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }

        public NtpTimeCallback(@Nullable InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }
    }

    private static void checkValidServerReply(byte b2, byte b4, int i2, long j2) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b4 != 4 && b4 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b4));
        }
        if (i2 != 0 && i2 <= 15) {
            if (j2 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i2);
        }
    }

    private static final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws IOException {
            synchronized (SntpClient.loaderLock) {
                synchronized (SntpClient.valueLock) {
                    if (!SntpClient.isInitialized) {
                        long jLoadNtpTimeOffsetMs = SntpClient.loadNtpTimeOffsetMs();
                        synchronized (SntpClient.valueLock) {
                            long unused = SntpClient.lastUpdateElapsedRealtime = SystemClock.elapsedRealtime();
                            long unused2 = SntpClient.elapsedRealtimeOffsetMs = jLoadNtpTimeOffsetMs;
                            boolean unused3 = SntpClient.isInitialized = true;
                        }
                    }
                }
            }
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j2;
        synchronized (valueLock) {
            try {
                j2 = isInitialized ? elapsedRealtimeOffsetMs : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public static long getMaxElapsedTimeUntilUpdateMs() {
        long j2;
        synchronized (valueLock) {
            j2 = maxElapsedTimeUntilUpdateMs;
        }
        return j2;
    }

    public static String getNtpHost() {
        String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static int getTimeoutMs() {
        int i2;
        synchronized (valueLock) {
            i2 = timeoutMs;
        }
        return i2;
    }

    public static boolean isInitialized() {
        boolean z2;
        synchronized (valueLock) {
            try {
                if (lastUpdateElapsedRealtime != -9223372036854775807L && maxElapsedTimeUntilUpdateMs != -9223372036854775807L) {
                    isInitialized = isInitialized && SystemClock.elapsedRealtime() - lastUpdateElapsedRealtime < maxElapsedTimeUntilUpdateMs;
                }
                z2 = isInitialized;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(getTimeoutMs());
            InetAddress[] allByName = InetAddress.getAllByName(getNtpHost());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i2], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                writeTimestamp(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b2 = bArr[0];
                    int i5 = bArr[1] & UByte.MAX_VALUE;
                    long timestamp = readTimestamp(bArr, 24);
                    long timestamp2 = readTimestamp(bArr, 32);
                    long timestamp3 = readTimestamp(bArr, 40);
                    checkValidServerReply((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i5, timestamp3);
                    long j3 = (j2 + (((timestamp2 - timestamp) + (timestamp3 - j2)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j3;
                } catch (SocketTimeoutException e2) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e2;
                    } else {
                        socketTimeoutException.addSuppressed(e2);
                    }
                    int i7 = i3 + 1;
                    if (i3 >= 10) {
                        throw ((SocketTimeoutException) Assertions.checkNotNull(socketTimeoutException));
                    }
                    i2++;
                    i3 = i7;
                }
            }
            throw ((SocketTimeoutException) Assertions.checkNotNull(socketTimeoutException));
        } finally {
        }
    }

    private static long read32(byte[] bArr, int i2) {
        int i3 = bArr[i2];
        int i5 = bArr[i2 + 1];
        int i7 = bArr[i2 + 2];
        int i8 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        return (((long) i3) << 24) + (((long) i5) << 16) + (((long) i7) << 8) + ((long) i8);
    }

    public static void setMaxElapsedTimeUntilUpdateMs(long j2) {
        synchronized (valueLock) {
            maxElapsedTimeUntilUpdateMs = j2;
        }
    }

    public static void setNtpHost(String str) {
        synchronized (valueLock) {
            try {
                if (!ntpHost.equals(str)) {
                    ntpHost = str;
                    isInitialized = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setTimeoutMs(int i2) {
        synchronized (valueLock) {
            try {
                if (timeoutMs != i2) {
                    timeoutMs = i2;
                    isInitialized = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void writeTimestamp(byte[] bArr, int i2, long j2) {
        if (j2 == 0) {
            Arrays.fill(bArr, i2, i2 + 8, (byte) 0);
            return;
        }
        long j3 = j2 / 1000;
        long j4 = j2 - (j3 * 1000);
        long j5 = j3 + OFFSET_1900_TO_1970;
        bArr[i2] = (byte) (j5 >> 24);
        bArr[i2 + 1] = (byte) (j5 >> 16);
        bArr[i2 + 2] = (byte) (j5 >> 8);
        bArr[i2 + 3] = (byte) j5;
        long j6 = (j4 * 4294967296L) / 1000;
        bArr[i2 + 4] = (byte) (j6 >> 24);
        bArr[i2 + 5] = (byte) (j6 >> 16);
        bArr[i2 + 6] = (byte) (j6 >> 8);
        bArr[i2 + 7] = (byte) (Math.random() * 255.0d);
    }

    private SntpClient() {
    }

    public static void initialize(@Nullable Loader loader, @Nullable InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.startLoading(new NtpTimeLoadable(), new NtpTimeCallback(initializationCallback), 1);
        }
    }

    private static long readTimestamp(byte[] bArr, int i2) {
        long j2 = read32(bArr, i2);
        long j3 = read32(bArr, i2 + 4);
        if (j2 == 0 && j3 == 0) {
            return 0L;
        }
        return ((j2 - OFFSET_1900_TO_1970) * 1000) + ((j3 * 1000) / 4294967296L);
    }
}
