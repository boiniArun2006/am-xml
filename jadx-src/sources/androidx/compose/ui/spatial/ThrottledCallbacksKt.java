package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "node", "", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", c.f62177j, "(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,494:1\n83#2:495\n159#3:496\n32#3:505\n30#4:497\n53#5,3:498\n85#5:502\n90#5:504\n80#5:506\n54#6:501\n59#6:503\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n*L\n460#1:495\n470#1:496\n478#1:505\n470#1:497\n470#1:498,3\n478#1:502\n478#1:504\n478#1:506\n478#1:501\n478#1:503\n*E\n"})
public final class ThrottledCallbacksKt {
    public static final RelativeLayoutBounds n(DelegatableNode delegatableNode, long j2, long j3, long j4, long j5, float[] fArr) {
        NodeCoordinator nodeCoordinatorMUb = DelegatableNodeKt.mUb(delegatableNode, NodeKind.n(2));
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(delegatableNode);
        if (!layoutNodeHI.HI()) {
            return null;
        }
        if (layoutNodeHI.n1() == nodeCoordinatorMUb) {
            return new RelativeLayoutBounds(j2, j3, j4, j5, fArr, delegatableNode, null);
        }
        long jJ2 = IntOffset.J2(j2);
        long jO = Offset.O((((long) Float.floatToRawIntBits(IntOffset.gh(jJ2))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.qie(jJ2))) & 4294967295L));
        long jN = nodeCoordinatorMUb.Zmq().n();
        long jNr = IntOffsetKt.nr(layoutNodeHI.n1().Zmq().nHg(nodeCoordinatorMUb, jO));
        return new RelativeLayoutBounds(jNr, IntOffset.J2((((long) (IntOffset.gh(jNr) + ((int) (jN >> 32)))) << 32) | (((long) (IntOffset.qie(jNr) + ((int) (jN & 4294967295L)))) & 4294967295L)), j4, j5, fArr, delegatableNode, null);
    }
}
