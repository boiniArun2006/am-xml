package com.google.android.recaptcha.internal;

import GJW.O;
import GJW.P;
import GJW.Q;
import GJW.r;
import GJW.s4;
import GJW.xuv;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbw implements P {
    private final /* synthetic */ r zza;

    @Override // GJW.P
    public final Object await(Continuation continuation) {
        return this.zza.await(continuation);
    }

    @Override // GJW.xuv
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.zza.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.zza.get(key);
    }

    @Override // GJW.xuv
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // GJW.xuv
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // GJW.P
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // GJW.P
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return this.zza.getKey();
    }

    @Override // GJW.xuv
    public final O invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // GJW.xuv
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // GJW.xuv
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // GJW.xuv
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // GJW.xuv
    public final Object join(Continuation continuation) {
        return this.zza.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.zza.minusKey(key);
    }

    @Override // GJW.xuv
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public final xuv plus(xuv xuvVar) {
        return this.zza.plus(xuvVar);
    }

    @Override // GJW.xuv
    public final boolean start() {
        return this.zza.start();
    }

    @Override // GJW.xuv
    public final s4 attachChild(Q q2) {
        return this.zza.attachChild(q2);
    }

    @Override // GJW.xuv
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // GJW.P
    public final tj.w6 getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // GJW.xuv
    public final tj.j getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // GJW.xuv
    public final xuv getParent() {
        return this.zza.getParent();
    }

    @Override // GJW.xuv
    public final O invokeOnCompletion(boolean z2, boolean z3, Function1 function1) {
        return this.zza.invokeOnCompletion(z2, z3, function1);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }

    zzbw(r rVar) {
        this.zza = rVar;
    }

    @Override // GJW.xuv
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
