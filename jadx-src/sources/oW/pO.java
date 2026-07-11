package oW;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class pO implements OnSuccessListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f71508n;

    pO(s4 s4Var, TaskCompletionSource taskCompletionSource) {
        this.f71508n = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f71508n.setResult(new O().nr((String) obj).rl());
    }
}
