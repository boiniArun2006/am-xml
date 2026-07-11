package gL;

import B.z;
import FQq.SPz;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class fuX extends n {
    private final RectF E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final I28 f67501N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Path f67502T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final float[] f67503X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f67504e;
    private B.j nHg;
    private B.j s7N;

    @Override // gL.n
    public void XQ(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        int iAlpha = Color.alpha(this.f67501N.ck());
        if (iAlpha == 0) {
            return;
        }
        B.j jVar = this.s7N;
        Integer num = jVar == null ? null : (Integer) jVar.KN();
        if (num != null) {
            this.f67504e.setColor(num.intValue());
        } else {
            this.f67504e.setColor(this.f67501N.ck());
        }
        int iIntValue = (int) ((i2 / 255.0f) * (((iAlpha / 255.0f) * (this.aYN.KN() == null ? 100 : ((Integer) this.aYN.KN().KN()).intValue())) / 100.0f) * 255.0f);
        this.f67504e.setAlpha(iIntValue);
        if (ml != null) {
            ml.n(this.f67504e);
        } else {
            this.f67504e.clearShadowLayer();
        }
        B.j jVar2 = this.nHg;
        if (jVar2 != null) {
            this.f67504e.setColorFilter((ColorFilter) jVar2.KN());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f67503X;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f67501N.r();
            float[] fArr2 = this.f67503X;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f67501N.r();
            this.f67503X[5] = this.f67501N.Ik();
            float[] fArr3 = this.f67503X;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f67501N.Ik();
            matrix.mapPoints(this.f67503X);
            this.f67502T.reset();
            Path path = this.f67502T;
            float[] fArr4 = this.f67503X;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f67502T;
            float[] fArr5 = this.f67503X;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f67502T;
            float[] fArr6 = this.f67503X;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f67502T;
            float[] fArr7 = this.f67503X;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f67502T;
            float[] fArr8 = this.f67503X;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f67502T.close();
            canvas.drawPath(this.f67502T, this.f67504e);
        }
    }

    fuX(Xo xo, I28 i28) {
        super(xo, i28);
        this.E2 = new RectF();
        H.j jVar = new H.j();
        this.f67504e = jVar;
        this.f67503X = new float[8];
        this.f67502T = new Path();
        this.f67501N = i28;
        jVar.setAlpha(0);
        jVar.setStyle(Paint.Style.FILL);
        jVar.setColor(i28.ck());
    }

    @Override // gL.n, ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        super.J2(obj, w6Var);
        if (obj == SPz.s7N) {
            if (w6Var == null) {
                this.nHg = null;
                return;
            } else {
                this.nHg = new z(w6Var);
                return;
            }
        }
        if (obj == SPz.f2551n) {
            if (w6Var == null) {
                this.s7N = null;
                this.f67504e.setColor(this.f67501N.ck());
            } else {
                this.s7N = new z(w6Var);
            }
        }
    }

    @Override // gL.n, ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        super.KN(rectF, matrix, z2);
        this.E2.set(0.0f, 0.0f, this.f67501N.r(), this.f67501N.Ik());
        this.HI.mapRect(this.E2);
        rectF.set(this.E2);
    }
}
