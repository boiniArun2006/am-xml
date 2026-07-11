package QNA;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class fuX {
    private static final String rl = Dsr.g(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicLong f8114t = new AtomicLong(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8115n;

    private static byte[] n(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j2);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private static byte[] rl(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j2);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private void J2(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrN = n(time / 1000);
        bArr[0] = bArrN[0];
        bArr[1] = bArrN[1];
        bArr[2] = bArrN[2];
        bArr[3] = bArrN[3];
        byte[] bArrRl = rl(time % 1000);
        bArr[4] = bArrRl[0];
        bArr[5] = bArrRl[1];
    }

    private void O(byte[] bArr) {
        byte[] bArrRl = rl(f8114t.incrementAndGet());
        bArr[6] = bArrRl[0];
        bArr[7] = bArrRl[1];
    }

    public String t() {
        return this.f8115n;
    }

    public String toString() {
        return this.f8115n;
    }

    fuX() {
        byte[] bArr = new byte[10];
        J2(bArr);
        O(bArr);
        nr(bArr);
        String strXQ = Dsr.XQ(bArr);
        Locale locale = Locale.US;
        this.f8115n = String.format(locale, "%s%s%s%s", strXQ.substring(0, 12), strXQ.substring(12, 16), strXQ.subSequence(16, 20), rl.substring(0, 12)).toUpperCase(locale);
    }

    private void nr(byte[] bArr) {
        byte[] bArrRl = rl(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrRl[0];
        bArr[9] = bArrRl[1];
    }
}
