package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabj implements zzafn<zzahn> {
    final /* synthetic */ zzaam zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzaeg zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zzd.zza(aC.n(str));
    }

    zzabj(zzaam zzaamVar, String str, String str2, zzaeg zzaegVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaegVar;
        this.zza = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        this.zza.zza.zza(new zzaja(zzahnVar.zzc(), this.zzb, this.zzc), new zzabm(this, this.zzd));
    }
}
