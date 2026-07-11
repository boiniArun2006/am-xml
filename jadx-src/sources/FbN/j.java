package FbN;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: FbN.j$j, reason: collision with other inner class name */
    public static class C0096j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2764n;
        public int rl;
    }

    public static void rl(C0096j c0096j, float f3, ViewGroup.LayoutParams layoutParams, int i2, int i3) {
        if (f3 <= 0.0f || layoutParams == null) {
            return;
        }
        if (n(layoutParams.height)) {
            c0096j.rl = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0096j.f2764n) - i2) / f3) + i3), c0096j.rl), 1073741824);
        } else if (n(layoutParams.width)) {
            c0096j.f2764n = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0096j.rl) - i3) * f3) + i2), c0096j.f2764n), 1073741824);
        }
    }

    private static boolean n(int i2) {
        return i2 == 0 || i2 == -2;
    }
}
