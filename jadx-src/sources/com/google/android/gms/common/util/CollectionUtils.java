package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k2, @NonNull V v2, @NonNull K k3, @NonNull V v3, @NonNull K k4, @NonNull V v4) {
        Map mapZzb = zzb(3, false);
        mapZzb.put(k2, v2);
        mapZzb.put(k3, v3);
        mapZzb.put(k4, v4);
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZzb = zzb(length, false);
        for (int i2 = 0; i2 < kArr.length; i2++) {
            mapZzb.put(kArr[i2], vArr[i2]);
        }
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t3, @NonNull T t4, @NonNull T t5) {
        Set setZza = zza(3, false);
        setZza.add(t3);
        setZza.add(t4);
        setZza.add(t5);
        return Collections.unmodifiableSet(setZza);
    }

    private static Set zza(int i2, boolean z2) {
        if (i2 <= (true != z2 ? 256 : 128)) {
            return new ArraySet(i2);
        }
        return new HashSet(i2, true != z2 ? 1.0f : 0.75f);
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t3) {
        return Collections.singletonList(t3);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i2) {
        return i2 == 0 ? new ArraySet() : zza(i2, true);
    }

    private static Map zzb(int i2, boolean z2) {
        return i2 <= 256 ? new ArrayMap(i2) : new HashMap(i2, 1.0f);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k2, @NonNull V v2, @NonNull K k3, @NonNull V v3, @NonNull K k4, @NonNull V v4, @NonNull K k5, @NonNull V v5, @NonNull K k7, @NonNull V v6, @NonNull K k8, @NonNull V v7) {
        Map mapZzb = zzb(6, false);
        mapZzb.put(k2, v2);
        mapZzb.put(k3, v3);
        mapZzb.put(k4, v4);
        mapZzb.put(k5, v5);
        mapZzb.put(k7, v6);
        mapZzb.put(k8, v7);
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t3 = tArr[0];
            T t4 = tArr[1];
            Set setZza = zza(2, false);
            setZza.add(t3);
            setZza.add(t4);
            return Collections.unmodifiableSet(setZza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZza2 = zza(length, false);
            Collections.addAll(setZza2, tArr);
            return Collections.unmodifiableSet(setZza2);
        }
        T t5 = tArr[0];
        T t6 = tArr[1];
        T t7 = tArr[2];
        T t8 = tArr[3];
        Set setZza3 = zza(4, false);
        setZza3.add(t5);
        setZza3.add(t6);
        setZza3.add(t7);
        setZza3.add(t8);
        return Collections.unmodifiableSet(setZza3);
    }
}
