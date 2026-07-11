package ef;

import B.j;
import FQq.SPz;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CN3 implements I28, j.n, C {
    private final List J2;
    private final B.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f63789O;
    private final B.j Uo;
    private B.j gh;
    private final com.airbnb.lottie.Xo mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f63790n;
    private final String nr;
    float qie;
    private final Paint rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final gL.n f63791t;
    private B.j xMQ;

    @Override // ef.w6
    public void rl(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            w6 w6Var = (w6) list2.get(i2);
            if (w6Var instanceof qz) {
                this.J2.add((qz) w6Var);
            }
        }
    }

    @Override // ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        if (obj == SPz.f2551n) {
            this.Uo.HI(w6Var);
            return;
        }
        if (obj == SPz.nr) {
            this.KN.HI(w6Var);
            return;
        }
        if (obj == SPz.s7N) {
            B.j jVar = this.xMQ;
            if (jVar != null) {
                this.f63791t.T(jVar);
            }
            if (w6Var == null) {
                this.xMQ = null;
                return;
            }
            B.z zVar = new B.z(w6Var);
            this.xMQ = zVar;
            zVar.n(this);
            this.f63791t.mUb(this.xMQ);
            return;
        }
        if (obj == SPz.mUb) {
            B.j jVar2 = this.gh;
            if (jVar2 != null) {
                jVar2.HI(w6Var);
                return;
            }
            B.z zVar2 = new B.z(w6Var);
            this.gh = zVar2;
            zVar2.n(this);
            this.f63791t.mUb(this.gh);
        }
    }

    @Override // ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        this.f63790n.reset();
        for (int i2 = 0; i2 < this.J2.size(); i2++) {
            this.f63790n.addPath(((qz) this.J2.get(i2)).getPath(), matrix);
        }
        this.f63790n.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // ef.I28
    public void Uo(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        if (this.f63789O) {
            return;
        }
        if (FQq.I28.KN()) {
            FQq.I28.rl("FillContent#draw");
        }
        float fIntValue = ((Integer) this.KN.KN()).intValue() / 100.0f;
        this.rl.setColor((x0.o.t((int) (i2 * fIntValue), 0, 255) << 24) | (((B.n) this.Uo).r() & 16777215));
        B.j jVar = this.xMQ;
        if (jVar != null) {
            this.rl.setColorFilter((ColorFilter) jVar.KN());
        }
        B.j jVar2 = this.gh;
        if (jVar2 != null) {
            float fFloatValue = ((Float) jVar2.KN()).floatValue();
            if (fFloatValue == 0.0f) {
                this.rl.setMaskFilter(null);
            } else if (fFloatValue != this.qie) {
                this.rl.setMaskFilter(this.f63791t.ViF(fFloatValue));
            }
            this.qie = fFloatValue;
        }
        if (ml != null) {
            ml.t((int) (fIntValue * 255.0f), this.rl);
        } else {
            this.rl.clearShadowLayer();
        }
        this.f63790n.reset();
        for (int i3 = 0; i3 < this.J2.size(); i3++) {
            this.f63790n.addPath(((qz) this.J2.get(i3)).getPath(), matrix);
        }
        canvas.drawPath(this.f63790n, this.rl);
        if (FQq.I28.KN()) {
            FQq.I28.t("FillContent#draw");
        }
    }

    @Override // ef.w6
    public String getName() {
        return this.nr;
    }

    @Override // B.j.n
    public void n() {
        this.mUb.invalidateSelf();
    }

    public CN3(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.eO eOVar) {
        Path path = new Path();
        this.f63790n = path;
        this.rl = new H.j(1);
        this.J2 = new ArrayList();
        this.f63791t = nVar;
        this.nr = eOVar.nr();
        this.f63789O = eOVar.J2();
        this.mUb = xo;
        if (nVar.aYN() != null) {
            B.Ml mlN = nVar.aYN().n().n();
            this.gh = mlN;
            mlN.n(this);
            nVar.mUb(this.gh);
        }
        if (eOVar.rl() != null && eOVar.O() != null) {
            path.setFillType(eOVar.t());
            B.j jVarN = eOVar.rl().n();
            this.Uo = jVarN;
            jVarN.n(this);
            nVar.mUb(jVarN);
            B.j jVarN2 = eOVar.O().n();
            this.KN = jVarN2;
            jVarN2.n(this);
            nVar.mUb(jVarN2);
            return;
        }
        this.Uo = null;
        this.KN = null;
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        x0.o.gh(i28, i2, list, i282, this);
    }
}
