package androidx.room.driver;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/driver/SupportSQLiteConnection;", "Landroidx/sqlite/SQLiteConnection;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "sql", "Landroidx/room/driver/SupportSQLiteStatement;", "rl", "(Ljava/lang/String;)Landroidx/room/driver/SupportSQLiteStatement;", "", MRAIDPresenter.CLOSE, "()V", c.f62177j, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public final class SupportSQLiteConnection implements SQLiteConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SupportSQLiteDatabase db;

    public SupportSQLiteConnection(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() throws IOException {
        this.db.close();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final SupportSQLiteDatabase getDb() {
        return this.db;
    }

    @Override // androidx.sqlite.SQLiteConnection
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public SupportSQLiteStatement mI(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return SupportSQLiteStatement.INSTANCE.n(this.db, sql);
    }
}
