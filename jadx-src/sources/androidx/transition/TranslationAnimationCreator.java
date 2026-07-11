package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class TranslationAnimationCreator {

    private static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final float J2;
        private boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private float f42263O;
        private final float Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f42264n;
        private float nr;
        private final View rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int[] f42265t;

        @Override // androidx.transition.Transition.TransitionListener
        public void O(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
            this.KN = true;
            this.rl.setTranslationX(this.J2);
            this.rl.setTranslationY(this.Uo);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.KN = true;
            this.rl.setTranslationX(this.J2);
            this.rl.setTranslationY(this.Uo);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            this.rl.setTranslationX(this.J2);
            this.rl.setTranslationY(this.Uo);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
            KN(transition, false);
        }

        private void n() {
            if (this.f42265t == null) {
                this.f42265t = new int[2];
            }
            this.rl.getLocationOnScreen(this.f42265t);
            this.f42264n.setTag(R.id.xMQ, this.f42265t);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void KN(Transition transition, boolean z2) {
            if (this.KN) {
                return;
            }
            this.f42264n.setTag(R.id.xMQ, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
            this.rl.setTranslationX(this.nr);
            this.rl.setTranslationY(this.f42263O);
        }

        TransitionPositionListener(View view, View view2, float f3, float f4) {
            this.rl = view;
            this.f42264n = view2;
            this.J2 = f3;
            this.Uo = f4;
            int i2 = R.id.xMQ;
            int[] iArr = (int[]) view2.getTag(i2);
            this.f42265t = iArr;
            if (iArr != null) {
                view2.setTag(i2, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
            n();
            this.nr = this.rl.getTranslationX();
            this.f42263O = this.rl.getTranslationY();
            this.rl.setTranslationX(this.J2);
            this.rl.setTranslationY(this.Uo);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }

    static Animator n(View view, TransitionValues transitionValues, int i2, int i3, float f3, float f4, float f5, float f6, TimeInterpolator timeInterpolator, Transition transition) {
        float f7;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.rl.getTag(R.id.xMQ)) != null) {
            f3 = (r5[0] - i2) + translationX;
            f7 = (r5[1] - i3) + translationY;
        } else {
            f7 = f4;
        }
        view.setTranslationX(f3);
        view.setTranslationY(f7);
        if (f3 == f5 && f7 == f6) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f3, f5), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f7, f6));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view, transitionValues.rl, translationX, translationY);
        transition.t(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
