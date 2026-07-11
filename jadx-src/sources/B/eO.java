package B;

import B.j;
import FQq.SPz;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class eO {
    private final boolean HI;
    private j J2;
    private j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float[] f206O;
    private j Uo;
    private j az;
    private Ml gh;
    private j mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Matrix f207n = new Matrix();
    private final Matrix nr;
    private Ml qie;
    private final Matrix rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Matrix f208t;
    private j ty;
    private j xMQ;

    private void nr() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.f206O[i2] = 0.0f;
        }
    }

    public Matrix J2() {
        PointF pointF;
        Ect.Ml ml;
        PointF pointF2;
        this.f207n.reset();
        j jVar = this.Uo;
        if (jVar != null && (pointF2 = (PointF) jVar.KN()) != null) {
            float f3 = pointF2.x;
            if (f3 != 0.0f || pointF2.y != 0.0f) {
                this.f207n.preTranslate(f3, pointF2.y);
            }
        }
        if (!this.HI) {
            j jVar2 = this.xMQ;
            if (jVar2 != null) {
                float fFloatValue = jVar2 instanceof z ? ((Float) jVar2.KN()).floatValue() : ((Ml) jVar2).r();
                if (fFloatValue != 0.0f) {
                    this.f207n.preRotate(fFloatValue);
                }
            }
        } else if (jVar != null) {
            float fJ2 = jVar.J2();
            PointF pointF3 = (PointF) jVar.KN();
            float f4 = pointF3.x;
            float f5 = pointF3.y;
            jVar.ty(1.0E-4f + fJ2);
            PointF pointF4 = (PointF) jVar.KN();
            jVar.ty(fJ2);
            this.f207n.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f5, pointF4.x - f4)));
        }
        if (this.gh != null) {
            float fCos = this.qie == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.r()) + 90.0f));
            float fSin = this.qie == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.r()));
            nr();
            float[] fArr = this.f206O;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f6 = -fSin;
            fArr[3] = f6;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.rl.setValues(fArr);
            nr();
            float[] fArr2 = this.f206O;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f208t.setValues(fArr2);
            nr();
            float[] fArr3 = this.f206O;
            fArr3[0] = fCos;
            fArr3[1] = f6;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.nr.setValues(fArr3);
            this.f208t.preConcat(this.rl);
            this.nr.preConcat(this.f208t);
            this.f207n.preConcat(this.nr);
        }
        j jVar3 = this.KN;
        if (jVar3 != null && (ml = (Ect.Ml) jVar3.KN()) != null && (ml.rl() != 1.0f || ml.t() != 1.0f)) {
            this.f207n.preScale(ml.rl(), ml.t());
        }
        j jVar4 = this.J2;
        if (jVar4 != null && (pointF = (PointF) jVar4.KN()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                this.f207n.preTranslate(-f7, -pointF.y);
            }
        }
        return this.f207n;
    }

    public j KN() {
        return this.mUb;
    }

    public j O() {
        return this.ty;
    }

    public Matrix Uo(float f3) {
        j jVar = this.Uo;
        PointF pointF = jVar == null ? null : (PointF) jVar.KN();
        j jVar2 = this.KN;
        Ect.Ml ml = jVar2 == null ? null : (Ect.Ml) jVar2.KN();
        this.f207n.reset();
        if (pointF != null) {
            this.f207n.preTranslate(pointF.x * f3, pointF.y * f3);
        }
        if (ml != null) {
            double d2 = f3;
            this.f207n.preScale((float) Math.pow(ml.rl(), d2), (float) Math.pow(ml.t(), d2));
        }
        j jVar3 = this.xMQ;
        if (jVar3 != null) {
            float fFloatValue = ((Float) jVar3.KN()).floatValue();
            j jVar4 = this.J2;
            PointF pointF2 = jVar4 != null ? (PointF) jVar4.KN() : null;
            this.f207n.preRotate(fFloatValue * f3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.f207n;
    }

    public void mUb(float f3) {
        j jVar = this.mUb;
        if (jVar != null) {
            jVar.ty(f3);
        }
        j jVar2 = this.az;
        if (jVar2 != null) {
            jVar2.ty(f3);
        }
        j jVar3 = this.ty;
        if (jVar3 != null) {
            jVar3.ty(f3);
        }
        j jVar4 = this.J2;
        if (jVar4 != null) {
            jVar4.ty(f3);
        }
        j jVar5 = this.Uo;
        if (jVar5 != null) {
            jVar5.ty(f3);
        }
        j jVar6 = this.KN;
        if (jVar6 != null) {
            jVar6.ty(f3);
        }
        j jVar7 = this.xMQ;
        if (jVar7 != null) {
            jVar7.ty(f3);
        }
        Ml ml = this.gh;
        if (ml != null) {
            ml.ty(f3);
        }
        Ml ml2 = this.qie;
        if (ml2 != null) {
            ml2.ty(f3);
        }
    }

    public void n(gL.n nVar) {
        nVar.mUb(this.mUb);
        nVar.mUb(this.az);
        nVar.mUb(this.ty);
        nVar.mUb(this.J2);
        nVar.mUb(this.Uo);
        nVar.mUb(this.KN);
        nVar.mUb(this.xMQ);
        nVar.mUb(this.gh);
        nVar.mUb(this.qie);
    }

    public void rl(j.n nVar) {
        j jVar = this.mUb;
        if (jVar != null) {
            jVar.n(nVar);
        }
        j jVar2 = this.az;
        if (jVar2 != null) {
            jVar2.n(nVar);
        }
        j jVar3 = this.ty;
        if (jVar3 != null) {
            jVar3.n(nVar);
        }
        j jVar4 = this.J2;
        if (jVar4 != null) {
            jVar4.n(nVar);
        }
        j jVar5 = this.Uo;
        if (jVar5 != null) {
            jVar5.n(nVar);
        }
        j jVar6 = this.KN;
        if (jVar6 != null) {
            jVar6.n(nVar);
        }
        j jVar7 = this.xMQ;
        if (jVar7 != null) {
            jVar7.n(nVar);
        }
        Ml ml = this.gh;
        if (ml != null) {
            ml.n(nVar);
        }
        Ml ml2 = this.qie;
        if (ml2 != null) {
            ml2.n(nVar);
        }
    }

    public boolean t(Object obj, Ect.w6 w6Var) {
        if (obj == SPz.J2) {
            j jVar = this.J2;
            if (jVar == null) {
                this.J2 = new z(w6Var, new PointF());
                return true;
            }
            jVar.HI(w6Var);
            return true;
        }
        if (obj == SPz.Uo) {
            j jVar2 = this.Uo;
            if (jVar2 == null) {
                this.Uo = new z(w6Var, new PointF());
                return true;
            }
            jVar2.HI(w6Var);
            return true;
        }
        if (obj == SPz.KN) {
            j jVar3 = this.Uo;
            if (jVar3 instanceof Pl) {
                ((Pl) jVar3).Z(w6Var);
                return true;
            }
        }
        if (obj == SPz.xMQ) {
            j jVar4 = this.Uo;
            if (jVar4 instanceof Pl) {
                ((Pl) jVar4).XQ(w6Var);
                return true;
            }
        }
        if (obj == SPz.HI) {
            j jVar5 = this.KN;
            if (jVar5 == null) {
                this.KN = new z(w6Var, new Ect.Ml());
                return true;
            }
            jVar5.HI(w6Var);
            return true;
        }
        if (obj == SPz.ck) {
            j jVar6 = this.xMQ;
            if (jVar6 == null) {
                this.xMQ = new z(w6Var, Float.valueOf(0.0f));
                return true;
            }
            jVar6.HI(w6Var);
            return true;
        }
        if (obj == SPz.f2554t) {
            j jVar7 = this.mUb;
            if (jVar7 == null) {
                this.mUb = new z(w6Var, 100);
                return true;
            }
            jVar7.HI(w6Var);
            return true;
        }
        if (obj == SPz.iF) {
            j jVar8 = this.az;
            if (jVar8 == null) {
                this.az = new z(w6Var, Float.valueOf(100.0f));
                return true;
            }
            jVar8.HI(w6Var);
            return true;
        }
        if (obj == SPz.fD) {
            j jVar9 = this.ty;
            if (jVar9 == null) {
                this.ty = new z(w6Var, Float.valueOf(100.0f));
                return true;
            }
            jVar9.HI(w6Var);
            return true;
        }
        if (obj == SPz.Ik) {
            if (this.gh == null) {
                this.gh = new Ml(Collections.singletonList(new Ect.j(Float.valueOf(0.0f))));
            }
            this.gh.HI(w6Var);
            return true;
        }
        if (obj != SPz.f2553r) {
            return false;
        }
        if (this.qie == null) {
            this.qie = new Ml(Collections.singletonList(new Ect.j(Float.valueOf(0.0f))));
        }
        this.qie.HI(w6Var);
        return true;
    }

    public j xMQ() {
        return this.az;
    }

    public eO(GO.Pl pl) {
        j jVarN;
        j jVarN2;
        j jVarN3;
        Ml mlN;
        Ml mlN2;
        Ml mlN3;
        if (pl.t() == null) {
            jVarN = null;
        } else {
            jVarN = pl.t().n();
        }
        this.J2 = jVarN;
        if (pl.J2() == null) {
            jVarN2 = null;
        } else {
            jVarN2 = pl.J2().n();
        }
        this.Uo = jVarN2;
        if (pl.KN() == null) {
            jVarN3 = null;
        } else {
            jVarN3 = pl.KN().n();
        }
        this.KN = jVarN3;
        if (pl.Uo() == null) {
            mlN = null;
        } else {
            mlN = pl.Uo().n();
        }
        this.xMQ = mlN;
        if (pl.xMQ() == null) {
            mlN2 = null;
        } else {
            mlN2 = pl.xMQ().n();
        }
        this.gh = mlN2;
        this.HI = pl.qie();
        if (this.gh != null) {
            this.rl = new Matrix();
            this.f208t = new Matrix();
            this.nr = new Matrix();
            this.f206O = new float[9];
        } else {
            this.rl = null;
            this.f208t = null;
            this.nr = null;
            this.f206O = null;
        }
        if (pl.mUb() == null) {
            mlN3 = null;
        } else {
            mlN3 = pl.mUb().n();
        }
        this.qie = mlN3;
        if (pl.O() != null) {
            this.mUb = pl.O().n();
        }
        if (pl.gh() != null) {
            this.az = pl.gh().n();
        } else {
            this.az = null;
        }
        if (pl.nr() != null) {
            this.ty = pl.nr().n();
        } else {
            this.ty = null;
        }
    }
}
