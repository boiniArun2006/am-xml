package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabm implements zzafn<zzajd> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzabj zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zza.zza(aC.n(str));
    }

    zzabm(zzabj zzabjVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzabjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzajd zzajdVar) {
        zzajd zzajdVar2 = zzajdVar;
        if (!TextUtils.isEmpty(zzajdVar2.zza()) && !TextUtils.isEmpty(zzajdVar2.zzb())) {
            this.zzb.zza.zza(new zzahn(zzajdVar2.zzb(), zzajdVar2.zza(), Long.valueOf(zzahp.zza(zzajdVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
            return;
        }
        this.zza.zza(aC.n("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
