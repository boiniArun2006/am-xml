package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class ViewPropertyAnimatorCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference f36796n;

    @RequiresApi
    static class Api21Impl {
    }

    private void KN(final View view, final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    viewPropertyAnimatorListener.n(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorListener.rl(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    viewPropertyAnimatorListener.t(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public ViewPropertyAnimatorCompat J2(Interpolator interpolator) {
        View view = (View) this.f36796n.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat O(long j2) {
        View view = (View) this.f36796n.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat Uo(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = (View) this.f36796n.get();
        if (view != null) {
            KN(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    public void gh() {
        View view = (View) this.f36796n.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ViewPropertyAnimatorCompat mUb(final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final View view = (View) this.f36796n.get();
        if (view != null) {
            view.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.ci
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    viewPropertyAnimatorUpdateListener.n(view);
                }
            } : null);
        }
        return this;
    }

    public long nr() {
        View view = (View) this.f36796n.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public ViewPropertyAnimatorCompat qie(float f3) {
        View view = (View) this.f36796n.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rl(float f3) {
        View view = (View) this.f36796n.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
        return this;
    }

    public void t() {
        View view = (View) this.f36796n.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public ViewPropertyAnimatorCompat xMQ(long j2) {
        View view = (View) this.f36796n.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    ViewPropertyAnimatorCompat(View view) {
        this.f36796n = new WeakReference(view);
    }
}
