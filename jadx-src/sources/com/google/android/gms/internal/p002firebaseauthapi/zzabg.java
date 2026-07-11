package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabg implements zzafn<zzahn> {
    final /* synthetic */ zzaam zza;
    private final /* synthetic */ zzait zzb;
    private final /* synthetic */ zzaeg zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zzc.zza(aC.n(str));
    }

    zzabg(zzaam zzaamVar, zzait zzaitVar, zzaeg zzaegVar) {
        this.zzb = zzaitVar;
        this.zzc = zzaegVar;
        this.zza = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        this.zzb.zzb(true);
        this.zzb.zza(zzahnVar.zzc());
        this.zza.zza.zza(this.zzb, new zzabf(this, this.zzc, this));
    }
}
