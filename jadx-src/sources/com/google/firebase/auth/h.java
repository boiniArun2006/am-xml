package com.google.firebase.auth;

import android.util.Log;
import com.alightcreative.time.Kw.znsSxz;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class h implements OnCompleteListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Pl f60158n;
    private final /* synthetic */ String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60159t;

    h(FirebaseAuth firebaseAuth, Pl pl, String str) {
        this.f60158n = pl;
        this.rl = str;
        this.f60159t = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String message;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if (exception != null) {
                message = exception.getMessage();
            } else {
                message = "";
            }
            Log.e("FirebaseAuth", "Error while validating application identity: " + message);
            if (exception != null && oW.s4.xMQ(exception)) {
                FirebaseAuth.U((FirebaseException) exception, this.f60158n, this.rl);
                return;
            }
            Log.e("FirebaseAuth", znsSxz.jvKRmuV);
        }
        this.f60159t.M(this.f60158n, (oW.mz) task.getResult());
    }
}
