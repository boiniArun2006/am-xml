package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.w6;

/* JADX INFO: renamed from: com.google.firebase.auth.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class C1908m extends oW.nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f60210n;
    private final /* synthetic */ String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60211t;

    C1908m(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f60210n = str;
        this.rl = str2;
        this.f60211t = firebaseAuth;
    }

    @Override // oW.nKK
    public final Task t(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Creating user with " + this.f60210n + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + this.f60210n);
        }
        return this.f60211t.f60094O.zza(this.f60211t.f60098n, this.f60210n, this.rl, this.f60211t.gh, str, this.f60211t.new w6());
    }
}
