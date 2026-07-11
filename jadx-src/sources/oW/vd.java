package oW;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.internal.zzbu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class vd implements Continuation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f71520n;

    vd(M m2, RecaptchaAction recaptchaAction) {
        this.f71520n = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f71520n);
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (exc instanceof zzbu) {
            if (Log.isLoggable("RecaptchaHandler", 4)) {
                Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
            }
            return Tasks.forResult("");
        }
        return Tasks.forException(exc);
    }
}
