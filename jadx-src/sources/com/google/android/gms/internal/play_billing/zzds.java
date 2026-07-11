package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzds {
    static int zza(Set set) {
        int iHashCode;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i2 += iHashCode;
        }
        return i2;
    }
}
