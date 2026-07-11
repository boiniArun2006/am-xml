package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Fade extends Visibility {

    private static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f42167n;
        private boolean rl = false;

        @Override // androidx.transition.Transition.TransitionListener
        public void O(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void qie(Transition transition, boolean z2) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
            this.f42167n.setTag(R.id.KN, Float.valueOf(this.f42167n.getVisibility() == 0 ? ViewUtils.rl(this.f42167n) : 0.0f));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
            this.f42167n.setTag(R.id.KN, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ViewUtils.J2(this.f42167n, 1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (this.rl) {
                this.f42167n.setLayerType(0, null);
            }
            if (z2) {
                return;
            }
            ViewUtils.J2(this.f42167n, 1.0f);
            ViewUtils.n(this.f42167n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f42167n.hasOverlappingRendering() && this.f42167n.getLayerType() == 0) {
                this.rl = true;
                this.f42167n.setLayerType(2, null);
            }
        }

        FadeAnimatorListener(View view) {
            this.f42167n = view;
        }
    }

    public Fade(int i2) {
        eWT(i2);
    }

    @Override // androidx.transition.Transition
    public boolean v() {
        return true;
    }

    private static float n1(TransitionValues transitionValues, float f3) {
        Float f4;
        return (transitionValues == null || (f4 = (Float) transitionValues.f42259n.get("android:fade:transitionAlpha")) == null) ? f3 : f4.floatValue();
    }

    private Animator ul(View view, float f3, float f4) {
        if (f3 == f4) {
            return null;
        }
        ViewUtils.J2(view, f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewUtils.rl, f4);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        objectAnimatorOfFloat.addListener(fadeAnimatorListener);
        te().t(fadeAnimatorListener);
        return objectAnimatorOfFloat;
    }

    public Fade() {
    }

    @Override // androidx.transition.Visibility
    public Animator C(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.t(view);
        return ul(view, n1(transitionValues, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator G7(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.t(view);
        Animator animatorUl = ul(view, n1(transitionValues, 1.0f), 0.0f);
        if (animatorUl == null) {
            ViewUtils.J2(view, n1(transitionValues2, 1.0f));
        }
        return animatorUl;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void qie(TransitionValues transitionValues) {
        super.qie(transitionValues);
        Float fValueOf = (Float) transitionValues.rl.getTag(R.id.KN);
        if (fValueOf == null) {
            if (transitionValues.rl.getVisibility() == 0) {
                fValueOf = Float.valueOf(ViewUtils.rl(transitionValues.rl));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        transitionValues.f42259n.put("android:fade:transitionAlpha", fValueOf);
    }
}
