package com.fyber.inneractive.sdk.protobuf;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class u extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f56670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f56671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f56674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f56675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f56677l = Integer.MAX_VALUE;

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i2) throws n1 {
        if (this.f56675j != i2) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i2) {
        this.f56677l = i2;
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
            if (this.f56672g - this.f56674i >= 10) {
                while (i5 < 10) {
                    byte[] bArr = this.f56671f;
                    int i7 = this.f56674i;
                    this.f56674i = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i5 < 10) {
                if (this.f56674i == this.f56672g) {
                    i(1);
                }
                byte[] bArr2 = this.f56671f;
                int i8 = this.f56674i;
                this.f56674i = i8 + 1;
                if (bArr2[i8] < 0) {
                    i5++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i3 == 1) {
            j(8);
            return true;
        }
        if (i3 == 2) {
            j(m());
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
            j(4);
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
    public final int b() {
        return this.f56676k + this.f56674i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i2) throws n1 {
        if (i2 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.f56676k + this.f56674i + i2;
        int i5 = this.f56677l;
        if (i3 > i5) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f56677l = i3;
        z();
        return i5;
    }

    public final byte[] f(int i2) throws IOException {
        byte[] bArrG = g(i2);
        if (bArrG != null) {
            return bArrG;
        }
        int i3 = this.f56674i;
        int i5 = this.f56672g;
        int length = i5 - i3;
        this.f56676k += i5;
        this.f56674i = 0;
        this.f56672g = 0;
        ArrayList<byte[]> arrayListH = h(i2 - length);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f56671f, i3, bArr, 0, length);
        for (byte[] bArr2 : arrayListH) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] g(int i2) throws IOException {
        if (i2 == 0) {
            return l1.f56613b;
        }
        if (i2 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.f56676k;
        int i5 = this.f56674i;
        int i7 = i3 + i5 + i2;
        if (i7 - this.f56695c > 0) {
            throw new n1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f56677l;
        if (i7 > i8) {
            j((i8 - i3) - i5);
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = this.f56672g - i5;
        int i10 = i2 - i9;
        if (i10 >= 4096 && i10 > this.f56670e.available()) {
            return null;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f56671f, this.f56674i, bArr, 0, i9);
        this.f56676k += this.f56672g;
        this.f56674i = 0;
        this.f56672g = 0;
        while (i9 < i2) {
            int i11 = this.f56670e.read(bArr, i9, i2 - i9);
            if (i11 == -1) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f56676k += i11;
            i9 += i11;
        }
        return bArr;
    }

    public final ArrayList h(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i5 = this.f56670e.read(bArr, i3, iMin - i3);
                if (i5 == -1) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f56676k += i5;
                i3 += i5;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void i(int i2) throws n1 {
        if (k(i2)) {
            return;
        }
        if (i2 <= (this.f56695c - this.f56676k) - this.f56674i) {
            throw new n1(QiDPjiOCZHDS.mPatE);
        }
        throw new n1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void j(int i2) throws n1 {
        int i3 = this.f56672g;
        int i5 = this.f56674i;
        int i7 = i3 - i5;
        if (i2 <= i7 && i2 >= 0) {
            this.f56674i = i5 + i2;
            return;
        }
        if (i2 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.f56676k;
        int i9 = i8 + i5;
        int i10 = i9 + i2;
        int i11 = this.f56677l;
        if (i10 > i11) {
            j((i11 - i8) - i5);
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f56676k = i9;
        this.f56672g = 0;
        this.f56674i = 0;
        while (i7 < i2) {
            try {
                long j2 = i2 - i7;
                long jSkip = this.f56670e.skip(j2);
                if (jSkip < 0 || jSkip > j2) {
                    throw new IllegalStateException(this.f56670e.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i7 += (int) jSkip;
                }
            } finally {
                this.f56676k += i7;
                z();
            }
        }
        if (i7 >= i2) {
            return;
        }
        int i12 = this.f56672g;
        int i13 = i12 - this.f56674i;
        this.f56674i = i12;
        i(1);
        while (true) {
            int i14 = i2 - i13;
            int i15 = this.f56672g;
            if (i14 <= i15) {
                this.f56674i = i14;
                return;
            } else {
                i13 += i15;
                this.f56674i = i15;
                i(1);
            }
        }
    }

    public final boolean k(int i2) throws IOException {
        int i3 = this.f56674i;
        int i5 = i3 + i2;
        int i7 = this.f56672g;
        if (i5 <= i7) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        }
        int i8 = this.f56695c;
        int i9 = this.f56676k;
        if (i2 > (i8 - i9) - i3 || i9 + i3 + i2 > this.f56677l) {
            return false;
        }
        if (i3 > 0) {
            if (i7 > i3) {
                byte[] bArr = this.f56671f;
                System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
            }
            this.f56676k += i3;
            this.f56672g -= i3;
            this.f56674i = 0;
        }
        InputStream inputStream = this.f56670e;
        byte[] bArr2 = this.f56671f;
        int i10 = this.f56672g;
        int i11 = inputStream.read(bArr2, i10, Math.min(bArr2.length - i10, (this.f56695c - this.f56676k) - i10));
        if (i11 == 0 || i11 < -1 || i11 > this.f56671f.length) {
            throw new IllegalStateException(this.f56670e.getClass() + "#read(byte[]) returned invalid result: " + i11 + "\nThe InputStream implementation is buggy.");
        }
        if (i11 <= 0) {
            return false;
        }
        this.f56672g += i11;
        z();
        if (this.f56672g >= i2) {
            return true;
        }
        return k(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[PHI: r3
      0x00a0: PHI (r3v13 int) = (r3v12 int), (r3v15 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m() throws n1 {
        int i2;
        int i3 = this.f56674i;
        int i5 = this.f56672g;
        if (i5 != i3) {
            byte[] bArr = this.f56671f;
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f56674i = i7;
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
                this.f56674i = i8;
                return i2;
            }
        }
        long j2 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            if (this.f56674i == this.f56672g) {
                i(1);
            }
            byte[] bArr2 = this.f56671f;
            int i18 = this.f56674i;
            this.f56674i = i18 + 1;
            byte b5 = bArr2[i18];
            j2 |= ((long) (b5 & ByteCompanionObject.MAX_VALUE)) << i17;
            if ((b5 & ByteCompanionObject.MIN_VALUE) == 0) {
                return (int) j2;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final int w() throws n1 {
        int i2 = this.f56674i;
        if (this.f56672g - i2 < 4) {
            i(4);
            i2 = this.f56674i;
        }
        byte[] bArr = this.f56671f;
        this.f56674i = i2 + 4;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long x() throws n1 {
        int i2 = this.f56674i;
        if (this.f56672g - i2 < 8) {
            i(8);
            i2 = this.f56674i;
        }
        byte[] bArr = this.f56671f;
        this.f56674i = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final long y() throws n1 {
        long j2;
        long j3;
        long j4;
        int i2 = this.f56674i;
        int i3 = this.f56672g;
        long j5 = 0;
        if (i3 != i2) {
            byte[] bArr = this.f56671f;
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f56674i = i5;
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
                this.f56674i = i7;
                return j2;
            }
        }
        for (int i15 = 0; i15 < 64; i15 += 7) {
            if (this.f56674i == this.f56672g) {
                i(1);
            }
            byte[] bArr2 = this.f56671f;
            int i16 = this.f56674i;
            this.f56674i = i16 + 1;
            byte b4 = bArr2[i16];
            j5 |= ((long) (b4 & ByteCompanionObject.MAX_VALUE)) << i15;
            if ((b4 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j5;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        int i2 = this.f56672g + this.f56673h;
        this.f56672g = i2;
        int i3 = this.f56676k + i2;
        int i5 = this.f56677l;
        if (i3 <= i5) {
            this.f56673h = 0;
            return;
        }
        int i7 = i3 - i5;
        this.f56673h = i7;
        this.f56672g = i2 - i7;
    }

    public u(InputStream inputStream) {
        Charset charset = l1.f56612a;
        if (inputStream != null) {
            this.f56670e = inputStream;
            this.f56671f = new byte[4096];
            this.f56672g = 0;
            this.f56674i = 0;
            this.f56676k = 0;
            return;
        }
        throw new NullPointerException("input");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f56674i == this.f56672g && !k(1);
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
            int i2 = this.f56672g;
            int i3 = this.f56674i;
            if (iM <= i2 - i3) {
                String str = new String(this.f56671f, i3, iM, l1.f56612a);
                this.f56674i += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= this.f56672g) {
            i(iM);
            String str2 = new String(this.f56671f, this.f56674i, iM, l1.f56612a);
            this.f56674i += iM;
            return str2;
        }
        return new String(f(iM), l1.f56612a);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws IOException {
        byte[] bArrF;
        int iM = m();
        int i2 = this.f56674i;
        int i3 = this.f56672g;
        if (iM <= i3 - i2 && iM > 0) {
            bArrF = this.f56671f;
            this.f56674i = i2 + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            i2 = 0;
            if (iM <= i3) {
                i(iM);
                bArrF = this.f56671f;
                this.f56674i = iM;
            } else {
                bArrF = f(iM);
            }
        }
        return d4.f56549a.a(bArrF, i2, iM);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f56675j = 0;
            return 0;
        }
        int iM = m();
        this.f56675j = iM;
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
            this.f56677l = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws IOException {
        int iM = m();
        int i2 = this.f56672g;
        int i3 = this.f56674i;
        if (iM <= i2 - i3 && iM > 0) {
            byte[] bArr = this.f56671f;
            q qVar = s.f56654b;
            s.a(i3, i3 + iM, bArr.length);
            q qVar2 = new q(s.f56655c.a(bArr, i3, iM));
            this.f56674i += iM;
            return qVar2;
        }
        if (iM == 0) {
            return s.f56654b;
        }
        byte[] bArrG = g(iM);
        if (bArrG != null) {
            int length = bArrG.length;
            s.a(0, length, bArrG.length);
            return new q(s.f56655c.a(bArrG, 0, length));
        }
        int i5 = this.f56674i;
        int i7 = this.f56672g;
        int length2 = i7 - i5;
        this.f56676k += i7;
        this.f56674i = 0;
        this.f56672g = 0;
        ArrayList<byte[]> arrayListH = h(iM - length2);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(this.f56671f, i5, bArr2, 0, length2);
        for (byte[] bArr3 : arrayListH) {
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        q qVar3 = s.f56654b;
        return new q(bArr2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i2 = this.f56677l;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.f56676k + this.f56674i);
    }
}
