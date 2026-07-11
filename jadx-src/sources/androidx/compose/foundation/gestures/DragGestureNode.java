package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import ILs.CN3;
import ILs.aC;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010%\u001a\u00020\u000e2=\u0010$\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001dH¦@¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H&ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020\u0005H&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010\u0010J*\u00107\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0010J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u0010\u0010JO\u0010<\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010;\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R<\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR$\u0010\u0007\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010/R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010@\u001a\u0004\u0018\u00010\b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010BR\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010FR\u0018\u0010[\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "<init>", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V", "", "Bha", "()V", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "R3E", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", a.f62811a, "cAB", "(Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "kR", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f11", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "dragDelta", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "eOa", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "startedPosition", "Yq", "(J)V", "Landroidx/compose/ui/unit/Velocity;", "velocity", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "yUZ", "()Z", "Sax", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "lNy", "kC", "shouldResetPointerInputHandling", "H6M", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;Z)V", "jB", "Landroidx/compose/foundation/gestures/Orientation;", "<set-?>", "U", "Lkotlin/jvm/functions/Function1;", "i7", "()Lkotlin/jvm/functions/Function1;", "P5", "Z", "VK2", "M7", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p5", "_canDrag", "LILs/CN3;", "Landroidx/compose/foundation/gestures/DragEvent;", "eF", "LILs/CN3;", "channel", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "E", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragInteraction", "M", "isListeningForEvents", "FX", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DragGestureNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,640:1\n1#2:641\n*E\n"})
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private DragInteraction.Start dragInteraction;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private SuspendingPointerInputModifierNode pointerInputNode;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean isListeningForEvents;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private MutableInteractionSource interactionSource;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Function1 canDrag;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private CN3 channel;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Orientation orientationLock;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Function1 _canDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$_canDrag$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return (Boolean) this.f16804n.getCanDrag().invoke(pointerInputChange);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void Bha() {
        this.isListeningForEvents = true;
        C.nr(Xli(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3, null);
    }

    public abstract void G(long velocity);

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        this.isListeningForEvents = false;
        kC();
    }

    public abstract void Yq(long startedPosition);

    public abstract Object eOa(Function2 function2, Continuation continuation);

    public abstract boolean yUZ();

    private final SuspendingPointerInputModifierNode R3E() {
        return SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {512}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerInputScope J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ DragGestureNode f16806O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                final /* synthetic */ Function0 f16807S;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ Function0 f16808Z;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2 f16809g;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f16810n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Function1 f16811o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Function3 f16812r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f16813t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
                    super(2, continuation);
                    this.f16806O = dragGestureNode;
                    this.J2 = pointerInputScope;
                    this.f16812r = function3;
                    this.f16811o = function1;
                    this.f16808Z = function0;
                    this.f16807S = function02;
                    this.f16809g = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f16806O, this.J2, this.f16812r, this.f16811o, this.f16808Z, this.f16807S, this.f16809g, continuation);
                    anonymousClass1.f16813t = obj;
                    return anonymousClass1;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(vd vdVar, Continuation continuation) {
                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    vd vdVar;
                    AnonymousClass1 anonymousClass1;
                    CancellationException cancellationException;
                    CN3 cn3;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f16810n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            vdVar = (vd) this.f16813t;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (CancellationException e2) {
                                cancellationException = e2;
                                anonymousClass1 = this;
                                cn3 = anonymousClass1.f16806O.channel;
                                if (cn3 != null) {
                                }
                                if (!Lu.KN(vdVar)) {
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        vdVar = (vd) this.f16813t;
                        try {
                            Orientation orientation = this.f16806O.orientationLock;
                            PointerInputScope pointerInputScope = this.J2;
                            Function3 function3 = this.f16812r;
                            Function1 function1 = this.f16811o;
                            Function0 function0 = this.f16808Z;
                            Function0 function02 = this.f16807S;
                            Function2 function2 = this.f16809g;
                            this.f16813t = vdVar;
                            this.f16810n = 1;
                            anonymousClass1 = this;
                            try {
                                if (DragGestureDetectorKt.ty(pointerInputScope, function3, function1, function0, function02, orientation, function2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (CancellationException e3) {
                                e = e3;
                                cancellationException = e;
                                cn3 = anonymousClass1.f16806O.channel;
                                if (cn3 != null) {
                                    ILs.C.rl(cn3.nr(DragEvent.DragCancelled.f16654n));
                                }
                                if (!Lu.KN(vdVar)) {
                                    throw cancellationException;
                                }
                            }
                        } catch (CancellationException e4) {
                            e = e4;
                            anonymousClass1 = this;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
                final VelocityTracker velocityTracker = new VelocityTracker();
                final DragGestureNode dragGestureNode = this.f16805n;
                Function3<PointerInputChange, PointerInputChange, Offset, Unit> function3 = new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                        n(pointerInputChange, pointerInputChange2, offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j2) {
                        if (((Boolean) dragGestureNode.getCanDrag().invoke(pointerInputChange)).booleanValue()) {
                            if (!dragGestureNode.isListeningForEvents) {
                                if (dragGestureNode.channel == null) {
                                    dragGestureNode.channel = aC.rl(Integer.MAX_VALUE, null, null, 6, null);
                                }
                                dragGestureNode.Bha();
                            }
                            VelocityTrackerKt.t(velocityTracker, pointerInputChange);
                            long jCk = Offset.ck(pointerInputChange2.getPosition(), j2);
                            CN3 cn3 = dragGestureNode.channel;
                            if (cn3 != null) {
                                ILs.C.rl(cn3.nr(new DragEvent.DragStarted(jCk, null)));
                            }
                        }
                    }
                };
                final DragGestureNode dragGestureNode2 = this.f16805n;
                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                        n(pointerInputChange);
                        return Unit.INSTANCE;
                    }

                    public final void n(PointerInputChange pointerInputChange) {
                        VelocityTrackerKt.t(velocityTracker, pointerInputChange);
                        float fJ2 = pointerInputScope.getViewConfiguration().J2();
                        long jT2 = velocityTracker.t(VelocityKt.n(fJ2, fJ2));
                        velocityTracker.J2();
                        CN3 cn3 = dragGestureNode2.channel;
                        if (cn3 != null) {
                            ILs.C.rl(cn3.nr(new DragEvent.DragStopped(DraggableKt.qie(jT2), null)));
                        }
                    }
                };
                final DragGestureNode dragGestureNode3 = this.f16805n;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
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
                        CN3 cn3 = dragGestureNode3.channel;
                        if (cn3 != null) {
                            ILs.C.rl(cn3.nr(DragEvent.DragCancelled.f16654n));
                        }
                    }
                };
                final DragGestureNode dragGestureNode4 = this.f16805n;
                Function0<Boolean> function02 = new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        return Boolean.valueOf(!dragGestureNode4.yUZ());
                    }
                };
                final DragGestureNode dragGestureNode5 = this.f16805n;
                Object objJ2 = Lu.J2(new AnonymousClass1(this.f16805n, pointerInputScope, function3, function1, function0, function02, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                        n(pointerInputChange, offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(PointerInputChange pointerInputChange, long j2) {
                        VelocityTrackerKt.t(velocityTracker, pointerInputChange);
                        CN3 cn3 = dragGestureNode5.channel;
                        if (cn3 != null) {
                            ILs.C.rl(cn3.nr(new DragEvent.DragDelta(j2, null)));
                        }
                    }
                }, null), continuation);
                return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
            }
        });
    }

    public static /* synthetic */ void YE(DragGestureNode dragGestureNode, Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i2 & 1) != 0) {
            function1 = dragGestureNode.canDrag;
        }
        if ((i2 & 2) != 0) {
            z2 = dragGestureNode.enabled;
        }
        if ((i2 & 4) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        if ((i2 & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i2 & 16) != 0) {
            z3 = false;
        }
        boolean z4 = z3;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Function1 function12 = function1;
        dragGestureNode.H6M(function12, z2, mutableInteractionSource2, orientation, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r2.n(r5, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cAB(DragEvent.DragStarted dragStarted, Continuation continuation) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        DragGestureNode dragGestureNode;
        DragInteraction.Start start;
        DragEvent.DragStarted dragStarted2;
        DragInteraction.Start start2;
        DragGestureNode dragGestureNode2;
        if (continuation instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) continuation;
            int i2 = dragGestureNode$processDragStart$1.f16828o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.f16828o = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(this, continuation);
            }
        }
        Object obj = dragGestureNode$processDragStart$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureNode$processDragStart$1.f16828o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start3 = this.dragInteraction;
            if (start3 != null && (r2 = this.interactionSource) != null) {
                DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
                dragGestureNode$processDragStart$1.f16827n = this;
                dragGestureNode$processDragStart$1.f16830t = dragStarted;
                dragGestureNode$processDragStart$1.f16828o = 1;
            }
            dragGestureNode = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                start2 = (DragInteraction.Start) dragGestureNode$processDragStart$1.f16826O;
                dragStarted2 = (DragEvent.DragStarted) dragGestureNode$processDragStart$1.f16830t;
                dragGestureNode2 = (DragGestureNode) dragGestureNode$processDragStart$1.f16827n;
                ResultKt.throwOnFailure(obj);
                start = start2;
                dragGestureNode = dragGestureNode2;
                dragStarted = dragStarted2;
                dragGestureNode.dragInteraction = start;
                dragGestureNode.Yq(dragStarted.getStartPoint());
                return Unit.INSTANCE;
            }
            dragStarted = (DragEvent.DragStarted) dragGestureNode$processDragStart$1.f16830t;
            dragGestureNode = (DragGestureNode) dragGestureNode$processDragStart$1.f16827n;
            ResultKt.throwOnFailure(obj);
        }
        start = new DragInteraction.Start();
        MutableInteractionSource mutableInteractionSource = dragGestureNode.interactionSource;
        if (mutableInteractionSource != null) {
            dragGestureNode$processDragStart$1.f16827n = dragGestureNode;
            dragGestureNode$processDragStart$1.f16830t = dragStarted;
            dragGestureNode$processDragStart$1.f16826O = start;
            dragGestureNode$processDragStart$1.f16828o = 2;
            if (mutableInteractionSource.n(start, dragGestureNode$processDragStart$1) != coroutine_suspended) {
                dragStarted2 = dragStarted;
                start2 = start;
                dragGestureNode2 = dragGestureNode;
                start = start2;
                dragGestureNode = dragGestureNode2;
                dragStarted = dragStarted2;
            }
            return coroutine_suspended;
        }
        dragGestureNode.dragInteraction = start;
        dragGestureNode.Yq(dragStarted.getStartPoint());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f11(Continuation continuation) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        DragGestureNode dragGestureNode;
        if (continuation instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) continuation;
            int i2 = dragGestureNode$processDragCancel$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(this, continuation);
            }
        }
        Object obj = dragGestureNode$processDragCancel$1.f16825t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureNode$processDragCancel$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start = this.dragInteraction;
            if (start == null) {
                dragGestureNode = this;
                dragGestureNode.G(Velocity.INSTANCE.n());
                return Unit.INSTANCE;
            }
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                dragGestureNode$processDragCancel$1.f16824n = this;
                dragGestureNode$processDragCancel$1.J2 = 1;
                if (mutableInteractionSource.n(cancel, dragGestureNode$processDragCancel$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            dragGestureNode = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dragGestureNode = (DragGestureNode) dragGestureNode$processDragCancel$1.f16824n;
            ResultKt.throwOnFailure(obj);
        }
        dragGestureNode.dragInteraction = null;
        dragGestureNode.G(Velocity.INSTANCE.n());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object kR(DragEvent.DragStopped dragStopped, Continuation continuation) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        DragGestureNode dragGestureNode;
        if (continuation instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) continuation;
            int i2 = dragGestureNode$processDragStop$1.f16833r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.f16833r = i2 - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(this, continuation);
            }
        }
        Object obj = dragGestureNode$processDragStop$1.f16831O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dragGestureNode$processDragStop$1.f16833r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            DragInteraction.Start start = this.dragInteraction;
            if (start == null) {
                dragGestureNode = this;
                dragGestureNode.G(dragStopped.getVelocity());
                return Unit.INSTANCE;
            }
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                DragInteraction.Stop stop = new DragInteraction.Stop(start);
                dragGestureNode$processDragStop$1.f16832n = this;
                dragGestureNode$processDragStop$1.f16834t = dragStopped;
                dragGestureNode$processDragStop$1.f16833r = 1;
                if (mutableInteractionSource.n(stop, dragGestureNode$processDragStop$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            dragGestureNode = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dragStopped = (DragEvent.DragStopped) dragGestureNode$processDragStop$1.f16834t;
            dragGestureNode = (DragGestureNode) dragGestureNode$processDragStop$1.f16832n;
            ResultKt.throwOnFailure(obj);
        }
        dragGestureNode.dragInteraction = null;
        dragGestureNode.G(dragStopped.getVelocity());
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) UR(R3E());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.C(pointerEvent, pass, bounds);
        }
    }

    public final void H6M(Function1 canDrag, boolean enabled, MutableInteractionSource interactionSource, Orientation orientationLock, boolean shouldResetPointerInputHandling) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.canDrag = canDrag;
        boolean z2 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                kC();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.pointerInputNode;
                if (suspendingPointerInputModifierNode2 != null) {
                    ex(suspendingPointerInputModifierNode2);
                }
                this.pointerInputNode = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            kC();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z2 = shouldResetPointerInputHandling;
        }
        if (!z2 || (suspendingPointerInputModifierNode = this.pointerInputNode) == null) {
            return;
        }
        suspendingPointerInputModifierNode.p0N();
    }

    /* JADX INFO: renamed from: VK2, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: i7, reason: from getter */
    protected final Function1 getCanDrag() {
        return this.canDrag;
    }

    public final void kC() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.rl(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void lNy() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.lNy();
        }
    }

    public DragGestureNode(Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = function1;
        this.enabled = z2;
        this.interactionSource = mutableInteractionSource;
    }
}
