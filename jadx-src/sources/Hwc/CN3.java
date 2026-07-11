package Hwc;

import FSZ.Q;
import Hh.qz;
import android.content.res.Resources;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class CN3 {
    private Q J2;
    private qz KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Executor f3983O;
    private Hh.Wre Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Resources f3984n;
    private ypp.j nr;
    private TD.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ypp.j f3985t;

    public void n(Resources resources, TD.j jVar, ypp.j jVar2, ypp.j jVar3, Executor executor, Q q2, Hh.Wre wre, qz qzVar) {
        this.f3984n = resources;
        this.rl = jVar;
        this.f3985t = jVar2;
        this.nr = jVar3;
        this.f3983O = executor;
        this.J2 = q2;
        this.Uo = wre;
        this.KN = qzVar;
    }

    protected Ml rl(Resources resources, TD.j jVar, ypp.j jVar2, ypp.j jVar3, Executor executor, Q q2, Hh.Wre wre) {
        return new Ml(resources, jVar, jVar2, jVar3, executor, q2, wre);
    }

    public Ml t() {
        Ml mlRl = rl(this.f3984n, this.rl, this.f3985t, this.nr, this.f3983O, this.J2, this.Uo);
        qz qzVar = this.KN;
        if (qzVar != null) {
            mlRl.Rl(((Boolean) qzVar.get()).booleanValue());
        }
        return mlRl;
    }
}
