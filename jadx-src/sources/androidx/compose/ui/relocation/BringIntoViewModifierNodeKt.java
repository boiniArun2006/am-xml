package androidx.compose.ui.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntSizeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "", c.f62177j, "(Landroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBringIntoViewModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewModifierNode.kt\nandroidx/compose/ui/relocation/BringIntoViewModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,75:1\n151#2:76\n277#3:77\n247#3,5:78\n90#3:83\n91#3,8:89\n437#3,5:97\n278#3:102\n442#3:103\n447#3,2:105\n449#3,8:110\n457#3,9:121\n466#3,8:133\n100#3,7:141\n280#3:148\n56#4,5:84\n246#5:104\n240#6,3:107\n243#6,3:130\n1101#7:118\n1083#7,2:119\n*S KotlinDebug\n*F\n+ 1 BringIntoViewModifierNode.kt\nandroidx/compose/ui/relocation/BringIntoViewModifierNodeKt\n*L\n64#1:76\n64#1:77\n64#1:78,5\n64#1:83\n64#1:89,8\n64#1:97,5\n64#1:102\n64#1:103\n64#1:105,2\n64#1:110,8\n64#1:121,9\n64#1:133,8\n64#1:141,7\n64#1:148\n64#1:84,5\n64#1:104\n64#1:107,3\n64#1:130,3\n64#1:118\n64#1:119,2\n*E\n"})
public final class BringIntoViewModifierNodeKt {
    public static /* synthetic */ Object rl(DelegatableNode delegatableNode, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        return n(delegatableNode, function0, continuation);
    }

    public static final Object n(DelegatableNode delegatableNode, final Function0 function0, Continuation continuation) {
        Object obj;
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            return Unit.INSTANCE;
        }
        int iN = NodeKind.n(524288);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(delegatableNode);
        loop0: while (true) {
            obj = null;
            if (layoutNodeHI == null) {
                break;
            }
            if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iN) != 0) {
                        Modifier.Node nodeKN = parent;
                        MutableVector mutableVector = null;
                        while (nodeKN != null) {
                            if (nodeKN instanceof BringIntoViewModifierNode) {
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
                                                Boxing.boxBoolean(mutableVector.rl(nodeKN));
                                                nodeKN = null;
                                            }
                                            Boxing.boxBoolean(mutableVector.rl(delegate));
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
            if (layoutNodeHI != null && (nodes = layoutNodeHI.getNodes()) != null) {
                parent = nodes.getTail();
            } else {
                parent = null;
            }
        }
        BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
        if (bringIntoViewModifierNode == null) {
            return Unit.INSTANCE;
        }
        final LayoutCoordinates layoutCoordinatesAz = DelegatableNodeKt.az(delegatableNode);
        Object objW = bringIntoViewModifierNode.W(layoutCoordinatesAz, new Function0<Rect>() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Rect invoke() {
                Rect rect;
                Function0 function02 = function0;
                if (function02 != null && (rect = (Rect) function02.invoke()) != null) {
                    return rect;
                }
                LayoutCoordinates layoutCoordinates = layoutCoordinatesAz;
                if (!layoutCoordinates.nr()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return SizeKt.t(IntSizeKt.O(layoutCoordinates.n()));
                }
                return null;
            }
        }, continuation);
        if (objW == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objW;
        }
        return Unit.INSTANCE;
    }
}
