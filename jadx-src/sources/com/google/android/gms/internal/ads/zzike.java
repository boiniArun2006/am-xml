package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzike implements zzikg {
    private zzikp zza;

    public static void zza(zzikp zzikpVar, zzikp zzikpVar2) {
        zzike zzikeVar = (zzike) zzikpVar;
        if (zzikeVar.zza != null) {
            throw new IllegalStateException();
        }
        zzikeVar.zza = zzikpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        zzikp zzikpVar = this.zza;
        if (zzikpVar != null) {
            return zzikpVar.zzb();
        }
        throw new IllegalStateException();
    }
}
