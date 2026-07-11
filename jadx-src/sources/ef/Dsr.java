package ef;

import FQq.SPz;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Dsr extends j {
    private final String Ik;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final QJ.CN3 f63792S;
    private final B.j ViF;
    private final int WPU;
    private final RectF XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final LongSparseArray f63793Z;
    private final B.j aYN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private B.z f63794g;
    private final B.j nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LongSparseArray f63795o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f63796r;

    private int[] gh(int[] iArr) {
        B.z zVar = this.f63794g;
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

    private int qie() {
        int iRound = Math.round(this.ViF.J2() * this.WPU);
        int iRound2 = Math.round(this.nY.J2() * this.WPU);
        int iRound3 = Math.round(this.aYN.J2() * this.WPU);
        int i2 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    @Override // ef.j, ef.I28
    public void Uo(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        if (this.f63796r) {
            return;
        }
        KN(this.XQ, matrix, false);
        this.xMQ.setShader(this.f63792S == QJ.CN3.LINEAR ? az() : ty());
        super.Uo(canvas, matrix, i2, ml);
    }

    @Override // ef.w6
    public String getName() {
        return this.Ik;
    }

    public Dsr(com.airbnb.lottie.Xo xo, gL.n nVar, QJ.Wre wre) {
        super(xo, nVar, wre.rl().rl(), wre.Uo().rl(), wre.xMQ(), wre.gh(), wre.az(), wre.KN(), wre.t());
        this.f63795o = new LongSparseArray();
        this.f63793Z = new LongSparseArray();
        this.XQ = new RectF();
        this.Ik = wre.mUb();
        this.f63792S = wre.J2();
        this.f63796r = wre.ty();
        this.WPU = (int) (xo.nHg().nr() / 32.0f);
        B.j jVarN = wre.O().n();
        this.aYN = jVarN;
        jVarN.n(this);
        nVar.mUb(jVarN);
        B.j jVarN2 = wre.qie().n();
        this.ViF = jVarN2;
        jVarN2.n(this);
        nVar.mUb(jVarN2);
        B.j jVarN3 = wre.nr().n();
        this.nY = jVarN3;
        jVarN3.n(this);
        nVar.mUb(jVarN3);
    }

    private LinearGradient az() {
        long jQie = qie();
        LinearGradient linearGradient = (LinearGradient) this.f63795o.O(jQie);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.ViF.KN();
        PointF pointF2 = (PointF) this.nY.KN();
        QJ.Ml ml = (QJ.Ml) this.aYN.KN();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, gh(ml.nr()), ml.O(), Shader.TileMode.CLAMP);
        this.f63795o.gh(jQie, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient ty() {
        long jQie = qie();
        RadialGradient radialGradient = (RadialGradient) this.f63793Z.O(jQie);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.ViF.KN();
        PointF pointF2 = (PointF) this.nY.KN();
        QJ.Ml ml = (QJ.Ml) this.aYN.KN();
        int[] iArrGh = gh(ml.nr());
        float[] fArrO = ml.O();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), iArrGh, fArrO, Shader.TileMode.CLAMP);
        this.f63793Z.gh(jQie, radialGradient2);
        return radialGradient2;
    }

    @Override // ef.j, ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        super.J2(obj, w6Var);
        if (obj == SPz.wTp) {
            B.z zVar = this.f63794g;
            if (zVar != null) {
                this.J2.T(zVar);
            }
            if (w6Var == null) {
                this.f63794g = null;
                return;
            }
            B.z zVar2 = new B.z(w6Var);
            this.f63794g = zVar2;
            zVar2.n(this);
            this.J2.mUb(this.f63794g);
        }
    }
}
