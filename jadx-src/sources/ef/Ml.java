package ef;

import B.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import x0.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ml implements I28, qz, j.n, ES.Wre {
    private final RectF J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Path f63797O;
    private final String Uo;
    private List gh;
    private final com.airbnb.lottie.Xo mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo.j f63798n;
    private final Matrix nr;
    private B.eO qie;
    private final RectF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final x0.Xo f63799t;
    private final List xMQ;

    public Ml(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.z zVar, FQq.Dsr dsr) {
        this(xo, nVar, zVar.t(), zVar.nr(), xMQ(xo, dsr, nVar, zVar.rl()), mUb(zVar.rl()));
    }

    static GO.Pl mUb(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            QJ.w6 w6Var = (QJ.w6) list.get(i2);
            if (w6Var instanceof GO.Pl) {
                return (GO.Pl) w6Var;
            }
        }
        return null;
    }

    private boolean ty() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.xMQ.size(); i3++) {
            if ((this.xMQ.get(i3) instanceof I28) && (i2 = i2 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List xMQ(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            w6 w6VarN = ((QJ.w6) list.get(i2)).n(xo, dsr, nVar);
            if (w6VarN != null) {
                arrayList.add(w6VarN);
            }
        }
        return arrayList;
    }

    @Override // ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        B.eO eOVar = this.qie;
        if (eOVar != null) {
            eOVar.t(obj, w6Var);
        }
    }

    @Override // ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        this.nr.set(matrix);
        B.eO eOVar = this.qie;
        if (eOVar != null) {
            this.nr.preConcat(eOVar.J2());
        }
        this.J2.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.xMQ.size() - 1; size >= 0; size--) {
            w6 w6Var = (w6) this.xMQ.get(size);
            if (w6Var instanceof I28) {
                ((I28) w6Var).KN(this.J2, this.nr, z2);
                rectF.union(this.J2);
            }
        }
    }

    @Override // ef.I28
    public void Uo(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        if (this.KN) {
            return;
        }
        this.nr.set(matrix);
        B.eO eOVar = this.qie;
        if (eOVar != null) {
            this.nr.preConcat(eOVar.J2());
            i2 = (int) (((((this.qie.KN() == null ? 100 : ((Integer) this.qie.KN().KN()).intValue()) / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        boolean z2 = (this.mUb.Nxk() && ty() && i2 != 255) || (ml != null && this.mUb.Y() && ty());
        int i3 = z2 ? 255 : i2;
        if (z2) {
            this.rl.set(0.0f, 0.0f, 0.0f, 0.0f);
            KN(this.rl, matrix, true);
            Xo.j jVar = this.f63798n;
            jVar.f75160n = i2;
            if (ml != null) {
                ml.rl(jVar);
                ml = null;
            } else {
                jVar.nr = null;
            }
            canvas = this.f63799t.xMQ(canvas, this.rl, this.f63798n);
        } else if (ml != null) {
            x0.Ml ml2 = new x0.Ml(ml);
            ml2.xMQ(i3);
            ml = ml2;
        }
        for (int size = this.xMQ.size() - 1; size >= 0; size--) {
            Object obj = this.xMQ.get(size);
            if (obj instanceof I28) {
                ((I28) obj).Uo(canvas, this.nr, i3, ml);
            }
        }
        if (z2) {
            this.f63799t.O();
        }
    }

    Matrix az() {
        B.eO eOVar = this.qie;
        if (eOVar != null) {
            return eOVar.J2();
        }
        this.nr.reset();
        return this.nr;
    }

    @Override // ef.w6
    public String getName() {
        return this.Uo;
    }

    @Override // ef.qz
    public Path getPath() {
        this.nr.reset();
        B.eO eOVar = this.qie;
        if (eOVar != null) {
            this.nr.set(eOVar.J2());
        }
        this.f63797O.reset();
        if (this.KN) {
            return this.f63797O;
        }
        for (int size = this.xMQ.size() - 1; size >= 0; size--) {
            w6 w6Var = (w6) this.xMQ.get(size);
            if (w6Var instanceof qz) {
                this.f63797O.addPath(((qz) w6Var).getPath(), this.nr);
            }
        }
        return this.f63797O;
    }

    public List gh() {
        return this.xMQ;
    }

    @Override // B.j.n
    public void n() {
        this.mUb.invalidateSelf();
    }

    List qie() {
        if (this.gh == null) {
            this.gh = new ArrayList();
            for (int i2 = 0; i2 < this.xMQ.size(); i2++) {
                w6 w6Var = (w6) this.xMQ.get(i2);
                if (w6Var instanceof qz) {
                    this.gh.add((qz) w6Var);
                }
            }
        }
        return this.gh;
    }

    @Override // ef.w6
    public void rl(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.xMQ.size());
        arrayList.addAll(list);
        for (int size = this.xMQ.size() - 1; size >= 0; size--) {
            w6 w6Var = (w6) this.xMQ.get(size);
            w6Var.rl(arrayList, this.xMQ.subList(0, size));
            arrayList.add(w6Var);
        }
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        if (i28.Uo(getName(), i2) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                i282 = i282.n(getName());
                if (i28.t(getName(), i2)) {
                    list.add(i282.xMQ(this));
                }
            }
            if (i28.KN(getName(), i2)) {
                int iO = i2 + i28.O(getName(), i2);
                for (int i3 = 0; i3 < this.xMQ.size(); i3++) {
                    w6 w6Var = (w6) this.xMQ.get(i3);
                    if (w6Var instanceof ES.Wre) {
                        ((ES.Wre) w6Var).O(i28, iO, list, i282);
                    }
                }
            }
        }
    }

    Ml(com.airbnb.lottie.Xo xo, gL.n nVar, String str, boolean z2, List list, GO.Pl pl) {
        this.f63798n = new Xo.j();
        this.rl = new RectF();
        this.f63799t = new x0.Xo();
        this.nr = new Matrix();
        this.f63797O = new Path();
        this.J2 = new RectF();
        this.Uo = str;
        this.mUb = xo;
        this.KN = z2;
        this.xMQ = list;
        if (pl != null) {
            B.eO eOVarRl = pl.rl();
            this.qie = eOVarRl;
            eOVarRl.n(nVar);
            this.qie.rl(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            w6 w6Var = (w6) list.get(size);
            if (w6Var instanceof aC) {
                arrayList.add((aC) w6Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((aC) arrayList.get(size2)).xMQ(list.listIterator(list.size()));
        }
    }
}
