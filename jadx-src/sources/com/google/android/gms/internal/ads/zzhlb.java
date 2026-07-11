package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlb implements zzhlg {
    private final String zza;
    private final zzhye zzb;
    private final zzian zzc;
    private final zzhqb zzd;
    private final zzhqy zze;
    private final Integer zzf;

    private zzhlb(String str, zzhye zzhyeVar, zzian zzianVar, zzhqb zzhqbVar, zzhqy zzhqyVar, Integer num) {
        this.zza = str;
        this.zzb = zzhyeVar;
        this.zzc = zzianVar;
        this.zzd = zzhqbVar;
        this.zze = zzhqyVar;
        this.zzf = num;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final zzhqb zzc() {
        return this.zzd;
    }

    public final zzhqy zzd() {
        return this.zze;
    }

    public final Integer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final zzhye zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zza;
    }

    public static zzhlb zza(String str, zzian zzianVar, zzhqb zzhqbVar, zzhqy zzhqyVar, Integer num) throws GeneralSecurityException {
        if (zzhqyVar == zzhqy.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzhlb(str, zzhln.zzb(str), zzianVar, zzhqbVar, zzhqyVar, num);
    }
}
