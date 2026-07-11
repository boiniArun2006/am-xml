package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f56520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OutputStream f56523g;

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, int i3) {
        j(14);
        e(i2, 5);
        h(i3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i2, int i3) {
        j(20);
        e(i2, 0);
        if (i3 >= 0) {
            i(i3);
        } else {
            f(i3);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(int i2, int i3) {
        j(5);
        i((i2 << 3) | i3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(int i2, int i3) {
        j(20);
        e(i2, 0);
        i(i3);
    }

    public final void e(int i2, int i3) {
        i((i2 << 3) | i3);
    }

    public final void f(long j2) {
        if (!b0.f56532c) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.f56520d;
                int i2 = this.f56522f;
                this.f56522f = i2 + 1;
                bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
            byte[] bArr2 = this.f56520d;
            int i3 = this.f56522f;
            this.f56522f = i3 + 1;
            bArr2[i3] = (byte) j2;
            return;
        }
        while ((j2 & (-128)) != 0) {
            byte[] bArr3 = this.f56520d;
            int i5 = this.f56522f;
            this.f56522f = i5 + 1;
            x3.f56720c.a((Object) bArr3, x3.f56723f + ((long) i5), (byte) ((((int) j2) & 127) | 128));
            j2 >>>= 7;
        }
        byte[] bArr4 = this.f56520d;
        int i7 = this.f56522f;
        this.f56522f = i7 + 1;
        x3.f56720c.a((Object) bArr4, x3.f56723f + ((long) i7), (byte) j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void g(int i2) {
        j(5);
        i(i2);
    }

    public final void e(long j2) {
        byte[] bArr = this.f56520d;
        int i2 = this.f56522f;
        int i3 = i2 + 1;
        this.f56522f = i3;
        bArr[i2] = (byte) (j2 & 255);
        int i5 = i2 + 2;
        this.f56522f = i5;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i7 = i2 + 3;
        this.f56522f = i7;
        bArr[i5] = (byte) ((j2 >> 16) & 255);
        int i8 = i2 + 4;
        this.f56522f = i8;
        bArr[i7] = (byte) (255 & (j2 >> 24));
        int i9 = i2 + 5;
        this.f56522f = i9;
        bArr[i8] = (byte) (((int) (j2 >> 32)) & 255);
        int i10 = i2 + 6;
        this.f56522f = i10;
        bArr[i9] = (byte) (((int) (j2 >> 40)) & 255);
        int i11 = i2 + 7;
        this.f56522f = i11;
        bArr[i10] = (byte) (((int) (j2 >> 48)) & 255);
        this.f56522f = i2 + 8;
        bArr[i11] = (byte) (((int) (j2 >> 56)) & 255);
    }

    public final void h(int i2) {
        byte[] bArr = this.f56520d;
        int i3 = this.f56522f;
        int i5 = i3 + 1;
        this.f56522f = i5;
        bArr[i3] = (byte) (i2 & 255);
        int i7 = i3 + 2;
        this.f56522f = i7;
        bArr[i5] = (byte) ((i2 >> 8) & 255);
        int i8 = i3 + 3;
        this.f56522f = i8;
        bArr[i7] = (byte) ((i2 >> 16) & 255);
        this.f56522f = i3 + 4;
        bArr[i8] = (byte) ((i2 >> 24) & 255);
    }

    public final void i(int i2) {
        if (!b0.f56532c) {
            while ((i2 & (-128)) != 0) {
                byte[] bArr = this.f56520d;
                int i3 = this.f56522f;
                this.f56522f = i3 + 1;
                bArr[i3] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            }
            byte[] bArr2 = this.f56520d;
            int i5 = this.f56522f;
            this.f56522f = i5 + 1;
            bArr2[i5] = (byte) i2;
            return;
        }
        while ((i2 & (-128)) != 0) {
            byte[] bArr3 = this.f56520d;
            int i7 = this.f56522f;
            this.f56522f = i7 + 1;
            x3.f56720c.a((Object) bArr3, x3.f56723f + ((long) i7), (byte) ((i2 & 127) | 128));
            i2 >>>= 7;
        }
        byte[] bArr4 = this.f56520d;
        int i8 = this.f56522f;
        this.f56522f = i8 + 1;
        x3.f56720c.a((Object) bArr4, x3.f56723f + ((long) i8), (byte) i2);
    }

    public final void j(int i2) {
        if (this.f56521e - this.f56522f < i2) {
            a();
        }
    }

    public a0(OutputStream outputStream, int i2) {
        if (i2 >= 0) {
            int iMax = Math.max(i2, 20);
            this.f56520d = new byte[iMax];
            this.f56521e = iMax;
            if (outputStream != null) {
                this.f56523g = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(long j2) {
        j(8);
        e(j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, long j2) {
        j(18);
        e(i2, 1);
        e(j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(long j2) {
        j(10);
        f(j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i2, long j2) {
        j(20);
        e(i2, 0);
        f(j2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, boolean z2) {
        j(11);
        e(i2, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f56520d;
        int i3 = this.f56522f;
        this.f56522f = i3 + 1;
        bArr[i3] = b2;
    }

    public final void b(s sVar) {
        int size = sVar.size();
        j(5);
        i(size);
        sVar.a(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void f(int i2) {
        if (i2 >= 0) {
            j(5);
            i(i2);
        } else {
            j(10);
            f(i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(String str, int i2) throws IOException {
        c(i2, 2);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void e(int i2) {
        j(4);
        h(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, s sVar) {
        c(i2, 2);
        b(sVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i2, s sVar) {
        c(1, 3);
        d(2, i2);
        c(3, 2);
        b(sVar);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, d2 d2Var, t2 t2Var) {
        c(i2, 2);
        int serializedSize = ((b) d2Var).getSerializedSize(t2Var);
        j(5);
        i(serializedSize);
        t2Var.a((Object) d2Var, this.f56533a);
    }

    public final void b(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iC = b0.c(length);
            int i2 = iC + length;
            int i3 = this.f56521e;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iA = d4.f56549a.a(str, bArr, 0, length);
                j(5);
                i(iA);
                b(bArr, 0, iA);
                return;
            }
            if (i2 > i3 - this.f56522f) {
                a();
            }
            int iC2 = b0.c(str.length());
            int i5 = this.f56522f;
            try {
                if (iC2 == iC) {
                    int i7 = i5 + iC2;
                    this.f56522f = i7;
                    int iA2 = d4.f56549a.a(str, this.f56520d, i7, this.f56521e - i7);
                    this.f56522f = i5;
                    i((iA2 - i5) - iC2);
                    this.f56522f = iA2;
                    return;
                }
                int iA3 = d4.a(str);
                i(iA3);
                this.f56522f = d4.f56549a.a(str, this.f56520d, this.f56522f, iA3);
            } catch (b4 e2) {
                this.f56522f = i5;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new z(e3);
            }
        } catch (b4 e4) {
            a(str, e4);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i2, d2 d2Var) {
        c(1, 3);
        d(2, i2);
        c(3, 2);
        a(d2Var);
        c(1, 4);
    }

    public final void a(d2 d2Var) {
        int serializedSize = d2Var.getSerializedSize();
        j(5);
        i(serializedSize);
        d2Var.writeTo(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(byte b2) {
        if (this.f56522f == this.f56521e) {
            a();
        }
        byte[] bArr = this.f56520d;
        int i2 = this.f56522f;
        this.f56522f = i2 + 1;
        bArr[i2] = b2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k
    public final void a(byte[] bArr, int i2, int i3) throws IOException {
        b(bArr, i2, i3);
    }

    public final void a() {
        this.f56523g.write(this.f56520d, 0, this.f56522f);
        this.f56522f = 0;
    }

    public final void b(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = this.f56521e;
        int i7 = this.f56522f;
        int i8 = i5 - i7;
        if (i8 >= i3) {
            System.arraycopy(bArr, i2, this.f56520d, i7, i3);
            this.f56522f += i3;
            return;
        }
        System.arraycopy(bArr, i2, this.f56520d, i7, i8);
        int i9 = i2 + i8;
        int i10 = i3 - i8;
        this.f56522f = this.f56521e;
        a();
        if (i10 <= this.f56521e) {
            System.arraycopy(bArr, i9, this.f56520d, 0, i10);
            this.f56522f = i10;
        } else {
            this.f56523g.write(bArr, i9, i10);
        }
    }
}
