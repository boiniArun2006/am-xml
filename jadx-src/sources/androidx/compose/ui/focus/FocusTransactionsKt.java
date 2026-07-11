package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u0003\u001a'\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001a\u001b\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001e\u0010\u0018\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001e\u0010\u0019\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "mUb", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "qie", "gh", "forced", "refreshFocusEvents", "t", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "O", c.f62177j, "childNode", "az", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ty", "HI", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/focus/CustomDestinationResult;", "xMQ", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "J2", "Uo", "KN", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,459:1\n1101#2:460\n1083#2,2:461\n1101#2:503\n1083#2,2:504\n1101#2:533\n1083#2,2:534\n1101#2:576\n1083#2,2:577\n1101#2:666\n1083#2,2:667\n1101#2:769\n1083#2,2:770\n1101#2:843\n1083#2,2:844\n1101#2:916\n1083#2,2:917\n119#3:463\n119#3:536\n119#3:624\n119#3:727\n119#3:801\n119#3:874\n247#4,5:464\n90#4:469\n91#4,8:475\n437#4,6:483\n447#4,2:490\n449#4,8:495\n457#4,9:506\n466#4,8:518\n100#4,7:526\n247#4,5:537\n90#4:542\n91#4,8:548\n437#4,6:556\n447#4,2:563\n449#4,8:568\n457#4,9:579\n466#4,8:591\n100#4,7:599\n277#4:625\n247#4,5:626\n90#4:631\n91#4,8:637\n437#4,5:645\n278#4:650\n442#4:651\n447#4,2:653\n449#4,8:658\n457#4,9:669\n466#4,8:681\n100#4,7:689\n280#4:696\n277#4:728\n247#4,5:729\n90#4:734\n91#4,8:740\n437#4,5:748\n278#4:753\n442#4:754\n447#4,2:756\n449#4,8:761\n457#4,9:772\n466#4,8:784\n100#4,7:792\n280#4:799\n277#4:802\n247#4,5:803\n90#4:808\n91#4,8:814\n437#4,5:822\n278#4:827\n442#4:828\n447#4,2:830\n449#4,8:835\n457#4,9:846\n466#4,8:858\n100#4,7:866\n280#4:873\n277#4:875\n247#4,5:876\n90#4:881\n91#4,8:887\n437#4,5:895\n278#4:900\n442#4:901\n447#4,2:903\n449#4,8:908\n457#4,9:919\n466#4,8:931\n100#4,7:939\n280#4:946\n56#5,5:470\n56#5,5:543\n56#5,5:632\n56#5,5:735\n56#5,5:809\n56#5,5:882\n246#6:489\n246#6:562\n246#6:652\n246#6:755\n246#6:829\n246#6:902\n240#7,3:492\n243#7,3:515\n240#7,3:565\n243#7,3:588\n240#7,3:655\n243#7,3:678\n240#7,3:758\n243#7,3:781\n240#7,3:832\n243#7,3:855\n240#7,3:905\n243#7,3:928\n447#8,9:606\n447#8,9:615\n641#8,2:706\n641#8,2:721\n48#9,8:697\n56#9,4:708\n48#9,8:712\n56#9,4:723\n1#10:705\n1#10:720\n1#10:800\n266#11,4:947\n232#11,11:951\n271#11:962\n244#11,7:963\n272#11,3:970\n290#11,4:973\n232#11,11:977\n295#11:988\n244#11,7:989\n296#11,3:996\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n74#1:460\n74#1:461,2\n75#1:503\n75#1:504,2\n82#1:533\n82#1:534,2\n83#1:576\n83#1:577,2\n155#1:666\n155#1:667,2\n346#1:769\n346#1:770,2\n362#1:843\n362#1:844,2\n415#1:916\n415#1:917,2\n75#1:463\n83#1:536\n155#1:624\n346#1:727\n362#1:801\n415#1:874\n75#1:464,5\n75#1:469\n75#1:475,8\n75#1:483,6\n75#1:490,2\n75#1:495,8\n75#1:506,9\n75#1:518,8\n75#1:526,7\n83#1:537,5\n83#1:542\n83#1:548,8\n83#1:556,6\n83#1:563,2\n83#1:568,8\n83#1:579,9\n83#1:591,8\n83#1:599,7\n155#1:625\n155#1:626,5\n155#1:631\n155#1:637,8\n155#1:645,5\n155#1:650\n155#1:651\n155#1:653,2\n155#1:658,8\n155#1:669,9\n155#1:681,8\n155#1:689,7\n155#1:696\n346#1:728\n346#1:729,5\n346#1:734\n346#1:740,8\n346#1:748,5\n346#1:753\n346#1:754\n346#1:756,2\n346#1:761,8\n346#1:772,9\n346#1:784,8\n346#1:792,7\n346#1:799\n362#1:802\n362#1:803,5\n362#1:808\n362#1:814,8\n362#1:822,5\n362#1:827\n362#1:828\n362#1:830,2\n362#1:835,8\n362#1:846,9\n362#1:858,8\n362#1:866,7\n362#1:873\n415#1:875\n415#1:876,5\n415#1:881\n415#1:887,8\n415#1:895,5\n415#1:900\n415#1:901\n415#1:903,2\n415#1:908,8\n415#1:919,9\n415#1:931,8\n415#1:939,7\n415#1:946\n75#1:470,5\n83#1:543,5\n155#1:632,5\n346#1:735,5\n362#1:809,5\n415#1:882,5\n75#1:489\n83#1:562\n155#1:652\n346#1:755\n362#1:829\n415#1:902\n75#1:492,3\n75#1:515,3\n83#1:565,3\n83#1:588,3\n155#1:655,3\n155#1:678,3\n346#1:758,3\n346#1:781,3\n362#1:832,3\n362#1:855,3\n415#1:905,3\n415#1:928,3\n101#1:606,9\n112#1:615,9\n200#1:706,2\n234#1:721,2\n200#1:697,8\n200#1:708,4\n234#1:712,8\n234#1:723,4\n200#1:705\n234#1:720\n443#1:947,4\n443#1:951,11\n443#1:962\n443#1:963,7\n443#1:970,3\n453#1:973,4\n453#1:977,11\n453#1:988\n453#1:989,7\n453#1:996,3\n*E\n"})
public final class FocusTransactionsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.f31346n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.f31345O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.f31349t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean O(final FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.n(focusTargetNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                focusTargetNode.ni();
            }
        });
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.ijL().ordinal()];
        if (i2 != 3 && i2 != 4) {
            return true;
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().r(focusTargetNode);
            return true;
        }
        focusTargetNode.R3E(FocusStateImpl.f31346n);
        return true;
    }

    private static final boolean az(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node nodeKN;
        NodeChain nodes;
        NodeChain nodes2;
        int iN = NodeKind.n(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode2.getNode().getParent();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (layoutNodeHI == null) {
                nodeKN = null;
                break;
            }
            if ((layoutNodeHI.getNodes().getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iN) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iN) != 0) {
                        nodeKN = parent;
                        MutableVector mutableVector = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof FocusTargetNode) {
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
            parent = (layoutNodeHI == null || (nodes2 = layoutNodeHI.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!Intrinsics.areEqual(nodeKN, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.ijL().ordinal()];
        if (i3 == 1) {
            boolean zO = O(focusTargetNode2);
            if (zO) {
                focusTargetNode.R3E(FocusStateImpl.f31349t);
            }
            return zO;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iN2 = NodeKind.n(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.t("visitAncestors called on an unattached node");
                }
                Modifier.Node parent2 = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeHI2 = DelegatableNodeKt.HI(focusTargetNode);
                loop4: while (true) {
                    if (layoutNodeHI2 == null) {
                        break;
                    }
                    if ((layoutNodeHI2.getNodes().getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iN2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iN2) != 0) {
                                Modifier.Node nodeKN2 = parent2;
                                MutableVector mutableVector2 = null;
                                while (nodeKN2 != null) {
                                    if (nodeKN2 instanceof FocusTargetNode) {
                                        node = nodeKN2;
                                        break loop4;
                                    }
                                    if ((nodeKN2.getKindSet() & iN2) != 0 && (nodeKN2 instanceof DelegatingNode)) {
                                        int i5 = 0;
                                        for (Modifier.Node delegate2 = ((DelegatingNode) nodeKN2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iN2) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    nodeKN2 = delegate2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeKN2 != null) {
                                                        mutableVector2.rl(nodeKN2);
                                                        nodeKN2 = null;
                                                    }
                                                    mutableVector2.rl(delegate2);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    nodeKN2 = DelegatableNodeKt.KN(mutableVector2);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    layoutNodeHI2 = layoutNodeHI2.mYa();
                    parent2 = (layoutNodeHI2 == null || (nodes = layoutNodeHI2.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                if (focusTargetNode3 == null && ty(focusTargetNode)) {
                    boolean zO2 = O(focusTargetNode2);
                    if (zO2) {
                        focusTargetNode.R3E(FocusStateImpl.f31349t);
                    }
                    return zO2;
                }
                if (focusTargetNode3 == null || !az(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zAz = az(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.ijL() != FocusStateImpl.f31349t) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zAz) {
                    focusTargetNode3.W1c();
                }
                return zAz;
            }
            HI(focusTargetNode);
            if (rl(focusTargetNode, false, false, 3, null) && O(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean mUb(FocusTargetNode focusTargetNode) {
        return ComposeUiFlags.isTrackFocusEnabled ? qie(focusTargetNode) : gh(focusTargetNode);
    }

    public static /* synthetic */ boolean nr(FocusTargetNode focusTargetNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return t(focusTargetNode, z2, z3);
    }

    private static final boolean qie(FocusTargetNode focusTargetNode) {
        MutableVector mutableVector;
        int i2;
        NodeChain nodes;
        NodeChain nodes2;
        FocusOwner focusOwner = DelegatableNodeKt.ck(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeJ2 = focusOwner.getActiveFocusTargetNode();
        FocusStateImpl focusStateImplIjL = focusTargetNode.ijL();
        int i3 = 1;
        if (focusTargetNodeJ2 == focusTargetNode) {
            focusTargetNode.pr(focusStateImplIjL, focusStateImplIjL);
            return true;
        }
        int i5 = 0;
        if (focusTargetNodeJ2 == null && !ty(focusTargetNode)) {
            return false;
        }
        int i7 = 1024;
        int i8 = 16;
        if (focusTargetNodeJ2 != null) {
            mutableVector = new MutableVector(new FocusTargetNode[16], 0);
            int iN = NodeKind.n(1024);
            if (!focusTargetNodeJ2.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = focusTargetNodeJ2.getNode().getParent();
            LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNodeJ2);
            while (layoutNodeHI != null) {
                if ((layoutNodeHI.getNodes().getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iN) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iN) != 0) {
                            Modifier.Node nodeKN = parent;
                            MutableVector mutableVector2 = null;
                            while (nodeKN != null) {
                                int i9 = i7;
                                if (nodeKN instanceof FocusTargetNode) {
                                    mutableVector.rl((FocusTargetNode) nodeKN);
                                } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate();
                                    int i10 = 0;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iN) != 0) {
                                            i10++;
                                            if (i10 == i3) {
                                                nodeKN = delegate;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeKN != null) {
                                                    mutableVector2.rl(nodeKN);
                                                    nodeKN = null;
                                                }
                                                mutableVector2.rl(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i3 = 1;
                                    }
                                    if (i10 == i3) {
                                        i7 = i9;
                                    }
                                }
                                nodeKN = DelegatableNodeKt.KN(mutableVector2);
                                i7 = i9;
                                i3 = 1;
                            }
                        }
                        parent = parent.getParent();
                        i7 = i7;
                        i3 = 1;
                    }
                }
                int i11 = i7;
                layoutNodeHI = layoutNodeHI.mYa();
                parent = (layoutNodeHI == null || (nodes2 = layoutNodeHI.getNodes()) == null) ? null : nodes2.getTail();
                i7 = i11;
                i3 = 1;
            }
        } else {
            mutableVector = null;
        }
        int i12 = i7;
        MutableVector mutableVector3 = new MutableVector(new FocusTargetNode[16], 0);
        int iN2 = NodeKind.n(i12);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node parent2 = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeHI2 = DelegatableNodeKt.HI(focusTargetNode);
        int i13 = 1;
        while (layoutNodeHI2 != null) {
            if ((layoutNodeHI2.getNodes().getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iN2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & iN2) != 0) {
                        Modifier.Node nodeKN2 = parent2;
                        MutableVector mutableVector4 = null;
                        while (nodeKN2 != null) {
                            if (nodeKN2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN2;
                                Boolean boolValueOf = mutableVector != null ? Boolean.valueOf(mutableVector.ck(focusTargetNode2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    mutableVector3.rl(focusTargetNode2);
                                }
                                if (focusTargetNode2 == focusTargetNodeJ2) {
                                    i13 = i5;
                                }
                            } else {
                                if ((nodeKN2.getKindSet() & iN2) != 0 && (nodeKN2 instanceof DelegatingNode)) {
                                    Modifier.Node delegate2 = ((DelegatingNode) nodeKN2).getDelegate();
                                    int i14 = i5;
                                    while (delegate2 != null) {
                                        if ((delegate2.getKindSet() & iN2) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                nodeKN2 = delegate2;
                                            } else {
                                                if (mutableVector4 == null) {
                                                    mutableVector4 = new MutableVector(new Modifier.Node[i8], 0);
                                                }
                                                if (nodeKN2 != null) {
                                                    mutableVector4.rl(nodeKN2);
                                                    nodeKN2 = null;
                                                }
                                                mutableVector4.rl(delegate2);
                                            }
                                        }
                                        delegate2 = delegate2.getChild();
                                        i8 = 16;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                i5 = 0;
                                i8 = 16;
                            }
                            nodeKN2 = DelegatableNodeKt.KN(mutableVector4);
                            i5 = 0;
                            i8 = 16;
                        }
                    }
                    parent2 = parent2.getParent();
                    i5 = 0;
                    i8 = 16;
                }
            }
            layoutNodeHI2 = layoutNodeHI2.mYa();
            parent2 = (layoutNodeHI2 == null || (nodes = layoutNodeHI2.getNodes()) == null) ? null : nodes.getTail();
            i5 = 0;
            i8 = 16;
        }
        if (i13 == 0 || focusTargetNodeJ2 == null) {
            i2 = 1;
        } else {
            i2 = 1;
            if (!nr(focusTargetNodeJ2, false, true, 1, null)) {
                return false;
            }
        }
        O(focusTargetNode);
        if (mutableVector != null) {
            int size = mutableVector.getSize() - i2;
            Object[] objArr = mutableVector.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[size];
                    if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.pr(FocusStateImpl.f31349t, FocusStateImpl.J2);
                    size--;
                }
            }
        }
        int size2 = mutableVector3.getSize() - 1;
        Object[] objArr2 = mutableVector3.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[size2];
                if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.pr(focusTargetNode4 == focusTargetNodeJ2 ? FocusStateImpl.f31346n : FocusStateImpl.J2, FocusStateImpl.f31349t);
                size2--;
            }
        }
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.pr(focusStateImplIjL, FocusStateImpl.f31346n);
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (!ComposeUiFlags.isViewFocusFixEnabled || DelegatableNodeKt.HI(focusTargetNode).FX() != null) {
            return true;
        }
        DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().XQ(FocusDirection.xMQ(FocusDirection.INSTANCE.O()), null);
        return true;
    }

    static /* synthetic */ boolean rl(FocusTargetNode focusTargetNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        return n(focusTargetNode, z2, z3);
    }

    private static final FocusTargetNode HI(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeJ2 = FocusTraversalKt.J2(focusTargetNode);
        if (focusTargetNodeJ2 != null) {
            return focusTargetNodeJ2;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    public static final CustomDestinationResult J2(FocusTargetNode focusTargetNode, int i2) {
        int i3 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.ijL().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    CustomDestinationResult customDestinationResultJ2 = J2(HI(focusTargetNode), i2);
                    if (customDestinationResultJ2 == CustomDestinationResult.f31286n) {
                        customDestinationResultJ2 = null;
                    }
                    if (customDestinationResultJ2 == null) {
                        return KN(focusTargetNode, i2);
                    }
                    return customDestinationResultJ2;
                }
            } else {
                return CustomDestinationResult.f31289t;
            }
        }
        return CustomDestinationResult.f31286n;
    }

    private static final CustomDestinationResult KN(FocusTargetNode focusTargetNode, int i2) {
        int generation;
        int generation2;
        CustomDestinationResult customDestinationResult;
        CustomDestinationResult customDestinationResult2;
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusProperties focusPropertiesNi = focusTargetNode.ni();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, null);
                FocusTransactionManager focusTransactionManagerN = FocusTargetNodeKt.n(focusTargetNode);
                if (focusTransactionManagerN != null) {
                    generation = focusTransactionManagerN.getGeneration();
                } else {
                    generation = 0;
                }
                FocusOwner focusOwner = DelegatableNodeKt.ck(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeJ2 = focusOwner.getActiveFocusTargetNode();
                focusPropertiesNi.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
                if (focusTransactionManagerN != null) {
                    generation2 = focusTransactionManagerN.getGeneration();
                } else {
                    generation2 = 0;
                }
                FocusTargetNode focusTargetNodeJ22 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.INSTANCE;
                    FocusRequester focusRequesterN = companion.n();
                    if (focusRequesterN == companion.n()) {
                        CustomDestinationResult customDestinationResult3 = CustomDestinationResult.f31289t;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult3;
                    }
                    if (focusRequesterN == companion.t()) {
                        CustomDestinationResult customDestinationResult4 = CustomDestinationResult.f31285O;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult4;
                    }
                    if (FocusRequester.KN(focusRequesterN, 0, 1, null)) {
                        customDestinationResult2 = CustomDestinationResult.f31285O;
                    } else {
                        customDestinationResult2 = CustomDestinationResult.J2;
                    }
                    focusTargetNode.isProcessingCustomExit = false;
                    return customDestinationResult2;
                }
                if (generation == generation2 && (!ComposeUiFlags.isTrackFocusEnabled || focusTargetNodeJ2 == focusTargetNodeJ22 || focusTargetNodeJ22 == null)) {
                    focusTargetNode.isProcessingCustomExit = false;
                } else {
                    FocusRequester.Companion companion2 = FocusRequester.INSTANCE;
                    FocusRequester focusRequesterT = companion2.t();
                    if (focusRequesterT == companion2.n()) {
                        CustomDestinationResult customDestinationResult5 = CustomDestinationResult.f31289t;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult5;
                    }
                    if (focusRequesterT == companion2.t()) {
                        CustomDestinationResult customDestinationResult6 = CustomDestinationResult.f31285O;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult6;
                    }
                    if (FocusRequester.KN(focusRequesterT, 0, 1, null)) {
                        customDestinationResult = CustomDestinationResult.f31285O;
                    } else {
                        customDestinationResult = CustomDestinationResult.J2;
                    }
                    focusTargetNode.isProcessingCustomExit = false;
                    return customDestinationResult;
                }
            } catch (Throwable th) {
                focusTargetNode.isProcessingCustomExit = false;
                throw th;
            }
        }
        return CustomDestinationResult.f31286n;
    }

    private static final CustomDestinationResult Uo(FocusTargetNode focusTargetNode, int i2) {
        int generation;
        int generation2;
        CustomDestinationResult customDestinationResult;
        CustomDestinationResult customDestinationResult2;
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusProperties focusPropertiesNi = focusTargetNode.ni();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, null);
                FocusTransactionManager focusTransactionManagerN = FocusTargetNodeKt.n(focusTargetNode);
                if (focusTransactionManagerN != null) {
                    generation = focusTransactionManagerN.getGeneration();
                } else {
                    generation = 0;
                }
                FocusOwner focusOwner = DelegatableNodeKt.ck(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeJ2 = focusOwner.getActiveFocusTargetNode();
                focusPropertiesNi.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
                if (focusTransactionManagerN != null) {
                    generation2 = focusTransactionManagerN.getGeneration();
                } else {
                    generation2 = 0;
                }
                FocusTargetNode focusTargetNodeJ22 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.INSTANCE;
                    FocusRequester focusRequesterN = companion.n();
                    if (focusRequesterN == companion.n()) {
                        CustomDestinationResult customDestinationResult3 = CustomDestinationResult.f31289t;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult3;
                    }
                    if (focusRequesterN == companion.t()) {
                        CustomDestinationResult customDestinationResult4 = CustomDestinationResult.f31285O;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult4;
                    }
                    if (FocusRequester.KN(focusRequesterN, 0, 1, null)) {
                        customDestinationResult2 = CustomDestinationResult.f31285O;
                    } else {
                        customDestinationResult2 = CustomDestinationResult.J2;
                    }
                    focusTargetNode.isProcessingCustomEnter = false;
                    return customDestinationResult2;
                }
                if (generation == generation2 && (!ComposeUiFlags.isTrackFocusEnabled || focusTargetNodeJ2 == focusTargetNodeJ22 || focusTargetNodeJ22 == null)) {
                    focusTargetNode.isProcessingCustomEnter = false;
                } else {
                    FocusRequester.Companion companion2 = FocusRequester.INSTANCE;
                    FocusRequester focusRequesterT = companion2.t();
                    if (focusRequesterT == companion2.n()) {
                        CustomDestinationResult customDestinationResult5 = CustomDestinationResult.f31289t;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult5;
                    }
                    if (focusRequesterT == companion2.t()) {
                        CustomDestinationResult customDestinationResult6 = CustomDestinationResult.f31285O;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult6;
                    }
                    if (FocusRequester.KN(focusRequesterT, 0, 1, null)) {
                        customDestinationResult = CustomDestinationResult.f31285O;
                    } else {
                        customDestinationResult = CustomDestinationResult.J2;
                    }
                    focusTargetNode.isProcessingCustomEnter = false;
                    return customDestinationResult;
                }
            } catch (Throwable th) {
                focusTargetNode.isProcessingCustomEnter = false;
                throw th;
            }
        }
        return CustomDestinationResult.f31286n;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean gh(FocusTargetNode focusTargetNode) {
        Modifier.Node nodeKN;
        NodeChain nodes;
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.ijL().ordinal()];
        boolean zAz = true;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    int iN = NodeKind.n(1024);
                    if (!focusTargetNode.getNode().getIsAttached()) {
                        InlineClassHelperKt.t("visitAncestors called on an unattached node");
                    }
                    Modifier.Node parent = focusTargetNode.getNode().getParent();
                    LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNode);
                    loop0: while (true) {
                        if (layoutNodeHI != null) {
                            if ((layoutNodeHI.getNodes().getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iN) != 0) {
                                while (parent != null) {
                                    if ((parent.getKindSet() & iN) != 0) {
                                        MutableVector mutableVector = null;
                                        nodeKN = parent;
                                        while (nodeKN != null) {
                                            if (nodeKN instanceof FocusTargetNode) {
                                                break loop0;
                                            }
                                            if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                                int i3 = 0;
                                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                                    if ((delegate.getKindSet() & iN) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
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
                                                if (i3 == 1) {
                                                }
                                            }
                                            nodeKN = DelegatableNodeKt.KN(mutableVector);
                                        }
                                    }
                                    parent = parent.getParent();
                                }
                            }
                            layoutNodeHI = layoutNodeHI.mYa();
                            if (layoutNodeHI != null && (nodes = layoutNodeHI.getNodes()) != null) {
                                parent = nodes.getTail();
                            } else {
                                parent = null;
                            }
                        } else {
                            nodeKN = null;
                            break;
                        }
                    }
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN;
                    if (focusTargetNode2 != null) {
                        FocusStateImpl focusStateImplIjL = focusTargetNode2.ijL();
                        zAz = az(focusTargetNode2, focusTargetNode);
                        if (zAz && focusStateImplIjL != focusTargetNode2.ijL()) {
                            focusTargetNode2.W1c();
                        }
                    } else if (!ty(focusTargetNode) || !O(focusTargetNode)) {
                        zAz = false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!rl(focusTargetNode, false, false, 3, null) || !O(focusTargetNode)) {
            }
        }
        if (zAz) {
            if (ComposeUiFlags.isViewFocusFixEnabled && DelegatableNodeKt.HI(focusTargetNode).FX() == null) {
                DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().XQ(FocusDirection.xMQ(FocusDirection.INSTANCE.O()), null);
            }
            focusTargetNode.W1c();
        }
        return zAz;
    }

    private static final boolean n(FocusTargetNode focusTargetNode, boolean z2, boolean z3) {
        FocusTargetNode focusTargetNodeJ2 = FocusTraversalKt.J2(focusTargetNode);
        if (focusTargetNodeJ2 != null) {
            return t(focusTargetNodeJ2, z2, z3);
        }
        return true;
    }

    public static final boolean t(FocusTargetNode focusTargetNode, boolean z2, boolean z3) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.ijL().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return true;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (n(focusTargetNode, z2, z3)) {
                    if (ComposeUiFlags.isTrackFocusEnabled) {
                        if (z3) {
                            focusTargetNode.pr(FocusStateImpl.f31349t, FocusStateImpl.J2);
                        }
                    } else {
                        focusTargetNode.R3E(FocusStateImpl.J2);
                        if (z3) {
                            focusTargetNode.W1c();
                        }
                    }
                    return true;
                }
                return false;
            }
            if (z2) {
                if (ComposeUiFlags.isTrackFocusEnabled) {
                    DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().r(null);
                    if (z3) {
                        focusTargetNode.pr(FocusStateImpl.f31345O, FocusStateImpl.J2);
                        return z2;
                    }
                } else {
                    focusTargetNode.R3E(FocusStateImpl.J2);
                    if (z3) {
                        focusTargetNode.W1c();
                    }
                }
            }
            return z2;
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().r(null);
            if (z3) {
                focusTargetNode.pr(FocusStateImpl.f31346n, FocusStateImpl.J2);
            }
        } else {
            focusTargetNode.R3E(FocusStateImpl.J2);
            if (z3) {
                focusTargetNode.W1c();
            }
        }
        return true;
    }

    private static final boolean ty(FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().XQ(null, null);
    }

    public static final CustomDestinationResult xMQ(FocusTargetNode focusTargetNode, int i2) {
        CustomDestinationResult customDestinationResult;
        Modifier.Node nodeKN;
        NodeChain nodes;
        int i3 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.ijL().ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    int iN = NodeKind.n(1024);
                    if (!focusTargetNode.getNode().getIsAttached()) {
                        InlineClassHelperKt.t("visitAncestors called on an unattached node");
                    }
                    Modifier.Node parent = focusTargetNode.getNode().getParent();
                    LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNode);
                    loop0: while (true) {
                        customDestinationResult = null;
                        if (layoutNodeHI != null) {
                            if ((layoutNodeHI.getNodes().getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iN) != 0) {
                                while (parent != null) {
                                    if ((parent.getKindSet() & iN) != 0) {
                                        nodeKN = parent;
                                        MutableVector mutableVector = null;
                                        while (nodeKN != null) {
                                            if (nodeKN instanceof FocusTargetNode) {
                                                break loop0;
                                            }
                                            if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                                int i5 = 0;
                                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                                    if ((delegate.getKindSet() & iN) != 0) {
                                                        i5++;
                                                        if (i5 == 1) {
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
                                                if (i5 == 1) {
                                                }
                                            }
                                            nodeKN = DelegatableNodeKt.KN(mutableVector);
                                        }
                                    }
                                    parent = parent.getParent();
                                }
                            }
                            layoutNodeHI = layoutNodeHI.mYa();
                            if (layoutNodeHI != null && (nodes = layoutNodeHI.getNodes()) != null) {
                                parent = nodes.getTail();
                            } else {
                                parent = null;
                            }
                        } else {
                            nodeKN = null;
                            break;
                        }
                    }
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN;
                    if (focusTargetNode2 == null) {
                        return CustomDestinationResult.f31286n;
                    }
                    int i7 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode2.ijL().ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 4) {
                                    CustomDestinationResult customDestinationResultXMQ = xMQ(focusTargetNode2, i2);
                                    if (customDestinationResultXMQ != CustomDestinationResult.f31286n) {
                                        customDestinationResult = customDestinationResultXMQ;
                                    }
                                    if (customDestinationResult == null) {
                                        return Uo(focusTargetNode2, i2);
                                    }
                                    return customDestinationResult;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            return xMQ(focusTargetNode2, i2);
                        }
                        return CustomDestinationResult.f31289t;
                    }
                    return Uo(focusTargetNode2, i2);
                }
                throw new NoWhenBranchMatchedException();
            }
            return J2(HI(focusTargetNode), i2);
        }
        return CustomDestinationResult.f31286n;
    }
}
