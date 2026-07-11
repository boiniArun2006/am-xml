package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f55396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f55397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f55398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f55399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f55400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f55401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f55402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f55405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f55406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f55407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f55408m;

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar);

    public void a(boolean z2) {
        if (z2) {
            this.f55405j = new j();
            this.f55401f = 0L;
            this.f55403h = 0;
        } else {
            this.f55403h = 1;
        }
        this.f55400e = -1L;
        this.f55402g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j2, j jVar);

    public void a(long j2) {
        this.f55402g = j2;
    }
}
