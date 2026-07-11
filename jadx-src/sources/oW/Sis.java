package oW;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuthException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Sis implements OnFailureListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f71487n;

    Sis(s4 s4Var, TaskCompletionSource taskCompletionSource) {
        this.f71487n = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(s4.rl, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).n().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f71487n.setException(exc);
        } else {
            this.f71487n.setResult(new O().rl());
        }
    }
}
