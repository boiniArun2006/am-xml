package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/tooling/data/NodeGroup;", "Landroidx/compose/ui/tooling/data/Group;", "", "key", "node", "Landroidx/compose/ui/unit/IntRect;", "box", "", "data", "", "Landroidx/compose/ui/layout/ModifierInfo;", "modifierInfo", "children", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/unit/IntRect;Ljava/util/Collection;Ljava/util/List;Ljava/util/Collection;)V", "xMQ", "Ljava/lang/Object;", "Uo", "()Ljava/lang/Object;", "mUb", "Ljava/util/List;", "O", "()Ljava/util/List;", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NodeGroup extends Group {

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final List modifierInfo;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Object node;

    public NodeGroup(Object obj, Object obj2, IntRect intRect, Collection collection, List list, Collection collection2) {
        super(obj, null, null, null, intRect, collection, collection2, false, null);
        this.node = obj2;
        this.modifierInfo = list;
    }

    @Override // androidx.compose.ui.tooling.data.Group
    /* JADX INFO: renamed from: O, reason: from getter */
    public List getModifierInfo() {
        return this.modifierInfo;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Object getNode() {
        return this.node;
    }
}
