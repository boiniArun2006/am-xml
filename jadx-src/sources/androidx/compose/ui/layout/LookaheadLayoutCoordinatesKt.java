package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", c.f62177j, "(Landroidx/compose/ui/node/LookaheadDelegate;)Landroidx/compose/ui/node/LookaheadDelegate;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate n(LookaheadDelegate lookaheadDelegate) {
        LayoutNode lookaheadRoot;
        LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode layoutNodeMYa = layoutNode.mYa();
            LayoutNode lookaheadRoot2 = null;
            if (layoutNodeMYa != null) {
                lookaheadRoot = layoutNodeMYa.getLookaheadRoot();
            } else {
                lookaheadRoot = null;
            }
            if (lookaheadRoot != null) {
                LayoutNode layoutNodeMYa2 = layoutNode.mYa();
                if (layoutNodeMYa2 != null) {
                    lookaheadRoot2 = layoutNodeMYa2.getLookaheadRoot();
                }
                Intrinsics.checkNotNull(lookaheadRoot2);
                if (lookaheadRoot2.getIsVirtualLookaheadRoot()) {
                    layoutNode = layoutNode.mYa();
                    Intrinsics.checkNotNull(layoutNode);
                } else {
                    LayoutNode layoutNodeMYa3 = layoutNode.mYa();
                    Intrinsics.checkNotNull(layoutNodeMYa3);
                    layoutNode = layoutNodeMYa3.getLookaheadRoot();
                    Intrinsics.checkNotNull(layoutNode);
                }
            } else {
                LookaheadDelegate lookaheadDelegate2 = layoutNode.n1().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
        }
    }
}
