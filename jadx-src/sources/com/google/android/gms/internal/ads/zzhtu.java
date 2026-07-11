package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhtu implements zzhla {
    private static final zzhtu zza = new zzhtu();
    private static final zzhku zzb = zzhku.zzd(zzhtr.zza, zzhjo.class, zzhbs.class);

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhbs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhbs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhye zzhyeVarZzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i2 = 0; i2 < zzhjjVar.zzd(); i2++) {
            zzhbi zzhbiVarZze = ((zzhbk) zzhjjVar).zze(i2);
            if (zzhbiVarZze.zzb().equals(zzhbb.zza)) {
                zzhbs zzhbsVar = (zzhbs) zzhkzVar.zza(zzhbiVarZze);
                zzhaz zzhazVarZza = zzhbiVarZze.zza();
                if (zzhazVarZza instanceof zzhuw) {
                    zzhyeVarZzd = ((zzhuw) zzhazVarZza).zze();
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
                zzhkpVar.zza(zzhyeVarZzd, new zzhts(zzhbsVar, zzhbiVarZze.zzc()));
            }
        }
        return new zzhtt(zzhkpVar.zzb(), !zzhjrVar.zza() ? zzhkb.zza().zzb().zza(zzhjjVar, zzhjrVar, "public_key_verify", "verify") : zzhjv.zza);
    }

    static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }
}
