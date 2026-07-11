package androidx.room.driver;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/driver/SupportSQLiteDriver;", "Landroidx/sqlite/SQLiteDriver;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "", "fileName", "Landroidx/room/driver/SupportSQLiteConnection;", "t", "(Ljava/lang/String;)Landroidx/room/driver/SupportSQLiteConnection;", c.f62177j, "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "rl", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public final class SupportSQLiteDriver implements SQLiteDriver {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SupportSQLiteOpenHelper openHelper;

    public SupportSQLiteDriver(SupportSQLiteOpenHelper openHelper) {
        Intrinsics.checkNotNullParameter(openHelper, "openHelper");
        this.openHelper = openHelper;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final SupportSQLiteOpenHelper getOpenHelper() {
        return this.openHelper;
    }

    @Override // androidx.sqlite.SQLiteDriver
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public SupportSQLiteConnection n(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new SupportSQLiteConnection(this.openHelper.getWritableDatabase());
    }
}
