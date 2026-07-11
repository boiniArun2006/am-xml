package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class ViewUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ViewUtilsApi19 f42270n;
    static final Property rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Property f42271t;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f42270n = new ViewUtilsApi29();
        } else {
            f42270n = new ViewUtilsApi23();
        }
        rl = new Property<View, Float>(Float.class, "translationAlpha") { // from class: androidx.transition.ViewUtils.1
            @Override // android.util.Property
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Float get(View view) {
                return Float.valueOf(ViewUtils.rl(view));
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void set(View view, Float f3) {
                ViewUtils.J2(view, f3.floatValue());
            }
        };
        f42271t = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: androidx.transition.ViewUtils.2
            @Override // android.util.Property
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Rect get(View view) {
                return view.getClipBounds();
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void set(View view, Rect rect) {
                view.setClipBounds(rect);
            }
        };
    }

    static void J2(View view, float f3) {
        f42270n.Uo(view, f3);
    }

    static void KN(View view, Matrix matrix) {
        f42270n.xMQ(view, matrix);
    }

    static void O(View view, int i2, int i3, int i5, int i7) {
        f42270n.J2(view, i2, i3, i5, i7);
    }

    static void Uo(View view, int i2) {
        f42270n.KN(view, i2);
    }

    static void n(View view) {
        f42270n.n(view);
    }

    static void nr(View view, Matrix matrix) {
        f42270n.O(view, matrix);
    }

    static float rl(View view) {
        return f42270n.t(view);
    }

    static void t(View view) {
        f42270n.nr(view);
    }

    static void xMQ(View view, Matrix matrix) {
        f42270n.mUb(view, matrix);
    }
}
