package GJW;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface xuv extends CoroutineContext.Element {
    public static final n nr = n.f3509n;

    public static final class j {
        public static xuv J2(xuv xuvVar, xuv xuvVar2) {
            return xuvVar2;
        }

        public static /* synthetic */ void rl(xuv xuvVar, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            xuvVar.cancel(cancellationException);
        }

        public static CoroutineContext O(xuv xuvVar, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(xuvVar, key);
        }

        public static CoroutineContext Uo(xuv xuvVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(xuvVar, coroutineContext);
        }

        public static CoroutineContext.Element nr(xuv xuvVar, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.get(xuvVar, key);
        }

        public static Object t(xuv xuvVar, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(xuvVar, obj, function2);
        }
    }

    s4 attachChild(Q q2);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    Sequence getChildren();

    tj.j getOnJoin();

    xuv getParent();

    O invokeOnCompletion(Function1 function1);

    O invokeOnCompletion(boolean z2, boolean z3, Function1 function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation continuation);

    xuv plus(xuv xuvVar);

    boolean start();

    public static final class n implements CoroutineContext.Key {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ n f3509n = new n();

        private n() {
        }
    }
}
