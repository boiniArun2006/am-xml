package x0;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import x0.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float[] f75148O = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f75149n;
    private int nr;
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f75150t;

    public Ml(float f3, float f4, float f5, int i2) {
        this.f75149n = f3;
        this.rl = f4;
        this.f75150t = f5;
        this.nr = i2;
    }

    public float J2() {
        return this.rl;
    }

    public float KN() {
        return this.f75149n;
    }

    public int O() {
        return this.nr;
    }

    public float Uo() {
        return this.f75150t;
    }

    public void gh(Matrix matrix) {
        if (this.f75148O == null) {
            this.f75148O = new float[2];
        }
        float[] fArr = this.f75148O;
        fArr[0] = this.rl;
        fArr[1] = this.f75150t;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f75148O;
        this.rl = fArr2[0];
        this.f75150t = fArr2[1];
        this.f75149n = matrix.mapRadius(this.f75149n);
    }

    public boolean mUb(Ml ml) {
        return this.f75149n == ml.f75149n && this.rl == ml.rl && this.f75150t == ml.f75150t && this.nr == ml.nr;
    }

    public void n(Paint paint) {
        if (Color.alpha(this.nr) > 0) {
            paint.setShadowLayer(Math.max(this.f75149n, Float.MIN_VALUE), this.rl, this.f75150t, this.nr);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void nr(int i2, Xo.j jVar) {
        Ml ml = new Ml(this);
        jVar.nr = ml;
        ml.xMQ(i2);
    }

    public void rl(Xo.j jVar) {
        if (Color.alpha(this.nr) > 0) {
            jVar.nr = this;
        } else {
            jVar.nr = null;
        }
    }

    public void t(int i2, Paint paint) {
        int iQie = eO.qie(Color.alpha(this.nr), o.t(i2, 0, 255));
        if (iQie <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f75149n, Float.MIN_VALUE), this.rl, this.f75150t, Color.argb(iQie, Color.red(this.nr), Color.green(this.nr), Color.blue(this.nr)));
        }
    }

    public void xMQ(int i2) {
        this.nr = Color.argb(Math.round((Color.alpha(this.nr) * o.t(i2, 0, 255)) / 255.0f), Color.red(this.nr), Color.green(this.nr), Color.blue(this.nr));
    }

    public Ml(Ml ml) {
        this.f75149n = 0.0f;
        this.rl = 0.0f;
        this.f75150t = 0.0f;
        this.nr = 0;
        this.f75149n = ml.f75149n;
        this.rl = ml.rl;
        this.f75150t = ml.f75150t;
        this.nr = ml.nr;
    }
}
