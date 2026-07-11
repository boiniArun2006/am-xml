package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public final class ResourceManagerInternal {
    private static final PorterDuff.Mode KN = PorterDuff.Mode.SRC_IN;
    private static final ColorFilterLruCache mUb = new ColorFilterLruCache(6);
    private static ResourceManagerInternal xMQ;
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private TypedValue f14266O;
    private ResourceManagerHooks Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakHashMap f14267n;
    private final WeakHashMap nr = new WeakHashMap(0);
    private SimpleArrayMap rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SparseArrayCompat f14268t;

    private static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        private static int rl(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        public ColorFilterLruCache(int i2) {
            super(i2);
        }

        PorterDuffColorFilter nr(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(rl(i2, mode)), porterDuffColorFilter);
        }

        PorterDuffColorFilter t(int i2, PorterDuff.Mode mode) {
            return get(Integer.valueOf(rl(i2, mode)));
        }
    }

    private interface InflateDelegate {
        Drawable n(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    @RestrictTo
    public interface ResourceManagerHooks {
        boolean O(Context context, int i2, Drawable drawable);

        Drawable n(ResourceManagerInternal resourceManagerInternal, Context context, int i2);

        PorterDuff.Mode nr(int i2);

        ColorStateList rl(Context context, int i2);

        boolean t(Context context, int i2, Drawable drawable);
    }

    private static void HI(ResourceManagerInternal resourceManagerInternal) {
    }

    private synchronized Drawable KN(Context context, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.nr.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) longSparseArray.O(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.qie(j2);
        }
        return null;
    }

    private synchronized boolean n(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            LongSparseArray longSparseArray = (LongSparseArray) this.nr.get(context);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray();
                this.nr.put(context, longSparseArray);
            }
            longSparseArray.gh(j2, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void Z(ResourceManagerHooks resourceManagerHooks) {
        this.Uo = resourceManagerHooks;
    }

    synchronized Drawable mUb(Context context, int i2, boolean z2) {
        Drawable drawableIk;
        try {
            t(context);
            drawableIk = Ik(context, i2);
            if (drawableIk == null) {
                drawableIk = O(context, i2);
            }
            if (drawableIk == null) {
                drawableIk = ContextCompat.getDrawable(context, i2);
            }
            if (drawableIk != null) {
                drawableIk = XQ(context, i2, z2, drawableIk);
            }
            if (drawableIk != null) {
                DrawableUtils.rl(drawableIk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableIk;
    }

    synchronized Drawable o(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i2) {
        try {
            Drawable drawableIk = Ik(context, i2);
            if (drawableIk == null) {
                drawableIk = vectorEnabledTintResources.n(i2);
            }
            if (drawableIk == null) {
                return null;
            }
            return XQ(context, i2, false, drawableIk);
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized ColorStateList qie(Context context, int i2) {
        ColorStateList colorStateListAz;
        colorStateListAz = az(context, i2);
        if (colorStateListAz == null) {
            ResourceManagerHooks resourceManagerHooks = this.Uo;
            colorStateListAz = resourceManagerHooks == null ? null : resourceManagerHooks.rl(context, i2);
            if (colorStateListAz != null) {
                rl(context, i2, colorStateListAz);
            }
        }
        return colorStateListAz;
    }

    public synchronized void r(Context context) {
        LongSparseArray longSparseArray = (LongSparseArray) this.nr.get(context);
        if (longSparseArray != null) {
            longSparseArray.rl();
        }
    }

    public synchronized Drawable xMQ(Context context, int i2) {
        return mUb(context, i2, false);
    }

    static class AsldcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable n(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.az(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    private static class AvdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable n(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.rl(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    static class DrawableDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable n(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    Compatibility.Api21Impl.t(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                }
            }
            return null;
        }
    }

    private static class VdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable n(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return VectorDrawableCompat.t(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private Drawable Ik(Context context, int i2) {
        int next;
        SimpleArrayMap simpleArrayMap = this.rl;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat sparseArrayCompat = this.f14268t;
        if (sparseArrayCompat != null) {
            String str = (String) sparseArrayCompat.O(i2);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.rl.get(str) == null)) {
                return null;
            }
        } else {
            this.f14268t = new SparseArrayCompat();
        }
        if (this.f14266O == null) {
            this.f14266O = new TypedValue();
        }
        TypedValue typedValue = this.f14266O;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jNr = nr(typedValue);
        Drawable drawableKN = KN(context, jNr);
        if (drawableKN != null) {
            return drawableKN;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f14268t.n(i2, name);
                InflateDelegate inflateDelegate = (InflateDelegate) this.rl.get(name);
                if (inflateDelegate != null) {
                    drawableKN = inflateDelegate.n(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableKN != null) {
                    drawableKN.setChangingConfigurations(typedValue.changingConfigurations);
                    n(context, jNr, drawableKN);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableKN == null) {
            this.f14268t.n(i2, "appcompat_skip_skip");
        }
        return drawableKN;
    }

    private static PorterDuffColorFilter J2(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return gh(colorStateList.getColorForState(iArr, 0), mode);
    }

    private Drawable O(Context context, int i2) {
        if (this.f14266O == null) {
            this.f14266O = new TypedValue();
        }
        TypedValue typedValue = this.f14266O;
        context.getResources().getValue(i2, typedValue, true);
        long jNr = nr(typedValue);
        Drawable drawableKN = KN(context, jNr);
        if (drawableKN != null) {
            return drawableKN;
        }
        ResourceManagerHooks resourceManagerHooks = this.Uo;
        Drawable drawableN = resourceManagerHooks == null ? null : resourceManagerHooks.n(this, context, i2);
        if (drawableN != null) {
            drawableN.setChangingConfigurations(typedValue.changingConfigurations);
            n(context, jNr, drawableN);
        }
        return drawableN;
    }

    public static synchronized ResourceManagerInternal Uo() {
        try {
            if (xMQ == null) {
                ResourceManagerInternal resourceManagerInternal = new ResourceManagerInternal();
                xMQ = resourceManagerInternal;
                HI(resourceManagerInternal);
            }
        } catch (Throwable th) {
            throw th;
        }
        return xMQ;
    }

    private ColorStateList az(Context context, int i2) {
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f14267n;
        if (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) sparseArrayCompat.O(i2);
    }

    private static boolean ck(Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static synchronized PorterDuffColorFilter gh(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterT;
        ColorFilterLruCache colorFilterLruCache = mUb;
        porterDuffColorFilterT = colorFilterLruCache.t(i2, mode);
        if (porterDuffColorFilterT == null) {
            porterDuffColorFilterT = new PorterDuffColorFilter(i2, mode);
            colorFilterLruCache.nr(i2, mode, porterDuffColorFilterT);
        }
        return porterDuffColorFilterT;
    }

    private static long nr(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private void rl(Context context, int i2, ColorStateList colorStateList) {
        if (this.f14267n == null) {
            this.f14267n = new WeakHashMap();
        }
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.f14267n.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            this.f14267n.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.n(i2, colorStateList);
    }

    private void t(Context context) {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        Drawable drawableXMQ = xMQ(context, R.drawable.f13753n);
        if (drawableXMQ == null || !ck(drawableXMQ)) {
            this.J2 = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    boolean WPU(Context context, int i2, Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.Uo;
        return resourceManagerHooks != null && resourceManagerHooks.t(context, i2, drawable);
    }

    PorterDuff.Mode ty(int i2) {
        ResourceManagerHooks resourceManagerHooks = this.Uo;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.nr(i2);
    }

    static void S(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = tintInfo.nr;
            if (!z2 && !tintInfo.f14384t) {
                drawable.clearColorFilter();
                return;
            }
            if (z2) {
                colorStateList = tintInfo.f14383n;
            } else {
                colorStateList = null;
            }
            if (tintInfo.f14384t) {
                mode = tintInfo.rl;
            } else {
                mode = KN;
            }
            drawable.setColorFilter(J2(colorStateList, mode, iArr));
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    private Drawable XQ(Context context, int i2, boolean z2, Drawable drawable) {
        ColorStateList colorStateListQie = qie(context, i2);
        if (colorStateListQie != null) {
            Drawable drawableR = DrawableCompat.r(drawable.mutate());
            DrawableCompat.HI(drawableR, colorStateListQie);
            PorterDuff.Mode modeTy = ty(i2);
            if (modeTy != null) {
                DrawableCompat.ck(drawableR, modeTy);
            }
            return drawableR;
        }
        ResourceManagerHooks resourceManagerHooks = this.Uo;
        if ((resourceManagerHooks == null || !resourceManagerHooks.O(context, i2, drawable)) && !WPU(context, i2, drawable) && z2) {
            return null;
        }
        return drawable;
    }
}
