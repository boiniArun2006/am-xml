package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class d0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f56086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f56087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f56088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f56089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f56090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f56091f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f56090e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f56090e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        j jVar = new j(this.f56087b, this.f56086a);
        try {
            jVar.f56102a.a(jVar.f56103b);
            jVar.f56105d = true;
            this.f56089d = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g) this.f56088c).a(this.f56087b.a(), jVar);
        } finally {
            this.f56091f = jVar.f56107f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jVar);
        }
    }

    public d0(h hVar, Uri uri, c0 c0Var) {
        this.f56087b = hVar;
        this.f56086a = new k(uri, 0L, 0L, -1L, null, 1);
        this.f56088c = c0Var;
    }
}
