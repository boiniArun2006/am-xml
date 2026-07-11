package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhfr extends zzhcg {
    private final zzhfx zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhfr(zzhfx zzhfxVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num) {
        this.zza = zzhfxVar;
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

    public final zzhfx zzf() {
        return this.zza;
    }

    public static zzhfr zzd(zzhfw zzhfwVar, zzhyg zzhygVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhfw zzhfwVar2 = zzhfw.zzc;
        if (zzhfwVar != zzhfwVar2 && num == null) {
            String string = zzhfwVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhfwVar == zzhfwVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhygVar.zzd() != 32) {
            int iZzd = zzhygVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 75);
            sb2.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzhfx zzhfxVarZzb = zzhfx.zzb(zzhfwVar);
        if (zzhfxVarZzb.zzc() == zzhfwVar2) {
            zzhyeVarZzb = zzhkh.zza;
        } else if (zzhfxVarZzb.zzc() == zzhfw.zzb) {
            zzhyeVarZzb = zzhkh.zza(num.intValue());
        } else {
            if (zzhfxVarZzb.zzc() != zzhfw.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhfxVarZzb.zzc().toString()));
            }
            zzhyeVarZzb = zzhkh.zzb(num.intValue());
        }
        return new zzhfr(zzhfxVarZzb, zzhygVar, zzhyeVarZzb, num);
    }
}
