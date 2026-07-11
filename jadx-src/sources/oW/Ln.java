package oW;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Ln implements Continuation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f71463n;
    private final /* synthetic */ Continuation nr;
    private final /* synthetic */ M rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f71464t;

    Ln(String str, M m2, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f71463n = str;
        this.rl = m2;
        this.f71464t = recaptchaAction;
        this.nr = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful() && zzaei.zzc((Exception) Preconditions.checkNotNull(task.getException()))) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f71463n);
            }
            return this.rl.rl(this.f71463n, Boolean.TRUE, this.f71464t).continueWithTask(this.nr);
        }
        return task;
    }
}
