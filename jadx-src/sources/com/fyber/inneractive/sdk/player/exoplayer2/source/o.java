package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f55936b;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        this.f55936b.f55952i.b();
    }

    public o(p pVar, int i2) {
        this.f55936b = pVar;
        this.f55935a = i2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z2;
        p pVar = this.f55936b;
        int i2 = this.f55935a;
        if (!pVar.f55942F) {
            if (pVar.f55940D == -9223372036854775807L) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f55958o.valueAt(i2)).f54780c;
                synchronized (eVar) {
                    z2 = eVar.f54743i == 0;
                }
                if (!z2) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z2) {
        p pVar2 = this.f55936b;
        int i2 = this.f55935a;
        if (pVar2.f55964u || pVar2.f55940D != -9223372036854775807L) {
            return -3;
        }
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar2.f55958o.valueAt(i2)).a(pVar, cVar, z2, pVar2.f55942F, pVar2.f55939C);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j2) {
        p pVar = this.f55936b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f55958o.valueAt(this.f55935a);
        if (pVar.f55942F && j2 > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j2);
        }
    }
}
