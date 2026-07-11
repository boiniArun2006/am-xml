package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "<init>", "()V", "", "rl", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "t", "sent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GlobalSnapshotManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GlobalSnapshotManager f32959n = new GlobalSnapshotManager();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int nr = 8;

    public final void rl() {
        if (started.compareAndSet(false, true)) {
            final ILs.CN3 cn3Rl = ILs.aC.rl(1, null, null, 6, null);
            GJW.C.nr(GJW.Lu.n(AndroidUiDispatcher.INSTANCE.rl()), null, null, new GlobalSnapshotManager$ensureStarted$1(cn3Rl, null), 3, null);
            Snapshot.INSTANCE.gh(new Function1<Object, Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    n(obj);
                    return Unit.INSTANCE;
                }

                public final void n(Object obj) {
                    if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                        cn3Rl.nr(Unit.INSTANCE);
                    }
                }
            });
        }
    }

    private GlobalSnapshotManager() {
    }
}
