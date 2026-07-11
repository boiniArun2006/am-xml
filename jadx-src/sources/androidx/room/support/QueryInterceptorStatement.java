package androidx.room.support;

import GJW.C;
import GJW.vd;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b&\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/room/support/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "delegate", "", "sqlStatement", "LGJW/vd;", "queryCallbackScope", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/String;LGJW/vd;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "bindIndex", "", "value", "", "Uo", "(ILjava/lang/Object;)V", "execute", "()V", "XQ", "()I", "", "GR", "()J", "index", "gh", "(I)V", "mUb", "(IJ)V", "", "WPU", "(ID)V", "k", "(ILjava/lang/String;)V", "", "C", "(I[B)V", MRAIDPresenter.CLOSE, c.f62177j, "Landroidx/sqlite/db/SupportSQLiteStatement;", "t", "Ljava/lang/String;", "O", "LGJW/vd;", "J2", "Landroidx/room/RoomDatabase$QueryCallback;", "", "r", "Ljava/util/List;", "bindArgsCache", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQueryInterceptorStatement.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorStatement.android.kt\nandroidx/room/support/QueryInterceptorStatement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class QueryInterceptorStatement implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final RoomDatabase.QueryCallback queryCallback;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final vd queryCallbackScope;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SupportSQLiteStatement delegate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List bindArgsCache;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String sqlStatement;

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorStatement$execute$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorStatement$execute$1", f = "QueryInterceptorStatement.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f41757O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41758n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List list, Continuation continuation) {
            super(2, continuation);
            this.f41757O = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QueryInterceptorStatement.this.new AnonymousClass1(this.f41757O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f41758n == 0) {
                ResultKt.throwOnFailure(obj);
                QueryInterceptorStatement.this.queryCallback.n(QueryInterceptorStatement.this.sqlStatement, this.f41757O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void gh(int index) {
        Uo(index, null);
        this.delegate.gh(index);
    }

    public QueryInterceptorStatement(SupportSQLiteStatement delegate, String sqlStatement, vd queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqlStatement, "sqlStatement");
        Intrinsics.checkNotNullParameter(queryCallbackScope, "queryCallbackScope");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    private final void Uo(int bindIndex, Object value) {
        int i2 = bindIndex - 1;
        if (i2 >= this.bindArgsCache.size()) {
            int size = (i2 - this.bindArgsCache.size()) + 1;
            for (int i3 = 0; i3 < size; i3++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i2, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void C(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uo(index, value);
        this.delegate.C(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long GR() {
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorStatement$executeInsert$1(this, CollectionsKt.toList(this.bindArgsCache), null), 3, null);
        return this.delegate.GR();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int XQ() {
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorStatement$executeUpdateDelete$1(this, CollectionsKt.toList(this.bindArgsCache), null), 3, null);
        return this.delegate.XQ();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        C.nr(this.queryCallbackScope, null, null, new AnonymousClass1(CollectionsKt.toList(this.bindArgsCache), null), 3, null);
        this.delegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void k(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uo(index, value);
        this.delegate.k(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void WPU(int index, double value) {
        Uo(index, Double.valueOf(value));
        this.delegate.WPU(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void mUb(int index, long value) {
        Uo(index, Long.valueOf(value));
        this.delegate.mUb(index, value);
    }
}
