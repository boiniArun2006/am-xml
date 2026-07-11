package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/runtime/collection/MutableVector;", "rl", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/runtime/collection/MutableVector;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "", c.f62177j, "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,280:1\n44#2:281\n472#2:282\n472#2:283\n1101#3:284\n1083#3,2:285\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n259#1:281\n263#1:282\n264#1:283\n271#1:284\n271#1:285,2\n*E\n"})
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FocusableChildrenComparator f31362n = new FocusableChildrenComparator();

    private final MutableVector rl(LayoutNode layoutNode) {
        MutableVector mutableVector = new MutableVector(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.n(0, layoutNode);
            layoutNode = layoutNode.mYa();
        }
        return mutableVector;
    }

    private FocusableChildrenComparator() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode a2, FocusTargetNode b2) {
        int i2 = 0;
        if (FocusTraversalKt.Uo(a2) && FocusTraversalKt.Uo(b2)) {
            LayoutNode layoutNodeHI = DelegatableNodeKt.HI(a2);
            LayoutNode layoutNodeHI2 = DelegatableNodeKt.HI(b2);
            if (Intrinsics.areEqual(layoutNodeHI, layoutNodeHI2)) {
                return 0;
            }
            MutableVector mutableVectorRl = rl(layoutNodeHI);
            MutableVector mutableVectorRl2 = rl(layoutNodeHI2);
            int iMin = Math.min(mutableVectorRl.getSize() - 1, mutableVectorRl2.getSize() - 1);
            if (iMin >= 0) {
                while (Intrinsics.areEqual(mutableVectorRl.content[i2], mutableVectorRl2.content[i2])) {
                    if (i2 != iMin) {
                        i2++;
                    }
                }
                return Intrinsics.compare(((LayoutNode) mutableVectorRl.content[i2]).Org(), ((LayoutNode) mutableVectorRl2.content[i2]).Org());
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        }
        if (FocusTraversalKt.Uo(a2)) {
            return -1;
        }
        if (!FocusTraversalKt.Uo(b2)) {
            return 0;
        }
        return 1;
    }
}
