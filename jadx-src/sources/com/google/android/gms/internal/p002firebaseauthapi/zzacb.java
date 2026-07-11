package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.UserProfileChangeRequest;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzacb implements zzafn<zzahn> {
    private final /* synthetic */ UserProfileChangeRequest zza;
    private final /* synthetic */ zzaeg zzb;
    private final /* synthetic */ zzaam zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zzb.zza(aC.n(str));
    }

    zzacb(zzaam zzaamVar, UserProfileChangeRequest userProfileChangeRequest, zzaeg zzaegVar) {
        this.zza = userProfileChangeRequest;
        this.zzb = zzaegVar;
        this.zzc = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        zzahn zzahnVar2 = zzahnVar;
        zzaid zzaidVar = new zzaid();
        zzaidVar.zzd(zzahnVar2.zzc());
        if (this.zza.zzb() || this.zza.getDisplayName() != null) {
            zzaidVar.zzb(this.zza.getDisplayName());
        }
        if (this.zza.zzc() || this.zza.T3L() != null) {
            zzaidVar.zzg(this.zza.zza());
        }
        zzaam.zza(this.zzc, this.zzb, zzahnVar2, zzaidVar, this);
    }
}
