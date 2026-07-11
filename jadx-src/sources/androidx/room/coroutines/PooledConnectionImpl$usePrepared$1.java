package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0, 0}, l = {573}, m = "usePrepared", n = {"this", "sql", "block", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
final class PooledConnectionImpl$usePrepared$1<R> extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f41622O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f41623Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ PooledConnectionImpl f41625o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f41626r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41627t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$usePrepared$1(PooledConnectionImpl pooledConnectionImpl, Continuation continuation) {
        super(continuation);
        this.f41625o = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41626r = obj;
        this.f41623Z |= Integer.MIN_VALUE;
        return this.f41625o.nr(null, null, this);
    }
}
