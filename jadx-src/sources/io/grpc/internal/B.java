package io.grpc.internal;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class B {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final RGN f68233n = new w6(new byte[0]);

    private static final class n extends InputStream implements JP.Ew {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private RGN f68234n;

        @Override // java.io.InputStream
        public int read() {
            if (this.f68234n.nr() == 0) {
                return -1;
            }
            return this.f68234n.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f68234n.nr();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f68234n.close();
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            this.f68234n.Po6();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f68234n.markSupported();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f68234n.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            int iMin = (int) Math.min(this.f68234n.nr(), j2);
            this.f68234n.skipBytes(iMin);
            return iMin;
        }

        public n(RGN rgn) {
            this.f68234n = (RGN) t1.Xo.ck(rgn, V8ValueTypedArray.PROPERTY_BUFFER);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            if (this.f68234n.nr() == 0) {
                return -1;
            }
            int iMin = Math.min(this.f68234n.nr(), i3);
            this.f68234n.Rl(bArr, i2, iMin);
            return iMin;
        }
    }

    private static class w6 extends AbstractC2174n {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final byte[] f68235O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68236n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f68237t;

        w6(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // io.grpc.internal.AbstractC2174n, io.grpc.internal.RGN
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.RGN
        public int readUnsignedByte() {
            n(1);
            byte[] bArr = this.f68235O;
            int i2 = this.f68236n;
            this.f68236n = i2 + 1;
            return bArr[i2] & UByte.MAX_VALUE;
        }

        w6(byte[] bArr, int i2, int i3) {
            this.J2 = -1;
            t1.Xo.O(i2 >= 0, "offset must be >= 0");
            t1.Xo.O(i3 >= 0, "length must be >= 0");
            int i5 = i3 + i2;
            t1.Xo.O(i5 <= bArr.length, "offset + length exceeds array boundary");
            this.f68235O = (byte[]) t1.Xo.ck(bArr, "bytes");
            this.f68236n = i2;
            this.f68237t = i5;
        }

        @Override // io.grpc.internal.RGN
        public void I(ByteBuffer byteBuffer) {
            t1.Xo.ck(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            n(iRemaining);
            byteBuffer.put(this.f68235O, this.f68236n, iRemaining);
            this.f68236n += iRemaining;
        }

        @Override // io.grpc.internal.AbstractC2174n, io.grpc.internal.RGN
        public void Po6() {
            this.J2 = this.f68236n;
        }

        @Override // io.grpc.internal.RGN
        public void Rl(byte[] bArr, int i2, int i3) {
            System.arraycopy(this.f68235O, this.f68236n, bArr, i2, i3);
            this.f68236n += i3;
        }

        @Override // io.grpc.internal.RGN
        public int nr() {
            return this.f68237t - this.f68236n;
        }

        @Override // io.grpc.internal.AbstractC2174n, io.grpc.internal.RGN
        public void reset() {
            int i2 = this.J2;
            if (i2 == -1) {
                throw new InvalidMarkException();
            }
            this.f68236n = i2;
        }

        @Override // io.grpc.internal.RGN
        public void ER(OutputStream outputStream, int i2) throws IOException {
            n(i2);
            outputStream.write(this.f68235O, this.f68236n, i2);
            this.f68236n += i2;
        }

        @Override // io.grpc.internal.RGN
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public w6 S(int i2) {
            n(i2);
            int i3 = this.f68236n;
            this.f68236n = i3 + i2;
            return new w6(this.f68235O, i3, i2);
        }

        @Override // io.grpc.internal.RGN
        public void skipBytes(int i2) {
            n(i2);
            this.f68236n += i2;
        }
    }

    class j extends Lu {
        @Override // io.grpc.internal.RGN, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        j(RGN rgn) {
            super(rgn);
        }
    }

    public static RGN J2(byte[] bArr, int i2, int i3) {
        return new w6(bArr, i2, i3);
    }

    public static String O(RGN rgn, Charset charset) {
        t1.Xo.ck(charset, "charset");
        return new String(nr(rgn), charset);
    }

    public static RGN n() {
        return f68233n;
    }

    public static byte[] nr(RGN rgn) {
        t1.Xo.ck(rgn, V8ValueTypedArray.PROPERTY_BUFFER);
        int iNr = rgn.nr();
        byte[] bArr = new byte[iNr];
        rgn.Rl(bArr, 0, iNr);
        return bArr;
    }

    public static RGN rl(RGN rgn) {
        return new j(rgn);
    }

    public static InputStream t(RGN rgn, boolean z2) {
        if (!z2) {
            rgn = rl(rgn);
        }
        return new n(rgn);
    }
}
