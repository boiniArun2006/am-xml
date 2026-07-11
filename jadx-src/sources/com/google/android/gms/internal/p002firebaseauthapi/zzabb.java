package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabb implements zzafn<zzaih> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzafk zzb;
    private final /* synthetic */ zzaam zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zzb.zza(str);
    }

    zzabb(zzaam zzaamVar, zzaeg zzaegVar, zzafk zzafkVar) {
        this.zza = zzaegVar;
        this.zzb = zzafkVar;
        this.zzc = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzaih zzaihVar) {
        zzaih zzaihVar2 = zzaihVar;
        this.zzc.zza(new zzahn(zzaihVar2.zzc(), zzaihVar2.zzb(), Long.valueOf(zzaihVar2.zza()), "Bearer"), null, "password", Boolean.FALSE, null, this.zza, this);
    }
}
