package oW;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class nKK {
    public abstract Task t(String str);

    private static Task nr(M m2, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task taskRl = m2.rl(str, Boolean.FALSE, recaptchaAction);
        return taskRl.continueWithTask(continuation).continueWithTask(new Ln(str, m2, recaptchaAction, continuation));
    }

    public final Task rl(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: oW.DAz
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                nKK nkk = this.f71453n;
                if (task.isSuccessful()) {
                    return nkk.t((String) task.getResult());
                }
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) Preconditions.checkNotNull(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                return nkk.t("NO_RECAPTCHA");
            }
        };
        M mA2 = firebaseAuth.a();
        return (mA2 == null || !mA2.O(str2)) ? t(null).continueWithTask(new Continuation() { // from class: oW.u
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return nKK.n(recaptchaAction, firebaseAuth, str, continuation, task);
            }
        }) : nr(mA2, recaptchaAction, str, continuation);
    }

    static /* synthetic */ Task n(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (zzaei.zzd(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.a() == null) {
                firebaseAuth.FX(new M(firebaseAuth.KN(), firebaseAuth));
            }
            return nr(firebaseAuth.a(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }
}
