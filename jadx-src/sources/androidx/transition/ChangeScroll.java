package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ChangeScroll extends Transition {
    private static final String[] ofS = {"android:changeScroll:x", "android:changeScroll:y"};

    @Override // androidx.transition.Transition
    public Animator ck(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.rl;
        int iIntValue = ((Integer) transitionValues.f42259n.get("android:changeScroll:x")).intValue();
        int iIntValue2 = ((Integer) transitionValues2.f42259n.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) transitionValues.f42259n.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) transitionValues2.f42259n.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return TransitionUtils.t(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    @Override // androidx.transition.Transition
    public boolean v() {
        return true;
    }

    private void pJg(TransitionValues transitionValues) {
        transitionValues.f42259n.put("android:changeScroll:x", Integer.valueOf(transitionValues.rl.getScrollX()));
        transitionValues.f42259n.put("android:changeScroll:y", Integer.valueOf(transitionValues.rl.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public String[] nHg() {
        return ofS;
    }

    @Override // androidx.transition.Transition
    public void qie(TransitionValues transitionValues) {
        pJg(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void xMQ(TransitionValues transitionValues) {
        pJg(transitionValues);
    }
}
