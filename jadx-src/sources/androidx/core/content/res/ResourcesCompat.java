package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class ResourcesCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f36368n = new ThreadLocal();
    private static final WeakHashMap rl = new WeakHashMap(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f36369t = new Object();

    @RequiresApi
    static class Api29Impl {
    }

    private static final class ColorStateListCacheKey {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Resources f36372n;
        final Resources.Theme rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ColorStateListCacheKey.class == obj.getClass()) {
                ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
                if (this.f36372n.equals(colorStateListCacheKey.f36372n) && ObjectsCompat.n(this.rl, colorStateListCacheKey.rl)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.rl(this.f36372n, this.rl);
        }

        ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.f36372n = resources;
            this.rl = theme;
        }
    }

    public static abstract class FontCallback {
        public abstract void J2(int i2);

        public abstract void Uo(Typeface typeface);

        public static Handler O(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void nr(final Typeface typeface, Handler handler) {
            O(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36379n.Uo(typeface);
                }
            });
        }

        public final void t(final int i2, Handler handler) {
            O(handler).post(new Runnable() { // from class: androidx.core.content.res.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36381n.J2(i2);
                }
            });
        }
    }

    public static final class ThemeCompat {

        @RequiresApi
        static class Api23Impl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final Object f36373n = new Object();
            private static Method rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private static boolean f36374t;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            static void n(Resources.Theme theme) {
                Method method;
                synchronized (f36373n) {
                    if (f36374t) {
                        method = rl;
                        if (method != null) {
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            rl = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        f36374t = true;
                        method = rl;
                        if (method != null) {
                            try {
                                method.invoke(theme, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException e3) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                rl = null;
                            }
                        }
                    }
                }
            }
        }

        @RequiresApi
        static class Api29Impl {
            static void n(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void n(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.n(theme);
            } else {
                Api23Impl.n(theme);
            }
        }
    }

    @RequiresApi
    static class Api21Impl {
        static Drawable n(Resources resources, int i2, Resources.Theme theme) {
            return resources.getDrawable(i2, theme);
        }

        static Drawable rl(Resources resources, int i2, int i3, Resources.Theme theme) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
    }

    @RequiresApi
    static class Api23Impl {
        static int n(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColor(i2, theme);
        }

        static ColorStateList rl(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColorStateList(i2, theme);
        }
    }

    private static class ColorStateListCacheEntry {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ColorStateList f36370n;
        final Configuration rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f36371t;

        ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int iHashCode;
            this.f36370n = colorStateList;
            this.rl = configuration;
            if (theme == null) {
                iHashCode = 0;
            } else {
                iHashCode = theme.hashCode();
            }
            this.f36371t = iHashCode;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface HI(Context context, Resources resources, TypedValue typedValue, int i2, int i3, FontCallback fontCallback, Handler handler, boolean z2, boolean z3) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (fontCallback != null) {
                fontCallback.t(-3, handler);
            }
            return null;
        }
        Typeface typefaceUo = TypefaceCompat.Uo(resources, i2, string, typedValue.assetCookie, i3);
        if (typefaceUo != null) {
            if (fontCallback != null) {
                fontCallback.nr(typefaceUo, handler);
            }
            return typefaceUo;
        }
        if (z3) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceO = TypefaceCompat.O(context, resources, i2, string, typedValue.assetCookie, i3);
                if (fontCallback != null) {
                    if (typefaceO != null) {
                        fontCallback.nr(typefaceO, handler);
                        return typefaceO;
                    }
                    fontCallback.t(-3, handler);
                }
                return typefaceO;
            }
            FontResourcesParserCompat.FamilyResourceEntry familyResourceEntryRl = FontResourcesParserCompat.rl(resources.getXml(i2), resources);
            if (familyResourceEntryRl == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (fontCallback != null) {
                    fontCallback.t(-3, handler);
                }
                return null;
            }
            try {
                return TypefaceCompat.nr(context, familyResourceEntryRl, resources, i2, string, typedValue.assetCookie, i3, fontCallback, handler, z2);
            } catch (IOException e2) {
                e = e2;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (fontCallback != null) {
                    fontCallback.t(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e3) {
                e = e3;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e);
                if (fontCallback != null) {
                }
                return null;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (XmlPullParserException e5) {
            e = e5;
        }
    }

    public static ColorStateList O(Resources resources, int i2, Resources.Theme theme) {
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        ColorStateList colorStateListRl = rl(colorStateListCacheKey, i2);
        if (colorStateListRl != null) {
            return colorStateListRl;
        }
        ColorStateList colorStateListQie = qie(resources, i2, theme);
        if (colorStateListQie == null) {
            return Api23Impl.rl(resources, i2, theme);
        }
        n(colorStateListCacheKey, i2, colorStateListQie, theme);
        return colorStateListQie;
    }

    private static TypedValue gh() {
        ThreadLocal threadLocal = f36368n;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static void n(ColorStateListCacheKey colorStateListCacheKey, int i2, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f36369t) {
            try {
                WeakHashMap weakHashMap = rl;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(colorStateListCacheKey);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(colorStateListCacheKey, sparseArray);
                }
                sparseArray.append(i2, new ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.f36372n.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f36371t == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList rl(ColorStateListCacheKey colorStateListCacheKey, int i2) {
        ColorStateListCacheEntry colorStateListCacheEntry;
        synchronized (f36369t) {
            try {
                SparseArray sparseArray = (SparseArray) rl.get(colorStateListCacheKey);
                if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = (ColorStateListCacheEntry) sparseArray.get(i2)) != null) {
                    if (colorStateListCacheEntry.rl.equals(colorStateListCacheKey.f36372n.getConfiguration())) {
                        Resources.Theme theme = colorStateListCacheKey.rl;
                        if (theme != null || colorStateListCacheEntry.f36371t != 0) {
                            if (theme != null) {
                            }
                        }
                        return colorStateListCacheEntry.f36370n;
                    }
                    sparseArray.remove(i2);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Drawable J2(Resources resources, int i2, Resources.Theme theme) {
        return Api21Impl.n(resources, i2, theme);
    }

    public static Typeface KN(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return ty(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    public static Drawable Uo(Resources resources, int i2, int i3, Resources.Theme theme) {
        return Api21Impl.rl(resources, i2, i3, theme);
    }

    private static boolean az(Resources resources, int i2) {
        TypedValue typedValueGh = gh();
        resources.getValue(i2, typedValueGh, true);
        int i3 = typedValueGh.type;
        if (i3 >= 28 && i3 <= 31) {
            return true;
        }
        return false;
    }

    public static void mUb(Context context, int i2, FontCallback fontCallback, Handler handler) {
        Preconditions.Uo(fontCallback);
        if (context.isRestricted()) {
            fontCallback.t(-4, handler);
        } else {
            ty(context, i2, new TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    public static int nr(Resources resources, int i2, Resources.Theme theme) {
        return Api23Impl.n(resources, i2, theme);
    }

    private static ColorStateList qie(Resources resources, int i2, Resources.Theme theme) {
        if (az(resources, i2)) {
            return null;
        }
        try {
            return ColorStateListInflaterCompat.n(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    public static Typeface t(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return ty(context, i2, new TypedValue(), 0, null, null, false, true);
    }

    private static Typeface ty(Context context, int i2, TypedValue typedValue, int i3, FontCallback fontCallback, Handler handler, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface typefaceHI = HI(context, resources, typedValue, i2, i3, fontCallback, handler, z2, z3);
        if (typefaceHI == null && fontCallback == null && !z3) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
        }
        return typefaceHI;
    }

    public static Typeface xMQ(Context context, int i2, TypedValue typedValue, int i3, FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return ty(context, i2, typedValue, i3, fontCallback, null, true, false);
    }
}
