package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqe implements zzqi {
    private final String zza;
    private final zzaae zzb;
    private final zzajp zzc;
    private final zzws.zza zzd;
    private final zzxu zze;
    private final Integer zzf;

    public static zzqe zza(String str, zzajp zzajpVar, zzws.zza zzaVar, zzxu zzxuVar, Integer num) throws GeneralSecurityException {
        if (zzxuVar == zzxu.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzqe(str, zzqq.zza(str), zzajpVar, zzaVar, zzxuVar, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqi
    public final zzaae zzb() {
        return this.zzb;
    }

    public final zzxu zzc() {
        return this.zze;
    }

    public final zzajp zzd() {
        return this.zzc;
    }

    public final Integer zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zza;
    }

    private zzqe(String str, zzaae zzaaeVar, zzajp zzajpVar, zzws.zza zzaVar, zzxu zzxuVar, Integer num) {
        this.zza = str;
        this.zzb = zzaaeVar;
        this.zzc = zzajpVar;
        this.zzd = zzaVar;
        this.zze = zzxuVar;
        this.zzf = num;
    }

    public final zzws.zza zza() {
        return this.zzd;
    }
}
