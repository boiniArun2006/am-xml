package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhdw extends zzhcg {
    private final zzheb zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhdw(zzheb zzhebVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhebVar;
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

    public final zzheb zzf() {
        return this.zza;
    }

    public static zzhdw zzd(zzhea zzheaVar, zzhyg zzhygVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhea zzheaVar2 = zzhea.zzc;
        if (zzheaVar != zzheaVar2 && num == null) {
            String string = zzheaVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzheaVar == zzheaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int iZzd = zzhygVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzheb zzhebVarZzb = zzheb.zzb(zzheaVar);
        if (zzhebVarZzb.zzc() == zzheaVar2) {
            zzhyeVarZzb = zzhkh.zza;
        } else if (zzhebVarZzb.zzc() == zzhea.zzb) {
            zzhyeVarZzb = zzhkh.zza(num.intValue());
        } else {
            if (zzhebVarZzb.zzc() != zzhea.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhebVarZzb.zzc().toString()));
            }
            zzhyeVarZzb = zzhkh.zzb(num.intValue());
        }
        return new zzhdw(zzhebVarZzb, zzhygVar, zzhyeVarZzb, num);
    }
}
