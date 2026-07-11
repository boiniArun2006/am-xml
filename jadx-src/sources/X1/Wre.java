package X1;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f11726O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f11727n;
    private int nr;
    private Pj0.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f11728t;

    public Wre KN(NP.j jVar) {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I28 n() {
        try {
            return new I28(this);
        } finally {
            Pj0.j.M7(this.rl);
            this.rl = null;
            Pj0.j.p5(this.f11728t);
            this.f11728t = null;
        }
    }

    public NP.j rl() {
        return null;
    }

    public Pj0.j J2() {
        return Pj0.j.T(this.rl);
    }

    public w6 O() {
        return this.f11727n;
    }

    public String Uo() {
        return this.f11726O;
    }

    public Wre mUb(int i2) {
        this.nr = i2;
        return this;
    }

    public int nr() {
        return this.nr;
    }

    public Wre qie(String str) {
        this.f11726O = str;
        return this;
    }

    public List t() {
        return Pj0.j.U(this.f11728t);
    }

    Wre(w6 w6Var) {
        this.f11727n = w6Var;
    }

    public Wre gh(Pj0.j jVar) {
        this.rl = Pj0.j.T(jVar);
        return this;
    }

    public Wre xMQ(List list) {
        this.f11728t = Pj0.j.U(list);
        return this;
    }
}
