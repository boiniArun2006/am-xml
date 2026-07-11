package androidx.compose.ui.input.pointer;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010'\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/Modifier$Node;", "pointerInputNode", "", "Uo", "(Landroidx/compose/ui/Modifier$Node;)V", "", "pointerId", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/pointer/Node;", "hitNodes", "J2", "(JLandroidx/collection/MutableObjectList;)V", "Landroidx/compose/ui/input/pointer/PointerId;", "", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "rl", "(JLjava/util/List;Z)V", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "isInBounds", "nr", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "t", "()V", "O", c.f62177j, "Landroidx/compose/ui/layout/LayoutCoordinates;", "Z", "dispatchingEvent", "dispatchCancelAfterDispatchedEvent", "clearNodeCacheAfterDispatchedEvent", "removeSpecificNodesAfterDispatchedEvent", "Landroidx/collection/MutableObjectList;", "nodesToRemove", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "root", "Landroidx/collection/MutableLongObjectMap;", "KN", "Landroidx/collection/MutableLongObjectMap;", "hitPointerIdsAndNodes", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n+ 4 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,688:1\n347#2,8:689\n128#3:697\n128#3:702\n679#4:698\n679#4:703\n1516#5:699\n1516#5:704\n1#6:700\n1#6:701\n1#6:705\n382#7,4:706\n354#7,6:710\n364#7,3:717\n367#7,9:721\n386#7:730\n1399#8:716\n1270#8:720\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n89#1:689,8\n93#1:697\n108#1:702\n96#1:698\n111#1:703\n97#1:699\n111#1:704\n96#1:700\n111#1:705\n121#1:706,4\n121#1:710,6\n121#1:717,3\n121#1:721,9\n121#1:730\n121#1:716\n121#1:720\n*E\n"})
public final class HitPathTracker {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean removeSpecificNodesAfterDispatchedEvent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LayoutCoordinates rootCoordinates;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean clearNodeCacheAfterDispatchedEvent;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean dispatchingEvent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchCancelAfterDispatchedEvent;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableObjectList nodesToRemove = new MutableObjectList(0, 1, null);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final NodeParent root = new NodeParent();

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableLongObjectMap hitPointerIdsAndNodes = new MutableLongObjectMap(10);

    private final void J2(long pointerId, MutableObjectList hitNodes) {
        this.root.KN(pointerId, hitNodes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uo(Modifier.Node pointerInputNode) {
        if (!this.dispatchingEvent) {
            this.root.xMQ(pointerInputNode);
        } else {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.ty(pointerInputNode);
        }
    }

    public final void O() {
        if (this.dispatchingEvent) {
            this.dispatchCancelAfterDispatchedEvent = true;
        } else {
            this.root.nr();
            t();
        }
    }

    public final boolean nr(InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        if (!this.root.n(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return false;
        }
        boolean z2 = true;
        this.dispatchingEvent = true;
        boolean zJ2 = this.root.J2(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, isInBounds);
        if (!this.root.O(internalPointerEvent) && !zJ2) {
            z2 = false;
        }
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = false;
            int i2 = this.nodesToRemove.get_size();
            for (int i3 = 0; i3 < i2; i3++) {
                Uo((Modifier.Node) this.nodesToRemove.nr(i3));
            }
            this.nodesToRemove.Z();
        }
        if (this.dispatchCancelAfterDispatchedEvent) {
            this.dispatchCancelAfterDispatchedEvent = false;
            O();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = false;
            t();
        }
        return z2;
    }

    public final void rl(long pointerId, List pointerInputNodes, boolean prunePointerIdsAndChangesNotInNodesList) {
        Object obj;
        NodeParent nodeParent = this.root;
        this.hitPointerIdsAndNodes.Uo();
        int size = pointerInputNodes.size();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            final Modifier.Node node = (Modifier.Node) pointerInputNodes.get(i2);
            if (node.getIsAttached()) {
                node.JI(new Function0<Unit>() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        this.f32056n.Uo(node);
                    }
                });
                if (z2) {
                    MutableVector children = nodeParent.getChildren();
                    Object[] objArr = children.content;
                    int size2 = children.getSize();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (Intrinsics.areEqual(((Node) obj).getModifierNode(), node)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    Node node2 = (Node) obj;
                    if (node2 != null) {
                        node2.ty();
                        node2.getPointerIds().n(pointerId);
                        MutableLongObjectMap mutableLongObjectMap = this.hitPointerIdsAndNodes;
                        Object objRl = mutableLongObjectMap.rl(pointerId);
                        if (objRl == null) {
                            objRl = new MutableObjectList(0, 1, null);
                            mutableLongObjectMap.r(pointerId, objRl);
                        }
                        ((MutableObjectList) objRl).ty(node2);
                        nodeParent = node2;
                    } else {
                        z2 = false;
                    }
                }
                Node node3 = new Node(node);
                node3.getPointerIds().n(pointerId);
                MutableLongObjectMap mutableLongObjectMap2 = this.hitPointerIdsAndNodes;
                Object objRl2 = mutableLongObjectMap2.rl(pointerId);
                if (objRl2 == null) {
                    objRl2 = new MutableObjectList(0, 1, null);
                    mutableLongObjectMap2.r(pointerId, objRl2);
                }
                ((MutableObjectList) objRl2).ty(node3);
                nodeParent.getChildren().rl(node3);
                nodeParent = node3;
            }
        }
        if (!prunePointerIdsAndChangesNotInNodesList) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMap3 = this.hitPointerIdsAndNodes;
        long[] jArr = mutableLongObjectMap3.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr2 = mutableLongObjectMap3.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr2 = mutableLongObjectMap3.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr2[i5];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j2) < 128) {
                        int i9 = (i5 << 3) + i8;
                        J2(jArr[i9], (MutableObjectList) objArr2[i9]);
                    }
                    j2 >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void t() {
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = true;
        } else {
            this.root.t();
        }
    }

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }
}
