package uh;

import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class fuX implements com.google.firebase.firestore.Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f74511n;
    private final com.google.firebase.firestore.Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile boolean f74512t = false;

    public void t() {
        this.f74512t = true;
    }

    public static /* synthetic */ void rl(fuX fux, Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        if (fux.f74512t) {
            return;
        }
        fux.rl.n(obj, firebaseFirestoreException);
    }

    @Override // com.google.firebase.firestore.Dsr
    public void n(final Object obj, final FirebaseFirestoreException firebaseFirestoreException) {
        this.f74511n.execute(new Runnable() { // from class: uh.CN3
            @Override // java.lang.Runnable
            public final void run() {
                fuX.rl(this.f74437n, obj, firebaseFirestoreException);
            }
        });
    }

    public fuX(Executor executor, com.google.firebase.firestore.Dsr dsr) {
        this.f74511n = executor;
        this.rl = dsr;
    }
}
