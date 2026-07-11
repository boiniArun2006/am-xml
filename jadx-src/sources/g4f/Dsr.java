package g4f;

import a88.Pl;
import android.content.Context;
import android.os.Handler;
import g4f.Ml;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Dsr implements Ml.j, KlN.w6 {
    private static Dsr J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private w6 f67036O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f67037n = 0.0f;
    private KlN.Ml nr;
    private final KlN.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final KlN.n f67038t;

    @Override // KlN.w6
    public void a(float f3) {
        this.f67037n = f3;
        Iterator it = n().n().iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).ty().rl(f3);
        }
    }

    private w6 n() {
        if (this.f67036O == null) {
            this.f67036O = w6.O();
        }
        return this.f67036O;
    }

    public static Dsr nr() {
        if (J2 == null) {
            J2 = new Dsr(new KlN.I28(), new KlN.n());
        }
        return J2;
    }

    @Override // g4f.Ml.j
    public void a(boolean z2) {
        if (z2) {
            yzg.j.ck().Ik();
        } else {
            yzg.j.ck().HI();
        }
    }

    public void rl(Context context) {
        this.nr = this.rl.n(new Handler(), context, this.f67038t.n(), this);
    }

    public float t() {
        return this.f67037n;
    }

    public Dsr(KlN.I28 i28, KlN.n nVar) {
        this.rl = i28;
        this.f67038t = nVar;
    }

    public void J2() {
        yzg.j.ck().o();
        n.gh().mUb();
        this.nr.O();
    }

    public void O() {
        n.gh().rl(this);
        n.gh().xMQ();
        yzg.j.ck().Ik();
        this.nr.nr();
    }
}
