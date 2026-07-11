package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzafc implements zzafe {
    private final /* synthetic */ Status zza;

    zzafc(zzaez zzaezVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(PhoneAuthProvider.j jVar, Object... objArr) {
        jVar.onVerificationFailed(zzaei.zza(this.zza));
    }
}
