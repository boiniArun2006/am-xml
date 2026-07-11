package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class FragmentAnim {

    static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f38543O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewGroup f38544n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f38545r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final View f38546t;

        EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f38545r = true;
            this.f38544n = viewGroup;
            this.f38546t = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f38545r = true;
            if (this.f38543O) {
                return !this.J2;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f38543O = true;
                OneShotPreDrawListener.n(this.f38544n, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38543O || !this.f38545r) {
                this.f38544n.endViewTransition(this.f38546t);
                this.J2 = true;
            } else {
                this.f38545r = false;
                this.f38544n.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f3) {
            this.f38545r = true;
            if (this.f38543O) {
                return !this.J2;
            }
            if (!super.getTransformation(j2, transformation, f3)) {
                this.f38543O = true;
                OneShotPreDrawListener.n(this.f38544n, this);
            }
            return true;
        }
    }

    private static int n(Fragment fragment, boolean z2, boolean z3) {
        return z3 ? z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    private static int nr(Context context, int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? R.animator.f38459O : R.animator.J2;
        }
        if (i2 == 8194) {
            return z2 ? R.animator.f38460n : R.animator.rl;
        }
        if (i2 == 8197) {
            return z2 ? t(context, android.R.attr.activityCloseEnterAnimation) : t(context, android.R.attr.activityCloseExitAnimation);
        }
        if (i2 == 4099) {
            return z2 ? R.animator.f38461t : R.animator.nr;
        }
        if (i2 != 4100) {
            return -1;
        }
        return z2 ? t(context, android.R.attr.activityOpenEnterAnimation) : t(context, android.R.attr.activityOpenExitAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static AnimationOrAnimator rl(Context context, Fragment fragment, boolean z2, boolean z3) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int iN = n(fragment, z2, z3);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i2 = R.id.f38463t;
            if (viewGroup.getTag(i2) != null) {
                fragment.mContainer.setTag(i2, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, iN);
        if (animationOnCreateAnimation != null) {
            return new AnimationOrAnimator(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, iN);
        if (animatorOnCreateAnimator != null) {
            return new AnimationOrAnimator(animatorOnCreateAnimator);
        }
        if (iN == 0 && nextTransition != 0) {
            iN = nr(context, nextTransition, z2);
        }
        if (iN != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iN));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iN);
                    if (animationLoadAnimation != null) {
                        return new AnimationOrAnimator(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iN);
                        if (animatorLoadAnimator != null) {
                        }
                    } catch (RuntimeException e3) {
                        if (!zEquals) {
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iN);
                            if (animationLoadAnimation2 != null) {
                                return new AnimationOrAnimator(animationLoadAnimation2);
                            }
                        } else {
                            throw e3;
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iN);
                if (animatorLoadAnimator != null) {
                    return new AnimationOrAnimator(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int t(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    static class AnimationOrAnimator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Animation f38542n;
        public final AnimatorSet rl;

        AnimationOrAnimator(Animation animation) {
            this.f38542n = animation;
            this.rl = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        AnimationOrAnimator(Animator animator) {
            this.f38542n = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.rl = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }
}
