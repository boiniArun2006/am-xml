package GJW;

import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract /* synthetic */ class aC {
    public static /* synthetic */ Object rl(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return Dsr.O(coroutineContext, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(CoroutineContext coroutineContext, Function2 function2) {
        KH kh;
        KH khN;
        CoroutineContext coroutineContextMUb;
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor == null) {
            khN = Y5.f3467n.rl();
            coroutineContextMUb = qf.mUb(RzR.f3449n, coroutineContext.plus(khN));
        } else {
            KH kh2 = null;
            if (continuationInterceptor instanceof KH) {
                kh = (KH) continuationInterceptor;
            } else {
                kh = null;
            }
            if (kh != null) {
                if (kh.JVN()) {
                    kh2 = kh;
                }
                if (kh2 != null) {
                    khN = kh2;
                }
                coroutineContextMUb = qf.mUb(RzR.f3449n, coroutineContext);
            } else {
                khN = Y5.f3467n.n();
                coroutineContextMUb = qf.mUb(RzR.f3449n, coroutineContext);
            }
        }
        CN3 cn3 = new CN3(coroutineContextMUb, threadCurrentThread, khN);
        cn3.RQ(h.f3486n, cn3, function2);
        return cn3.a63();
    }
}
