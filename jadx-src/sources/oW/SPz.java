package oW;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class SPz implements OnSuccessListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f71486n;
    private final /* synthetic */ Context rl;

    SPz(QJ qj, TaskCompletionSource taskCompletionSource, Context context) {
        this.f71486n = taskCompletionSource;
        this.rl = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f71486n.setResult((AuthResult) obj);
        QJ.nr(this.rl);
    }
}
