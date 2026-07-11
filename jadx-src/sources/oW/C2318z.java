package oW;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: oW.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class C2318z implements OnFailureListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f71525n;
    private final /* synthetic */ Context rl;

    C2318z(QJ qj, TaskCompletionSource taskCompletionSource, Context context) {
        this.f71525n = taskCompletionSource;
        this.rl = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f71525n.setException(exc);
        QJ.nr(this.rl);
    }
}
