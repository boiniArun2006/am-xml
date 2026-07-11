package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;Z)V", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "b", "(I)Z", "", "NC9", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "", "P5", "Ljava/lang/String;", "i7", "()Ljava/lang/String;", "traverseKey", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerHoverIconModifierNode extends HoverIconModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final String traverseKey;

    public PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z2) {
        super(pointerIcon, z2, null, 4, null);
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public boolean b(int pointerType) {
        PointerType.Companion companion = PointerType.INSTANCE;
        return (PointerType.KN(pointerType, companion.t()) || PointerType.KN(pointerType, companion.n())) ? false : true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* JADX INFO: renamed from: i7, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public void NC9(PointerIcon icon) {
        PointerIconService pointerIconServiceVd = Vd();
        if (pointerIconServiceVd != null) {
            pointerIconServiceVd.n(icon);
        }
    }
}
