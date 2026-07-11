package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.EmailAuthCredential;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzaaq implements zzafn<zzahn> {
    private final /* synthetic */ EmailAuthCredential zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzaeg zzc;
    private final /* synthetic */ zzaam zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zzc.zza(aC.n(str));
    }

    zzaaq(zzaam zzaamVar, EmailAuthCredential emailAuthCredential, String str, zzaeg zzaegVar) {
        this.zza = emailAuthCredential;
        this.zzb = str;
        this.zzc = zzaegVar;
        this.zzd = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        this.zzd.zza(new zzagp(this.zza, zzahnVar.zzc(), this.zzb), this.zzc);
    }
}
