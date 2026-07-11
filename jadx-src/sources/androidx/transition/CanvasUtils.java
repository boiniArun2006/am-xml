package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class CanvasUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Method f42135n;
    private static Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f42136t;

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void n(Canvas canvas) {
            canvas.disableZ();
        }

        @DoNotInline
        static void rl(Canvas canvas) {
            canvas.enableZ();
        }
    }

    static void n(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z2) {
                Api29Impl.rl(canvas);
                return;
            } else {
                Api29Impl.n(canvas);
                return;
            }
        }
        if (i2 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f42136t) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f42135n = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                rl = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f42136t = true;
        }
        if (z2) {
            try {
                Method method2 = f42135n;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        if (z2 || (method = rl) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
