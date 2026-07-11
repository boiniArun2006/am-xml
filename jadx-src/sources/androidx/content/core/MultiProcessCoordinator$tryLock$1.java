package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 1, 1, 1}, l = {62, 87}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
final class MultiProcessCoordinator$tryLock$1<T> extends ContinuationImpl {
    boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37559O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f37560Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MultiProcessCoordinator f37562o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f37563r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37564t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiProcessCoordinator$tryLock$1(MultiProcessCoordinator multiProcessCoordinator, Continuation continuation) {
        super(continuation);
        this.f37562o = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37563r = obj;
        this.f37560Z |= Integer.MIN_VALUE;
        return this.f37562o.nr(null, this);
    }
}
