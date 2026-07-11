package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzaan implements zzafn<zzaiz> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zza.zza(aC.n(str));
    }

    zzaan(zzaam zzaamVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzaiz zzaizVar) {
        zzaiz zzaizVar2 = zzaizVar;
        if (zzaizVar2.zzf()) {
            this.zza.zza(new zzaaj(zzaizVar2.zzc(), zzaizVar2.zze(), null));
        } else {
            this.zzb.zza(new zzahn(zzaizVar2.zzd(), zzaizVar2.zzb(), Long.valueOf(zzaizVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }
}
