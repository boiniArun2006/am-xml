package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzikb {
    final LinkedHashMap zza;

    final zzikb zza(Object obj, zzikp zzikpVar) {
        zziko.zza(obj, "key");
        zziko.zza(zzikpVar, "provider");
        this.zza.put(obj, zzikpVar);
        return this;
    }

    zzikb(int i2) {
        this.zza = zzikd.zzc(i2);
    }
}
