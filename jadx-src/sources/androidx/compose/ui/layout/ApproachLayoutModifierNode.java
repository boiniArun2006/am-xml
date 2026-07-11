package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ#\u0010\u001f\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ#\u0010 \u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001cø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "", "Qu", "(J)Z", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoordinates", "t1J", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/LayoutCoordinates;)Z", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Bu", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "QZ6", "(Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "waP", "Aum", "Mh", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApproachLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachLayoutModifierNode.kt\nandroidx/compose/ui/layout/ApproachLayoutModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    MeasureResult Bu(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2);

    boolean Qu(long lookaheadSize);

    default boolean t1J(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    default int Aum(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegateRR = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        if (lookaheadDelegateRR.xVH()) {
            return NodeMeasuringIntrinsics.f32613n.t(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                public final MeasureResult n(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
                    return this.f32200n.Bu(approachMeasureScope, measurable, j2);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i2);
        }
        return intrinsicMeasurable.Nxk(i2);
    }

    default int Mh(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegateRR = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        if (lookaheadDelegateRR.xVH()) {
            return NodeMeasuringIntrinsics.f32613n.n(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                public final MeasureResult n(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
                    return this.f32199n.Bu(approachMeasureScope, measurable, j2);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i2);
        }
        return intrinsicMeasurable.g(i2);
    }

    default int QZ6(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegateRR = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        if (lookaheadDelegateRR.xVH()) {
            return NodeMeasuringIntrinsics.f32613n.Uo(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicWidth$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                public final MeasureResult n(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
                    return this.f32203n.Bu(approachMeasureScope, measurable, j2);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i2);
        }
        return intrinsicMeasurable.GR(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    default MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(j2);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    default int waP(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegateRR = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        if (lookaheadDelegateRR.xVH()) {
            return NodeMeasuringIntrinsics.f32613n.O(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicHeight$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                public final MeasureResult n(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
                    return this.f32202n.Bu(approachMeasureScope, measurable, j2);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i2);
        }
        return intrinsicMeasurable.FX(i2);
    }
}
