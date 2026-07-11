package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfuh {
    public static void zzb(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void zza() {
        if (zzfsh.zzb()) {
        } else {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void zzd(String str, int i2, String str2) {
        if (str.length() <= 256) {
        } else {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
    }
}
