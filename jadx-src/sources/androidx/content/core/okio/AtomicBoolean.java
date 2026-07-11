package androidx.content.core.okio;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/okio/AtomicBoolean;", "", "", "initialValue", "<init>", "(Z)V", c.f62177j, "()Z", "value", "", "rl", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "delegate", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AtomicBoolean {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean delegate;

    public final boolean n() {
        return this.delegate.get();
    }

    public final void rl(boolean value) {
        this.delegate.set(value);
    }

    public AtomicBoolean(boolean z2) {
        this.delegate = new java.util.concurrent.atomic.AtomicBoolean(z2);
    }
}
