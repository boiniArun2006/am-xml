package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class q implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f55618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f55620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55622f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f55625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f55626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f55627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f55628l;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f55622f = 0;
        this.f55623g = 0;
        this.f55625i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    public q(String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
        this.f55617a = nVar;
        nVar.f56206a[0] = -1;
        this.f55618b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();
        this.f55619c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f55620d = e0Var.f55500e;
        e0Var.b();
        this.f55621e = jVar.a(e0Var.f55499d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z2, long j2) {
        this.f55628l = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i2 = nVar.f56208c;
            int i3 = nVar.f56207b;
            int i5 = i2 - i3;
            if (i5 <= 0) {
                return;
            }
            int i7 = this.f55622f;
            if (i7 == 0) {
                byte[] bArr = nVar.f56206a;
                while (true) {
                    if (i3 < i2) {
                        byte b2 = bArr[i3];
                        boolean z2 = (b2 & UByte.MAX_VALUE) == 255;
                        boolean z3 = this.f55625i && (b2 & 224) == 224;
                        this.f55625i = z2;
                        if (z3) {
                            nVar.e(i3 + 1);
                            this.f55625i = false;
                            this.f55617a.f56206a[1] = bArr[i3];
                            this.f55623g = 2;
                            this.f55622f = 1;
                            break;
                        }
                        i3++;
                    } else {
                        nVar.e(i2);
                        break;
                    }
                }
            } else if (i7 == 1) {
                int iMin = Math.min(i5, 4 - this.f55623g);
                nVar.a(this.f55617a.f56206a, this.f55623g, iMin);
                int i8 = this.f55623g + iMin;
                this.f55623g = i8;
                if (i8 >= 4) {
                    this.f55617a.e(0);
                    if (!com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f55617a.b(), this.f55618b)) {
                        this.f55623g = 0;
                        this.f55622f = 1;
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.f55618b;
                        this.f55627k = nVar2.f55351c;
                        if (!this.f55624h) {
                            long j2 = ((long) nVar2.f55355g) * 1000000;
                            int i9 = nVar2.f55352d;
                            this.f55626j = j2 / ((long) i9);
                            this.f55621e.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f55620d, nVar2.f55350b, -1, 4096, nVar2.f55353e, i9, null, null, this.f55619c));
                            this.f55624h = true;
                        }
                        this.f55617a.e(0);
                        this.f55621e.a(4, this.f55617a);
                        this.f55622f = 2;
                    }
                }
            } else if (i7 == 2) {
                int iMin2 = Math.min(i5, this.f55627k - this.f55623g);
                this.f55621e.a(iMin2, nVar);
                int i10 = this.f55623g + iMin2;
                this.f55623g = i10;
                int i11 = this.f55627k;
                if (i10 >= i11) {
                    this.f55621e.a(this.f55628l, 1, i11, 0, null);
                    this.f55628l += this.f55626j;
                    this.f55623g = 0;
                    this.f55622f = 0;
                }
            }
        }
    }
}
