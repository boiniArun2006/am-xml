package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "rl", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "t", "()Z", "node", "nr", "J2", "rootNode", "O", c.f62177j, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "layoutNodes", "", "[Landroidx/compose/ui/node/LayoutNode;", "cachedNodes", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,96:1\n1101#2:97\n1083#2,2:98\n519#3:100\n641#3,2:101\n641#3,2:103\n472#3:105\n423#3,9:107\n207#4:106\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:97\n26#1:98,2\n29#1:100\n32#1:101,2\n42#1:103,2\n61#1:105\n79#1:107,9\n79#1:106\n*E\n"})
public final class OnPositionedDispatcher {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableVector layoutNodes = new MutableVector(new LayoutNode[16], 0);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private LayoutNode[] cachedNodes;
    public static final int nr = 8;

    public final void J2(LayoutNode node) {
        this.layoutNodes.ck(node);
    }

    public final void O(LayoutNode rootNode) {
        this.layoutNodes.KN();
        this.layoutNodes.rl(rootNode);
        rootNode.Ro(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        LayoutNode[] layoutNodeArr;
        this.layoutNodes.aYN(Companion.DepthComparator.f32630n);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr2 = this.cachedNodes;
        if (layoutNodeArr2 != null) {
            int length = layoutNodeArr2.length;
            layoutNodeArr = layoutNodeArr2;
            if (length < size) {
                layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
            }
        }
        this.cachedNodes = null;
        for (int i2 = 0; i2 < size; i2++) {
            layoutNodeArr[i2] = this.layoutNodes.content[i2];
        }
        this.layoutNodes.KN();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[size];
            Intrinsics.checkNotNull(layoutNode);
            if (layoutNode.getNeedsOnPositionedDispatch()) {
                rl(layoutNode);
            }
        }
    }

    public final void nr(LayoutNode node) {
        this.layoutNodes.rl(node);
        node.Ro(true);
    }

    public final boolean t() {
        return this.layoutNodes.getSize() != 0;
    }

    private final void rl(LayoutNode layoutNode) {
        layoutNode.X();
        layoutNode.Ro(false);
        MutableVector mutableVectorHRu = layoutNode.hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            rl((LayoutNode) objArr[i2]);
        }
    }
}
