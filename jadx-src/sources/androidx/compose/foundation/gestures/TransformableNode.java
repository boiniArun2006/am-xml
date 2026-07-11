package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.Lu;
import GJW.h;
import GJW.vd;
import ILs.CN3;
import ILs.aC;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import com.safedk.android.analytics.events.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\rJ*\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/foundation/gestures/TransformableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "canPan", "lockRotationOnZoomPan", "enabled", "<init>", "(Landroidx/compose/foundation/gestures/TransformableState;Lkotlin/jvm/functions/Function1;ZZ)V", "", "c", "()V", "ZwA", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "lNy", "jB", "Landroidx/compose/foundation/gestures/TransformableState;", "U", "Lkotlin/jvm/functions/Function1;", "P5", "Z", "M7", "p5", "updatedCanPan", "LILs/CN3;", "Landroidx/compose/foundation/gestures/TransformEvent;", "eF", "LILs/CN3;", "channel", "Landroidx/compose/foundation/gestures/ScrollConfig;", "E", "Landroidx/compose/foundation/gestures/ScrollConfig;", "scrollConfig", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "M", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "FX", "Landroidx/compose/ui/node/PointerInputModifierNode;", "pointerInputModifierMouse", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,399:1\n102#2,2:400\n34#2,6:402\n104#2:408\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableNode\n*L\n238#1:400,2\n238#1:402,6\n238#1:408\n*E\n"})
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private ScrollConfig scrollConfig;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private PointerInputModifierNode pointerInputModifierMouse;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean lockRotationOnZoomPan;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Function1 canPan;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private TransformableState state;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Function1 updatedCanPan = new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableNode$updatedCanPan$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
            return n(offset.getPackedValue());
        }

        public final Boolean n(long j2) {
            return (Boolean) this.f17236n.canPan.invoke(Offset.nr(j2));
        }
    };

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final CN3 channel = aC.rl(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) UR(SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
            final /* synthetic */ TransformableNode J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ PointerInputScope f17222O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17223n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f17224t;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", i = {0, 0, 1}, l = {175, 178}, m = "invokeSuspend", n = {"$this$launch", a.f62811a, "$this$launch"}, s = {"L$0", "L$1", "L$0"})
            static final class C05031 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                int f17225O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f17226n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ TransformableNode f17227r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f17228t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C05031(TransformableNode transformableNode, Continuation continuation) {
                    super(2, continuation);
                    this.f17227r = transformableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C05031 c05031 = new C05031(this.f17227r, continuation);
                    c05031.J2 = obj;
                    return c05031;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(vd vdVar, Continuation continuation) {
                    return ((C05031) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", i = {0}, l = {187}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
                static final class C05041 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.ObjectRef J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    private /* synthetic */ Object f17229O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f17230n;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ TransformableNode f17231r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f17232t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C05041(Ref.ObjectRef objectRef, TransformableNode transformableNode, Continuation continuation) {
                        super(2, continuation);
                        this.J2 = objectRef;
                        this.f17231r = transformableNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C05041 c05041 = new C05041(this.J2, this.f17231r, continuation);
                        c05041.f17229O = obj;
                        return c05041;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(TransformScope transformScope, Continuation continuation) {
                        return ((C05041) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:20:0x005d). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        TransformScope transformScope;
                        T t3;
                        TransformEvent.TransformDelta transformDelta;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f17232t;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f17230n;
                                transformScope = (TransformScope) this.f17229O;
                                ResultKt.throwOnFailure(obj);
                                T t4 = obj;
                                objectRef.element = t4;
                                t3 = this.J2.element;
                                if (!(t3 instanceof TransformEvent.TransformStopped)) {
                                    if (t3 instanceof TransformEvent.TransformDelta) {
                                        transformDelta = (TransformEvent.TransformDelta) t3;
                                    } else {
                                        transformDelta = null;
                                    }
                                    if (transformDelta != null) {
                                        transformScope.n(transformDelta.getZoomChange(), transformDelta.getPanChange(), transformDelta.getRotationChange());
                                    }
                                    objectRef = this.J2;
                                    CN3 cn3 = this.f17231r.channel;
                                    this.f17229O = transformScope;
                                    this.f17230n = objectRef;
                                    this.f17232t = 1;
                                    Object objKN = cn3.KN(this);
                                    t4 = objKN;
                                    if (objKN == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    objectRef.element = t4;
                                    t3 = this.J2.element;
                                    if (!(t3 instanceof TransformEvent.TransformStopped)) {
                                    }
                                } else {
                                    return Unit.INSTANCE;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            transformScope = (TransformScope) this.f17229O;
                            t3 = this.J2.element;
                            if (!(t3 instanceof TransformEvent.TransformStopped)) {
                            }
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
                
                    if (r10.n(r1, r6, r9) == r0) goto L23;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:13:0x0036). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    vd vdVar;
                    T t3;
                    vd vdVar2;
                    Ref.ObjectRef objectRef;
                    Ref.ObjectRef objectRef2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f17225O;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                vd vdVar3 = (vd) this.J2;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                } catch (CancellationException unused) {
                                }
                                vdVar = vdVar3;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            objectRef2 = (Ref.ObjectRef) this.f17228t;
                            objectRef = (Ref.ObjectRef) this.f17226n;
                            vdVar2 = (vd) this.J2;
                            ResultKt.throwOnFailure(obj);
                            t3 = obj;
                            objectRef2.element = t3;
                            if (objectRef.element instanceof TransformEvent.TransformStarted) {
                                TransformableState transformableState = this.f17227r.state;
                                MutatePriority mutatePriority = MutatePriority.f16229t;
                                C05041 c05041 = new C05041(objectRef, this.f17227r, null);
                                this.J2 = vdVar2;
                                this.f17226n = null;
                                this.f17228t = null;
                                this.f17225O = 2;
                            }
                            vdVar = vdVar2;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        vdVar = (vd) this.J2;
                    }
                    if (!Lu.KN(vdVar)) {
                        objectRef2 = new Ref.ObjectRef();
                        CN3 cn3 = this.f17227r.channel;
                        this.J2 = vdVar;
                        this.f17226n = objectRef2;
                        this.f17228t = objectRef2;
                        this.f17225O = 1;
                        Object objKN = cn3.KN(this);
                        if (objKN != coroutine_suspended) {
                            vdVar2 = vdVar;
                            t3 = objKN;
                            objectRef = objectRef2;
                            objectRef2.element = t3;
                            if (objectRef.element instanceof TransformEvent.TransformStarted) {
                            }
                            vdVar = vdVar2;
                            if (!Lu.KN(vdVar)) {
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ vd J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ TransformableNode f17233O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f17234n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f17235t;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f17233O, this.J2, continuation);
                    anonymousClass2.f17235t = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TransformableNode transformableNode, vd vdVar, Continuation continuation) {
                    super(2, continuation);
                    this.f17233O = transformableNode;
                    this.J2 = vdVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f17234n;
                    try {
                        try {
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f17235t;
                                boolean z2 = this.f17233O.lockRotationOnZoomPan;
                                CN3 cn3 = this.f17233O.channel;
                                Function1 function1 = this.f17233O.updatedCanPan;
                                this.f17234n = 1;
                                if (TransformableKt.Uo(awaitPointerEventScope, z2, cn3, function1, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } catch (CancellationException e2) {
                            if (!Lu.KN(this.J2)) {
                                throw e2;
                            }
                        }
                        return Unit.INSTANCE;
                    } finally {
                        this.f17233O.channel.nr(TransformEvent.TransformStopped.f17180n);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, Continuation continuation) {
                super(2, continuation);
                this.f17222O = pointerInputScope;
                this.J2 = transformableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f17222O, this.J2, continuation);
                anonymousClass1.f17224t = obj;
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

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f17223n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f17224t;
                    C.nr(vdVar, null, h.J2, new C05031(this.J2, null), 1, null);
                    PointerInputScope pointerInputScope = this.f17222O;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.J2, vdVar, null);
                    this.f17223n = 1;
                    if (ForEachGestureKt.O(pointerInputScope, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            if (!this.f17221n.enabled) {
                return Unit.INSTANCE;
            }
            Object objJ2 = Lu.J2(new AnonymousClass1(pointerInputScope, this.f17221n, null), continuation);
            return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
        }
    }));

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        final ScrollConfig scrollConfig = this.scrollConfig;
        if (this.enabled) {
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!PointerType.KN(((PointerInputChange) changes.get(i2)).getType(), PointerType.INSTANCE.rl())) {
                    i2++;
                } else if (scrollConfig != null && this.pointerInputModifierMouse == null) {
                    this.pointerInputModifierMouse = (PointerInputModifierNode) UR(SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$onPointerEvent$2
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objKN = TransformableKt.KN(pointerInputScope, this.f17219n.channel, scrollConfig, continuation);
                            return objKN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objKN : Unit.INSTANCE;
                        }
                    }));
                }
            }
        }
        this.pointerInputNode.C(pointerEvent, pass, bounds);
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.C(pointerEvent, pass, bounds);
        }
    }

    public final void ZwA(TransformableState state, Function1 canPan, boolean lockRotationOnZoomPan, boolean enabled) {
        this.canPan = canPan;
        if (Intrinsics.areEqual(this.state, state) && this.enabled == enabled && this.lockRotationOnZoomPan == lockRotationOnZoomPan) {
            return;
        }
        this.state = state;
        this.enabled = enabled;
        this.lockRotationOnZoomPan = lockRotationOnZoomPan;
        this.pointerInputNode.p0N();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void lNy() {
        this.pointerInputNode.lNy();
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.lNy();
        }
    }

    public TransformableNode(TransformableState transformableState, Function1 function1, boolean z2, boolean z3) {
        this.state = transformableState;
        this.canPan = function1;
        this.lockRotationOnZoomPan = z2;
        this.enabled = z3;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        super.c();
        this.scrollConfig = AndroidScrollable_androidKt.n(this);
    }
}
