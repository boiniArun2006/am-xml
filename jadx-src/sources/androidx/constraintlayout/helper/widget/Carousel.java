package androidx.constraintlayout.helper.widget;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Carousel extends MotionHelper {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f35592B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f35593D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f35594E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private int f35595FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private float f35596GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f35597I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float f35598J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f35599M;
    private MotionLayout M7;
    private int Nxk;
    private int P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f35600U;
    private Adapter Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35601a;
    int dR0;
    private boolean eF;
    private final ArrayList jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35602k;
    private int p5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Runnable f35603z;

    /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.Carousel$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Carousel f35604n;

        @Override // java.lang.Runnable
        public void run() {
            this.f35604n.M7.setProgress(0.0f);
            this.f35604n.Xw();
            this.f35604n.Xw.n(this.f35604n.P5);
            float velocity = this.f35604n.M7.getVelocity();
            if (this.f35604n.f35597I != 2 || velocity <= this.f35604n.f35596GR || this.f35604n.P5 >= this.f35604n.Xw.count() - 1) {
                return;
            }
            final float f3 = velocity * this.f35604n.f35598J;
            if (this.f35604n.P5 != 0 || this.f35604n.f35600U <= this.f35604n.P5) {
                if (this.f35604n.P5 != this.f35604n.Xw.count() - 1 || this.f35604n.f35600U >= this.f35604n.P5) {
                    this.f35604n.M7.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1.this.f35604n.M7.Org(5, 1.0f, f3);
                        }
                    });
                }
            }
        }
    }

    public interface Adapter {
        int count();

        void n(int i2);

        void rl(View view, int i2);
    }

    private boolean bzg(int i2, boolean z2) {
        MotionLayout motionLayout;
        MotionScene.Transition transitionPJg;
        if (i2 == -1 || (motionLayout = this.M7) == null || (transitionPJg = motionLayout.pJg(i2)) == null || z2 == transitionPJg.aYN()) {
            return false;
        }
        transitionPJg.g(z2);
        return true;
    }

    private boolean U(View view, int i2) {
        MotionLayout motionLayout = this.M7;
        if (motionLayout == null) {
            return false;
        }
        boolean zJB = false;
        for (int i3 : motionLayout.getConstraintSetIds()) {
            zJB |= jB(i3, view, i2);
        }
        return zJB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xw() {
        Adapter adapter = this.Xw;
        if (adapter == null || this.M7 == null || adapter.count() == 0) {
            return;
        }
        int size = this.jB.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.jB.get(i2);
            int iCount = (this.P5 + i2) - this.f35593D;
            if (this.eF) {
                if (iCount < 0) {
                    int i3 = this.f35601a;
                    if (i3 != 4) {
                        U(view, i3);
                    } else {
                        U(view, 0);
                    }
                    if (iCount % this.Xw.count() == 0) {
                        this.Xw.rl(view, 0);
                    } else {
                        Adapter adapter2 = this.Xw;
                        adapter2.rl(view, adapter2.count() + (iCount % this.Xw.count()));
                    }
                } else if (iCount >= this.Xw.count()) {
                    if (iCount == this.Xw.count()) {
                        iCount = 0;
                    } else if (iCount > this.Xw.count()) {
                        iCount %= this.Xw.count();
                    }
                    int i5 = this.f35601a;
                    if (i5 != 4) {
                        U(view, i5);
                    } else {
                        U(view, 0);
                    }
                    this.Xw.rl(view, iCount);
                } else {
                    U(view, 0);
                    this.Xw.rl(view, iCount);
                }
            } else if (iCount < 0) {
                U(view, this.f35601a);
            } else if (iCount >= this.Xw.count()) {
                U(view, this.f35601a);
            } else {
                U(view, 0);
                this.Xw.rl(view, iCount);
            }
        }
        int i7 = this.Nxk;
        if (i7 != -1 && i7 != this.P5) {
            this.M7.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.j
                @Override // java.lang.Runnable
                public final void run() {
                    Carousel.e(this.f35641n);
                }
            });
        } else if (i7 == this.P5) {
            this.Nxk = -1;
        }
        if (this.f35594E == -1 || this.f35599M == -1) {
            Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.eF) {
            return;
        }
        int iCount2 = this.Xw.count();
        if (this.P5 == 0) {
            bzg(this.f35594E, false);
        } else {
            bzg(this.f35594E, true);
            this.M7.setTransition(this.f35594E);
        }
        if (this.P5 == iCount2 - 1) {
            bzg(this.f35599M, false);
        } else {
            bzg(this.f35599M, true);
            this.M7.setTransition(this.f35599M);
        }
    }

    public static /* synthetic */ void e(Carousel carousel) {
        carousel.M7.setTransitionDuration(carousel.f35602k);
        if (carousel.Nxk < carousel.P5) {
            carousel.M7.hRu(carousel.f35595FX, carousel.f35602k);
        } else {
            carousel.M7.hRu(carousel.f35592B, carousel.f35602k);
        }
    }

    private boolean jB(int i2, View view, int i3) {
        ConstraintSet.Constraint constraintXQ;
        ConstraintSet constraintSetETf = this.M7.eTf(i2);
        if (constraintSetETf == null || (constraintXQ = constraintSetETf.XQ(view.getId())) == null) {
            return false;
        }
        constraintXQ.f35967t.f36004t = 1;
        view.setVisibility(i3);
        return true;
    }

    public int getCount() {
        Adapter adapter = this.Xw;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.P5;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void n(MotionLayout motionLayout, int i2, int i3, float f3) {
        this.dR0 = i2;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void rl(MotionLayout motionLayout, int i2) {
        int i3 = this.P5;
        this.f35600U = i3;
        if (i2 == this.f35592B) {
            this.P5 = i3 + 1;
        } else if (i2 == this.f35595FX) {
            this.P5 = i3 - 1;
        }
        if (this.eF) {
            if (this.P5 >= this.Xw.count()) {
                this.P5 = 0;
            }
            if (this.P5 < 0) {
                this.P5 = this.Xw.count() - 1;
            }
        } else {
            if (this.P5 >= this.Xw.count()) {
                this.P5 = this.Xw.count() - 1;
            }
            if (this.P5 < 0) {
                this.P5 = 0;
            }
        }
        if (this.f35600U != this.P5) {
            this.M7.post(this.f35603z);
        }
    }

    public void setAdapter(Adapter adapter) {
        this.Xw = adapter;
    }

    public void setInfinite(boolean z2) {
        this.eF = z2;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.jB.clear();
            for (int i2 = 0; i2 < this.f35900t; i2++) {
                int i3 = this.f35897n[i2];
                View viewIk = motionLayout.Ik(i3);
                if (this.p5 == i3) {
                    this.f35593D = i2;
                }
                this.jB.add(viewIk);
            }
            this.M7 = motionLayout;
            if (this.f35597I == 2) {
                MotionScene.Transition transitionPJg = motionLayout.pJg(this.f35599M);
                if (transitionPJg != null) {
                    transitionPJg.iF(5);
                }
                MotionScene.Transition transitionPJg2 = this.M7.pJg(this.f35594E);
                if (transitionPJg2 != null) {
                    transitionPJg2.iF(5);
                }
            }
            Xw();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.jB.clear();
    }
}
