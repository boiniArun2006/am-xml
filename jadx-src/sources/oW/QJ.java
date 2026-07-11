package oW;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class QJ {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static QJ f71484t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f71485n = false;
    private BroadcastReceiver rl;

    public final boolean xMQ(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return mUb(activity, taskCompletionSource, firebaseAuth, null);
    }

    static /* synthetic */ void O(QJ qj, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        nr(context);
    }

    static void nr(Context context) {
        QJ qj = f71484t;
        qj.f71485n = false;
        if (qj.rl != null) {
            LocalBroadcastManager.rl(context).O(f71484t.rl);
        }
        f71484t.rl = null;
    }

    public static QJ rl() {
        if (f71484t == null) {
            f71484t = new QJ();
        }
        return f71484t;
    }

    private final void t(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.rl = broadcastReceiver;
        LocalBroadcastManager.rl(activity).t(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    public final boolean KN(Activity activity, TaskCompletionSource taskCompletionSource) {
        if (this.f71485n) {
            return false;
        }
        t(activity, new ci(this, activity, taskCompletionSource));
        this.f71485n = true;
        return true;
    }

    public final boolean mUb(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (this.f71485n) {
            return false;
        }
        t(activity, new r(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
        this.f71485n = true;
        return true;
    }

    private QJ() {
    }

    private static AuthCredential n(Intent intent) {
        Preconditions.checkNotNull(intent);
        return zzc.ub(((zzait) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzait.CREATOR)).zzc(true));
    }
}
