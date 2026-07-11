package x0;

import android.view.Choreographer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class aC extends w6 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private FQq.Dsr f75169X;
    private float J2 = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f75174r = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f75173o = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f75170Z = 0.0f;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f75167S = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f75172g = 0;
    private float E2 = -2.14748365E9f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f75171e = 2.14748365E9f;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected boolean f75168T = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f75166N = false;

    protected void S() {
        WPU(true);
    }

    public void Z() {
        this.f75168T = true;
        J2(r());
        g((int) (r() ? HI() : ck()));
        this.f75173o = 0L;
        this.f75172g = 0;
        XQ();
    }

    public void aYN() {
        this.f75168T = true;
        XQ();
        this.f75173o = 0L;
        if (r() && az() == ck()) {
            g(HI());
        } else if (!r() && az() == HI()) {
            g(ck());
        }
        O();
    }

    public void fD(int i2) {
        iF(i2, (int) this.f75171e);
    }

    public void mUb() {
        this.f75169X = null;
        this.E2 = -2.14748365E9f;
        this.f75171e = 2.14748365E9f;
    }

    private void X() {
        if (this.f75169X == null) {
            return;
        }
        float f3 = this.f75167S;
        if (f3 < this.E2 || f3 > this.f75171e) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.E2), Float.valueOf(this.f75171e), Float.valueOf(this.f75167S)));
        }
    }

    private float ty() {
        FQq.Dsr dsr = this.f75169X;
        if (dsr == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dsr.xMQ()) / Math.abs(this.J2);
    }

    private void xMQ(float f3) {
        if (this.f75166N && this.f75170Z == f3) {
            return;
        }
        KN();
    }

    public void E2(float f3) {
        this.J2 = f3;
    }

    public float HI() {
        FQq.Dsr dsr = this.f75169X;
        if (dsr == null) {
            return 0.0f;
        }
        float f3 = this.f75171e;
        return f3 == 2.14748365E9f ? dsr.J2() : f3;
    }

    public float Ik() {
        return this.J2;
    }

    public float az() {
        return this.f75167S;
    }

    public float ck() {
        FQq.Dsr dsr = this.f75169X;
        if (dsr == null) {
            return 0.0f;
        }
        float f3 = this.E2;
        return f3 == -2.14748365E9f ? dsr.ck() : f3;
    }

    public void e(boolean z2) {
        this.f75166N = z2;
    }

    public void g(float f3) {
        if (this.f75170Z == f3) {
            return;
        }
        float fRl = o.rl(f3, ck(), HI());
        this.f75170Z = fRl;
        if (this.f75166N) {
            fRl = (float) Math.floor(fRl);
        }
        this.f75167S = fRl;
        this.f75173o = 0L;
        KN();
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fCk;
        float fHI;
        float fCk2;
        if (this.f75169X == null) {
            return 0.0f;
        }
        if (r()) {
            fCk = HI() - this.f75167S;
            fHI = HI();
            fCk2 = ck();
        } else {
            fCk = this.f75167S - ck();
            fHI = HI();
            fCk2 = ck();
        }
        return fCk / (fHI - fCk2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        FQq.Dsr dsr = this.f75169X;
        if (dsr == null) {
            return 0L;
        }
        return (long) dsr.nr();
    }

    public void iF(float f3, float f4) {
        if (f3 > f4) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f3), Float.valueOf(f4)));
        }
        FQq.Dsr dsr = this.f75169X;
        float fCk = dsr == null ? -3.4028235E38f : dsr.ck();
        FQq.Dsr dsr2 = this.f75169X;
        float fJ2 = dsr2 == null ? Float.MAX_VALUE : dsr2.J2();
        float fRl = o.rl(f3, fCk, fJ2);
        float fRl2 = o.rl(f4, fCk, fJ2);
        if (fRl == this.E2 && fRl2 == this.f75171e) {
            return;
        }
        this.E2 = fRl;
        this.f75171e = fRl2;
        g((int) o.rl(this.f75167S, fRl, fRl2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f75168T;
    }

    public void nY(FQq.Dsr dsr) {
        boolean z2 = this.f75169X == null;
        this.f75169X = dsr;
        if (z2) {
            iF(Math.max(this.E2, dsr.ck()), Math.min(this.f75171e, dsr.J2()));
        } else {
            iF((int) dsr.ck(), (int) dsr.J2());
        }
        float f3 = this.f75167S;
        this.f75167S = 0.0f;
        this.f75170Z = 0.0f;
        g((int) f3);
        KN();
    }

    public float qie() {
        FQq.Dsr dsr = this.f75169X;
        if (dsr == null) {
            return 0.0f;
        }
        return (this.f75167S - dsr.ck()) / (this.f75169X.J2() - this.f75169X.ck());
    }

    public void te(float f3) {
        iF(this.E2, f3);
    }

    private boolean r() {
        if (Ik() < 0.0f) {
            return true;
        }
        return false;
    }

    public void ViF() {
        E2(-Ik());
    }

    protected void WPU(boolean z2) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z2) {
            this.f75168T = false;
        }
    }

    protected void XQ() {
        if (isRunning()) {
            WPU(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        n();
        S();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        float fCk;
        float fHI;
        XQ();
        if (this.f75169X != null && isRunning()) {
            if (FQq.I28.KN()) {
                FQq.I28.rl("LottieValueAnimator#doFrame");
            }
            long j3 = this.f75173o;
            long j4 = 0;
            if (j3 != 0) {
                j4 = j2 - j3;
            }
            float fTy = j4 / ty();
            float f3 = this.f75170Z;
            if (r()) {
                fTy = -fTy;
            }
            float f4 = f3 + fTy;
            boolean zNr = o.nr(f4, ck(), HI());
            float f5 = this.f75170Z;
            float fRl = o.rl(f4, ck(), HI());
            this.f75170Z = fRl;
            if (this.f75166N) {
                fRl = (float) Math.floor(fRl);
            }
            this.f75167S = fRl;
            this.f75173o = j2;
            if (!zNr) {
                if (getRepeatCount() != -1 && this.f75172g >= getRepeatCount()) {
                    if (this.J2 < 0.0f) {
                        fHI = ck();
                    } else {
                        fHI = HI();
                    }
                    this.f75170Z = fHI;
                    this.f75167S = fHI;
                    S();
                    xMQ(f5);
                    rl(r());
                } else {
                    if (getRepeatMode() == 2) {
                        this.f75174r = !this.f75174r;
                        ViF();
                    } else {
                        if (r()) {
                            fCk = HI();
                        } else {
                            fCk = ck();
                        }
                        this.f75170Z = fCk;
                        this.f75167S = fCk;
                    }
                    this.f75173o = j2;
                    xMQ(f5);
                    nr();
                    this.f75172g++;
                }
            } else {
                xMQ(f5);
            }
            X();
            if (FQq.I28.KN()) {
                FQq.I28.t("LottieValueAnimator#doFrame");
            }
        }
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(qie());
    }

    public void gh() {
        S();
        rl(r());
    }

    @Override // x0.w6
    void n() {
        super.n();
        rl(r());
    }

    public void o() {
        S();
        t();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.f75174r) {
            this.f75174r = false;
            ViF();
        }
    }
}
