package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfgm implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzfgm(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzfgm zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzfgm(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfgj zzb() {
        Context context = (Context) this.zza.zzb();
        zzfkv zzfkvVar = (zzfkv) this.zzb.zzb();
        zzfln zzflnVar = (zzfln) this.zzc.zzb();
        zzcdp zzcdpVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhk)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z2 = false;
        if (zzcdpVarZzi != null && zzcdpVarZzi.zzi()) {
            z2 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhm)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhj)).booleanValue() || z2) {
                zzflm zzflmVarZza = zzflnVar.zza(zzfld.Rewarded, context, zzfkvVar, new zzffm(new zzffl()));
                zzfga zzfgaVar = new zzfga(new zzffz());
                zzfkz zzfkzVar = zzflmVarZza.zza;
                zzgzy zzgzyVar = zzcei.zza;
                return new zzffq(zzfgaVar, new zzffw(zzfkzVar, zzgzyVar), zzflmVarZza.zzb, zzfkzVar.zze().zzf, zzgzyVar);
            }
        }
        return new zzffz();
    }
}
