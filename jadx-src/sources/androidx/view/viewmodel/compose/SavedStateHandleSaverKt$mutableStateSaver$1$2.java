package androidx.view.viewmodel.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SavedStateHandleSaverKt$mutableStateSaver$1$2 implements Function1<MutableState<Object>, MutableState<Object>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Saver f39078n;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final MutableState invoke(MutableState mutableState) {
        Object objRl;
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        if (snapshotMutableState.getValue() != null) {
            Saver saver = this.f39078n;
            Object value = snapshotMutableState.getValue();
            Intrinsics.checkNotNull(value);
            objRl = saver.rl(value);
        } else {
            objRl = null;
        }
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver?>");
        MutableState mutableStateXMQ = SnapshotStateKt.xMQ(objRl, policy);
        Intrinsics.checkNotNull(mutableStateXMQ, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver>");
        return mutableStateXMQ;
    }
}
