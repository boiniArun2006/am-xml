package androidx.compose.foundation.gestures;

import GJW.C;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d*\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020 *\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001fJ\u0016\u0010\"\u001a\u00020\u0019*\u00020 H\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u0019*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\u00020 *\u00020 H\u0002ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\u00020\u001d*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u0015JO\u00103\u001a\u00020\u00132=\u00102\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00130+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001300\u0012\u0006\u0012\u0004\u0018\u0001010*H\u0096@¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u001dH\u0016ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u001a\u00108\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020 H\u0016ø\u0001\u0001¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010:J]\u0010;\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b;\u0010\u0012R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010AR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010K\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010F\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u0018R\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010:\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "startDragImmediately", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "<init>", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Ljava/lang/Boolean;Landroidx/compose/foundation/gestures/FlingBehavior;)V", "", "taU", "()V", "newFlingBehavior", "pt", "(Landroidx/compose/foundation/gestures/FlingBehavior;)V", "", "velocity", "ep", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "Pzf", "(F)J", "Landroidx/compose/ui/unit/Velocity;", "NQ2", "eF0", "(J)F", "DtL", "Q", "(J)J", "sYH", "c", "jB", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "dragDelta", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "eOa", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startedPosition", "Yq", "(J)V", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "yUZ", "()Z", "aJ", "B", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "J", "Landroidx/compose/foundation/gestures/Orientation;", "D", "Ljava/lang/Boolean;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/compose/foundation/OverscrollEffect;", "I", "GR", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Nxk", "X6", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "c2", "resolvedFlingBehavior", "Landroidx/compose/ui/unit/Density;", "Y", "Landroidx/compose/ui/unit/Density;", "density", "fwz", "isReverseDirection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1753:1\n1#2:1754\n30#3:1755\n53#4,3:1756\n70#4:1760\n60#4:1763\n69#5:1759\n65#5:1762\n22#6:1761\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableNode\n*L\n517#1:1755\n517#1:1756,3\n530#1:1760\n530#1:1763\n530#1:1759\n530#1:1762\n530#1:1761\n*E\n"})
final class AnchoredDraggableNode<T> extends DragGestureNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private AnchoredDraggableState state;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Boolean reverseDirection;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private FlingBehavior flingBehavior;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private Boolean startDragImmediately;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    public FlingBehavior resolvedFlingBehavior;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private OverscrollEffect overscrollEffect;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void Yq(long startedPosition) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float DtL(long j2) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.f16969n ? j2 & 4294967295L : j2 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long NQ2(float f3) {
        Orientation orientation = this.orientation;
        float f4 = orientation == Orientation.f16970t ? f3 : 0.0f;
        if (orientation != Orientation.f16969n) {
            f3 = 0.0f;
        }
        return VelocityKt.n(f4, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Pzf(float f3) {
        Orientation orientation = this.orientation;
        float f4 = orientation == Orientation.f16970t ? f3 : 0.0f;
        if (orientation != Orientation.f16969n) {
            f3 = 0.0f;
        }
        return Offset.O((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float eF0(long j2) {
        return this.orientation == Orientation.f16969n ? Velocity.xMQ(j2) : Velocity.KN(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ep(float f3, Continuation continuation) {
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$1;
        Ref.FloatRef floatRef;
        if (continuation instanceof AnchoredDraggableNode$fling$1) {
            anchoredDraggableNode$fling$1 = (AnchoredDraggableNode$fling$1) continuation;
            int i2 = anchoredDraggableNode$fling$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableNode$fling$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(this, continuation);
            }
        }
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$12 = anchoredDraggableNode$fling$1;
        Object obj = anchoredDraggableNode$fling$12.f16522t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anchoredDraggableNode$fling$12.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.state.WPU()) {
                AnchoredDraggableState anchoredDraggableState = this.state;
                anchoredDraggableNode$fling$12.J2 = 1;
                Object objS7N = anchoredDraggableState.s7N(f3, anchoredDraggableNode$fling$12);
                if (objS7N != coroutine_suspended) {
                    return objS7N;
                }
            } else {
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = f3;
                AnchoredDraggableState anchoredDraggableState2 = this.state;
                AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this, floatRef2, f3, null);
                anchoredDraggableNode$fling$12.f16521n = floatRef2;
                anchoredDraggableNode$fling$12.J2 = 2;
                if (AnchoredDraggableState.mUb(anchoredDraggableState2, null, anchoredDraggableNode$fling$2, anchoredDraggableNode$fling$12, 1, null) != coroutine_suspended) {
                    floatRef = floatRef2;
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        floatRef = (Ref.FloatRef) anchoredDraggableNode$fling$12.f16521n;
        ResultKt.throwOnFailure(obj);
        return Boxing.boxFloat(floatRef.element);
    }

    private final boolean fwz() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return DelegatableNodeKt.ty(this) == LayoutDirection.f34161t && this.orientation == Orientation.f16970t;
        }
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    private final void pt(FlingBehavior newFlingBehavior) {
        if (newFlingBehavior == null) {
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.f16446n;
            AnimationSpec animationSpecT = anchoredDraggableDefaults.t();
            Function1 function1Rl = anchoredDraggableDefaults.rl();
            Density densityGh = DelegatableNodeKt.gh(this);
            this.density = densityGh;
            newFlingBehavior = AnchoredDraggableKt.mUb(this.state, densityGh, function1Rl, animationSpecT);
        }
        c2(newFlingBehavior);
    }

    public final FlingBehavior X6() {
        FlingBehavior flingBehavior = this.resolvedFlingBehavior;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resolvedFlingBehavior");
        return null;
    }

    public final void aJ(AnchoredDraggableState state, Orientation orientation, boolean enabled, Boolean reverseDirection, MutableInteractionSource interactionSource, OverscrollEffect overscrollEffect, Boolean startDragImmediately, FlingBehavior flingBehavior) {
        boolean z2;
        boolean z3;
        this.flingBehavior = flingBehavior;
        if (Intrinsics.areEqual(this.state, state)) {
            z2 = false;
        } else {
            this.state = state;
            pt(flingBehavior);
            z2 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z2 = true;
        }
        if (Intrinsics.areEqual(this.reverseDirection, reverseDirection)) {
            z3 = z2;
        } else {
            this.reverseDirection = reverseDirection;
            z3 = true;
        }
        this.startDragImmediately = startDragImmediately;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.YE(this, null, enabled, interactionSource, orientation, z3, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        pt(this.flingBehavior);
    }

    public final void c2(FlingBehavior flingBehavior) {
        this.resolvedFlingBehavior = flingBehavior;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object eOa(Function2 function2, Continuation continuation) {
        Object objMUb = AnchoredDraggableState.mUb(this.state, null, new AnchoredDraggableNode$drag$2(function2, this, null), continuation, 1, null);
        return objMUb == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMUb : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean yUZ() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.ViF();
    }

    public AnchoredDraggableNode(AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z2, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        super(AnchoredDraggableKt.f16456n, z2, mutableInteractionSource, orientation);
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.reverseDirection = bool;
        this.overscrollEffect = overscrollEffect;
        this.startDragImmediately = bool2;
        this.flingBehavior = flingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Q(long j2) {
        float f3;
        if (fwz()) {
            f3 = -1.0f;
        } else {
            f3 = 1.0f;
        }
        return Velocity.az(j2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long sYH(long j2) {
        float f3;
        if (fwz()) {
            f3 = -1.0f;
        } else {
            f3 = 1.0f;
        }
        return Offset.r(j2, f3);
    }

    private final void taU() {
        Density densityGh = DelegatableNodeKt.gh(this);
        Density density = this.density;
        if (density != null && Intrinsics.areEqual(density, densityGh)) {
            return;
        }
        this.density = densityGh;
        pt(this.flingBehavior);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void G(long velocity) {
        if (getIsAttached()) {
            C.nr(Xli(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, velocity, null), 3, null);
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void jB() {
        lNy();
        if (getIsAttached()) {
            taU();
        }
    }
}
