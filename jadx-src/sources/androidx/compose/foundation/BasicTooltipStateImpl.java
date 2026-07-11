package androidx.compose.foundation;

import GJW.Pl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Stable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/BasicTooltipStateImpl;", "Landroidx/compose/foundation/BasicTooltipState;", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "", "t", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", c.f62177j, "", "Z", "O", "()Z", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "rl", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "<set-?>", "Landroidx/compose/runtime/MutableState;", "isVisible", "J2", "(Z)V", "LGJW/Pl;", "nr", "LGJW/Pl;", "job", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,390:1\n85#2:391\n113#2,2:392\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl\n*L\n286#1:391\n286#1:392,2\n*E\n"})
final class BasicTooltipStateImpl implements BasicTooltipState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Pl job;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState isVisible;

    @Override // androidx.compose.foundation.BasicTooltipState
    public void dismiss() {
        J2(false);
    }

    public void J2(boolean z2) {
        this.isVisible.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public void n() {
        Pl pl = this.job;
        if (pl != null) {
            Pl.j.n(pl, null, 1, null);
        }
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public Object t(MutatePriority mutatePriority, Continuation continuation) {
        Object objNr = this.mutatorMutex.nr(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }
}
