package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class AnimateLayoutChangeDetector {
    private static final ViewGroup.MarginLayoutParams rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearLayoutManager f42435n;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        rl = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    private boolean n() {
        int top;
        int i2;
        int bottom;
        int i3;
        int iM = this.f42435n.M();
        if (iM == 0) {
            return true;
        }
        boolean z2 = this.f42435n.C7B() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM, 2);
        for (int i5 = 0; i5 < iM; i5++) {
            View viewE = this.f42435n.E(i5);
            if (viewE == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewE.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : rl;
            int[] iArr2 = iArr[i5];
            if (z2) {
                top = viewE.getLeft();
                i2 = marginLayoutParams.leftMargin;
            } else {
                top = viewE.getTop();
                i2 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i2;
            int[] iArr3 = iArr[i5];
            if (z2) {
                bottom = viewE.getRight();
                i3 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewE.getBottom();
                i3 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i3;
        }
        Arrays.sort(iArr, new Comparator<int[]>() { // from class: androidx.viewpager2.widget.AnimateLayoutChangeDetector.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public int compare(int[] iArr4, int[] iArr5) {
                return iArr4[0] - iArr5[0];
            }
        });
        for (int i7 = 1; i7 < iM; i7++) {
            if (iArr[i7 - 1][1] != iArr[i7][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i8 = iArr4[1];
        int i9 = iArr4[0];
        return i9 <= 0 && iArr[iM - 1][1] >= i8 - i9;
    }

    private boolean rl() {
        int iM = this.f42435n.M();
        for (int i2 = 0; i2 < iM; i2++) {
            if (t(this.f42435n.E(i2))) {
                return true;
            }
        }
        return false;
    }

    private static boolean t(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (t(viewGroup.getChildAt(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    AnimateLayoutChangeDetector(LinearLayoutManager linearLayoutManager) {
        this.f42435n = linearLayoutManager;
    }

    boolean nr() {
        if ((!n() || this.f42435n.M() <= 1) && rl()) {
            return true;
        }
        return false;
    }
}
