package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdModifier;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/Modifier$Node;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/ui/unit/Density;", "parentData", "Xw", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "v", "Ljava/lang/Object;", "uG", "()Ljava/lang/Object;", "UR", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Object layoutId;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public Object Xw(Density density, Object obj) {
        return this;
    }

    public void UR(Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    /* JADX INFO: renamed from: uG, reason: from getter */
    public Object getLayoutId() {
        return this.layoutId;
    }

    public LayoutIdModifier(Object obj) {
        this.layoutId = obj;
    }
}
