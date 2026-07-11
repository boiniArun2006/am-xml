package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class zzahm {
    protected final zzagh zza;

    protected zzahm(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    protected abstract boolean zza(zzer zzerVar) throws zzat;

    protected abstract boolean zzb(zzer zzerVar, long j2) throws zzat;

    public final boolean zzf(zzer zzerVar, long j2) throws zzat {
        if (zza(zzerVar) && zzb(zzerVar, j2)) {
            return true;
        }
        return false;
    }
}
