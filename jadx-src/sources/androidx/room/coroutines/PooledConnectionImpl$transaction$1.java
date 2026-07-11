package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 1, 1, 4}, l = {395, 399, 412, 412, 412}, m = "transaction", n = {"this", "block", "this", "success", "exception"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0"})
final class PooledConnectionImpl$transaction$1<R> extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f41617O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f41619o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ PooledConnectionImpl f41620r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41621t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$transaction$1(PooledConnectionImpl pooledConnectionImpl, Continuation continuation) {
        super(continuation);
        this.f41620r = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f41619o |= Integer.MIN_VALUE;
        return this.f41620r.ck(null, null, this);
    }
}
