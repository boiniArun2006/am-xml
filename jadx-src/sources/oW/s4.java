package oW;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.internal.p002firebaseauthapi.zzafr;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.internal.p002firebaseauthapi.zzahj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class s4 {
    private static final String rl = "s4";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final s4 f71516t = new s4();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f71517n;

    private final void nr(FirebaseAuth firebaseAuth, P p2, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new FirebaseAuthMissingActivityForRecaptchaException());
            return;
        }
        Z.nr(firebaseAuth.KN().qie(), firebaseAuth);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (QJ.rl().KN(activity, taskCompletionSource2)) {
            new zzafr(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzaei.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new pO(this, taskCompletionSource)).addOnFailureListener(new Sis(this, taskCompletionSource));
    }

    public static s4 rl() {
        return f71516t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z2, boolean z3, final P p2, final TaskCompletionSource taskCompletionSource) {
        if (!z2 || z3) {
            nr(firebaseAuth, p2, activity, taskCompletionSource);
        } else {
            (!TextUtils.isEmpty(this.f71517n) ? Tasks.forResult(new zzahj(this.f71517n)) : firebaseAuth.iF()).continueWithTask(firebaseAuth.eTf(), new iF(this, str, IntegrityManagerFactory.create(firebaseAuth.KN().qie()))).addOnCompleteListener(new OnCompleteListener() { // from class: oW.m
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    s4.J2(this.f71505n, taskCompletionSource, firebaseAuth, p2, activity, task);
                }
            });
        }
    }

    public static boolean xMQ(Exception exc) {
        if (exc instanceof FirebaseAuthMissingActivityForRecaptchaException) {
            return true;
        }
        return (exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).n().endsWith("UNAUTHORIZED_DOMAIN");
    }

    public final Task n(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z2, boolean z3, boolean z4, final RecaptchaAction recaptchaAction) {
        C2308I28 c2308i28 = (C2308I28) firebaseAuth.gh();
        final P pJ2 = P.J2();
        if (zzagd.zza(firebaseAuth.KN()) || c2308i28.O()) {
            return Tasks.forResult(new O().rl());
        }
        String str2 = rl;
        Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z3 + ", ForceRecaptchav2Flow from firebaseSettings = " + c2308i28.t());
        boolean z5 = z3 || c2308i28.t();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task taskO = pJ2.O();
        if (taskO != null) {
            if (taskO.isSuccessful()) {
                return Tasks.forResult(new O().nr((String) taskO.getResult()).rl());
            }
            Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + taskO.getException().getMessage());
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (z5 || z4) {
            t(firebaseAuth, str, activity, z2, z5, pJ2, taskCompletionSource);
        } else {
            Task taskTy = firebaseAuth.ty();
            final boolean z6 = false;
            OnCompleteListener onCompleteListener = new OnCompleteListener() { // from class: oW.w6
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    s4.O(this.f71522n, taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z2, z6, pJ2, task);
                }
            };
            taskCompletionSource = taskCompletionSource;
            taskTy.addOnCompleteListener(onCompleteListener);
        }
        return taskCompletionSource.getTask();
    }

    private s4() {
    }

    public static /* synthetic */ void J2(s4 s4Var, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, P p2, Activity activity, Task task) {
        String message;
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new O().n(((IntegrityTokenResponse) task.getResult()).token()).rl());
            return;
        }
        if (task.getException() == null) {
            message = "";
        } else {
            message = task.getException().getMessage();
        }
        Log.e(rl, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        s4Var.nr(firebaseAuth, p2, activity, taskCompletionSource);
    }

    public static /* synthetic */ void O(s4 s4Var, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z2, boolean z3, P p2, Task task) {
        if (!task.isSuccessful()) {
            Log.e(rl, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.a() != null && firebaseAuth.a().O("PHONE_PROVIDER")) {
            firebaseAuth.a().rl(firebaseAuth.az(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new yg(s4Var, taskCompletionSource)).addOnFailureListener(new Lu(s4Var, firebaseAuth, str, activity, z2, z3, p2, taskCompletionSource));
        } else {
            s4Var.t(firebaseAuth, str, activity, z2, z3, p2, taskCompletionSource);
        }
    }
}
