package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\r\u001a\u00020\f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ&\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "offset", "", "rtlAware", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "", "NC9", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "v", "Lkotlin/jvm/functions/Function1;", "UR", "()Lkotlin/jvm/functions/Function1;", "setOffset", "(Lkotlin/jvm/functions/Function1;)V", "Xw", "Z", "W5k", "()Z", "setRtlAware", "(Z)V", "jB", "lRt", "shouldAutoInvalidate", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function1 offset;

    public final void NC9(Function1 offset, boolean rtlAware) {
        if (this.offset != offset || this.rtlAware != rtlAware) {
            LayoutModifierNodeKt.t(this);
        }
        this.offset = offset;
        this.rtlAware = rtlAware;
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final Function1 getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public OffsetPxNode(Function1 function1, boolean z2) {
        this.offset = function1;
        this.rtlAware = z2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(j2);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.OffsetPxNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                long packedValue = ((IntOffset) this.f17732n.getOffset().invoke(measureScope)).getPackedValue();
                if (this.f17732n.getRtlAware()) {
                    Placeable.PlacementScope.Ik(placementScope, placeableDR0, IntOffset.gh(packedValue), IntOffset.qie(packedValue), 0.0f, null, 12, null);
                } else {
                    Placeable.PlacementScope.WPU(placementScope, placeableDR0, IntOffset.gh(packedValue), IntOffset.qie(packedValue), 0.0f, null, 12, null);
                }
            }
        }, 4, null);
    }
}
