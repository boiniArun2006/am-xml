package androidx.room.support;

import GJW.C;
import GJW.vd;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b&\u0010\u0010J\u0010\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b+\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u0010)R\u001c\u00109\u001a\u0002048\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001c\u0010A\u001a\u00020:8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b>\u0010<\"\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010)R\u0014\u0010D\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010)R\u0016\u0010G\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010)R(\u0010N\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0K\u0018\u00010J8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010)¨\u0006Q"}, d2 = {"Landroidx/room/support/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "delegate", "LGJW/vd;", "queryCallbackScope", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;LGJW/vd;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "piY", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "az", "()V", "X", "v", "E2", "query", "Landroid/database/Cursor;", "Jk", "(Ljava/lang/String;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "P5", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "aYN", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "ck", "(Ljava/lang/String;)V", "", "", "bindArgs", "e", "(Ljava/lang/String;[Ljava/lang/Object;)V", "ijL", "", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "()Z", "eWT", MRAIDPresenter.CLOSE, c.f62177j, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "t", "LGJW/vd;", "O", "Landroidx/room/RoomDatabase$QueryCallback;", "wTp", "isDbLockedByCurrentThread", "", "getVersion", "()I", "Y", "(I)V", NodeModuleProcess.PROPERTY_VERSION, "", "pJg", "()J", "maximumSize", "J2", "kSg", "(J)V", "pageSize", "eTf", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", JavetError.PARAMETER_PATH, "lLA", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "HI", "()Ljava/util/List;", "attachedDbs", "r", "isDatabaseIntegrityOk", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final RoomDatabase.QueryCallback queryCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SupportSQLiteDatabase delegate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final vd queryCallbackScope;

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List HI() {
        return this.delegate.HI();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long J2() {
        return this.delegate.J2();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void Y(int i2) {
        this.delegate.Y(i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean eTf() {
        return this.delegate.eTf();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean eWT() {
        return this.delegate.eWT();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean i() {
        return this.delegate.i();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void ijL() {
        this.delegate.ijL();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void kSg(long j2) {
        this.delegate.kSg(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean lLA() {
        return this.delegate.lLA();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long pJg() {
        return this.delegate.pJg();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean r() {
        return this.delegate.r();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean wTp() {
        return this.delegate.wTp();
    }

    public QueryInterceptorDatabase(SupportSQLiteDatabase delegate, vd queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackScope, "queryCallbackScope");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void E2() {
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$setTransactionSuccessful$1(this, null), 3, null);
        this.delegate.E2();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor Jk(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$query$1(this, query, null), 3, null);
        return this.delegate.Jk(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor P5(SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.rl(queryInterceptorProgram);
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$query$3(this, query, queryInterceptorProgram, null), 3, null);
        return this.delegate.P5(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void X() {
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$beginTransactionNonExclusive$1(this, null), 3, null);
        this.delegate.X();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor aYN(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.rl(queryInterceptorProgram);
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$query$4(this, query, queryInterceptorProgram, null), 3, null);
        return this.delegate.P5(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void az() {
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$beginTransaction$1(this, null), 3, null);
        this.delegate.az();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void ck(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$execSQL$1(this, sql, null), 3, null);
        this.delegate.ck(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void e(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$execSQL$2(this, sql, ArraysKt.toList(bindArgs), null), 3, null);
        this.delegate.e(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement piY(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return new QueryInterceptorStatement(this.delegate.piY(sql), sql, this.queryCallbackScope, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void v() {
        C.nr(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$endTransaction$1(this, null), 3, null);
        this.delegate.v();
    }
}
