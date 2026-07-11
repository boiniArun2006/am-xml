package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class v extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f56685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f56686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f56687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f56688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f56689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f56690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f56692l = Integer.MAX_VALUE;

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i2) throws n1 {
        if (this.f56691k != i2) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i2) {
        this.f56692l = i2;
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
            if (((int) (this.f56687g - this.f56688h)) >= 10) {
                while (i5 < 10) {
                    long j2 = this.f56688h;
                    this.f56688h = j2 + 1;
                    if (x3.f56720c.a(j2) < 0) {
                        i5++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i5 < 10) {
                long j3 = this.f56688h;
                if (j3 == this.f56687g) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f56688h = j3 + 1;
                if (x3.f56720c.a(j3) < 0) {
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
        int i7 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return (int) (this.f56688h - this.f56689i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i2) throws n1 {
        if (i2 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = i2 + ((int) (this.f56688h - this.f56689i));
        int i5 = this.f56692l;
        if (i3 > i5) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f56692l = i3;
        z();
        return i5;
    }

    public final void f(int i2) throws n1 {
        if (i2 >= 0) {
            long j2 = this.f56687g;
            long j3 = this.f56688h;
            if (i2 <= ((int) (j2 - j3))) {
                this.f56688h = j3 + ((long) i2);
                return;
            }
        }
        if (i2 >= 0) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[PHI: r6
      0x00cc: PHI (r6v9 long) = (r6v8 long), (r6v12 long) binds: [B:22:0x0064, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m() throws n1 {
        int i2;
        long j2 = this.f56688h;
        if (this.f56687g != j2) {
            long j3 = j2 + 1;
            w3 w3Var = x3.f56720c;
            byte bA2 = w3Var.a(j2);
            if (bA2 >= 0) {
                this.f56688h = j3;
                return bA2;
            }
            if (this.f56687g - j3 >= 9) {
                long j4 = 2 + j2;
                int iA = (w3Var.a(j3) << 7) ^ bA2;
                if (iA < 0) {
                    i2 = iA ^ (-128);
                } else {
                    long j5 = 3 + j2;
                    int iA2 = iA ^ (w3Var.a(j4) << 14);
                    if (iA2 >= 0) {
                        i2 = iA2 ^ 16256;
                        j4 = j5;
                    } else {
                        j4 = 4 + j2;
                        int iA3 = iA2 ^ (w3Var.a(j5) << 21);
                        if (iA3 < 0) {
                            i2 = (-2080896) ^ iA3;
                        } else {
                            long j6 = 5 + j2;
                            byte bA3 = w3Var.a(j4);
                            int i3 = (iA3 ^ (bA3 << 28)) ^ 266354560;
                            if (bA3 < 0) {
                                j4 = 6 + j2;
                                if (w3Var.a(j6) < 0) {
                                    j6 = 7 + j2;
                                    if (w3Var.a(j4) < 0) {
                                        j4 = 8 + j2;
                                        if (w3Var.a(j6) < 0) {
                                            long j7 = 9 + j2;
                                            if (w3Var.a(j4) < 0) {
                                                long j9 = j2 + 10;
                                                if (w3Var.a(j7) >= 0) {
                                                    j4 = j9;
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                        }
                                    } else {
                                        j4 = j6;
                                    }
                                }
                                i2 = i3;
                            }
                        }
                    }
                }
                this.f56688h = j4;
                return i2;
            }
        }
        long j10 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            long j11 = this.f56688h;
            if (j11 == this.f56687g) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f56688h = j11 + 1;
            byte bA4 = x3.f56720c.a(j11);
            j10 |= ((long) (bA4 & ByteCompanionObject.MAX_VALUE)) << i5;
            if ((bA4 & ByteCompanionObject.MIN_VALUE) == 0) {
                return (int) j10;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final int w() throws n1 {
        long j2 = this.f56688h;
        if (this.f56687g - j2 < 4) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f56688h = 4 + j2;
        w3 w3Var = x3.f56720c;
        return ((w3Var.a(j2 + 3) & UByte.MAX_VALUE) << 24) | (w3Var.a(j2) & UByte.MAX_VALUE) | ((w3Var.a(1 + j2) & UByte.MAX_VALUE) << 8) | ((w3Var.a(2 + j2) & UByte.MAX_VALUE) << 16);
    }

    public final long x() throws n1 {
        long j2 = this.f56688h;
        if (this.f56687g - j2 < 8) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f56688h = 8 + j2;
        w3 w3Var = x3.f56720c;
        return ((((long) w3Var.a(j2 + 7)) & 255) << 56) | (((long) w3Var.a(j2)) & 255) | ((((long) w3Var.a(1 + j2)) & 255) << 8) | ((((long) w3Var.a(2 + j2)) & 255) << 16) | ((((long) w3Var.a(3 + j2)) & 255) << 24) | ((((long) w3Var.a(4 + j2)) & 255) << 32) | ((((long) w3Var.a(5 + j2)) & 255) << 40) | ((((long) w3Var.a(6 + j2)) & 255) << 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long y() throws n1 {
        long j2;
        long j3;
        long j4;
        int i2;
        long j5 = this.f56688h;
        long j6 = 0;
        if (this.f56687g == j5) {
            j2 = 1;
        } else {
            long j7 = j5 + 1;
            w3 w3Var = x3.f56720c;
            byte bA2 = w3Var.a(j5);
            if (bA2 >= 0) {
                this.f56688h = j7;
                return bA2;
            }
            if (this.f56687g - j7 >= 9) {
                long j9 = 2 + j5;
                int iA = (w3Var.a(j7) << 7) ^ bA2;
                if (iA >= 0) {
                    long j10 = 3 + j5;
                    int iA2 = iA ^ (w3Var.a(j9) << 14);
                    if (iA2 >= 0) {
                        j3 = iA2 ^ 16256;
                        j9 = j10;
                    } else {
                        j9 = 4 + j5;
                        int iA3 = iA2 ^ (w3Var.a(j10) << 21);
                        if (iA3 < 0) {
                            i2 = (-2080896) ^ iA3;
                        } else {
                            j2 = 1;
                            long j11 = j5 + 5;
                            long jA = ((long) iA3) ^ (((long) w3Var.a(j9)) << 28);
                            if (jA >= 0) {
                                j3 = 266354560 ^ jA;
                                j9 = j11;
                            } else {
                                j9 = j5 + 6;
                                long jA2 = (((long) w3Var.a(j11)) << 35) ^ jA;
                                if (jA2 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    long j12 = 7 + j5;
                                    long jA3 = jA2 ^ (((long) w3Var.a(j9)) << 42);
                                    if (jA3 >= 0) {
                                        j3 = 4363953127296L ^ jA3;
                                        j9 = j12;
                                    } else {
                                        j9 = j5 + 8;
                                        jA2 = jA3 ^ (((long) w3Var.a(j12)) << 49);
                                        if (jA2 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            long j13 = 9 + j5;
                                            long jA4 = (jA2 ^ (((long) w3Var.a(j9)) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j14 = j5 + 10;
                                                if (w3Var.a(j13) >= 0) {
                                                    j9 = j14;
                                                }
                                            } else {
                                                j9 = j13;
                                            }
                                            j3 = jA4;
                                        }
                                    }
                                }
                                j3 = j4 ^ jA2;
                            }
                        }
                    }
                    this.f56688h = j9;
                    return j3;
                }
                i2 = iA ^ (-128);
                j3 = i2;
                this.f56688h = j9;
                return j3;
            }
        }
        for (int i3 = 0; i3 < 64; i3 += 7) {
            long j15 = this.f56688h;
            if (j15 == this.f56687g) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f56688h = j15 + j2;
            byte bA3 = x3.f56720c.a(j15);
            j6 |= ((long) (bA3 & ByteCompanionObject.MAX_VALUE)) << i3;
            if ((bA3 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j6;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        long j2 = this.f56687g + ((long) this.f56690j);
        this.f56687g = j2;
        int i2 = (int) (j2 - this.f56689i);
        int i3 = this.f56692l;
        if (i2 <= i3) {
            this.f56690j = 0;
            return;
        }
        int i5 = i2 - i3;
        this.f56690j = i5;
        this.f56687g = j2 - ((long) i5);
    }

    public v(ByteBuffer byteBuffer, boolean z2) {
        this.f56685e = byteBuffer;
        w3 w3Var = x3.f56720c;
        long j2 = w3Var.f56706a.getLong(byteBuffer, x3.f56724g);
        this.f56686f = j2;
        this.f56687g = ((long) byteBuffer.limit()) + j2;
        long jPosition = j2 + ((long) byteBuffer.position());
        this.f56688h = jPosition;
        this.f56689i = jPosition;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f56688h == this.f56687g;
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
            long j2 = this.f56687g;
            long j3 = this.f56688h;
            if (iM <= ((int) (j2 - j3))) {
                byte[] bArr = new byte[iM];
                long j4 = iM;
                x3.f56720c.a(j3, bArr, j4);
                String str = new String(bArr, l1.f56612a);
                this.f56688h += j4;
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
        String strA;
        int iM = m();
        if (iM > 0) {
            long j2 = this.f56687g;
            long j3 = this.f56688h;
            if (iM <= ((int) (j2 - j3))) {
                int i2 = (int) (j3 - this.f56686f);
                ByteBuffer byteBuffer = this.f56685e;
                z3 z3Var = d4.f56549a;
                z3Var.getClass();
                if (byteBuffer.hasArray()) {
                    strA = z3Var.a(byteBuffer.array(), byteBuffer.arrayOffset() + i2, iM);
                } else if (byteBuffer.isDirect()) {
                    strA = z3Var.b(byteBuffer, i2, iM);
                } else {
                    strA = z3.a(byteBuffer, i2, iM);
                }
                this.f56688h += (long) iM;
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
            this.f56691k = 0;
            return 0;
        }
        int iM = m();
        this.f56691k = iM;
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
            this.f56692l = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j2 = this.f56687g;
            long j3 = this.f56688h;
            if (iM <= ((int) (j2 - j3))) {
                byte[] bArr = new byte[iM];
                long j4 = iM;
                x3.f56720c.a(j3, bArr, j4);
                this.f56688h += j4;
                q qVar = s.f56654b;
                return new q(bArr);
            }
        }
        if (iM == 0) {
            return s.f56654b;
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i2 = this.f56692l;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - ((int) (this.f56688h - this.f56689i));
    }
}
