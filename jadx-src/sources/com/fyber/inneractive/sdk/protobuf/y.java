package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f56726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56728f;

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, int i3) throws z {
        c(i2, 5);
        e(i3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i2, int i3) throws z {
        c(i2, 0);
        f(i3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(int i2, int i3) throws z {
        g((i2 << 3) | i3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(long j2) throws z {
        if (!b0.f56532c || this.f56727e - this.f56728f < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f56726d;
                    int i2 = this.f56728f;
                    this.f56728f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56728f), Integer.valueOf(this.f56727e), 1), e2);
                }
            }
            byte[] bArr2 = this.f56726d;
            int i3 = this.f56728f;
            this.f56728f = i3 + 1;
            bArr2[i3] = (byte) j2;
            return;
        }
        while ((j2 & (-128)) != 0) {
            byte[] bArr3 = this.f56726d;
            int i5 = this.f56728f;
            this.f56728f = i5 + 1;
            x3.f56720c.a((Object) bArr3, x3.f56723f + ((long) i5), (byte) ((((int) j2) & 127) | 128));
            j2 >>>= 7;
        }
        byte[] bArr4 = this.f56726d;
        int i7 = this.f56728f;
        this.f56728f = i7 + 1;
        x3.f56720c.a((Object) bArr4, x3.f56723f + ((long) i7), (byte) j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(long j2) throws z {
        try {
            byte[] bArr = this.f56726d;
            int i2 = this.f56728f;
            int i3 = i2 + 1;
            this.f56728f = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i5 = i2 + 2;
            this.f56728f = i5;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i7 = i2 + 3;
            this.f56728f = i7;
            bArr[i5] = (byte) (((int) (j2 >> 16)) & 255);
            int i8 = i2 + 4;
            this.f56728f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 24)) & 255);
            int i9 = i2 + 5;
            this.f56728f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 32)) & 255);
            int i10 = i2 + 6;
            this.f56728f = i10;
            bArr[i9] = (byte) (((int) (j2 >> 40)) & 255);
            int i11 = i2 + 7;
            this.f56728f = i11;
            bArr[i10] = (byte) (((int) (j2 >> 48)) & 255);
            this.f56728f = i2 + 8;
            bArr[i11] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56728f), Integer.valueOf(this.f56727e), 1), e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void e(int i2) throws z {
        try {
            byte[] bArr = this.f56726d;
            int i3 = this.f56728f;
            int i5 = i3 + 1;
            this.f56728f = i5;
            bArr[i3] = (byte) (i2 & 255);
            int i7 = i3 + 2;
            this.f56728f = i7;
            bArr[i5] = (byte) ((i2 >> 8) & 255);
            int i8 = i3 + 3;
            this.f56728f = i8;
            bArr[i7] = (byte) ((i2 >> 16) & 255);
            this.f56728f = i3 + 4;
            bArr[i8] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56728f), Integer.valueOf(this.f56727e), 1), e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void f(int i2) throws z {
        if (i2 >= 0) {
            g(i2);
        } else {
            d(i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void g(int i2) throws z {
        if (b0.f56532c && !d.a()) {
            int i3 = this.f56727e;
            int i5 = this.f56728f;
            if (i3 - i5 >= 5) {
                if ((i2 & (-128)) == 0) {
                    byte[] bArr = this.f56726d;
                    this.f56728f = i5 + 1;
                    x3.f56720c.a((Object) bArr, x3.f56723f + ((long) i5), (byte) i2);
                    return;
                }
                byte[] bArr2 = this.f56726d;
                this.f56728f = i5 + 1;
                w3 w3Var = x3.f56720c;
                long j2 = x3.f56723f;
                w3Var.a((Object) bArr2, ((long) i5) + j2, (byte) (i2 | 128));
                int i7 = i2 >>> 7;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr3 = this.f56726d;
                    int i8 = this.f56728f;
                    this.f56728f = i8 + 1;
                    w3Var.a((Object) bArr3, j2 + ((long) i8), (byte) i7);
                    return;
                }
                byte[] bArr4 = this.f56726d;
                int i9 = this.f56728f;
                this.f56728f = i9 + 1;
                w3Var.a((Object) bArr4, ((long) i9) + j2, (byte) (i7 | 128));
                int i10 = i2 >>> 14;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr5 = this.f56726d;
                    int i11 = this.f56728f;
                    this.f56728f = i11 + 1;
                    w3Var.a((Object) bArr5, j2 + ((long) i11), (byte) i10);
                    return;
                }
                byte[] bArr6 = this.f56726d;
                int i12 = this.f56728f;
                this.f56728f = i12 + 1;
                w3Var.a((Object) bArr6, ((long) i12) + j2, (byte) (i10 | 128));
                int i13 = i2 >>> 21;
                if ((i13 & (-128)) == 0) {
                    byte[] bArr7 = this.f56726d;
                    int i14 = this.f56728f;
                    this.f56728f = i14 + 1;
                    w3Var.a((Object) bArr7, j2 + ((long) i14), (byte) i13);
                    return;
                }
                byte[] bArr8 = this.f56726d;
                int i15 = this.f56728f;
                this.f56728f = i15 + 1;
                w3Var.a((Object) bArr8, ((long) i15) + j2, (byte) (i13 | 128));
                byte[] bArr9 = this.f56726d;
                int i16 = this.f56728f;
                this.f56728f = i16 + 1;
                w3Var.a((Object) bArr9, j2 + ((long) i16), (byte) (i2 >>> 28));
                return;
            }
        }
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr10 = this.f56726d;
                int i17 = this.f56728f;
                this.f56728f = i17 + 1;
                bArr10[i17] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56728f), Integer.valueOf(this.f56727e), 1), e2);
            }
        }
        byte[] bArr11 = this.f56726d;
        int i18 = this.f56728f;
        this.f56728f = i18 + 1;
        bArr11[i18] = (byte) i2;
    }

    public y(int i2, byte[] bArr) {
        if (((bArr.length - i2) | i2) >= 0) {
            this.f56726d = bArr;
            this.f56728f = 0;
            this.f56727e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, long j2) throws z {
        c(i2, 1);
        c(j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i2, long j2) throws z {
        c(i2, 0);
        d(j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, boolean z2) throws z {
        c(i2, 0);
        a(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i2, s sVar) throws z {
        c(1, 3);
        c(2, 0);
        g(i2);
        a(3, sVar);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(String str, int i2) throws z {
        c(i2, 2);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, s sVar) throws z {
        c(i2, 2);
        g(sVar.size());
        sVar.a(this);
    }

    public final void b(byte[] bArr, int i2, int i3) throws z {
        try {
            System.arraycopy(bArr, i2, this.f56726d, this.f56728f, i3);
            this.f56728f += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56728f), Integer.valueOf(this.f56727e), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(int i2, int i3) throws z {
        c(i2, 0);
        g(i3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, d2 d2Var, t2 t2Var) throws z {
        c(i2, 2);
        g(((b) d2Var).getSerializedSize(t2Var));
        t2Var.a((Object) d2Var, this.f56533a);
    }

    public final void b(String str) throws z {
        int i2 = this.f56728f;
        try {
            int iC = b0.c(str.length() * 3);
            int iC2 = b0.c(str.length());
            if (iC2 == iC) {
                int i3 = i2 + iC2;
                this.f56728f = i3;
                int iA = d4.f56549a.a(str, this.f56726d, i3, this.f56727e - i3);
                this.f56728f = i2;
                g((iA - i2) - iC2);
                this.f56728f = iA;
                return;
            }
            g(d4.a(str));
            byte[] bArr = this.f56726d;
            int i5 = this.f56728f;
            this.f56728f = d4.f56549a.a(str, bArr, i5, this.f56727e - i5);
        } catch (b4 e2) {
            this.f56728f = i2;
            a(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new z(e3);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, d2 d2Var) throws z {
        c(1, 3);
        c(2, 0);
        g(i2);
        c(3, 2);
        g(d2Var.getSerializedSize());
        d2Var.writeTo(this);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(byte b2) throws z {
        try {
            byte[] bArr = this.f56726d;
            int i2 = this.f56728f;
            this.f56728f = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56728f), Integer.valueOf(this.f56727e), 1), e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k
    public final void a(byte[] bArr, int i2, int i3) throws z {
        b(bArr, i2, i3);
    }

    public final int a() {
        return this.f56727e - this.f56728f;
    }
}
