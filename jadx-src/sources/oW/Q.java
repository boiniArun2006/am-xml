package oW;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Q implements OnSuccessListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f71483n;
    private final /* synthetic */ Context rl;

    Q(QJ qj, TaskCompletionSource taskCompletionSource, Context context) {
        this.f71483n = taskCompletionSource;
        this.rl = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f71483n.setResult((AuthResult) obj);
        QJ.nr(this.rl);
    }
}
