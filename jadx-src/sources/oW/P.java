package oW;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class P {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final P f71479t = new P();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z f71480n;
    private final QJ rl;

    private P() {
        this(Z.mUb(), QJ.rl());
    }

    private P(Z z2, QJ qj) {
        this.f71480n = z2;
        this.rl = qj;
    }

    public static P J2() {
        return f71479t;
    }

    public final Task O() {
        return this.f71480n.xMQ();
    }

    public final void n(Context context) {
        this.f71480n.n(context);
    }

    public final boolean nr(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        return this.rl.mUb(activity, taskCompletionSource, firebaseAuth, firebaseUser);
    }

    public final void rl(FirebaseAuth firebaseAuth) {
        this.f71480n.KN(firebaseAuth);
    }

    public final boolean t(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.rl.xMQ(activity, taskCompletionSource, firebaseAuth);
    }
}
