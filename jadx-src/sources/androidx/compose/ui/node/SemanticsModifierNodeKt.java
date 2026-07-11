package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/SemanticsModifierNode;", "", "rl", "(Landroidx/compose/ui/node/SemanticsModifierNode;)V", "Landroidx/compose/ui/Modifier$Node;", "", "useMinimumTouchTarget", "Landroidx/compose/ui/geometry/Rect;", "t", "(Landroidx/compose/ui/Modifier$Node;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", c.f62177j, "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,122:1\n91#2:123\n91#2:124\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n117#1:123\n120#1:124\n*E\n"})
public final class SemanticsModifierNodeKt {
    public static final boolean n(SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.n(semanticsConfiguration, SemanticsActions.f33251n.qie()) != null;
    }

    public static final void rl(SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.HI(semanticsModifierNode).a63();
    }

    public static final Rect t(Modifier.Node node, boolean z2) {
        if (!node.getNode().getIsAttached()) {
            return Rect.INSTANCE.n();
        }
        if (!z2) {
            return LayoutCoordinatesKt.rl(DelegatableNodeKt.mUb(node, NodeKind.n(8)));
        }
        return DelegatableNodeKt.mUb(node, NodeKind.n(8)).p();
    }
}
