package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@RestrictTo
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Method f36424O;
    private static final Method nr;
    private static final Class rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Constructor f36425t;

    private static Typeface az(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) rl, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f36424O.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f36425t = constructor;
        rl = cls;
        nr = method;
        f36424O = method2;
    }

    private static Object HI() {
        try {
            return f36425t.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean qie(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) nr.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean ty() {
        Method method = nr;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    TypefaceCompatApi24Impl() {
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface rl(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        Object objHI = HI();
        if (objHI == null) {
            return null;
        }
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.n()) {
            ByteBuffer byteBufferRl = TypefaceCompatUtil.rl(context, resources, fontFileResourceEntry.rl());
            if (byteBufferRl == null || !qie(objHI, byteBufferRl, fontFileResourceEntry.t(), fontFileResourceEntry.O(), fontFileResourceEntry.J2())) {
                return null;
            }
        }
        return az(objHI);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface t(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Object objHI = HI();
        if (objHI == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            Uri uriNr = fontInfo.nr();
            ByteBuffer byteBufferJ2 = (ByteBuffer) simpleArrayMap.get(uriNr);
            if (byteBufferJ2 == null) {
                byteBufferJ2 = TypefaceCompatUtil.J2(context, cancellationSignal, uriNr);
                simpleArrayMap.put(uriNr, byteBufferJ2);
            }
            if (byteBufferJ2 == null || !qie(objHI, byteBufferJ2, fontInfo.t(), fontInfo.O(), fontInfo.J2())) {
                return null;
            }
        }
        Typeface typefaceAz = az(objHI);
        if (typefaceAz == null) {
            return null;
        }
        return Typeface.create(typefaceAz, i2);
    }
}
