package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RequiresApi
class GhostViewPlatform implements GhostView {
    private static Method J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static boolean f42179O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static boolean f42180Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Method f42181o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f42182r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Class f42183t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f42184n;

    @Override // androidx.transition.GhostView
    public void n(ViewGroup viewGroup, View view) {
    }

    private static void O() {
        if (f42180Z) {
            return;
        }
        try {
            nr();
            Method declaredMethod = f42183t.getDeclaredMethod("removeGhost", View.class);
            f42181o = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e2);
        }
        f42180Z = true;
    }

    private static void nr() {
        if (f42179O) {
            return;
        }
        try {
            f42183t = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e2) {
            Log.i("GhostViewApi21", KfLR.JnILEI, e2);
        }
        f42179O = true;
    }

    private static void t() {
        if (f42182r) {
            return;
        }
        try {
            nr();
            Method declaredMethod = f42183t.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            J2 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e2);
        }
        f42182r = true;
    }

    @Override // androidx.transition.GhostView
    public void setVisibility(int i2) {
        this.f42184n.setVisibility(i2);
    }

    private GhostViewPlatform(View view) {
        this.f42184n = view;
    }

    static void J2(View view) {
        O();
        Method method = f42181o;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    static GhostView rl(View view, ViewGroup viewGroup, Matrix matrix) {
        t();
        Method method = J2;
        if (method != null) {
            try {
                return new GhostViewPlatform((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }
}
