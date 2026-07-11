package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@RestrictTo
final class WeightTypefaceApi21 {
    private static final Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final LongSparseArray f36431O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Field f36432n;
    private static final Constructor nr;
    private static final Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Method f36433t;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f36432n = declaredField;
        rl = declaredMethod;
        f36433t = declaredMethod2;
        nr = declaredConstructor;
        f36431O = new LongSparseArray(3);
        J2 = new Object();
    }
}
