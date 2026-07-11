package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class ViewTransition {
    Context HI;
    private int Ik;
    KeyFrames J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f35797O;
    ConstraintSet.Constraint Uo;
    private String az;
    private int ck;
    private String gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35798n;
    private int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35799o;
    private int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35800r;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35801t;
    private int ty;
    private int xMQ;

    static class Animate {
        boolean HI;
        int J2;
        ViewTransitionController KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f35803O;
        long az;
        float gh;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f35804n;
        MotionController nr;
        float qie;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f35805t;
        Interpolator xMQ;
        KeyCache Uo = new KeyCache();
        boolean mUb = false;
        Rect ty = new Rect();

        public void nr(int i2, float f3, float f4) {
            if (i2 == 1) {
                if (this.mUb) {
                    return;
                }
                O(true);
            } else {
                if (i2 != 2) {
                    return;
                }
                this.nr.S().getHitRect(this.ty);
                if (this.ty.contains((int) f3, (int) f4) || this.mUb) {
                    return;
                }
                O(true);
            }
        }

        void O(boolean z2) {
            int i2;
            this.mUb = z2;
            if (z2 && (i2 = this.J2) != -1) {
                this.qie = i2 == 0 ? Float.MAX_VALUE : 1.0f / i2;
            }
            this.KN.nr();
            this.az = System.nanoTime();
        }

        void n() {
            if (this.mUb) {
                t();
            } else {
                rl();
            }
        }

        Animate(ViewTransitionController viewTransitionController, MotionController motionController, int i2, int i3, int i5, Interpolator interpolator, int i7, int i8) {
            float f3;
            this.HI = false;
            this.KN = viewTransitionController;
            this.nr = motionController;
            this.f35803O = i2;
            this.J2 = i3;
            long jNanoTime = System.nanoTime();
            this.f35805t = jNanoTime;
            this.az = jNanoTime;
            this.KN.n(this);
            this.xMQ = interpolator;
            this.f35804n = i7;
            this.rl = i8;
            if (i5 == 3) {
                this.HI = true;
            }
            if (i2 == 0) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f / i2;
            }
            this.qie = f3;
            n();
        }

        void rl() {
            float interpolation;
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.az;
            this.az = jNanoTime;
            float f3 = this.gh + (((float) (j2 * 1.0E-6d)) * this.qie);
            this.gh = f3;
            if (f3 >= 1.0f) {
                this.gh = 1.0f;
            }
            Interpolator interpolator = this.xMQ;
            if (interpolator == null) {
                interpolation = this.gh;
            } else {
                interpolation = interpolator.getInterpolation(this.gh);
            }
            float f4 = interpolation;
            MotionController motionController = this.nr;
            boolean zAYN = motionController.aYN(motionController.rl, f4, jNanoTime, this.Uo);
            if (this.gh >= 1.0f) {
                if (this.f35804n != -1) {
                    this.nr.S().setTag(this.f35804n, Long.valueOf(System.nanoTime()));
                }
                if (this.rl != -1) {
                    this.nr.S().setTag(this.rl, null);
                }
                if (!this.HI) {
                    this.KN.O(this);
                }
            }
            if (this.gh >= 1.0f && !zAYN) {
                return;
            }
            this.KN.nr();
        }

        void t() {
            float interpolation;
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.az;
            this.az = jNanoTime;
            float f3 = this.gh - (((float) (j2 * 1.0E-6d)) * this.qie);
            this.gh = f3;
            if (f3 < 0.0f) {
                this.gh = 0.0f;
            }
            Interpolator interpolator = this.xMQ;
            if (interpolator == null) {
                interpolation = this.gh;
            } else {
                interpolation = interpolator.getInterpolation(this.gh);
            }
            float f4 = interpolation;
            MotionController motionController = this.nr;
            boolean zAYN = motionController.aYN(motionController.rl, f4, jNanoTime, this.Uo);
            if (this.gh <= 0.0f) {
                if (this.f35804n != -1) {
                    this.nr.S().setTag(this.f35804n, Long.valueOf(System.nanoTime()));
                }
                if (this.rl != -1) {
                    this.nr.S().setTag(this.rl, null);
                }
                this.KN.O(this);
            }
            if (this.gh <= 0.0f && !zAYN) {
                return;
            }
            this.KN.nr();
        }
    }

    boolean Uo(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.mUb == -1 && this.gh == null) || !nr(view)) {
            return false;
        }
        if (view.getId() == this.mUb) {
            return true;
        }
        return this.gh != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f35938a) != null && str.matches(this.gh);
    }

    public static /* synthetic */ void n(ViewTransition viewTransition, View[] viewArr) {
        if (viewTransition.ck != -1) {
            for (View view : viewArr) {
                view.setTag(viewTransition.ck, Long.valueOf(System.nanoTime()));
            }
        }
        if (viewTransition.Ik != -1) {
            for (View view2 : viewArr) {
                view2.setTag(viewTransition.Ik, null);
            }
        }
    }

    private void xMQ(MotionScene.Transition transition, View view) {
        int i2 = this.KN;
        if (i2 != -1) {
            transition.nY(i2);
        }
        transition.fD(this.nr);
        transition.te(this.qie, this.az, this.ty);
        int id = view.getId();
        KeyFrames keyFrames = this.J2;
        if (keyFrames != null) {
            ArrayList arrayListNr = keyFrames.nr(-1);
            KeyFrames keyFrames2 = new KeyFrames();
            Iterator it = arrayListNr.iterator();
            while (it.hasNext()) {
                keyFrames2.t(((Key) it.next()).clone().KN(id));
            }
            transition.r(keyFrames2);
        }
    }

    Interpolator J2(Context context) {
        int i2 = this.qie;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(context, this.ty);
        }
        if (i2 == -1) {
            final Easing easingT = Easing.t(this.az);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.ViewTransition.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f3) {
                    return (float) easingT.n(f3);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    boolean KN(int i2) {
        int i3 = this.rl;
        return i3 == 1 ? i2 == 0 : i3 == 2 ? i2 == 1 : i3 == 3 && i2 == 0;
    }

    int O() {
        return this.f35798n;
    }

    boolean nr(View view) {
        int i2 = this.f35800r;
        boolean z2 = i2 == -1 || view.getTag(i2) != null;
        int i3 = this.f35799o;
        return z2 && (i3 == -1 || view.getTag(i3) == null);
    }

    void rl(ViewTransitionController viewTransitionController, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.te(view);
        this.J2.n(motionController);
        motionController.N(motionLayout.getWidth(), motionLayout.getHeight(), this.KN, System.nanoTime());
        new Animate(viewTransitionController, motionController, this.KN, this.xMQ, this.rl, J2(motionLayout.getContext()), this.ck, this.Ik);
    }

    void t(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i2, ConstraintSet constraintSet, final View... viewArr) {
        if (this.f35801t) {
            return;
        }
        int i3 = this.f35797O;
        if (i3 == 2) {
            rl(viewTransitionController, motionLayout, viewArr[0]);
            return;
        }
        if (i3 == 1) {
            for (int i5 : motionLayout.getConstraintSetIds()) {
                if (i5 != i2) {
                    ConstraintSet constraintSetETf = motionLayout.eTf(i5);
                    for (View view : viewArr) {
                        ConstraintSet.Constraint constraintXQ = constraintSetETf.XQ(view.getId());
                        ConstraintSet.Constraint constraint = this.Uo;
                        if (constraint != null) {
                            constraint.nr(constraintXQ);
                            constraintXQ.Uo.putAll(this.Uo.Uo);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.HI(constraintSet);
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraintXQ2 = constraintSet2.XQ(view2.getId());
            ConstraintSet.Constraint constraint2 = this.Uo;
            if (constraint2 != null) {
                constraint2.nr(constraintXQ2);
                constraintXQ2.Uo.putAll(this.Uo.Uo);
            }
        }
        motionLayout.How(i2, constraintSet2);
        int i7 = R.id.f36014n;
        motionLayout.How(i7, constraintSet);
        motionLayout.Jk(i7, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(-1, motionLayout.f35725a, i7, i2);
        for (View view3 : viewArr) {
            xMQ(transition, view3);
        }
        motionLayout.setTransition(transition);
        motionLayout.GD(new Runnable() { // from class: androidx.constraintlayout.motion.widget.j
            @Override // java.lang.Runnable
            public final void run() {
                ViewTransition.n(this.f35809n, viewArr);
            }
        });
    }

    public String toString() {
        return "ViewTransition(" + Debug.t(this.HI, this.f35798n) + ")";
    }
}
