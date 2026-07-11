package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f55440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f55443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55445f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f55448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f55449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f55450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f55451l;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f55445f = 0;
        this.f55446g = 0;
        this.f55447h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public b(String str) {
        byte[] bArr = new byte[8];
        this.f55440a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr);
        this.f55441b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        this.f55442c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f55443d = e0Var.f55500e;
        e0Var.b();
        this.f55444e = jVar.a(e0Var.f55499d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        this.f55451l = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iA;
        int i2;
        String str;
        int iA2;
        int i3;
        while (true) {
            int i5 = nVar.f56208c - nVar.f56207b;
            if (i5 <= 0) {
                return;
            }
            int i7 = this.f55445f;
            if (i7 == 0) {
                while (true) {
                    if (nVar.f56208c - nVar.f56207b <= 0) {
                        break;
                    }
                    if (!this.f55447h) {
                        this.f55447h = nVar.j() == 11;
                    } else {
                        int iJ = nVar.j();
                        if (iJ == 119) {
                            this.f55447h = false;
                            this.f55445f = 1;
                            byte[] bArr = this.f55441b.f56206a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f55446g = 2;
                            break;
                        }
                        this.f55447h = iJ == 11;
                    }
                }
            } else if (i7 == 1) {
                byte[] bArr2 = this.f55441b.f56206a;
                int iMin = Math.min(i5, 8 - this.f55446g);
                nVar.a(bArr2, this.f55446g, iMin);
                int i8 = this.f55446g + iMin;
                this.f55446g = i8;
                if (i8 == 8) {
                    this.f55440a.b(0);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f55440a;
                    int i9 = (mVar.f56203b * 8) + mVar.f56204c;
                    mVar.c(40);
                    Object[] objArr = mVar.a(5) == 16;
                    mVar.b(i9);
                    int i10 = 6;
                    if (objArr != false) {
                        mVar.c(21);
                        iA2 = (mVar.a(11) + 1) * 2;
                        int iA3 = mVar.a(2);
                        if (iA3 == 3) {
                            i2 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54543c[mVar.a(2)];
                        } else {
                            i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54541a[mVar.a(2)];
                            i2 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54542b[iA3];
                        }
                        i3 = i10 * 256;
                        iA = mVar.a(3);
                        str = "audio/eac3";
                    } else {
                        mVar.c(32);
                        int iA4 = mVar.a(2);
                        int iA5 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a(iA4, mVar.a(6));
                        mVar.c(8);
                        iA = mVar.a(3);
                        if ((iA & 1) != 0 && iA != 1) {
                            mVar.c(2);
                        }
                        if ((iA & 4) != 0) {
                            mVar.c(2);
                        }
                        if (iA == 2) {
                            mVar.c(2);
                        }
                        i2 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54542b[iA4];
                        str = "audio/ac3";
                        iA2 = iA5;
                        i3 = 1536;
                    }
                    int i11 = i2;
                    String str2 = str;
                    int i12 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54544d[iA] + (mVar.b() ? 1 : 0);
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f55449j;
                    if (oVar == null || i12 != oVar.f55870r || i11 != oVar.f55871s || str2 != oVar.f55858f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f55443d, str2, -1, -1, i12, i11, null, null, this.f55442c);
                        this.f55449j = oVarA;
                        this.f55444e.a(oVarA);
                    }
                    this.f55450k = iA2;
                    this.f55448i = (((long) i3) * 1000000) / ((long) this.f55449j.f55871s);
                    this.f55441b.e(0);
                    this.f55444e.a(8, this.f55441b);
                    this.f55445f = 2;
                }
            } else if (i7 == 2) {
                int iMin2 = Math.min(i5, this.f55450k - this.f55446g);
                this.f55444e.a(iMin2, nVar);
                int i13 = this.f55446g + iMin2;
                this.f55446g = i13;
                int i14 = this.f55450k;
                if (i13 == i14) {
                    this.f55444e.a(this.f55451l, 1, i14, 0, null);
                    this.f55451l += this.f55448i;
                    this.f55445f = 0;
                }
            }
        }
    }
}
