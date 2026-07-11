package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class h implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w[] f55915a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j2) {
        boolean zB;
        boolean z2 = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                return z2;
            }
            zB = false;
            for (w wVar : this.f55915a) {
                if (wVar.f() == jF) {
                    zB |= wVar.b(j2);
                }
            }
            z2 |= zB;
        } while (zB);
        return z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long jMin = Long.MAX_VALUE;
        for (w wVar : this.f55915a) {
            long jF = wVar.f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    public h(w[] wVarArr) {
        this.f55915a = wVarArr;
    }
}
