package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class ResourcesFlusher {
    private static boolean J2;
    private static boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Field f13675O;
    private static Field Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Field f13676n;
    private static boolean nr;
    private static boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Class f13677t;

    static void n(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        rl(resources);
    }

    private static void rl(Resources resources) {
        Object obj;
        if (!KN) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                Uo = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            KN = true;
        }
        Field field = Uo;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!rl) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f13676n = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            rl = true;
        }
        Field field2 = f13676n;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        if (obj2 != null) {
            t(obj2);
        }
    }

    private static void t(Object obj) {
        LongSparseArray longSparseArray;
        if (!nr) {
            try {
                f13677t = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            nr = true;
        }
        Class cls = f13677t;
        if (cls == null) {
            return;
        }
        if (!J2) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f13675O = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            J2 = true;
        }
        Field field = f13675O;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
