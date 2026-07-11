package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001d\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00109¨\u0006>"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/Modifier$Node;", "modifierNode", "<init>", "(Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "oldEvent", "newEvent", "", "az", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "", "mUb", "()V", "", "pointerIdValue", "Landroidx/collection/MutableObjectList;", "hitNodes", "KN", "(JLandroidx/collection/MutableObjectList;)V", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "isInBounds", "J2", "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "O", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", c.f62177j, "nr", "ty", "rl", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "", "toString", "()Ljava/lang/String;", "t", "Landroidx/compose/ui/Modifier$Node;", "gh", "()Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "qie", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "pointerIds", "Landroidx/collection/LongSparseArray;", "relevantChanges", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Uo", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Z", "wasIn", "xMQ", "isIn", "hasExited", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,688:1\n633#1,5:698\n640#1:800\n633#1,5:801\n640#1:859\n423#2,9:689\n423#2,9:747\n423#2,9:850\n423#2,9:923\n95#3:703\n95#3:756\n95#3:806\n95#3:860\n95#3:932\n437#4,6:704\n447#4,2:711\n449#4,8:716\n457#4,9:727\n466#4,8:739\n437#4,6:757\n447#4,2:764\n449#4,8:769\n457#4,9:780\n466#4,8:792\n437#4,6:807\n447#4,2:814\n449#4,8:819\n457#4,9:830\n466#4,8:842\n437#4,6:861\n447#4,2:868\n449#4,8:873\n457#4,9:884\n466#4,8:896\n437#4,6:933\n447#4,2:940\n449#4,8:945\n457#4,9:956\n466#4,8:968\n246#5:710\n246#5:763\n246#5:813\n246#5:867\n246#5:939\n240#6,3:713\n243#6,3:736\n240#6,3:766\n243#6,3:789\n240#6,3:816\n243#6,3:839\n240#6,3:870\n243#6,3:893\n240#6,3:942\n243#6,3:965\n1101#7:724\n1083#7,2:725\n1101#7:777\n1083#7,2:778\n1101#7:827\n1083#7,2:828\n1101#7:881\n1083#7,2:882\n1101#7:953\n1083#7,2:954\n111#8,2:904\n111#8,2:910\n34#9,4:906\n39#9:912\n117#9,2:914\n34#9,6:916\n119#9:922\n34#9,4:976\n39#9:981\n40#10:913\n67#10:980\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n410#1:698,5\n410#1:800\n449#1:801,5\n449#1:859\n395#1:689,9\n421#1:747,9\n459#1:850,9\n650#1:923,9\n415#1:703\n435#1:756\n453#1:806\n487#1:860\n651#1:932\n415#1:704,6\n415#1:711,2\n415#1:716,8\n415#1:727,9\n415#1:739,8\n435#1:757,6\n435#1:764,2\n435#1:769,8\n435#1:780,9\n435#1:792,8\n453#1:807,6\n453#1:814,2\n453#1:819,8\n453#1:830,9\n453#1:842,8\n487#1:861,6\n487#1:868,2\n487#1:873,8\n487#1:884,9\n487#1:896,8\n651#1:933,6\n651#1:940,2\n651#1:945,8\n651#1:956,9\n651#1:968,8\n415#1:710\n435#1:763\n453#1:813\n487#1:867\n651#1:939\n415#1:713,3\n415#1:736,3\n435#1:766,3\n435#1:789,3\n453#1:816,3\n453#1:839,3\n487#1:870,3\n487#1:893,3\n651#1:942,3\n651#1:965,3\n415#1:724\n415#1:725,2\n435#1:777\n435#1:778,2\n453#1:827\n453#1:828,2\n487#1:881\n487#1:882,2\n651#1:953\n651#1:954,2\n504#1:904,2\n514#1:910,2\n509#1:906,4\n509#1:912\n563#1:914,2\n563#1:916,6\n563#1:922\n665#1:976,4\n665#1:981\n549#1:913\n676#1:980\n*E\n"})
public final class Node extends NodeParent {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private LayoutCoordinates coordinates;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean wasIn;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private PointerEvent pointerEvent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Modifier.Node modifierNode;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final PointerIdArray pointerIds = new PointerIdArray();

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final LongSparseArray relevantChanges = new LongSparseArray(2);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean isIn = true;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private boolean hasExited = true;

    private final boolean az(PointerEvent oldEvent, PointerEvent newEvent) {
        if (oldEvent == null || oldEvent.getChanges().size() != newEvent.getChanges().size()) {
            return true;
        }
        int size = newEvent.getChanges().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!Offset.mUb(((PointerInputChange) oldEvent.getChanges().get(i2)).getPosition(), ((PointerInputChange) newEvent.getChanges().get(i2)).getPosition())) {
                return true;
            }
        }
        return false;
    }

    public final void ty() {
        this.isIn = true;
    }

    private final void mUb() {
        this.relevantChanges.rl();
        this.coordinates = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean J2(LongSparseArray changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        if (this.relevantChanges.xMQ() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        Intrinsics.checkNotNull(pointerEvent);
        LayoutCoordinates layoutCoordinates = this.coordinates;
        Intrinsics.checkNotNull(layoutCoordinates);
        long jN = layoutCoordinates.n();
        ?? KN = this.modifierNode;
        int iN = NodeKind.n(16);
        ?? mutableVector = 0;
        while (KN != 0) {
            if (KN instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) KN).C(pointerEvent, PointerEventPass.f32078n, jN);
            } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                int i2 = 0;
                KN = KN;
                mutableVector = mutableVector;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iN) != 0) {
                        i2++;
                        mutableVector = mutableVector;
                        if (i2 == 1) {
                            KN = delegate;
                        } else {
                            if (mutableVector == 0) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (KN != 0) {
                                mutableVector.rl(KN);
                                KN = 0;
                            }
                            mutableVector.rl(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    KN = KN;
                    mutableVector = mutableVector;
                }
                if (i2 == 1) {
                }
            }
            KN = DelegatableNodeKt.KN(mutableVector);
        }
        if (this.modifierNode.getIsAttached()) {
            MutableVector children = getChildren();
            Object[] objArr = children.content;
            int size = children.getSize();
            for (int i3 = 0; i3 < size; i3++) {
                Node node = (Node) objArr[i3];
                LongSparseArray longSparseArray = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                node.J2(longSparseArray, layoutCoordinates2, internalPointerEvent, isInBounds);
            }
        }
        if (this.modifierNode.getIsAttached()) {
            ?? KN2 = this.modifierNode;
            int iN2 = NodeKind.n(16);
            ?? mutableVector2 = 0;
            while (KN2 != 0) {
                if (KN2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) KN2).C(pointerEvent, PointerEventPass.f32080t, jN);
                } else if ((KN2.getKindSet() & iN2) != 0 && (KN2 instanceof DelegatingNode)) {
                    Modifier.Node delegate2 = ((DelegatingNode) KN2).getDelegate();
                    int i5 = 0;
                    mutableVector2 = mutableVector2;
                    KN2 = KN2;
                    while (delegate2 != null) {
                        if ((delegate2.getKindSet() & iN2) != 0) {
                            i5++;
                            mutableVector2 = mutableVector2;
                            if (i5 == 1) {
                                KN2 = delegate2;
                            } else {
                                if (mutableVector2 == 0) {
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (KN2 != 0) {
                                    mutableVector2.rl(KN2);
                                    KN2 = 0;
                                }
                                mutableVector2.rl(delegate2);
                            }
                        }
                        delegate2 = delegate2.getChild();
                        mutableVector2 = mutableVector2;
                        KN2 = KN2;
                    }
                    if (i5 == 1) {
                    }
                }
                KN2 = DelegatableNodeKt.KN(mutableVector2);
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void KN(long pointerIdValue, MutableObjectList hitNodes) {
        if (this.pointerIds.t(pointerIdValue) && !hitNodes.n(this)) {
            this.pointerIds.Uo(pointerIdValue);
            this.relevantChanges.qie(pointerIdValue);
        }
        MutableVector children = getChildren();
        Object[] objArr = children.content;
        int size = children.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ((Node) objArr[i2]).KN(pointerIdValue, hitNodes);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean O(InternalPointerEvent internalPointerEvent) {
        boolean z2 = false;
        z2 = false;
        if (!this.relevantChanges.xMQ() && this.modifierNode.getIsAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            long jN = layoutCoordinates.n();
            ?? KN = this.modifierNode;
            int iN = NodeKind.n(16);
            ?? mutableVector = 0;
            while (KN != 0) {
                if (KN instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) KN).C(pointerEvent, PointerEventPass.f32077O, jN);
                } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                    Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                    int i2 = 0;
                    KN = KN;
                    mutableVector = mutableVector;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iN) != 0) {
                            i2++;
                            mutableVector = mutableVector;
                            if (i2 == 1) {
                                KN = delegate;
                            } else {
                                if (mutableVector == 0) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (KN != 0) {
                                    mutableVector.rl(KN);
                                    KN = 0;
                                }
                                mutableVector.rl(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        KN = KN;
                        mutableVector = mutableVector;
                    }
                    if (i2 == 1) {
                    }
                }
                KN = DelegatableNodeKt.KN(mutableVector);
            }
            if (this.modifierNode.getIsAttached()) {
                MutableVector children = getChildren();
                Object[] objArr = children.content;
                int size = children.getSize();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Node) objArr[i3]).O(internalPointerEvent);
                }
            }
            z2 = true;
        }
        rl(internalPointerEvent);
        mUb();
        return z2;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0259  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n(LongSparseArray changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        Object obj;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        int i5;
        boolean zN = super.n(changes, parentCoordinates, internalPointerEvent, isInBounds);
        boolean z5 = true;
        if (!this.modifierNode.getIsAttached()) {
            return true;
        }
        ?? KN = this.modifierNode;
        int iN = NodeKind.n(16);
        ?? mutableVector = 0;
        while (KN != 0) {
            if (KN instanceof PointerInputModifierNode) {
                this.coordinates = PointerInputModifierNodeKt.n((PointerInputModifierNode) KN);
            } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                int i7 = 0;
                KN = KN;
                mutableVector = mutableVector;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iN) != 0) {
                        i7++;
                        mutableVector = mutableVector;
                        if (i7 == 1) {
                            KN = delegate;
                        } else {
                            if (mutableVector == 0) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (KN != 0) {
                                mutableVector.rl(KN);
                                KN = 0;
                            }
                            mutableVector.rl(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    KN = KN;
                    mutableVector = mutableVector;
                }
                if (i7 == 1) {
                }
            }
            KN = DelegatableNodeKt.KN(mutableVector);
        }
        if (this.coordinates == null) {
            return true;
        }
        int iTy = changes.ty();
        int i8 = 0;
        while (i8 < iTy) {
            long jMUb = changes.mUb(i8);
            PointerInputChange pointerInputChange = (PointerInputChange) changes.HI(i8);
            if (this.pointerIds.t(jMUb)) {
                boolean z6 = z5;
                int i9 = i8;
                long previousPosition = pointerInputChange.getPreviousPosition();
                z4 = z6;
                long position = pointerInputChange.getPosition();
                if ((((previousPosition & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((position & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                    ArrayList arrayList = new ArrayList(pointerInputChange.O().size());
                    List listO = pointerInputChange.O();
                    z3 = zN;
                    int size = listO.size();
                    i2 = iTy;
                    int i10 = 0;
                    while (i10 < size) {
                        HistoricalChange historicalChange = (HistoricalChange) listO.get(i10);
                        int i11 = size;
                        int i12 = i10;
                        long position2 = historicalChange.getPosition();
                        if ((((position2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            long uptimeMillis = historicalChange.getUptimeMillis();
                            i5 = i9;
                            LayoutCoordinates layoutCoordinates = this.coordinates;
                            Intrinsics.checkNotNull(layoutCoordinates);
                            arrayList.add(new HistoricalChange(uptimeMillis, layoutCoordinates.nHg(parentCoordinates, position2), historicalChange.getOriginalEventPosition(), null));
                        } else {
                            i5 = i9;
                        }
                        i10 = i12 + 1;
                        size = i11;
                        i9 = i5;
                    }
                    i3 = i9;
                    LongSparseArray longSparseArray = this.relevantChanges;
                    LayoutCoordinates layoutCoordinates2 = this.coordinates;
                    Intrinsics.checkNotNull(layoutCoordinates2);
                    long jNHg = layoutCoordinates2.nHg(parentCoordinates, previousPosition);
                    LayoutCoordinates layoutCoordinates3 = this.coordinates;
                    Intrinsics.checkNotNull(layoutCoordinates3);
                    longSparseArray.gh(jMUb, PointerInputChange.t(pointerInputChange, 0L, 0L, layoutCoordinates3.nHg(parentCoordinates, position), false, 0L, jNHg, false, 0, arrayList, 0L, 731, null));
                } else {
                    z3 = zN;
                    i2 = iTy;
                    i3 = i9;
                }
            } else {
                z3 = zN;
                i2 = iTy;
                z4 = z5;
                i3 = i8;
            }
            i8 = i3 + 1;
            z5 = z4;
            zN = z3;
            iTy = i2;
        }
        boolean z7 = zN;
        boolean z9 = z5;
        if (this.relevantChanges.xMQ()) {
            this.pointerIds.rl();
            getChildren().KN();
            return z9;
        }
        int size2 = this.pointerIds.getSize();
        while (true) {
            size2--;
            if (-1 >= size2) {
                break;
            }
            if (!changes.nr(this.pointerIds.nr(size2))) {
                this.pointerIds.KN(size2);
            }
        }
        ArrayList arrayList2 = new ArrayList(this.relevantChanges.ty());
        int iTy2 = this.relevantChanges.ty();
        for (int i13 = 0; i13 < iTy2; i13++) {
            arrayList2.add(this.relevantChanges.HI(i13));
        }
        PointerEvent pointerEvent = new PointerEvent(arrayList2, internalPointerEvent);
        List changes2 = pointerEvent.getChanges();
        int size3 = changes2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj = null;
                break;
            }
            Object obj2 = changes2.get(i14);
            if (internalPointerEvent.n(((PointerInputChange) obj2).getId())) {
                obj = obj2;
                break;
            }
            i14++;
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
        if (pointerInputChange2 != null) {
            if (isInBounds) {
                z2 = false;
                if (!this.isIn && (pointerInputChange2.getPressed() || pointerInputChange2.getPreviousPressed())) {
                    Intrinsics.checkNotNull(this.coordinates);
                    this.isIn = !PointerEventKt.O(pointerInputChange2, r3.n());
                }
            } else {
                z2 = false;
                this.isIn = false;
            }
            if (this.isIn != this.wasIn) {
                int type = pointerEvent.getType();
                PointerEventType.Companion companion = PointerEventType.INSTANCE;
                if (PointerEventType.mUb(type, companion.t()) || PointerEventType.mUb(pointerEvent.getType(), companion.n()) || PointerEventType.mUb(pointerEvent.getType(), companion.rl())) {
                    pointerEvent.xMQ(this.isIn ? companion.n() : companion.rl());
                } else {
                    int type2 = pointerEvent.getType();
                    PointerEventType.Companion companion2 = PointerEventType.INSTANCE;
                    if (PointerEventType.mUb(type2, companion2.n()) && this.wasIn && !this.hasExited) {
                        pointerEvent.xMQ(companion2.t());
                    } else if (PointerEventType.mUb(pointerEvent.getType(), companion2.rl()) && this.isIn && pointerInputChange2.getPressed()) {
                        pointerEvent.xMQ(companion2.t());
                    }
                }
            }
        } else {
            z2 = false;
        }
        boolean z10 = (z7 || !PointerEventType.mUb(pointerEvent.getType(), PointerEventType.INSTANCE.t()) || az(this.pointerEvent, pointerEvent)) ? z9 : z2;
        this.pointerEvent = pointerEvent;
        return z10;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void nr() {
        MutableVector children = getChildren();
        Object[] objArr = children.content;
        int size = children.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ((Node) objArr[i2]).nr();
        }
        ?? KN = this.modifierNode;
        int iN = NodeKind.n(16);
        ?? mutableVector = 0;
        while (KN != 0) {
            if (KN instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) KN).lNy();
            } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                int i3 = 0;
                KN = KN;
                mutableVector = mutableVector;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iN) != 0) {
                        i3++;
                        mutableVector = mutableVector;
                        if (i3 == 1) {
                            KN = delegate;
                        } else {
                            if (mutableVector == 0) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (KN != 0) {
                                mutableVector.rl(KN);
                                KN = 0;
                            }
                            mutableVector.rl(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    KN = KN;
                    mutableVector = mutableVector;
                }
                if (i3 == 1) {
                }
            }
            KN = DelegatableNodeKt.KN(mutableVector);
        }
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void rl(InternalPointerEvent internalPointerEvent) {
        super.rl(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i2);
            boolean pressed = pointerInputChange.getPressed();
            boolean zN = internalPointerEvent.n(pointerInputChange.getId());
            boolean z2 = this.isIn;
            if ((!pressed && !zN) || (!pressed && !z2)) {
                this.pointerIds.Uo(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.mUb(pointerEvent.getType(), PointerEventType.INSTANCE.rl());
    }
}
