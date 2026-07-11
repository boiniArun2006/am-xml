package Ect;

import FQq.Dsr;
import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j {
    public PointF HI;
    public final Interpolator J2;
    public Float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Interpolator f2327O;
    public final float Uo;
    private float az;
    public PointF ck;
    private int gh;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f2328n;
    public final Interpolator nr;
    private int qie;
    public final Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f2329t;
    private float ty;
    private float xMQ;

    public j(Dsr dsr, Object obj, Object obj2, Interpolator interpolator, float f3, Float f4) {
        this.xMQ = -3987645.8f;
        this.mUb = -3987645.8f;
        this.gh = 784923401;
        this.qie = 784923401;
        this.az = Float.MIN_VALUE;
        this.ty = Float.MIN_VALUE;
        this.HI = null;
        this.ck = null;
        this.f2328n = dsr;
        this.rl = obj;
        this.f2329t = obj2;
        this.nr = interpolator;
        this.f2327O = null;
        this.J2 = null;
        this.Uo = f3;
        this.KN = f4;
    }

    public float J2() {
        Dsr dsr = this.f2328n;
        if (dsr == null) {
            return 0.0f;
        }
        if (this.az == Float.MIN_VALUE) {
            this.az = (this.Uo - dsr.ck()) / this.f2328n.O();
        }
        return this.az;
    }

    public int KN() {
        if (this.gh == 784923401) {
            this.gh = ((Integer) this.rl).intValue();
        }
        return this.gh;
    }

    public int O() {
        if (this.qie == 784923401) {
            this.qie = ((Integer) this.f2329t).intValue();
        }
        return this.qie;
    }

    public float Uo() {
        if (this.xMQ == -3987645.8f) {
            this.xMQ = ((Float) this.rl).floatValue();
        }
        return this.xMQ;
    }

    public float nr() {
        if (this.mUb == -3987645.8f) {
            this.mUb = ((Float) this.f2329t).floatValue();
        }
        return this.mUb;
    }

    public j rl(Object obj, Object obj2) {
        return new j(obj, obj2);
    }

    public float t() {
        if (this.f2328n == null) {
            return 1.0f;
        }
        if (this.ty == Float.MIN_VALUE) {
            if (this.KN == null) {
                this.ty = 1.0f;
            } else {
                this.ty = J2() + ((this.KN.floatValue() - this.Uo) / this.f2328n.O());
            }
        }
        return this.ty;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.rl + ", endValue=" + this.f2329t + ", startFrame=" + this.Uo + ", endFrame=" + this.KN + ", interpolator=" + this.nr + '}';
    }

    public boolean xMQ() {
        return this.nr == null && this.f2327O == null && this.J2 == null;
    }

    public boolean n(float f3) {
        if (f3 >= J2() && f3 < t()) {
            return true;
        }
        return false;
    }

    public j(Dsr dsr, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f3, Float f4) {
        this.xMQ = -3987645.8f;
        this.mUb = -3987645.8f;
        this.gh = 784923401;
        this.qie = 784923401;
        this.az = Float.MIN_VALUE;
        this.ty = Float.MIN_VALUE;
        this.HI = null;
        this.ck = null;
        this.f2328n = dsr;
        this.rl = obj;
        this.f2329t = obj2;
        this.nr = null;
        this.f2327O = interpolator;
        this.J2 = interpolator2;
        this.Uo = f3;
        this.KN = f4;
    }

    protected j(Dsr dsr, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f3, Float f4) {
        this.xMQ = -3987645.8f;
        this.mUb = -3987645.8f;
        this.gh = 784923401;
        this.qie = 784923401;
        this.az = Float.MIN_VALUE;
        this.ty = Float.MIN_VALUE;
        this.HI = null;
        this.ck = null;
        this.f2328n = dsr;
        this.rl = obj;
        this.f2329t = obj2;
        this.nr = interpolator;
        this.f2327O = interpolator2;
        this.J2 = interpolator3;
        this.Uo = f3;
        this.KN = f4;
    }

    public j(Object obj) {
        this.xMQ = -3987645.8f;
        this.mUb = -3987645.8f;
        this.gh = 784923401;
        this.qie = 784923401;
        this.az = Float.MIN_VALUE;
        this.ty = Float.MIN_VALUE;
        this.HI = null;
        this.ck = null;
        this.f2328n = null;
        this.rl = obj;
        this.f2329t = obj;
        this.nr = null;
        this.f2327O = null;
        this.J2 = null;
        this.Uo = Float.MIN_VALUE;
        this.KN = Float.valueOf(Float.MAX_VALUE);
    }

    private j(Object obj, Object obj2) {
        this.xMQ = -3987645.8f;
        this.mUb = -3987645.8f;
        this.gh = 784923401;
        this.qie = 784923401;
        this.az = Float.MIN_VALUE;
        this.ty = Float.MIN_VALUE;
        this.HI = null;
        this.ck = null;
        this.f2328n = null;
        this.rl = obj;
        this.f2329t = obj2;
        this.nr = null;
        this.f2327O = null;
        this.J2 = null;
        this.Uo = Float.MIN_VALUE;
        this.KN = Float.valueOf(Float.MAX_VALUE);
    }
}
