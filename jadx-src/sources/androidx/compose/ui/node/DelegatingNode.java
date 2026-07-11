package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0010¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\"\u0010\u0003R \u0010(\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0015¨\u0006/"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "delegateKindSet", "delegateNode", "", "W1c", "(ILandroidx/compose/ui/Modifier$Node;)V", "newKindSet", "", "recalculateOwner", "poH", "(IZ)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Rc", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "owner", "V5F", "(Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/node/DelegatableNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "delegatableNode", "UR", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;", "instance", "ex", "(Landroidx/compose/ui/node/DelegatableNode;)V", "gxH", "XUb", "rR", "YiW", "x", "v", "I", "NC9", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "Xw", "Landroidx/compose/ui/Modifier$Node;", "W5k", "()Landroidx/compose/ui/Modifier$Node;", "setDelegate$ui_release", "delegate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,279:1\n240#1,6:280\n240#1,6:286\n240#1,6:308\n240#1,6:314\n240#1,6:320\n240#1,6:326\n240#1,6:332\n56#2,5:292\n56#2,5:303\n83#3:297\n83#3:299\n83#3:301\n64#4:298\n64#4:300\n64#4:302\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n44#1:280,6\n61#1:286,6\n249#1:308,6\n260#1:314,6\n266#1:320,6\n270#1:326,6\n276#1:332,6\n90#1:292,5\n187#1:303,5\n112#1:297\n168#1:299\n182#1:301\n112#1:298\n168#1:300\n182#1:302\n*E\n"})
public abstract class DelegatingNode extends Modifier.Node {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Modifier.Node delegate;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final int selfKindSet = NodeKindKt.Uo(this);

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final Modifier.Node getDelegate() {
        return this.delegate;
    }

    protected final void ex(DelegatableNode instance) {
        Modifier.Node node = null;
        for (Modifier.Node child = this.delegate; child != null; child = child.getChild()) {
            if (child == instance) {
                if (child.getIsAttached()) {
                    NodeKindKt.nr(child);
                    child.rR();
                    child.YiW();
                }
                child.V5F(child);
                child.MPw(0);
                if (node == null) {
                    this.delegate = child.getChild();
                } else {
                    node.sFO(child.getChild());
                }
                child.sFO(null);
                child.Qg8(null);
                int kindSet = getKindSet();
                int iKN = NodeKindKt.KN(this);
                poH(iKN, true);
                if (getIsAttached() && (kindSet & NodeKind.n(2)) != 0 && (NodeKind.n(2) & iKN) == 0) {
                    NodeChain nodes = DelegatableNodeKt.HI(this).getNodes();
                    getNode().Rc(null);
                    nodes.fD();
                    return;
                }
                return;
            }
            node = child;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }

    private final void W1c(int delegateKindSet, Modifier.Node delegateNode) {
        int kindSet = getKindSet();
        if ((delegateKindSet & NodeKind.n(2)) != 0 && (NodeKind.n(2) & kindSet) != 0 && !(this instanceof LayoutModifierNode)) {
            InlineClassHelperKt.t("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode);
        }
    }

    private final void poH(int newKindSet, boolean recalculateOwner) {
        int aggregateChildKindSet;
        Modifier.Node child;
        int kindSet = getKindSet();
        jX(newKindSet);
        if (kindSet != newKindSet) {
            if (DelegatableNodeKt.Uo(this)) {
                MPw(newKindSet);
            }
            if (getIsAttached()) {
                Modifier.Node node = getNode();
                Modifier.Node parent = this;
                while (parent != null) {
                    newKindSet |= parent.getKindSet();
                    parent.jX(newKindSet);
                    if (parent == node) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (recalculateOwner && parent == node) {
                    newKindSet = NodeKindKt.KN(node);
                    node.jX(newKindSet);
                }
                if (parent != null && (child = parent.getChild()) != null) {
                    aggregateChildKindSet = child.getAggregateChildKindSet();
                } else {
                    aggregateChildKindSet = 0;
                }
                int kindSet2 = newKindSet | aggregateChildKindSet;
                while (parent != null) {
                    kindSet2 |= parent.getKindSet();
                    parent.MPw(kindSet2);
                    parent = parent.getParent();
                }
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Rc(NodeCoordinator coordinator) {
        super.Rc(coordinator);
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.Rc(coordinator);
        }
    }

    protected final DelegatableNode UR(DelegatableNode delegatableNode) {
        Modifier.Node node;
        Modifier.Node node2 = delegatableNode.getNode();
        Modifier.Node parent = null;
        if (node2 != delegatableNode) {
            if (delegatableNode instanceof Modifier.Node) {
                node = (Modifier.Node) delegatableNode;
            } else {
                node = null;
            }
            if (node != null) {
                parent = node.getParent();
            }
            if (node2 == getNode() && Intrinsics.areEqual(parent, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node2.getIsAttached()) {
            InlineClassHelperKt.t("Cannot delegate to an already attached node");
        }
        node2.V5F(getNode());
        int kindSet = getKindSet();
        int iKN = NodeKindKt.KN(node2);
        node2.jX(iKN);
        W1c(iKN, node2);
        node2.sFO(this.delegate);
        this.delegate = node2;
        node2.Qg8(this);
        poH(getKindSet() | iKN, false);
        if (getIsAttached()) {
            if ((iKN & NodeKind.n(2)) != 0 && (kindSet & NodeKind.n(2)) == 0) {
                NodeChain nodes = DelegatableNodeKt.HI(this).getNodes();
                getNode().Rc(null);
                nodes.fD();
            } else {
                Rc(getCoordinator());
            }
            node2.gxH();
            node2.XUb();
            NodeKindKt.n(node2);
        }
        return delegatableNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void V5F(Modifier.Node owner) {
        super.V5F(owner);
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.V5F(owner);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void XUb() {
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.XUb();
        }
        super.XUb();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void YiW() {
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.YiW();
        }
        super.YiW();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void gxH() {
        super.gxH();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.Rc(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.gxH();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void rR() {
        super.rR();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.rR();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void x() {
        super.x();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.x();
        }
    }
}
