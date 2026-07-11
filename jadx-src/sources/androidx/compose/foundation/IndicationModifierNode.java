package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/IndicationModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DelegatableNode;", "indicationNode", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;)V", "", CmcdConfiguration.KEY_PLAYBACK_RATE, "jB", "Landroidx/compose/ui/node/DelegatableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class IndicationModifierNode extends DelegatingNode {

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private DelegatableNode indicationNode;

    public final void pr(DelegatableNode indicationNode) {
        ex(this.indicationNode);
        this.indicationNode = indicationNode;
        UR(indicationNode);
    }

    public IndicationModifierNode(DelegatableNode delegatableNode) {
        this.indicationNode = delegatableNode;
        UR(delegatableNode);
    }
}
