package androidx.room.coroutines;

import com.safedk.android.analytics.brandsafety.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", i = {2, 2, 2, 2, 2, 2, 3, 3}, l = {116, b.f61769v, 138, 143}, m = "useConnection", n = {"this", "block", "pool", "connection", "currentContext", "isReadOnly", "pool", "connection"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1"})
final class ConnectionPoolImpl$useConnection$1<R> extends ContinuationImpl {
    int E2;
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f41550O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    /* synthetic */ Object f41551S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    boolean f41552Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ConnectionPoolImpl f41553g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f41555o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f41556r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41557t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectionPoolImpl$useConnection$1(ConnectionPoolImpl connectionPoolImpl, Continuation continuation) {
        super(continuation);
        this.f41553g = connectionPoolImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41551S = obj;
        this.E2 |= Integer.MIN_VALUE;
        return this.f41553g.ViF(false, null, this);
    }
}
