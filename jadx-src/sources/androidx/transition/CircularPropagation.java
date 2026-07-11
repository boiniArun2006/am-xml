package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CircularPropagation extends VisibilityPropagation {
    private float rl;

    private static float KN(float f3, float f4, float f5, float f6) {
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        return (float) Math.sqrt((f7 * f7) + (f8 * f8));
    }

    @Override // androidx.transition.TransitionPropagation
    public long t(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        int iRound;
        int iCenterX;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 == null || O(transitionValues) == 0) {
            i2 = -1;
        } else {
            transitionValues = transitionValues2;
            i2 = 1;
        }
        int iJ2 = J2(transitionValues);
        int iUo = Uo(transitionValues);
        Rect rectXQ = transition.XQ();
        if (rectXQ != null) {
            iCenterX = rectXQ.centerX();
            iRound = rectXQ.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fKN = KN(iJ2, iUo, iCenterX, iRound) / KN(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long jZ = transition.Z();
        if (jZ < 0) {
            jZ = 300;
        }
        return Math.round(((jZ * ((long) i2)) / this.rl) * fKN);
    }
}
