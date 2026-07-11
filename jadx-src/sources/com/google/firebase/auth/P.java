package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class P extends oW.nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f60120n;
    private final /* synthetic */ ActionCodeSettings rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60121t;

    P(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.f60120n = str;
        this.rl = actionCodeSettings;
        this.f60121t = firebaseAuth;
    }

    @Override // oW.nKK
    public final Task t(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Password reset request " + this.f60120n + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + this.f60120n);
        }
        return this.f60121t.f60094O.zza(this.f60121t.f60098n, this.f60120n, this.rl, this.f60121t.gh, str);
    }
}
