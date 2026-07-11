package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0, 1}, l = {66, 41}, m = "lock", n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
final class SingleProcessCoordinator$lock$1<T> extends ContinuationImpl {
    final /* synthetic */ SingleProcessCoordinator J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37596O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37597n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37598r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37599t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessCoordinator$lock$1(SingleProcessCoordinator singleProcessCoordinator, Continuation continuation) {
        super(continuation);
        this.J2 = singleProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37596O = obj;
        this.f37598r |= Integer.MIN_VALUE;
        return this.J2.rl(null, this);
    }
}
