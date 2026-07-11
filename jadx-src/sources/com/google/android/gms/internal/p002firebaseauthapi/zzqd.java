package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqd implements zzqi {
    private final zzaae zza;
    private final zzww zzb;

    public static zzqd zza(zzww zzwwVar) throws GeneralSecurityException {
        return new zzqd(zzwwVar, zzqq.zza(zzwwVar.zzf()));
    }

    public static zzqd zzb(zzww zzwwVar) {
        return new zzqd(zzwwVar, zzqq.zzb(zzwwVar.zzf()));
    }

    private zzqd(zzww zzwwVar, zzaae zzaaeVar) {
        this.zzb = zzwwVar;
        this.zza = zzaaeVar;
    }

    public final zzww zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqi
    public final zzaae zzb() {
        return this.zza;
    }
}
