package Hwc;

import Gs.Dsr;
import Hh.qz;
import android.content.Context;
import java.util.Set;
import ln.QJ;
import ln.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Wre implements qz {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Set f3995O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f3996n;
    private final Set nr;
    private final QJ rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3 f3997t;

    public Wre(Context context, n nVar) {
        this(context, UGc.qie(), nVar);
    }

    public Wre(Context context, UGc uGc, n nVar) {
        this(context, uGc, null, null, nVar);
    }

    @Override // Hh.qz
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public I28 get() {
        return new I28(this.f3996n, this.f3997t, this.rl, this.nr, this.f3995O).nHg(null);
    }

    public Wre(Context context, UGc uGc, Set set, Set set2, n nVar) {
        this.f3996n = context;
        QJ qjMUb = uGc.mUb();
        this.rl = qjMUb;
        CN3 cn3 = new CN3();
        this.f3997t = cn3;
        cn3.n(context.getResources(), TD.j.rl(), uGc.rl(context), uGc.Ik(), Dsr.p5(), qjMUb.t(), null, null);
        this.nr = set;
        this.f3995O = set2;
    }
}
