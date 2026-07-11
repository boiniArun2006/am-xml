package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {211, 47, 48}, m = "lock", n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
final class MultiProcessCoordinator$lock$1<T> extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37553O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f37555o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MultiProcessCoordinator f37556r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37557t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiProcessCoordinator$lock$1(MultiProcessCoordinator multiProcessCoordinator, Continuation continuation) {
        super(continuation);
        this.f37556r = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f37555o |= Integer.MIN_VALUE;
        return this.f37556r.rl(null, this);
    }
}
