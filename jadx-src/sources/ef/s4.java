package ef;

import B.j;
import QJ.C1428c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class s4 implements w6, j.n {
    private final B.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final B.j f63835O;
    private final B.j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f63836n;
    private final C1428c.j nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f63837t = new ArrayList();

    @Override // B.j.n
    public void n() {
        for (int i2 = 0; i2 < this.f63837t.size(); i2++) {
            ((j.n) this.f63837t.get(i2)).n();
        }
    }

    @Override // ef.w6
    public void rl(List list, List list2) {
    }

    public B.j J2() {
        return this.J2;
    }

    void O(j.n nVar) {
        this.f63837t.add(nVar);
    }

    C1428c.j gh() {
        return this.nr;
    }

    public B.j mUb() {
        return this.f63835O;
    }

    public boolean qie() {
        return this.rl;
    }

    public B.j xMQ() {
        return this.Uo;
    }

    public s4(gL.n nVar, C1428c c1428c) {
        this.f63836n = c1428c.t();
        this.rl = c1428c.Uo();
        this.nr = c1428c.J2();
        B.Ml mlN = c1428c.O().n();
        this.f63835O = mlN;
        B.Ml mlN2 = c1428c.rl().n();
        this.J2 = mlN2;
        B.Ml mlN3 = c1428c.nr().n();
        this.Uo = mlN3;
        nVar.mUb(mlN);
        nVar.mUb(mlN2);
        nVar.mUb(mlN3);
        mlN.n(this);
        mlN2.n(this);
        mlN3.n(this);
    }
}
