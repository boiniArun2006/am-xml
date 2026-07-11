package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@UnstableApi
public class OpusUtil {
    private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
    private static final int FULL_CODEC_INITIALIZATION_DATA_BUFFER_COUNT = 3;
    public static final int MAX_BYTES_PER_SECOND = 63750;
    public static final int SAMPLE_RATE = 48000;

    private static long getPacketDurationUs(byte b2, byte b4) {
        int i2;
        int i3 = b2 & UByte.MAX_VALUE;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = b4 & 63;
            }
        } else {
            i2 = 1;
        }
        int i7 = i3 >> 3;
        int i8 = i7 & 3;
        return ((long) i2) * ((long) (i7 >= 16 ? 2500 << i8 : i7 >= 12 ? 10000 << (i7 & 1) : i8 == 3 ? 60000 : 10000 << i8));
    }

    public static boolean needToDecodeOpusFrame(long j2, long j3) {
        return j2 - j3 <= sampleCountToNanoseconds(3840L) / 1000;
    }

    public static int parseOggPacketForPreAudioSampleByteCount(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b2 = byteBuffer.get(26);
        int i2 = 28;
        int i3 = 28;
        for (int i5 = 0; i5 < b2; i5++) {
            i3 += byteBuffer.get(i5 + 27);
        }
        byte b4 = byteBuffer.get(i3 + 26);
        for (int i7 = 0; i7 < b4; i7++) {
            i2 += byteBuffer.get(i3 + 27 + i7);
        }
        return i3 + i2;
    }

    public static int parsePacketAudioSampleCount(ByteBuffer byteBuffer) {
        return (int) ((getPacketDurationUs(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    private static byte[] buildNativeOrderByteArray(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    public static int getChannelCount(byte[] bArr) {
        return bArr[9] & UByte.MAX_VALUE;
    }

    public static long getPacketDurationUs(byte[] bArr) {
        return getPacketDurationUs(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int getPreSkipSamples(byte[] bArr) {
        return (bArr[10] & UByte.MAX_VALUE) | ((bArr[11] & UByte.MAX_VALUE) << 8);
    }

    private OpusUtil() {
    }

    public static List<byte[]> buildInitializationData(byte[] bArr) {
        long jSampleCountToNanoseconds = sampleCountToNanoseconds(getPreSkipSamples(bArr));
        long jSampleCountToNanoseconds2 = sampleCountToNanoseconds(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(buildNativeOrderByteArray(jSampleCountToNanoseconds));
        arrayList.add(buildNativeOrderByteArray(jSampleCountToNanoseconds2));
        return arrayList;
    }

    public static int parseOggPacketAudioSampleCount(ByteBuffer byteBuffer) {
        byte b2;
        int oggPacketForPreAudioSampleByteCount = parseOggPacketForPreAudioSampleByteCount(byteBuffer);
        int i2 = byteBuffer.get(oggPacketForPreAudioSampleByteCount + 26) + 27 + oggPacketForPreAudioSampleByteCount;
        byte b4 = byteBuffer.get(i2);
        if (byteBuffer.limit() - i2 > 1) {
            b2 = byteBuffer.get(i2 + 1);
        } else {
            b2 = 0;
        }
        return (int) ((getPacketDurationUs(b4, b2) * 48000) / 1000000);
    }

    private static long sampleCountToNanoseconds(long j2) {
        return (j2 * 1000000000) / 48000;
    }
}
