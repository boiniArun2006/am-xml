package androidx.window.sidecar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.compose.ui.platform.UGc;
import androidx.compose.ui.platform.s4;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "bounds", "", "KN", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "Landroid/content/Context;", "context", "", "J2", "(Landroid/content/Context;)I", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "O", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "Landroidx/window/layout/WindowMetrics;", c.f62177j, "(Landroid/app/Activity;)Landroidx/window/layout/WindowMetrics;", "nr", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "t", "rl", "Landroid/graphics/Point;", "Uo", "(Landroid/view/Display;)Landroid/graphics/Point;", "", "Ljava/lang/String;", "TAG", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public static final WindowMetricsCalculatorCompat rl = new WindowMetricsCalculatorCompat();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final String TAG;

    static {
        String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
    }

    private final DisplayCutout O(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (s4.n(obj)) {
                return UGc.n(obj);
            }
            return null;
        } catch (ClassNotFoundException e2) {
            Log.w(TAG, e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.w(TAG, e3);
            return null;
        } catch (InstantiationException e4) {
            Log.w(TAG, e4);
            return null;
        } catch (NoSuchFieldException e5) {
            Log.w(TAG, e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.w(TAG, e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.w(TAG, e7);
            return null;
        }
    }

    public final Point Uo(Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Point point = new Point();
        DisplayCompatHelperApi17.f42628n.n(display, point);
        return point;
    }

    @Override // androidx.window.sidecar.WindowMetricsCalculator
    public WindowMetrics n(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i2 = Build.VERSION.SDK_INT;
        return new WindowMetrics(i2 >= 30 ? ActivityCompatHelperApi30.f42625n.n(activity) : i2 >= 29 ? nr(activity) : i2 >= 28 ? t(activity) : rl(activity));
    }

    public final Rect nr(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e2) {
            Log.w(TAG, e2);
            return t(activity);
        } catch (NoSuchFieldException e3) {
            Log.w(TAG, e3);
            return t(activity);
        } catch (NoSuchMethodException e4) {
            Log.w(TAG, e4);
            return t(activity);
        } catch (InvocationTargetException e5) {
            Log.w(TAG, e5);
            return t(activity);
        }
    }

    public final Rect rl(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.f42624n.n(activity)) {
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
            Point pointUo = Uo(defaultDisplay);
            int iJ2 = J2(activity);
            int i2 = rect.bottom;
            if (i2 + iJ2 == pointUo.y) {
                rect.bottom = i2 + iJ2;
                return rect;
            }
            int i3 = rect.right;
            if (i3 + iJ2 == pointUo.x) {
                rect.right = i3 + iJ2;
            }
        }
        return rect;
    }

    public final Rect t(Activity activity) {
        DisplayCutout displayCutoutO;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.f42624n.n(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e2) {
            Log.w(TAG, e2);
            KN(activity, rect);
        } catch (NoSuchFieldException e3) {
            Log.w(TAG, e3);
            KN(activity, rect);
        } catch (NoSuchMethodException e4) {
            Log.w(TAG, e4);
            KN(activity, rect);
        } catch (InvocationTargetException e5) {
            Log.w(TAG, e5);
            KN(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.f42628n;
        Intrinsics.checkNotNullExpressionValue(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.n(currentDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.f42624n;
        if (!activityCompatHelperApi24.n(activity)) {
            int iJ2 = J2(activity);
            int i2 = rect.bottom;
            if (i2 + iJ2 == point.y) {
                rect.bottom = i2 + iJ2;
            } else {
                int i3 = rect.right;
                if (i3 + iJ2 == point.x) {
                    rect.right = i3 + iJ2;
                } else if (rect.left == iJ2) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.n(activity) && (displayCutoutO = O(currentDisplay)) != null) {
            int i5 = rect.left;
            DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.f42629n;
            if (i5 == displayCompatHelperApi28.rl(displayCutoutO)) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCompatHelperApi28.t(displayCutoutO)) {
                rect.right += displayCompatHelperApi28.t(displayCutoutO);
            }
            if (rect.top == displayCompatHelperApi28.nr(displayCutoutO)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCompatHelperApi28.n(displayCutoutO)) {
                rect.bottom += displayCompatHelperApi28.n(displayCutoutO);
            }
        }
        return rect;
    }

    private WindowMetricsCalculatorCompat() {
    }

    private final int J2(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", AppLovinBridge.f61290h);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void KN(Activity activity, Rect bounds) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(bounds);
    }
}
