package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhfl extends zzhcg {
    private final zzhfq zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhfl(zzhfq zzhfqVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhfqVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final zzhye zzc() {
        return this.zzc;
    }

    public final zzhyg zze() {
        return this.zzb;
    }

    public final zzhfq zzf() {
        return this.zza;
    }

    public static zzhfl zzd(zzhfq zzhfqVar, zzhyg zzhygVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhfp zzhfpVarZzc = zzhfqVar.zzc();
        zzhfp zzhfpVar = zzhfp.zzb;
        if (zzhfpVarZzc != zzhfpVar && num == null) {
            String string = zzhfqVar.zzc().toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhfqVar.zzc() == zzhfpVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() == 32) {
            if (zzhfqVar.zzc() == zzhfpVar) {
                zzhyeVarZzb = zzhkh.zza;
            } else if (zzhfqVar.zzc() == zzhfp.zza) {
                zzhyeVarZzb = zzhkh.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhfqVar.zzc().toString()));
            }
            return new zzhfl(zzhfqVar, zzhygVar, zzhyeVarZzb, num);
        }
        int iZzd = zzhygVar.zzd();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 68);
        sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
        sb2.append(iZzd);
        throw new GeneralSecurityException(sb2.toString());
    }
}
