package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/LabelStateImpl;", "Landroidx/compose/material3/TooltipState;", "", "isVisible", "isPersistent", "<init>", "(ZZ)V", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "", "t", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", c.f62177j, "Z", "()Z", "rl", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/animation/core/MutableTransitionState;", "()Landroidx/compose/animation/core/MutableTransitionState;", "transition", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LabelStateImpl implements TooltipState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean isPersistent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableTransitionState transition;

    public LabelStateImpl(boolean z2, boolean z3) {
        this.isVisible = z2;
        this.isPersistent = z3;
        this.transition = new MutableTransitionState(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
    }

    @Override // androidx.compose.material3.TooltipState
    public void n() {
    }

    @Override // androidx.compose.material3.TooltipState
    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    @Override // androidx.compose.material3.TooltipState
    /* JADX INFO: renamed from: rl, reason: from getter */
    public MutableTransitionState getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public Object t(MutatePriority mutatePriority, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public /* synthetic */ LabelStateImpl(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? true : z3);
    }
}
