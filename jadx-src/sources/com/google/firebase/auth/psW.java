package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzam;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class psW implements OnCompleteListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Pl f60215n;
    private final /* synthetic */ String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60216t;

    psW(FirebaseAuth firebaseAuth, Pl pl, String str) {
        this.f60215n = pl;
        this.rl = str;
        this.f60216t = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String strNr;
        String strRl;
        String strT;
        if (task.isSuccessful()) {
            strNr = ((oW.mz) task.getResult()).nr();
            strRl = ((oW.mz) task.getResult()).rl();
            strT = ((oW.mz) task.getResult()).t();
        } else {
            Exception exception = task.getException();
            String str = "Error while validating application identity: ";
            if (exception != null) {
                str = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str);
            if (exception != null && oW.s4.xMQ(exception)) {
                FirebaseAuth.U((FirebaseException) exception, this.f60215n, this.rl);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            strT = null;
            strNr = null;
            strRl = null;
        }
        long jLongValue = this.f60215n.mUb().longValue();
        PhoneAuthProvider.j jVarJB = this.f60216t.jB(this.f60215n.gh(), this.f60215n.KN());
        if (TextUtils.isEmpty(strNr)) {
            jVarJB = this.f60216t.Xw(this.f60215n, jVarJB, (oW.mz) task.getResult());
        }
        PhoneAuthProvider.j jVar = jVarJB;
        zzam zzamVar = (zzam) Preconditions.checkNotNull(this.f60215n.J2());
        if (com.google.android.gms.internal.p002firebaseauthapi.zzae.zzc(strT) && this.f60216t.a() != null && this.f60216t.a().nr("PHONE_PROVIDER")) {
            strT = "NO_RECAPTCHA";
        }
        String str2 = strT;
        if (zzamVar.zzd()) {
            this.f60216t.f60094O.zza(zzamVar, (String) Preconditions.checkNotNull(this.f60215n.gh()), this.f60216t.xMQ, jLongValue, this.f60215n.Uo() != null, this.f60215n.ty(), strNr, strRl, str2, this.f60216t.G7(), jVar, this.f60215n.qie(), this.f60215n.rl());
        } else {
            this.f60216t.f60094O.zza(zzamVar, (PhoneMultiFactorInfo) Preconditions.checkNotNull(this.f60215n.xMQ()), this.f60216t.xMQ, jLongValue, this.f60215n.Uo() != null, this.f60215n.ty(), strNr, strRl, str2, this.f60216t.G7(), jVar, this.f60215n.qie(), this.f60215n.rl());
        }
    }
}
