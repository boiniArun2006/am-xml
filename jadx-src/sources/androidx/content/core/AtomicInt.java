package androidx.content.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/AtomicInt;", "", "", "initialValue", "<init>", "(I)V", "t", "()I", c.f62177j, "rl", "nr", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AtomicInt {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger delegate;

    public final int n() {
        return this.delegate.decrementAndGet();
    }

    public final int nr() {
        return this.delegate.incrementAndGet();
    }

    public final int rl() {
        return this.delegate.get();
    }

    public final int t() {
        return this.delegate.getAndIncrement();
    }

    public AtomicInt(int i2) {
        this.delegate = new AtomicInteger(i2);
    }
}
