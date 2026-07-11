package com.caoccao.javet.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class ListUtils {
    public static <T> void flat(List<T> list, List<T> list2, int i2) {
        if (i2 <= 0) {
            list.addAll(list2);
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (T t3 : list2) {
            if (t3 instanceof List) {
                flat(list, (List) t3, i2 - 1);
            } else if (t3 == null || !t3.getClass().isArray()) {
                list.add(t3);
            } else {
                int length = Array.getLength(t3);
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = 0; i3 < length; i3++) {
                    arrayList.add(Array.get(t3, i3));
                }
                flat(list, arrayList, i2 - 1);
            }
        }
    }

    public static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean isNotEmpty(List<?> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    private ListUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> int addAll(List<T> list, Object obj) {
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            list.add(Array.get(obj, i2));
        }
        return length;
    }

    public static <T> boolean includes(List<T> list, T t3, int i2) {
        Iterator<T> it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (Objects.equals(it.next(), t3) && i3 >= i2) {
                return true;
            }
            i3++;
        }
        return false;
    }

    public static <T> int indexOf(List<T> list, T t3, int i2) {
        int size = list.size();
        if (i2 >= 0 && i2 < size) {
            while (i2 < size) {
                if (Objects.equals(list.get(i2), t3)) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        return -1;
    }

    public static <T> int lastIndexOf(List<T> list, T t3, int i2) {
        int size = list.size();
        if (i2 >= 0 && i2 < size) {
            while (i2 >= 0) {
                if (Objects.equals(list.get(i2), t3)) {
                    return i2;
                }
                i2--;
            }
            return -1;
        }
        return -1;
    }

    public static <T> T pop(List<T> list) {
        int size = list.size();
        if (size > 0) {
            return list.remove(size - 1);
        }
        return null;
    }

    public static <T> int push(List<T> list, T... tArr) {
        if (ArrayUtils.isNotEmpty(tArr)) {
            Collections.addAll(list, tArr);
        }
        return list.size();
    }

    public static <T> T shift(List<T> list) {
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

    public static <T> int unshift(List<T> list, T... tArr) {
        if (ArrayUtils.isNotEmpty(tArr)) {
            list.addAll(0, Arrays.asList(tArr));
        }
        return list.size();
    }
}
