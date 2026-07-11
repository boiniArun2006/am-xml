package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcr {

    @GuardedBy
    private static final ArrayMap zza = new ArrayMap();

    public static synchronized Uri zza(String str) {
        ArrayMap arrayMap = zza;
        Uri uri = (Uri) arrayMap.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        arrayMap.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
