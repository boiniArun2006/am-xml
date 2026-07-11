package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class ViewParentCompat {

    @RequiresApi
    static class Api21Impl {
        static boolean J2(ViewParent viewParent, View view, View view2, int i2) {
            return viewParent.onStartNestedScroll(view, view2, i2);
        }

        static void O(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.onNestedScrollAccepted(view, view2, i2);
        }

        static void Uo(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }

        static boolean n(ViewParent viewParent, View view, float f3, float f4, boolean z2) {
            return viewParent.onNestedFling(view, f3, f4, z2);
        }

        static void nr(ViewParent viewParent, View view, int i2, int i3, int i5, int i7) {
            viewParent.onNestedScroll(view, i2, i3, i5, i7);
        }

        static boolean rl(ViewParent viewParent, View view, float f3, float f4) {
            return viewParent.onNestedPreFling(view, f3, f4);
        }

        static void t(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
            viewParent.onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public static boolean J2(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).HI(view, view2, i2, i3);
        }
        if (i3 != 0) {
            return false;
        }
        try {
            return Api21Impl.J2(viewParent, view, view2, i2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
            return false;
        }
    }

    public static void O(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).xMQ(view, view2, i2, i3);
            return;
        }
        if (i3 == 0) {
            try {
                Api21Impl.O(viewParent, view, view2, i2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }
    }

    public static void Uo(ViewParent viewParent, View view, int i2) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).mUb(view, i2);
            return;
        }
        if (i2 == 0) {
            try {
                Api21Impl.Uo(viewParent, view);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    public static void nr(ViewParent viewParent, View view, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
        if (viewParent instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParent).az(view, i2, i3, i5, i7, i8, iArr);
            return;
        }
        iArr[0] = iArr[0] + i5;
        iArr[1] = iArr[1] + i7;
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).ty(view, i2, i3, i5, i7, i8);
            return;
        }
        if (i8 == 0) {
            try {
                Api21Impl.nr(viewParent, view, i2, i3, i5, i7);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e2);
            }
        }
    }

    public static void t(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i5) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).gh(view, i2, i3, iArr, i5);
            return;
        }
        if (i5 == 0) {
            try {
                Api21Impl.t(viewParent, view, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    public static boolean n(ViewParent viewParent, View view, float f3, float f4, boolean z2) {
        try {
            return Api21Impl.n(viewParent, view, f3, f4, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public static boolean rl(ViewParent viewParent, View view, float f3, float f4) {
        try {
            return Api21Impl.rl(viewParent, view, f3, f4);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }
}
