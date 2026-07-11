package gL;

import FQq.SPz;
import QJ.z;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.Xo;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class CN3 extends n {
    private final ef.Ml E2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private B.w6 f67456X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w6 f67457e;

    @Override // gL.n
    protected void N(ES.I28 i28, int i2, List list, ES.I28 i282) {
        this.E2.O(i28, i2, list, i282);
    }

    @Override // gL.n
    void XQ(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        B.w6 w6Var = this.f67456X;
        if (w6Var != null) {
            ml = w6Var.rl(matrix, i2);
        }
        this.E2.Uo(canvas, matrix, i2, ml);
    }

    CN3(Xo xo, I28 i28, w6 w6Var, FQq.Dsr dsr) {
        super(xo, i28);
        this.f67457e = w6Var;
        ef.Ml ml = new ef.Ml(xo, this, new z("__container", i28.HI(), false), dsr);
        this.E2 = ml;
        List list = Collections.EMPTY_LIST;
        ml.rl(list, list);
        if (nY() != null) {
            this.f67456X = new B.w6(this, this, nY());
        }
    }

    @Override // gL.n, ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        B.w6 w6Var2;
        B.w6 w6Var3;
        B.w6 w6Var4;
        B.w6 w6Var5;
        B.w6 w6Var6;
        super.J2(obj, w6Var);
        if (obj == SPz.f2544O && (w6Var6 = this.f67456X) != null) {
            w6Var6.t(w6Var);
            return;
        }
        if (obj == SPz.f2547X && (w6Var5 = this.f67456X) != null) {
            w6Var5.J2(w6Var);
            return;
        }
        if (obj == SPz.f2546T && (w6Var4 = this.f67456X) != null) {
            w6Var4.nr(w6Var);
            return;
        }
        if (obj == SPz.f2543N && (w6Var3 = this.f67456X) != null) {
            w6Var3.O(w6Var);
        } else if (obj == SPz.nHg && (w6Var2 = this.f67456X) != null) {
            w6Var2.Uo(w6Var);
        }
    }

    @Override // gL.n, ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        super.KN(rectF, matrix, z2);
        this.E2.KN(rectF, this.HI, z2);
    }

    @Override // gL.n
    public QJ.j aYN() {
        QJ.j jVarAYN = super.aYN();
        if (jVarAYN != null) {
            return jVarAYN;
        }
        return this.f67457e.aYN();
    }
}
