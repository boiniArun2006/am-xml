package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RC\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u001c\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "detectDragStart", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "c", "()V", "Sax", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "o", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "HI", "(J)V", "jB", "Lkotlin/jvm/functions/Function1;", "Vd", "()Lkotlin/jvm/functions/Function1;", "ZwA", "(Lkotlin/jvm/functions/Function1;)V", "U", "Lkotlin/jvm/functions/Function2;", "GT", "()Lkotlin/jvm/functions/Function2;", "WKb", "(Lkotlin/jvm/functions/Function2;)V", "P5", "b", "jE", "M7", "J", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "p5", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "dragAndDropModifierNode", "Landroidx/compose/ui/node/PointerInputModifierNode;", "eF", "Landroidx/compose/ui/node/PointerInputModifierNode;", "inputModifierNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDragAndDropSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropSource.kt\nandroidx/compose/foundation/draganddrop/DragAndDropSourceNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private Function1 transferData;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Function2 detectDragStart;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private PointerInputModifierNode inputModifierNode;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function1 drawDragDecoration;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private long size = IntSize.INSTANCE.n();

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final DragAndDropSourceModifierNode dragAndDropModifierNode = (DragAndDropSourceModifierNode) UR(DragAndDropNodeKt.rl(new Function2<DragAndDropStartTransferScope, Offset, Unit>() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$dragAndDropModifierNode$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
            n(dragAndDropStartTransferScope, offset.getPackedValue());
            return Unit.INSTANCE;
        }

        public final void n(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j2) {
            DragAndDropTransferData dragAndDropTransferData = (DragAndDropTransferData) this.f16420n.getTransferData().invoke(Offset.nr(j2));
            if (dragAndDropTransferData != null) {
                dragAndDropStartTransferScope.n(dragAndDropTransferData, IntSizeKt.O(this.f16420n.size), this.f16420n.getDrawDragDecoration());
            }
        }
    }));

    /* JADX INFO: renamed from: GT, reason: from getter */
    public final Function2 getDetectDragStart() {
        return this.detectDragStart;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void HI(long size) {
        this.size = size;
        this.dragAndDropModifierNode.HI(size);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        PointerInputModifierNode pointerInputModifierNode = this.inputModifierNode;
        if (pointerInputModifierNode != null) {
            ex(pointerInputModifierNode);
        }
    }

    /* JADX INFO: renamed from: Vd, reason: from getter */
    public final Function1 getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final void WKb(Function2 function2) {
        this.detectDragStart = function2;
    }

    public final void ZwA(Function1 function1) {
        this.drawDragDecoration = function1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Function1 getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        if (this.dragAndDropModifierNode.te()) {
            this.inputModifierNode = (PointerInputModifierNode) UR(SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1

                /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$onAttach$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J?\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f*\u00020\u0015H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u0015*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u0015*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\u001a*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u00020\u0010*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u0010*\u00020\u0015H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\"J\u001a\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b,\u0010*R$\u00104\u001a\u00020.2\u0006\u0010/\u001a\u00020.8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"androidx/compose/foundation/draganddrop/DragAndDropSourceNode$onAttach$1$1", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "eTf", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "", "How", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "I4p", "(J)I", "Z", "(J)F", "", "bzg", "(F)F", "rV9", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "Ik", "(J)J", CmcdData.STREAM_TYPE_LIVE, "tFV", "M", "ck", "(F)J", "ViF", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "XQ", "(J)V", "getDensity", "()F", "density", "yAc", "fontScale", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "T3L", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class AnonymousClass1 implements DragAndDropStartDetectorScope, PointerInputScope {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    private final /* synthetic */ PointerInputScope f16422n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ DragAndDropSourceNode f16423t;

                    @Override // androidx.compose.ui.unit.Density
                    public int How(float f3) {
                        return this.f16422n.How(f3);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public int I4p(long j2) {
                        return this.f16422n.I4p(j2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public long Ik(long j2) {
                        return this.f16422n.Ik(j2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public long M(long j2) {
                        return this.f16422n.M(j2);
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public void T3L(boolean z2) {
                        this.f16422n.T3L(z2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public long ViF(float f3) {
                        return this.f16422n.ViF(f3);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    public float Z(long j2) {
                        return this.f16422n.Z(j2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public float bzg(float f3) {
                        return this.f16422n.bzg(f3);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    public long ck(float f3) {
                        return this.f16422n.ck(f3);
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public Object eTf(Function2 function2, Continuation continuation) {
                        return this.f16422n.eTf(function2, continuation);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public float getDensity() {
                        return this.f16422n.getDensity();
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputScope
                    public ViewConfiguration getViewConfiguration() {
                        return this.f16422n.getViewConfiguration();
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public float l(float f3) {
                        return this.f16422n.l(f3);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public float rV9(int i2) {
                        return this.f16422n.rV9(i2);
                    }

                    @Override // androidx.compose.ui.unit.Density
                    public float tFV(long j2) {
                        return this.f16422n.tFV(j2);
                    }

                    @Override // androidx.compose.ui.unit.FontScaling
                    /* JADX INFO: renamed from: yAc */
                    public float getFontScale() {
                        return this.f16422n.getFontScale();
                    }

                    AnonymousClass1(PointerInputScope pointerInputScope, DragAndDropSourceNode dragAndDropSourceNode) {
                        this.f16423t = dragAndDropSourceNode;
                        this.f16422n = pointerInputScope;
                    }

                    @Override // androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope
                    public void XQ(long offset) {
                        this.f16423t.dragAndDropModifierNode.XQ(offset);
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                    Object objInvoke = this.f16421n.getDetectDragStart().invoke(new AnonymousClass1(pointerInputScope, this.f16421n), continuation);
                    return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
                }
            }));
        }
    }

    public final void jE(Function1 function1) {
        this.transferData = function1;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void o(LayoutCoordinates coordinates) {
        this.dragAndDropModifierNode.o(coordinates);
    }

    public DragAndDropSourceNode(Function1 function1, Function2 function2, Function1 function12) {
        this.drawDragDecoration = function1;
        this.detectDragStart = function2;
        this.transferData = function12;
    }
}
