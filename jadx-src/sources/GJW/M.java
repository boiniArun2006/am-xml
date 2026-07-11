package GJW;

import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class M {
    public static final void n(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            iwV iwv = (iwV) coroutineContext.get(iwV.rl);
            if (iwv != null) {
                iwv.a(coroutineContext, th);
            } else {
                dzu.CN3.n(coroutineContext, th);
            }
        } catch (Throwable th2) {
            dzu.CN3.n(coroutineContext, rl(th, th2));
        }
    }

    public static final Throwable rl(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ExceptionsKt.addSuppressed(runtimeException, th);
        return runtimeException;
    }
}
