package ILs;

import GJW.YzO;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract /* synthetic */ class eO {
    public static final void n(Q q2, Throwable th) {
        if (th != null) {
            cancellationExceptionN = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionN == null) {
                cancellationExceptionN = YzO.n("Channel was consumed, consumer had failed", th);
            }
        }
        q2.cancel(cancellationExceptionN);
    }
}
