package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabl implements zzafn<zzaiv> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zza.zza(aC.n(str));
    }

    zzabl(zzaam zzaamVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzaiv zzaivVar) {
        zzaiv zzaivVar2 = zzaivVar;
        if (!zzaivVar2.zzl()) {
            zzaam.zza(this.zzb, zzaivVar2, this.zza, this);
        } else {
            this.zza.zza(new zzaaj(zzaivVar2.zzf(), zzaivVar2.zzk(), zzaivVar2.zzb()));
        }
    }
}
