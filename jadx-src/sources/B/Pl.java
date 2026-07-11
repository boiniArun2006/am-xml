package B;

import B.j;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Pl extends j {
    protected Ect.w6 az;
    private final j gh;
    private final PointF mUb;
    private final j qie;
    protected Ect.w6 ty;
    private final PointF xMQ;

    @Override // B.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF KN() {
        return xMQ(null, 0.0f);
    }

    public Pl(j jVar, j jVar2) {
        super(Collections.EMPTY_LIST);
        this.xMQ = new PointF();
        this.mUb = new PointF();
        this.gh = jVar;
        this.qie = jVar2;
        ty(J2());
    }

    public void XQ(Ect.w6 w6Var) {
        Ect.w6 w6Var2 = this.ty;
        if (w6Var2 != null) {
            w6Var2.t(null);
        }
        this.ty = w6Var;
        if (w6Var != null) {
            w6Var.t(this);
        }
    }

    public void Z(Ect.w6 w6Var) {
        Ect.w6 w6Var2 = this.az;
        if (w6Var2 != null) {
            w6Var2.t(null);
        }
        this.az = w6Var;
        if (w6Var != null) {
            w6Var.t(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // B.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public PointF xMQ(Ect.j jVar, float f3) {
        Float f4;
        Ect.j jVarRl;
        Ect.j jVarRl2;
        Float f5 = null;
        if (this.az == null || (jVarRl2 = this.gh.rl()) == null) {
            f4 = null;
        } else {
            Float f6 = jVarRl2.KN;
            Ect.w6 w6Var = this.az;
            float f7 = jVarRl2.Uo;
            f4 = (Float) w6Var.rl(f7, f6 == null ? f7 : f6.floatValue(), (Float) jVarRl2.rl, (Float) jVarRl2.f2329t, this.gh.nr(), this.gh.O(), this.gh.J2());
        }
        if (this.ty != null && (jVarRl = this.qie.rl()) != null) {
            Float f8 = jVarRl.KN;
            Ect.w6 w6Var2 = this.ty;
            float f9 = jVarRl.Uo;
            f5 = (Float) w6Var2.rl(f9, f8 == null ? f9 : f8.floatValue(), (Float) jVarRl.rl, (Float) jVarRl.f2329t, this.qie.nr(), this.qie.O(), this.qie.J2());
        }
        if (f4 == null) {
            this.mUb.set(this.xMQ.x, 0.0f);
        } else {
            this.mUb.set(f4.floatValue(), 0.0f);
        }
        if (f5 == null) {
            PointF pointF = this.mUb;
            pointF.set(pointF.x, this.xMQ.y);
        } else {
            PointF pointF2 = this.mUb;
            pointF2.set(pointF2.x, f5.floatValue());
        }
        return this.mUb;
    }

    @Override // B.j
    public void ty(float f3) {
        this.gh.ty(f3);
        this.qie.ty(f3);
        this.xMQ.set(((Float) this.gh.KN()).floatValue(), ((Float) this.qie.KN()).floatValue());
        for (int i2 = 0; i2 < this.f212n.size(); i2++) {
            ((j.n) this.f212n.get(i2)).n();
        }
    }
}
