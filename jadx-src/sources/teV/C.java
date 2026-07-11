package teV;

import dzu.g9s;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class C extends g9s {
    @Override // GJW.L0y
    public boolean N(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return iF(th);
    }

    public C(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, continuation);
    }
}
