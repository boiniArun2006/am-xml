package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class k implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f54868b;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        n nVar = this.f54868b;
        nVar.f54876g.b();
        f fVar = nVar.f54872c;
        com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f54815j;
        if (gVar != null) {
            throw gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f54816k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f54810e.f54974d.get(aVar);
            hVar.f54961b.b();
            IOException iOException = hVar.f54969j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z2;
        n nVar = this.f54868b;
        int i2 = this.f54867a;
        if (!nVar.f54894y) {
            if (nVar.f54893x == -9223372036854775807L) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f54879j.valueAt(i2)).f54780c;
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

    public k(n nVar, int i2) {
        this.f54868b = nVar;
        this.f54867a = i2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z2) {
        n nVar = this.f54868b;
        int i2 = this.f54867a;
        if (nVar.f54893x != -9223372036854775807L) {
            return -3;
        }
        loop0: while (nVar.f54880k.size() > 1) {
            int i3 = ((h) nVar.f54880k.getFirst()).f54829j;
            for (int i5 = 0; i5 < nVar.f54879j.size(); i5++) {
                if (nVar.f54891v[i5]) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f54879j.valueAt(i5)).f54780c;
                    if ((eVar.f54743i == 0 ? eVar.f54752r : eVar.f54736b[eVar.f54745k]) == i3) {
                        break loop0;
                    }
                }
            }
            nVar.f54880k.removeFirst();
        }
        h hVar = (h) nVar.f54880k.getFirst();
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = hVar.f55898c;
        if (!oVar.equals(nVar.f54886q)) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = nVar.f54877h;
            int i7 = nVar.f54870a;
            int i8 = hVar.f55899d;
            Object obj = hVar.f55900e;
            long j2 = hVar.f55901f;
            if (fVar.f55914b != null) {
                fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.e(fVar, i7, oVar, i8, obj, j2));
            }
        }
        nVar.f54886q = oVar;
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f54879j.valueAt(i2)).a(pVar, cVar, z2, nVar.f54894y, nVar.f54892w);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j2) {
        n nVar = this.f54868b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f54879j.valueAt(this.f54867a);
        if (nVar.f54894y && j2 > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j2);
        }
    }
}
