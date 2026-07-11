package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class y implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f55668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55670c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f55668a = vVar;
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f55499d, 4);
        this.f55669b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f55500e, "application/x-scte35", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        long j2;
        long j3;
        long j4 = -9223372036854775807L;
        if (!this.f55670c) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = this.f55668a;
            long j5 = 0;
            if ((vVar.f56230a == Long.MAX_VALUE ? 0L : vVar.f56232c == -9223372036854775807L ? -9223372036854775807L : vVar.f56231b) == -9223372036854775807L) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f55669b;
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2 = this.f55668a;
            if (vVar2.f56230a == Long.MAX_VALUE) {
                j3 = j5;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j3, null, null, null));
                this.f55670c = true;
            } else if (vVar2.f56232c == -9223372036854775807L) {
                j3 = -9223372036854775807L;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j3, null, null, null));
                this.f55670c = true;
            } else {
                j5 = vVar2.f56231b;
                j3 = j5;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j3, null, null, null));
                this.f55670c = true;
            }
        }
        int i2 = nVar.f56208c - nVar.f56207b;
        this.f55669b.a(i2, nVar);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f55669b;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3 = this.f55668a;
        if (vVar3.f56232c != -9223372036854775807L) {
            j4 = vVar3.f56232c;
        } else {
            long j6 = vVar3.f56230a;
            if (j6 != Long.MAX_VALUE) {
                j2 = j6;
            }
            rVar2.a(j2, 1, i2, 0, null);
        }
        j2 = j4;
        rVar2.a(j2, 1, i2, 0, null);
    }
}
