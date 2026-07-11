package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgry {
    public static zzgru zza(zzgru zzgruVar) {
        return ((zzgruVar instanceof zzgrx) || (zzgruVar instanceof zzgrv)) ? zzgruVar : zzgruVar instanceof Serializable ? new zzgrv(zzgruVar) : new zzgrx(zzgruVar);
    }
}
