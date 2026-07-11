package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabq implements zzafn<zzagq> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzabn zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zza.zza(aC.n(str));
    }

    zzabq(zzabn zzabnVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzabnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzagq zzagqVar) {
        zzagq zzagqVar2 = zzagqVar;
        this.zzb.zza.zza(new zzahn(zzagqVar2.zzb(), zzagqVar2.zza(), Long.valueOf(zzahp.zza(zzagqVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
