package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteProgram;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/room/support/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "<init>", "()V", "", "bindIndex", "", "value", "", "rl", "(ILjava/lang/Object;)V", "index", "gh", "(I)V", "", "mUb", "(IJ)V", "", "WPU", "(ID)V", "", "k", "(ILjava/lang/String;)V", "", "C", "(I[B)V", MRAIDPresenter.CLOSE, "", c.f62177j, "Ljava/util/List;", "()Ljava/util/List;", "bindArgsCache", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryInterceptorProgram implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List bindArgsCache = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void gh(int index) {
        rl(index, null);
    }

    private final void rl(int bindIndex, Object value) {
        int size;
        int i2 = bindIndex - 1;
        if (i2 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i2) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i2) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i2, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void C(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        rl(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void k(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        rl(index, value);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getBindArgsCache() {
        return this.bindArgsCache;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void WPU(int index, double value) {
        rl(index, Double.valueOf(value));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void mUb(int index, long value) {
        rl(index, Long.valueOf(value));
    }
}
