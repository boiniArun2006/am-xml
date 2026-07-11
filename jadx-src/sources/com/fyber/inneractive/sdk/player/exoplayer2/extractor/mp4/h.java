package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55204e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.f55201b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i2 = this.f55202c;
        if (i2 == 8) {
            return this.f55200a.j();
        }
        if (i2 == 16) {
            return this.f55200a.o();
        }
        int i3 = this.f55203d;
        this.f55203d = i3 + 1;
        if (i3 % 2 != 0) {
            return this.f55204e & 15;
        }
        int iJ = this.f55200a.j();
        this.f55204e = iJ;
        return (iJ & 240) >> 4;
    }

    public h(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.f55200a = nVar;
        nVar.e(12);
        this.f55202c = nVar.m() & 255;
        this.f55201b = nVar.m();
    }
}
