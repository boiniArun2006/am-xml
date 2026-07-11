package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    private Animator J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Resources f42080O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ring f42081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f42082o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f42083r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f42084t;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Interpolator f42078Z = new LinearInterpolator();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Interpolator f42077S = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f42079g = {-16777216};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ProgressDrawableSize {
    }

    private static class Ring {
        Path HI;
        float Ik;
        float J2;
        float KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        float f42087O;
        float Uo;
        int XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f42088Z;
        float az;
        float ck;
        float gh;
        int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final RectF f42089n = new RectF();
        final Paint nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f42090o;
        float qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42091r;
        final Paint rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Paint f42092t;
        boolean ty;
        int[] xMQ;

        void HI(float f3, float f4) {
            this.f42091r = (int) f3;
            this.f42090o = (int) f4;
        }

        void az() {
            this.gh = 0.0f;
            this.qie = 0.0f;
            this.az = 0.0f;
            ViF(0.0f);
            S(0.0f);
            WPU(0.0f);
        }

        void Ik(float f3) {
            this.Ik = f3;
        }

        int J2() {
            return (this.mUb + 1) % this.xMQ.length;
        }

        int KN() {
            return this.xMQ[this.mUb];
        }

        int O() {
            return this.xMQ[J2()];
        }

        void S(float f3) {
            this.J2 = f3;
        }

        float Uo() {
            return this.f42087O;
        }

        void ViF(float f3) {
            this.f42087O = f3;
        }

        void WPU(float f3) {
            this.Uo = f3;
        }

        void XQ(int[] iArr) {
            this.xMQ = iArr;
            Z(0);
        }

        void Z(int i2) {
            this.mUb = i2;
            this.XQ = this.xMQ[i2];
        }

        void aYN(boolean z2) {
            if (this.ty != z2) {
                this.ty = z2;
            }
        }

        void ck(float f3) {
            if (f3 != this.ck) {
                this.ck = f3;
            }
        }

        void g() {
            this.gh = this.f42087O;
            this.qie = this.J2;
            this.az = this.Uo;
        }

        float gh() {
            return this.gh;
        }

        float mUb() {
            return this.az;
        }

        void n(Canvas canvas, Rect rect) {
            RectF rectF = this.f42089n;
            float f3 = this.Ik;
            float fMin = (this.KN / 2.0f) + f3;
            if (f3 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f42091r * this.ck) / 2.0f, this.KN / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f4 = this.f42087O;
            float f5 = this.Uo;
            float f6 = (f4 + f5) * 360.0f;
            float f7 = ((this.J2 + f5) * 360.0f) - f6;
            this.rl.setColor(this.XQ);
            this.rl.setAlpha(this.f42088Z);
            float f8 = this.KN / 2.0f;
            rectF.inset(f8, f8);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.nr);
            float f9 = -f8;
            rectF.inset(f9, f9);
            canvas.drawArc(rectF, f6, f7, false, this.rl);
            rl(canvas, f6, f7, rectF);
        }

        void nY(float f3) {
            this.KN = f3;
            this.rl.setStrokeWidth(f3);
        }

        float nr() {
            return this.J2;
        }

        void o(ColorFilter colorFilter) {
            this.rl.setColorFilter(colorFilter);
        }

        void r(int i2) {
            this.XQ = i2;
        }

        void rl(Canvas canvas, float f3, float f4, RectF rectF) {
            if (this.ty) {
                Path path = this.HI;
                if (path == null) {
                    Path path2 = new Path();
                    this.HI = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f5 = (this.f42091r * this.ck) / 2.0f;
                this.HI.moveTo(0.0f, 0.0f);
                this.HI.lineTo(this.f42091r * this.ck, 0.0f);
                Path path3 = this.HI;
                float f6 = this.f42091r;
                float f7 = this.ck;
                path3.lineTo((f6 * f7) / 2.0f, this.f42090o * f7);
                this.HI.offset((fMin + rectF.centerX()) - f5, rectF.centerY() + (this.KN / 2.0f));
                this.HI.close();
                this.f42092t.setColor(this.XQ);
                this.f42092t.setAlpha(this.f42088Z);
                canvas.save();
                canvas.rotate(f3 + f4, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.HI, this.f42092t);
                canvas.restore();
            }
        }

        int t() {
            return this.f42088Z;
        }

        void ty(int i2) {
            this.f42088Z = i2;
        }

        float xMQ() {
            return this.qie;
        }

        Ring() {
            Paint paint = new Paint();
            this.rl = paint;
            Paint paint2 = new Paint();
            this.f42092t = paint2;
            Paint paint3 = new Paint();
            this.nr = paint3;
            this.f42087O = 0.0f;
            this.J2 = 0.0f;
            this.Uo = 0.0f;
            this.KN = 5.0f;
            this.ck = 1.0f;
            this.f42088Z = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void qie() {
            Z(J2());
        }
    }

    private int t(float f3, int i2, int i3) {
        return ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r0) * f3))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r1) * f3))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r2) * f3))) << 8) | ((i2 & 255) + ((int) (f3 * ((i3 & 255) - r8))));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void KN(float f3) {
        this.f42084t = f3;
    }

    private void az() {
        final Ring ring = this.f42081n;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.ty(fFloatValue, ring);
                CircularProgressDrawable.this.rl(fFloatValue, ring, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f42078Z);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable.this.rl(1.0f, ring, true);
                ring.g();
                ring.qie();
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                if (!circularProgressDrawable.f42082o) {
                    circularProgressDrawable.f42083r += 1.0f;
                    return;
                }
                circularProgressDrawable.f42082o = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                ring.aYN(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.f42083r = 0.0f;
            }
        });
        this.J2 = valueAnimatorOfFloat;
    }

    private void xMQ(float f3, float f4, float f5, float f6) {
        Ring ring = this.f42081n;
        float f7 = this.f42080O.getDisplayMetrics().density;
        ring.nY(f4 * f7);
        ring.Ik(f3 * f7);
        ring.Z(0);
        ring.HI(f5 * f7, f6 * f7);
    }

    public void J2(int... iArr) {
        this.f42081n.XQ(iArr);
        this.f42081n.Z(0);
        invalidateSelf();
    }

    public void O(float f3) {
        this.f42081n.ck(f3);
        invalidateSelf();
    }

    public void Uo(float f3) {
        this.f42081n.WPU(f3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f42081n.t();
    }

    public void gh(float f3) {
        this.f42081n.nY(f3);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.J2.isRunning();
    }

    public void mUb(float f3, float f4) {
        this.f42081n.ViF(f3);
        this.f42081n.S(f4);
        invalidateSelf();
    }

    public void nr(boolean z2) {
        this.f42081n.aYN(z2);
        invalidateSelf();
    }

    public void qie(int i2) {
        if (i2 == 0) {
            xMQ(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            xMQ(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void rl(float f3, Ring ring, boolean z2) {
        float interpolation;
        float interpolation2;
        if (this.f42082o) {
            n(f3, ring);
            return;
        }
        if (f3 != 1.0f || z2) {
            float fMUb = ring.mUb();
            if (f3 < 0.5f) {
                interpolation = ring.gh();
                interpolation2 = (f42077S.getInterpolation(f3 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fGh = ring.gh() + 0.79f;
                interpolation = fGh - (((1.0f - f42077S.getInterpolation((f3 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fGh;
            }
            float f4 = fMUb + (0.20999998f * f3);
            float f5 = (f3 + this.f42083r) * 216.0f;
            ring.ViF(interpolation);
            ring.S(interpolation2);
            ring.WPU(f4);
            KN(f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f42081n.ty(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f42081n.o(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.J2.cancel();
        this.f42081n.g();
        if (this.f42081n.nr() != this.f42081n.Uo()) {
            this.f42082o = true;
            this.J2.setDuration(666L);
            this.J2.start();
        } else {
            this.f42081n.Z(0);
            this.f42081n.az();
            this.J2.setDuration(1332L);
            this.J2.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.J2.cancel();
        KN(0.0f);
        this.f42081n.aYN(false);
        this.f42081n.Z(0);
        this.f42081n.az();
        invalidateSelf();
    }

    void ty(float f3, Ring ring) {
        if (f3 > 0.75f) {
            ring.r(t((f3 - 0.75f) / 0.25f, ring.KN(), ring.O()));
        } else {
            ring.r(ring.KN());
        }
    }

    public CircularProgressDrawable(Context context) {
        this.f42080O = ((Context) Preconditions.Uo(context)).getResources();
        Ring ring = new Ring();
        this.f42081n = ring;
        ring.XQ(f42079g);
        gh(2.5f);
        az();
    }

    private void n(float f3, Ring ring) {
        ty(f3, ring);
        float fFloor = (float) (Math.floor(ring.mUb() / 0.8f) + 1.0d);
        ring.ViF(ring.gh() + (((ring.xMQ() - 0.01f) - ring.gh()) * f3));
        ring.S(ring.xMQ());
        ring.WPU(ring.mUb() + ((fFloor - ring.mUb()) * f3));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f42084t, bounds.exactCenterX(), bounds.exactCenterY());
        this.f42081n.n(canvas, bounds);
        canvas.restore();
    }
}
