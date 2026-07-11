package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001GBD\u0012!\b\u0002\u0010\f\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\b\u000b\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J*\u0010\u001d\u001a\u00020\n*\u00020\b2\u0006\u0010\u0018\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010!J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010$R/\u0010\f\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\b\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R(\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u0017R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "Lkotlin/Function2;", "Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/ExtensionFunctionType;", "onStartTransfer", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "onDropTargetValidate", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Sax", "()V", "Landroidx/compose/ui/unit/IntSize;", "size", "HI", "(J)V", "offset", "XQ", "Lkotlin/Function0;", "", "isTransferStarted", "Vd", "(Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;JLkotlin/jvm/functions/Function0;)V", "startEvent", "UR", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z", a.f62811a, "I", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "GR", "xg", InneractiveMediationDefs.GENDER_FEMALE, "Om", "v", "Lkotlin/jvm/functions/Function2;", "Xw", "Lkotlin/jvm/functions/Function1;", "", "jB", "Ljava/lang/Object;", "Nxk", "()Ljava/lang/Object;", "traverseKey", "U", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "lastChildDragAndDropModifierNode", "P5", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "thisDragAndDropTarget", "M7", "J", "GT", "()J", "setSize-ozmzZPI$ui_release", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "ni", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "dragAndDropManager", "te", "()Z", "isRequestDragAndDropTransferRequired", "p5", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n1#1,493:1\n65#2,5:494\n65#2,5:499\n482#3,10:504\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n257#1:494,5\n313#1:499,5\n381#1:504,10\n*E\n"})
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private DragAndDropTarget thisDragAndDropTarget;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private DragAndDropNode lastChildDragAndDropModifierNode;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final Function1 onDropTargetValidate;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Object traverseKey;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function2 onStartTransfer;
    private static final Companion p5 = new Companion(null);
    public static final int eF = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;", "", "()V", "DragAndDropTraversableKey", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;", "", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class DragAndDropTraversableKey {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final DragAndDropTraversableKey f31219n = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ DragAndDropNode(Function2 function2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : function2, (i2 & 2) != 0 ? null : function1);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    public DragAndDropNode(Function2 function2, Function1 function1) {
        this.onStartTransfer = function2;
        this.onDropTargetValidate = function1;
        this.traverseKey = Companion.DragAndDropTraversableKey.f31219n;
        this.size = IntSize.INSTANCE.n();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void GR(final DragAndDropEvent event) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode2 == null || !DragAndDropNodeKt.Uo(dragAndDropNode2, DragAndDrop_androidKt.n(event))) {
            if (getNode().getIsAttached()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                TraversableNodeKt.J2(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode2) {
                        DragAndDropNode dragAndDropNode3 = (DragAndDropNode) traversableNode2;
                        if (!this.ni().fD(dragAndDropNode3) || !DragAndDropNodeKt.Uo(dragAndDropNode3, DragAndDrop_androidKt.n(event))) {
                            return TraversableNode.Companion.TraverseDescendantsAction.f32652n;
                        }
                        objectRef.element = traversableNode2;
                        return TraversableNode.Companion.TraverseDescendantsAction.f32651O;
                    }
                });
                traversableNode = (TraversableNode) objectRef.element;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            DragAndDropNodeKt.KN(dragAndDropNode, event);
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.xg(event);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
            if (dragAndDropTarget2 != null) {
                DragAndDropNodeKt.KN(dragAndDropTarget2, event);
            }
            dragAndDropNode2.xg(event);
        } else if (!Intrinsics.areEqual(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                DragAndDropNodeKt.KN(dragAndDropNode, event);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.xg(event);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.GR(event);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.GR(event);
            }
        }
        this.lastChildDragAndDropModifierNode = dragAndDropNode;
    }

    /* JADX INFO: renamed from: GT, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void HI(long size) {
        this.size = size;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void I(DragAndDropEvent event) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.I(event);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.I(event);
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* JADX INFO: renamed from: Nxk, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void Om(final DragAndDropEvent event) {
        DragAndDropNodeKt.xMQ(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (dragAndDropNode.getNode().getIsAttached()) {
                    DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                    if (dragAndDropTarget != null) {
                        dragAndDropTarget.Om(event);
                    }
                    dragAndDropNode.thisDragAndDropTarget = null;
                    dragAndDropNode.lastChildDragAndDropModifierNode = null;
                    return TraversableNode.Companion.TraverseDescendantsAction.f32652n;
                }
                return TraversableNode.Companion.TraverseDescendantsAction.f32654t;
            }
        });
    }

    public boolean UR(final DragAndDropEvent startEvent) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        DragAndDropNodeKt.xMQ(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                boolean z2;
                DragAndDropTarget dragAndDropTarget;
                boolean z3;
                if (!dragAndDropNode.getIsAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.f32654t;
                }
                boolean z4 = false;
                if (dragAndDropNode.thisDragAndDropTarget == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    InlineClassHelperKt.t("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                Function1 function1 = dragAndDropNode.onDropTargetValidate;
                if (function1 != null) {
                    dragAndDropTarget = (DragAndDropTarget) function1.invoke(startEvent);
                } else {
                    dragAndDropTarget = null;
                }
                dragAndDropNode.thisDragAndDropTarget = dragAndDropTarget;
                if (dragAndDropNode.thisDragAndDropTarget != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    this.ni().E2(dragAndDropNode);
                }
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (booleanRef2.element || z3) {
                    z4 = true;
                }
                booleanRef2.element = z4;
                return TraversableNode.Companion.TraverseDescendantsAction.f32652n;
            }
        });
        return booleanRef.element;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public void XQ(long offset) {
        if (!(this.onStartTransfer != null)) {
            InlineClassHelperKt.t("Check failed.");
        }
        ni().iF(this, offset);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean f(DragAndDropEvent event) {
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            return dragAndDropNode.f(event);
        }
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.f(event);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void i(DragAndDropEvent event) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.i(event);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.i(event);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void xg(DragAndDropEvent event) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.xg(event);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.xg(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DragAndDropManager ni() {
        return DelegatableNodeKt.ck(this).getDragAndDropManager();
    }

    public final void Vd(final DragAndDropStartTransferScope dragAndDropStartTransferScope, final long j2, final Function0 function0) {
        final LayoutCoordinates layoutCoordinatesR = DelegatableNodeKt.HI(this).r();
        DragAndDropNodeKt.xMQ(this, new Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$startDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (dragAndDropNode.getIsAttached()) {
                    Function2 function2 = dragAndDropNode.onStartTransfer;
                    if (function2 == null) {
                        return TraversableNode.Companion.TraverseDescendantsAction.f32652n;
                    }
                    long j3 = j2;
                    Offset.Companion companion = Offset.INSTANCE;
                    if (!Offset.mUb(j3, companion.rl())) {
                        long jNHg = DelegatableNodeKt.HI(dragAndDropNode).r().nHg(layoutCoordinatesR, j2);
                        if (!SizeKt.t(IntSizeKt.O(dragAndDropNode.getSize())).J2(jNHg)) {
                            return TraversableNode.Companion.TraverseDescendantsAction.f32652n;
                        }
                        function2.invoke(dragAndDropStartTransferScope, Offset.nr(jNHg));
                    } else {
                        function2.invoke(dragAndDropStartTransferScope, Offset.nr(companion.rl()));
                    }
                    if (((Boolean) function0.invoke()).booleanValue()) {
                        return TraversableNode.Companion.TraverseDescendantsAction.f32651O;
                    }
                    return TraversableNode.Companion.TraverseDescendantsAction.f32652n;
                }
                return TraversableNode.Companion.TraverseDescendantsAction.f32654t;
            }
        });
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public boolean te() {
        return ni().te();
    }
}
