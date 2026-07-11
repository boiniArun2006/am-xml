package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzafs extends PhoneAuthProvider.j {
    private final /* synthetic */ PhoneAuthProvider.j zza;
    private final /* synthetic */ String zzb;

    zzafs(PhoneAuthProvider.j jVar, String str) {
        this.zza = jVar;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onCodeAutoRetrievalTimeOut(@NonNull String str) {
        zzaft.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onCodeSent(@NonNull String str, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.zza.onCodeSent(str, forceResendingToken);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onVerificationFailed(@NonNull FirebaseException firebaseException) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationFailed(firebaseException);
    }
}
