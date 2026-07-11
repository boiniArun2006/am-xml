package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class DrawableCompat {
    public static Drawable r(Drawable drawable) {
        return drawable;
    }

    @RequiresApi
    static class Api21Impl {
        static void J2(Drawable drawable, int i2, int i3, int i5, int i7) {
            drawable.setHotspotBounds(i2, i3, i5, i7);
        }

        static void KN(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void O(Drawable drawable, float f3, float f4) {
            drawable.setHotspot(f3, f4);
        }

        static void Uo(Drawable drawable, int i2) {
            drawable.setTint(i2);
        }

        static void n(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static void nr(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static boolean rl(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter t(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void xMQ(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @RequiresApi
    static class Api23Impl {
        static int n(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean rl(Drawable drawable, int i2) {
            return drawable.setLayoutDirection(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable Ik(Drawable drawable) {
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).n() : drawable;
    }

    public static void HI(Drawable drawable, ColorStateList colorStateList) {
        Api21Impl.KN(drawable, colorStateList);
    }

    public static int J2(Drawable drawable) {
        return Api23Impl.n(drawable);
    }

    public static boolean KN(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static ColorFilter O(Drawable drawable) {
        return Api21Impl.t(drawable);
    }

    public static void Uo(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Api21Impl.nr(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean az(Drawable drawable, int i2) {
        return Api23Impl.rl(drawable, i2);
    }

    public static void ck(Drawable drawable, PorterDuff.Mode mode) {
        Api21Impl.xMQ(drawable, mode);
    }

    public static void gh(Drawable drawable, float f3, float f4) {
        Api21Impl.O(drawable, f3, f4);
    }

    public static void mUb(Drawable drawable, boolean z2) {
        drawable.setAutoMirrored(z2);
    }

    public static void n(Drawable drawable, Resources.Theme theme) {
        Api21Impl.n(drawable, theme);
    }

    public static int nr(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void qie(Drawable drawable, int i2, int i3, int i5, int i7) {
        Api21Impl.J2(drawable, i2, i3, i5, i7);
    }

    public static boolean rl(Drawable drawable) {
        return Api21Impl.rl(drawable);
    }

    public static void t(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static void ty(Drawable drawable, int i2) {
        Api21Impl.Uo(drawable, i2);
    }

    public static void xMQ(Drawable drawable) {
        drawable.jumpToCurrentState();
    }
}
