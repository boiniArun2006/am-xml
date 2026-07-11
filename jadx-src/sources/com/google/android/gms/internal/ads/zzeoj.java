package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class zzeoj extends zzepk {
    private final zzdjv zza;

    public zzeoj(zzdbd zzdbdVar, zzdjk zzdjkVar, zzdbx zzdbxVar, zzdcm zzdcmVar, zzdcr zzdcrVar, zzdbs zzdbsVar, zzdgj zzdgjVar, zzdki zzdkiVar, zzddq zzddqVar, zzdjv zzdjvVar, zzdgf zzdgfVar) {
        super(zzdbdVar, zzdjkVar, zzdbxVar, zzdcmVar, zzdcrVar, zzdgjVar, zzddqVar, zzdkiVar, zzdgfVar, zzdbsVar);
        this.zza = zzdjvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepk, com.google.android.gms.internal.ads.zzbtz
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzepk, com.google.android.gms.internal.ads.zzbtz
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzepk, com.google.android.gms.internal.ads.zzbtz
    public final void zzp(zzcas zzcasVar) {
        this.zza.zzb(zzcasVar);
    }

    @Override // com.google.android.gms.internal.ads.zzepk, com.google.android.gms.internal.ads.zzbtz
    public final void zzr(zzcaw zzcawVar) throws RemoteException {
        this.zza.zzb(new zzcas(zzcawVar.zze(), zzcawVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzepk, com.google.android.gms.internal.ads.zzbtz
    public final void zzt() throws RemoteException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzepk, com.google.android.gms.internal.ads.zzbtz
    public final void zzz() throws RemoteException {
        this.zza.zzb(null);
    }
}
