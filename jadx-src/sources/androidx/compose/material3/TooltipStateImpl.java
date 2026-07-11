package androidx.compose.material3;

import GJW.Pl;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/TooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "", "t", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", c.f62177j, "", "Z", "J2", "()Z", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "rl", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/animation/core/MutableTransitionState;", "()Landroidx/compose/animation/core/MutableTransitionState;", "transition", "LGJW/Pl;", "nr", "LGJW/Pl;", "job", "isVisible", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TooltipStateImpl implements TooltipState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Pl job;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableTransitionState transition;

    /* JADX INFO: renamed from: J2, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
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
        Object objNr = this.mutatorMutex.nr(mutatePriority, new TooltipStateImpl$show$2(this, new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null), continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        getTransition().KN(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.TooltipState
    /* JADX INFO: renamed from: isVisible */
    public boolean getIsVisible() {
        if (!((Boolean) getTransition().n()).booleanValue() && !((Boolean) getTransition().rl()).booleanValue()) {
            return false;
        }
        return true;
    }
}
