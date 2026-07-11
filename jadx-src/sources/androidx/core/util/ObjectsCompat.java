package androidx.core.util;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ObjectsCompat {
    public static String O(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }

    public static Object nr(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean n(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int rl(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static Object t(Object obj) {
        obj.getClass();
        return obj;
    }
}
