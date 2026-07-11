package ef;

import B.j;
import FQq.SPz;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class fuX implements I28, j.n, C {
    private B.j HI;
    private final com.airbnb.lottie.Xo Ik;
    private final Path J2;
    private final RectF KN;
    private final Paint Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    float f63821Z;
    private final B.j az;
    private B.z ck;
    private final B.j gh;
    private final QJ.CN3 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f63822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private B.j f63823o;
    private final B.j qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f63824r;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final gL.n f63825t;
    private final B.j ty;
    private final List xMQ;
    private final LongSparseArray nr = new LongSparseArray();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final LongSparseArray f63820O = new LongSparseArray();

    @Override // ef.w6
    public void rl(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            w6 w6Var = (w6) list2.get(i2);
            if (w6Var instanceof qz) {
                this.xMQ.add((qz) w6Var);
            }
        }
    }

    private int mUb() {
        int iRound = Math.round(this.az.J2() * this.f63824r);
        int iRound2 = Math.round(this.ty.J2() * this.f63824r);
        int iRound3 = Math.round(this.gh.J2() * this.f63824r);
        int i2 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    private int[] xMQ(int[] iArr) {
        B.z zVar = this.ck;
        if (zVar != null) {
            Integer[] numArr = (Integer[]) zVar.KN();
            int i2 = 0;
            if (iArr.length == numArr.length) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    @Override // ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        if (obj == SPz.nr) {
            this.qie.HI(w6Var);
            return;
        }
        if (obj == SPz.s7N) {
            B.j jVar = this.HI;
            if (jVar != null) {
                this.f63825t.T(jVar);
            }
            if (w6Var == null) {
                this.HI = null;
                return;
            }
            B.z zVar = new B.z(w6Var);
            this.HI = zVar;
            zVar.n(this);
            this.f63825t.mUb(this.HI);
            return;
        }
        if (obj != SPz.wTp) {
            if (obj == SPz.mUb) {
                B.j jVar2 = this.f63823o;
                if (jVar2 != null) {
                    jVar2.HI(w6Var);
                    return;
                }
                B.z zVar2 = new B.z(w6Var);
                this.f63823o = zVar2;
                zVar2.n(this);
                this.f63825t.mUb(this.f63823o);
                return;
            }
            return;
        }
        B.z zVar3 = this.ck;
        if (zVar3 != null) {
            this.f63825t.T(zVar3);
        }
        if (w6Var == null) {
            this.ck = null;
            return;
        }
        this.nr.rl();
        this.f63820O.rl();
        B.z zVar4 = new B.z(w6Var);
        this.ck = zVar4;
        zVar4.n(this);
        this.f63825t.mUb(this.ck);
    }

    @Override // ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        this.J2.reset();
        for (int i2 = 0; i2 < this.xMQ.size(); i2++) {
            this.J2.addPath(((qz) this.xMQ.get(i2)).getPath(), matrix);
        }
        this.J2.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // ef.I28
    public void Uo(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        if (this.rl) {
            return;
        }
        if (FQq.I28.KN()) {
            FQq.I28.rl("GradientFillContent#draw");
        }
        this.J2.reset();
        for (int i3 = 0; i3 < this.xMQ.size(); i3++) {
            this.J2.addPath(((qz) this.xMQ.get(i3)).getPath(), matrix);
        }
        this.J2.computeBounds(this.KN, false);
        Shader shaderGh = this.mUb == QJ.CN3.LINEAR ? gh() : qie();
        shaderGh.setLocalMatrix(matrix);
        this.Uo.setShader(shaderGh);
        B.j jVar = this.HI;
        if (jVar != null) {
            this.Uo.setColorFilter((ColorFilter) jVar.KN());
        }
        B.j jVar2 = this.f63823o;
        if (jVar2 != null) {
            float fFloatValue = ((Float) jVar2.KN()).floatValue();
            if (fFloatValue == 0.0f) {
                this.Uo.setMaskFilter(null);
            } else if (fFloatValue != this.f63821Z) {
                this.Uo.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f63821Z = fFloatValue;
        }
        float fIntValue = ((Integer) this.qie.KN()).intValue() / 100.0f;
        this.Uo.setAlpha(x0.o.t((int) (i2 * fIntValue), 0, 255));
        if (ml != null) {
            ml.t((int) (fIntValue * 255.0f), this.Uo);
        }
        canvas.drawPath(this.J2, this.Uo);
        if (FQq.I28.KN()) {
            FQq.I28.t("GradientFillContent#draw");
        }
    }

    @Override // ef.w6
    public String getName() {
        return this.f63822n;
    }

    @Override // B.j.n
    public void n() {
        this.Ik.invalidateSelf();
    }

    public fuX(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar, QJ.I28 i28) {
        Path path = new Path();
        this.J2 = path;
        this.Uo = new H.j(1);
        this.KN = new RectF();
        this.xMQ = new ArrayList();
        this.f63821Z = 0.0f;
        this.f63825t = nVar;
        this.f63822n = i28.J2();
        this.rl = i28.xMQ();
        this.Ik = xo;
        this.mUb = i28.O();
        path.setFillType(i28.t());
        this.f63824r = (int) (dsr.nr() / 32.0f);
        B.j jVarN = i28.nr().n();
        this.gh = jVarN;
        jVarN.n(this);
        nVar.mUb(jVarN);
        B.j jVarN2 = i28.Uo().n();
        this.qie = jVarN2;
        jVarN2.n(this);
        nVar.mUb(jVarN2);
        B.j jVarN3 = i28.KN().n();
        this.az = jVarN3;
        jVarN3.n(this);
        nVar.mUb(jVarN3);
        B.j jVarN4 = i28.rl().n();
        this.ty = jVarN4;
        jVarN4.n(this);
        nVar.mUb(jVarN4);
        if (nVar.aYN() != null) {
            B.Ml mlN = nVar.aYN().n().n();
            this.f63823o = mlN;
            mlN.n(this);
            nVar.mUb(this.f63823o);
        }
    }

    private LinearGradient gh() {
        long jMUb = mUb();
        LinearGradient linearGradient = (LinearGradient) this.nr.O(jMUb);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.az.KN();
        PointF pointF2 = (PointF) this.ty.KN();
        QJ.Ml ml = (QJ.Ml) this.gh.KN();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, xMQ(ml.nr()), ml.O(), Shader.TileMode.CLAMP);
        this.nr.gh(jMUb, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient qie() {
        long jMUb = mUb();
        RadialGradient radialGradient = (RadialGradient) this.f63820O.O(jMUb);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.az.KN();
        PointF pointF2 = (PointF) this.ty.KN();
        QJ.Ml ml = (QJ.Ml) this.gh.KN();
        int[] iArrXMQ = xMQ(ml.nr());
        float[] fArrO = ml.O();
        float f3 = pointF.x;
        float f4 = pointF.y;
        float fHypot = (float) Math.hypot(pointF2.x - f3, pointF2.y - f4);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f3, f4, fHypot, iArrXMQ, fArrO, Shader.TileMode.CLAMP);
        this.f63820O.gh(jMUb, radialGradient2);
        return radialGradient2;
    }

    @Override // ES.Wre
    public void O(ES.I28 i28, int i2, List list, ES.I28 i282) {
        x0.o.gh(i28, i2, list, i282, this);
    }
}
