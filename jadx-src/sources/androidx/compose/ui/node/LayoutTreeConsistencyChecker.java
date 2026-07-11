package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "node", "", "t", "(Landroidx/compose/ui/node/LayoutNode;)Z", "rl", "", "J2", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "nr", "()Ljava/lang/String;", "", c.f62177j, "()V", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n34#2,6:155\n117#2,2:161\n34#2,6:163\n119#2:169\n102#2,2:170\n34#2,6:172\n104#2:178\n117#2,2:179\n34#2,6:181\n119#2:187\n34#2,6:188\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n45#1:155,6\n59#1:161,2\n59#1:163,6\n59#1:169\n86#1:170,2\n86#1:172,6\n86#1:178\n93#1:179,2\n93#1:181,6\n93#1:187\n147#1:188,6\n*E\n"})
public final class LayoutTreeConsistencyChecker {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode root;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final DepthSortedSetsForDifferentPasses relayoutNodes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List postponedMeasureRequests;

    private final String J2(LayoutNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(node);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(node.k());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!node.HI()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + node.ofS() + ']');
        if (!rl(node)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    private final String nr() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        O(this, sb, this.root, 0);
        return sb.toString();
    }

    public final void n() {
        if (t(this.root)) {
            return;
        }
        System.out.println((Object) nr());
        throw new IllegalStateException("Inconsistency found!");
    }

    public LayoutTreeConsistencyChecker(LayoutNode layoutNode, DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses, List list) {
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.postponedMeasureRequests = list;
    }

    private static final void O(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i2) {
        String strJ2 = layoutTreeConsistencyChecker.J2(layoutNode);
        if (strJ2.length() > 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append("..");
            }
            sb.append(strJ2);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            i2++;
        }
        List listBzg = layoutNode.bzg();
        int size = listBzg.size();
        for (int i5 = 0; i5 < size; i5++) {
            O(layoutTreeConsistencyChecker, sb, (LayoutNode) listBzg.get(i5), i2);
        }
    }

    private final boolean rl(LayoutNode layoutNode) {
        LayoutNode.LayoutState layoutStateK;
        Object obj;
        LayoutNode layoutNodeMYa = layoutNode.mYa();
        Object obj2 = null;
        if (layoutNodeMYa != null) {
            layoutStateK = layoutNodeMYa.k();
        } else {
            layoutStateK = null;
        }
        if (layoutNode.HI() || (layoutNode.Org() != Integer.MAX_VALUE && layoutNodeMYa != null && layoutNodeMYa.HI())) {
            if (layoutNode.xg()) {
                List list = this.postponedMeasureRequests;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = list.get(i2);
                        MeasureAndLayoutDelegate.PostponedRequest postponedRequest = (MeasureAndLayoutDelegate.PostponedRequest) obj;
                        if (Intrinsics.areEqual(postponedRequest.getNode(), layoutNode) && !postponedRequest.getIsLookahead()) {
                            break;
                        }
                        i2++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    return true;
                }
            }
            if (layoutNode.getIsDeactivated()) {
                return true;
            }
            if (layoutNode.xg()) {
                if (!this.relayoutNodes.nr(layoutNode) && layoutNode.k() != LayoutNode.LayoutState.f32463t && ((layoutNodeMYa == null || !layoutNodeMYa.xg()) && ((layoutNodeMYa == null || !layoutNodeMYa.z()) && layoutStateK != LayoutNode.LayoutState.f32460n))) {
                    return false;
                }
                return true;
            }
            if (layoutNode.Y()) {
                if (!this.relayoutNodes.nr(layoutNode) && layoutNodeMYa != null && !layoutNodeMYa.xg() && !layoutNodeMYa.Y() && layoutStateK != LayoutNode.LayoutState.f32460n && layoutStateK != LayoutNode.LayoutState.f32458O) {
                    List list2 = this.postponedMeasureRequests;
                    int size2 = list2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            if (Intrinsics.areEqual(((MeasureAndLayoutDelegate.PostponedRequest) list2.get(i3)).getNode(), layoutNode)) {
                                break;
                            }
                            i3++;
                        } else {
                            if (layoutNode.k() == LayoutNode.LayoutState.f32460n) {
                                break;
                            }
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        if (Intrinsics.areEqual(layoutNode.tFV(), Boolean.TRUE)) {
            if (layoutNode.z()) {
                List list3 = this.postponedMeasureRequests;
                int size3 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        break;
                    }
                    Object obj3 = list3.get(i5);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = (MeasureAndLayoutDelegate.PostponedRequest) obj3;
                    if (Intrinsics.areEqual(postponedRequest2.getNode(), layoutNode) && postponedRequest2.getIsLookahead()) {
                        obj2 = obj3;
                        break;
                    }
                    i5++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (layoutNode.z()) {
                if (!this.relayoutNodes.O(layoutNode, true) && ((layoutNodeMYa == null || !layoutNodeMYa.z()) && layoutStateK != LayoutNode.LayoutState.f32463t && (layoutNodeMYa == null || !layoutNodeMYa.xg() || !Intrinsics.areEqual(layoutNode.getLookaheadRoot(), layoutNode)))) {
                    return false;
                }
                return true;
            }
            if (layoutNode.dR0() && !this.relayoutNodes.O(layoutNode, true) && layoutNodeMYa != null && !layoutNodeMYa.z() && !layoutNodeMYa.dR0() && layoutStateK != LayoutNode.LayoutState.f32463t && layoutStateK != LayoutNode.LayoutState.J2 && (!layoutNodeMYa.Y() || !Intrinsics.areEqual(layoutNode.getLookaheadRoot(), layoutNode))) {
                return false;
            }
        }
        return true;
    }

    private final boolean t(LayoutNode node) {
        if (!rl(node)) {
            return false;
        }
        List listBzg = node.bzg();
        int size = listBzg.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!t((LayoutNode) listBzg.get(i2))) {
                return false;
            }
        }
        return true;
    }
}
