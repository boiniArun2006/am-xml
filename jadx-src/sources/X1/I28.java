package X1;

import Hh.C;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class I28 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private List f11723O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f11724n;
    private Pj0.j nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f11725t;

    I28(Wre wre) {
        this.f11724n = (w6) C.Uo(wre.O());
        this.rl = wre.nr();
        this.nr = wre.J2();
        this.f11723O = wre.t();
        wre.rl();
        this.f11725t = wre.Uo();
    }

    public synchronized void n() {
        Pj0.j.M7(this.nr);
        this.nr = null;
        Pj0.j.p5(this.f11723O);
        this.f11723O = null;
    }

    public NP.j t() {
        return null;
    }

    public static Wre J2(w6 w6Var) {
        return new Wre(w6Var);
    }

    public static I28 rl(w6 w6Var) {
        return new I28(w6Var);
    }

    public String O() {
        return this.f11725t;
    }

    public w6 nr() {
        return this.f11724n;
    }

    private I28(w6 w6Var) {
        this.f11724n = (w6) C.Uo(w6Var);
        this.rl = 0;
    }
}
