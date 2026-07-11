package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzafa implements zzafe {
    private final /* synthetic */ PhoneAuthCredential zza;

    zzafa(zzaez zzaezVar, PhoneAuthCredential phoneAuthCredential) {
        this.zza = phoneAuthCredential;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(PhoneAuthProvider.j jVar, Object... objArr) {
        jVar.onVerificationCompleted(this.zza);
    }
}
