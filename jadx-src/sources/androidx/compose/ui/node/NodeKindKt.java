package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d\"\u001c\u0010\"\u001a\u00020\u0017*\u0006\u0012\u0002\b\u00030\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "element", "", "J2", "(Landroidx/compose/ui/Modifier$Element;)I", "Landroidx/compose/ui/Modifier$Node;", "node", "Uo", "(Landroidx/compose/ui/Modifier$Node;)I", "", "nr", "(Landroidx/compose/ui/Modifier$Node;)V", c.f62177j, "O", "remainingSet", "phase", "rl", "(Landroidx/compose/ui/Modifier$Node;II)V", "selfKindSet", "t", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "mUb", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "", "gh", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)Z", "KN", "Landroidx/collection/MutableObjectIntMap;", "", "Landroidx/collection/MutableObjectIntMap;", "classToKindSetMap", "Landroidx/compose/ui/node/NodeKind;", "xMQ", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,407:1\n61#1:411\n61#1:413\n61#1:415\n61#1:417\n61#1:419\n61#1:421\n61#1:423\n61#1:425\n61#1:427\n61#1:429\n61#1:431\n61#1:439\n61#1:441\n61#1:443\n61#1:445\n61#1:447\n61#1:449\n61#1:451\n61#1:453\n61#1:455\n61#1:457\n61#1:459\n61#1:461\n61#1:463\n61#1:465\n61#1:467\n61#1:469\n61#1:471\n61#1:473\n61#1:475\n64#1:500\n64#1:503\n64#1:505\n64#1:507\n64#1:509\n64#1:511\n64#1:513\n64#1:515\n107#2:408\n79#2:409\n83#2:410\n87#2:412\n91#2:414\n95#2:416\n99#2:418\n127#2:420\n123#2:422\n111#2:424\n103#2:426\n107#2:428\n151#2:430\n79#2:437\n83#2:438\n87#2:440\n91#2:442\n95#2:444\n99#2:446\n103#2:448\n107#2:450\n111#2:452\n115#2:454\n119#2:456\n123#2:458\n127#2:460\n131#2:462\n135#2:464\n139#2:466\n143#2:468\n147#2:470\n151#2:472\n155#2:474\n83#2:499\n83#2:501\n107#2:502\n111#2:504\n87#2:506\n91#2:508\n103#2:510\n123#2:512\n127#2:514\n119#2:516\n688#3,5:432\n693#3,2:476\n56#4,5:478\n56#4,5:483\n56#4,5:488\n56#4,5:523\n240#5,6:493\n240#5,3:556\n243#5,3:576\n240#5,6:593\n283#6,5:517\n148#6:522\n149#6:528\n150#6,3:532\n153#6:536\n154#6,9:538\n437#6,6:547\n447#6,2:554\n449#6,17:559\n466#6,8:579\n163#6,6:587\n1101#7:529\n1083#7,2:530\n519#8:535\n44#8:537\n246#9:553\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n162#1:411\n165#1:413\n168#1:415\n171#1:417\n174#1:419\n178#1:421\n182#1:423\n185#1:425\n188#1:427\n191#1:429\n194#1:431\n209#1:439\n212#1:441\n215#1:443\n218#1:445\n221#1:447\n224#1:449\n227#1:451\n230#1:453\n233#1:455\n236#1:457\n239#1:459\n242#1:461\n245#1:463\n248#1:465\n251#1:467\n254#1:469\n257#1:471\n260#1:473\n263#1:475\n309#1:500\n316#1:503\n323#1:505\n330#1:507\n333#1:509\n336#1:511\n340#1:513\n353#1:515\n71#1:408\n160#1:409\n162#1:410\n165#1:412\n168#1:414\n171#1:416\n174#1:418\n178#1:420\n182#1:422\n185#1:424\n188#1:426\n191#1:428\n194#1:430\n207#1:437\n209#1:438\n212#1:440\n215#1:442\n218#1:444\n221#1:446\n224#1:448\n227#1:450\n230#1:452\n233#1:454\n236#1:456\n239#1:458\n242#1:460\n245#1:462\n248#1:464\n251#1:466\n254#1:468\n257#1:470\n260#1:472\n263#1:474\n309#1:499\n312#1:501\n316#1:502\n323#1:504\n330#1:506\n333#1:508\n336#1:510\n340#1:512\n353#1:514\n359#1:516\n206#1:432,5\n206#1:476,2\n274#1:478,5\n279#1:483,5\n284#1:488,5\n359#1:523,5\n296#1:493,6\n359#1:556,3\n359#1:576,3\n399#1:593,6\n359#1:517,5\n359#1:522\n359#1:528\n359#1:532,3\n359#1:536\n359#1:538,9\n359#1:547,6\n359#1:554,2\n359#1:559,17\n359#1:579,8\n359#1:587,6\n359#1:529\n359#1:530,2\n359#1:535\n359#1:537\n359#1:553\n*E\n"})
public final class NodeKindKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final MutableObjectIntMap f32612n = ObjectIntMapKt.rl();

    public static final int J2(Modifier.Element element) {
        int iN = NodeKind.n(1);
        if (element instanceof LayoutModifier) {
            iN |= NodeKind.n(2);
        }
        if (element instanceof DrawModifier) {
            iN |= NodeKind.n(4);
        }
        if (element instanceof SemanticsModifier) {
            iN |= NodeKind.n(8);
        }
        if (element instanceof PointerInputModifier) {
            iN |= NodeKind.n(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iN |= NodeKind.n(32);
        }
        if (element instanceof FocusEventModifier) {
            iN |= NodeKind.n(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iN |= NodeKind.n(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iN |= NodeKind.n(256);
        }
        if (element instanceof ParentDataModifier) {
            iN |= NodeKind.n(64);
        }
        if ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) {
            iN |= NodeKind.n(128);
        }
        return element instanceof BringIntoViewModifierNode ? NodeKind.n(524288) | iN : iN;
    }

    public static final int KN(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return Uo(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int iNC9 = delegatingNode.getSelfKindSet();
        for (Modifier.Node nodeW5k = delegatingNode.getDelegate(); nodeW5k != null; nodeW5k = nodeW5k.getChild()) {
            iNC9 |= KN(nodeW5k);
        }
        return iNC9;
    }

    private static final boolean gh(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.f32386n;
        canFocusChecker.rl();
        focusPropertiesModifierNode.n7b(canFocusChecker);
        return canFocusChecker.n();
    }

    private static final void mUb(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iN = NodeKind.n(1024);
        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.t(mutableVector, focusPropertiesModifierNode.getNode(), false);
        } else {
            mutableVector.rl(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodeKN = (Modifier.Node) mutableVector.r(mutableVector.getSize() - 1);
            if ((nodeKN.getAggregateChildKindSet() & iN) == 0) {
                DelegatableNodeKt.t(mutableVector, nodeKN, false);
            } else {
                while (true) {
                    if (nodeKN == null) {
                        break;
                    }
                    if ((nodeKN.getKindSet() & iN) != 0) {
                        MutableVector mutableVector2 = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof FocusTargetNode) {
                                FocusTargetNodeKt.rl((FocusTargetNode) nodeKN);
                            } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node nodeW5k = ((DelegatingNode) nodeKN).getDelegate(); nodeW5k != null; nodeW5k = nodeW5k.getChild()) {
                                    if ((nodeW5k.getKindSet() & iN) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodeKN = nodeW5k;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeKN != null) {
                                                mutableVector2.rl(nodeKN);
                                                nodeKN = null;
                                            }
                                            mutableVector2.rl(nodeW5k);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodeKN = DelegatableNodeKt.KN(mutableVector2);
                        }
                    } else {
                        nodeKN = nodeKN.getChild();
                    }
                }
            }
        }
    }

    public static final void rl(Modifier.Node node, int i2, int i3) {
        if (!(node instanceof DelegatingNode)) {
            t(node, i2 & node.getKindSet(), i3);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        t(node, delegatingNode.getSelfKindSet() & i2, i3);
        int i5 = (~delegatingNode.getSelfKindSet()) & i2;
        for (Modifier.Node nodeW5k = delegatingNode.getDelegate(); nodeW5k != null; nodeW5k = nodeW5k.getChild()) {
            rl(nodeW5k, i5, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void t(Modifier.Node node, int i2, int i3) {
        if (i3 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.n(2) & i2) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.rl((LayoutModifierNode) node);
                if (i3 == 2) {
                    DelegatableNodeKt.mUb(node, NodeKind.n(2)).i7();
                }
            }
            if ((NodeKind.n(128) & i2) != 0 && (node instanceof LayoutAwareModifierNode) && i3 != 2) {
                DelegatableNodeKt.HI(node).kSg();
            }
            if ((NodeKind.n(256) & i2) != 0 && (node instanceof GlobalPositionAwareModifierNode) && i3 != 2) {
                DelegatableNodeKt.HI(node).W();
            }
            if ((NodeKind.n(4) & i2) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.n((DrawModifierNode) node);
            }
            if ((NodeKind.n(8) & i2) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.HI(node).l(true);
            }
            if ((NodeKind.n(64) & i2) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.n((ParentDataModifierNode) node);
            }
            if ((NodeKind.n(2048) & i2) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (gh(focusPropertiesModifierNode)) {
                    if (ComposeUiFlags.isTrackFocusEnabled || i3 == 2) {
                        mUb(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNodeKt.n(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i2 & NodeKind.n(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.rl((FocusEventModifierNode) node);
        }
    }

    public static final boolean xMQ(int i2) {
        return (i2 & NodeKind.n(128)) != 0;
    }

    public static final void O(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.t("autoInvalidateUpdatedNode called on unattached node");
        }
        rl(node, -1, 0);
    }

    public static final int Uo(Modifier.Node node) {
        if (node.getKindSet() != 0) {
            return node.getKindSet();
        }
        MutableObjectIntMap mutableObjectIntMap = f32612n;
        Object objRl = Actual_jvmKt.rl(node);
        int iRl = mutableObjectIntMap.rl(objRl);
        if (iRl >= 0) {
            return mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iRl];
        }
        int iN = NodeKind.n(1);
        if (node instanceof LayoutModifierNode) {
            iN |= NodeKind.n(2);
        }
        if (node instanceof DrawModifierNode) {
            iN |= NodeKind.n(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iN |= NodeKind.n(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iN |= NodeKind.n(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            iN |= NodeKind.n(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iN |= NodeKind.n(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iN |= NodeKind.n(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iN |= NodeKind.n(256);
        }
        if (node instanceof ApproachLayoutModifierNode) {
            iN |= NodeKind.n(512);
        }
        if (node instanceof FocusTargetNode) {
            iN |= NodeKind.n(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iN |= NodeKind.n(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iN |= NodeKind.n(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iN |= NodeKind.n(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            iN |= NodeKind.n(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            iN |= NodeKind.n(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            iN |= NodeKind.n(131072);
        }
        if (node instanceof TraversableNode) {
            iN |= NodeKind.n(262144);
        }
        if (node instanceof BringIntoViewModifierNode) {
            iN |= NodeKind.n(524288);
        }
        if (node instanceof OnUnplacedModifierNode) {
            iN |= NodeKind.n(1048576);
        }
        mutableObjectIntMap.XQ(objRl, iN);
        return iN;
    }

    public static final void n(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.t("autoInvalidateInsertedNode called on unattached node");
        }
        rl(node, -1, 1);
    }

    public static final void nr(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.t("autoInvalidateRemovedNode called on unattached node");
        }
        rl(node, -1, 2);
    }
}
