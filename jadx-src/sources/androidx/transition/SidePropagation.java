package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class SidePropagation extends VisibilityPropagation {
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42202t;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int KN(View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
        int i12 = this.f42202t;
        if (i12 == 8388611) {
            i12 = view.getLayoutDirection() == 1 ? 5 : 3;
        } else if (i12 == 8388613) {
            if (view.getLayoutDirection() == 1) {
            }
        }
        if (i12 == 3) {
            return (i10 - i2) + Math.abs(i7 - i3);
        }
        if (i12 == 5) {
            return (i2 - i8) + Math.abs(i7 - i3);
        }
        if (i12 == 48) {
            return (i11 - i3) + Math.abs(i5 - i2);
        }
        if (i12 != 80) {
            return 0;
        }
        return (i3 - i9) + Math.abs(i5 - i2);
    }

    private int xMQ(ViewGroup viewGroup) {
        int i2 = this.f42202t;
        return (i2 == 3 || i2 == 5 || i2 == 8388611 || i2 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.TransitionPropagation
    public long t(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        int i3;
        int iCenterY;
        int i5;
        ViewGroup viewGroup2;
        int i7;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Rect rectXQ = transition.XQ();
        if (transitionValues2 == null || O(transitionValues3) == 0) {
            i2 = -1;
        } else {
            transitionValues3 = transitionValues2;
            i2 = 1;
        }
        int iJ2 = J2(transitionValues3);
        int iUo = Uo(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectXQ != null) {
            int iCenterX = rectXQ.centerX();
            i5 = iUo;
            viewGroup2 = viewGroup;
            i7 = iRound2;
            iCenterY = rectXQ.centerY();
            i3 = iCenterX;
        } else {
            i3 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i5 = iUo;
            viewGroup2 = viewGroup;
            i7 = iRound2;
        }
        float fKN = KN(viewGroup2, iJ2, i5, i3, iCenterY, iRound, i7, width, height) / xMQ(viewGroup);
        long jZ = transition.Z();
        if (jZ < 0) {
            jZ = 300;
        }
        return Math.round(((jZ * ((long) i2)) / this.rl) * fKN);
    }
}
