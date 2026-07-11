package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabp implements zzafn<zzags> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zza.zza(aC.n(str));
    }

    zzabp(zzaam zzaamVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzags zzagsVar) {
        zzags zzagsVar2 = zzagsVar;
        this.zzb.zza(new zzahn(zzagsVar2.zzb(), zzagsVar2.zza(), Long.valueOf(zzahp.zza(zzagsVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
