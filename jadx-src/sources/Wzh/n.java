package Wzh;

import GJW.O;
import GJW.P;
import GJW.Q;
import GJW.s4;
import GJW.xuv;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements Ml, P {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ P f11718n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f11719t;

    @Override // GJW.xuv
    public /* synthetic */ void cancel() {
        this.f11718n.cancel();
    }

    @Override // GJW.xuv
    public O invokeOnCompletion(Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f11718n.invokeOnCompletion(handler);
    }

    @Override // GJW.xuv
    public xuv plus(xuv other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f11718n.plus(other);
    }

    public n(P p2, Ref.ObjectRef objectRef) {
        this.f11719t = objectRef;
        this.f11718n = p2;
    }

    @Override // Wzh.Ml
    public Result M() {
        Object obj = this.f11719t.element;
        if (!isCompleted()) {
            obj = null;
        }
        return (Result) obj;
    }

    @Override // GJW.xuv
    public s4 attachChild(Q child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.f11718n.attachChild(child);
    }

    @Override // GJW.P
    public Object await(Continuation continuation) {
        return this.f11718n.await(continuation);
    }

    @Override // GJW.xuv
    public void cancel(CancellationException cancellationException) {
        this.f11718n.cancel(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return this.f11718n.fold(obj, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f11718n.get(key);
    }

    @Override // GJW.xuv
    public CancellationException getCancellationException() {
        return this.f11718n.getCancellationException();
    }

    @Override // GJW.xuv
    public Sequence getChildren() {
        return this.f11718n.getChildren();
    }

    @Override // GJW.P
    public Object getCompleted() {
        return this.f11718n.getCompleted();
    }

    @Override // GJW.P
    public Throwable getCompletionExceptionOrNull() {
        return this.f11718n.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return this.f11718n.getKey();
    }

    @Override // GJW.xuv
    public tj.j getOnJoin() {
        return this.f11718n.getOnJoin();
    }

    @Override // GJW.xuv
    public O invokeOnCompletion(boolean z2, boolean z3, Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f11718n.invokeOnCompletion(z2, z3, handler);
    }

    @Override // GJW.xuv
    public boolean isActive() {
        return this.f11718n.isActive();
    }

    @Override // GJW.xuv
    public boolean isCancelled() {
        return this.f11718n.isCancelled();
    }

    @Override // GJW.xuv
    public boolean isCompleted() {
        return this.f11718n.isCompleted();
    }

    @Override // GJW.xuv
    public Object join(Continuation continuation) {
        return this.f11718n.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f11718n.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f11718n.plus(context);
    }

    @Override // GJW.xuv
    public boolean start() {
        return this.f11718n.start();
    }

    @Override // GJW.xuv
    public /* synthetic */ boolean cancel(Throwable th) {
        return this.f11718n.cancel(th);
    }
}
