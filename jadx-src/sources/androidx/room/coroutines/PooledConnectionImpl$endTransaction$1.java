package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {562}, m = "endTransaction", n = {"this", "$this$withLock_u24default$iv", "success"}, s = {"L$0", "L$1", "Z$0"})
final class PooledConnectionImpl$endTransaction$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f41612O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f41614o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ PooledConnectionImpl f41615r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41616t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$endTransaction$1(PooledConnectionImpl pooledConnectionImpl, Continuation continuation) {
        super(continuation);
        this.f41615r = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f41614o |= Integer.MIN_VALUE;
        return this.f41615r.gh(false, this);
    }
}
