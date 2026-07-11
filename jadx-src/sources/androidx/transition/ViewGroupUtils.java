package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
class ViewGroupUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f42268n = true;
    private static Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f42269t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static int n(ViewGroup viewGroup, int i2) {
            return viewGroup.getChildDrawingOrder(i2);
        }

        @DoNotInline
        static void rl(ViewGroup viewGroup, boolean z2) {
            viewGroup.suppressLayout(z2);
        }
    }

    static int n(ViewGroup viewGroup, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.n(viewGroup, i2);
        }
        if (!f42269t) {
            try {
                String str = aNrWBQYwFf.yQQkwenAvegN;
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod(str, cls, cls);
                rl = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f42269t = true;
        }
        Method method = rl;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i2))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i2;
    }

    private static void rl(ViewGroup viewGroup, boolean z2) {
        if (f42268n) {
            try {
                Api29Impl.rl(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f42268n = false;
            }
        }
    }

    static void t(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.rl(viewGroup, z2);
        } else {
            rl(viewGroup, z2);
        }
    }
}
