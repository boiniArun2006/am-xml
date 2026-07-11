package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.n;
import com.google.firebase.auth.FirebaseAuth.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class s4 extends oW.nKK {
    private final /* synthetic */ FirebaseAuth J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final /* synthetic */ String f60222O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f60223n;
    private final /* synthetic */ String nr;
    private final /* synthetic */ boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ FirebaseUser f60224t;

    s4(FirebaseAuth firebaseAuth, String str, boolean z2, FirebaseUser firebaseUser, String str2, String str3) {
        this.f60223n = str;
        this.rl = z2;
        this.f60224t = firebaseUser;
        this.nr = str2;
        this.f60222O = str3;
        this.J2 = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    @Override // oW.nKK
    public final Task t(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Logging in as " + this.f60223n + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + this.f60223n);
        }
        if (this.rl) {
            return this.J2.f60094O.zzb(this.J2.f60098n, (FirebaseUser) Preconditions.checkNotNull(this.f60224t), this.f60223n, this.nr, this.f60222O, str, this.J2.new n());
        }
        return this.J2.f60094O.zzb(this.J2.f60098n, this.f60223n, this.nr, this.f60222O, str, this.J2.new w6());
    }
}
