package oW;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Pl implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71481n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ C f71482t;

    Pl(C c2, String str) {
        this.f71482t = c2;
        this.f71481n = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(com.google.firebase.Wre.ty(this.f71481n));
        if (firebaseAuth.xMQ() != null) {
            Task taskRl = firebaseAuth.rl(true);
            C.KN.v("Token refreshing started", new Object[0]);
            taskRl.addOnFailureListener(new qz(this));
        }
    }
}
