package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Explode extends Visibility {

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final TimeInterpolator f42166G7 = new DecelerateInterpolator();
    private static final TimeInterpolator fcU = new AccelerateInterpolator();
    private int[] Mx;

    private static float ul(float f3, float f4) {
        return (float) Math.sqrt((f3 * f3) + (f4 * f4));
    }

    @Override // androidx.transition.Transition
    public boolean v() {
        return true;
    }

    private void Jk(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.Mx);
        int[] iArr2 = this.Mx;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        Rect rectXQ = XQ();
        if (rectXQ == null) {
            width = (view.getWidth() / 2) + i2 + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i3 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = rectXQ.centerX();
            iCenterY = rectXQ.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fUl = ul(fCenterX, fCenterY);
        float fN1 = n1(view, width - i2, iCenterY - i3);
        iArr[0] = Math.round((fCenterX / fUl) * fN1);
        iArr[1] = Math.round(fN1 * (fCenterY / fUl));
    }

    private void pJg(TransitionValues transitionValues) {
        View view = transitionValues.rl;
        view.getLocationOnScreen(this.Mx);
        int[] iArr = this.Mx;
        int i2 = iArr[0];
        int i3 = iArr[1];
        transitionValues.f42259n.put("android:explode:screenBounds", new Rect(i2, i3, view.getWidth() + i2, view.getHeight() + i3));
    }

    @Override // androidx.transition.Visibility
    public Animator C(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues2.f42259n.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Jk(viewGroup, rect, this.Mx);
        int[] iArr = this.Mx;
        return TranslationAnimationCreator.n(view, transitionValues2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f42166G7, this);
    }

    @Override // androidx.transition.Visibility
    public Animator G7(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f3;
        float f4;
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.f42259n.get("android:explode:screenBounds");
        int i2 = rect.left;
        int i3 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.rl.getTag(R.id.xMQ);
        if (iArr != null) {
            f3 = (r7 - rect.left) + translationX;
            f4 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f3 = translationX;
            f4 = translationY;
        }
        Jk(viewGroup, rect, this.Mx);
        int[] iArr2 = this.Mx;
        return TranslationAnimationCreator.n(view, transitionValues, i2, i3, translationX, translationY, f3 + iArr2[0], f4 + iArr2[1], fcU, this);
    }

    private static float n1(View view, int i2, int i3) {
        return ul(Math.max(i2, view.getWidth() - i2), Math.max(i3, view.getHeight() - i3));
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
