package androidx.room.coroutines;

import androidx.room.coroutines.PooledConnectionImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl$TransactionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0}, l = {573}, m = "rollback", n = {"result", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2"})
final class PooledConnectionImpl$TransactionImpl$rollback$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f41601O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f41603o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ PooledConnectionImpl.TransactionImpl f41604r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41605t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$TransactionImpl$rollback$1(PooledConnectionImpl.TransactionImpl transactionImpl, Continuation continuation) {
        super(continuation);
        this.f41604r = transactionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f41603o |= Integer.MIN_VALUE;
        return this.f41604r.O(null, this);
    }
}
