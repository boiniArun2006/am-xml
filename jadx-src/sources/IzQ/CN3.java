package IzQ;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.view.BackEventCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class CN3 extends IzQ.j {
    private final float KN;
    private final float Uo;
    private final float xMQ;

    class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f4401n;
        final /* synthetic */ int rl;

        j(boolean z2, int i2) {
            this.f4401n = z2;
            this.rl = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CN3.this.rl.setTranslationX(0.0f);
            CN3.this.gh(0.0f, this.f4401n, this.rl);
        }
    }

    public void J2() {
        if (super.rl() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.rl, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.rl, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.rl;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f4405O);
        animatorSet.start();
    }

    public void KN(BackEventCompat backEventCompat, int i2, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z2 = backEventCompat.getSwipeEdge() == 0;
        boolean zUo = Uo(i2, 3);
        float width = (this.rl.getWidth() * this.rl.getScaleX()) + xMQ(zUo);
        View view = this.rl;
        Property property = View.TRANSLATION_X;
        if (zUo) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(G7.j.t(this.f4407t, this.nr, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new j(z2, i2));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    private boolean Uo(int i2, int i3) {
        return (GravityCompat.rl(i2, ViewCompat.nY(this.rl)) & i3) == i3;
    }

    private int xMQ(boolean z2) {
        ViewGroup.LayoutParams layoutParams = this.rl.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public CN3(View view) {
        super(view);
        Resources resources = view.getResources();
        this.Uo = resources.getDimension(Rxk.Ml.qie);
        this.KN = resources.getDimension(Rxk.Ml.gh);
        this.xMQ = resources.getDimension(Rxk.Ml.az);
    }

    public void gh(float f3, boolean z2, int i2) {
        boolean z3;
        int right;
        float f4;
        float f5;
        float fN = n(f3);
        boolean zUo = Uo(i2, 3);
        if (z2 == zUo) {
            z3 = true;
        } else {
            z3 = false;
        }
        int width = this.rl.getWidth();
        int height = this.rl.getHeight();
        float f6 = width;
        if (f6 > 0.0f) {
            float f7 = height;
            if (f7 > 0.0f) {
                float f8 = this.Uo / f6;
                float f9 = this.KN / f6;
                float f10 = this.xMQ / f7;
                View view = this.rl;
                if (zUo) {
                    f6 = 0.0f;
                }
                view.setPivotX(f6);
                if (!z3) {
                    f9 = -f8;
                }
                float fN2 = G7.j.n(0.0f, f9, fN);
                float f11 = fN2 + 1.0f;
                this.rl.setScaleX(f11);
                float fN3 = 1.0f - G7.j.n(0.0f, f10, fN);
                this.rl.setScaleY(fN3);
                View view2 = this.rl;
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (zUo) {
                            right = (width - childAt.getRight()) + childAt.getWidth();
                        } else {
                            right = -childAt.getLeft();
                        }
                        childAt.setPivotX(right);
                        childAt.setPivotY(-childAt.getTop());
                        if (z3) {
                            f4 = 1.0f - fN2;
                        } else {
                            f4 = 1.0f;
                        }
                        if (fN3 != 0.0f) {
                            f5 = (f11 / fN3) * f4;
                        } else {
                            f5 = 1.0f;
                        }
                        childAt.setScaleX(f4);
                        childAt.setScaleY(f5);
                    }
                }
            }
        }
    }

    public void mUb(BackEventCompat backEventCompat) {
        super.nr(backEventCompat);
    }

    public void qie(BackEventCompat backEventCompat, int i2) {
        boolean z2;
        if (super.O(backEventCompat) == null) {
            return;
        }
        if (backEventCompat.getSwipeEdge() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        gh(backEventCompat.getProgress(), z2, i2);
    }
}
