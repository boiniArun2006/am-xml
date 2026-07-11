package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final int f36910U = ViewConfiguration.getTapTimeout();
    private Runnable J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f36911N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final View f36912O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f36913S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    boolean f36914T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f36915X;
    private boolean Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f36916Z;
    private boolean jB;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f36923v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ClampedScroller f36919n = new ClampedScroller();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Interpolator f36922t = new AccelerateInterpolator();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f36921r = {0.0f, 0.0f};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f36920o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f36918g = {0.0f, 0.0f};
    private float[] E2 = {0.0f, 0.0f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f36917e = {Float.MAX_VALUE, Float.MAX_VALUE};

    private static class ClampedScroller {
        private int gh;
        private float mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f36925n;
        private float nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f36926t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f36924O = Long.MIN_VALUE;
        private long xMQ = -1;
        private long J2 = 0;
        private int Uo = 0;
        private int KN = 0;

        private float Uo(float f3) {
            return ((-4.0f) * f3 * f3) + (f3 * 4.0f);
        }

        private float O(long j2) {
            if (j2 < this.f36924O) {
                return 0.0f;
            }
            long j3 = this.xMQ;
            if (j3 < 0 || j2 < j3) {
                return AutoScrollHelper.O((j2 - r0) / this.f36925n, 0.0f, 1.0f) * 0.5f;
            }
            float f3 = this.mUb;
            return (1.0f - f3) + (f3 * AutoScrollHelper.O((j2 - j3) / this.gh, 0.0f, 1.0f));
        }

        public int J2() {
            float f3 = this.nr;
            return (int) (f3 / Math.abs(f3));
        }

        public boolean KN() {
            return this.xMQ > 0 && AnimationUtils.currentAnimationTimeMillis() > this.xMQ + ((long) this.gh);
        }

        public void gh(int i2) {
            this.f36925n = i2;
        }

        public void mUb(int i2) {
            this.rl = i2;
        }

        public void n() {
            if (this.J2 == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fUo = Uo(O(jCurrentAnimationTimeMillis));
            long j2 = jCurrentAnimationTimeMillis - this.J2;
            this.J2 = jCurrentAnimationTimeMillis;
            float f3 = j2 * fUo;
            this.Uo = (int) (this.f36926t * f3);
            this.KN = (int) (f3 * this.nr);
        }

        public int nr() {
            float f3 = this.f36926t;
            return (int) (f3 / Math.abs(f3));
        }

        public void qie(float f3, float f4) {
            this.f36926t = f3;
            this.nr = f4;
        }

        public int rl() {
            return this.Uo;
        }

        public int t() {
            return this.KN;
        }

        ClampedScroller() {
        }

        public void az() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f36924O = jCurrentAnimationTimeMillis;
            this.xMQ = -1L;
            this.J2 = jCurrentAnimationTimeMillis;
            this.mUb = 0.5f;
            this.Uo = 0;
            this.KN = 0;
        }

        public void xMQ() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.gh = AutoScrollHelper.J2((int) (jCurrentAnimationTimeMillis - this.f36924O), 0, this.rl);
            this.mUb = O(jCurrentAnimationTimeMillis);
            this.xMQ = jCurrentAnimationTimeMillis;
        }
    }

    private class ScrollAnimationRunnable implements Runnable {
        ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.f36923v) {
                if (autoScrollHelper.f36914T) {
                    autoScrollHelper.f36914T = false;
                    autoScrollHelper.f36919n.az();
                }
                ClampedScroller clampedScroller = AutoScrollHelper.this.f36919n;
                if (clampedScroller.KN() || !AutoScrollHelper.this.XQ()) {
                    AutoScrollHelper.this.f36923v = false;
                    return;
                }
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.f36911N) {
                    autoScrollHelper2.f36911N = false;
                    autoScrollHelper2.t();
                }
                clampedScroller.n();
                AutoScrollHelper.this.mUb(clampedScroller.rl(), clampedScroller.t());
                ViewCompat.Nxk(AutoScrollHelper.this.f36912O, this);
            }
        }
    }

    static int J2(int i2, int i3, int i5) {
        return i2 > i5 ? i5 : i2 < i3 ? i3 : i2;
    }

    private float KN(float f3, float f4, float f5, float f6) {
        float interpolation;
        float fO = O(f3 * f4, 0.0f, f5);
        float fUo = Uo(f4 - f6, fO) - Uo(f6, fO);
        if (fUo < 0.0f) {
            interpolation = -this.f36922t.getInterpolation(-fUo);
        } else {
            if (fUo <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f36922t.getInterpolation(fUo);
        }
        return O(interpolation, -1.0f, 1.0f);
    }

    static float O(float f3, float f4, float f5) {
        return f3 > f5 ? f5 : f3 < f4 ? f4 : f3;
    }

    private float Uo(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f36916Z;
        if (i2 == 0 || i2 == 1) {
            if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (this.f36923v && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f3 < 0.0f) {
            return f3 / (-f4);
        }
        return 0.0f;
    }

    public abstract void mUb(int i2, int i3);

    public abstract boolean n(int i2);

    public abstract boolean rl(int i2);

    private void S() {
        int i2;
        if (this.J2 == null) {
            this.J2 = new ScrollAnimationRunnable();
        }
        this.f36923v = true;
        this.f36914T = true;
        if (this.f36915X || (i2 = this.f36913S) <= 0) {
            this.J2.run();
        } else {
            ViewCompat.Y(this.f36912O, this.J2, i2);
        }
        this.f36915X = true;
    }

    private float nr(int i2, float f3, float f4, float f5) {
        float fKN = KN(this.f36921r[i2], f4, this.f36920o[i2], f3);
        if (fKN == 0.0f) {
            return 0.0f;
        }
        float f6 = this.f36918g[i2];
        float f7 = this.E2[i2];
        float f8 = this.f36917e[i2];
        float f9 = f6 * f5;
        return fKN > 0.0f ? O(fKN * f9, f7, f8) : -O((-fKN) * f9, f7, f8);
    }

    private void xMQ() {
        if (this.f36914T) {
            this.f36923v = false;
        } else {
            this.f36919n.xMQ();
        }
    }

    public AutoScrollHelper HI(float f3, float f4) {
        float[] fArr = this.f36917e;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    public AutoScrollHelper Ik(int i2) {
        this.f36919n.mUb(i2);
        return this;
    }

    boolean XQ() {
        ClampedScroller clampedScroller = this.f36919n;
        int iJ2 = clampedScroller.J2();
        int iNr = clampedScroller.nr();
        if (iJ2 == 0 || !rl(iJ2)) {
            return iNr != 0 && n(iNr);
        }
        return true;
    }

    public AutoScrollHelper Z(float f3, float f4) {
        float[] fArr = this.f36918g;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    public AutoScrollHelper az(boolean z2) {
        if (this.Xw && !z2) {
            xMQ();
        }
        this.Xw = z2;
        return this;
    }

    public AutoScrollHelper ck(float f3, float f4) {
        float[] fArr = this.E2;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    public AutoScrollHelper gh(int i2) {
        this.f36913S = i2;
        return this;
    }

    public AutoScrollHelper o(float f3, float f4) {
        float[] fArr = this.f36921r;
        fArr[0] = f3;
        fArr[1] = f4;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.Xw) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                xMQ();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return !this.jB && this.f36923v;
        }
        this.f36911N = true;
        this.f36915X = false;
        this.f36919n.qie(nr(0, motionEvent.getX(), view.getWidth(), this.f36912O.getWidth()), nr(1, motionEvent.getY(), view.getHeight(), this.f36912O.getHeight()));
        if (!this.f36923v && XQ()) {
            S();
        }
        if (this.jB) {
        }
    }

    public AutoScrollHelper qie(int i2) {
        this.f36916Z = i2;
        return this;
    }

    public AutoScrollHelper r(int i2) {
        this.f36919n.gh(i2);
        return this;
    }

    public AutoScrollHelper ty(float f3, float f4) {
        float[] fArr = this.f36920o;
        fArr[0] = f3;
        fArr[1] = f4;
        return this;
    }

    public AutoScrollHelper(View view) {
        this.f36912O = view;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = (int) ((1575.0f * f3) + 0.5f);
        HI(f4, f4);
        float f5 = (int) ((f3 * 315.0f) + 0.5f);
        ck(f5, f5);
        qie(1);
        ty(Float.MAX_VALUE, Float.MAX_VALUE);
        o(0.2f, 0.2f);
        Z(1.0f, 1.0f);
        gh(f36910U);
        r(500);
        Ik(500);
    }

    void t() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f36912O.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }
}
