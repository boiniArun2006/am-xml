package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class K extends PhoneAuthProvider.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ PhoneAuthProvider.j f60112n;
    private final /* synthetic */ FirebaseAuth rl;

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    K(FirebaseAuth firebaseAuth, PhoneAuthProvider.j jVar) {
        this.f60112n = jVar;
        this.rl = firebaseAuth;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.f60112n.onVerificationCompleted(PhoneAuthProvider.n(str, (String) Preconditions.checkNotNull(this.rl.Uo.rl())));
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f60112n.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onVerificationFailed(FirebaseException firebaseException) {
        this.f60112n.onVerificationFailed(firebaseException);
    }
}
