package a88;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f12725n;

    public static j n(n nVar) {
        Pl pl = (Pl) nVar;
        K7m.CN3.nr(nVar, "AdSession is null");
        K7m.CN3.qie(pl);
        K7m.CN3.Uo(pl);
        j jVar = new j(pl);
        pl.ty().nr(jVar);
        return jVar;
    }

    public void nr(VI.Ml ml) {
        K7m.CN3.nr(ml, "VastProperties is null");
        K7m.CN3.t(this.f12725n);
        K7m.CN3.mUb(this.f12725n);
        this.f12725n.mUb(ml.n());
    }

    public void rl() {
        K7m.CN3.Uo(this.f12725n);
        K7m.CN3.mUb(this.f12725n);
        if (!this.f12725n.r()) {
            try {
                this.f12725n.J2();
            } catch (Exception unused) {
            }
        }
        if (this.f12725n.r()) {
            this.f12725n.WPU();
        }
    }

    public void t() {
        K7m.CN3.t(this.f12725n);
        K7m.CN3.mUb(this.f12725n);
        this.f12725n.aYN();
    }

    private j(Pl pl) {
        this.f12725n = pl;
    }
}
