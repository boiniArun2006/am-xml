package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"androidx/room/RoomSQLiteQuery$Companion$copyFrom$1", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", "index", "", "gh", "(I)V", "", "value", "mUb", "(IJ)V", "", "WPU", "(ID)V", "", "k", "(ILjava/lang/String;)V", "", "C", "(I[B)V", MRAIDPresenter.CLOSE, "()V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomSQLiteQuery$Companion$copyFrom$1 implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ RoomSQLiteQuery f41433n;

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void C(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f41433n.C(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void WPU(int index, double value) {
        this.f41433n.WPU(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f41433n.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void gh(int index) {
        this.f41433n.gh(index);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void k(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f41433n.k(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void mUb(int index, long value) {
        this.f41433n.mUb(index, value);
    }
}
