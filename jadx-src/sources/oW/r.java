package oW;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class r extends BroadcastReceiver {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final /* synthetic */ QJ f71511O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference f71512n;
    private final FirebaseUser nr;
    private final TaskCompletionSource rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FirebaseAuth f71513t;

    r(QJ qj, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f71511O = qj;
        this.f71512n = new WeakReference(activity);
        this.rl = taskCompletionSource;
        this.f71513t = firebaseAuth;
        this.nr = firebaseUser;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f71512n.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.rl.setException(zzaei.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            QJ.nr(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (Md.nr(intent)) {
                this.rl.setException(zzaei.zza(Md.n(intent)));
                QJ.nr(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.rl.setException(zzaei.zza(aC.n("WEB_CONTEXT_CANCELED")));
                    QJ.nr(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            QJ qj = this.f71511O;
            TaskCompletionSource taskCompletionSource = this.rl;
            this.f71513t.WPU(QJ.n(intent)).addOnSuccessListener(new C2311c(qj, taskCompletionSource, context)).addOnFailureListener(new C2318z(qj, taskCompletionSource, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            QJ qj2 = this.f71511O;
            TaskCompletionSource taskCompletionSource2 = this.rl;
            this.nr.Qu(QJ.n(intent)).addOnSuccessListener(new Q(qj2, taskCompletionSource2, context)).addOnFailureListener(new l3D(qj2, taskCompletionSource2, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            QJ qj3 = this.f71511O;
            TaskCompletionSource taskCompletionSource3 = this.rl;
            this.nr.UF(QJ.n(intent)).addOnSuccessListener(new SPz(qj3, taskCompletionSource3, context)).addOnFailureListener(new UGc(qj3, taskCompletionSource3, context));
        } else {
            this.rl.setException(zzaei.zza(aC.n("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
