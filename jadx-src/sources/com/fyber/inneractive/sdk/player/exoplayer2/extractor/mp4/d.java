package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f55188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55192i;

    public final boolean a() {
        int i2 = this.f55185b + 1;
        this.f55185b = i2;
        if (i2 == this.f55184a) {
            return false;
        }
        this.f55187d = this.f55188e ? this.f55189f.n() : this.f55189f.k();
        if (this.f55185b == this.f55191h) {
            this.f55186c = this.f55190g.m();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f55190g;
            nVar.e(nVar.f56207b + 4);
            int i3 = this.f55192i - 1;
            this.f55192i = i3;
            this.f55191h = i3 > 0 ? this.f55190g.m() - 1 : -1;
        }
        return true;
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2, boolean z2) {
        this.f55190g = nVar;
        this.f55189f = nVar2;
        this.f55188e = z2;
        nVar2.e(12);
        this.f55184a = nVar2.m();
        nVar.e(12);
        this.f55192i = nVar.m();
        if (nVar.b() == 1) {
            this.f55185b = -1;
            return;
        }
        throw new IllegalStateException("first_chunk must be 1");
    }
}
