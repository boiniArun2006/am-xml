package oW;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.zzbu;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class iwV implements Continuation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f71502n;
    private final /* synthetic */ M rl;

    iwV(M m2, String str) {
        this.f71502n = str;
        this.rl = m2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        String str;
        if (!task.isSuccessful()) {
            return Tasks.forException(new zzbu((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzahk zzahkVar = (zzahk) task.getResult();
        String strZza = zzahkVar.zza();
        if (zzae.zzc(strZza)) {
            return Tasks.forException(new zzbu("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f71502n));
        }
        List<String> listZza = zzv.zza('/').zza((CharSequence) strZza);
        if (listZza.size() != 4) {
            str = null;
        } else {
            str = listZza.get(3);
        }
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + strZza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f71502n);
        }
        M m2 = this.rl;
        Task taskN = m2.J2.n((Application) m2.nr.qie(), str);
        M.t(this.rl, zzahkVar, taskN, this.f71502n);
        return taskN;
    }
}
