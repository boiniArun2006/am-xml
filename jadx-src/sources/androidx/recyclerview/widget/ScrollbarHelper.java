package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class ScrollbarHelper {
    static int n(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2) {
        if (layoutManager.M() != 0 && state.rl() != 0 && view != null && view2 != null) {
            if (!z2) {
                return Math.abs(layoutManager.fcU(view) - layoutManager.fcU(view2)) + 1;
            }
            return Math.min(orientationHelper.ty(), orientationHelper.nr(view2) - orientationHelper.Uo(view));
        }
        return 0;
    }

    static int rl(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2, boolean z3) {
        int iMax;
        if (layoutManager.M() == 0 || state.rl() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(layoutManager.fcU(view), layoutManager.fcU(view2));
        int iMax2 = Math.max(layoutManager.fcU(view), layoutManager.fcU(view2));
        if (z3) {
            iMax = Math.max(0, (state.rl() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z2) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(orientationHelper.nr(view2) - orientationHelper.Uo(view)) / (Math.abs(layoutManager.fcU(view) - layoutManager.fcU(view2)) + 1))) + (orientationHelper.az() - orientationHelper.Uo(view)));
    }

    static int t(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2) {
        if (layoutManager.M() != 0 && state.rl() != 0 && view != null && view2 != null) {
            if (!z2) {
                return state.rl();
            }
            return (int) (((orientationHelper.nr(view2) - orientationHelper.Uo(view)) / (Math.abs(layoutManager.fcU(view) - layoutManager.fcU(view2)) + 1)) * state.rl());
        }
        return 0;
    }
}
