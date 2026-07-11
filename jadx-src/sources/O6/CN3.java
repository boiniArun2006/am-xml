package O6;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.Z;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class CN3 {
    static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f7273n;

    public CN3(Executor executor) {
        if (executor == null) {
            if (!rl) {
                this.f7273n = Z.rl().t();
                return;
            } else {
                this.f7273n = null;
                return;
            }
        }
        this.f7273n = executor;
    }

    public void n(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        Executor executor = this.f7273n;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            Z.rl().O(runnable);
        }
    }
}
