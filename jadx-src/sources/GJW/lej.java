package GJW;

import GJW.lej;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class lej extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f3495n = new j(null);

    public static final class j extends AbstractCoroutineContextKey {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
            super(ContinuationInterceptor.INSTANCE, new Function1() { // from class: GJW.Ln
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return lej.j.rl((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final lej rl(CoroutineContext.Element element) {
            if (element instanceof lej) {
                return (lej) element;
            }
            return null;
        }
    }

    public /* synthetic */ lej GD(int i2) {
        return K(i2, null);
    }

    public boolean Org(CoroutineContext coroutineContext) {
        return true;
    }

    public abstract void n1(CoroutineContext coroutineContext, Runnable runnable);

    public lej() {
        super(ContinuationInterceptor.INSTANCE);
    }

    public static /* synthetic */ lej How(lej lejVar, int i2, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return lejVar.K(i2, str);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final Continuation interceptContinuation(Continuation continuation) {
        return new dzu.fuX(this, continuation);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((dzu.fuX) continuation).Ik();
    }

    public String toString() {
        return psW.n(this) + '@' + psW.rl(this);
    }

    public lej K(int i2, String str) {
        dzu.o.n(i2);
        return new dzu.C(this, i2, str);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    public void qm(CoroutineContext coroutineContext, Runnable runnable) {
        dzu.Dsr.t(this, coroutineContext, runnable);
    }
}
