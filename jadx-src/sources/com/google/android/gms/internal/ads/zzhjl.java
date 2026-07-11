package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzhjl implements zzhba {
    final String zza;
    final Class zzb;
    final zzhqb zzc;

    zzhjl(String str, Class cls, zzhqb zzhqbVar, zzidk zzidkVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzhqbVar;
    }

    public static zzhba zze(String str, Class cls, zzhqb zzhqbVar, zzidk zzidkVar) {
        return new zzhjl(str, cls, zzhqbVar, zzidkVar);
    }

    public static zzhbq zzf(String str, Class cls, zzidk zzidkVar) {
        return new zzhjk(str, cls, zzidkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final Object zza(zzian zzianVar) throws GeneralSecurityException {
        return zzhkd.zza().zzd(zzhkg.zza().zzg(zzhlb.zza(this.zza, zzianVar, this.zzc, zzhqy.RAW, null), zzhax.zza()), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final zzhqc zzd(zzian zzianVar) throws GeneralSecurityException {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza(this.zza);
        zzhqeVarZze.zzb(zzianVar);
        zzhqeVarZze.zzc(zzhqy.RAW);
        zzhlb zzhlbVar = (zzhlb) zzhkg.zza().zzh(zzhjx.zza().zzc(zzhkg.zza().zzj(zzhlc.zzb((zzhqf) zzhqeVarZze.zzbu())), null), zzhlb.class, zzhax.zza());
        zzhqa zzhqaVarZzd = zzhqc.zzd();
        zzhqaVarZzd.zza(zzhlbVar.zzg());
        zzhqaVarZzd.zzb(zzhlbVar.zzb());
        zzhqaVarZzd.zzc(zzhlbVar.zzc());
        return (zzhqc) zzhqaVarZzd.zzbu();
    }
}
