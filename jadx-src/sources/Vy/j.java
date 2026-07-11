package Vy;

import vv.C2408Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl f11406n;

    public static j n(n nVar) {
        Pl pl = (Pl) nVar;
        upM.CN3.nr(nVar, "AdSession is null");
        upM.CN3.qie(pl);
        upM.CN3.Uo(pl);
        j jVar = new j(pl);
        pl.qie().t(jVar);
        return jVar;
    }

    public void nr(C2408Ml c2408Ml) {
        upM.CN3.nr(c2408Ml, "VastProperties is null");
        upM.CN3.t(this.f11406n);
        upM.CN3.mUb(this.f11406n);
        this.f11406n.KN(c2408Ml.n());
    }

    public void rl() {
        upM.CN3.Uo(this.f11406n);
        upM.CN3.mUb(this.f11406n);
        if (!this.f11406n.ck()) {
            try {
                this.f11406n.nr();
            } catch (Exception unused) {
            }
        }
        if (this.f11406n.ck()) {
            this.f11406n.XQ();
        }
    }

    public void t() {
        upM.CN3.t(this.f11406n);
        upM.CN3.mUb(this.f11406n);
        this.f11406n.S();
    }

    private j(Pl pl) {
        this.f11406n = pl;
    }
}
