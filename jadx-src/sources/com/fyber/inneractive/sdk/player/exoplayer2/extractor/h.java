package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements r {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j2, int i2, int i3, int i5, byte[] bArr) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        nVar.e(nVar.f56207b + i2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i2, boolean z2) throws InterruptedException, EOFException {
        b bVar2;
        int iMin = Math.min(bVar.f54729f, i2);
        bVar.b(iMin);
        if (iMin == 0) {
            bVar2 = bVar;
            iMin = bVar2.a(b.f54723g, 0, Math.min(i2, 4096), 0, true);
        } else {
            bVar2 = bVar;
        }
        if (iMin != -1) {
            bVar2.f54726c += (long) iMin;
        }
        if (iMin != -1) {
            return iMin;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }
}
