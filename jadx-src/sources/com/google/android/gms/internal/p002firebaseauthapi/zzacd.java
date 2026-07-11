package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzacd implements zzafn<zzahn> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzaeg zzb;
    private final /* synthetic */ zzaam zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zzb.zza(aC.n(str));
    }

    zzacd(zzaam zzaamVar, String str, zzaeg zzaegVar) {
        this.zza = str;
        this.zzb = zzaegVar;
        this.zzc = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        zzahn zzahnVar2 = zzahnVar;
        String strZzc = zzahnVar2.zzc();
        zzaid zzaidVar = new zzaid();
        zzaidVar.zzd(strZzc).zzf(this.zza);
        zzaam.zza(this.zzc, this.zzb, zzahnVar2, zzaidVar, this);
    }
}
