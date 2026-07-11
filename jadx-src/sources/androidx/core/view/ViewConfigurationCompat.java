package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.RequiresApi;
import androidx.core.util.Supplier;
import com.safedk.android.analytics.AppLovinBridge;
import d8q.jqQ.QTafcm;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class ViewConfigurationCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Method f36776n;

    private static int n(Resources resources, int i2, Supplier supplier, int i3) {
        int dimensionPixelSize;
        return i2 != -1 ? (i2 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i2)) < 0) ? i3 : dimensionPixelSize : ((Integer) supplier.get()).intValue();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @RequiresApi
    static class Api26Impl {
        static float n(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float rl(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @RequiresApi
    static class Api28Impl {
        static int n(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean rl(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @RequiresApi
    static class Api34Impl {
        static int n(ViewConfiguration viewConfiguration, int i2, int i3, int i5) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i5);
        }

        static int rl(ViewConfiguration viewConfiguration, int i2, int i3, int i5) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i5);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f36776n = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float J2(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.n(viewConfiguration) : rl(viewConfiguration, context);
    }

    public static int KN(Context context, final ViewConfiguration viewConfiguration, int i2, int i3, int i5) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.n(viewConfiguration, i2, i3, i5);
        }
        if (!gh(i2, i3, i5)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iNr = nr(resources, i5, i3);
        Objects.requireNonNull(viewConfiguration);
        return n(resources, iNr, new Supplier() { // from class: androidx.core.view.Q
            @Override // androidx.core.util.Supplier
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    private static int O(Resources resources, int i2, int i3) {
        if (i2 == 4194304 && i3 == 26) {
            return t(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int Uo(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.n(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static float mUb(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.rl(viewConfiguration) : rl(viewConfiguration, context);
    }

    private static int nr(Resources resources, int i2, int i3) {
        if (i2 == 4194304 && i3 == 26) {
            return t(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static boolean qie(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.rl(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iT = t(resources, "config_showMenuShortcutsWhenKeyboardPresent", QTafcm.ftO);
        return iT != 0 && resources.getBoolean(iT);
    }

    private static float rl(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f36776n) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int t(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, AppLovinBridge.f61290h);
    }

    public static int xMQ(Context context, final ViewConfiguration viewConfiguration, int i2, int i3, int i5) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.rl(viewConfiguration, i2, i3, i5);
        }
        if (!gh(i2, i3, i5)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iO = O(resources, i5, i3);
        Objects.requireNonNull(viewConfiguration);
        return n(resources, iO, new Supplier() { // from class: androidx.core.view.r
            @Override // androidx.core.util.Supplier
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    private static boolean gh(int i2, int i3, int i5) {
        InputDevice device = InputDevice.getDevice(i2);
        if (device != null && device.getMotionRange(i3, i5) != null) {
            return true;
        }
        return false;
    }
}
