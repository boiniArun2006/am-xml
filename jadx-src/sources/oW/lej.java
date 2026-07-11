package oW;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class lej implements qf {
    lej() {
    }

    @Override // oW.qf
    public final Task n(Application application, String str) {
        return Recaptcha.fetchTaskClient(application, str);
    }
}
