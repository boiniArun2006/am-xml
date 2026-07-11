package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhmr implements zzhla {
    private static final zzhmr zza = new zzhmr();
    private static final zzhku zzb = zzhku.zzd(zzhmo.zza, zzhjo.class, zzhbo.class);

    zzhmr() {
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhbo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhbo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhjs zzhjsVar;
        zzhjs zzhjsVarZza;
        zzhye zzhyeVarZzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i2 = 0; i2 < zzhjjVar.zzd(); i2++) {
            zzhbi zzhbiVarZze = ((zzhbk) zzhjjVar).zze(i2);
            if (zzhbiVarZze.zzb().equals(zzhbb.zza)) {
                zzhbo zzhboVar = (zzhbo) zzhkzVar.zza(zzhbiVarZze);
                zzhaz zzhazVarZza = zzhbiVarZze.zza();
                if (zzhazVarZza instanceof zzhmm) {
                    zzhyeVarZzd = ((zzhmm) zzhazVarZza).zze();
                } else {
                    if (!(zzhazVarZza instanceof zzhjo)) {
                        String name = zzhazVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhazVarZza.zza());
                        StringBuilder sb = new StringBuilder(name.length() + 59 + strValueOf.length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(strValueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zzhyeVarZzd = ((zzhjo) zzhazVarZza).zzd();
                }
                zzhkpVar.zza(zzhyeVarZzd, new zzhmp(zzhboVar, zzhbiVarZze.zzc()));
            }
        }
        if (zzhjrVar.zza()) {
            zzhjsVar = zzhjv.zza;
            zzhjsVarZza = zzhjsVar;
        } else {
            zzhjt zzhjtVarZzb = zzhkb.zza().zzb();
            zzhjs zzhjsVarZza2 = zzhjtVarZzb.zza(zzhjjVar, zzhjrVar, "mac", "compute");
            zzhjsVarZza = zzhjtVarZzb.zza(zzhjjVar, zzhjrVar, "mac", "verify");
            zzhjsVar = zzhjsVarZza2;
        }
        zzhbk zzhbkVar = (zzhbk) zzhjjVar;
        return new zzhmq(new zzhmp((zzhbo) zzhkzVar.zza(zzhbkVar.zzc()), zzhbkVar.zzc().zzc()), zzhkpVar.zzb(), zzhjsVar, zzhjsVarZza, null);
    }

    static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }
}
