package androidx.room;

import androidx.sqlite.SQLiteStatement;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\"\u0010\u0017\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\f¨\u0006 "}, d2 = {"Landroidx/room/BindOnlySQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "", "index", "", "getLong", "(I)J", "", "HV", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "RQ", "()Z", "", "reset", "()V", MRAIDPresenter.CLOSE, "value", "mUb", "(IJ)V", "iF", "(ILjava/lang/String;)V", "gh", "(I)V", "getBoolean", "t", "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BindOnlySQLiteStatement implements SQLiteStatement {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ SQLiteStatement f41260n;

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(int index) {
        return this.f41260n.getBoolean(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void gh(int index) {
        this.f41260n.gh(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void iF(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f41260n.iF(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void mUb(int index, long value) {
        this.f41260n.mUb(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String HV(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean RQ() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }
}
