package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class iF extends oW.nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f60160n;
    private final /* synthetic */ ActionCodeSettings rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60161t;

    iF(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.f60160n = str;
        this.rl = actionCodeSettings;
        this.f60161t = firebaseAuth;
    }

    @Override // oW.nKK
    public final Task t(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link sign in for " + this.f60160n + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + this.f60160n);
        }
        return this.f60161t.f60094O.zzb(this.f60161t.f60098n, this.f60160n, this.rl, this.f60161t.gh, str);
    }
}
