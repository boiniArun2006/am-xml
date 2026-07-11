package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018RC\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/Continuation;", "", "dragAndDropSourceHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "HI", "(J)V", "jB", "Lkotlin/jvm/functions/Function1;", "getDrawDragDecoration", "()Lkotlin/jvm/functions/Function1;", "GT", "(Lkotlin/jvm/functions/Function1;)V", "U", "Lkotlin/jvm/functions/Function2;", CmcdConfiguration.KEY_PLAYBACK_RATE, "()Lkotlin/jvm/functions/Function2;", "ni", "(Lkotlin/jvm/functions/Function2;)V", "P5", "J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LegacyDragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private long size = IntSize.INSTANCE.n();

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Function2 dragAndDropSourceHandler;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function1 drawDragDecoration;

    public final void GT(Function1 function1) {
        this.drawDragDecoration = function1;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void HI(long size) {
        this.size = size;
    }

    public final void ni(Function2 function2) {
        this.dragAndDropSourceHandler = function2;
    }

    /* JADX INFO: renamed from: pr, reason: from getter */
    public final Function2 getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public LegacyDragAndDropSourceNode(Function1 function1, Function2 function2) {
        this.drawDragDecoration = function1;
        this.dragAndDropSourceHandler = function2;
        final DragAndDropModifierNode dragAndDropModifierNode = (DragAndDropModifierNode) UR(DragAndDropNodeKt.n());
        UR(SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.1

            /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000_\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J?\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f*\u00020\u0015H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u0015*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u0015*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\u001a*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u00020\u0010*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u0010*\u00020\u0015H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\"R\u0014\u0010&\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b'\u0010%R$\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020)8V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"androidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode$1$1", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "eTf", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "", "How", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "I4p", "(J)I", "Z", "(J)F", "", "bzg", "(F)F", "rV9", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "Ik", "(J)J", CmcdData.STREAM_TYPE_LIVE, "tFV", "M", "ck", "(F)J", "ViF", "getDensity", "()F", "density", "yAc", "fontScale", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "T3L", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class C04981 implements DragAndDropSourceScope, PointerInputScope {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ LegacyDragAndDropSourceNode f16437O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final /* synthetic */ PointerInputScope f16438n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ DragAndDropModifierNode f16439t;

                @Override // androidx.compose.ui.unit.Density
                public int How(float f3) {
                    return this.f16438n.How(f3);
                }

                @Override // androidx.compose.ui.unit.Density
                public int I4p(long j2) {
                    return this.f16438n.I4p(j2);
                }

                @Override // androidx.compose.ui.unit.Density
                public long Ik(long j2) {
                    return this.f16438n.Ik(j2);
                }

                @Override // androidx.compose.ui.unit.Density
                public long M(long j2) {
                    return this.f16438n.M(j2);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public void T3L(boolean z2) {
                    this.f16438n.T3L(z2);
                }

                @Override // androidx.compose.ui.unit.Density
                public long ViF(float f3) {
                    return this.f16438n.ViF(f3);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                public float Z(long j2) {
                    return this.f16438n.Z(j2);
                }

                @Override // androidx.compose.ui.unit.Density
                public float bzg(float f3) {
                    return this.f16438n.bzg(f3);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                public long ck(float f3) {
                    return this.f16438n.ck(f3);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public Object eTf(Function2 function2, Continuation continuation) {
                    return this.f16438n.eTf(function2, continuation);
                }

                @Override // androidx.compose.ui.unit.Density
                public float getDensity() {
                    return this.f16438n.getDensity();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public ViewConfiguration getViewConfiguration() {
                    return this.f16438n.getViewConfiguration();
                }

                @Override // androidx.compose.ui.unit.Density
                public float l(float f3) {
                    return this.f16438n.l(f3);
                }

                @Override // androidx.compose.ui.unit.Density
                public float rV9(int i2) {
                    return this.f16438n.rV9(i2);
                }

                @Override // androidx.compose.ui.unit.Density
                public float tFV(long j2) {
                    return this.f16438n.tFV(j2);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                /* JADX INFO: renamed from: yAc */
                public float getFontScale() {
                    return this.f16438n.getFontScale();
                }

                C04981(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode, LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
                    this.f16439t = dragAndDropModifierNode;
                    this.f16437O = legacyDragAndDropSourceNode;
                    this.f16438n = pointerInputScope;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objInvoke = LegacyDragAndDropSourceNode.this.getDragAndDropSourceHandler().invoke(new C04981(pointerInputScope, dragAndDropModifierNode, LegacyDragAndDropSourceNode.this), continuation);
                return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
            }
        }));
    }
}
