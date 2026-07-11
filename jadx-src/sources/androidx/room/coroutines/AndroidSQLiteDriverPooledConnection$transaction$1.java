package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.AndroidSQLiteDriverPooledConnection", f = "AndroidSQLiteDriverConnectionPool.android.kt", i = {0, 0}, l = {87}, m = "transaction", n = {"this", "db"}, s = {"L$0", "L$1"})
final class AndroidSQLiteDriverPooledConnection$transaction$1<R> extends ContinuationImpl {
    final /* synthetic */ AndroidSQLiteDriverPooledConnection J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41537O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41538n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f41539r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41540t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidSQLiteDriverPooledConnection$transaction$1(AndroidSQLiteDriverPooledConnection androidSQLiteDriverPooledConnection, Continuation continuation) {
        super(continuation);
        this.J2 = androidSQLiteDriverPooledConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41537O = obj;
        this.f41539r |= Integer.MIN_VALUE;
        return this.J2.Uo(null, null, this);
    }
}
