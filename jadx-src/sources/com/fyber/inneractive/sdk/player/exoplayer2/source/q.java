package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.controller.b0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class q implements u, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f55970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f55971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k f55972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f55974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f55975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.v f55976g = new com.fyber.inneractive.sdk.player.exoplayer2.v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f55977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f55978i;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        this.f55977h = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        this.f55977h = tVar;
        tVar.a(new x(-9223372036854775807L, -9223372036854775807L, 0L, 0L, false, false), null);
    }

    public q(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.c cVar, int i2, Handler handler, b0 b0Var) {
        this.f55970a = uri;
        this.f55971b = gVar;
        this.f55972c = cVar;
        this.f55973d = i2;
        this.f55974e = handler;
        this.f55975f = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j2) {
        if (i2 == 0) {
            return new p(this.f55970a, this.f55971b.a(), this.f55972c.a(), this.f55973d, this.f55974e, this.f55975f, this, bVar);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        p pVar = (p) sVar;
        pVar.f55952i.a(new k(pVar, pVar.f55953j));
        pVar.f55957n.removeCallbacksAndMessages(null);
        pVar.f55943G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        boolean z2 = xVar.a(0, this.f55976g, false).f56245d != -9223372036854775807L;
        if (!this.f55978i || z2) {
            this.f55978i = z2;
            this.f55977h.a(xVar, null);
        }
    }
}
