package ef;

import B.j;
import FQq.SPz;
import QJ.C1428c;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class QJ implements qz, j.n, C {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final B.qz f63805O;
    private final com.airbnb.lottie.Xo nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f63807t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f63806n = new Path();
    private final n Uo = new n();

    private void xMQ() {
        this.J2 = false;
        this.nr.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // ef.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void rl(List list, List list2) {
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            w6 w6Var = (w6) list.get(i2);
            if (w6Var instanceof s4) {
                s4 s4Var = (s4) w6Var;
                if (s4Var.gh() == C1428c.j.SIMULTANEOUSLY) {
                    this.Uo.n(s4Var);
                    s4Var.O(this);
                } else if (w6Var instanceof l3D) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    l3D l3d = (l3D) w6Var;
                    l3d.t(this);
                    arrayList.add(l3d);
                }
            }
        }
        this.f63805O.o(arrayList);
    }

    @Override // ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        if (obj == SPz.Xw) {
            this.f63805O.HI(w6Var);
        }
    }

    @Override // ef.w6
    public String getName() {
        return this.rl;
    }

    @Override // ef.qz
    public Path getPath() {
        if (this.J2 && !this.f63805O.gh()) {
            return this.f63806n;
        }
        this.f63806n.reset();
        if (this.f63807t) {
            this.J2 = true;
            return this.f63806n;
        }
        Path path = (Path) this.f63805O.KN();
        if (path == null) {
            return this.f63806n;
        }
        this.f63806n.set(path);
        this.f63806n.setFillType(Path.FillType.EVEN_ODD);
        this.Uo.rl(this.f63806n);
        this.J2 = true;
        return this.f63806n;
    }

    public QJ(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.QJ qj) {
        this.rl = qj.rl();
        this.f63807t = qj.nr();
        this.nr = xo;
        B.qz qzVarN = qj.t().n();
        this.f63805O = qzVarN;
        nVar.mUb(qzVarN);
        qzVarN.n(this);
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        x0.o.gh(i28, i2, list, i282, this);
    }

    @Override // B.j.n
    public void n() {
        xMQ();
    }
}
