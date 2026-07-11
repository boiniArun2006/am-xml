package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.snapshots.Snapshot;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@ExperimentalComposeRuntimeApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ+\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "", "readonly", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "O", "(Landroidx/compose/runtime/snapshots/Snapshot;Z)Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", c.f62177j, "snapshot", "observers", "", "rl", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;)V", "t", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "J2", "", "changed", "nr", "(Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SnapshotObserver {
    default SnapshotInstanceObservers O(Snapshot parent, boolean readonly) {
        return null;
    }

    default void nr(Snapshot snapshot, Set changed) {
    }

    default void rl(Snapshot snapshot, Snapshot parent, SnapshotInstanceObservers observers) {
    }

    default void t(Snapshot snapshot) {
    }

    default void J2(Snapshot snapshot) {
        t(snapshot);
    }

    default SnapshotInstanceObservers n(Snapshot parent, boolean readonly) {
        return O(parent, readonly);
    }
}
