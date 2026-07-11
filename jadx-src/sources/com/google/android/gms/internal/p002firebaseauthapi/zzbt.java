package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzbt implements zzod {
    private final zzbm zza;
    private final zzbo zzb;
    private final int zzc;
    private final boolean zzd;

    private zzbt(zzbm zzbmVar, zzbo zzboVar, int i2, boolean z2) {
        this.zza = zzbmVar;
        this.zzb = zzboVar;
        this.zzc = i2;
        this.zzd = z2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzod
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzod
    public final zzbm zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzod
    public final zzbo zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzd;
    }
}
