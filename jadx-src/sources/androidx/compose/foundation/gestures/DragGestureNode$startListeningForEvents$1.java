package androidx.compose.foundation.gestures;

import GJW.Lu;
import GJW.vd;
import ILs.CN3;
import androidx.compose.foundation.gestures.DragEvent;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {421, 423, 425, 432, 434, 437}, m = "invokeSuspend", n = {"$this$launch", a.f62811a, "$this$launch", a.f62811a, "$this$launch", a.f62811a, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16835O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16836n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DragGestureNode f16837r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16838t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, Continuation continuation) {
        super(2, continuation);
        this.f16837r = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.f16837r, continuation);
        dragGestureNode$startListeningForEvents$1.J2 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((DragGestureNode$startListeningForEvents$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "processDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "dragDelta"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {428}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Function1<? super DragEvent.DragDelta, ? extends Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f16839O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f16840n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ DragGestureNode f16841r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f16842t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef objectRef, DragGestureNode dragGestureNode, Continuation continuation) {
            super(2, continuation);
            this.J2 = objectRef;
            this.f16841r = dragGestureNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.J2, this.f16841r, continuation);
            anonymousClass1.f16839O = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function1 function1, Continuation continuation) {
            return ((AnonymousClass1) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            T t3;
            DragEvent.DragDelta dragDelta;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f16842t;
            if (i2 != 0) {
                if (i2 == 1) {
                    Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f16840n;
                    function1 = (Function1) this.f16839O;
                    ResultKt.throwOnFailure(obj);
                    T t4 = (DragEvent) obj;
                    objectRef.element = t4;
                    t3 = this.J2.element;
                    if ((t3 instanceof DragEvent.DragStopped) && !(t3 instanceof DragEvent.DragCancelled)) {
                        t4 = 0;
                        if (t3 instanceof DragEvent.DragDelta) {
                            dragDelta = (DragEvent.DragDelta) t3;
                        } else {
                            dragDelta = null;
                        }
                        if (dragDelta != null) {
                            function1.invoke(dragDelta);
                        }
                        objectRef = this.J2;
                        CN3 cn3 = this.f16841r.channel;
                        if (cn3 != null) {
                            this.f16839O = function1;
                            this.f16840n = objectRef;
                            this.f16842t = 1;
                            obj = cn3.KN(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            T t42 = (DragEvent) obj;
                        }
                        objectRef.element = t42;
                        t3 = this.J2.element;
                        if (t3 instanceof DragEvent.DragStopped) {
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            function1 = (Function1) this.f16839O;
            t3 = this.J2.element;
            if (t3 instanceof DragEvent.DragStopped) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        if (r7.f11(r6) != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:44:0x00da, B:40:0x00c1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:46:0x00de, B:19:0x005e], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[PHI: r1 r3
      0x0034: PHI (r1v14 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v19 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r3v8 GJW.vd) = (r3v5 GJW.vd), (r3v11 GJW.vd) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[PHI: r4
      0x005e: PHI (r4v7 GJW.vd) = (r4v0 GJW.vd), (r4v3 GJW.vd), (r4v3 GJW.vd), (r4v3 GJW.vd), (r4v5 GJW.vd), (r4v8 GJW.vd) binds: [B:18:0x0056, B:45:0x00dc, B:47:0x00eb, B:41:0x00d5, B:30:0x008e, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00da, B:46:0x00de), top: B:59:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00da, B:46:0x00de), top: B:59:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:19:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d5 -> B:19:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00dc -> B:19:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00eb -> B:19:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fb -> B:11:0x0027). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vd vdVar;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        vd vdVar2;
        vd vdVar3;
        T t3;
        DragGestureNode dragGestureNode;
        AnonymousClass1 anonymousClass1;
        T t4;
        T t5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f16835O) {
            case 0:
                ResultKt.throwOnFailure(obj);
                vdVar = (vd) this.J2;
                if (!Lu.KN(vdVar)) {
                    objectRef = new Ref.ObjectRef();
                    CN3 cn3 = this.f16837r.channel;
                    if (cn3 != null) {
                        this.J2 = vdVar;
                        this.f16836n = objectRef;
                        this.f16838t = objectRef;
                        this.f16835O = 1;
                        obj = cn3.KN(this);
                        if (obj != coroutine_suspended) {
                            objectRef2 = objectRef;
                            t4 = (DragEvent) obj;
                            objectRef.element = t4;
                            t5 = objectRef2.element;
                            if (t5 instanceof DragEvent.DragStarted) {
                                this.J2 = vdVar;
                                this.f16836n = objectRef2;
                                this.f16838t = null;
                                this.f16835O = 2;
                                if (this.f16837r.cAB((DragEvent.DragStarted) t5, this) != coroutine_suspended) {
                                    objectRef3 = objectRef2;
                                    vdVar2 = vdVar;
                                    dragGestureNode = this.f16837r;
                                    anonymousClass1 = new AnonymousClass1(objectRef3, dragGestureNode, null);
                                    this.J2 = vdVar2;
                                    this.f16836n = objectRef3;
                                    this.f16835O = 3;
                                    if (dragGestureNode.eOa(anonymousClass1, this) != coroutine_suspended) {
                                        vdVar = vdVar2;
                                        try {
                                        } catch (CancellationException unused) {
                                            vdVar3 = vdVar;
                                            DragGestureNode dragGestureNode2 = this.f16837r;
                                            this.J2 = vdVar3;
                                            this.f16836n = null;
                                            this.f16835O = 6;
                                            break;
                                        }
                                        t3 = objectRef3.element;
                                        if (t3 instanceof DragEvent.DragStopped) {
                                            DragGestureNode dragGestureNode3 = this.f16837r;
                                            Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                            this.J2 = vdVar;
                                            this.f16836n = null;
                                            this.f16835O = 4;
                                            if (dragGestureNode3.kR((DragEvent.DragStopped) t3, this) != coroutine_suspended) {
                                                if (!Lu.KN(vdVar)) {
                                                }
                                            }
                                        } else {
                                            if (t3 instanceof DragEvent.DragCancelled) {
                                                DragGestureNode dragGestureNode4 = this.f16837r;
                                                this.J2 = vdVar;
                                                this.f16836n = null;
                                                this.f16835O = 5;
                                                if (dragGestureNode4.f11(this) != coroutine_suspended) {
                                                }
                                            }
                                            if (!Lu.KN(vdVar)) {
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef;
                    t4 = 0;
                    objectRef.element = t4;
                    t5 = objectRef2.element;
                    if (t5 instanceof DragEvent.DragStarted) {
                    }
                    return coroutine_suspended;
                }
                break;
            case 1:
                objectRef = (Ref.ObjectRef) this.f16838t;
                objectRef2 = (Ref.ObjectRef) this.f16836n;
                vdVar = (vd) this.J2;
                ResultKt.throwOnFailure(obj);
                t4 = (DragEvent) obj;
                objectRef.element = t4;
                t5 = objectRef2.element;
                if (t5 instanceof DragEvent.DragStarted) {
                }
                return coroutine_suspended;
            case 2:
                objectRef3 = (Ref.ObjectRef) this.f16836n;
                vdVar2 = (vd) this.J2;
                ResultKt.throwOnFailure(obj);
                dragGestureNode = this.f16837r;
                anonymousClass1 = new AnonymousClass1(objectRef3, dragGestureNode, null);
                this.J2 = vdVar2;
                this.f16836n = objectRef3;
                this.f16835O = 3;
                if (dragGestureNode.eOa(anonymousClass1, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                objectRef3 = (Ref.ObjectRef) this.f16836n;
                vdVar2 = (vd) this.J2;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused2) {
                    vdVar3 = vdVar2;
                    DragGestureNode dragGestureNode22 = this.f16837r;
                    this.J2 = vdVar3;
                    this.f16836n = null;
                    this.f16835O = 6;
                }
                vdVar = vdVar2;
                t3 = objectRef3.element;
                if (t3 instanceof DragEvent.DragStopped) {
                }
                break;
            case 4:
                vdVar3 = (vd) this.J2;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused3) {
                    DragGestureNode dragGestureNode222 = this.f16837r;
                    this.J2 = vdVar3;
                    this.f16836n = null;
                    this.f16835O = 6;
                }
                vdVar = vdVar3;
                if (!Lu.KN(vdVar)) {
                }
                break;
            case 5:
                vdVar3 = (vd) this.J2;
                ResultKt.throwOnFailure(obj);
                vdVar = vdVar3;
                if (!Lu.KN(vdVar)) {
                }
                break;
            case 6:
                vdVar3 = (vd) this.J2;
                ResultKt.throwOnFailure(obj);
                vdVar = vdVar3;
                if (!Lu.KN(vdVar)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
