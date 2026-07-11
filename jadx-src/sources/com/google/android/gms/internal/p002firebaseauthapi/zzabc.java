package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabc implements zzafn<zzahn> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzaeg zze;
    private final /* synthetic */ zzaam zzf;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zze.zza(aC.n(str));
    }

    zzabc(zzaam zzaamVar, String str, String str2, String str3, String str4, zzaeg zzaegVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzaegVar;
        this.zzf = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        zzaam.zza(this.zzf, this.zze, new zzaie(this.zza, this.zzb, null, this.zzc, this.zzd, zzahnVar.zzc()), this);
    }
}
