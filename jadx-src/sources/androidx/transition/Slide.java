package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Slide extends Visibility {
    private CalculateSlide Mx;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final TimeInterpolator f42203G7 = new DecelerateInterpolator();
    private static final TimeInterpolator fcU = new AccelerateInterpolator();
    private static final CalculateSlide eWT = new CalculateSlideHorizontal() { // from class: androidx.transition.Slide.1
        @Override // androidx.transition.Slide.CalculateSlide
        public float rl(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final CalculateSlide ul = new CalculateSlideHorizontal() { // from class: androidx.transition.Slide.2
        @Override // androidx.transition.Slide.CalculateSlide
        public float rl(ViewGroup viewGroup, View view) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final CalculateSlide n1 = new CalculateSlideVertical() { // from class: androidx.transition.Slide.3
        @Override // androidx.transition.Slide.CalculateSlide
        public float n(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    };
    private static final CalculateSlide Jk = new CalculateSlideHorizontal() { // from class: androidx.transition.Slide.4
        @Override // androidx.transition.Slide.CalculateSlide
        public float rl(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final CalculateSlide Rl = new CalculateSlideHorizontal() { // from class: androidx.transition.Slide.5
        @Override // androidx.transition.Slide.CalculateSlide
        public float rl(ViewGroup viewGroup, View view) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final CalculateSlide qm = new CalculateSlideVertical() { // from class: androidx.transition.Slide.6
        @Override // androidx.transition.Slide.CalculateSlide
        public float n(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    };

    private interface CalculateSlide {
        float n(ViewGroup viewGroup, View view);

        float rl(ViewGroup viewGroup, View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GravityFlag {
    }

    @Override // androidx.transition.Transition
    public boolean v() {
        return true;
    }

    private static abstract class CalculateSlideHorizontal implements CalculateSlide {
        private CalculateSlideHorizontal() {
        }

        @Override // androidx.transition.Slide.CalculateSlide
        public float n(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    private static abstract class CalculateSlideVertical implements CalculateSlide {
        private CalculateSlideVertical() {
        }

        @Override // androidx.transition.Slide.CalculateSlide
        public float rl(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    private void pJg(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.rl.getLocationOnScreen(iArr);
        transitionValues.f42259n.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility
    public Animator C(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.f42259n.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return TranslationAnimationCreator.n(view, transitionValues2, iArr[0], iArr[1], this.Mx.rl(viewGroup, view), this.Mx.n(viewGroup, view), translationX, translationY, f42203G7, this);
    }

    @Override // androidx.transition.Visibility
    public Animator G7(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.f42259n.get("android:slide:screenPosition");
        return TranslationAnimationCreator.n(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.Mx.rl(viewGroup, view), this.Mx.n(viewGroup, view), fcU, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void qie(TransitionValues transitionValues) {
        super.qie(transitionValues);
        pJg(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void xMQ(TransitionValues transitionValues) {
        super.xMQ(transitionValues);
        pJg(transitionValues);
    }
}
