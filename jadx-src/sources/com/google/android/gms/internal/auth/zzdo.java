package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzdo {
    public static zzdj zzb(Object obj) {
        return new zzdn(obj);
    }

    public static zzdj zza(zzdj zzdjVar) {
        return ((zzdjVar instanceof zzdm) || (zzdjVar instanceof zzdk)) ? zzdjVar : zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdm(zzdjVar);
    }
}
