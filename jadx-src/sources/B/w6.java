package B;

import B.j;
import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 implements j.n {
    private final Ml J2;
    private Matrix KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ml f217O;
    private final Ml Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final gL.n f218n;
    private final Ml nr;
    private final j.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B.j f219t;

    class j extends Ect.w6 {
        final /* synthetic */ Ect.w6 nr;

        j(Ect.w6 w6Var) {
            this.nr = w6Var;
        }

        @Override // Ect.w6
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Float n(Ect.n nVar) {
            Float f3 = (Float) this.nr.n(nVar);
            if (f3 == null) {
                return null;
            }
            return Float.valueOf(f3.floatValue() * 2.55f);
        }
    }

    public void J2(Ect.w6 w6Var) {
        if (w6Var == null) {
            this.nr.HI(null);
        } else {
            this.nr.HI(new j(w6Var));
        }
    }

    public void O(Ect.w6 w6Var) {
        this.J2.HI(w6Var);
    }

    public void Uo(Ect.w6 w6Var) {
        this.Uo.HI(w6Var);
    }

    @Override // B.j.n
    public void n() {
        this.rl.n();
    }

    public void nr(Ect.w6 w6Var) {
        this.f217O.HI(w6Var);
    }

    public x0.Ml rl(Matrix matrix, int i2) {
        float fR = this.f217O.r() * 0.017453292f;
        float fFloatValue = ((Float) this.J2.KN()).floatValue();
        double d2 = fR;
        float fSin = ((float) Math.sin(d2)) * fFloatValue;
        float fCos = ((float) Math.cos(d2 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.Uo.KN()).floatValue();
        int iIntValue = ((Integer) this.f219t.KN()).intValue();
        x0.Ml ml = new x0.Ml(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((((Float) this.nr.KN()).floatValue() * i2) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        ml.gh(matrix);
        if (this.KN == null) {
            this.KN = new Matrix();
        }
        this.f218n.aYN.J2().invert(this.KN);
        ml.gh(this.KN);
        return ml;
    }

    public void t(Ect.w6 w6Var) {
        this.f219t.HI(w6Var);
    }

    public w6(j.n nVar, gL.n nVar2, c.aC aCVar) {
        this.rl = nVar;
        this.f218n = nVar2;
        B.j jVarN = aCVar.n().n();
        this.f219t = jVarN;
        jVarN.n(this);
        nVar2.mUb(jVarN);
        Ml mlN = aCVar.nr().n();
        this.nr = mlN;
        mlN.n(this);
        nVar2.mUb(mlN);
        Ml mlN2 = aCVar.rl().n();
        this.f217O = mlN2;
        mlN2.n(this);
        nVar2.mUb(mlN2);
        Ml mlN3 = aCVar.t().n();
        this.J2 = mlN3;
        mlN3.n(this);
        nVar2.mUb(mlN3);
        Ml mlN4 = aCVar.O().n();
        this.Uo = mlN4;
        mlN4.n(this);
        nVar2.mUb(mlN4);
    }
}
