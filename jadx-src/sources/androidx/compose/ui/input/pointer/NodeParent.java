package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0003J%\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "<init>", "()V", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", c.f62177j, "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "J2", "O", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "", "nr", "Landroidx/compose/ui/Modifier$Node;", "pointerInputModifierNode", "xMQ", "(Landroidx/compose/ui/Modifier$Node;)V", "t", "", "pointerIdValue", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/pointer/Node;", "hitNodes", "KN", "(JLandroidx/collection/MutableObjectList;)V", "rl", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "Uo", "()Landroidx/compose/runtime/collection/MutableVector;", "children", "Landroidx/collection/MutableObjectList;", "removeMatchingPointerInputModifierNodeList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,688:1\n1101#2:689\n1083#2,2:690\n423#3,9:692\n423#3,9:701\n423#3,9:710\n423#3,9:719\n472#3:728\n423#3,9:729\n44#3:738\n472#3:739\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n234#1:689\n234#1:690,2\n246#1:692,9\n273#1:701,9\n293#1:710,9\n302#1:719,9\n319#1:728\n343#1:729,9\n347#1:738\n348#1:739\n*E\n"})
public class NodeParent {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableVector children = new MutableVector(new Node[16], 0);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableObjectList removeMatchingPointerInputModifierNodeList = new MutableObjectList(10);

    public boolean J2(LongSparseArray changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector mutableVector = this.children;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            z2 = ((Node) objArr[i2]).J2(changes, parentCoordinates, internalPointerEvent, isInBounds) || z2;
        }
        return z2;
    }

    public void KN(long pointerIdValue, MutableObjectList hitNodes) {
        MutableVector mutableVector = this.children;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ((Node) objArr[i2]).KN(pointerIdValue, hitNodes);
        }
    }

    public boolean O(InternalPointerEvent internalPointerEvent) {
        MutableVector mutableVector = this.children;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            z2 = ((Node) objArr[i2]).O(internalPointerEvent) || z2;
        }
        rl(internalPointerEvent);
        return z2;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final MutableVector getChildren() {
        return this.children;
    }

    public boolean n(LongSparseArray changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector mutableVector = this.children;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            z2 = ((Node) objArr[i2]).n(changes, parentCoordinates, internalPointerEvent, isInBounds) || z2;
        }
        return z2;
    }

    public void nr() {
        MutableVector mutableVector = this.children;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ((Node) objArr[i2]).nr();
        }
    }

    public void rl(InternalPointerEvent internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (((Node) this.children.content[size]).getPointerIds().J2()) {
                this.children.r(size);
            }
        }
    }

    public final void t() {
        this.children.KN();
    }

    public void xMQ(Modifier.Node pointerInputModifierNode) {
        this.removeMatchingPointerInputModifierNodeList.Z();
        this.removeMatchingPointerInputModifierNodeList.ty(this);
        while (this.removeMatchingPointerInputModifierNodeList.KN()) {
            NodeParent nodeParent = (NodeParent) this.removeMatchingPointerInputModifierNodeList.g(r0.get_size() - 1);
            int i2 = 0;
            while (i2 < nodeParent.children.getSize()) {
                Node node = (Node) nodeParent.children.content[i2];
                if (Intrinsics.areEqual(node.getModifierNode(), pointerInputModifierNode)) {
                    nodeParent.children.ck(node);
                    node.nr();
                } else {
                    this.removeMatchingPointerInputModifierNodeList.ty(node);
                    i2++;
                }
            }
        }
    }
}
