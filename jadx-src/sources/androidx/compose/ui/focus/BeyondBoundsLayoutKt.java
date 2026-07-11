package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\b\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "block", c.f62177j, "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,59:1\n119#2:60\n277#3:61\n247#3,5:62\n90#3:67\n91#3,8:73\n437#3,5:81\n278#3:86\n442#3:87\n447#3,2:89\n449#3,8:94\n457#3,9:105\n466#3,8:117\n100#3,7:125\n280#3:132\n56#4,5:68\n246#5:88\n240#6,3:91\n243#6,3:114\n1101#7:102\n1083#7,2:103\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:60\n39#1:61\n39#1:62,5\n39#1:67\n39#1:73,8\n39#1:81,5\n39#1:86\n39#1:87\n39#1:89,2\n39#1:94,8\n39#1:105,9\n39#1:117,8\n39#1:125,7\n39#1:132\n39#1:68,5\n39#1:88\n39#1:91,3\n39#1:114,3\n39#1:102\n39#1:103,2\n*E\n"})
public final class BeyondBoundsLayoutKt {
    public static final Object n(FocusTargetNode focusTargetNode, int i2, Function1 function1) {
        Modifier.Node nodeKN;
        BeyondBoundsLayout beyondBoundsLayoutGT;
        int iT;
        NodeChain nodes;
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNode);
        loop0: while (true) {
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
            parent = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN;
        if ((focusTargetNode2 != null && Intrinsics.areEqual(focusTargetNode2.GT(), focusTargetNode.GT())) || (beyondBoundsLayoutGT = focusTargetNode.GT()) == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.KN())) {
            iT = BeyondBoundsLayout.LayoutDirection.INSTANCE.n();
        } else if (FocusDirection.qie(i2, companion.n())) {
            iT = BeyondBoundsLayout.LayoutDirection.INSTANCE.nr();
        } else if (FocusDirection.qie(i2, companion.nr())) {
            iT = BeyondBoundsLayout.LayoutDirection.INSTANCE.O();
        } else if (FocusDirection.qie(i2, companion.Uo())) {
            iT = BeyondBoundsLayout.LayoutDirection.INSTANCE.J2();
        } else if (FocusDirection.qie(i2, companion.O())) {
            iT = BeyondBoundsLayout.LayoutDirection.INSTANCE.rl();
        } else {
            if (!FocusDirection.qie(i2, companion.J2())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iT = BeyondBoundsLayout.LayoutDirection.INSTANCE.t();
        }
        return beyondBoundsLayoutGT.G7(iT, function1);
    }
}
