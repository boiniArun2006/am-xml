package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcum implements zzikg {
    private final zzikp zza;

    private zzcum(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcum zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcum(zzcueVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgup zzgupVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzob)).booleanValue() ? zzgup.zzi(new zzdje(((zzcvq) this.zza).zzb(), zzcei.zza)) : zzgup.zzh();
        zziko.zzb(zzgupVarZzi);
        return zzgupVarZzi;
    }
}
