package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/OffsetNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Dp;", "x", "y", "", "rtlAware", "<init>", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "ex", "(FFZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "v", "F", "W5k", "()F", "setX-0680j_4", "(F)V", "Xw", "NC9", "setY-0680j_4", "jB", "Z", "UR", "()Z", "setRtlAware", "(Z)V", "U", "lRt", "shouldAutoInvalidate", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private float y;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean rtlAware;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float x;

    public /* synthetic */ OffsetNode(float f3, float f4, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, z2);
    }

    private OffsetNode(float f3, float f4, boolean z2) {
        this.x = f3;
        this.y = f4;
        this.rtlAware = z2;
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final float getX() {
        return this.x;
    }

    public final void ex(float x2, float y2, boolean rtlAware) {
        if (!Dp.mUb(this.x, x2) || !Dp.mUb(this.y, y2) || this.rtlAware != rtlAware) {
            LayoutModifierNodeKt.t(this);
        }
        this.x = x2;
        this.y = y2;
        this.rtlAware = rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(j2);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.OffsetNode$measure$1
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
                if (this.f17725n.getRtlAware()) {
                    Placeable.PlacementScope.az(placementScope, placeableDR0, measureScope.How(this.f17725n.getX()), measureScope.How(this.f17725n.getY()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.xMQ(placementScope, placeableDR0, measureScope.How(this.f17725n.getX()), measureScope.How(this.f17725n.getY()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }
}
