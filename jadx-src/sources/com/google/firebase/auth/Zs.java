package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Zs extends PhoneAuthProvider.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Pl f60154n;
    private final /* synthetic */ FirebaseAuth nr;
    private final /* synthetic */ oW.mz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ PhoneAuthProvider.j f60155t;

    Zs(FirebaseAuth firebaseAuth, Pl pl, oW.mz mzVar, PhoneAuthProvider.j jVar) {
        this.f60154n = pl;
        this.rl = mzVar;
        this.f60155t = jVar;
        this.nr = firebaseAuth;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f60155t.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.f60155t.onCodeSent(str, forceResendingToken);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f60155t.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.j
    public final void onVerificationFailed(FirebaseException firebaseException) {
        if (zzaei.zza(firebaseException)) {
            this.f60154n.t(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.f60154n.gh());
            FirebaseAuth.E(this.f60154n);
            return;
        }
        if (!TextUtils.isEmpty(this.rl.t())) {
            if (zzaei.zzb(firebaseException) && this.nr.a().nr("PHONE_PROVIDER") && TextUtils.isEmpty(this.rl.rl())) {
                this.f60154n.O(true);
                Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + this.f60154n.gh());
                FirebaseAuth.E(this.f60154n);
                return;
            }
            Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + this.f60154n.gh() + ", error - " + firebaseException.getMessage());
            this.f60155t.onVerificationFailed(firebaseException);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.f60154n.gh() + ", error - " + firebaseException.getMessage());
        this.f60155t.onVerificationFailed(firebaseException);
    }
}
