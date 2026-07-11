package oW;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class qz implements OnFailureListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Pl f71510n;

    qz(Pl pl) {
        this.f71510n = pl;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof FirebaseNetworkException) {
            C.KN.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f71510n.f71482t.nr();
        }
    }
}
