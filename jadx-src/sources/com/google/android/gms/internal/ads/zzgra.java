package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzgra implements Serializable {
    zzgra() {
    }

    public static zzgra zzc() {
        return zzgqj.zza;
    }

    public abstract Object zza(Object obj);

    public abstract zzgra zzb(zzgqt zzgqtVar);

    public static zzgra zzd(Object obj) {
        return obj == null ? zzgqj.zza : new zzgrh(obj);
    }
}
