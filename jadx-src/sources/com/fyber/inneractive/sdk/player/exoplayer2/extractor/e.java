package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f54746l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f54751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f54752r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54735a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f54736b = new int[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f54737c = new long[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f54740f = new long[1000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f54739e = new int[1000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f54738d = new int[1000];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[][] f54741g = new byte[1000][];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] f54742h = new com.fyber.inneractive.sdk.player.exoplayer2.o[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f54747m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f54748n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f54750p = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54749o = true;

    public final synchronized void a(long j2, int i2, long j3, int i3, byte[] bArr) {
        try {
            if (this.f54749o) {
                if ((i2 & 1) == 0) {
                    return;
                } else {
                    this.f54749o = false;
                }
            }
            if (this.f54750p) {
                throw new IllegalStateException();
            }
            b(j2);
            long[] jArr = this.f54740f;
            int i5 = this.f54746l;
            jArr[i5] = j2;
            long[] jArr2 = this.f54737c;
            jArr2[i5] = j3;
            this.f54738d[i5] = i3;
            this.f54739e[i5] = i2;
            this.f54741g[i5] = bArr;
            this.f54742h[i5] = this.f54751q;
            this.f54736b[i5] = this.f54752r;
            int i7 = this.f54743i + 1;
            this.f54743i = i7;
            int i8 = this.f54735a;
            if (i7 == i8) {
                int i9 = i8 + 1000;
                int[] iArr = new int[i9];
                long[] jArr3 = new long[i9];
                long[] jArr4 = new long[i9];
                int[] iArr2 = new int[i9];
                int[] iArr3 = new int[i9];
                byte[][] bArr2 = new byte[i9][];
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i9];
                int i10 = this.f54745k;
                int i11 = i8 - i10;
                System.arraycopy(jArr2, i10, jArr3, 0, i11);
                System.arraycopy(this.f54740f, this.f54745k, jArr4, 0, i11);
                System.arraycopy(this.f54739e, this.f54745k, iArr2, 0, i11);
                System.arraycopy(this.f54738d, this.f54745k, iArr3, 0, i11);
                System.arraycopy(this.f54741g, this.f54745k, bArr2, 0, i11);
                System.arraycopy(this.f54742h, this.f54745k, oVarArr, 0, i11);
                System.arraycopy(this.f54736b, this.f54745k, iArr, 0, i11);
                int i12 = this.f54745k;
                System.arraycopy(this.f54737c, 0, jArr3, i11, i12);
                System.arraycopy(this.f54740f, 0, jArr4, i11, i12);
                System.arraycopy(this.f54739e, 0, iArr2, i11, i12);
                System.arraycopy(this.f54738d, 0, iArr3, i11, i12);
                System.arraycopy(this.f54741g, 0, bArr2, i11, i12);
                System.arraycopy(this.f54742h, 0, oVarArr, i11, i12);
                System.arraycopy(this.f54736b, 0, iArr, i11, i12);
                this.f54737c = jArr3;
                this.f54740f = jArr4;
                this.f54739e = iArr2;
                this.f54738d = iArr3;
                this.f54741g = bArr2;
                this.f54742h = oVarArr;
                this.f54736b = iArr;
                this.f54745k = 0;
                int i13 = this.f54735a;
                this.f54746l = i13;
                this.f54743i = i13;
                this.f54735a = i9;
            } else {
                int i14 = i5 + 1;
                this.f54746l = i14;
                if (i14 == i8) {
                    this.f54746l = 0;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(long j2) {
        this.f54748n = Math.max(this.f54748n, j2);
    }

    public final synchronized boolean a(long j2) {
        try {
            if (this.f54747m >= j2) {
                return false;
            }
            int i2 = this.f54743i;
            while (i2 > 0 && this.f54740f[((this.f54745k + i2) - 1) % this.f54735a] >= j2) {
                i2--;
            }
            int i3 = this.f54744j;
            int i5 = this.f54743i;
            int i7 = (i3 + i5) - (i2 + i3);
            if (i7 < 0 || i7 > i5) {
                throw new IllegalArgumentException();
            }
            if (i7 != 0) {
                int i8 = i5 - i7;
                this.f54743i = i8;
                int i9 = this.f54746l;
                int i10 = this.f54735a;
                this.f54746l = ((i9 + i10) - i7) % i10;
                this.f54748n = Long.MIN_VALUE;
                for (int i11 = i8 - 1; i11 >= 0; i11--) {
                    int i12 = (this.f54745k + i11) % this.f54735a;
                    this.f54748n = Math.max(this.f54748n, this.f54740f[i12]);
                    if ((this.f54739e[i12] & 1) != 0) {
                        break;
                    }
                }
                long j3 = this.f54737c[this.f54746l];
            } else if (i3 != 0) {
                int i13 = this.f54746l;
                if (i13 == 0) {
                    i13 = this.f54735a;
                }
                int i14 = i13 - 1;
                long j4 = this.f54737c[i14];
                int i15 = this.f54738d[i14];
            }
            return true;
        } finally {
        }
    }
}
