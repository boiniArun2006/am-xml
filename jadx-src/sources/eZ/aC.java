package eZ;

import eZ.fuX;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class aC implements fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f63764n;
    private final fuX nr;
    private final Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private fuX f63765t;

    protected abstract fuX.j az();

    protected abstract aC gh(Object obj, Object obj2, fuX fux, fuX fux2);

    @Override // eZ.fuX
    public boolean isEmpty() {
        return false;
    }

    private fuX Ik() {
        if (this.f63765t.isEmpty()) {
            return CN3.xMQ();
        }
        aC aCVarTy = (t().n() || t().t().n()) ? this : ty();
        return aCVarTy.gh(null, null, ((aC) aCVarTy.f63765t).Ik(), null).qie();
    }

    private aC o() {
        return (aC) this.f63765t.rl(null, null, az(), null, rl(null, null, fuX.j.RED, ((aC) this.f63765t).nr, null));
    }

    private aC qie() {
        aC aCVarR = (!this.nr.n() || this.f63765t.n()) ? this : r();
        if (aCVarR.f63765t.n() && ((aC) aCVarR.f63765t).f63765t.n()) {
            aCVarR = aCVarR.o();
        }
        return (aCVarR.f63765t.n() && aCVarR.nr.n()) ? aCVarR.xMQ() : aCVarR;
    }

    private aC r() {
        return (aC) this.nr.rl(null, null, az(), rl(null, null, fuX.j.RED, null, ((aC) this.nr).f63765t), null);
    }

    private aC xMQ() {
        fuX fux = this.f63765t;
        fuX fuxRl = fux.rl(null, null, ck(fux), null, null);
        fuX fux2 = this.nr;
        return rl(null, null, ck(this), fuxRl, fux2.rl(null, null, ck(fux2), null, null));
    }

    @Override // eZ.fuX
    public fuX J2(Object obj, Comparator comparator) {
        aC aCVarGh;
        if (comparator.compare(obj, this.f63764n) < 0) {
            aC aCVarTy = (this.f63765t.isEmpty() || this.f63765t.n() || ((aC) this.f63765t).f63765t.n()) ? this : ty();
            aCVarGh = aCVarTy.gh(null, null, aCVarTy.f63765t.J2(obj, comparator), null);
        } else {
            aC aCVarO = this.f63765t.n() ? o() : this;
            if (!aCVarO.nr.isEmpty() && !aCVarO.nr.n() && !((aC) aCVarO.nr).f63765t.n()) {
                aCVarO = aCVarO.HI();
            }
            if (comparator.compare(obj, aCVarO.f63764n) == 0) {
                if (aCVarO.nr.isEmpty()) {
                    return CN3.xMQ();
                }
                fuX fuxUo = aCVarO.nr.Uo();
                aCVarO = aCVarO.gh(fuxUo.getKey(), fuxUo.getValue(), null, ((aC) aCVarO.nr).Ik());
            }
            aCVarGh = aCVarO.gh(null, null, null, aCVarO.nr.J2(obj, comparator));
        }
        return aCVarGh.qie();
    }

    @Override // eZ.fuX
    public fuX KN() {
        return this.nr.isEmpty() ? this : this.nr.KN();
    }

    @Override // eZ.fuX
    public fuX O(Object obj, Object obj2, Comparator comparator) {
        int iCompare = comparator.compare(obj, this.f63764n);
        return (iCompare < 0 ? gh(null, null, this.f63765t.O(obj, obj2, comparator), null) : iCompare == 0 ? gh(obj, obj2, null, null) : gh(null, null, null, this.nr.O(obj, obj2, comparator))).qie();
    }

    @Override // eZ.fuX
    public fuX Uo() {
        return this.f63765t.isEmpty() ? this : this.f63765t.Uo();
    }

    void Z(fuX fux) {
        this.f63765t = fux;
    }

    @Override // eZ.fuX
    public Object getKey() {
        return this.f63764n;
    }

    @Override // eZ.fuX
    public Object getValue() {
        return this.rl;
    }

    @Override // eZ.fuX
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public aC rl(Object obj, Object obj2, fuX.j jVar, fuX fux, fuX fux2) {
        if (obj == null) {
            obj = this.f63764n;
        }
        if (obj2 == null) {
            obj2 = this.rl;
        }
        if (fux == null) {
            fux = this.f63765t;
        }
        if (fux2 == null) {
            fux2 = this.nr;
        }
        return jVar == fuX.j.RED ? new Dsr(obj, obj2, fux, fux2) : new Wre(obj, obj2, fux, fux2);
    }

    @Override // eZ.fuX
    public fuX nr() {
        return this.nr;
    }

    @Override // eZ.fuX
    public fuX t() {
        return this.f63765t;
    }

    aC(Object obj, Object obj2, fuX fux, fuX fux2) {
        this.f63764n = obj;
        this.rl = obj2;
        this.f63765t = fux == null ? CN3.xMQ() : fux;
        this.nr = fux2 == null ? CN3.xMQ() : fux2;
    }

    private aC HI() {
        aC aCVarXMQ = xMQ();
        if (aCVarXMQ.t().t().n()) {
            return aCVarXMQ.o().xMQ();
        }
        return aCVarXMQ;
    }

    private static fuX.j ck(fuX fux) {
        if (fux.n()) {
            return fuX.j.BLACK;
        }
        return fuX.j.RED;
    }

    private aC ty() {
        aC aCVarXMQ = xMQ();
        if (aCVarXMQ.nr().t().n()) {
            return aCVarXMQ.gh(null, null, null, ((aC) aCVarXMQ.nr()).o()).r().xMQ();
        }
        return aCVarXMQ;
    }
}
