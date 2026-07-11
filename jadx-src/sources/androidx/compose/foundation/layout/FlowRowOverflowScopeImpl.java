package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "state", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", c.f62177j, "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "Lkotlin/Lazy;", "getTotalItemCount", "()I", "totalItemCount", "nr", "getShownItemCount", "shownItemCount", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowRowOverflowScopeImpl implements FlowRowScope, FlowRowOverflowScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FlowLayoutOverflowState state;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Lazy shownItemCount;
    private final /* synthetic */ FlowRowScopeInstance rl = FlowRowScopeInstance.rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy totalItemCount = FlowLayoutOverflowKt.rl(null, new Function0<Integer>() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$totalItemCount$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f17669n.state.getItemCount());
        }
    }, 1, null);

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier n(Modifier modifier, float f3, boolean z2) {
        return this.rl.n(modifier, f3, z2);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier t(Modifier modifier, Alignment.Vertical vertical) {
        return this.rl.t(modifier, vertical);
    }

    public FlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        this.shownItemCount = FlowLayoutOverflowKt.n(flowLayoutOverflowState.getShownItemLazyErrorMessage(), new Function0<Integer>() { // from class: androidx.compose.foundation.layout.FlowRowOverflowScopeImpl$shownItemCount$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return Integer.valueOf(this.f17668n.state.getItemShown());
            }
        });
    }
}
