package com.google.android.gms.internal.p002firebaseauthapi;

import com.safedk.android.analytics.brandsafety.l;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzap {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.zza) + l.ae + String.valueOf(this.zzb) + " and " + String.valueOf(this.zza) + l.ae + String.valueOf(this.zzc));
    }

    zzap(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }
}
