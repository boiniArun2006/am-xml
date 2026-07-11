package com.google.crypto.tink.shaded.protobuf;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.google.crypto.tink.shaded.protobuf.xZD;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class CodedOutputStream extends CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    C f59871n;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f59870t = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean nr = o7q.E2();

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static class n extends CodedOutputStream {
        private final int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final byte[] f59872O;
        private final int Uo;

        n(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException(V8ValueTypedArray.PROPERTY_BUFFER);
            }
            int i5 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i5)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.f59872O = bArr;
            this.J2 = i2;
            this.KN = i2;
            this.Uo = i5;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void C(int i2, rv6 rv6Var, mz mzVar) throws OutOfSpaceException {
            HV(i2, 2);
            Po6(((com.google.crypto.tink.shaded.protobuf.j) rv6Var).rl(mzVar));
            mzVar.t(rv6Var, this.f59871n);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void EWS(int i2, long j2) throws OutOfSpaceException {
            HV(i2, 0);
            hRu(j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void FX(int i2, boolean z2) throws OutOfSpaceException {
            HV(i2, 0);
            M(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void G7(int i2, fuX fux) throws OutOfSpaceException {
            HV(1, 3);
            GD(2, i2);
            J(3, fux);
            HV(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void GD(int i2, int i3) throws OutOfSpaceException {
            HV(i2, 0);
            Po6(i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void J(int i2, fuX fux) throws OutOfSpaceException {
            HV(i2, 2);
            i(fux);
        }

        public final void K(int i2, rv6 rv6Var) throws OutOfSpaceException {
            HV(i2, 2);
            How(rv6Var);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Mx(int i2, rv6 rv6Var) throws OutOfSpaceException {
            HV(1, 3);
            GD(2, i2);
            K(3, rv6Var);
            HV(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Nxk(int i2, int i3) throws OutOfSpaceException {
            HV(i2, 5);
            Y(i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Org(int i2, String str) throws OutOfSpaceException {
            HV(i2, 2);
            tUK(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void eTf(int i2, int i3) throws OutOfSpaceException {
            HV(i2, 0);
            xg(i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void k(int i2, long j2) throws OutOfSpaceException {
            HV(i2, 1);
            dR0(j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int E() {
            return this.Uo - this.KN;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void M(byte b2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f59872O;
                int i2 = this.KN;
                this.KN = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Po6(int i2) throws OutOfSpaceException {
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f59872O;
                    int i3 = this.KN;
                    this.KN = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
                }
            }
            byte[] bArr2 = this.f59872O;
            int i5 = this.KN;
            this.KN = i5 + 1;
            bArr2[i5] = (byte) i2;
        }

        public final void UhV(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i2, this.f59872O, this.KN, i3);
                this.KN += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Y(int i2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f59872O;
                int i3 = this.KN;
                int i5 = i3 + 1;
                this.KN = i5;
                bArr[i3] = (byte) (i2 & 255);
                int i7 = i3 + 2;
                this.KN = i7;
                bArr[i5] = (byte) ((i2 >> 8) & 255);
                int i8 = i3 + 3;
                this.KN = i8;
                bArr[i7] = (byte) ((i2 >> 16) & 255);
                this.KN = i3 + 4;
                bArr[i8] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void dR0(long j2) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f59872O;
                int i2 = this.KN;
                int i3 = i2 + 1;
                this.KN = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                int i5 = i2 + 2;
                this.KN = i5;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
                int i7 = i2 + 3;
                this.KN = i7;
                bArr[i5] = (byte) (((int) (j2 >> 16)) & 255);
                int i8 = i2 + 4;
                this.KN = i8;
                bArr[i7] = (byte) (((int) (j2 >> 24)) & 255);
                int i9 = i2 + 5;
                this.KN = i9;
                bArr[i8] = (byte) (((int) (j2 >> 32)) & 255);
                int i10 = i2 + 6;
                this.KN = i10;
                bArr[i9] = (byte) (((int) (j2 >> 40)) & 255);
                int i11 = i2 + 7;
                this.KN = i11;
                bArr[i10] = (byte) (((int) (j2 >> 48)) & 255);
                this.KN = i2 + 8;
                bArr[i11] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
            }
        }

        public final void tUK(String str) throws OutOfSpaceException {
            int i2 = this.KN;
            try {
                int iRV9 = CodedOutputStream.rV9(str.length() * 3);
                int iRV92 = CodedOutputStream.rV9(str.length());
                if (iRV92 != iRV9) {
                    Po6(xZD.Uo(str));
                    this.KN = xZD.J2(str, this.f59872O, this.KN, E());
                    return;
                }
                int i3 = i2 + iRV92;
                this.KN = i3;
                int iJ2 = xZD.J2(str, this.f59872O, i3, E());
                this.KN = i2;
                Po6((iJ2 - i2) - iRV92);
                this.KN = iJ2;
            } catch (xZD.Ml e2) {
                this.KN = i2;
                P5(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void xg(int i2) throws OutOfSpaceException {
            if (i2 >= 0) {
                Po6(i2);
            } else {
                hRu(i2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void HV(int i2, int i3) throws OutOfSpaceException {
            Po6(M5.t(i2, i3));
        }

        public final void How(rv6 rv6Var) throws OutOfSpaceException {
            Po6(rv6Var.getSerializedSize());
            rv6Var.n(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void hRu(long j2) throws OutOfSpaceException {
            if (CodedOutputStream.nr && E() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f59872O;
                    int i2 = this.KN;
                    this.KN = i2 + 1;
                    o7q.s7N(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f59872O;
                int i3 = this.KN;
                this.KN = i3 + 1;
                o7q.s7N(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f59872O;
                    int i5 = this.KN;
                    this.KN = i5 + 1;
                    bArr3[i5] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.KN), Integer.valueOf(this.Uo), 1), e2);
                }
            }
            byte[] bArr4 = this.f59872O;
            int i7 = this.KN;
            this.KN = i7 + 1;
            bArr4[i7] = (byte) j2;
        }

        public final void i(fuX fux) throws OutOfSpaceException {
            Po6(fux.size());
            fux.g(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.CN3
        public final void n(byte[] bArr, int i2, int i3) throws OutOfSpaceException {
            UhV(bArr, i2, i3);
        }
    }

    public static int E2(long j2) {
        return 8;
    }

    public static int HI(long j2) {
        return 8;
    }

    public static int Ik(float f3) {
        return 4;
    }

    public static int O(boolean z2) {
        return 1;
    }

    public static long U(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int Xw(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int az(int i2) {
        return 4;
    }

    public static int g(int i2, fuX fux) {
        return (wTp(1) * 2) + v(2, i2) + J2(3, fux);
    }

    public static int iF(int i2) {
        return 4;
    }

    public static int jB(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static CodedOutputStream p5(byte[] bArr) {
        return eF(bArr, 0, bArr.length);
    }

    public static int rV9(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int wTp(int i2) {
        return rV9(M5.t(i2, 0));
    }

    public static int xMQ(double d2) {
        return 8;
    }

    public final void B(boolean z2) {
        M(z2 ? (byte) 1 : (byte) 0);
    }

    abstract void C(int i2, rv6 rv6Var, mz mzVar);

    public abstract int E();

    public abstract void EWS(int i2, long j2);

    public abstract void FX(int i2, boolean z2);

    public abstract void G7(int i2, fuX fux);

    public abstract void GD(int i2, int i3);

    public abstract void HV(int i2, int i3);

    public abstract void J(int i2, fuX fux);

    public abstract void M(byte b2);

    public abstract void Mx(int i2, rv6 rv6Var);

    public abstract void Nxk(int i2, int i3);

    public abstract void Org(int i2, String str);

    public abstract void Po6(int i2);

    public abstract void Y(int i2);

    public abstract void dR0(long j2);

    public abstract void eTf(int i2, int i3);

    public abstract void hRu(long j2);

    final void ijL(int i2, rv6 rv6Var, mz mzVar) {
        HV(i2, 3);
        m(rv6Var, mzVar);
        HV(i2, 4);
    }

    public abstract void k(int i2, long j2);

    @Override // com.google.crypto.tink.shaded.protobuf.CN3
    public abstract void n(byte[] bArr, int i2, int i3);

    public abstract void xg(int i2);

    private CodedOutputStream() {
    }

    public static int XQ(int i2) {
        if (i2 >= 0) {
            return rV9(i2);
        }
        return 10;
    }

    public static CodedOutputStream eF(byte[] bArr, int i2, int i3) {
        return new n(bArr, i2, i3);
    }

    static int nY(rv6 rv6Var, mz mzVar) {
        return aYN(((com.google.crypto.tink.shaded.protobuf.j) rv6Var).rl(mzVar));
    }

    static int o(rv6 rv6Var, mz mzVar) {
        return ((com.google.crypto.tink.shaded.protobuf.j) rv6Var).rl(mzVar);
    }

    boolean M7() {
        return this.rl;
    }

    final void P5(String str, xZD.Ml ml) throws OutOfSpaceException {
        f59870t.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ml);
        byte[] bytes = str.getBytes(SPz.rl);
        try {
            Po6(bytes.length);
            n(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    final void m(rv6 rv6Var, mz mzVar) {
        mzVar.t(rv6Var, this.f59871n);
    }

    public static int J2(int i2, fuX fux) {
        return wTp(i2) + Uo(fux);
    }

    public static int KN(int i2, double d2) {
        return wTp(i2) + xMQ(d2);
    }

    public static int N(long j2) {
        return Xw(U(j2));
    }

    public static int S(int i2, long j2) {
        return wTp(i2) + WPU(j2);
    }

    public static int T(int i2, long j2) {
        return wTp(i2) + N(j2);
    }

    public static int Uo(fuX fux) {
        return aYN(fux.size());
    }

    static int ViF(int i2, rv6 rv6Var, mz mzVar) {
        return wTp(i2) + nY(rv6Var, mzVar);
    }

    public static int WPU(long j2) {
        return Xw(j2);
    }

    public static int X(int i2) {
        return rV9(jB(i2));
    }

    public static int Z(int i2, int i3) {
        return wTp(i2) + XQ(i3);
    }

    static int aYN(int i2) {
        return rV9(i2) + i2;
    }

    public static int bzg(int i2, long j2) {
        return wTp(i2) + Xw(j2);
    }

    public static int ck(int i2, float f3) {
        return wTp(i2) + Ik(f3);
    }

    public static int e(int i2, int i3) {
        return wTp(i2) + X(i3);
    }

    public static int fD(int i2, long j2) {
        return wTp(i2) + E2(j2);
    }

    public static int gh(int i2) {
        return XQ(i2);
    }

    public static int mUb(int i2, int i3) {
        return wTp(i2) + gh(i3);
    }

    public static int nHg(int i2, String str) {
        return wTp(i2) + s7N(str);
    }

    public static int nr(int i2, boolean z2) {
        return wTp(i2) + O(z2);
    }

    public static int qie(int i2, int i3) {
        return wTp(i2) + az(i3);
    }

    static int r(int i2, rv6 rv6Var, mz mzVar) {
        return (wTp(i2) * 2) + o(rv6Var, mzVar);
    }

    public static int s7N(String str) {
        int length;
        try {
            length = xZD.Uo(str);
        } catch (xZD.Ml unused) {
            length = str.getBytes(SPz.rl).length;
        }
        return aYN(length);
    }

    public static int te(int i2, int i3) {
        return wTp(i2) + iF(i3);
    }

    public static int ty(int i2, long j2) {
        return wTp(i2) + HI(j2);
    }

    public static int v(int i2, int i3) {
        return wTp(i2) + rV9(i3);
    }

    public final void D(int i2, double d2) {
        k(i2, Double.doubleToRawLongBits(d2));
    }

    public final void GR(int i2) {
        xg(i2);
    }

    public final void I(int i2, int i3) {
        eTf(i2, i3);
    }

    public final void Jk(int i2, int i3) {
        GD(i2, jB(i3));
    }

    public final void Rl(int i2) {
        Po6(jB(i2));
    }

    public final void a(double d2) {
        dR0(Double.doubleToRawLongBits(d2));
    }

    public final void eWT(int i2) {
        Y(i2);
    }

    public final void fcU(int i2, int i3) {
        Nxk(i2, i3);
    }

    public final void mYa(long j2) {
        hRu(U(j2));
    }

    public final void n1(long j2) {
        dR0(j2);
    }

    public final void ofS(long j2) {
        hRu(j2);
    }

    public final void pJg(int i2, long j2) {
        EWS(i2, j2);
    }

    public final void piY(float f3) {
        Y(Float.floatToRawIntBits(f3));
    }

    public final void qm(int i2, long j2) {
        EWS(i2, U(j2));
    }

    public final void t() {
        if (E() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void ul(int i2, long j2) {
        k(i2, j2);
    }

    public final void z(int i2, float f3) {
        Nxk(i2, Float.floatToRawIntBits(f3));
    }
}
