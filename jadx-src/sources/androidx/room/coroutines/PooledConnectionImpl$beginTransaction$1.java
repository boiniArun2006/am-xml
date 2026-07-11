package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {562}, m = "beginTransaction", n = {"this", "type", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
final class PooledConnectionImpl$beginTransaction$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f41607O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f41609o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ PooledConnectionImpl f41610r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41611t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$beginTransaction$1(PooledConnectionImpl pooledConnectionImpl, Continuation continuation) {
        super(continuation);
        this.f41610r = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f41609o |= Integer.MIN_VALUE;
        return this.f41610r.mUb(null, this);
    }
}
