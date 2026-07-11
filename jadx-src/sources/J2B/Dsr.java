package J2B;

import J2B.Ml;
import Vy.Pl;
import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Dsr implements Ml.j, pAs.w6 {
    private static Dsr J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private w6 f4417O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f4418n = 0.0f;
    private pAs.Ml nr;
    private final pAs.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final pAs.n f4419t;

    @Override // pAs.w6
    public void a(float f3) {
        this.f4418n = f3;
        Iterator it = n().n().iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).qie().rl(f3);
        }
    }

    private w6 n() {
        if (this.f4417O == null) {
            this.f4417O = w6.O();
        }
        return this.f4417O;
    }

    public static Dsr nr() {
        if (J2 == null) {
            J2 = new Dsr(new pAs.I28(), new pAs.n());
        }
        return J2;
    }

    @Override // J2B.Ml.j
    public void a(boolean z2) {
        if (z2) {
            fA.j.ck().Ik();
        } else {
            fA.j.ck().HI();
        }
    }

    public void rl(Context context) {
        this.nr = this.rl.n(new Handler(), context, this.f4419t.n(), this);
    }

    public float t() {
        return this.f4418n;
    }

    public Dsr(pAs.I28 i28, pAs.n nVar) {
        this.rl = i28;
        this.f4419t = nVar;
    }

    public void J2() {
        fA.j.ck().o();
        n.gh().mUb();
        this.nr.J2();
    }

    public void O() {
        n.gh().n(this);
        n.gh().xMQ();
        fA.j.ck().Ik();
        this.nr.nr();
    }
}
