package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.n;
import com.google.firebase.auth.FirebaseAuth.w6;
import oW.InterfaceC2316p;

/* JADX INFO: renamed from: com.google.firebase.auth.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class C1907c extends oW.nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ boolean f60156n;
    private final /* synthetic */ FirebaseAuth nr;
    private final /* synthetic */ FirebaseUser rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ EmailAuthCredential f60157t;

    C1907c(FirebaseAuth firebaseAuth, boolean z2, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.f60156n = z2;
        this.rl = firebaseUser;
        this.f60157t = emailAuthCredential;
        this.nr = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    @Override // oW.nKK
    public final Task t(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (this.f60156n) {
            return this.nr.f60094O.zzb(this.nr.f60098n, (FirebaseUser) Preconditions.checkNotNull(this.rl), this.f60157t, str, (oW.Zs) this.nr.new n());
        }
        return this.nr.f60094O.zza(this.nr.f60098n, this.f60157t, str, (InterfaceC2316p) this.nr.new w6());
    }
}
