package ef;

import B.j;
import FQq.SPz;
import QJ.C1428c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j implements j.n, C, I28 {
    private B.j HI;
    protected final gL.n J2;
    private final float[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final com.airbnb.lottie.Xo f63826O;
    private final B.j az;
    float ck;
    private final B.j gh;
    private final B.j mUb;
    private final List qie;
    private B.j ty;
    final Paint xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PathMeasure f63827n = new PathMeasure();
    private final Path rl = new Path();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Path f63828t = new Path();
    private final RectF nr = new RectF();
    private final List Uo = new ArrayList();

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f63829n;
        private final s4 rl;

        private n(s4 s4Var) {
            this.f63829n = new ArrayList();
            this.rl = s4Var;
        }
    }

    public void J2(Object obj, Ect.w6 w6Var) {
        if (obj == SPz.nr) {
            this.gh.HI(w6Var);
            return;
        }
        if (obj == SPz.f2552o) {
            this.mUb.HI(w6Var);
            return;
        }
        if (obj == SPz.s7N) {
            B.j jVar = this.ty;
            if (jVar != null) {
                this.J2.T(jVar);
            }
            if (w6Var == null) {
                this.ty = null;
                return;
            }
            B.z zVar = new B.z(w6Var);
            this.ty = zVar;
            zVar.n(this);
            this.J2.mUb(this.ty);
            return;
        }
        if (obj == SPz.mUb) {
            B.j jVar2 = this.HI;
            if (jVar2 != null) {
                jVar2.HI(w6Var);
                return;
            }
            B.z zVar2 = new B.z(w6Var);
            this.HI = zVar2;
            zVar2.n(this);
            this.J2.mUb(this.HI);
        }
    }

    @Override // B.j.n
    public void n() {
        this.f63826O.invalidateSelf();
    }

    j(com.airbnb.lottie.Xo xo, gL.n nVar, Paint.Cap cap, Paint.Join join, float f3, GO.Ml ml, GO.n nVar2, List list, GO.n nVar3) {
        H.j jVar = new H.j(1);
        this.xMQ = jVar;
        this.ck = 0.0f;
        this.f63826O = xo;
        this.J2 = nVar;
        jVar.setStyle(Paint.Style.STROKE);
        jVar.setStrokeCap(cap);
        jVar.setStrokeJoin(join);
        jVar.setStrokeMiter(f3);
        this.gh = ml.n();
        this.mUb = nVar2.n();
        if (nVar3 == null) {
            this.az = null;
        } else {
            this.az = nVar3.n();
        }
        this.qie = new ArrayList(list.size());
        this.KN = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.qie.add(((GO.n) list.get(i2)).n());
        }
        nVar.mUb(this.gh);
        nVar.mUb(this.mUb);
        for (int i3 = 0; i3 < this.qie.size(); i3++) {
            nVar.mUb((B.j) this.qie.get(i3));
        }
        B.j jVar2 = this.az;
        if (jVar2 != null) {
            nVar.mUb(jVar2);
        }
        this.gh.n(this);
        this.mUb.n(this);
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((B.j) this.qie.get(i5)).n(this);
        }
        B.j jVar3 = this.az;
        if (jVar3 != null) {
            jVar3.n(this);
        }
        if (nVar.aYN() != null) {
            B.Ml mlN = nVar.aYN().n().n();
            this.HI = mlN;
            mlN.n(this);
            nVar.mUb(this.HI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void mUb(Canvas canvas, n nVar) {
        float f3;
        float f4;
        float f5;
        if (FQq.I28.KN()) {
            FQq.I28.rl("StrokeContent#applyTrimPath");
        }
        if (nVar.rl == null) {
            if (FQq.I28.KN()) {
                FQq.I28.t("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.rl.reset();
        for (int size = nVar.f63829n.size() - 1; size >= 0; size--) {
            this.rl.addPath(((qz) nVar.f63829n.get(size)).getPath());
        }
        float fFloatValue = ((Float) nVar.rl.mUb().KN()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) nVar.rl.J2().KN()).floatValue() / 100.0f;
        float fFloatValue3 = ((Float) nVar.rl.xMQ().KN()).floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.rl, this.xMQ);
            if (FQq.I28.KN()) {
                FQq.I28.t("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f63827n.setPath(this.rl, false);
        float length = this.f63827n.getLength();
        while (this.f63827n.nextContour()) {
            length += this.f63827n.getLength();
        }
        float f6 = fFloatValue3 * length;
        float f7 = (fFloatValue * length) + f6;
        float fMin = Math.min((fFloatValue2 * length) + f6, (f7 + length) - 1.0f);
        float f8 = 0.0f;
        for (int size2 = nVar.f63829n.size() - 1; size2 >= 0; size2--) {
            this.f63828t.set(((qz) nVar.f63829n.get(size2)).getPath());
            this.f63827n.setPath(this.f63828t, false);
            float length2 = this.f63827n.getLength();
            if (fMin > length) {
                float f9 = fMin - length;
                if (f9 < f8 + length2 && f8 < f9) {
                    if (f7 > length) {
                        f5 = (f7 - length) / length2;
                    } else {
                        f5 = 0.0f;
                    }
                    x0.eO.n(this.f63828t, f5, Math.min(f9 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f63828t, this.xMQ);
                } else {
                    float f10 = f8 + length2;
                    if (f10 >= f7 && f8 <= fMin) {
                        if (f10 <= fMin && f7 < f8) {
                            canvas.drawPath(this.f63828t, this.xMQ);
                        } else {
                            if (f7 < f8) {
                                f3 = 0.0f;
                            } else {
                                f3 = (f7 - f8) / length2;
                            }
                            if (fMin > f10) {
                                f4 = 1.0f;
                            } else {
                                f4 = (fMin - f8) / length2;
                            }
                            x0.eO.n(this.f63828t, f3, f4, 0.0f);
                            canvas.drawPath(this.f63828t, this.xMQ);
                        }
                    }
                }
            }
            f8 += length2;
        }
        if (FQq.I28.KN()) {
            FQq.I28.t("StrokeContent#applyTrimPath");
        }
    }

    private void xMQ() {
        float fFloatValue;
        if (FQq.I28.KN()) {
            FQq.I28.rl("StrokeContent#applyDashPattern");
        }
        if (this.qie.isEmpty()) {
            if (FQq.I28.KN()) {
                FQq.I28.t("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < this.qie.size(); i2++) {
            this.KN[i2] = ((Float) ((B.j) this.qie.get(i2)).KN()).floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.KN;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.KN;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
        }
        B.j jVar = this.az;
        if (jVar == null) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = ((Float) jVar.KN()).floatValue();
        }
        this.xMQ.setPathEffect(new DashPathEffect(this.KN, fFloatValue));
        if (FQq.I28.KN()) {
            FQq.I28.t("StrokeContent#applyDashPattern");
        }
    }

    @Override // ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("StrokeContent#getBounds");
        }
        this.rl.reset();
        for (int i2 = 0; i2 < this.Uo.size(); i2++) {
            n nVar = (n) this.Uo.get(i2);
            for (int i3 = 0; i3 < nVar.f63829n.size(); i3++) {
                this.rl.addPath(((qz) nVar.f63829n.get(i3)).getPath(), matrix);
            }
        }
        this.rl.computeBounds(this.nr, false);
        float fR = ((B.Ml) this.mUb).r();
        RectF rectF2 = this.nr;
        float f3 = fR / 2.0f;
        rectF2.set(rectF2.left - f3, rectF2.top - f3, rectF2.right + f3, rectF2.bottom + f3);
        rectF.set(this.nr);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (FQq.I28.KN()) {
            FQq.I28.t("StrokeContent#getBounds");
        }
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        x0.o.gh(i28, i2, list, i282, this);
    }

    public void Uo(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        if (FQq.I28.KN()) {
            FQq.I28.rl("StrokeContent#draw");
        }
        if (x0.eO.KN(matrix)) {
            if (FQq.I28.KN()) {
                FQq.I28.t("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = ((Integer) this.gh.KN()).intValue() / 100.0f;
        this.xMQ.setAlpha(x0.o.t((int) (i2 * fIntValue), 0, 255));
        this.xMQ.setStrokeWidth(((B.Ml) this.mUb).r());
        if (this.xMQ.getStrokeWidth() <= 0.0f) {
            if (FQq.I28.KN()) {
                FQq.I28.t("StrokeContent#draw");
                return;
            }
            return;
        }
        xMQ();
        B.j jVar = this.ty;
        if (jVar != null) {
            this.xMQ.setColorFilter((ColorFilter) jVar.KN());
        }
        B.j jVar2 = this.HI;
        if (jVar2 != null) {
            float fFloatValue = ((Float) jVar2.KN()).floatValue();
            if (fFloatValue == 0.0f) {
                this.xMQ.setMaskFilter(null);
            } else if (fFloatValue != this.ck) {
                this.xMQ.setMaskFilter(this.J2.ViF(fFloatValue));
            }
            this.ck = fFloatValue;
        }
        if (ml != null) {
            ml.t((int) (fIntValue * 255.0f), this.xMQ);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i3 = 0; i3 < this.Uo.size(); i3++) {
            n nVar = (n) this.Uo.get(i3);
            if (nVar.rl != null) {
                mUb(canvas, nVar);
            } else {
                if (FQq.I28.KN()) {
                    FQq.I28.rl("StrokeContent#buildPath");
                }
                this.rl.reset();
                for (int size = nVar.f63829n.size() - 1; size >= 0; size--) {
                    this.rl.addPath(((qz) nVar.f63829n.get(size)).getPath());
                }
                if (FQq.I28.KN()) {
                    FQq.I28.t("StrokeContent#buildPath");
                    FQq.I28.rl("StrokeContent#drawPath");
                }
                canvas.drawPath(this.rl, this.xMQ);
                if (FQq.I28.KN()) {
                    FQq.I28.t("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (FQq.I28.KN()) {
            FQq.I28.t("StrokeContent#draw");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // ef.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void rl(List list, List list2) {
        s4 s4Var = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            w6 w6Var = (w6) list.get(size);
            if (w6Var instanceof s4) {
                s4 s4Var2 = (s4) w6Var;
                if (s4Var2.gh() == C1428c.j.INDIVIDUALLY) {
                    s4Var = s4Var2;
                }
            }
        }
        if (s4Var != null) {
            s4Var.O(this);
        }
        n nVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            w6 w6Var2 = (w6) list2.get(size2);
            if (w6Var2 instanceof s4) {
                s4 s4Var3 = (s4) w6Var2;
                if (s4Var3.gh() == C1428c.j.INDIVIDUALLY) {
                    if (nVar != null) {
                        this.Uo.add(nVar);
                    }
                    nVar = new n(s4Var3);
                    s4Var3.O(this);
                } else if (w6Var2 instanceof qz) {
                    if (nVar == null) {
                        nVar = new n(s4Var);
                    }
                    nVar.f63829n.add((qz) w6Var2);
                }
            }
        }
        if (nVar != null) {
            this.Uo.add(nVar);
        }
    }
}
