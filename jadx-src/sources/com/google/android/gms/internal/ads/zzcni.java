package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcni implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcni(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcni zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzcni(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbzn zzb() {
        Context contextZza = ((zzcmj) this.zza).zza();
        zzfor zzforVar = (zzfor) this.zzb.zzb();
        zzgzy zzgzyVarZzc = zzfmk.zzc();
        zzbsz zzbszVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzforVar);
        zzbst zzbstVar = zzbsw.zza;
        zzbszVarZza.zza("google.afma.request.getAdDictionary", zzbstVar, zzbstVar);
        return new zzbzq(contextZza, com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzforVar).zza("google.afma.sdkConstants.getSdkConstants", zzbstVar, zzbstVar), VersionInfoParcel.forPackage(), zzgzyVarZzc);
    }
}
