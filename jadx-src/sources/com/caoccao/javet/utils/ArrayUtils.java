package com.caoccao.javet.utils;

import java.lang.reflect.Array;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class ArrayUtils {
    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean isNotEmpty(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }

    public static boolean isEmpty(long[] jArr) {
        return jArr == null || jArr.length == 0;
    }

    public static boolean isNotEmpty(long[] jArr) {
        return jArr != null && jArr.length > 0;
    }

    public static Object[] copyOf(Object obj) {
        int length = Array.getLength(obj);
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            objArr[i2] = Array.get(obj, i2);
        }
        return objArr;
    }

    public static <T> boolean includes(Object obj, T t3, int i2) {
        int length = Array.getLength(obj);
        while (i2 < length) {
            if (Objects.equals(Array.get(obj, i2), t3)) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public static <T> int indexOf(Object obj, T t3, int i2) {
        int length = Array.getLength(obj);
        while (i2 < length) {
            if (Objects.equals(Array.get(obj, i2), t3)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static <T> boolean isEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> boolean isNotEmpty(T[] tArr) {
        return tArr != null && tArr.length > 0;
    }

    public static <T> int lastIndexOf(Object obj, T t3, int i2) {
        int length = Array.getLength(obj);
        if (i2 >= 0 && i2 < length) {
            while (i2 >= 0) {
                if (Objects.equals(Array.get(obj, i2), t3)) {
                    return i2;
                }
                i2--;
            }
            return -1;
        }
        return -1;
    }

    public static void reverse(Object obj) {
        int length = Array.getLength(obj);
        if (length > 1) {
            int i2 = 0;
            for (int i3 = length - 1; i2 < i3; i3--) {
                Object obj2 = Array.get(obj, i2);
                Array.set(obj, i2, Array.get(obj, i3));
                Array.set(obj, i3, obj2);
                i2++;
            }
        }
    }
}
