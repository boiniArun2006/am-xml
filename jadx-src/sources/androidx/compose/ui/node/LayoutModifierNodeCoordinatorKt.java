package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "rl", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;Landroidx/compose/ui/layout/AlignmentLine;)I", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,313:1\n56#2,5:314\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n*L\n291#1:314,5\n*E\n"})
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int rl(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        boolean z2;
        int iGh;
        LookaheadCapablePlaceable lookaheadCapablePlaceableX4T = lookaheadCapablePlaceable.X4T();
        if (lookaheadCapablePlaceableX4T != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.t("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.uG().getF32235t().containsKey(alignmentLine)) {
            Integer num = (Integer) lookaheadCapablePlaceable.uG().getF32235t().get(alignmentLine);
            if (num == null) {
                return Integer.MIN_VALUE;
            }
            return num.intValue();
        }
        int iZ = lookaheadCapablePlaceableX4T.z(alignmentLine);
        if (iZ == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        lookaheadCapablePlaceableX4T.j(true);
        lookaheadCapablePlaceable.NP(true);
        lookaheadCapablePlaceable.lNy();
        lookaheadCapablePlaceableX4T.j(false);
        lookaheadCapablePlaceable.NP(false);
        if (alignmentLine instanceof HorizontalAlignmentLine) {
            iGh = IntOffset.qie(lookaheadCapablePlaceableX4T.getPosition());
        } else {
            iGh = IntOffset.gh(lookaheadCapablePlaceableX4T.getPosition());
        }
        return iZ + iGh;
    }
}
