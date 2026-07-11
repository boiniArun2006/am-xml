package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\"\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "mergingEnabled", "Landroidx/compose/ui/semantics/SemanticsNode;", c.f62177j, "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/ui/semantics/SemanticsNode;", "", "O", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "KN", "Landroidx/compose/ui/node/SemanticsModifierNode;", "J2", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;", "outerMergingSemantics", "Landroidx/compose/ui/semantics/Role;", "Uo", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "role", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,502:1\n91#2:503\n91#2:568\n727#3:504\n662#3,6:505\n683#3,3:511\n668#3,2:514\n728#3:521\n671#3,2:560\n686#3,3:562\n673#3:565\n663#3:566\n730#3:567\n657#3,11:569\n683#3,3:580\n668#3,2:583\n671#3,2:628\n686#3,3:630\n673#3:633\n663#3:634\n658#3:635\n437#4,5:516\n442#4:522\n447#4,2:524\n449#4,8:529\n457#4,9:540\n466#4,8:552\n437#4,6:585\n447#4,2:592\n449#4,8:597\n457#4,9:608\n466#4,8:620\n246#5:523\n246#5:591\n240#6,3:526\n243#6,3:549\n240#6,3:594\n243#6,3:617\n1101#7:537\n1083#7,2:538\n1101#7:605\n1083#7,2:606\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n45#1:503\n475#1:568\n45#1:504\n45#1:505,6\n45#1:511,3\n45#1:514,2\n45#1:521\n45#1:560,2\n45#1:562,3\n45#1:565\n45#1:566\n45#1:567\n475#1:569,11\n475#1:580,3\n475#1:583,2\n475#1:628,2\n475#1:630,3\n475#1:633\n475#1:634\n475#1:635\n45#1:516,5\n45#1:522\n45#1:524,2\n45#1:529,8\n45#1:540,9\n45#1:552,8\n475#1:585,6\n475#1:592,2\n475#1:597,8\n475#1:608,9\n475#1:620,8\n45#1:523\n475#1:591\n45#1:526,3\n45#1:549,3\n475#1:594,3\n475#1:617,3\n45#1:537\n45#1:538,2\n475#1:605\n475#1:606,2\n*E\n"})
public final class SemanticsNodeKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SemanticsModifierNode J2(LayoutNode layoutNode) {
        NodeChain nodes = layoutNode.getNodes();
        int iN = NodeKind.n(8);
        Object obj = null;
        if ((nodes.xMQ() & iN) != 0) {
            Modifier.Node head = nodes.getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & iN) != 0) {
                    Modifier.Node nodeKN = head;
                    MutableVector mutableVector = null;
                    while (nodeKN != null) {
                        if (nodeKN instanceof SemanticsModifierNode) {
                            if (((SemanticsModifierNode) nodeKN).getMergeDescendants()) {
                                obj = nodeKN;
                                break loop0;
                            }
                        } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iN) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nodeKN = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodeKN != null) {
                                            mutableVector.rl(nodeKN);
                                            nodeKN = null;
                                        }
                                        mutableVector.rl(delegate);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        nodeKN = DelegatableNodeKt.KN(mutableVector);
                    }
                    if ((head.getAggregateChildKindSet() & iN) != 0) {
                        break;
                    }
                    head = head.getChild();
                } else if ((head.getAggregateChildKindSet() & iN) != 0) {
                }
            }
        }
        return (SemanticsModifierNode) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int KN(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role Uo(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), SemanticsProperties.f33276n.iF());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SemanticsNode n(LayoutNode layoutNode, boolean z2) {
        NodeChain nodes = layoutNode.getNodes();
        int iN = NodeKind.n(8);
        Object obj = null;
        if ((nodes.xMQ() & iN) != 0) {
            Modifier.Node head = nodes.getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & iN) != 0) {
                    Modifier.Node nodeKN = head;
                    MutableVector mutableVector = null;
                    while (nodeKN != null) {
                        if (nodeKN instanceof SemanticsModifierNode) {
                            obj = nodeKN;
                            break loop0;
                        }
                        if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iN) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nodeKN = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodeKN != null) {
                                            mutableVector.rl(nodeKN);
                                            nodeKN = null;
                                        }
                                        mutableVector.rl(delegate);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        nodeKN = DelegatableNodeKt.KN(mutableVector);
                    }
                    if ((head.getAggregateChildKindSet() & iN) != 0) {
                        break;
                    }
                    head = head.getChild();
                } else if ((head.getAggregateChildKindSet() & iN) != 0) {
                }
            }
        }
        Intrinsics.checkNotNull(obj);
        Modifier.Node node = ((SemanticsModifierNode) obj).getNode();
        SemanticsConfiguration semanticsConfigurationD = layoutNode.D();
        if (semanticsConfigurationD == null) {
            semanticsConfigurationD = new SemanticsConfiguration();
        }
        return new SemanticsNode(node, z2, layoutNode, semanticsConfigurationD);
    }
}
