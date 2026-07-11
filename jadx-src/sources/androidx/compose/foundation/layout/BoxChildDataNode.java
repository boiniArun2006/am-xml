package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0000*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/Alignment;", "alignment", "", "matchParentSize", "<init>", "(Landroidx/compose/ui/Alignment;Z)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "NC9", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/layout/BoxChildDataNode;", "v", "Landroidx/compose/ui/Alignment;", "UR", "()Landroidx/compose/ui/Alignment;", "ex", "(Landroidx/compose/ui/Alignment;)V", "Xw", "Z", "W5k", "()Z", "poH", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BoxChildDataNode extends Modifier.Node implements ParentDataModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean matchParentSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Alignment alignment;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    /* JADX INFO: renamed from: NC9, reason: merged with bridge method [inline-methods] */
    public BoxChildDataNode Xw(Density density, Object obj) {
        return this;
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public final void ex(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void poH(boolean z2) {
        this.matchParentSize = z2;
    }

    public BoxChildDataNode(Alignment alignment, boolean z2) {
        this.alignment = alignment;
        this.matchParentSize = z2;
    }
}
