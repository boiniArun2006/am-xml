package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0}, l = {50}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv"}, s = {"L$0", "Z$0"})
final class SingleProcessCoordinator$tryLock$1<T> extends ContinuationImpl {
    final /* synthetic */ SingleProcessCoordinator J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37600O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37601n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37602r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f37603t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessCoordinator$tryLock$1(SingleProcessCoordinator singleProcessCoordinator, Continuation continuation) {
        super(continuation);
        this.J2 = singleProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37600O = obj;
        this.f37602r |= Integer.MIN_VALUE;
        return this.J2.nr(null, this);
    }
}
