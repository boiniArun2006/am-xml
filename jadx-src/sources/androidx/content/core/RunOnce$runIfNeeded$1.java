package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", i = {0, 0, 1, 1}, l = {544, 497}, m = "runIfNeeded", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
final class RunOnce$runIfNeeded$1 extends ContinuationImpl {
    final /* synthetic */ RunOnce J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37580O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37581n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37582r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37583t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunOnce$runIfNeeded$1(RunOnce runOnce, Continuation continuation) {
        super(continuation);
        this.J2 = runOnce;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37580O = obj;
        this.f37582r |= Integer.MIN_VALUE;
        return this.J2.t(this);
    }
}
