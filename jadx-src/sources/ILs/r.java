package ILs;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface r {

    public static final class j {
        public static /* synthetic */ boolean n(r rVar, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i2 & 1) != 0) {
                th = null;
            }
            return rVar.xMQ(th);
        }
    }

    boolean gh();

    Object mUb(Object obj, Continuation continuation);

    Object nr(Object obj);

    void t(Function1 function1);

    boolean xMQ(Throwable th);
}
