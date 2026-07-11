package oW;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class UGc implements OnFailureListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f71488n;
    private final /* synthetic */ Context rl;

    UGc(QJ qj, TaskCompletionSource taskCompletionSource, Context context) {
        this.f71488n = taskCompletionSource;
        this.rl = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f71488n.setException(exc);
        QJ.nr(this.rl);
    }
}
