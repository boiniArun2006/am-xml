package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/OverscrollModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DelegatableNode;", "overscrollNode", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;)V", "", CmcdConfiguration.KEY_PLAYBACK_RATE, "()V", "c", "Sax", "ni", "jB", "Landroidx/compose/ui/node/DelegatableNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
final class OverscrollModifierNode extends DelegatingNode {

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private DelegatableNode overscrollNode;

    private final void pr() {
        DelegatableNode delegatableNodeUR;
        Modifier.Node node;
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode == null || (node = delegatableNode.getNode()) == null || node.getIsAttached()) {
            delegatableNodeUR = null;
        } else {
            DelegatableNode delegatableNode2 = this.overscrollNode;
            Intrinsics.checkNotNull(delegatableNode2);
            delegatableNodeUR = UR(delegatableNode2);
        }
        this.overscrollNode = delegatableNodeUR;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            ex(delegatableNode);
        }
    }

    public final void ni(DelegatableNode overscrollNode) {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            ex(delegatableNode);
        }
        this.overscrollNode = overscrollNode;
        pr();
    }

    public OverscrollModifierNode(DelegatableNode delegatableNode) {
        this.overscrollNode = delegatableNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        pr();
    }
}
