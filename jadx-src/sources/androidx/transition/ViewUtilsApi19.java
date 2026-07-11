package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class ViewUtilsApi19 {
    private static boolean J2 = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Field f42272O = null;
    private static boolean nr = false;
    private static boolean rl = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Method f42273t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f42274n;

    public void O(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f42274n;
        if (fArr == null) {
            fArr = new float[9];
            this.f42274n = fArr;
        }
        matrix.getValues(fArr);
        float f3 = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f3 * f3))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f3, fSqrt));
        float f4 = fArr[0] / fSqrt;
        float f5 = fArr[4] / fSqrt;
        float f6 = fArr[2];
        float f7 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        view.setRotation(degrees);
        view.setScaleX(f4);
        view.setScaleY(f5);
    }

    public void n(View view) {
    }

    public void nr(View view) {
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static float n(View view) {
            return view.getTransitionAlpha();
        }

        @DoNotInline
        static void rl(View view, float f3) {
            view.setTransitionAlpha(f3);
        }
    }

    private void rl() {
        if (nr) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f42273t = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e2);
        }
        nr = true;
    }

    public void KN(View view, int i2) {
        if (!J2) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f42272O = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            J2 = true;
        }
        Field field = f42272O;
        if (field != null) {
            try {
                f42272O.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void Uo(View view, float f3) {
        if (rl) {
            try {
                Api29Impl.rl(view, f3);
                return;
            } catch (NoSuchMethodError unused) {
                rl = false;
            }
        }
        view.setAlpha(f3);
    }

    public float t(View view) {
        if (rl) {
            try {
                return Api29Impl.n(view);
            } catch (NoSuchMethodError unused) {
                rl = false;
            }
        }
        return view.getAlpha();
    }

    ViewUtilsApi19() {
    }

    public void J2(View view, int i2, int i3, int i5, int i7) {
        rl();
        Method method = f42273t;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i7));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void mUb(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mUb((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public void xMQ(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            xMQ((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }
}
