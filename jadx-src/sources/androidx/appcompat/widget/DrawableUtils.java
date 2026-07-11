package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class DrawableUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f14178n = {R.attr.state_checked};
    private static final int[] rl = new int[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Rect f14179t = new Rect();

    static class Api18Impl {
        private static final Field J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final Field f14180O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final boolean f14181n;
        private static final Field nr;
        private static final Method rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Field f14182t;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z2;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField(TtmlNode.LEFT);
                } catch (ClassNotFoundException unused) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                } catch (NoSuchFieldException unused2) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                } catch (NoSuchMethodException unused3) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                }
            } catch (ClassNotFoundException unused4) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused5) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused6) {
                method = null;
                field = null;
            }
            try {
                field2 = cls.getField("top");
                try {
                    field3 = cls.getField(TtmlNode.RIGHT);
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                    field3 = null;
                }
                try {
                    field4 = cls.getField("bottom");
                    z2 = true;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                    field4 = null;
                    z2 = false;
                }
            } catch (ClassNotFoundException unused9) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchFieldException unused10) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchMethodException unused11) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            }
            if (z2) {
                rl = method;
                f14182t = field;
                nr = field2;
                f14180O = field3;
                J2 = field4;
                f14181n = true;
                return;
            }
            rl = null;
            f14182t = null;
            nr = null;
            f14180O = null;
            J2 = null;
            f14181n = false;
        }

        static Rect n(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f14181n) {
                try {
                    Object objInvoke = rl.invoke(drawable, new Object[0]);
                    if (objInvoke != null) {
                        return new Rect(f14182t.getInt(objInvoke), nr.getInt(objInvoke), f14180O.getInt(objInvoke), J2.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return DrawableUtils.f14179t;
        }
    }

    public static PorterDuff.Mode O(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean n(Drawable drawable) {
        return true;
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static Insets n(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static Rect nr(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return Api18Impl.n(DrawableCompat.Ik(drawable));
        }
        Insets insetsN = Api29Impl.n(drawable);
        return new Rect(insetsN.left, insetsN.top, insetsN.right, insetsN.bottom);
    }

    static void rl(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            t(drawable);
        }
    }

    private static void t(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(rl);
        } else {
            drawable.setState(f14178n);
        }
        drawable.setState(state);
    }
}
