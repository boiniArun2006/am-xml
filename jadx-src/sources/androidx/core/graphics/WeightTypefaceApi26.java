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
final class WeightTypefaceApi26 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Object f36434O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Field f36435n;
    private static final LongSparseArray nr;
    private static final Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Constructor f36436t;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f36435n = declaredField;
        rl = declaredMethod;
        f36436t = declaredConstructor;
        nr = new LongSparseArray(3);
        f36434O = new Object();
    }
}
