package oW;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Lu implements OnFailureListener {
    private final /* synthetic */ P J2;
    private final /* synthetic */ s4 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final /* synthetic */ boolean f71465O;
    private final /* synthetic */ TaskCompletionSource Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f71466n;
    private final /* synthetic */ boolean nr;
    private final /* synthetic */ String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Activity f71467t;

    Lu(s4 s4Var, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z2, boolean z3, P p2, TaskCompletionSource taskCompletionSource) {
        this.f71466n = firebaseAuth;
        this.rl = str;
        this.f71467t = activity;
        this.nr = z2;
        this.f71465O = z3;
        this.J2 = p2;
        this.Uo = taskCompletionSource;
        this.KN = s4Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(s4.rl, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        if (this.f71466n.a().nr("PHONE_PROVIDER")) {
            this.KN.t(this.f71466n, this.rl, this.f71467t, this.nr, this.f71465O, this.J2, this.Uo);
        } else {
            this.Uo.setResult(new O().rl());
        }
    }
}
