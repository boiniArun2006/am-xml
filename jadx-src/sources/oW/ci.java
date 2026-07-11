package oW;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class ci extends BroadcastReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference f71493n;
    private final TaskCompletionSource rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ QJ f71494t;

    ci(QJ qj, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f71494t = qj;
        this.f71493n = new WeakReference(activity);
        this.rl = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f71493n.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.rl.setException(zzaei.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            QJ.nr(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                QJ.O(this.f71494t, intent, this.rl, context);
                return;
            }
            this.rl.setException(zzaei.zza(aC.n("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        if (Md.nr(intent)) {
            this.rl.setException(zzaei.zza(Md.n(intent)));
            QJ.nr(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.rl.setException(zzaei.zza(aC.n("WEB_CONTEXT_CANCELED")));
            QJ.nr(context);
        }
    }
}
