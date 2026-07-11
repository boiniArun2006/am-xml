package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaap implements zzafn<zzago> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zza.zza(aC.n(str));
    }

    zzaap(zzaam zzaamVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzago zzagoVar) {
        zzago zzagoVar2 = zzagoVar;
        if (zzagoVar2.zzf()) {
            this.zza.zza(new zzaaj(zzagoVar2.zzc(), zzagoVar2.zze(), null));
        } else {
            this.zzb.zza(new zzahn(zzagoVar2.zzd(), zzagoVar2.zzb(), Long.valueOf(zzagoVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzagoVar2.zzg()), null, this.zza, this);
        }
    }
}
