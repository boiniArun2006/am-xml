package IzQ;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.view.BackEventCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Wre extends IzQ.j {
    private final float KN;
    private final float Uo;

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Wre.this.rl.setTranslationY(0.0f);
            Wre.this.gh(0.0f);
        }
    }

    private Animator Uo() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.rl, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.rl, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.rl;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet;
    }

    public void KN(BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.rl, (Property<View, Float>) View.TRANSLATION_Y, this.rl.getHeight() * this.rl.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(G7.j.t(this.f4407t, this.nr, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new j());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public Wre(View view) {
        super(view);
        Resources resources = view.getResources();
        this.Uo = resources.getDimension(Rxk.Ml.xMQ);
        this.KN = resources.getDimension(Rxk.Ml.mUb);
    }

    public void J2() {
        if (super.rl() == null) {
            return;
        }
        Animator animatorUo = Uo();
        animatorUo.setDuration(this.f4405O);
        animatorUo.start();
    }

    public void gh(float f3) {
        float f4;
        float fN = n(f3);
        float width = this.rl.getWidth();
        float height = this.rl.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f5 = this.Uo / width;
            float f6 = this.KN / height;
            float fN2 = 1.0f - G7.j.n(0.0f, f5, fN);
            float fN3 = 1.0f - G7.j.n(0.0f, f6, fN);
            this.rl.setScaleX(fN2);
            this.rl.setPivotY(height);
            this.rl.setScaleY(fN3);
            View view = this.rl;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotY(-childAt.getTop());
                    if (fN3 != 0.0f) {
                        f4 = fN2 / fN3;
                    } else {
                        f4 = 1.0f;
                    }
                    childAt.setScaleY(f4);
                }
            }
        }
    }

    public void mUb(BackEventCompat backEventCompat) {
        super.nr(backEventCompat);
    }

    public void qie(BackEventCompat backEventCompat) {
        if (super.O(backEventCompat) == null) {
            return;
        }
        gh(backEventCompat.getProgress());
    }

    public void xMQ(BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        Animator animatorUo = Uo();
        animatorUo.setDuration(G7.j.t(this.f4407t, this.nr, backEventCompat.getProgress()));
        if (animatorListener != null) {
            animatorUo.addListener(animatorListener);
        }
        animatorUo.start();
    }
}
