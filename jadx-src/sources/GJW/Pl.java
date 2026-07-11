package GJW;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Pl extends Continuation {

    public static final class j {
        public static /* synthetic */ boolean n(Pl pl, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                th = null;
            }
            return pl.cancel(th);
        }
    }

    Object HI(Throwable th);

    void J2(Function1 function1);

    void aYN(Object obj, Function3 function3);

    boolean cancel(Throwable th);

    Object g(Object obj, Object obj2, Function3 function3);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    void o(lej lejVar, Object obj);

    void r(Object obj, Function1 function1);

    void te(Object obj);
}
