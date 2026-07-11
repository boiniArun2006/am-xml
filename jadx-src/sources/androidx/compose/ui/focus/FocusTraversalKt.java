package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", c.f62177j, "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "O", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "nr", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;", "rl", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "t", "Uo", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "J2", "activeChild", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,206:1\n1#2:207\n119#3:208\n119#3:285\n119#3:362\n283#4,5:209\n148#4:214\n149#4:220\n150#4,3:224\n153#4:228\n154#4,9:230\n437#4,6:239\n447#4,2:246\n449#4,17:251\n466#4,8:271\n163#4,6:279\n283#4,5:286\n148#4:291\n149#4:297\n150#4,3:301\n153#4:305\n154#4,9:307\n437#4,6:316\n447#4,2:323\n449#4,17:328\n466#4,8:348\n163#4,6:356\n247#4,5:363\n90#4:368\n91#4,8:374\n437#4,6:382\n447#4,2:389\n449#4,8:394\n457#4,9:405\n466#4,8:417\n100#4,7:425\n56#5,5:215\n56#5,5:292\n56#5,5:369\n1101#6:221\n1083#6,2:222\n1101#6:298\n1083#6,2:299\n1101#6:402\n1083#6,2:403\n519#7:227\n44#7:229\n519#7:304\n44#7:306\n246#8:245\n246#8:322\n246#8:388\n240#9,3:248\n243#9,3:268\n240#9,3:325\n243#9,3:345\n240#9,3:391\n243#9,3:414\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n168#1:208\n189#1:285\n203#1:362\n168#1:209,5\n168#1:214\n168#1:220\n168#1:224,3\n168#1:228\n168#1:230,9\n168#1:239,6\n168#1:246,2\n168#1:251,17\n168#1:271,8\n168#1:279,6\n189#1:286,5\n189#1:291\n189#1:297\n189#1:301,3\n189#1:305\n189#1:307,9\n189#1:316,6\n189#1:323,2\n189#1:328,17\n189#1:348,8\n189#1:356,6\n203#1:363,5\n203#1:368\n203#1:374,8\n203#1:382,6\n203#1:389,2\n203#1:394,8\n203#1:405,9\n203#1:417,8\n203#1:425,7\n168#1:215,5\n189#1:292,5\n203#1:369,5\n168#1:221\n168#1:222,2\n189#1:298\n189#1:299,2\n203#1:402\n203#1:403,2\n168#1:227\n168#1:229\n189#1:304\n189#1:306\n168#1:245\n189#1:322\n203#1:388\n168#1:248,3\n168#1:268,3\n189#1:325,3\n189#1:345,3\n203#1:391,3\n203#1:414,3\n*E\n"})
public final class FocusTraversalKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.f34160n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.f34161t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.f31346n.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.f31349t.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.f31345O.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Boolean O(FocusTargetNode focusTargetNode, int i2, LayoutDirection layoutDirection, Rect rect, Function1 function1) {
        int iUo;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.O()) ? true : FocusDirection.qie(i2, companion.J2())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.J2(focusTargetNode, i2, function1));
        }
        if (FocusDirection.qie(i2, companion.nr()) ? true : FocusDirection.qie(i2, companion.Uo()) ? true : FocusDirection.qie(i2, companion.KN()) ? true : FocusDirection.qie(i2, companion.n())) {
            return TwoDimensionalFocusSearchKt.Z(focusTargetNode, i2, rect, function1);
        }
        if (!FocusDirection.qie(i2, companion.rl())) {
            if (FocusDirection.qie(i2, companion.t())) {
                FocusTargetNode focusTargetNodeRl = rl(focusTargetNode);
                FocusTargetNode focusTargetNodeT = focusTargetNodeRl != null ? t(focusTargetNodeRl) : null;
                return Boolean.valueOf((focusTargetNodeT == null || Intrinsics.areEqual(focusTargetNodeT, focusTargetNode)) ? false : ((Boolean) function1.invoke(focusTargetNodeT)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.ty(i2))).toString());
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            iUo = companion.Uo();
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iUo = companion.nr();
        }
        FocusTargetNode focusTargetNodeRl2 = rl(focusTargetNode);
        if (focusTargetNodeRl2 != null) {
            return TwoDimensionalFocusSearchKt.Z(focusTargetNodeRl2, iUo, rect, function1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x006e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode rl(FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            FocusTargetNode focusTargetNodeJ2 = DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
            if (focusTargetNodeJ2 == null || !focusTargetNodeJ2.getIsAttached()) {
                return null;
            }
            return focusTargetNodeJ2;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.ijL().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                int iN = NodeKind.n(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.t("visitChildren called on an unattached node");
                }
                MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child = focusTargetNode.getNode().getChild();
                if (child == null) {
                    DelegatableNodeKt.t(mutableVector, focusTargetNode.getNode(), false);
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
                                        FocusTargetNode focusTargetNodeRl = rl((FocusTargetNode) nodeKN);
                                        if (focusTargetNodeRl != null) {
                                            return focusTargetNodeRl;
                                        }
                                    } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & iN) != 0) {
                                                i3++;
                                                if (i3 == 1) {
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
                                        }
                                        if (i3 == 1) {
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
                return null;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetNode;
    }

    private static final FocusTargetNode t(FocusTargetNode focusTargetNode) {
        NodeChain nodes;
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNode);
        while (layoutNodeHI != null) {
            if ((layoutNodeHI.getNodes().getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iN) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iN) != 0) {
                        Modifier.Node nodeKN = parent;
                        MutableVector mutableVector = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN;
                                if (focusTargetNode2.ni().getCanFocus()) {
                                    return focusTargetNode2;
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
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeHI = layoutNodeHI.mYa();
            parent = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode J2(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getNode().getIsAttached()) {
            return null;
        }
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.t(mutableVector, focusTargetNode.getNode(), false);
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN;
                                if (focusTargetNode2.getNode().getIsAttached()) {
                                    int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.ijL().ordinal()];
                                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                                        return focusTargetNode2;
                                    }
                                }
                            } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iN) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                }
                                if (i3 == 1) {
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
        return null;
    }

    public static final boolean Uo(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator2 = focusTargetNode.getCoordinator();
        if (coordinator2 != null && (layoutNode = coordinator2.getLayoutNode()) != null && layoutNode.HI() && (coordinator = focusTargetNode.getCoordinator()) != null && (layoutNode2 = coordinator.getLayoutNode()) != null && layoutNode2.nr()) {
            return true;
        }
        return false;
    }

    public static final FocusRequester n(FocusTargetNode focusTargetNode, int i2, LayoutDirection layoutDirection) {
        int generation;
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        FocusProperties focusPropertiesNi = focusTargetNode.ni();
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.O())) {
            return focusPropertiesNi.getNext();
        }
        if (FocusDirection.qie(i2, companion.J2())) {
            return focusPropertiesNi.getPrevious();
        }
        if (FocusDirection.qie(i2, companion.KN())) {
            return focusPropertiesNi.getUp();
        }
        if (FocusDirection.qie(i2, companion.n())) {
            return focusPropertiesNi.getDown();
        }
        FocusRequester focusRequester3 = null;
        boolean zQie = true;
        if (FocusDirection.qie(i2, companion.nr())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    focusRequester2 = focusPropertiesNi.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                focusRequester2 = focusPropertiesNi.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String();
            }
            if (focusRequester2 != FocusRequester.INSTANCE.rl()) {
                focusRequester3 = focusRequester2;
            }
            if (focusRequester3 == null) {
                return focusPropertiesNi.getAndroidx.media3.extractor.text.ttml.TtmlNode.LEFT java.lang.String();
            }
            return focusRequester3;
        }
        if (FocusDirection.qie(i2, companion.Uo())) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    focusRequester = focusPropertiesNi.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                focusRequester = focusPropertiesNi.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String();
            }
            if (focusRequester != FocusRequester.INSTANCE.rl()) {
                focusRequester3 = focusRequester;
            }
            if (focusRequester3 == null) {
                return focusPropertiesNi.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
            }
            return focusRequester3;
        }
        if (!FocusDirection.qie(i2, companion.rl())) {
            zQie = FocusDirection.qie(i2, companion.t());
        }
        if (zQie) {
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, null);
            FocusTransactionManager focusTransactionManagerN = FocusTargetNodeKt.n(focusTargetNode);
            int generation2 = 0;
            if (focusTransactionManagerN != null) {
                generation = focusTransactionManagerN.getGeneration();
            } else {
                generation = 0;
            }
            FocusOwner focusOwner = DelegatableNodeKt.ck(focusTargetNode).getFocusOwner();
            FocusTargetNode focusTargetNodeJ2 = focusOwner.getActiveFocusTargetNode();
            if (FocusDirection.qie(i2, companion.rl())) {
                focusPropertiesNi.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            } else {
                focusPropertiesNi.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            }
            if (focusTransactionManagerN != null) {
                generation2 = focusTransactionManagerN.getGeneration();
            }
            if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                return FocusRequester.INSTANCE.n();
            }
            if (generation == generation2 && (!ComposeUiFlags.isTrackFocusEnabled || focusTargetNodeJ2 == focusOwner.getActiveFocusTargetNode())) {
                return FocusRequester.INSTANCE.rl();
            }
            return FocusRequester.INSTANCE.t();
        }
        throw new IllegalStateException("invalid FocusDirection");
    }

    public static final Rect nr(FocusTargetNode focusTargetNode) {
        Rect rectI;
        NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        if (coordinator != null && (rectI = LayoutCoordinatesKt.nr(coordinator).I(coordinator, false)) != null) {
            return rectI;
        }
        return Rect.INSTANCE.n();
    }
}
