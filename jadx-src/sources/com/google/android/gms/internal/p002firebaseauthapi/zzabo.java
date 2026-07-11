package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzabo implements zzafn<zzaij> {
    private final /* synthetic */ zzaig zza;
    private final /* synthetic */ zzaeg zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zzb.zza(aC.n(str));
    }

    zzabo(zzaam zzaamVar, zzaig zzaigVar, zzaeg zzaegVar) {
        this.zza = zzaigVar;
        this.zzb = zzaegVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzaij zzaijVar) {
        zzaij zzaijVar2 = zzaijVar;
        zzaig zzaigVar = this.zza;
        if (zzaigVar instanceof zzaik) {
            this.zzb.zzb(zzaijVar2.zza());
            return;
        }
        if (zzaigVar instanceof zzaim) {
            this.zzb.zza(zzaijVar2);
            return;
        }
        throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + this.zza.getClass().getName() + ".");
    }
}
