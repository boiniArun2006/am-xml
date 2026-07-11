package androidx.transition;

import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class VisibilityPropagation extends TransitionPropagation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f42285n = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int nr(TransitionValues transitionValues, int i2) {
        int[] iArr;
        if (transitionValues == null || (iArr = (int[]) transitionValues.f42259n.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i2];
    }

    public int J2(TransitionValues transitionValues) {
        return nr(transitionValues, 0);
    }

    public int Uo(TransitionValues transitionValues) {
        return nr(transitionValues, 1);
    }

    public int O(TransitionValues transitionValues) {
        Integer num;
        if (transitionValues == null || (num = (Integer) transitionValues.f42259n.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    @Override // androidx.transition.TransitionPropagation
    public void n(TransitionValues transitionValues) {
        View view = transitionValues.rl;
        Integer numValueOf = (Integer) transitionValues.f42259n.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        transitionValues.f42259n.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        transitionValues.f42259n.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.TransitionPropagation
    public String[] rl() {
        return f42285n;
    }
}
