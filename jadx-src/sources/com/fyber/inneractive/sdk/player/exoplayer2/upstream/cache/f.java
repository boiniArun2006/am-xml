package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.t;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f56046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f56047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f56048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f56049d;

    public f(l lVar, o oVar) {
        t tVar = new t();
        d dVar = new d(lVar);
        this.f56046a = lVar;
        this.f56047b = oVar;
        this.f56048c = tVar;
        this.f56049d = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        l lVar = this.f56046a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA = this.f56047b.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA2 = this.f56048c.a();
        d dVar = this.f56049d;
        return new e(lVar, hVarA, hVarA2, dVar != null ? new c(dVar.f56028a) : null);
    }
}
