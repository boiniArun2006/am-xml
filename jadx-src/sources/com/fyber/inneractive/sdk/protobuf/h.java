package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56568a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f56569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56573f;

    public final String a(boolean z2) throws n1 {
        c(2);
        int iX = x();
        if (iX == 0) {
            return "";
        }
        a(iX);
        if (z2) {
            byte[] bArr = this.f56569b;
            int i2 = this.f56570c;
            if (!d4.f56549a.b(bArr, i2, i2 + iX)) {
                throw new n1("Protocol message had invalid UTF-8.");
            }
        }
        String str = new String(this.f56569b, this.f56570c, iX, l1.f56612a);
        this.f56570c += iX;
        return str;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) throws m1 {
        c(2);
        return d(p2.f56635c.a(cls), h0Var);
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i2 = this.f56573f;
        this.f56573f = ((this.f56572e >>> 3) << 3) | 4;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f56572e == this.f56573f) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f56573f = i2;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.f56572e;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() throws m1 {
        c(0);
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() throws n1 {
        c(1);
        a(8);
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() throws n1 {
        c(1);
        a(8);
        return Double.longBitsToDouble(w());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    @Override // com.fyber.inneractive.sdk.protobuf.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i() throws n1 {
        int i2;
        int i3;
        if (u() || (i2 = this.f56572e) == (i3 = this.f56573f)) {
            return false;
        }
        int i5 = i2 & 7;
        if (i5 != 0) {
            if (i5 == 1) {
                a(8);
                this.f56570c += 8;
                return true;
            }
            if (i5 == 2) {
                int iX = x();
                a(iX);
                this.f56570c += iX;
                return true;
            }
            if (i5 != 3) {
                if (i5 != 5) {
                    int i7 = n1.f56624a;
                    throw new m1();
                }
                a(4);
                this.f56570c += 4;
                return true;
            }
            this.f56573f = ((i2 >>> 3) << 3) | 4;
            while (s() != Integer.MAX_VALUE && i()) {
            }
            if (this.f56572e != this.f56573f) {
                throw new n1("Failed to parse the message.");
            }
            this.f56573f = i3;
            return true;
        }
        int i8 = this.f56571d;
        int i9 = this.f56570c;
        if (i8 - i9 < 10) {
            while (i < 10) {
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
        }
        byte[] bArr = this.f56569b;
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i9 + 1;
            if (bArr[i9] >= 0) {
                this.f56570c = i11;
                break;
            }
            i10++;
            i9 = i11;
        }
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = this.f56570c;
            if (i13 == this.f56571d) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f56569b;
            this.f56570c = i13 + 1;
            if (bArr2[i13] < 0) {
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() throws m1 {
        c(0);
        return w.b(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() throws n1 {
        c(5);
        a(4);
        return Float.intBitsToFloat(v());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() throws m1 {
        c(0);
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() throws n1 {
        c(5);
        a(4);
        return v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() {
        return a(false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() throws m1 {
        c(0);
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() {
        return a(true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() throws n1 {
        c(5);
        a(4);
        return v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() throws m1 {
        c(0);
        return x() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() throws n1 {
        c(1);
        a(8);
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) throws n1 {
        int i2;
        int i3;
        if (!(list instanceof a1)) {
            int i5 = this.f56572e & 7;
            if (i5 == 2) {
                int iX = x();
                d(iX);
                int i7 = this.f56570c + iX;
                while (this.f56570c < i7) {
                    list.add(Integer.valueOf(v()));
                }
                return;
            }
            if (i5 != 5) {
                int i8 = n1.f56624a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(q()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        a1 a1Var = (a1) list;
        int i9 = this.f56572e & 7;
        if (i9 == 2) {
            int iX2 = x();
            d(iX2);
            int i10 = this.f56570c + iX2;
            while (this.f56570c < i10) {
                a1Var.c(v());
            }
            return;
        }
        if (i9 != 5) {
            int i11 = n1.f56624a;
            throw new m1();
        }
        do {
            a1Var.c(q());
            if (u()) {
                return;
            } else {
                i3 = this.f56570c;
            }
        } while (x() == this.f56572e);
        this.f56570c = i3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) throws n1 {
        int i2;
        int i3;
        if (!(list instanceof u1)) {
            int i5 = this.f56572e & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(g()));
                    if (u()) {
                        return;
                    } else {
                        i2 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i2;
                return;
            }
            if (i5 != 2) {
                int i7 = n1.f56624a;
                throw new m1();
            }
            int iX = x();
            e(iX);
            int i8 = this.f56570c + iX;
            while (this.f56570c < i8) {
                list.add(Long.valueOf(w()));
            }
            return;
        }
        u1 u1Var = (u1) list;
        int i9 = this.f56572e & 7;
        if (i9 == 1) {
            do {
                u1Var.a(g());
                if (u()) {
                    return;
                } else {
                    i3 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i3;
            return;
        }
        if (i9 != 2) {
            int i10 = n1.f56624a;
            throw new m1();
        }
        int iX2 = x();
        e(iX2);
        int i11 = this.f56570c + iX2;
        while (this.f56570c < i11) {
            u1Var.a(w());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) throws n1 {
        int i2;
        int i3;
        if (!(list instanceof a1)) {
            int i5 = this.f56572e & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    int i7 = n1.f56624a;
                    throw new m1();
                }
                int iX = this.f56570c + x();
                while (this.f56570c < iX) {
                    list.add(Integer.valueOf(x()));
                }
                return;
            }
            do {
                c(0);
                list.add(Integer.valueOf(x()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        a1 a1Var = (a1) list;
        int i8 = this.f56572e & 7;
        if (i8 != 0) {
            if (i8 != 2) {
                int i9 = n1.f56624a;
                throw new m1();
            }
            int iX2 = this.f56570c + x();
            while (this.f56570c < iX2) {
                a1Var.c(x());
            }
            return;
        }
        do {
            c(0);
            a1Var.c(x());
            if (u()) {
                return;
            } else {
                i3 = this.f56570c;
            }
        } while (x() == this.f56572e);
        this.f56570c = i3;
    }

    public final boolean u() {
        return this.f56570c == this.f56571d;
    }

    public final int v() {
        int i2 = this.f56570c;
        byte[] bArr = this.f56569b;
        this.f56570c = i2 + 4;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long w() {
        int i2 = this.f56570c;
        byte[] bArr = this.f56569b;
        this.f56570c = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[PHI: r2
      0x00a4: PHI (r2v7 int) = (r2v6 int), (r2v9 int) binds: [B:37:0x0082, B:41:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x() throws n1 {
        int i2;
        int i3 = this.f56570c;
        int i5 = this.f56571d;
        if (i5 == i3) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f56569b;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            this.f56570c = i7;
            return b2;
        }
        if (i5 - i7 < 9) {
            long j2 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                int i9 = this.f56570c;
                if (i9 == this.f56571d) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f56569b;
                this.f56570c = i9 + 1;
                byte b4 = bArr2[i9];
                j2 |= ((long) (b4 & ByteCompanionObject.MAX_VALUE)) << i8;
                if ((b4 & ByteCompanionObject.MIN_VALUE) == 0) {
                    return (int) j2;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
        }
        int i10 = i3 + 2;
        int i11 = (bArr[i7] << 7) ^ b2;
        if (i11 < 0) {
            i2 = i11 ^ (-128);
        } else {
            int i12 = i3 + 3;
            int i13 = (bArr[i10] << 14) ^ i11;
            if (i13 >= 0) {
                i2 = i13 ^ 16256;
            } else {
                int i14 = i3 + 4;
                int i15 = i13 ^ (bArr[i12] << 21);
                if (i15 < 0) {
                    i2 = (-2080896) ^ i15;
                    i10 = i14;
                } else {
                    i12 = i3 + 5;
                    byte b5 = bArr[i14];
                    int i16 = (i15 ^ (b5 << 28)) ^ 266354560;
                    if (b5 < 0) {
                        int i17 = i3 + 6;
                        if (bArr[i12] < 0) {
                            i12 = i3 + 7;
                            if (bArr[i17] < 0) {
                                i17 = i3 + 8;
                                if (bArr[i12] < 0) {
                                    i12 = i3 + 9;
                                    if (bArr[i17] < 0) {
                                        int i18 = i3 + 10;
                                        if (bArr[i12] < 0) {
                                            throw new n1("CodedInputStream encountered a malformed varint.");
                                        }
                                        i12 = i18;
                                    }
                                } else {
                                    i12 = i17;
                                }
                            }
                        }
                    }
                    i2 = i16;
                }
            }
            i10 = i12;
        }
        this.f56570c = i10;
        return i2;
    }

    public final long y() throws n1 {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2 = this.f56570c;
        int i3 = this.f56571d;
        if (i3 == i2) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f56569b;
        int i5 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            this.f56570c = i5;
            return b2;
        }
        long j6 = 0;
        if (i3 - i5 < 9) {
            for (int i7 = 0; i7 < 64; i7 += 7) {
                int i8 = this.f56570c;
                if (i8 == this.f56571d) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f56569b;
                this.f56570c = i8 + 1;
                byte b4 = bArr2[i8];
                j6 |= ((long) (b4 & ByteCompanionObject.MAX_VALUE)) << i7;
                if ((b4 & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j6;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
        }
        int i9 = i2 + 2;
        int i10 = (bArr[i5] << 7) ^ b2;
        if (i10 < 0) {
            j2 = i10 ^ (-128);
        } else {
            int i11 = i2 + 3;
            int i12 = (bArr[i9] << 14) ^ i10;
            if (i12 >= 0) {
                j2 = i12 ^ 16256;
                i9 = i11;
            } else {
                int i13 = i2 + 4;
                int i14 = i12 ^ (bArr[i11] << 21);
                if (i14 < 0) {
                    j5 = (-2080896) ^ i14;
                } else {
                    long j7 = i14;
                    i9 = i2 + 5;
                    long j9 = j7 ^ (((long) bArr[i13]) << 28);
                    if (j9 >= 0) {
                        j4 = 266354560;
                    } else {
                        i13 = i2 + 6;
                        long j10 = j9 ^ (((long) bArr[i9]) << 35);
                        if (j10 < 0) {
                            j3 = -34093383808L;
                        } else {
                            i9 = i2 + 7;
                            j9 = j10 ^ (((long) bArr[i13]) << 42);
                            if (j9 >= 0) {
                                j4 = 4363953127296L;
                            } else {
                                i13 = i2 + 8;
                                j10 = j9 ^ (((long) bArr[i9]) << 49);
                                if (j10 < 0) {
                                    j3 = -558586000294016L;
                                } else {
                                    i9 = i2 + 9;
                                    long j11 = (j10 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                    if (j11 < 0) {
                                        int i15 = i2 + 10;
                                        if (bArr[i9] < 0) {
                                            throw new n1("CodedInputStream encountered a malformed varint.");
                                        }
                                        i9 = i15;
                                    }
                                    j2 = j11;
                                }
                            }
                        }
                        j5 = j3 ^ j10;
                    }
                    j2 = j4 ^ j9;
                }
                i9 = i13;
                j2 = j5;
            }
        }
        this.f56570c = i9;
        return j2;
    }

    public h(ByteBuffer byteBuffer) {
        this.f56569b = byteBuffer.array();
        this.f56570c = byteBuffer.position() + byteBuffer.arrayOffset();
        this.f56571d = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    public final Object d(t2 t2Var, h0 h0Var) throws n1 {
        int iX = x();
        a(iX);
        int i2 = this.f56571d;
        int i3 = this.f56570c + iX;
        this.f56571d = i3;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f56570c == i3) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f56571d = i2;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i5 = this.f56572e & 7;
            if (i5 == 2) {
                int iX = x();
                d(iX);
                int i7 = this.f56570c + iX;
                while (this.f56570c < i7) {
                    a1Var.c(v());
                }
                return;
            }
            if (i5 == 5) {
                do {
                    a1Var.c(m());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            int i8 = n1.f56624a;
            throw new m1();
        }
        int i9 = this.f56572e & 7;
        if (i9 == 2) {
            int iX2 = x();
            d(iX2);
            int i10 = this.f56570c + iX2;
            while (this.f56570c < i10) {
                list.add(Integer.valueOf(v()));
            }
            return;
        }
        if (i9 == 5) {
            do {
                list.add(Integer.valueOf(m()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        int i11 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i5 = this.f56572e & 7;
            if (i5 == 1) {
                do {
                    d0Var.a(h());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            if (i5 == 2) {
                int iX = x();
                e(iX);
                int i7 = this.f56570c + iX;
                while (this.f56570c < i7) {
                    d0Var.a(Double.longBitsToDouble(w()));
                }
                return;
            }
            int i8 = n1.f56624a;
            throw new m1();
        }
        int i9 = this.f56572e & 7;
        if (i9 == 1) {
            do {
                list.add(Double.valueOf(h()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        if (i9 == 2) {
            int iX2 = x();
            e(iX2);
            int i10 = this.f56570c + iX2;
            while (this.f56570c < i10) {
                list.add(Double.valueOf(Double.longBitsToDouble(w())));
            }
            return;
        }
        int i11 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof j) {
            j jVar = (j) list;
            int i5 = this.f56572e & 7;
            if (i5 == 0) {
                do {
                    jVar.a(r());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            if (i5 == 2) {
                int iX = this.f56570c + x();
                while (this.f56570c < iX) {
                    jVar.a(x() != 0);
                }
                b(iX);
                return;
            }
            int i7 = n1.f56624a;
            throw new m1();
        }
        int i8 = this.f56572e & 7;
        if (i8 == 0) {
            do {
                list.add(Boolean.valueOf(r()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        if (i8 == 2) {
            int iX2 = this.f56570c + x();
            while (this.f56570c < iX2) {
                list.add(Boolean.valueOf(x() != 0));
            }
            b(iX2);
            return;
        }
        int i9 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i5 = this.f56572e & 7;
            if (i5 == 0) {
                do {
                    c(0);
                    a1Var.c(x());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            if (i5 == 2) {
                int iX = this.f56570c + x();
                while (this.f56570c < iX) {
                    a1Var.c(x());
                }
                b(iX);
                return;
            }
            int i7 = n1.f56624a;
            throw new m1();
        }
        int i8 = this.f56572e & 7;
        if (i8 == 0) {
            do {
                c(0);
                list.add(Integer.valueOf(x()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        if (i8 == 2) {
            int iX2 = this.f56570c + x();
            while (this.f56570c < iX2) {
                list.add(Integer.valueOf(x()));
            }
            b(iX2);
            return;
        }
        int i9 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() throws n1 {
        if (u()) {
            return Integer.MAX_VALUE;
        }
        int iX = x();
        this.f56572e = iX;
        if (iX == this.f56573f) {
            return Integer.MAX_VALUE;
        }
        return iX >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) throws m1 {
        c(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i5 = this.f56572e & 7;
            if (i5 != 0) {
                if (i5 == 2) {
                    int iX = this.f56570c + x();
                    while (this.f56570c < iX) {
                        u1Var.a(w.a(y()));
                    }
                    return;
                }
                int i7 = n1.f56624a;
                throw new m1();
            }
            do {
                c(0);
                u1Var.a(w.a(y()));
                if (u()) {
                    return;
                } else {
                    i3 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i3;
            return;
        }
        int i8 = this.f56572e & 7;
        if (i8 != 0) {
            if (i8 == 2) {
                int iX2 = this.f56570c + x();
                while (this.f56570c < iX2) {
                    list.add(Long.valueOf(w.a(y())));
                }
                return;
            }
            int i9 = n1.f56624a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Long.valueOf(w.a(y())));
            if (u()) {
                return;
            } else {
                i2 = this.f56570c;
            }
        } while (x() == this.f56572e);
        this.f56570c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i5 = this.f56572e & 7;
            if (i5 == 1) {
                do {
                    u1Var.a(t());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            if (i5 == 2) {
                int iX = x();
                e(iX);
                int i7 = this.f56570c + iX;
                while (this.f56570c < i7) {
                    u1Var.a(w());
                }
                return;
            }
            int i8 = n1.f56624a;
            throw new m1();
        }
        int i9 = this.f56572e & 7;
        if (i9 == 1) {
            do {
                list.add(Long.valueOf(t()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        if (i9 == 2) {
            int iX2 = x();
            e(iX2);
            int i10 = this.f56570c + iX2;
            while (this.f56570c < i10) {
                list.add(Long.valueOf(w()));
            }
            return;
        }
        int i11 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) throws m1 {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) throws m1 {
        int i2;
        if ((this.f56572e & 7) == 2) {
            do {
                list.add(a());
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        int i3 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i5 = this.f56572e & 7;
            if (i5 == 0) {
                do {
                    c(0);
                    u1Var.a(y());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            if (i5 == 2) {
                int iX = this.f56570c + x();
                while (this.f56570c < iX) {
                    u1Var.a(y());
                }
                b(iX);
                return;
            }
            int i7 = n1.f56624a;
            throw new m1();
        }
        int i8 = this.f56572e & 7;
        if (i8 == 0) {
            do {
                c(0);
                list.add(Long.valueOf(y()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        if (i8 == 2) {
            int iX2 = this.f56570c + x();
            while (this.f56570c < iX2) {
                list.add(Long.valueOf(y()));
            }
            b(iX2);
            return;
        }
        int i9 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) throws m1 {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) throws m1 {
        int i2;
        int i3 = this.f56572e;
        if ((i3 & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == i3);
            this.f56570c = i2;
            return;
        }
        int i5 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) throws m1 {
        c(3);
        return c(p2.f56635c.a(cls), h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) throws m1 {
        c(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i5 = this.f56572e & 7;
            if (i5 != 0) {
                if (i5 == 2) {
                    int iX = this.f56570c + x();
                    while (this.f56570c < iX) {
                        a1Var.c(w.b(x()));
                    }
                    return;
                }
                int i7 = n1.f56624a;
                throw new m1();
            }
            do {
                c(0);
                a1Var.c(w.b(x()));
                if (u()) {
                    return;
                } else {
                    i3 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i3;
            return;
        }
        int i8 = this.f56572e & 7;
        if (i8 != 0) {
            if (i8 == 2) {
                int iX2 = this.f56570c + x();
                while (this.f56570c < iX2) {
                    list.add(Integer.valueOf(w.b(x())));
                }
                return;
            }
            int i9 = n1.f56624a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Integer.valueOf(w.b(x())));
            if (u()) {
                return;
            } else {
                i2 = this.f56570c;
            }
        } while (x() == this.f56572e);
        this.f56570c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() throws n1 {
        s qVar;
        c(2);
        int iX = x();
        if (iX == 0) {
            return s.f56654b;
        }
        a(iX);
        if (this.f56568a) {
            byte[] bArr = this.f56569b;
            int i2 = this.f56570c;
            q qVar2 = s.f56654b;
            qVar = new n(bArr, i2, iX);
        } else {
            byte[] bArr2 = this.f56569b;
            int i3 = this.f56570c;
            q qVar3 = s.f56654b;
            s.a(i3, i3 + iX, bArr2.length);
            qVar = new q(s.f56655c.a(bArr2, i3, iX));
        }
        this.f56570c += iX;
        return qVar;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i5 = this.f56572e & 7;
            if (i5 == 2) {
                int iX = x();
                d(iX);
                int i7 = this.f56570c + iX;
                while (this.f56570c < i7) {
                    q0Var.a(Float.intBitsToFloat(v()));
                }
                return;
            }
            if (i5 == 5) {
                do {
                    q0Var.a(k());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            int i8 = n1.f56624a;
            throw new m1();
        }
        int i9 = this.f56572e & 7;
        if (i9 == 2) {
            int iX2 = x();
            d(iX2);
            int i10 = this.f56570c + iX2;
            while (this.f56570c < i10) {
                list.add(Float.valueOf(Float.intBitsToFloat(v())));
            }
            return;
        }
        if (i9 == 5) {
            do {
                list.add(Float.valueOf(k()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        int i11 = n1.f56624a;
        throw new m1();
    }

    public final void b(int i2) throws n1 {
        if (this.f56570c != i2) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i5 = this.f56572e & 7;
            if (i5 == 0) {
                do {
                    c(0);
                    u1Var.a(y());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            if (i5 == 2) {
                int iX = this.f56570c + x();
                while (this.f56570c < iX) {
                    u1Var.a(y());
                }
                b(iX);
                return;
            }
            int i7 = n1.f56624a;
            throw new m1();
        }
        int i8 = this.f56572e & 7;
        if (i8 == 0) {
            do {
                c(0);
                list.add(Long.valueOf(y()));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        if (i8 == 2) {
            int iX2 = this.f56570c + x();
            while (this.f56570c < iX2) {
                list.add(Long.valueOf(y()));
            }
            b(iX2);
            return;
        }
        int i9 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) throws n1 {
        int i2;
        int i3;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i5 = this.f56572e & 7;
            if (i5 != 0) {
                if (i5 == 2) {
                    int iX = this.f56570c + x();
                    while (this.f56570c < iX) {
                        a1Var.c(x());
                    }
                    return;
                }
                int i7 = n1.f56624a;
                throw new m1();
            }
            do {
                c(0);
                a1Var.c(x());
                if (u()) {
                    return;
                } else {
                    i3 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i3;
            return;
        }
        int i8 = this.f56572e & 7;
        if (i8 != 0) {
            if (i8 == 2) {
                int iX2 = this.f56570c + x();
                while (this.f56570c < iX2) {
                    list.add(Integer.valueOf(x()));
                }
                return;
            }
            int i9 = n1.f56624a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Integer.valueOf(x()));
            if (u()) {
                return;
            } else {
                i2 = this.f56570c;
            }
        } while (x() == this.f56572e);
        this.f56570c = i2;
    }

    public final void e(int i2) throws n1 {
        a(i2);
        if ((i2 & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final void c(int i2) throws m1 {
        if ((this.f56572e & 7) == i2) {
            return;
        }
        int i3 = n1.f56624a;
        throw new m1();
    }

    public final void d(int i2) throws n1 {
        a(i2);
        if ((i2 & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final void a(List list, boolean z2) throws m1 {
        int i2;
        int i3;
        if ((this.f56572e & 7) == 2) {
            if ((list instanceof q1) && !z2) {
                q1 q1Var = (q1) list;
                do {
                    q1Var.a(a());
                    if (u()) {
                        return;
                    } else {
                        i3 = this.f56570c;
                    }
                } while (x() == this.f56572e);
                this.f56570c = i3;
                return;
            }
            do {
                list.add(a(z2));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == this.f56572e);
            this.f56570c = i2;
            return;
        }
        int i5 = n1.f56624a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) throws m1 {
        int i2;
        int i3 = this.f56572e;
        if ((i3 & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (u()) {
                    return;
                } else {
                    i2 = this.f56570c;
                }
            } while (x() == i3);
            this.f56570c = i2;
            return;
        }
        int i5 = n1.f56624a;
        throw new m1();
    }

    public final void a(int i2) throws n1 {
        if (i2 < 0 || i2 > this.f56571d - this.f56570c) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
