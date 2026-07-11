package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "t", "()Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "node", "", "O", "(Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;)V", "Landroidx/compose/ui/layout/AlignmentLine;", c.f62177j, "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/unit/TextUnit;", "J", "getBefore-XSAIIZE", "()J", TtmlNode.ANNOTATION_POSITION_BEFORE, "getAfter-XSAIIZE", TtmlNode.ANNOTATION_POSITION_AFTER, "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long after;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AlignmentLine alignmentLine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long before;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = other instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) other : null;
        return alignmentLineOffsetTextUnitElement != null && Intrinsics.areEqual(this.alignmentLine, alignmentLineOffsetTextUnitElement.alignmentLine) && TextUnit.O(this.before, alignmentLineOffsetTextUnitElement.before) && TextUnit.O(this.after, alignmentLineOffsetTextUnitElement.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void rl(AlignmentLineOffsetTextUnitNode node) {
        node.W5k(this.alignmentLine);
        node.NC9(this.before);
        node.UR(this.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.xMQ(this.before)) * 31) + TextUnit.xMQ(this.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public AlignmentLineOffsetTextUnitNode n() {
        return new AlignmentLineOffsetTextUnitNode(this.alignmentLine, this.before, this.after, null);
    }
}
