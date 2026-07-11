package JMO;

import OW.Ml;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final OutputStream f4482n = new C0156j();

    /* JADX INFO: renamed from: JMO.j$j, reason: collision with other inner class name */
    class C0156j extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i2) {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Xo.HI(bArr);
        }

        C0156j() {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            Xo.HI(bArr);
            Xo.Z(i2, i3 + i2, bArr.length);
        }
    }

    static byte[] t() {
        return new byte[8192];
    }

    private static byte[] O(InputStream inputStream, Queue queue, int i2) throws IOException {
        int i3;
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i2) * 2));
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i5 = 0;
            while (i5 < iMin2) {
                int i7 = inputStream.read(bArr, i5, iMin2 - i5);
                if (i7 == -1) {
                    return n(queue, i2);
                }
                i5 += i7;
                i2 += i7;
            }
            if (iMin < 4096) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            iMin = Ml.J2(iMin, i3);
        }
        if (inputStream.read() == -1) {
            return n(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] n(Queue queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] nr(InputStream inputStream) {
        Xo.HI(inputStream);
        return O(inputStream, new ArrayDeque(20), 0);
    }

    public static long rl(InputStream inputStream, OutputStream outputStream) throws IOException {
        Xo.HI(inputStream);
        Xo.HI(outputStream);
        byte[] bArrT = t();
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArrT);
            if (i2 == -1) {
                return j2;
            }
            outputStream.write(bArrT, 0, i2);
            j2 += (long) i2;
        }
    }
}
