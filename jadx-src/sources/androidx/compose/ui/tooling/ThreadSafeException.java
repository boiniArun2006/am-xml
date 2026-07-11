package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/tooling/ThreadSafeException;", "", "", "throwable", "", c.f62177j, "(Ljava/lang/Throwable;)V", "rl", "()V", "Ljava/lang/Throwable;", "exception", "Ljava/lang/Object;", "lock", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreviewUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/ThreadSafeException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
public final class ThreadSafeException {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Throwable exception;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public final Object lock;

    public final void n(Throwable throwable) {
        synchronized (this.lock) {
            this.exception = throwable;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void rl() {
        synchronized (this.lock) {
            Throwable th = this.exception;
            if (th != null) {
                this.exception = null;
                throw th;
            }
        }
    }
}
