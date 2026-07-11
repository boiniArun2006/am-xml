package teV;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class r implements Continuation, CoroutineStackFrame {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Continuation f73656n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CoroutineContext f73657t;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f73656n;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f73657t;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f73656n.resumeWith(obj);
    }

    public r(Continuation continuation, CoroutineContext coroutineContext) {
        this.f73656n = continuation;
        this.f73657t = coroutineContext;
    }
}
