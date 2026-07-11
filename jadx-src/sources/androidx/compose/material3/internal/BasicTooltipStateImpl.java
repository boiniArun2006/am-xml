package androidx.compose.material3.internal;

import GJW.Pl;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/material3/internal/BasicTooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "<init>", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "", "t", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", c.f62177j, "Z", "J2", "()Z", "rl", "Landroidx/compose/foundation/MutatorMutex;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "isVisible", "Uo", "(Z)V", "Landroidx/compose/animation/core/MutableTransitionState;", "nr", "Landroidx/compose/animation/core/MutableTransitionState;", "()Landroidx/compose/animation/core/MutableTransitionState;", "transition", "LGJW/Pl;", "O", "LGJW/Pl;", "job", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,188:1\n81#2:189\n107#2,2:190\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl\n*L\n127#1:189\n127#1:190,2\n*E\n"})
final class BasicTooltipStateImpl implements TooltipState {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Pl job;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableTransitionState transition = new MutableTransitionState(Boolean.FALSE);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState isVisible;

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        Uo(false);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    public void Uo(boolean z2) {
        this.isVisible.setValue(Boolean.valueOf(z2));
    }

    @Override // androidx.compose.material3.TooltipState
    /* JADX INFO: renamed from: isVisible */
    public boolean getIsVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public void n() {
        Pl pl = this.job;
        if (pl != null) {
            Pl.j.n(pl, null, 1, null);
        }
    }

    @Override // androidx.compose.material3.TooltipState
    /* JADX INFO: renamed from: rl, reason: from getter */
    public MutableTransitionState getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public Object t(MutatePriority mutatePriority, Continuation continuation) {
        Object objNr = this.mutatorMutex.nr(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    public BasicTooltipStateImpl(boolean z2, boolean z3, MutatorMutex mutatorMutex) {
        this.isPersistent = z3;
        this.mutatorMutex = mutatorMutex;
        this.isVisible = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z2), null, 2, null);
    }
}
