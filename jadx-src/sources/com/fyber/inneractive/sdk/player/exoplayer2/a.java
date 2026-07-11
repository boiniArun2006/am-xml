package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f54528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.v f54530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54532f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54533g;

    public abstract void a(int i2, Object obj);

    public abstract void a(long j2, long j3);

    public abstract void a(boolean z2, long j2);

    public void a(o[] oVarArr) {
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return null;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public final int a(p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z2) {
        int iA = this.f54530d.a(pVar, cVar, z2);
        if (iA == -4) {
            if (cVar.b(4)) {
                this.f54532f = true;
                return this.f54533g ? -4 : -3;
            }
            cVar.f54707d += this.f54531e;
            return iA;
        }
        if (iA == -5) {
            o oVar = pVar.f55879a;
            long j2 = oVar.f55875w;
            if (j2 != Long.MAX_VALUE) {
                pVar.f55879a = new o(oVar.f55853a, oVar.f55857e, oVar.f55858f, oVar.f55855c, oVar.f55854b, oVar.f55859g, oVar.f55862j, oVar.f55863k, oVar.f55864l, oVar.f55865m, oVar.f55866n, oVar.f55868p, oVar.f55867o, oVar.f55869q, oVar.f55870r, oVar.f55871s, oVar.f55872t, oVar.f55873u, oVar.f55874v, oVar.f55876x, oVar.f55877y, oVar.f55878z, j2 + this.f54531e, oVar.f55860h, oVar.f55861i, oVar.f55856d);
            }
        }
        return iA;
    }

    public final void c() {
        if (this.f54529c != 1) {
            throw new IllegalStateException();
        }
        this.f54529c = 0;
        this.f54530d = null;
        this.f54533g = false;
        g();
    }

    public a(int i2) {
        this.f54527a = i2;
    }
}
