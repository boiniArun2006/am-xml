package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class s implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f55634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f55635b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55636c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f55638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f55639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f55644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f55645l;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f55638e = vVar;
        this.f55634a.a(jVar, e0Var);
    }

    public s(h hVar) {
        this.f55634a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f55636c = 0;
        this.f55637d = 0;
        this.f55641h = false;
        this.f55634a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z2) {
        int i2;
        if (z2) {
            int i3 = this.f55636c;
            if (i3 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i3 == 3) {
                if (this.f55643j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f55643j + " more bytes");
                }
                this.f55634a.b();
            }
            this.f55636c = 1;
            this.f55637d = 0;
        }
        while (true) {
            int i5 = nVar.f56208c;
            int i7 = nVar.f56207b;
            int i8 = i5 - i7;
            if (i8 <= 0) {
                return;
            }
            int i9 = this.f55636c;
            if (i9 == 0) {
                nVar.e(i8 + i7);
            } else if (i9 != 1) {
                if (i9 == 2) {
                    if (a(nVar, this.f55635b.f56202a, Math.min(10, this.f55642i)) && a(nVar, (byte[]) null, this.f55642i)) {
                        this.f55635b.b(0);
                        this.f55645l = -9223372036854775807L;
                        if (this.f55639f) {
                            this.f55635b.c(4);
                            long jA = ((long) this.f55635b.a(3)) << 30;
                            this.f55635b.c(1);
                            long jA2 = jA | ((long) (this.f55635b.a(15) << 15));
                            this.f55635b.c(1);
                            long jA3 = jA2 | ((long) this.f55635b.a(15));
                            this.f55635b.c(1);
                            if (!this.f55641h && this.f55640g) {
                                this.f55635b.c(4);
                                long jA4 = ((long) this.f55635b.a(3)) << 30;
                                this.f55635b.c(1);
                                long jA5 = jA4 | ((long) (this.f55635b.a(15) << 15));
                                this.f55635b.c(1);
                                long jA6 = jA5 | ((long) this.f55635b.a(15));
                                this.f55635b.c(1);
                                this.f55638e.b(jA6);
                                this.f55641h = true;
                            }
                            this.f55645l = this.f55638e.b(jA3);
                        }
                        this.f55634a.a(this.f55644k, this.f55645l);
                        this.f55636c = 3;
                        this.f55637d = 0;
                    }
                } else if (i9 == 3) {
                    int i10 = this.f55643j;
                    int i11 = i10 == -1 ? 0 : i8 - i10;
                    if (i11 > 0) {
                        i8 -= i11;
                        nVar.d(i7 + i8);
                    }
                    this.f55634a.a(nVar);
                    int i12 = this.f55643j;
                    if (i12 != -1) {
                        int i13 = i12 - i8;
                        this.f55643j = i13;
                        if (i13 == 0) {
                            this.f55634a.b();
                            this.f55636c = 1;
                            this.f55637d = 0;
                        }
                    }
                }
            } else if (a(nVar, this.f55635b.f56202a, 9)) {
                this.f55635b.b(0);
                int iA = this.f55635b.a(24);
                if (iA != 1) {
                    Log.w("PesReader", "Unexpected start code prefix: " + iA);
                    this.f55643j = -1;
                    i2 = 0;
                } else {
                    this.f55635b.c(8);
                    int iA2 = this.f55635b.a(16);
                    this.f55635b.c(5);
                    this.f55644k = this.f55635b.b();
                    this.f55635b.c(2);
                    this.f55639f = this.f55635b.b();
                    this.f55640g = this.f55635b.b();
                    this.f55635b.c(6);
                    int iA3 = this.f55635b.a(8);
                    this.f55642i = iA3;
                    if (iA2 == 0) {
                        this.f55643j = -1;
                    } else {
                        this.f55643j = (iA2 - 3) - iA3;
                    }
                    i2 = 2;
                }
                this.f55636c = i2;
                this.f55637d = 0;
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, byte[] bArr, int i2) {
        int iMin = Math.min(nVar.f56208c - nVar.f56207b, i2 - this.f55637d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            nVar.e(nVar.f56207b + iMin);
        } else {
            nVar.a(bArr, this.f55637d, iMin);
        }
        int i3 = this.f55637d + iMin;
        this.f55637d = i3;
        return i3 == i2;
    }
}
