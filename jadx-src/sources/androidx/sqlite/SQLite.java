package androidx.sqlite;

import android.database.SQLException;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/sqlite/SQLiteConnection;", "", "sql", "", c.f62177j, "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "", "rl", "(ILjava/lang/String;)Ljava/lang/Void;", "sqlite_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "SQLite")
@SourceDebugExtension({"SMAP\nSQLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLite.kt\nandroidx/sqlite/SQLite\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class SQLite {
    public static final void n(SQLiteConnection sQLiteConnection, String sql) {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "<this>");
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementMI = sQLiteConnection.mI(sql);
        try {
            sQLiteStatementMI.RQ();
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
        } finally {
        }
    }

    public static final Void rl(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i2);
        if (str != null) {
            sb.append(", message: " + str);
        }
        throw new SQLException(sb.toString());
    }
}
