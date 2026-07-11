package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class UGc extends oW.nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ boolean f60146n;
    private final /* synthetic */ FirebaseAuth nr;
    private final /* synthetic */ FirebaseUser rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ EmailAuthCredential f60147t;

    UGc(FirebaseAuth firebaseAuth, boolean z2, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.f60146n = z2;
        this.rl = firebaseUser;
        this.f60147t = emailAuthCredential;
        this.nr = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    @Override // oW.nKK
    public final Task t(String str) {
        if (this.f60146n) {
            if (TextUtils.isEmpty(str)) {
                Log.i("FirebaseAuth", " Email link reauth with empty reCAPTCHA token");
            } else {
                Log.i("FirebaseAuth", gUxOLwRQBPPLC.gedeiiEfYHU);
            }
            return this.nr.f60094O.zza(this.nr.f60098n, this.rl, this.f60147t, str, (oW.Zs) this.nr.new n());
        }
        String strZzc = this.f60147t.zzc();
        String strZzd = this.f60147t.zzd();
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Reauthenticating " + strZzc + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with " + strZzc);
        }
        return this.nr.f60094O.zza(this.nr.f60098n, this.rl, strZzc, Preconditions.checkNotEmpty(strZzd), this.rl.Uf(), str, this.nr.new n());
    }
}
