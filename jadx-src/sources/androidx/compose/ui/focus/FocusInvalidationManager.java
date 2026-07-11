package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0013J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R\u0016\u00102\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00101¨\u00063"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "invalidateOwnerFocusState", "Landroidx/compose/ui/focus/FocusState;", "rootFocusStateFetcher", "Landroidx/compose/ui/focus/FocusTargetNode;", "activeFocusTargetNodeFetcher", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/collection/MutableScatterSet;", "node", "J2", "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V", "qie", "()V", "", "gh", "(Ljava/util/List;Ljava/lang/Object;)V", "t", "O", "nr", "xMQ", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Uo", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "KN", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "mUb", "", "rl", "()Z", c.f62177j, "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Landroidx/collection/MutableScatterSet;", "focusTargetNodes", "focusEventNodes", "Ljava/util/List;", "focusTargetNodesLegacy", "focusEventNodesLegacy", "focusPropertiesNodesLegacy", "focusTargetsWithInvalidatedFocusEventsLegacy", "Z", "isInvalidationScheduled", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 12 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n231#2,3:276\n200#2,7:279\n211#2,3:287\n214#2,9:291\n234#2:300\n231#2,3:334\n200#2,7:337\n211#2,3:345\n214#2,9:349\n234#2:358\n1399#3:286\n1270#3:290\n1399#3:344\n1270#3:348\n119#4,9:301\n119#4:325\n119#4:375\n119#4:497\n55#5:310\n90#6:311\n91#6,8:317\n100#6,7:327\n289#6,6:376\n437#6,6:382\n447#6,2:389\n449#6,8:394\n457#6,9:405\n466#6,8:417\n295#6:425\n148#6:426\n149#6,4:432\n153#6:437\n154#6,9:439\n437#6,37:448\n163#6,6:485\n296#6:491\n289#6,6:498\n437#6,6:504\n447#6,2:511\n449#6,8:516\n457#6,9:527\n466#6,8:539\n295#6:547\n148#6:548\n149#6,4:554\n153#6:559\n154#6,9:561\n437#6,37:570\n163#6,6:607\n296#6:613\n56#7,5:312\n56#7,5:427\n56#7,5:549\n56#7,5:621\n56#7,5:626\n56#7,5:631\n246#8:326\n246#8:388\n246#8:510\n34#9,6:359\n34#9,6:365\n34#9,4:371\n39#9:492\n34#9,4:493\n39#9:614\n34#9,6:615\n240#10,3:391\n243#10,3:414\n240#10,3:513\n243#10,3:536\n1101#11:402\n1083#11,2:403\n1101#11:524\n1083#11,2:525\n519#12:436\n44#12:438\n519#12:558\n44#12:560\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n124#1:276,3\n124#1:279,7\n124#1:287,3\n124#1:291,9\n124#1:300\n161#1:334,3\n161#1:337,7\n161#1:345,3\n161#1:349,9\n161#1:358\n124#1:286\n124#1:290\n161#1:344\n161#1:348\n133#1:301,9\n139#1:325\n193#1:375\n214#1:497\n133#1:310\n132#1:311\n132#1:317,8\n132#1:327,7\n193#1:376,6\n193#1:382,6\n193#1:389,2\n193#1:394,8\n193#1:405,9\n193#1:417,8\n193#1:425\n193#1:426\n193#1:432,4\n193#1:437\n193#1:439,9\n193#1:448,37\n193#1:485,6\n193#1:491\n214#1:498,6\n214#1:504,6\n214#1:511,2\n214#1:516,8\n214#1:527,9\n214#1:539,8\n214#1:547\n214#1:548\n214#1:554,4\n214#1:559\n214#1:561,9\n214#1:570,37\n214#1:607,6\n214#1:613\n132#1:312,5\n193#1:427,5\n214#1:549,5\n268#1:621,5\n271#1:626,5\n272#1:631,5\n139#1:326\n193#1:388\n214#1:510\n173#1:359,6\n174#1:365,6\n188#1:371,4\n188#1:492\n200#1:493,4\n200#1:614\n248#1:615,6\n193#1:391,3\n193#1:414,3\n214#1:513,3\n214#1:536,3\n193#1:402\n193#1:403,2\n214#1:524\n214#1:525,2\n193#1:436\n193#1:438\n214#1:558\n214#1:560\n*E\n"})
public final class FocusInvalidationManager {

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private boolean isInvalidationScheduled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 onRequestApplyChangesListener;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function0 activeFocusTargetNodeFetcher;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 invalidateOwnerFocusState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 rootFocusStateFetcher;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterSet focusTargetNodes = ScatterSetKt.n();

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableScatterSet focusEventNodes = ScatterSetKt.n();

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final List focusTargetNodesLegacy = new ArrayList();

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final List focusEventNodesLegacy = new ArrayList();

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final List focusPropertiesNodesLegacy = new ArrayList();

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final List focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void O() {
        NodeChain nodes;
        long j2;
        long j3;
        FocusTargetNode focusTargetNode = (FocusTargetNode) this.activeFocusTargetNodeFetcher.invoke();
        long j4 = 255;
        if (focusTargetNode == null) {
            MutableScatterSet mutableScatterSet = this.focusEventNodes;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j5 = jArr[i2];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i3) {
                            if ((j5 & j4) < 128) {
                                j3 = j4;
                                ((FocusEventModifierNode) objArr[(i2 << 3) + i5]).B(FocusStateImpl.J2);
                            } else {
                                j3 = j4;
                            }
                            j5 >>= 8;
                            i5++;
                            j4 = j3;
                        }
                        j2 = j4;
                        if (i3 != 8) {
                            break;
                        }
                    } else {
                        j2 = j4;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    j4 = j2;
                }
            }
        } else if (focusTargetNode.getIsAttached()) {
            if (this.focusTargetNodes.rl(focusTargetNode)) {
                focusTargetNode.i7();
            }
            FocusStateImpl focusStateImplIjL = focusTargetNode.ijL();
            int iN = NodeKind.n(1024) | NodeKind.n(4096);
            if (!focusTargetNode.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNode.getNode();
            LayoutNode layoutNodeHI = DelegatableNodeKt.HI(focusTargetNode);
            int i7 = 0;
            while (layoutNodeHI != null) {
                if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iN) != 0) {
                            if ((NodeKind.n(1024) & node.getKindSet()) != 0) {
                                i7++;
                            }
                            if ((node instanceof FocusEventModifierNode) && this.focusEventNodes.rl(node)) {
                                if (i7 <= 1) {
                                    ((FocusEventModifierNode) node).B(focusStateImplIjL);
                                } else {
                                    ((FocusEventModifierNode) node).B(FocusStateImpl.f31349t);
                                }
                                this.focusEventNodes.nY(node);
                            }
                        }
                        node = node.getParent();
                    }
                }
                layoutNodeHI = layoutNodeHI.mYa();
                node = (layoutNodeHI == null || (nodes = layoutNodeHI.getNodes()) == null) ? null : nodes.getTail();
            }
            MutableScatterSet mutableScatterSet2 = this.focusEventNodes;
            Object[] objArr2 = mutableScatterSet2.elements;
            long[] jArr2 = mutableScatterSet2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i8 = 0;
                while (true) {
                    long j6 = jArr2[i8];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j6 & 255) < 128) {
                                ((FocusEventModifierNode) objArr2[(i8 << 3) + i10]).B(FocusStateImpl.J2);
                            }
                            j6 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        } else if (i8 == length2) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            }
        }
        this.invalidateOwnerFocusState.invoke();
        this.focusTargetNodes.ty();
        this.focusEventNodes.ty();
        this.isInvalidationScheduled = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [int] */
    /* JADX WARN: Type inference failed for: r8v24 */
    private final void nr() {
        int i2;
        int i3;
        boolean z2;
        ?? r7;
        boolean z3;
        FocusState focusStateIjL;
        boolean z4;
        ?? r73;
        ?? r74;
        ?? r16;
        ?? r15;
        ?? r2 = 0;
        if (!((FocusState) this.rootFocusStateFetcher.invoke()).rl()) {
            List list = this.focusEventNodesLegacy;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((FocusEventModifierNode) list.get(i5)).B(FocusStateImpl.J2);
            }
            List list2 = this.focusTargetNodesLegacy;
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) list2.get(i7);
                if (focusTargetNode.getIsAttached() && !focusTargetNode.VK2()) {
                    focusTargetNode.kC(FocusStateImpl.J2);
                }
            }
            this.focusTargetNodesLegacy.clear();
            this.focusEventNodesLegacy.clear();
            this.focusPropertiesNodesLegacy.clear();
            this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
            this.invalidateOwnerFocusState.invoke();
            return;
        }
        List list3 = this.focusPropertiesNodesLegacy;
        int size3 = list3.size();
        int i8 = 0;
        while (true) {
            i2 = 1024;
            i3 = 16;
            z2 = true;
            if (i8 >= size3) {
                break;
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) list3.get(i8);
            if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                int iN = NodeKind.n(1024);
                Modifier.Node node = focusPropertiesModifierNode.getNode();
                MutableVector mutableVector = null;
                while (node != null) {
                    if (node instanceof FocusTargetNode) {
                        this.focusTargetNodesLegacy.add((FocusTargetNode) node);
                    } else if ((node.getKindSet() & iN) != 0 && (node instanceof DelegatingNode)) {
                        int i9 = 0;
                        for (Modifier.Node delegate = ((DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & iN) != 0) {
                                i9++;
                                if (i9 == 1) {
                                    node = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        mutableVector.rl(node);
                                        node = null;
                                    }
                                    mutableVector.rl(delegate);
                                }
                            }
                        }
                        if (i9 == 1) {
                        }
                    }
                    node = DelegatableNodeKt.KN(mutableVector);
                }
                if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.t("visitChildren called on an unattached node");
                }
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
                if (child == null) {
                    DelegatableNodeKt.t(mutableVector2, focusPropertiesModifierNode.getNode(), false);
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
                                        this.focusTargetNodesLegacy.add((FocusTargetNode) nodeKN);
                                    } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                        int i10 = 0;
                                        for (Modifier.Node delegate2 = ((DelegatingNode) nodeKN).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iN) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    nodeKN = delegate2;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeKN != null) {
                                                        mutableVector3.rl(nodeKN);
                                                        nodeKN = null;
                                                    }
                                                    mutableVector3.rl(delegate2);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
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
            }
            i8++;
        }
        this.focusPropertiesNodesLegacy.clear();
        List list4 = this.focusEventNodesLegacy;
        int size4 = list4.size();
        int i11 = 0;
        while (i11 < size4) {
            FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) list4.get(i11);
            if (focusEventModifierNode.getNode().getIsAttached()) {
                int iN2 = NodeKind.n(i2);
                Modifier.Node node2 = focusEventModifierNode.getNode();
                ?? r162 = r2;
                ?? r152 = z2;
                FocusTargetNode focusTargetNode2 = null;
                MutableVector mutableVector4 = null;
                while (node2 != null) {
                    if (node2 instanceof FocusTargetNode) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                        r162 = r162;
                        if (focusTargetNode2 != null) {
                            r162 = z2;
                        }
                        r152 = r152;
                        if (this.focusTargetNodesLegacy.contains(focusTargetNode3)) {
                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode3);
                            r152 = r2;
                        }
                        focusTargetNode2 = focusTargetNode3;
                    } else if ((node2.getKindSet() & iN2) != 0 && (node2 instanceof DelegatingNode)) {
                        Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate();
                        ?? r8 = r2;
                        while (delegate3 != null) {
                            if ((delegate3.getKindSet() & iN2) != 0) {
                                r8++;
                                if (r8 == z2) {
                                    node2 = delegate3;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[i3], r2);
                                    }
                                    if (node2 != null) {
                                        mutableVector4.rl(node2);
                                        node2 = null;
                                    }
                                    mutableVector4.rl(delegate3);
                                }
                            }
                            delegate3 = delegate3.getChild();
                            z2 = true;
                            r8 = r8;
                        }
                        boolean z5 = z2;
                        if (r8 == z5) {
                            z2 = z5;
                        }
                    }
                    node2 = DelegatableNodeKt.KN(mutableVector4);
                    z2 = true;
                }
                if (!focusEventModifierNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.t("visitChildren called on an unattached node");
                }
                MutableVector mutableVector5 = new MutableVector(new Modifier.Node[i3], r2);
                Modifier.Node child2 = focusEventModifierNode.getNode().getChild();
                if (child2 == null) {
                    DelegatableNodeKt.t(mutableVector5, focusEventModifierNode.getNode(), r2);
                } else {
                    mutableVector5.rl(child2);
                }
                while (mutableVector5.getSize() != 0) {
                    Modifier.Node nodeKN2 = (Modifier.Node) mutableVector5.r(mutableVector5.getSize() - 1);
                    r2 = r2;
                    if ((nodeKN2.getAggregateChildKindSet() & iN2) == 0) {
                        DelegatableNodeKt.t(mutableVector5, nodeKN2, r2);
                    } else {
                        while (nodeKN2 != null) {
                            if ((nodeKN2.getKindSet() & iN2) != 0) {
                                MutableVector mutableVector6 = null;
                                r2 = r2;
                                r152 = r152;
                                r162 = r162;
                                while (nodeKN2 != null) {
                                    if (nodeKN2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) nodeKN2;
                                        ?? r163 = r162;
                                        if (focusTargetNode2 != null) {
                                            r163 = 1;
                                        }
                                        ?? r153 = r152;
                                        if (this.focusTargetNodesLegacy.contains(focusTargetNode4)) {
                                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode4);
                                            r153 = r2 == true ? 1 : 0;
                                        }
                                        z4 = r2 == true ? 1 : 0;
                                        focusTargetNode2 = focusTargetNode4;
                                        r15 = r153;
                                        r16 = r163;
                                    } else if ((nodeKN2.getKindSet() & iN2) == 0 || !(nodeKN2 instanceof DelegatingNode)) {
                                        z4 = r2 == true ? 1 : 0;
                                        r15 = r152;
                                        r16 = r162;
                                    } else {
                                        Modifier.Node delegate4 = ((DelegatingNode) nodeKN2).getDelegate();
                                        int i12 = r2 == true ? 1 : 0;
                                        ?? r22 = r2;
                                        while (delegate4 != null) {
                                            if ((delegate4.getKindSet() & iN2) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    nodeKN2 = delegate4;
                                                    r74 = 0;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        Modifier.Node[] nodeArr = new Modifier.Node[i3];
                                                        r74 = 0;
                                                        mutableVector6 = new MutableVector(nodeArr, 0);
                                                    } else {
                                                        r74 = 0;
                                                    }
                                                    if (nodeKN2 != null) {
                                                        mutableVector6.rl(nodeKN2);
                                                        nodeKN2 = null;
                                                    }
                                                    mutableVector6.rl(delegate4);
                                                }
                                            } else {
                                                r74 = r22;
                                            }
                                            delegate4 = delegate4.getChild();
                                            r22 = r74;
                                            i3 = 16;
                                        }
                                        r73 = r22;
                                        r73 = r73;
                                        r152 = r152;
                                        r162 = r162;
                                        if (i12 != 1) {
                                            nodeKN2 = DelegatableNodeKt.KN(mutableVector6);
                                        }
                                        r2 = r73;
                                        i3 = 16;
                                        r152 = r152;
                                        r162 = r162;
                                    }
                                    r73 = z4;
                                    r152 = r15;
                                    r162 = r16;
                                    nodeKN2 = DelegatableNodeKt.KN(mutableVector6);
                                    r2 = r73;
                                    i3 = 16;
                                    r152 = r152;
                                    r162 = r162;
                                }
                                boolean z6 = r2 == true ? 1 : 0;
                                i3 = 16;
                            } else {
                                boolean z7 = r2 == true ? 1 : 0;
                                nodeKN2 = nodeKN2.getChild();
                                r2 = z7 ? 1 : 0;
                                i3 = 16;
                            }
                        }
                    }
                    r2 = r2 == true ? 1 : 0;
                    i3 = 16;
                }
                r7 = r2 == true ? 1 : 0;
                z3 = true;
                if (r152 != 0) {
                    if (r162 != 0) {
                        focusStateIjL = FocusEventModifierNodeKt.n(focusEventModifierNode);
                    } else if (focusTargetNode2 == null || (focusStateIjL = focusTargetNode2.ijL()) == null) {
                        focusStateIjL = FocusStateImpl.J2;
                    }
                    focusEventModifierNode.B(focusStateIjL);
                }
            } else {
                focusEventModifierNode.B(FocusStateImpl.J2);
                r7 = r2;
                z3 = z2;
            }
            i11++;
            z2 = z3;
            r2 = r7;
            i2 = 1024;
            i3 = 16;
        }
        this.focusEventNodesLegacy.clear();
        ?? r12 = this.focusTargetNodesLegacy;
        int size5 = r12.size();
        for (?? r75 = r2; r75 < size5; r75++) {
            FocusTargetNode focusTargetNode5 = (FocusTargetNode) r12.get(r75);
            if (focusTargetNode5.getIsAttached()) {
                FocusStateImpl focusStateImplIjL = focusTargetNode5.ijL();
                focusTargetNode5.i7();
                if (focusStateImplIjL != focusTargetNode5.ijL() || this.focusTargetsWithInvalidatedFocusEventsLegacy.contains(focusTargetNode5)) {
                    focusTargetNode5.W1c();
                }
            }
        }
        this.focusTargetNodesLegacy.clear();
        this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodesLegacy.isEmpty()) {
            InlineClassHelperKt.t("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodesLegacy.isEmpty()) {
            InlineClassHelperKt.t("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodesLegacy.isEmpty()) {
            return;
        }
        InlineClassHelperKt.t("Unprocessed FocusTarget nodes");
    }

    private final void qie() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.onRequestApplyChangesListener.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(this));
        this.isInvalidationScheduled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            O();
        } else {
            nr();
        }
    }

    public final void KN(FocusPropertiesModifierNode node) {
        gh(this.focusPropertiesNodesLegacy, node);
    }

    public final void Uo(FocusEventModifierNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            J2(this.focusEventNodes, node);
        } else {
            gh(this.focusEventNodesLegacy, node);
        }
    }

    public final boolean rl() {
        return ComposeUiFlags.isTrackFocusEnabled ? this.isInvalidationScheduled : (this.focusTargetNodesLegacy.isEmpty() && this.focusPropertiesNodesLegacy.isEmpty() && this.focusEventNodesLegacy.isEmpty()) ? false : true;
    }

    public final void xMQ(FocusTargetNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            J2(this.focusTargetNodes, node);
        } else {
            gh(this.focusTargetNodesLegacy, node);
        }
    }

    public FocusInvalidationManager(Function1 function1, Function0 function0, Function0 function02, Function0 function03) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
        this.rootFocusStateFetcher = function02;
        this.activeFocusTargetNodeFetcher = function03;
    }

    private final void J2(MutableScatterSet mutableScatterSet, Object obj) {
        if (mutableScatterSet.xMQ(obj)) {
            qie();
        }
    }

    private final void gh(List list, Object obj) {
        if (list.add(obj) && this.focusTargetNodesLegacy.size() + this.focusEventNodesLegacy.size() + this.focusPropertiesNodesLegacy.size() == 1) {
            this.onRequestApplyChangesListener.invoke(new FocusInvalidationManager$scheduleInvalidationLegacy$1(this));
        }
    }

    public final void mUb() {
        qie();
    }
}
