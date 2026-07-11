package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    int HI;
    private final int J2;
    private final Drawable KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f41051O;
    private final StateListDrawable Uo;
    float az;
    float ck;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f41054g;
    int gh;
    private final RecyclerView.OnScrollListener iF;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f41055n;
    final ValueAnimator nY;
    final Drawable nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RecyclerView f41056o;
    int qie;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final StateListDrawable f41058t;
    private final Runnable te;
    int ty;
    private final int xMQ;
    private static final int[] fD = {R.attr.state_pressed};
    private static final int[] E2 = new int[0];
    private int Ik = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f41057r = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f41053Z = false;
    private boolean XQ = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f41052S = 0;
    private int WPU = 0;
    private final int[] aYN = new int[2];
    private final int[] ViF = new int[2];

    private class AnimatorListener extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f41061n = false;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f41061n = true;
        }

        AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f41061n) {
                this.f41061n = false;
                return;
            }
            if (((Float) FastScroller.this.nY.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller fastScroller = FastScroller.this;
                fastScroller.f41054g = 0;
                fastScroller.g(0);
            } else {
                FastScroller fastScroller2 = FastScroller.this;
                fastScroller2.f41054g = 2;
                fastScroller2.aYN();
            }
        }
    }

    private class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.f41058t.setAlpha(iFloatValue);
            FastScroller.this.nr.setAlpha(iFloatValue);
            FastScroller.this.aYN();
        }
    }

    private int nY(float f3, float f4, int[] iArr, int i2, int i3, int i5) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i2 - i5;
        int i9 = (int) (((f4 - f3) / i7) * i8);
        int i10 = i3 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void O(boolean z2) {
    }

    void g(int i2) {
        if (i2 == 2 && this.f41052S != 2) {
            this.f41058t.setState(fD);
            az();
        }
        if (i2 == 0) {
            aYN();
        } else {
            iF();
        }
        if (this.f41052S == 2 && i2 != 2) {
            this.f41058t.setState(E2);
            ViF(1200);
        } else if (i2 == 1) {
            ViF(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f41052S = i2;
    }

    public void iF() {
        int i2 = this.f41054g;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                this.nY.cancel();
            }
        }
        this.f41054g = 1;
        ValueAnimator valueAnimator = this.nY;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.nY.setDuration(500L);
        this.nY.setStartDelay(0L);
        this.nY.start();
    }

    void o(int i2) {
        int i3 = this.f41054g;
        if (i3 == 1) {
            this.nY.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.f41054g = 3;
        ValueAnimator valueAnimator = this.nY;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.nY.setDuration(i2);
        this.nY.start();
    }

    private void HI(Canvas canvas) {
        int i2 = this.f41057r;
        int i3 = this.xMQ;
        int i5 = this.HI;
        int i7 = this.ty;
        this.Uo.setBounds(0, 0, i7, i3);
        this.KN.setBounds(0, 0, this.Ik, this.mUb);
        canvas.translate(0.0f, i2 - i3);
        this.KN.draw(canvas);
        canvas.translate(i5 - (i7 / 2), 0.0f);
        this.Uo.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private int[] Ik() {
        int[] iArr = this.ViF;
        int i2 = this.rl;
        iArr[0] = i2;
        iArr[1] = this.Ik - i2;
        return iArr;
    }

    private boolean XQ() {
        return this.f41056o.getLayoutDirection() == 1;
    }

    private void az() {
        this.f41056o.removeCallbacks(this.te);
    }

    private void ck(Canvas canvas) {
        int i2 = this.Ik;
        int i3 = this.f41051O;
        int i5 = i2 - i3;
        int i7 = this.qie;
        int i8 = this.gh;
        int i9 = i7 - (i8 / 2);
        this.f41058t.setBounds(0, 0, i3, i8);
        this.nr.setBounds(0, 0, this.J2, this.f41057r);
        if (!XQ()) {
            canvas.translate(i5, 0.0f);
            this.nr.draw(canvas);
            canvas.translate(0.0f, i9);
            this.f41058t.draw(canvas);
            canvas.translate(-i5, -i9);
            return;
        }
        this.nr.draw(canvas);
        canvas.translate(this.f41051O, i9);
        canvas.scale(-1.0f, 1.0f);
        this.f41058t.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f41051O, -i9);
    }

    private int[] r() {
        int[] iArr = this.aYN;
        int i2 = this.rl;
        iArr[0] = i2;
        iArr[1] = this.f41057r - i2;
        return iArr;
    }

    private void te() {
        this.f41056o.addItemDecoration(this);
        this.f41056o.addOnItemTouchListener(this);
        this.f41056o.addOnScrollListener(this.iF);
    }

    private void ty() {
        this.f41056o.removeItemDecoration(this);
        this.f41056o.removeOnItemTouchListener(this);
        this.f41056o.removeOnScrollListener(this.iF);
        az();
    }

    boolean S(float f3, float f4) {
        if (f4 < this.f41057r - this.xMQ) {
            return false;
        }
        int i2 = this.HI;
        int i3 = this.ty;
        return f3 >= ((float) (i2 - (i3 / 2))) && f3 <= ((float) (i2 + (i3 / 2)));
    }

    void aYN() {
        this.f41056o.invalidate();
    }

    void fD(int i2, int i3) {
        int iComputeVerticalScrollRange = this.f41056o.computeVerticalScrollRange();
        int i5 = this.f41057r;
        this.f41053Z = iComputeVerticalScrollRange - i5 > 0 && i5 >= this.f41055n;
        int iComputeHorizontalScrollRange = this.f41056o.computeHorizontalScrollRange();
        int i7 = this.Ik;
        boolean z2 = iComputeHorizontalScrollRange - i7 > 0 && i7 >= this.f41055n;
        this.XQ = z2;
        boolean z3 = this.f41053Z;
        if (!z3 && !z2) {
            if (this.f41052S != 0) {
                g(0);
                return;
            }
            return;
        }
        if (z3) {
            float f3 = i5;
            this.qie = (int) ((f3 * (i3 + (f3 / 2.0f))) / iComputeVerticalScrollRange);
            this.gh = Math.min(i5, (i5 * i5) / iComputeVerticalScrollRange);
        }
        if (this.XQ) {
            float f4 = i7;
            this.HI = (int) ((f4 * (i2 + (f4 / 2.0f))) / iComputeHorizontalScrollRange);
            this.ty = Math.min(i7, (i7 * i7) / iComputeHorizontalScrollRange);
        }
        int i8 = this.f41052S;
        if (i8 == 0 || i8 == 1) {
            g(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void gh(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.Ik != this.f41056o.getWidth() || this.f41057r != this.f41056o.getHeight()) {
            this.Ik = this.f41056o.getWidth();
            this.f41057r = this.f41056o.getHeight();
            g(0);
        } else if (this.f41054g != 0) {
            if (this.f41053Z) {
                ck(canvas);
            }
            if (this.XQ) {
                HI(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void n(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f41052S == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zWPU = WPU(motionEvent.getX(), motionEvent.getY());
            boolean zS = S(motionEvent.getX(), motionEvent.getY());
            if (zWPU || zS) {
                if (zS) {
                    this.WPU = 1;
                    this.ck = (int) motionEvent.getX();
                } else if (zWPU) {
                    this.WPU = 2;
                    this.az = (int) motionEvent.getY();
                }
                g(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f41052S == 2) {
            this.az = 0.0f;
            this.ck = 0.0f;
            g(1);
            this.WPU = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f41052S == 2) {
            iF();
            if (this.WPU == 1) {
                Z(motionEvent.getX());
            }
            if (this.WPU == 2) {
                E2(motionEvent.getY());
            }
        }
    }

    public void qie(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f41056o;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ty();
        }
        this.f41056o = recyclerView;
        if (recyclerView != null) {
            te();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean t(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.f41052S;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean zWPU = WPU(motionEvent.getX(), motionEvent.getY());
        boolean zS = S(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zWPU && !zS)) {
            return false;
        }
        if (zS) {
            this.WPU = 1;
            this.ck = (int) motionEvent.getX();
        } else if (zWPU) {
            this.WPU = 2;
            this.az = (int) motionEvent.getY();
        }
        g(2);
        return true;
    }

    FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.nY = valueAnimatorOfFloat;
        this.f41054g = 0;
        this.te = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public void run() {
                FastScroller.this.o(500);
            }
        };
        this.iF = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void rl(RecyclerView recyclerView2, int i7, int i8) {
                FastScroller.this.fD(recyclerView2.computeHorizontalScrollOffset(), recyclerView2.computeVerticalScrollOffset());
            }
        };
        this.f41058t = stateListDrawable;
        this.nr = drawable;
        this.Uo = stateListDrawable2;
        this.KN = drawable2;
        this.f41051O = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.J2 = Math.max(i2, drawable.getIntrinsicWidth());
        this.xMQ = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.mUb = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f41055n = i3;
        this.rl = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new AnimatorListener());
        valueAnimatorOfFloat.addUpdateListener(new AnimatorUpdater());
        qie(recyclerView);
    }

    private void E2(float f3) {
        int[] iArrR = r();
        float fMax = Math.max(iArrR[0], Math.min(iArrR[1], f3));
        if (Math.abs(this.qie - fMax) < 2.0f) {
            return;
        }
        int iNY = nY(this.az, fMax, iArrR, this.f41056o.computeVerticalScrollRange(), this.f41056o.computeVerticalScrollOffset(), this.f41057r);
        if (iNY != 0) {
            this.f41056o.scrollBy(0, iNY);
        }
        this.az = fMax;
    }

    private void ViF(int i2) {
        az();
        this.f41056o.postDelayed(this.te, i2);
    }

    private void Z(float f3) {
        int[] iArrIk = Ik();
        float fMax = Math.max(iArrIk[0], Math.min(iArrIk[1], f3));
        if (Math.abs(this.HI - fMax) < 2.0f) {
            return;
        }
        int iNY = nY(this.ck, fMax, iArrIk, this.f41056o.computeHorizontalScrollRange(), this.f41056o.computeHorizontalScrollOffset(), this.Ik);
        if (iNY != 0) {
            this.f41056o.scrollBy(iNY, 0);
        }
        this.ck = fMax;
    }

    boolean WPU(float f3, float f4) {
        if (XQ()) {
            if (f3 > this.f41051O) {
                return false;
            }
        } else if (f3 < this.Ik - this.f41051O) {
            return false;
        }
        int i2 = this.qie;
        int i3 = this.gh;
        if (f4 >= i2 - (i3 / 2) && f4 <= i2 + (i3 / 2)) {
            return true;
        }
        return false;
    }
}
