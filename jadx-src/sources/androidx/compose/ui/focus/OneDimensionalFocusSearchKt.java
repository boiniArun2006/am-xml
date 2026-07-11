package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a2\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a:\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "J2", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "t", "(Landroidx/compose/ui/focus/FocusTargetNode;Lkotlin/jvm/functions/Function1;)Z", "rl", "focusedItem", "nr", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "xMQ", "KN", "Uo", "O", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,280:1\n201#1,3:359\n204#1,2:363\n207#1,5:366\n216#1,3:371\n219#1,2:375\n222#1,5:378\n1083#2,2:281\n1101#2:297\n1083#2,2:383\n1101#2:398\n1083#2,2:467\n1101#2:482\n1101#2:595\n1083#2,2:596\n1#3:283\n119#4:284\n119#4:385\n119#4:469\n119#4:553\n283#5,5:285\n148#5:290\n149#5:296\n150#5,3:298\n153#5:302\n154#5,9:304\n437#5,6:313\n447#5,2:320\n449#5,17:325\n466#5,8:345\n163#5,6:353\n283#5,5:386\n148#5:391\n149#5:397\n150#5,3:399\n153#5:403\n154#5,9:405\n437#5,6:414\n447#5,2:421\n449#5,17:426\n466#5,8:446\n163#5,6:454\n283#5,5:470\n148#5:475\n149#5:481\n150#5,3:483\n153#5:487\n154#5,9:489\n437#5,6:498\n447#5,2:505\n449#5,17:510\n466#5,8:530\n163#5,6:538\n277#5:554\n247#5,5:555\n90#5:560\n91#5,8:566\n437#5,5:574\n278#5:579\n442#5:580\n447#5,2:582\n449#5,8:587\n457#5,9:598\n466#5,8:610\n100#5,7:618\n280#5:625\n56#6,5:291\n56#6,5:392\n56#6,5:476\n56#6,5:561\n519#7:301\n44#7:303\n48#7:362\n472#7:365\n48#7:374\n472#7:377\n519#7:402\n44#7:404\n194#7,7:460\n519#7:486\n44#7:488\n447#7,9:544\n48#7:626\n472#7:627\n472#7:628\n48#7:629\n472#7:630\n472#7:631\n246#8:319\n246#8:420\n246#8:504\n246#8:581\n240#9,3:322\n243#9,3:342\n240#9,3:423\n243#9,3:443\n240#9,3:507\n243#9,3:527\n240#9,3:584\n243#9,3:607\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n153#1:359,3\n153#1:363,2\n153#1:366,5\n157#1:371,3\n157#1:375,2\n157#1:378,5\n149#1:281,2\n149#1:297\n177#1:383,2\n177#1:398\n186#1:467,2\n186#1:482\n196#1:595\n196#1:596,2\n149#1:284\n177#1:385\n186#1:469\n196#1:553\n149#1:285,5\n149#1:290\n149#1:296\n149#1:298,3\n149#1:302\n149#1:304,9\n149#1:313,6\n149#1:320,2\n149#1:325,17\n149#1:345,8\n149#1:353,6\n177#1:386,5\n177#1:391\n177#1:397\n177#1:399,3\n177#1:403\n177#1:405,9\n177#1:414,6\n177#1:421,2\n177#1:426,17\n177#1:446,8\n177#1:454,6\n186#1:470,5\n186#1:475\n186#1:481\n186#1:483,3\n186#1:487\n186#1:489,9\n186#1:498,6\n186#1:505,2\n186#1:510,17\n186#1:530,8\n186#1:538,6\n196#1:554\n196#1:555,5\n196#1:560\n196#1:566,8\n196#1:574,5\n196#1:579\n196#1:580\n196#1:582,2\n196#1:587,8\n196#1:598,9\n196#1:610,8\n196#1:618,7\n196#1:625\n149#1:291,5\n177#1:392,5\n186#1:476,5\n196#1:561,5\n149#1:301\n149#1:303\n153#1:362\n153#1:365\n157#1:374\n157#1:377\n177#1:402\n177#1:404\n179#1:460,7\n186#1:486\n186#1:488\n188#1:544,9\n203#1:626\n205#1:627\n207#1:628\n218#1:629\n220#1:630\n222#1:631\n149#1:319\n177#1:420\n186#1:504\n196#1:581\n149#1:322,3\n149#1:342,3\n177#1:423,3\n177#1:443,3\n186#1:507,3\n186#1:527,3\n196#1:584,3\n196#1:607,3\n*E\n"})
public final class OneDimensionalFocusSearchKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.f31349t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.f31346n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.f31345O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean J2(FocusTargetNode focusTargetNode, int i2, Function1 function1) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.O())) {
            return t(focusTargetNode, function1);
        }
        if (FocusDirection.qie(i2, companion.J2())) {
            return rl(focusTargetNode, function1);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean KN(FocusTargetNode focusTargetNode, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.t(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.rl(child);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodeKN = (Modifier.Node) mutableVector2.r(mutableVector2.getSize() - 1);
            if ((nodeKN.getAggregateChildKindSet() & iN) == 0) {
                DelegatableNodeKt.t(mutableVector2, nodeKN, false);
            } else {
                while (true) {
                    if (nodeKN == null) {
                        break;
                    }
                    if ((nodeKN.getKindSet() & iN) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof FocusTargetNode) {
                                mutableVector.rl((FocusTargetNode) nodeKN);
                            } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iN) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodeKN = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeKN != null) {
                                                mutableVector3.rl(nodeKN);
                                                nodeKN = null;
                                            }
                                            mutableVector3.rl(delegate);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodeKN = DelegatableNodeKt.KN(mutableVector3);
                        }
                    } else {
                        nodeKN = nodeKN.getChild();
                    }
                }
            }
        }
        mutableVector.aYN(FocusableChildrenComparator.f31362n);
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i3 = 0; i3 < size; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (FocusTraversalKt.Uo(focusTargetNode2) && t(focusTargetNode2, function1)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean O(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes;
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNode);
        loop0: while (true) {
            node = null;
            if (layoutNodeHI == null) {
                break;
            }
            if ((layoutNodeHI.getNodes().getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iN) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iN) != 0) {
                        Modifier.Node nodeKN = parent;
                        MutableVector mutableVector = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof FocusTargetNode) {
                                node = nodeKN;
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
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeHI = layoutNodeHI.mYa();
            parent = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
        }
        return node == null;
    }

    private static final boolean Uo(FocusTargetNode focusTargetNode, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.t(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.rl(child);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodeKN = (Modifier.Node) mutableVector2.r(mutableVector2.getSize() - 1);
            if ((nodeKN.getAggregateChildKindSet() & iN) == 0) {
                DelegatableNodeKt.t(mutableVector2, nodeKN, false);
            } else {
                while (true) {
                    if (nodeKN == null) {
                        break;
                    }
                    if ((nodeKN.getKindSet() & iN) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof FocusTargetNode) {
                                mutableVector.rl((FocusTargetNode) nodeKN);
                            } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iN) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodeKN = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeKN != null) {
                                                mutableVector3.rl(nodeKN);
                                                nodeKN = null;
                                            }
                                            mutableVector3.rl(delegate);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodeKN = DelegatableNodeKt.KN(mutableVector3);
                        }
                    } else {
                        nodeKN = nodeKN.getChild();
                    }
                }
            }
        }
        mutableVector.aYN(FocusableChildrenComparator.f31362n);
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[size];
                if (FocusTraversalKt.Uo(focusTargetNode2) && rl(focusTargetNode2, function1)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    private static final boolean nr(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i2, final Function1 function1) {
        if (xMQ(focusTargetNode, focusTargetNode2, i2, function1)) {
            return true;
        }
        final FocusTransactionManager focusTransactionManagerT = FocusTargetNodeKt.t(focusTargetNode);
        final int generation = focusTransactionManagerT.getGeneration();
        final FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.n(focusTargetNode, i2, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                if (generation != focusTransactionManagerT.getGeneration() || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().getActiveFocusTargetNode())) {
                    return Boolean.TRUE;
                }
                boolean zXMQ = OneDimensionalFocusSearchKt.xMQ(focusTargetNode, focusTargetNode2, i2, function1);
                Boolean boolValueOf = Boolean.valueOf(zXMQ);
                if (zXMQ || !beyondBoundsScope.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean rl(FocusTargetNode focusTargetNode, Function1 function1) {
        boolean zBooleanValue;
        FocusStateImpl focusStateImplIjL = focusTargetNode.ijL();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusStateImplIjL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (!Uo(focusTargetNode, function1)) {
                        if (focusTargetNode.ni().getCanFocus()) {
                            zBooleanValue = ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (!zBooleanValue) {
                            return false;
                        }
                    }
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Uo(focusTargetNode, function1);
        }
        FocusTargetNode focusTargetNodeJ2 = FocusTraversalKt.J2(focusTargetNode);
        if (focusTargetNodeJ2 != null) {
            int i3 = iArr[focusTargetNodeJ2.ijL().ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                return nr(focusTargetNode, focusTargetNodeJ2, FocusDirection.INSTANCE.J2(), function1);
            }
            if (!rl(focusTargetNodeJ2, function1) && !nr(focusTargetNode, focusTargetNodeJ2, FocusDirection.INSTANCE.J2(), function1) && (!focusTargetNodeJ2.ni().getCanFocus() || !((Boolean) function1.invoke(focusTargetNodeJ2)).booleanValue())) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean t(FocusTargetNode focusTargetNode, Function1 function1) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.ijL().ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (focusTargetNode.ni().getCanFocus()) {
                        return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
                    }
                    return KN(focusTargetNode, function1);
                }
                throw new NoWhenBranchMatchedException();
            }
            return KN(focusTargetNode, function1);
        }
        FocusTargetNode focusTargetNodeJ2 = FocusTraversalKt.J2(focusTargetNode);
        if (focusTargetNodeJ2 != null) {
            if (t(focusTargetNodeJ2, function1) || nr(focusTargetNode, focusTargetNodeJ2, FocusDirection.INSTANCE.O(), function1)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i2, Function1 function1) {
        if (focusTargetNode.ijL() == FocusStateImpl.f31349t) {
            MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
            int iN = NodeKind.n(1024);
            if (!focusTargetNode.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitChildren called on an unattached node");
            }
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child = focusTargetNode.getNode().getChild();
            if (child == null) {
                DelegatableNodeKt.t(mutableVector2, focusTargetNode.getNode(), false);
            } else {
                mutableVector2.rl(child);
            }
            while (mutableVector2.getSize() != 0) {
                Modifier.Node nodeKN = (Modifier.Node) mutableVector2.r(mutableVector2.getSize() - 1);
                if ((nodeKN.getAggregateChildKindSet() & iN) == 0) {
                    DelegatableNodeKt.t(mutableVector2, nodeKN, false);
                } else {
                    while (true) {
                        if (nodeKN == null) {
                            break;
                        }
                        if ((nodeKN.getKindSet() & iN) != 0) {
                            MutableVector mutableVector3 = null;
                            while (nodeKN != null) {
                                if (nodeKN instanceof FocusTargetNode) {
                                    mutableVector.rl((FocusTargetNode) nodeKN);
                                } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodeKN = delegate;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeKN != null) {
                                                    mutableVector3.rl(nodeKN);
                                                    nodeKN = null;
                                                }
                                                mutableVector3.rl(delegate);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodeKN = DelegatableNodeKt.KN(mutableVector3);
                            }
                        } else {
                            nodeKN = nodeKN.getChild();
                        }
                    }
                }
            }
            mutableVector.aYN(FocusableChildrenComparator.f31362n);
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (FocusDirection.qie(i2, companion.O())) {
                IntRange intRangeUntil = RangesKt.until(0, mutableVector.getSize());
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first <= last) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.content[first];
                            if (FocusTraversalKt.Uo(focusTargetNode3) && t(focusTargetNode3, function1)) {
                                return true;
                            }
                        }
                        if (Intrinsics.areEqual(mutableVector.content[first], focusTargetNode2)) {
                            z2 = true;
                        }
                        if (first == last) {
                            break;
                        }
                        first++;
                    }
                }
            } else if (FocusDirection.qie(i2, companion.J2())) {
                IntRange intRangeUntil2 = RangesKt.until(0, mutableVector.getSize());
                int first2 = intRangeUntil2.getFirst();
                int last2 = intRangeUntil2.getLast();
                if (first2 <= last2) {
                    boolean z3 = false;
                    while (true) {
                        if (z3) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.content[last2];
                            if (FocusTraversalKt.Uo(focusTargetNode4) && rl(focusTargetNode4, function1)) {
                                return true;
                            }
                        }
                        if (Intrinsics.areEqual(mutableVector.content[last2], focusTargetNode2)) {
                            z3 = true;
                        }
                        if (last2 == first2) {
                            break;
                        }
                        last2--;
                    }
                }
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            if (FocusDirection.qie(i2, FocusDirection.INSTANCE.O()) || !focusTargetNode.ni().getCanFocus() || O(focusTargetNode)) {
                return false;
            }
            return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }
}
