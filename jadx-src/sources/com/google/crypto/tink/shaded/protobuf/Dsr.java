package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Dsr {
    private static volatile int J2 = 100;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f59873O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f59874n;
    aC nr;
    int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f59875t;

    private static final class n extends Dsr {
        private int HI;
        private final boolean KN;
        private final byte[] Uo;
        private int az;
        private int gh;
        private int mUb;
        private int qie;
        private boolean ty;
        private int xMQ;

        private void U() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (e() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private void jB() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.Uo;
                int i3 = this.gh;
                this.gh = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private n(byte[] bArr, int i2, int i3, boolean z2) {
            super();
            this.HI = Integer.MAX_VALUE;
            this.Uo = bArr;
            this.xMQ = i3 + i2;
            this.gh = i2;
            this.qie = i2;
            this.KN = z2;
        }

        private void Xw() throws InvalidProtocolBufferException {
            if (this.xMQ - this.gh >= 10) {
                jB();
            } else {
                U();
            }
        }

        private void v() {
            int i2 = this.xMQ + this.mUb;
            this.xMQ = i2;
            int i3 = i2 - this.qie;
            int i5 = this.HI;
            if (i3 <= i5) {
                this.mUb = 0;
                return;
            }
            int i7 = i3 - i5;
            this.mUb = i7;
            this.xMQ = i2 - i7;
        }

        public long N() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (this.xMQ - i2 < 8) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.Uo;
            this.gh = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public boolean O() {
            return this.gh == this.xMQ;
        }

        public int T() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (this.xMQ - i2 < 4) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.Uo;
            this.gh = i2 + 4;
            return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
        }

        public byte[] X(int i2) throws InvalidProtocolBufferException {
            if (i2 > 0) {
                int i3 = this.xMQ;
                int i5 = this.gh;
                if (i2 <= i3 - i5) {
                    int i7 = i2 + i5;
                    this.gh = i7;
                    return Arrays.copyOfRange(this.Uo, i5, i7);
                }
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.az();
            }
            if (i2 == 0) {
                return SPz.nr;
            }
            throw InvalidProtocolBufferException.Uo();
        }

        public void bzg(int i2) throws InvalidProtocolBufferException {
            if (i2 >= 0) {
                int i3 = this.xMQ;
                int i5 = this.gh;
                if (i2 <= i3 - i5) {
                    this.gh = i5 + i2;
                    return;
                }
            }
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.az();
            }
            throw InvalidProtocolBufferException.Uo();
        }

        public byte e() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (i2 == this.xMQ) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.Uo;
            this.gh = i2 + 1;
            return bArr[i2];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public void gh(int i2) {
            this.HI = i2;
            v();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public void n(int i2) throws InvalidProtocolBufferException {
            if (this.az != i2) {
                throw InvalidProtocolBufferException.rl();
            }
        }

        public int nHg() {
            int i2;
            int i3 = this.gh;
            int i5 = this.xMQ;
            if (i5 != i3) {
                byte[] bArr = this.Uo;
                int i7 = i3 + 1;
                byte b2 = bArr[i3];
                if (b2 >= 0) {
                    this.gh = i7;
                    return b2;
                }
                if (i5 - i7 >= 9) {
                    int i8 = i3 + 2;
                    int i9 = (bArr[i7] << 7) ^ b2;
                    if (i9 < 0) {
                        i2 = i9 ^ (-128);
                    } else {
                        int i10 = i3 + 3;
                        int i11 = (bArr[i8] << 14) ^ i9;
                        if (i11 >= 0) {
                            i2 = i11 ^ 16256;
                        } else {
                            int i12 = i3 + 4;
                            int i13 = i11 ^ (bArr[i10] << 21);
                            if (i13 < 0) {
                                i2 = (-2080896) ^ i13;
                            } else {
                                i10 = i3 + 5;
                                byte b4 = bArr[i12];
                                int i14 = (i13 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    i12 = i3 + 6;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 7;
                                        if (bArr[i12] < 0) {
                                            i12 = i3 + 8;
                                            if (bArr[i10] < 0) {
                                                i10 = i3 + 9;
                                                if (bArr[i12] < 0) {
                                                    int i15 = i3 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i8 = i15;
                                                        i2 = i14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i14;
                                }
                                i2 = i14;
                            }
                            i8 = i12;
                        }
                        i8 = i10;
                    }
                    this.gh = i8;
                    return i2;
                }
            }
            return (int) wTp();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int nr() {
            return this.gh - this.qie;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int qie(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int iNr = i2 + nr();
            if (iNr < 0) {
                throw InvalidProtocolBufferException.KN();
            }
            int i3 = this.HI;
            if (iNr > i3) {
                throw InvalidProtocolBufferException.az();
            }
            this.HI = iNr;
            v();
            return i3;
        }

        public long s7N() {
            long j2;
            long j3;
            long j4;
            int i2 = this.gh;
            int i3 = this.xMQ;
            if (i3 != i2) {
                byte[] bArr = this.Uo;
                int i5 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.gh = i5;
                    return b2;
                }
                if (i3 - i5 >= 9) {
                    int i7 = i2 + 2;
                    int i8 = (bArr[i5] << 7) ^ b2;
                    if (i8 < 0) {
                        j2 = i8 ^ (-128);
                    } else {
                        int i9 = i2 + 3;
                        int i10 = (bArr[i7] << 14) ^ i8;
                        if (i10 >= 0) {
                            j2 = i10 ^ 16256;
                            i7 = i9;
                        } else {
                            int i11 = i2 + 4;
                            int i12 = i10 ^ (bArr[i9] << 21);
                            if (i12 < 0) {
                                long j5 = (-2080896) ^ i12;
                                i7 = i11;
                                j2 = j5;
                            } else {
                                long j6 = i12;
                                i7 = i2 + 5;
                                long j7 = j6 ^ (((long) bArr[i11]) << 28);
                                if (j7 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i13 = i2 + 6;
                                    long j9 = j7 ^ (((long) bArr[i7]) << 35);
                                    if (j9 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i2 + 7;
                                        j7 = j9 ^ (((long) bArr[i13]) << 42);
                                        if (j7 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i13 = i2 + 8;
                                            j9 = j7 ^ (((long) bArr[i7]) << 49);
                                            if (j9 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i2 + 9;
                                                long j10 = (j9 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i14 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i7 = i14;
                                                    }
                                                }
                                                j2 = j10;
                                            }
                                        }
                                    }
                                    j2 = j9 ^ j3;
                                    i7 = i13;
                                }
                                j2 = j7 ^ j4;
                            }
                        }
                    }
                    this.gh = i7;
                    return j2;
                }
            }
            return wTp();
        }

        long wTp() throws InvalidProtocolBufferException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte bE = e();
                j2 |= ((long) (bE & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((bE & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public boolean E2(int i2) throws InvalidProtocolBufferException {
            int iRl = M5.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl != 4) {
                                if (iRl == 5) {
                                    bzg(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.O();
                            }
                            return false;
                        }
                        rV9();
                        n(M5.t(M5.n(i2), 4));
                        return true;
                    }
                    bzg(nHg());
                    return true;
                }
                bzg(8);
                return true;
            }
            Xw();
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public double HI() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int Ik() {
            return T();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int S() {
            return T();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long ViF() {
            return Dsr.t(s7N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long WPU() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long XQ() {
            return s7N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int Z() {
            return nHg();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int aYN() {
            return Dsr.rl(nHg());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public boolean az() {
            if (s7N() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int ck() {
            return nHg();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long fD() {
            return s7N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public String g() throws InvalidProtocolBufferException {
            int iNHg = nHg();
            if (iNHg > 0) {
                int i2 = this.xMQ;
                int i3 = this.gh;
                if (iNHg <= i2 - i3) {
                    String strO = xZD.O(this.Uo, i3, iNHg);
                    this.gh += iNHg;
                    return strO;
                }
            }
            if (iNHg == 0) {
                return "";
            }
            if (iNHg <= 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int iF() {
            return nHg();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public String nY() throws InvalidProtocolBufferException {
            int iNHg = nHg();
            if (iNHg > 0) {
                int i2 = this.xMQ;
                int i3 = this.gh;
                if (iNHg <= i2 - i3) {
                    String str = new String(this.Uo, i3, iNHg, SPz.rl);
                    this.gh += iNHg;
                    return str;
                }
            }
            if (iNHg == 0) {
                return "";
            }
            if (iNHg < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public float o() {
            return Float.intBitsToFloat(T());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long r() {
            return N();
        }

        public void rV9() throws InvalidProtocolBufferException {
            int iTe;
            do {
                iTe = te();
                if (iTe == 0) {
                    return;
                }
            } while (E2(iTe));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int te() throws InvalidProtocolBufferException {
            if (O()) {
                this.az = 0;
                return 0;
            }
            int iNHg = nHg();
            this.az = iNHg;
            if (M5.n(iNHg) != 0) {
                return this.az;
            }
            throw InvalidProtocolBufferException.t();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public fuX ty() {
            fuX fuxUo;
            int iNHg = nHg();
            if (iNHg > 0) {
                int i2 = this.xMQ;
                int i3 = this.gh;
                if (iNHg <= i2 - i3) {
                    if (this.KN && this.ty) {
                        fuxUo = fuX.nY(this.Uo, i3, iNHg);
                    } else {
                        fuxUo = fuX.Uo(this.Uo, i3, iNHg);
                    }
                    this.gh += iNHg;
                    return fuxUo;
                }
            }
            if (iNHg == 0) {
                return fuX.f59997t;
            }
            return fuX.ViF(X(iNHg));
        }
    }

    private static final class w6 extends Dsr {
        private final byte[] KN;
        private final InputStream Uo;
        private int az;
        private int gh;
        private int mUb;
        private int qie;
        private int ty;
        private int xMQ;

        private void B() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (N() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private void FX() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.KN;
                int i3 = this.gh;
                this.gh = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private w6(InputStream inputStream, int i2) {
            super();
            this.ty = Integer.MAX_VALUE;
            SPz.rl(inputStream, "input");
            this.Uo = inputStream;
            this.KN = new byte[i2];
            this.xMQ = 0;
            this.gh = 0;
            this.az = 0;
        }

        private void E(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int i3 = this.az;
            int i5 = this.gh;
            int i7 = i3 + i5 + i2;
            int i8 = this.ty;
            if (i7 > i8) {
                eF((i8 - i3) - i5);
                throw InvalidProtocolBufferException.az();
            }
            this.az = i3 + i5;
            int i9 = this.xMQ - i5;
            this.xMQ = 0;
            this.gh = 0;
            while (i9 < i2) {
                try {
                    long j2 = i2 - i9;
                    long jM7 = M7(this.Uo, j2);
                    if (jM7 < 0 || jM7 > j2) {
                        throw new IllegalStateException(this.Uo.getClass() + "#skip returned invalid result: " + jM7 + "\nThe InputStream implementation is buggy.");
                    }
                    if (jM7 == 0) {
                        break;
                    } else {
                        i9 += (int) jM7;
                    }
                } finally {
                    this.az += i9;
                    U();
                }
            }
            if (i9 >= i2) {
                return;
            }
            int i10 = this.xMQ;
            int i11 = i10 - this.gh;
            this.gh = i10;
            P5(1);
            while (true) {
                int i12 = i2 - i11;
                int i13 = this.xMQ;
                if (i12 <= i13) {
                    this.gh = i12;
                    return;
                } else {
                    i11 += i13;
                    this.gh = i13;
                    P5(1);
                }
            }
        }

        private boolean J(int i2) throws InvalidProtocolBufferException {
            int i3 = this.gh;
            int i5 = i3 + i2;
            int i7 = this.xMQ;
            if (i5 <= i7) {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
            int i8 = this.f59875t;
            int i9 = this.az;
            if (i2 > (i8 - i9) - i3 || i9 + i3 + i2 > this.ty) {
                return false;
            }
            if (i3 > 0) {
                if (i7 > i3) {
                    byte[] bArr = this.KN;
                    System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
                }
                this.az += i3;
                this.xMQ -= i3;
                this.gh = 0;
            }
            InputStream inputStream = this.Uo;
            byte[] bArr2 = this.KN;
            int i10 = this.xMQ;
            int iX = X(inputStream, bArr2, i10, Math.min(bArr2.length - i10, (this.f59875t - this.az) - i10));
            if (iX == 0 || iX < -1 || iX > this.KN.length) {
                throw new IllegalStateException(this.Uo.getClass() + "#read(byte[]) returned invalid result: " + iX + "\nThe InputStream implementation is buggy.");
            }
            if (iX <= 0) {
                return false;
            }
            this.xMQ += iX;
            U();
            if (this.xMQ >= i2) {
                return true;
            }
            return J(i2);
        }

        private void M() throws InvalidProtocolBufferException {
            if (this.xMQ - this.gh >= 10) {
                FX();
            } else {
                B();
            }
        }

        private void U() {
            int i2 = this.xMQ + this.mUb;
            this.xMQ = i2;
            int i3 = this.az + i2;
            int i5 = this.ty;
            if (i3 <= i5) {
                this.mUb = 0;
                return;
            }
            int i7 = i3 - i5;
            this.mUb = i7;
            this.xMQ = i2 - i7;
        }

        private byte[] s7N(int i2) throws InvalidProtocolBufferException {
            if (i2 == 0) {
                return SPz.nr;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int i3 = this.az;
            int i5 = this.gh;
            int i7 = i3 + i5 + i2;
            if (i7 - this.f59875t > 0) {
                throw InvalidProtocolBufferException.qie();
            }
            int i8 = this.ty;
            if (i7 > i8) {
                eF((i8 - i3) - i5);
                throw InvalidProtocolBufferException.az();
            }
            int i9 = this.xMQ - i5;
            int i10 = i2 - i9;
            if (i10 >= 4096 && i10 > e(this.Uo)) {
                return null;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.KN, this.gh, bArr, 0, i9);
            this.az += this.xMQ;
            this.gh = 0;
            this.xMQ = 0;
            while (i9 < i2) {
                int iX = X(this.Uo, bArr, i9, i2 - i9);
                if (iX == -1) {
                    throw InvalidProtocolBufferException.az();
                }
                this.az += iX;
                i9 += iX;
            }
            return bArr;
        }

        private List wTp(int i2) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int iMin = Math.min(i2, 4096);
                byte[] bArr = new byte[iMin];
                int i3 = 0;
                while (i3 < iMin) {
                    int i5 = this.Uo.read(bArr, i3, iMin - i3);
                    if (i5 == -1) {
                        throw InvalidProtocolBufferException.az();
                    }
                    this.az += i5;
                    i3 += i5;
                }
                i2 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public byte N() throws InvalidProtocolBufferException {
            if (this.gh == this.xMQ) {
                P5(1);
            }
            byte[] bArr = this.KN;
            int i2 = this.gh;
            this.gh = i2 + 1;
            return bArr[i2];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public boolean O() {
            return this.gh == this.xMQ && !J(1);
        }

        public long Xw() {
            long j2;
            long j3;
            long j4;
            int i2 = this.gh;
            int i3 = this.xMQ;
            if (i3 != i2) {
                byte[] bArr = this.KN;
                int i5 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.gh = i5;
                    return b2;
                }
                if (i3 - i5 >= 9) {
                    int i7 = i2 + 2;
                    int i8 = (bArr[i5] << 7) ^ b2;
                    if (i8 < 0) {
                        j2 = i8 ^ (-128);
                    } else {
                        int i9 = i2 + 3;
                        int i10 = (bArr[i7] << 14) ^ i8;
                        if (i10 >= 0) {
                            j2 = i10 ^ 16256;
                            i7 = i9;
                        } else {
                            int i11 = i2 + 4;
                            int i12 = i10 ^ (bArr[i9] << 21);
                            if (i12 < 0) {
                                long j5 = (-2080896) ^ i12;
                                i7 = i11;
                                j2 = j5;
                            } else {
                                long j6 = i12;
                                i7 = i2 + 5;
                                long j7 = j6 ^ (((long) bArr[i11]) << 28);
                                if (j7 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i13 = i2 + 6;
                                    long j9 = j7 ^ (((long) bArr[i7]) << 35);
                                    if (j9 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i2 + 7;
                                        j7 = j9 ^ (((long) bArr[i13]) << 42);
                                        if (j7 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i13 = i2 + 8;
                                            j9 = j7 ^ (((long) bArr[i7]) << 49);
                                            if (j9 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i2 + 9;
                                                long j10 = (j9 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i14 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i7 = i14;
                                                    }
                                                }
                                                j2 = j10;
                                            }
                                        }
                                    }
                                    j2 = j9 ^ j3;
                                    i7 = i13;
                                }
                                j2 = j7 ^ j4;
                            }
                        }
                    }
                    this.gh = i7;
                    return j2;
                }
            }
            return jB();
        }

        public int bzg() {
            int i2;
            int i3 = this.gh;
            int i5 = this.xMQ;
            if (i5 != i3) {
                byte[] bArr = this.KN;
                int i7 = i3 + 1;
                byte b2 = bArr[i3];
                if (b2 >= 0) {
                    this.gh = i7;
                    return b2;
                }
                if (i5 - i7 >= 9) {
                    int i8 = i3 + 2;
                    int i9 = (bArr[i7] << 7) ^ b2;
                    if (i9 < 0) {
                        i2 = i9 ^ (-128);
                    } else {
                        int i10 = i3 + 3;
                        int i11 = (bArr[i8] << 14) ^ i9;
                        if (i11 >= 0) {
                            i2 = i11 ^ 16256;
                        } else {
                            int i12 = i3 + 4;
                            int i13 = i11 ^ (bArr[i10] << 21);
                            if (i13 < 0) {
                                i2 = (-2080896) ^ i13;
                            } else {
                                i10 = i3 + 5;
                                byte b4 = bArr[i12];
                                int i14 = (i13 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    i12 = i3 + 6;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 7;
                                        if (bArr[i12] < 0) {
                                            i12 = i3 + 8;
                                            if (bArr[i10] < 0) {
                                                i10 = i3 + 9;
                                                if (bArr[i12] < 0) {
                                                    int i15 = i3 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i8 = i15;
                                                        i2 = i14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i14;
                                }
                                i2 = i14;
                            }
                            i8 = i12;
                        }
                        i8 = i10;
                    }
                    this.gh = i8;
                    return i2;
                }
            }
            return (int) jB();
        }

        public void eF(int i2) throws InvalidProtocolBufferException {
            int i3 = this.xMQ;
            int i5 = this.gh;
            if (i2 > i3 - i5 || i2 < 0) {
                E(i2);
            } else {
                this.gh = i5 + i2;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public void gh(int i2) {
            this.ty = i2;
            U();
        }

        long jB() throws InvalidProtocolBufferException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte bN = N();
                j2 |= ((long) (bN & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((bN & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public void n(int i2) throws InvalidProtocolBufferException {
            if (this.qie != i2) {
                throw InvalidProtocolBufferException.rl();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int nr() {
            return this.az + this.gh;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int qie(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int i3 = i2 + this.az + this.gh;
            int i5 = this.ty;
            if (i3 > i5) {
                throw InvalidProtocolBufferException.az();
            }
            this.ty = i3;
            U();
            return i5;
        }

        public long rV9() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (this.xMQ - i2 < 8) {
                P5(8);
                i2 = this.gh;
            }
            byte[] bArr = this.KN;
            this.gh = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        public int v() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (this.xMQ - i2 < 4) {
                P5(4);
                i2 = this.gh;
            }
            byte[] bArr = this.KN;
            this.gh = i2 + 4;
            return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
        }

        private static long M7(InputStream inputStream, long j2) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j2);
            } catch (InvalidProtocolBufferException e2) {
                e2.mUb();
                throw e2;
            }
        }

        private void P5(int i2) throws InvalidProtocolBufferException {
            if (!J(i2)) {
                if (i2 > (this.f59875t - this.az) - this.gh) {
                    throw InvalidProtocolBufferException.qie();
                }
                throw InvalidProtocolBufferException.az();
            }
        }

        private fuX T(int i2) throws IOException {
            byte[] bArrS7N = s7N(i2);
            if (bArrS7N != null) {
                return fuX.J2(bArrS7N);
            }
            int i3 = this.gh;
            int i5 = this.xMQ;
            int length = i5 - i3;
            this.az += i5;
            this.gh = 0;
            this.xMQ = 0;
            List<byte[]> listWTp = wTp(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.KN, i3, bArr, 0, length);
            for (byte[] bArr2 : listWTp) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return fuX.ViF(bArr);
        }

        private static int X(InputStream inputStream, byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i2, i3);
            } catch (InvalidProtocolBufferException e2) {
                e2.mUb();
                throw e2;
            }
        }

        private static int e(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e2) {
                e2.mUb();
                throw e2;
            }
        }

        private byte[] nHg(int i2, boolean z2) throws IOException {
            byte[] bArrS7N = s7N(i2);
            if (bArrS7N != null) {
                if (z2) {
                    return (byte[]) bArrS7N.clone();
                }
                return bArrS7N;
            }
            int i3 = this.gh;
            int i5 = this.xMQ;
            int length = i5 - i3;
            this.az += i5;
            this.gh = 0;
            this.xMQ = 0;
            List<byte[]> listWTp = wTp(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.KN, i3, bArr, 0, length);
            for (byte[] bArr2 : listWTp) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public boolean E2(int i2) throws InvalidProtocolBufferException {
            int iRl = M5.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl != 4) {
                                if (iRl == 5) {
                                    eF(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.O();
                            }
                            return false;
                        }
                        p5();
                        n(M5.t(M5.n(i2), 4));
                        return true;
                    }
                    eF(bzg());
                    return true;
                }
                eF(8);
                return true;
            }
            M();
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public double HI() {
            return Double.longBitsToDouble(rV9());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int Ik() {
            return v();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int S() {
            return v();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long ViF() {
            return Dsr.t(Xw());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long WPU() {
            return rV9();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long XQ() {
            return Xw();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int Z() {
            return bzg();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int aYN() {
            return Dsr.rl(bzg());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public boolean az() {
            if (Xw() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int ck() {
            return bzg();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long fD() {
            return Xw();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public String g() throws IOException {
            byte[] bArrNHg;
            int iBzg = bzg();
            int i2 = this.gh;
            int i3 = this.xMQ;
            if (iBzg <= i3 - i2 && iBzg > 0) {
                bArrNHg = this.KN;
                this.gh = i2 + iBzg;
            } else {
                if (iBzg == 0) {
                    return "";
                }
                i2 = 0;
                if (iBzg <= i3) {
                    P5(iBzg);
                    bArrNHg = this.KN;
                    this.gh = iBzg;
                } else {
                    bArrNHg = nHg(iBzg, false);
                }
            }
            return xZD.O(bArrNHg, i2, iBzg);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int iF() {
            return bzg();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public String nY() throws InvalidProtocolBufferException {
            int iBzg = bzg();
            if (iBzg > 0) {
                int i2 = this.xMQ;
                int i3 = this.gh;
                if (iBzg <= i2 - i3) {
                    String str = new String(this.KN, i3, iBzg, SPz.rl);
                    this.gh += iBzg;
                    return str;
                }
            }
            if (iBzg == 0) {
                return "";
            }
            if (iBzg <= this.xMQ) {
                P5(iBzg);
                String str2 = new String(this.KN, this.gh, iBzg, SPz.rl);
                this.gh += iBzg;
                return str2;
            }
            return new String(nHg(iBzg, false), SPz.rl);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public float o() {
            return Float.intBitsToFloat(v());
        }

        public void p5() throws InvalidProtocolBufferException {
            int iTe;
            do {
                iTe = te();
                if (iTe == 0) {
                    return;
                }
            } while (E2(iTe));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public long r() {
            return rV9();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public int te() throws InvalidProtocolBufferException {
            if (O()) {
                this.qie = 0;
                return 0;
            }
            int iBzg = bzg();
            this.qie = iBzg;
            if (M5.n(iBzg) != 0) {
                return this.qie;
            }
            throw InvalidProtocolBufferException.t();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Dsr
        public fuX ty() {
            int iBzg = bzg();
            int i2 = this.xMQ;
            int i3 = this.gh;
            if (iBzg <= i2 - i3 && iBzg > 0) {
                fuX fuxUo = fuX.Uo(this.KN, i3, iBzg);
                this.gh += iBzg;
                return fuxUo;
            }
            if (iBzg == 0) {
                return fuX.f59997t;
            }
            return T(iBzg);
        }
    }

    public static Dsr KN(byte[] bArr) {
        return xMQ(bArr, 0, bArr.length);
    }

    public static int rl(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long t(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static Dsr xMQ(byte[] bArr, int i2, int i3) {
        return mUb(bArr, i2, i3, false);
    }

    public abstract boolean E2(int i2);

    public abstract double HI();

    public abstract int Ik();

    public abstract boolean O();

    public abstract int S();

    public abstract long ViF();

    public abstract long WPU();

    public abstract long XQ();

    public abstract int Z();

    public abstract int aYN();

    public abstract boolean az();

    public abstract int ck();

    public abstract long fD();

    public abstract String g();

    public abstract void gh(int i2);

    public abstract int iF();

    public abstract void n(int i2);

    public abstract String nY();

    public abstract int nr();

    public abstract float o();

    public abstract int qie(int i2);

    public abstract long r();

    public abstract int te();

    public abstract fuX ty();

    private Dsr() {
        this.rl = J2;
        this.f59875t = Integer.MAX_VALUE;
        this.f59873O = false;
    }

    public static Dsr J2(InputStream inputStream) {
        return Uo(inputStream, 4096);
    }

    public static Dsr Uo(InputStream inputStream, int i2) {
        if (i2 > 0) {
            return inputStream == null ? KN(SPz.nr) : new w6(inputStream, i2);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static Dsr mUb(byte[] bArr, int i2, int i3, boolean z2) {
        n nVar = new n(bArr, i2, i3, z2);
        try {
            nVar.qie(i3);
            return nVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
