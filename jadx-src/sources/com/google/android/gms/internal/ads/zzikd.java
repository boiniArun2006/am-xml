package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzikd {
    private static int zzd(int i2) {
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static List zza(int i2) {
        return i2 == 0 ? Collections.EMPTY_LIST : new ArrayList(i2);
    }

    static HashSet zzb(int i2) {
        return new HashSet(zzd(i2));
    }

    public static LinkedHashMap zzc(int i2) {
        return new LinkedHashMap(zzd(i2));
    }
}
