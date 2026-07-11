package XJa;

import Hwc.Ml;
import Jv.n;
import QVk.C;
import QVk.CN3;
import QVk.Dsr;
import QVk.I28;
import QVk.Pl;
import QVk.aC;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jl.w6;
import n.C2304j;
import n.C2305n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class j implements Dsr {
    private w6 J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private C2305n f11814O;
    private List Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f11815n;
    private C2304j nr;
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final aC f11816t = new aC(C.f8168O);

    private void KN() {
        if (this.f11814O == null) {
            this.f11814O = new C2305n(this.rl, this.f11816t, this);
        }
        if (this.nr == null) {
            this.nr = new C2304j(this.rl, this.f11816t);
        }
        if (this.J2 == null) {
            this.J2 = new w6(this.nr);
        }
    }

    public void O() {
        List list = this.Uo;
        if (list != null) {
            list.clear();
        }
    }

    public void Uo(boolean z2) {
        this.KN = z2;
        if (!z2) {
            C2305n c2305n = this.f11814O;
            if (c2305n != null) {
                this.f11815n.U(c2305n);
            }
            w6 w6Var = this.J2;
            if (w6Var != null) {
                this.f11815n.n1(w6Var);
                return;
            }
            return;
        }
        KN();
        C2305n c2305n2 = this.f11814O;
        if (c2305n2 != null) {
            this.f11815n.mUb(c2305n2);
        }
        w6 w6Var2 = this.J2;
        if (w6Var2 != null) {
            this.f11815n.k(w6Var2);
        }
    }

    public void nr() {
        htt.n nVarO = this.f11815n.O();
        if (nVarO == null || nVarO.nr() == null) {
            return;
        }
        Rect bounds = nVarO.nr().getBounds();
        this.f11816t.rV9(bounds.width());
        this.f11816t.v(bounds.height());
    }

    @Override // QVk.Dsr
    public void rl(aC aCVar, Pl pl) {
        List list;
        if (!this.KN || (list = this.Uo) == null || list.isEmpty()) {
            return;
        }
        aCVar.P5();
        Iterator it = this.Uo.iterator();
        if (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
            throw null;
        }
    }

    public void t(CN3 cn3) {
        if (cn3 == null) {
            return;
        }
        if (this.Uo == null) {
            this.Uo = new CopyOnWriteArrayList();
        }
        this.Uo.add(cn3);
    }

    public j(n nVar, Ml ml) {
        this.rl = nVar;
        this.f11815n = ml;
    }

    public void J2() {
        O();
        Uo(false);
        this.f11816t.WPU();
    }

    @Override // QVk.Dsr
    public void n(aC aCVar, I28 i28) {
        List list;
        aCVar.T(i28);
        if (this.KN && (list = this.Uo) != null && !list.isEmpty()) {
            if (i28 == I28.f8176Z) {
                nr();
            }
            aCVar.P5();
            Iterator it = this.Uo.iterator();
            if (it.hasNext()) {
                android.support.v4.media.j.n(it.next());
                throw null;
            }
        }
    }
}
