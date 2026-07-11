package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class t extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f56658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f56662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f56663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56664k = Integer.MAX_VALUE;

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i2) throws n1 {
        if (this.f56663j != i2) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i2) {
        this.f56664k = i2;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean d() {
        return y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean e(int i2) throws n1 {
        int iT;
        int i3 = i2 & 7;
        int i5 = 0;
        if (i3 == 0) {
            if (this.f56659f - this.f56661h >= 10) {
                while (i5 < 10) {
                    byte[] bArr = this.f56658e;
                    int i7 = this.f56661h;
                    this.f56661h = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i5 < 10) {
                int i8 = this.f56661h;
                if (i8 == this.f56659f) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f56658e;
                this.f56661h = i8 + 1;
                if (bArr2[i8] < 0) {
                    i5++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i3 == 1) {
            f(8);
            return true;
        }
        if (i3 == 2) {
            f(m());
            return true;
        }
        if (i3 == 3) {
            do {
                iT = t();
                if (iT == 0) {
                    break;
                }
            } while (e(iT));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 == 5) {
            f(4);
            return true;
        }
        int i9 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return this.f56661h - this.f56662i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i2) {
        if (i2 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = (this.f56661h - this.f56662i) + i2;
        int i5 = this.f56664k;
        if (i3 > i5) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f56664k = i3;
        z();
        return i5;
    }

    public final void f(int i2) throws n1 {
        if (i2 >= 0) {
            int i3 = this.f56659f;
            int i5 = this.f56661h;
            if (i2 <= i3 - i5) {
                this.f56661h = i5 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2 A[PHI: r3
      0x00a2: PHI (r3v11 int) = (r3v10 int), (r3v13 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m() throws n1 {
        int i2;
        int i3 = this.f56661h;
        int i5 = this.f56659f;
        if (i5 != i3) {
            byte[] bArr = this.f56658e;
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f56661h = i7;
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
                            i8 = i12;
                        } else {
                            i10 = i3 + 5;
                            byte b4 = bArr[i12];
                            int i14 = (i13 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                int i15 = i3 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i3 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i3 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 9;
                                            if (bArr[i15] < 0) {
                                                int i16 = i3 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                        } else {
                                            i10 = i15;
                                        }
                                    }
                                }
                            }
                            i2 = i14;
                        }
                    }
                    i8 = i10;
                }
                this.f56661h = i8;
                return i2;
            }
        }
        long j2 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            int i18 = this.f56661h;
            if (i18 == this.f56659f) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f56658e;
            this.f56661h = i18 + 1;
            byte b5 = bArr2[i18];
            j2 |= ((long) (b5 & ByteCompanionObject.MAX_VALUE)) << i17;
            if ((b5 & ByteCompanionObject.MIN_VALUE) == 0) {
                return (int) j2;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final int w() throws n1 {
        int i2 = this.f56661h;
        if (this.f56659f - i2 < 4) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f56658e;
        this.f56661h = i2 + 4;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long x() throws n1 {
        int i2 = this.f56661h;
        if (this.f56659f - i2 < 8) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f56658e;
        this.f56661h = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final long y() throws n1 {
        long j2;
        long j3;
        long j4;
        int i2 = this.f56661h;
        int i3 = this.f56659f;
        long j5 = 0;
        if (i3 != i2) {
            byte[] bArr = this.f56658e;
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f56661h = i5;
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
                            j2 = (-2080896) ^ i12;
                            i7 = i11;
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
                            j2 = j4 ^ j7;
                        }
                    }
                }
                this.f56661h = i7;
                return j2;
            }
        }
        for (int i15 = 0; i15 < 64; i15 += 7) {
            int i16 = this.f56661h;
            if (i16 == this.f56659f) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f56658e;
            this.f56661h = i16 + 1;
            byte b4 = bArr2[i16];
            j5 |= ((long) (b4 & ByteCompanionObject.MAX_VALUE)) << i15;
            if ((b4 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j5;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        int i2 = this.f56659f + this.f56660g;
        this.f56659f = i2;
        int i3 = i2 - this.f56662i;
        int i5 = this.f56664k;
        if (i3 <= i5) {
            this.f56660g = 0;
            return;
        }
        int i7 = i3 - i5;
        this.f56660g = i7;
        this.f56659f = i2 - i7;
    }

    public t(byte[] bArr, int i2, int i3, boolean z2) {
        this.f56658e = bArr;
        this.f56659f = i3 + i2;
        this.f56661h = i2;
        this.f56662i = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f56661h == this.f56659f;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int g() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int h() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long i() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final float j() {
        return Float.intBitsToFloat(w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int k() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long l() {
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int n() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long o() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int p() {
        return w.b(m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long q() {
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String r() throws n1 {
        int iM = m();
        if (iM > 0) {
            int i2 = this.f56659f;
            int i3 = this.f56661h;
            if (iM <= i2 - i3) {
                String str = new String(this.f56658e, i3, iM, l1.f56612a);
                this.f56661h += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws n1 {
        int iM = m();
        if (iM > 0) {
            int i2 = this.f56659f;
            int i3 = this.f56661h;
            if (iM <= i2 - i3) {
                String strA = d4.f56549a.a(this.f56658e, i3, iM);
                this.f56661h += iM;
                return strA;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f56663j = 0;
            return 0;
        }
        int iM = m();
        this.f56663j = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new n1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int u() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long v() {
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i2, c2 c2Var, h0 h0Var) throws IOException {
        int i3 = this.f56693a;
        if (i3 < this.f56694b) {
            this.f56693a = i3 + 1;
            ((t0) c2Var).a(this, h0Var);
            a((i2 << 3) | 4);
            this.f56693a--;
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(c2 c2Var, h0 h0Var) throws IOException {
        int iM = m();
        if (this.f56693a < this.f56694b) {
            int iD = d(iM);
            this.f56693a++;
            ((t0) c2Var).a(this, h0Var);
            a(0);
            this.f56693a--;
            this.f56664k = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q e() throws n1 {
        byte[] bArrCopyOfRange;
        int iM = m();
        if (iM > 0) {
            int i2 = this.f56659f;
            int i3 = this.f56661h;
            if (iM <= i2 - i3) {
                byte[] bArr = this.f56658e;
                q qVar = s.f56654b;
                s.a(i3, i3 + iM, bArr.length);
                q qVar2 = new q(s.f56655c.a(bArr, i3, iM));
                this.f56661h += iM;
                return qVar2;
            }
        }
        if (iM == 0) {
            return s.f56654b;
        }
        if (iM > 0) {
            int i5 = this.f56659f;
            int i7 = this.f56661h;
            if (iM <= i5 - i7) {
                int i8 = iM + i7;
                this.f56661h = i8;
                bArrCopyOfRange = Arrays.copyOfRange(this.f56658e, i7, i8);
            } else {
                if (iM > 0) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (iM == 0) {
                    bArrCopyOfRange = l1.f56613b;
                } else {
                    throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
            }
        }
        q qVar3 = s.f56654b;
        return new q(bArrCopyOfRange);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i2 = this.f56664k;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.f56661h - this.f56662i);
    }
}
