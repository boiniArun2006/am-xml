package oW;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;

/* JADX INFO: renamed from: oW.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class C2311c implements OnSuccessListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f71492n;
    private final /* synthetic */ Context rl;

    C2311c(QJ qj, TaskCompletionSource taskCompletionSource, Context context) {
        this.f71492n = taskCompletionSource;
        this.rl = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f71492n.setResult((AuthResult) obj);
        QJ.nr(this.rl);
    }
}
