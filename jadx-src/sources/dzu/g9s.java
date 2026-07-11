package dzu;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class g9s extends GJW.j implements CoroutineStackFrame {
    public final Continuation J2;

    public g9s(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, true, true);
        this.J2 = continuation;
    }

    public void a63() {
    }

    @Override // GJW.L0y
    protected final boolean dR0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // GJW.L0y
    protected void S(Object obj) {
        Dsr.rl(IntrinsicsKt.intercepted(this.J2), GJW.Ew.n(obj, this.J2));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.J2;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // GJW.j
    protected void lLA(Object obj) {
        Continuation continuation = this.J2;
        continuation.resumeWith(GJW.Ew.n(obj, continuation));
    }
}
