package androidx.content.preferences.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class CodedInputStream {
    private static volatile int J2 = 100;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f37757O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f37758n;
    CodedInputStreamReader nr;
    int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37759t;

    private static final class ArrayDecoder extends CodedInputStream {
        private int HI;
        private final boolean KN;
        private final byte[] Uo;
        private int az;
        private int gh;
        private int mUb;
        private int qie;
        private boolean ty;
        private int xMQ;

        private void M7() throws InvalidProtocolBufferException {
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

        private void p5() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (nHg() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private ArrayDecoder(byte[] bArr, int i2, int i3, boolean z2) {
            super();
            this.HI = Integer.MAX_VALUE;
            this.Uo = bArr;
            this.xMQ = i3 + i2;
            this.gh = i2;
            this.qie = i2;
            this.KN = z2;
        }

        private void P5() throws InvalidProtocolBufferException {
            if (this.xMQ - this.gh >= 10) {
                M7();
            } else {
                p5();
            }
        }

        private void jB() {
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

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int HI(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int iO = i2 + O();
            if (iO < 0) {
                throw InvalidProtocolBufferException.KN();
            }
            int i3 = this.HI;
            if (iO > i3) {
                throw InvalidProtocolBufferException.az();
            }
            this.HI = iO;
            jB();
            return i3;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean J2() {
            return this.gh == this.xMQ;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int O() {
            return this.gh - this.qie;
        }

        public void U(int i2) throws InvalidProtocolBufferException {
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

        long Xw() throws InvalidProtocolBufferException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte bNHg = nHg();
                j2 |= ((long) (bNHg & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((bNHg & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        public long bzg() {
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
            return Xw();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public void n(int i2) throws InvalidProtocolBufferException {
            if (this.az != i2) {
                throw InvalidProtocolBufferException.rl();
            }
        }

        public byte nHg() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (i2 == this.xMQ) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.Uo;
            this.gh = i2 + 1;
            return bArr[i2];
        }

        public int rV9() {
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
            return (int) Xw();
        }

        public byte[] s7N(int i2) throws InvalidProtocolBufferException {
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
                return Internal.nr;
            }
            throw InvalidProtocolBufferException.Uo();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public void ty(int i2) {
            this.HI = i2;
            jB();
        }

        public long v() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (this.xMQ - i2 < 8) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.Uo;
            this.gh = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        public int wTp() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (this.xMQ - i2 < 4) {
                throw InvalidProtocolBufferException.az();
            }
            byte[] bArr = this.Uo;
            this.gh = i2 + 4;
            return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int E2() throws InvalidProtocolBufferException {
            if (J2()) {
                this.az = 0;
                return 0;
            }
            int iRV9 = rV9();
            this.az = iRV9;
            if (WireFormat.n(iRV9) != 0) {
                return this.az;
            }
            throw InvalidProtocolBufferException.t();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public ByteString Ik() {
            ByteString byteStringAz;
            int iRV9 = rV9();
            if (iRV9 > 0) {
                int i2 = this.xMQ;
                int i3 = this.gh;
                if (iRV9 <= i2 - i3) {
                    if (this.KN && this.ty) {
                        byteStringAz = ByteString.wTp(this.Uo, i3, iRV9);
                    } else {
                        byteStringAz = ByteString.az(this.Uo, i3, iRV9);
                    }
                    this.gh += iRV9;
                    return byteStringAz;
                }
            }
            if (iRV9 == 0) {
                return ByteString.f37740t;
            }
            return ByteString.s7N(s7N(iRV9));
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public float S() {
            return Float.intBitsToFloat(wTp());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean T(int i2) throws InvalidProtocolBufferException {
            int iRl = WireFormat.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl != 4) {
                                if (iRl == 5) {
                                    U(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.O();
                            }
                            return false;
                        }
                        N();
                        n(WireFormat.t(WireFormat.n(i2), 4));
                        return true;
                    }
                    U(rV9());
                    return true;
                }
                U(8);
                return true;
            }
            P5();
            return true;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int ViF() {
            return wTp();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int WPU() {
            return rV9();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long X() {
            return bzg();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long XQ() {
            return v();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int Z() {
            return wTp();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long aYN() {
            return bzg();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean ck() {
            if (bzg() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int e() {
            return rV9();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public String fD() throws InvalidProtocolBufferException {
            int iRV9 = rV9();
            if (iRV9 > 0) {
                int i2 = this.xMQ;
                int i3 = this.gh;
                if (iRV9 <= i2 - i3) {
                    String strKN = Utf8.KN(this.Uo, i3, iRV9);
                    this.gh += iRV9;
                    return strKN;
                }
            }
            if (iRV9 == 0) {
                return "";
            }
            if (iRV9 <= 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int g() {
            return CodedInputStream.t(rV9());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public String iF() throws InvalidProtocolBufferException {
            int iRV9 = rV9();
            if (iRV9 > 0) {
                int i2 = this.xMQ;
                int i3 = this.gh;
                if (iRV9 <= i2 - i3) {
                    String str = new String(this.Uo, i3, iRV9, Internal.rl);
                    this.gh += iRV9;
                    return str;
                }
            }
            if (iRV9 == 0) {
                return "";
            }
            if (iRV9 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long nY() {
            return v();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int o() {
            return rV9();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public double r() {
            return Double.longBitsToDouble(v());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long te() {
            return CodedInputStream.nr(bzg());
        }
    }

    private static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int HI;
        private int Ik;
        private final Iterator KN;
        private final Iterable Uo;
        private long XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private long f37760Z;
        private int az;
        private int ck;
        private boolean gh;
        private final boolean mUb;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f37761o;
        private int qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f37762r;
        private int ty;
        private ByteBuffer xMQ;

        private void eF() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (wTp() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private IterableDirectByteBufferDecoder(Iterable iterable, int i2, boolean z2) {
            super();
            this.ty = Integer.MAX_VALUE;
            this.qie = i2;
            this.Uo = iterable;
            this.KN = iterable.iterator();
            this.mUb = z2;
            this.ck = 0;
            this.Ik = 0;
            if (i2 != 0) {
                M();
                return;
            }
            this.xMQ = Internal.f38019O;
            this.f37762r = 0L;
            this.f37761o = 0L;
            this.XQ = 0L;
            this.f37760Z = 0L;
        }

        private ByteBuffer E(int i2, int i3) {
            int iPosition = this.xMQ.position();
            int iLimit = this.xMQ.limit();
            ByteBuffer byteBuffer = this.xMQ;
            try {
                try {
                    byteBuffer.position(i2);
                    byteBuffer.limit(i3);
                    return this.xMQ.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.az();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private void M() {
            ByteBuffer byteBuffer = (ByteBuffer) this.KN.next();
            this.xMQ = byteBuffer;
            this.ck += (int) (this.f37762r - this.f37761o);
            long jPosition = byteBuffer.position();
            this.f37762r = jPosition;
            this.f37761o = jPosition;
            this.XQ = this.xMQ.limit();
            long jGh = UnsafeUtil.gh(this.xMQ);
            this.f37760Z = jGh;
            this.f37762r += jGh;
            this.f37761o += jGh;
            this.XQ += jGh;
        }

        private int M7() {
            return (int) ((((long) (this.qie - this.ck)) - this.f37762r) + this.f37761o);
        }

        private void P5() {
            int i2 = this.qie + this.az;
            this.qie = i2;
            int i3 = i2 - this.Ik;
            int i5 = this.ty;
            if (i3 <= i5) {
                this.az = 0;
                return;
            }
            int i7 = i3 - i5;
            this.az = i7;
            this.qie = i2 - i7;
        }

        private long nHg() {
            return this.XQ - this.f37762r;
        }

        private void s7N() throws InvalidProtocolBufferException {
            if (!this.KN.hasNext()) {
                throw InvalidProtocolBufferException.az();
            }
            M();
        }

        private void v(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if (i3 < 0 || i3 > M7()) {
                if (i3 > 0) {
                    throw InvalidProtocolBufferException.az();
                }
                if (i3 != 0) {
                    throw InvalidProtocolBufferException.Uo();
                }
                return;
            }
            int i5 = i3;
            while (i5 > 0) {
                if (nHg() == 0) {
                    s7N();
                }
                int iMin = Math.min(i5, (int) nHg());
                long j2 = iMin;
                UnsafeUtil.ck(this.f37762r, bArr, (i3 - i5) + i2, j2);
                i5 -= iMin;
                this.f37762r += j2;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int HI(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int iO = i2 + O();
            int i3 = this.ty;
            if (iO > i3) {
                throw InvalidProtocolBufferException.az();
            }
            this.ty = iO;
            P5();
            return i3;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean J2() {
            return (((long) this.ck) + this.f37762r) - this.f37761o == ((long) this.qie);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int O() {
            return (int) ((((long) (this.ck - this.Ik)) + this.f37762r) - this.f37761o);
        }

        long U() throws InvalidProtocolBufferException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte bWTp = wTp();
                j2 |= ((long) (bWTp & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((bWTp & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        public int Xw() {
            int i2;
            long j2 = this.f37762r;
            if (this.XQ != j2) {
                long j3 = j2 + 1;
                byte bAYN = UnsafeUtil.aYN(j2);
                if (bAYN >= 0) {
                    this.f37762r++;
                    return bAYN;
                }
                if (this.XQ - this.f37762r >= 10) {
                    long j4 = 2 + j2;
                    int iAYN = (UnsafeUtil.aYN(j3) << 7) ^ bAYN;
                    if (iAYN < 0) {
                        i2 = iAYN ^ (-128);
                    } else {
                        long j5 = 3 + j2;
                        int iAYN2 = (UnsafeUtil.aYN(j4) << 14) ^ iAYN;
                        if (iAYN2 >= 0) {
                            i2 = iAYN2 ^ 16256;
                        } else {
                            long j6 = 4 + j2;
                            int iAYN3 = iAYN2 ^ (UnsafeUtil.aYN(j5) << 21);
                            if (iAYN3 < 0) {
                                i2 = (-2080896) ^ iAYN3;
                            } else {
                                j5 = 5 + j2;
                                byte bAYN2 = UnsafeUtil.aYN(j6);
                                int i3 = (iAYN3 ^ (bAYN2 << 28)) ^ 266354560;
                                if (bAYN2 < 0) {
                                    j6 = 6 + j2;
                                    if (UnsafeUtil.aYN(j5) < 0) {
                                        j5 = 7 + j2;
                                        if (UnsafeUtil.aYN(j6) < 0) {
                                            j6 = 8 + j2;
                                            if (UnsafeUtil.aYN(j5) < 0) {
                                                j5 = 9 + j2;
                                                if (UnsafeUtil.aYN(j6) < 0) {
                                                    long j7 = j2 + 10;
                                                    if (UnsafeUtil.aYN(j5) >= 0) {
                                                        i2 = i3;
                                                        j4 = j7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i3;
                                }
                                i2 = i3;
                            }
                            j4 = j6;
                        }
                        j4 = j5;
                    }
                    this.f37762r = j4;
                    return i2;
                }
            }
            return (int) U();
        }

        public long bzg() throws InvalidProtocolBufferException {
            char c2;
            long jWTp;
            byte bWTp;
            if (nHg() >= 8) {
                long j2 = this.f37762r;
                this.f37762r = 8 + j2;
                c2 = '8';
                jWTp = (((long) UnsafeUtil.aYN(j2)) & 255) | ((((long) UnsafeUtil.aYN(1 + j2)) & 255) << 8) | ((((long) UnsafeUtil.aYN(2 + j2)) & 255) << 16) | ((((long) UnsafeUtil.aYN(3 + j2)) & 255) << 24) | ((((long) UnsafeUtil.aYN(4 + j2)) & 255) << 32) | ((((long) UnsafeUtil.aYN(5 + j2)) & 255) << 40) | ((((long) UnsafeUtil.aYN(6 + j2)) & 255) << 48);
                bWTp = UnsafeUtil.aYN(j2 + 7);
            } else {
                c2 = '8';
                jWTp = (((long) wTp()) & 255) | ((((long) wTp()) & 255) << 8) | ((((long) wTp()) & 255) << 16) | ((((long) wTp()) & 255) << 24) | ((((long) wTp()) & 255) << 32) | ((((long) wTp()) & 255) << 40) | ((((long) wTp()) & 255) << 48);
                bWTp = wTp();
            }
            return jWTp | ((((long) bWTp) & 255) << c2);
        }

        public long jB() {
            long j2;
            long j3;
            long j4;
            long j5 = this.f37762r;
            if (this.XQ != j5) {
                long j6 = j5 + 1;
                byte bAYN = UnsafeUtil.aYN(j5);
                if (bAYN >= 0) {
                    this.f37762r++;
                    return bAYN;
                }
                if (this.XQ - this.f37762r >= 10) {
                    long j7 = 2 + j5;
                    int iAYN = (UnsafeUtil.aYN(j6) << 7) ^ bAYN;
                    if (iAYN < 0) {
                        j2 = iAYN ^ (-128);
                    } else {
                        long j9 = 3 + j5;
                        int iAYN2 = (UnsafeUtil.aYN(j7) << 14) ^ iAYN;
                        if (iAYN2 >= 0) {
                            j2 = iAYN2 ^ 16256;
                            j7 = j9;
                        } else {
                            long j10 = 4 + j5;
                            int iAYN3 = iAYN2 ^ (UnsafeUtil.aYN(j9) << 21);
                            if (iAYN3 < 0) {
                                j2 = (-2080896) ^ iAYN3;
                                j7 = j10;
                            } else {
                                long j11 = 5 + j5;
                                long jAYN = (((long) UnsafeUtil.aYN(j10)) << 28) ^ ((long) iAYN3);
                                if (jAYN >= 0) {
                                    j4 = 266354560;
                                } else {
                                    long j12 = 6 + j5;
                                    long jAYN2 = jAYN ^ (((long) UnsafeUtil.aYN(j11)) << 35);
                                    if (jAYN2 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j11 = 7 + j5;
                                        jAYN = jAYN2 ^ (((long) UnsafeUtil.aYN(j12)) << 42);
                                        if (jAYN >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j12 = 8 + j5;
                                            jAYN2 = jAYN ^ (((long) UnsafeUtil.aYN(j11)) << 49);
                                            if (jAYN2 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                j11 = 9 + j5;
                                                long jAYN3 = (jAYN2 ^ (((long) UnsafeUtil.aYN(j12)) << 56)) ^ 71499008037633920L;
                                                if (jAYN3 < 0) {
                                                    long j13 = j5 + 10;
                                                    if (UnsafeUtil.aYN(j11) >= 0) {
                                                        j7 = j13;
                                                        j2 = jAYN3;
                                                    }
                                                } else {
                                                    j2 = jAYN3;
                                                    j7 = j11;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ jAYN2;
                                    j7 = j12;
                                }
                                j2 = j4 ^ jAYN;
                                j7 = j11;
                            }
                        }
                    }
                    this.f37762r = j7;
                    return j2;
                }
            }
            return U();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public void n(int i2) throws InvalidProtocolBufferException {
            if (this.HI != i2) {
                throw InvalidProtocolBufferException.rl();
            }
        }

        public void p5(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0 || i2 > (((long) (this.qie - this.ck)) - this.f37762r) + this.f37761o) {
                if (i2 >= 0) {
                    throw InvalidProtocolBufferException.az();
                }
                throw InvalidProtocolBufferException.Uo();
            }
            while (i2 > 0) {
                if (nHg() == 0) {
                    s7N();
                }
                int iMin = Math.min(i2, (int) nHg());
                i2 -= iMin;
                this.f37762r += (long) iMin;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public void ty(int i2) {
            this.ty = i2;
            P5();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int E2() throws InvalidProtocolBufferException {
            if (J2()) {
                this.HI = 0;
                return 0;
            }
            int iXw = Xw();
            this.HI = iXw;
            if (WireFormat.n(iXw) != 0) {
                return this.HI;
            }
            throw InvalidProtocolBufferException.t();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public ByteString Ik() throws InvalidProtocolBufferException {
            int iXw = Xw();
            if (iXw > 0) {
                long j2 = iXw;
                long j3 = this.XQ;
                long j4 = this.f37762r;
                if (j2 <= j3 - j4) {
                    if (this.mUb && this.gh) {
                        int i2 = (int) (j4 - this.f37760Z);
                        ByteString byteStringNHg = ByteString.nHg(E(i2, iXw + i2));
                        this.f37762r += j2;
                        return byteStringNHg;
                    }
                    byte[] bArr = new byte[iXw];
                    UnsafeUtil.ck(j4, bArr, 0L, j2);
                    this.f37762r += j2;
                    return ByteString.s7N(bArr);
                }
            }
            if (iXw > 0 && iXw <= M7()) {
                if (this.mUb && this.gh) {
                    ArrayList arrayList = new ArrayList();
                    while (iXw > 0) {
                        if (nHg() == 0) {
                            s7N();
                        }
                        int iMin = Math.min(iXw, (int) nHg());
                        int i3 = (int) (this.f37762r - this.f37760Z);
                        arrayList.add(ByteString.nHg(E(i3, i3 + iMin)));
                        iXw -= iMin;
                        this.f37762r += (long) iMin;
                    }
                    return ByteString.xMQ(arrayList);
                }
                byte[] bArr2 = new byte[iXw];
                v(bArr2, 0, iXw);
                return ByteString.s7N(bArr2);
            }
            if (iXw == 0) {
                return ByteString.f37740t;
            }
            if (iXw < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public float S() {
            return Float.intBitsToFloat(rV9());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean T(int i2) throws InvalidProtocolBufferException {
            int iRl = WireFormat.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl != 4) {
                                if (iRl == 5) {
                                    p5(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.O();
                            }
                            return false;
                        }
                        N();
                        n(WireFormat.t(WireFormat.n(i2), 4));
                        return true;
                    }
                    p5(Xw());
                    return true;
                }
                p5(8);
                return true;
            }
            eF();
            return true;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int ViF() {
            return rV9();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int WPU() {
            return Xw();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long X() {
            return jB();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long XQ() {
            return bzg();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int Z() {
            return rV9();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long aYN() {
            return jB();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean ck() {
            if (jB() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int e() {
            return Xw();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public String fD() throws InvalidProtocolBufferException {
            int iXw = Xw();
            if (iXw > 0) {
                long j2 = iXw;
                long j3 = this.XQ;
                long j4 = this.f37762r;
                if (j2 <= j3 - j4) {
                    String strUo = Utf8.Uo(this.xMQ, (int) (j4 - this.f37761o), iXw);
                    this.f37762r += j2;
                    return strUo;
                }
            }
            if (iXw >= 0 && iXw <= M7()) {
                byte[] bArr = new byte[iXw];
                v(bArr, 0, iXw);
                return Utf8.KN(bArr, 0, iXw);
            }
            if (iXw == 0) {
                return "";
            }
            if (iXw <= 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int g() {
            return CodedInputStream.t(Xw());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public String iF() throws InvalidProtocolBufferException {
            int iXw = Xw();
            if (iXw > 0) {
                long j2 = iXw;
                long j3 = this.XQ;
                long j4 = this.f37762r;
                if (j2 <= j3 - j4) {
                    byte[] bArr = new byte[iXw];
                    UnsafeUtil.ck(j4, bArr, 0L, j2);
                    String str = new String(bArr, Internal.rl);
                    this.f37762r += j2;
                    return str;
                }
            }
            if (iXw > 0 && iXw <= M7()) {
                byte[] bArr2 = new byte[iXw];
                v(bArr2, 0, iXw);
                return new String(bArr2, Internal.rl);
            }
            if (iXw == 0) {
                return "";
            }
            if (iXw < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long nY() {
            return bzg();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int o() {
            return Xw();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public double r() {
            return Double.longBitsToDouble(bzg());
        }

        public int rV9() {
            if (nHg() >= 4) {
                long j2 = this.f37762r;
                this.f37762r = 4 + j2;
                return ((UnsafeUtil.aYN(j2 + 3) & UByte.MAX_VALUE) << 24) | (UnsafeUtil.aYN(j2) & UByte.MAX_VALUE) | ((UnsafeUtil.aYN(1 + j2) & UByte.MAX_VALUE) << 8) | ((UnsafeUtil.aYN(2 + j2) & UByte.MAX_VALUE) << 16);
            }
            return (wTp() & UByte.MAX_VALUE) | ((wTp() & UByte.MAX_VALUE) << 8) | ((wTp() & UByte.MAX_VALUE) << 16) | ((wTp() & UByte.MAX_VALUE) << 24);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long te() {
            return CodedInputStream.nr(jB());
        }

        public byte wTp() throws InvalidProtocolBufferException {
            if (nHg() == 0) {
                s7N();
            }
            long j2 = this.f37762r;
            this.f37762r = 1 + j2;
            return UnsafeUtil.aYN(j2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private static final class StreamDecoder extends CodedInputStream {
        private RefillCallback HI;
        private final byte[] KN;
        private final InputStream Uo;
        private int az;
        private int gh;
        private int mUb;
        private int qie;
        private int ty;
        private int xMQ;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        private interface RefillCallback {
            void onRefill();
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        private class SkippedDataSink implements RefillCallback {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f37763n;
            private ByteArrayOutputStream rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ StreamDecoder f37764t;

            @Override // androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.rl == null) {
                    this.rl = new ByteArrayOutputStream();
                }
                this.rl.write(this.f37764t.KN, this.f37763n, this.f37764t.gh - this.f37763n);
                this.f37763n = 0;
            }
        }

        private void GR() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (bzg() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private void I() throws InvalidProtocolBufferException {
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

        private StreamDecoder(InputStream inputStream, int i2) {
            super();
            this.ty = Integer.MAX_VALUE;
            this.HI = null;
            Internal.rl(inputStream, "input");
            this.Uo = inputStream;
            this.KN = new byte[i2];
            this.xMQ = 0;
            this.gh = 0;
            this.az = 0;
        }

        private void D(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int i3 = this.az;
            int i5 = this.gh;
            int i7 = i3 + i5 + i2;
            int i8 = this.ty;
            if (i7 > i8) {
                J((i8 - i3) - i5);
                throw InvalidProtocolBufferException.az();
            }
            int i9 = 0;
            if (this.HI == null) {
                this.az = i3 + i5;
                int i10 = this.xMQ - i5;
                this.xMQ = 0;
                this.gh = 0;
                i9 = i10;
                while (i9 < i2) {
                    try {
                        long j2 = i2 - i9;
                        long jB = B(this.Uo, j2);
                        if (jB < 0 || jB > j2) {
                            throw new IllegalStateException(this.Uo.getClass() + "#skip returned invalid result: " + jB + dpcnwfoVOnrtRA.wOQgIVeLA);
                        }
                        if (jB == 0) {
                            break;
                        } else {
                            i9 += (int) jB;
                        }
                    } finally {
                        this.az += i9;
                        M();
                    }
                }
            }
            if (i9 >= i2) {
                return;
            }
            int i11 = this.xMQ;
            int i12 = i11 - this.gh;
            this.gh = i11;
            FX(1);
            while (true) {
                int i13 = i2 - i12;
                int i14 = this.xMQ;
                if (i13 <= i14) {
                    this.gh = i13;
                    return;
                } else {
                    i12 += i14;
                    this.gh = i14;
                    FX(1);
                }
            }
        }

        private void M() {
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

        private boolean Nxk(int i2) throws InvalidProtocolBufferException {
            int i3 = this.gh;
            if (i3 + i2 <= this.xMQ) {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
            int i5 = this.f37759t;
            int i7 = this.az;
            if (i2 > (i5 - i7) - i3 || i7 + i3 + i2 > this.ty) {
                return false;
            }
            RefillCallback refillCallback = this.HI;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i8 = this.gh;
            if (i8 > 0) {
                int i9 = this.xMQ;
                if (i9 > i8) {
                    byte[] bArr = this.KN;
                    System.arraycopy(bArr, i8, bArr, 0, i9 - i8);
                }
                this.az += i8;
                this.xMQ -= i8;
                this.gh = 0;
            }
            InputStream inputStream = this.Uo;
            byte[] bArr2 = this.KN;
            int i10 = this.xMQ;
            int iV = v(inputStream, bArr2, i10, Math.min(bArr2.length - i10, (this.f37759t - this.az) - i10));
            if (iV == 0 || iV < -1 || iV > this.KN.length) {
                throw new IllegalStateException(this.Uo.getClass() + "#read(byte[]) returned invalid result: " + iV + "\nThe InputStream implementation is buggy.");
            }
            if (iV <= 0) {
                return false;
            }
            this.xMQ += iV;
            M();
            if (this.xMQ >= i2) {
                return true;
            }
            return Nxk(i2);
        }

        private List U(int i2) throws IOException {
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

        private void a() throws InvalidProtocolBufferException {
            if (this.xMQ - this.gh >= 10) {
                I();
            } else {
                GR();
            }
        }

        private byte[] jB(int i2) throws InvalidProtocolBufferException {
            if (i2 == 0) {
                return Internal.nr;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int i3 = this.az;
            int i5 = this.gh;
            int i7 = i3 + i5 + i2;
            if (i7 - this.f37759t > 0) {
                throw InvalidProtocolBufferException.qie();
            }
            int i8 = this.ty;
            if (i7 > i8) {
                J((i8 - i3) - i5);
                throw InvalidProtocolBufferException.az();
            }
            int i9 = this.xMQ - i5;
            int i10 = i2 - i9;
            if (i10 >= 4096 && i10 > wTp(this.Uo)) {
                return null;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.KN, this.gh, bArr, 0, i9);
            this.az += this.xMQ;
            this.gh = 0;
            this.xMQ = 0;
            while (i9 < i2) {
                int iV = v(this.Uo, bArr, i9, i2 - i9);
                if (iV == -1) {
                    throw InvalidProtocolBufferException.az();
                }
                this.az += iV;
                i9 += iV;
            }
            return bArr;
        }

        long E() throws InvalidProtocolBufferException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte bBzg = bzg();
                j2 |= ((long) (bBzg & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((bBzg & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int HI(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int i3 = i2 + this.az + this.gh;
            if (i3 < 0) {
                throw InvalidProtocolBufferException.KN();
            }
            int i5 = this.ty;
            if (i3 > i5) {
                throw InvalidProtocolBufferException.az();
            }
            this.ty = i3;
            M();
            return i5;
        }

        public void J(int i2) throws InvalidProtocolBufferException {
            int i3 = this.xMQ;
            int i5 = this.gh;
            if (i2 > i3 - i5 || i2 < 0) {
                D(i2);
            } else {
                this.gh = i5 + i2;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean J2() {
            return this.gh == this.xMQ && !Nxk(1);
        }

        public long M7() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (this.xMQ - i2 < 8) {
                FX(8);
                i2 = this.gh;
            }
            byte[] bArr = this.KN;
            this.gh = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int O() {
            return this.az + this.gh;
        }

        public int P5() throws InvalidProtocolBufferException {
            int i2 = this.gh;
            if (this.xMQ - i2 < 4) {
                FX(4);
                i2 = this.gh;
            }
            byte[] bArr = this.KN;
            this.gh = i2 + 4;
            return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
        }

        public byte bzg() throws InvalidProtocolBufferException {
            if (this.gh == this.xMQ) {
                FX(1);
            }
            byte[] bArr = this.KN;
            int i2 = this.gh;
            this.gh = i2 + 1;
            return bArr[i2];
        }

        public long eF() {
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
            return E();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public void n(int i2) throws InvalidProtocolBufferException {
            if (this.qie != i2) {
                throw InvalidProtocolBufferException.rl();
            }
        }

        public int p5() {
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
            return (int) E();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public void ty(int i2) {
            this.ty = i2;
            M();
        }

        private static long B(InputStream inputStream, long j2) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j2);
            } catch (InvalidProtocolBufferException e2) {
                e2.mUb();
                throw e2;
            }
        }

        private void FX(int i2) throws InvalidProtocolBufferException {
            if (!Nxk(i2)) {
                if (i2 > (this.f37759t - this.az) - this.gh) {
                    throw InvalidProtocolBufferException.qie();
                }
                throw InvalidProtocolBufferException.az();
            }
        }

        private byte[] Xw(int i2, boolean z2) throws IOException {
            byte[] bArrJB = jB(i2);
            if (bArrJB != null) {
                if (z2) {
                    return (byte[]) bArrJB.clone();
                }
                return bArrJB;
            }
            int i3 = this.gh;
            int i5 = this.xMQ;
            int length = i5 - i3;
            this.az += i5;
            this.gh = 0;
            this.xMQ = 0;
            List<byte[]> listU = U(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.KN, i3, bArr, 0, length);
            for (byte[] bArr2 : listU) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private ByteString rV9(int i2) throws IOException {
            byte[] bArrJB = jB(i2);
            if (bArrJB != null) {
                return ByteString.qie(bArrJB);
            }
            int i3 = this.gh;
            int i5 = this.xMQ;
            int length = i5 - i3;
            this.az += i5;
            this.gh = 0;
            this.xMQ = 0;
            List<byte[]> listU = U(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.KN, i3, bArr, 0, length);
            for (byte[] bArr2 : listU) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.s7N(bArr);
        }

        private static int v(InputStream inputStream, byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i2, i3);
            } catch (InvalidProtocolBufferException e2) {
                e2.mUb();
                throw e2;
            }
        }

        private static int wTp(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e2) {
                e2.mUb();
                throw e2;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int E2() throws InvalidProtocolBufferException {
            if (J2()) {
                this.qie = 0;
                return 0;
            }
            int iP5 = p5();
            this.qie = iP5;
            if (WireFormat.n(iP5) != 0) {
                return this.qie;
            }
            throw InvalidProtocolBufferException.t();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public ByteString Ik() throws InvalidProtocolBufferException {
            int iP5 = p5();
            int i2 = this.xMQ;
            int i3 = this.gh;
            if (iP5 <= i2 - i3 && iP5 > 0) {
                ByteString byteStringAz = ByteString.az(this.KN, i3, iP5);
                this.gh += iP5;
                return byteStringAz;
            }
            if (iP5 == 0) {
                return ByteString.f37740t;
            }
            if (iP5 >= 0) {
                return rV9(iP5);
            }
            throw InvalidProtocolBufferException.Uo();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public float S() {
            return Float.intBitsToFloat(P5());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean T(int i2) throws InvalidProtocolBufferException {
            int iRl = WireFormat.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl != 4) {
                                if (iRl == 5) {
                                    J(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.O();
                            }
                            return false;
                        }
                        N();
                        n(WireFormat.t(WireFormat.n(i2), 4));
                        return true;
                    }
                    J(p5());
                    return true;
                }
                J(8);
                return true;
            }
            a();
            return true;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int ViF() {
            return P5();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int WPU() {
            return p5();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long X() {
            return eF();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long XQ() {
            return M7();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int Z() {
            return P5();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long aYN() {
            return eF();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean ck() {
            if (eF() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int e() {
            return p5();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public String fD() throws IOException {
            byte[] bArrXw;
            int iP5 = p5();
            int i2 = this.gh;
            int i3 = this.xMQ;
            if (iP5 <= i3 - i2 && iP5 > 0) {
                bArrXw = this.KN;
                this.gh = i2 + iP5;
            } else {
                if (iP5 == 0) {
                    return "";
                }
                if (iP5 >= 0) {
                    i2 = 0;
                    if (iP5 <= i3) {
                        FX(iP5);
                        bArrXw = this.KN;
                        this.gh = iP5;
                    } else {
                        bArrXw = Xw(iP5, false);
                    }
                } else {
                    throw InvalidProtocolBufferException.Uo();
                }
            }
            return Utf8.KN(bArrXw, i2, iP5);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int g() {
            return CodedInputStream.t(p5());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public String iF() throws InvalidProtocolBufferException {
            int iP5 = p5();
            if (iP5 > 0) {
                int i2 = this.xMQ;
                int i3 = this.gh;
                if (iP5 <= i2 - i3) {
                    String str = new String(this.KN, i3, iP5, Internal.rl);
                    this.gh += iP5;
                    return str;
                }
            }
            if (iP5 == 0) {
                return "";
            }
            if (iP5 >= 0) {
                if (iP5 <= this.xMQ) {
                    FX(iP5);
                    String str2 = new String(this.KN, this.gh, iP5, Internal.rl);
                    this.gh += iP5;
                    return str2;
                }
                return new String(Xw(iP5, false), Internal.rl);
            }
            throw InvalidProtocolBufferException.Uo();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long nY() {
            return M7();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int o() {
            return p5();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public double r() {
            return Double.longBitsToDouble(M7());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long te() {
            return CodedInputStream.nr(eF());
        }
    }

    private static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private boolean HI;
        private final boolean KN;
        private final ByteBuffer Uo;
        private int az;
        private int ck;
        private long gh;
        private long mUb;
        private long qie;
        private int ty;
        private final long xMQ;

        private void E() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (wTp() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private void eF() throws InvalidProtocolBufferException {
            for (int i2 = 0; i2 < 10; i2++) {
                long j2 = this.gh;
                this.gh = 1 + j2;
                if (UnsafeUtil.aYN(j2) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z2) {
            super();
            this.ck = Integer.MAX_VALUE;
            this.Uo = byteBuffer;
            long jGh = UnsafeUtil.gh(byteBuffer);
            this.xMQ = jGh;
            this.mUb = ((long) byteBuffer.limit()) + jGh;
            long jPosition = jGh + ((long) byteBuffer.position());
            this.gh = jPosition;
            this.qie = jPosition;
            this.KN = z2;
        }

        private ByteBuffer M(long j2, long j3) {
            int iPosition = this.Uo.position();
            int iLimit = this.Uo.limit();
            ByteBuffer byteBuffer = this.Uo;
            try {
                try {
                    byteBuffer.position(nHg(j2));
                    byteBuffer.limit(nHg(j3));
                    return this.Uo.slice();
                } catch (IllegalArgumentException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionAz = InvalidProtocolBufferException.az();
                    invalidProtocolBufferExceptionAz.initCause(e2);
                    throw invalidProtocolBufferExceptionAz;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private int P5() {
            return (int) (this.mUb - this.gh);
        }

        private void U() {
            long j2 = this.mUb + ((long) this.az);
            this.mUb = j2;
            int i2 = (int) (j2 - this.qie);
            int i3 = this.ck;
            if (i2 <= i3) {
                this.az = 0;
                return;
            }
            int i5 = i2 - i3;
            this.az = i5;
            this.mUb = j2 - ((long) i5);
        }

        private int nHg(long j2) {
            return (int) (j2 - this.xMQ);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int HI(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            int iO = i2 + O();
            int i3 = this.ck;
            if (iO > i3) {
                throw InvalidProtocolBufferException.az();
            }
            this.ck = iO;
            U();
            return i3;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean J2() {
            return this.gh == this.mUb;
        }

        public void M7(int i2) throws InvalidProtocolBufferException {
            if (i2 >= 0 && i2 <= P5()) {
                this.gh += (long) i2;
            } else {
                if (i2 >= 0) {
                    throw InvalidProtocolBufferException.az();
                }
                throw InvalidProtocolBufferException.Uo();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int O() {
            return (int) (this.gh - this.qie);
        }

        public long Xw() {
            long j2;
            long j3;
            long j4;
            int i2;
            long j5 = this.gh;
            if (this.mUb != j5) {
                long j6 = 1 + j5;
                byte bAYN = UnsafeUtil.aYN(j5);
                if (bAYN >= 0) {
                    this.gh = j6;
                    return bAYN;
                }
                if (this.mUb - j6 >= 9) {
                    long j7 = 2 + j5;
                    int iAYN = (UnsafeUtil.aYN(j6) << 7) ^ bAYN;
                    if (iAYN >= 0) {
                        long j9 = 3 + j5;
                        int iAYN2 = iAYN ^ (UnsafeUtil.aYN(j7) << 14);
                        if (iAYN2 >= 0) {
                            j2 = iAYN2 ^ 16256;
                            j7 = j9;
                        } else {
                            j7 = 4 + j5;
                            int iAYN3 = iAYN2 ^ (UnsafeUtil.aYN(j9) << 21);
                            if (iAYN3 < 0) {
                                i2 = (-2080896) ^ iAYN3;
                            } else {
                                long j10 = 5 + j5;
                                long jAYN = ((long) iAYN3) ^ (((long) UnsafeUtil.aYN(j7)) << 28);
                                if (jAYN >= 0) {
                                    j4 = 266354560;
                                } else {
                                    long j11 = 6 + j5;
                                    long jAYN2 = jAYN ^ (((long) UnsafeUtil.aYN(j10)) << 35);
                                    if (jAYN2 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j10 = 7 + j5;
                                        jAYN = jAYN2 ^ (((long) UnsafeUtil.aYN(j11)) << 42);
                                        if (jAYN >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j11 = 8 + j5;
                                            jAYN2 = jAYN ^ (((long) UnsafeUtil.aYN(j10)) << 49);
                                            if (jAYN2 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                long j12 = j5 + 9;
                                                long jAYN3 = (jAYN2 ^ (((long) UnsafeUtil.aYN(j11)) << 56)) ^ 71499008037633920L;
                                                if (jAYN3 < 0) {
                                                    long j13 = j5 + 10;
                                                    if (UnsafeUtil.aYN(j12) >= 0) {
                                                        j7 = j13;
                                                        j2 = jAYN3;
                                                    }
                                                } else {
                                                    j2 = jAYN3;
                                                    j7 = j12;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ jAYN2;
                                    j7 = j11;
                                }
                                j2 = j4 ^ jAYN;
                                j7 = j10;
                            }
                        }
                        this.gh = j7;
                        return j2;
                    }
                    i2 = iAYN ^ (-128);
                    j2 = i2;
                    this.gh = j7;
                    return j2;
                }
            }
            return jB();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.aYN(r3) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int bzg() {
            int i2;
            long j2 = this.gh;
            if (this.mUb != j2) {
                long j3 = 1 + j2;
                byte bAYN = UnsafeUtil.aYN(j2);
                if (bAYN >= 0) {
                    this.gh = j3;
                    return bAYN;
                }
                if (this.mUb - j3 >= 9) {
                    long j4 = 2 + j2;
                    int iAYN = (UnsafeUtil.aYN(j3) << 7) ^ bAYN;
                    if (iAYN < 0) {
                        i2 = iAYN ^ (-128);
                    } else {
                        long j5 = 3 + j2;
                        int iAYN2 = iAYN ^ (UnsafeUtil.aYN(j4) << 14);
                        if (iAYN2 >= 0) {
                            i2 = iAYN2 ^ 16256;
                        } else {
                            j4 = 4 + j2;
                            int iAYN3 = iAYN2 ^ (UnsafeUtil.aYN(j5) << 21);
                            if (iAYN3 < 0) {
                                i2 = (-2080896) ^ iAYN3;
                            } else {
                                j5 = 5 + j2;
                                byte bAYN2 = UnsafeUtil.aYN(j4);
                                int i3 = (iAYN3 ^ (bAYN2 << 28)) ^ 266354560;
                                if (bAYN2 < 0) {
                                    j4 = 6 + j2;
                                    if (UnsafeUtil.aYN(j5) < 0) {
                                        j5 = 7 + j2;
                                        if (UnsafeUtil.aYN(j4) < 0) {
                                            j4 = 8 + j2;
                                            if (UnsafeUtil.aYN(j5) < 0) {
                                                j5 = j2 + 9;
                                                if (UnsafeUtil.aYN(j4) < 0) {
                                                    j4 = 10 + j2;
                                                }
                                            }
                                        }
                                    }
                                    i2 = i3;
                                }
                                i2 = i3;
                            }
                        }
                        j4 = j5;
                    }
                    this.gh = j4;
                    return i2;
                }
            }
            return (int) jB();
        }

        long jB() throws InvalidProtocolBufferException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte bWTp = wTp();
                j2 |= ((long) (bWTp & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((bWTp & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.J2();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public void n(int i2) throws InvalidProtocolBufferException {
            if (this.ty != i2) {
                throw InvalidProtocolBufferException.rl();
            }
        }

        public long rV9() throws InvalidProtocolBufferException {
            long j2 = this.gh;
            if (this.mUb - j2 < 8) {
                throw InvalidProtocolBufferException.az();
            }
            this.gh = 8 + j2;
            return ((((long) UnsafeUtil.aYN(j2 + 7)) & 255) << 56) | (((long) UnsafeUtil.aYN(j2)) & 255) | ((((long) UnsafeUtil.aYN(1 + j2)) & 255) << 8) | ((((long) UnsafeUtil.aYN(2 + j2)) & 255) << 16) | ((((long) UnsafeUtil.aYN(3 + j2)) & 255) << 24) | ((((long) UnsafeUtil.aYN(4 + j2)) & 255) << 32) | ((((long) UnsafeUtil.aYN(5 + j2)) & 255) << 40) | ((((long) UnsafeUtil.aYN(6 + j2)) & 255) << 48);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public void ty(int i2) {
            this.ck = i2;
            U();
        }

        public int v() throws InvalidProtocolBufferException {
            long j2 = this.gh;
            if (this.mUb - j2 < 4) {
                throw InvalidProtocolBufferException.az();
            }
            this.gh = 4 + j2;
            return ((UnsafeUtil.aYN(j2 + 3) & UByte.MAX_VALUE) << 24) | (UnsafeUtil.aYN(j2) & UByte.MAX_VALUE) | ((UnsafeUtil.aYN(1 + j2) & UByte.MAX_VALUE) << 8) | ((UnsafeUtil.aYN(2 + j2) & UByte.MAX_VALUE) << 16);
        }

        public byte wTp() throws InvalidProtocolBufferException {
            long j2 = this.gh;
            if (j2 == this.mUb) {
                throw InvalidProtocolBufferException.az();
            }
            this.gh = 1 + j2;
            return UnsafeUtil.aYN(j2);
        }

        private void p5() throws InvalidProtocolBufferException {
            if (P5() >= 10) {
                eF();
            } else {
                E();
            }
        }

        static boolean s7N() {
            return UnsafeUtil.s7N();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int E2() throws InvalidProtocolBufferException {
            if (J2()) {
                this.ty = 0;
                return 0;
            }
            int iBzg = bzg();
            this.ty = iBzg;
            if (WireFormat.n(iBzg) != 0) {
                return this.ty;
            }
            throw InvalidProtocolBufferException.t();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public ByteString Ik() throws InvalidProtocolBufferException {
            int iBzg = bzg();
            if (iBzg > 0 && iBzg <= P5()) {
                if (this.KN && this.HI) {
                    long j2 = this.gh;
                    long j3 = iBzg;
                    ByteBuffer byteBufferM = M(j2, j2 + j3);
                    this.gh += j3;
                    return ByteString.nHg(byteBufferM);
                }
                byte[] bArr = new byte[iBzg];
                long j4 = iBzg;
                UnsafeUtil.ck(this.gh, bArr, 0L, j4);
                this.gh += j4;
                return ByteString.s7N(bArr);
            }
            if (iBzg == 0) {
                return ByteString.f37740t;
            }
            if (iBzg < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public float S() {
            return Float.intBitsToFloat(v());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean T(int i2) throws InvalidProtocolBufferException {
            int iRl = WireFormat.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl != 4) {
                                if (iRl == 5) {
                                    M7(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.O();
                            }
                            return false;
                        }
                        N();
                        n(WireFormat.t(WireFormat.n(i2), 4));
                        return true;
                    }
                    M7(bzg());
                    return true;
                }
                M7(8);
                return true;
            }
            p5();
            return true;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int ViF() {
            return v();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int WPU() {
            return bzg();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long X() {
            return Xw();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long XQ() {
            return rV9();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int Z() {
            return v();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long aYN() {
            return Xw();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public boolean ck() {
            if (Xw() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int e() {
            return bzg();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public String fD() throws InvalidProtocolBufferException {
            int iBzg = bzg();
            if (iBzg > 0 && iBzg <= P5()) {
                String strUo = Utf8.Uo(this.Uo, nHg(this.gh), iBzg);
                this.gh += (long) iBzg;
                return strUo;
            }
            if (iBzg == 0) {
                return "";
            }
            if (iBzg <= 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int g() {
            return CodedInputStream.t(bzg());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public String iF() throws InvalidProtocolBufferException {
            int iBzg = bzg();
            if (iBzg > 0 && iBzg <= P5()) {
                byte[] bArr = new byte[iBzg];
                long j2 = iBzg;
                UnsafeUtil.ck(this.gh, bArr, 0L, j2);
                String str = new String(bArr, Internal.rl);
                this.gh += j2;
                return str;
            }
            if (iBzg == 0) {
                return "";
            }
            if (iBzg < 0) {
                throw InvalidProtocolBufferException.Uo();
            }
            throw InvalidProtocolBufferException.az();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long nY() {
            return rV9();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public int o() {
            return bzg();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public double r() {
            return Double.longBitsToDouble(rV9());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public long te() {
            return CodedInputStream.nr(Xw());
        }
    }

    public static CodedInputStream gh(byte[] bArr) {
        return qie(bArr, 0, bArr.length);
    }

    public static long nr(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static CodedInputStream qie(byte[] bArr, int i2, int i3) {
        return az(bArr, i2, i3, false);
    }

    public static int t(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public abstract int E2();

    public abstract int HI(int i2);

    public abstract ByteString Ik();

    public abstract boolean J2();

    public abstract int O();

    public abstract float S();

    public abstract boolean T(int i2);

    public abstract int ViF();

    public abstract int WPU();

    public abstract long X();

    public abstract long XQ();

    public abstract int Z();

    public abstract long aYN();

    public abstract boolean ck();

    public abstract int e();

    public abstract String fD();

    public abstract int g();

    public abstract String iF();

    public abstract void n(int i2);

    public abstract long nY();

    public abstract int o();

    public abstract double r();

    public abstract long te();

    public abstract void ty(int i2);

    private CodedInputStream() {
        this.rl = J2;
        this.f37759t = Integer.MAX_VALUE;
        this.f37757O = false;
    }

    public static CodedInputStream KN(InputStream inputStream, int i2) {
        if (i2 > 0) {
            return inputStream == null ? gh(Internal.nr) : new StreamDecoder(inputStream, i2);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream Uo(InputStream inputStream) {
        return KN(inputStream, 4096);
    }

    static CodedInputStream az(byte[] bArr, int i2, int i3, boolean z2) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i2, i3, z2);
        try {
            arrayDecoder.HI(i3);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public void rl() throws InvalidProtocolBufferException {
        if (this.f37758n >= this.rl) {
            throw InvalidProtocolBufferException.xMQ();
        }
    }

    static CodedInputStream mUb(ByteBuffer byteBuffer, boolean z2) {
        if (byteBuffer.hasArray()) {
            return az(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z2);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.s7N()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z2);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return az(bArr, 0, iRemaining, true);
    }

    static CodedInputStream xMQ(Iterable iterable, boolean z2) {
        Iterator it = iterable.iterator();
        int i2 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i2 |= 1;
            } else if (byteBuffer.isDirect()) {
                i2 |= 2;
            } else {
                i2 |= 4;
            }
        }
        if (i2 == 2) {
            return new IterableDirectByteBufferDecoder(iterable, iRemaining, z2);
        }
        return Uo(new IterableByteBufferInputStream(iterable));
    }

    public void N() throws InvalidProtocolBufferException {
        int iE2;
        do {
            iE2 = E2();
            if (iE2 != 0) {
                rl();
                this.f37758n++;
                this.f37758n--;
            } else {
                return;
            }
        } while (T(iE2));
    }
}
