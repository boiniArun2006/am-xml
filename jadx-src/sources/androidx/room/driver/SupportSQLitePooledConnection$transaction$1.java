package androidx.room.driver;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.driver.SupportSQLitePooledConnection", f = "SupportSQLiteConnectionPool.android.kt", i = {0, 0}, l = {83}, m = "transaction", n = {"this", "db"}, s = {"L$0", "L$1"})
final class SupportSQLitePooledConnection$transaction$1<R> extends ContinuationImpl {
    final /* synthetic */ SupportSQLitePooledConnection J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41647O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41648n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f41649r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41650t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportSQLitePooledConnection$transaction$1(SupportSQLitePooledConnection supportSQLitePooledConnection, Continuation continuation) {
        super(continuation);
        this.J2 = supportSQLitePooledConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41647O = obj;
        this.f41649r |= Integer.MIN_VALUE;
        return this.J2.J2(null, null, this);
    }
}
