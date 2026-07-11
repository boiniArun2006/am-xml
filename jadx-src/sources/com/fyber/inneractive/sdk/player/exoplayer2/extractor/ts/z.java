package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class z implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f55671a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[4]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f55672b;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }

    public z(b0 b0Var) {
        this.f55672b = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (nVar.j() != 0) {
            return;
        }
        nVar.e(nVar.f56207b + 7);
        int i2 = (nVar.f56208c - nVar.f56207b) / 4;
        for (int i3 = 0; i3 < i2; i3++) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f55671a;
            nVar.a(mVar.f56202a, 0, 4);
            mVar.b(0);
            int iA = this.f55671a.a(16);
            this.f55671a.c(3);
            if (iA == 0) {
                this.f55671a.c(13);
            } else {
                int iA2 = this.f55671a.a(13);
                b0 b0Var = this.f55672b;
                b0Var.f55460f.put(iA2, new w(new a0(b0Var, iA2)));
                this.f55672b.f55463i++;
            }
        }
        b0 b0Var2 = this.f55672b;
        if (b0Var2.f55455a != 2) {
            b0Var2.f55460f.remove(0);
        }
    }
}
