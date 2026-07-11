package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
final class WeightTypefaceApi14 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Field f36429n;
    private static final LongSparseArray rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f36430t;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception e2) {
            Log.e("WeightTypeface", e2.getClass().getName(), e2);
            declaredField = null;
        }
        f36429n = declaredField;
        rl = new LongSparseArray(3);
        f36430t = new Object();
    }
}
