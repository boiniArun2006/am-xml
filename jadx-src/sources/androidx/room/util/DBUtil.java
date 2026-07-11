package androidx.room.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"androidx/room/util/DBUtil__DBUtilKt", "androidx/room/util/DBUtil__DBUtil_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class DBUtil {
    public static final Cursor J2(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z2, CancellationSignal cancellationSignal) {
        return DBUtil__DBUtil_androidKt.O(roomDatabase, supportSQLiteQuery, z2, cancellationSignal);
    }

    public static final Object O(RoomDatabase roomDatabase, boolean z2, boolean z3, Function1 function1, Continuation continuation) {
        return DBUtil__DBUtil_androidKt.nr(roomDatabase, z2, z3, function1, continuation);
    }

    public static final int Uo(File file) {
        return DBUtil__DBUtil_androidKt.J2(file);
    }

    public static final CancellationSignal n() {
        return DBUtil__DBUtil_androidKt.n();
    }

    public static final Object nr(RoomDatabase roomDatabase, boolean z2, Continuation continuation) {
        return DBUtil__DBUtil_androidKt.t(roomDatabase, z2, continuation);
    }

    public static final void rl(SQLiteConnection sQLiteConnection) {
        DBUtil__DBUtilKt.n(sQLiteConnection);
    }

    public static final void t(SupportSQLiteDatabase supportSQLiteDatabase) {
        DBUtil__DBUtil_androidKt.rl(supportSQLiteDatabase);
    }
}
