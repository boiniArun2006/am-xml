package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f55922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f55923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f55924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f55925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.o f55926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f55927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f55929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f55930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f55931j;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f55927f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() throws Throwable {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar;
        int iA = 0;
        while (iA == 0 && !this.f55927f) {
            try {
                long j2 = this.f55926e.f55356a;
                long jA = this.f55923b.a(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(this.f55922a, j2, j2, -1L, this.f55931j.f55951h, 0));
                this.f55930i = jA;
                if (jA != -1) {
                    this.f55930i = jA + j2;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f55923b;
                bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, j2, this.f55930i);
                try {
                    n nVar = this.f55924c;
                    hVar.a();
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVarA = nVar.a(bVar);
                    if (this.f55928g) {
                        iVarA.a(j2, this.f55929h);
                        this.f55928g = false;
                    }
                    while (iA == 0 && !this.f55927f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f55925d;
                        synchronized (eVar) {
                            while (!eVar.f56179a) {
                                eVar.wait();
                            }
                        }
                        iA = iVarA.a(bVar, this.f55926e);
                        long j3 = bVar.f54726c;
                        if (j3 > 1048576 + j2) {
                            this.f55925d.a();
                            p pVar = this.f55931j;
                            pVar.f55957n.post(pVar.f55956m);
                            j2 = j3;
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else {
                        this.f55926e.f55356a = bVar.f54726c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f55923b);
                } catch (Throwable th) {
                    th = th;
                    if (iA != 1 && bVar != null) {
                        this.f55926e.f55356a = bVar.f54726c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f55923b);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = null;
            }
        }
    }

    public m(p pVar, Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar) {
        this.f55931j = pVar;
        uri.getClass();
        this.f55922a = uri;
        hVar.getClass();
        this.f55923b = hVar;
        nVar.getClass();
        this.f55924c = nVar;
        this.f55925d = eVar;
        this.f55926e = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.o();
        this.f55928g = true;
        this.f55930i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f55927f;
    }
}
