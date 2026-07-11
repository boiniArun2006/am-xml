package androidx.constraintlayout.compose;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2", f = "MotionDragHandler.kt", i = {0, 1, 1, 1}, l = {166, 174, 183}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop"}, s = {"L$0", "L$0", "L$1", "L$2"})
final class MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f34664O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Function0 f34665S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function2 f34666Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0 f34667g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function1 f34669o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function1 f34670r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f34671t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(Function1 function1, Function1 function12, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.f34670r = function1;
        this.f34669o = function12;
        this.f34666Z = function2;
        this.f34665S = function0;
        this.f34667g = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = new MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(this.f34670r, this.f34669o, this.f34666Z, this.f34665S, this.f34667g, continuation);
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.J2 = obj;
        return motionDragHandlerKt$detectDragGesturesWhenNeeded$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((MotionDragHandlerKt$detectDragGesturesWhenNeeded$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[PHI: r1 r4 r5 r8 r12
      0x0096: PHI (r1v5 kotlin.jvm.internal.Ref$LongRef) = (r1v4 kotlin.jvm.internal.Ref$LongRef), (r1v12 kotlin.jvm.internal.Ref$LongRef) binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r4v8 androidx.compose.ui.input.pointer.PointerInputChange) = 
      (r4v7 androidx.compose.ui.input.pointer.PointerInputChange)
      (r4v11 androidx.compose.ui.input.pointer.PointerInputChange)
     binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r5v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
      (r5v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
      (r5v10 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
     binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r8v3 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2) = 
      (r8v2 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2)
      (r8v6 androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2)
     binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r12v8 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:22:0x0093, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:24:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 motionDragHandlerKt$detectDragGesturesWhenNeeded$2;
        AwaitPointerEventScope awaitPointerEventScope;
        AwaitPointerEventScope awaitPointerEventScope2;
        final Ref.LongRef longRef;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f34664O;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = this;
                        if (!((Boolean) obj).booleanValue()) {
                            motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34665S.invoke();
                        } else {
                            motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34667g.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (Ref.LongRef) this.f34671t;
                pointerInputChange = (PointerInputChange) this.f34668n;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.J2;
                ResultKt.throwOnFailure(obj);
                motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = this;
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                if (pointerInputChange2 == null && !pointerInputChange2.ck()) {
                    long id = pointerInputChange.getId();
                    Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Offset offset) {
                            n(pointerInputChange3, offset.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(PointerInputChange pointerInputChange3, long j2) {
                            pointerInputChange3.n();
                            longRef.element = j2;
                        }
                    };
                    motionDragHandlerKt$detectDragGesturesWhenNeeded$2.J2 = awaitPointerEventScope2;
                    motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34668n = pointerInputChange;
                    motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34671t = longRef;
                    motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34664O = 2;
                    obj = DragGestureDetectorKt.xMQ(awaitPointerEventScope2, id, function2, this);
                    if (obj != coroutine_suspended) {
                        PointerInputChange pointerInputChange22 = (PointerInputChange) obj;
                        if (pointerInputChange22 == null) {
                        }
                        if (pointerInputChange22 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (pointerInputChange22 != null) {
                        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34669o.invoke(Offset.nr(pointerInputChange22.getPosition()));
                        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34666Z.invoke(pointerInputChange22, Offset.nr(longRef.element));
                        long id2 = pointerInputChange22.getId();
                        final Function2 function22 = motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34666Z;
                        Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                n(pointerInputChange3);
                                return Unit.INSTANCE;
                            }

                            public final void n(PointerInputChange pointerInputChange3) {
                                function22.invoke(pointerInputChange3, Offset.nr(PointerEventKt.Uo(pointerInputChange3)));
                                pointerInputChange3.n();
                            }
                        };
                        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.J2 = null;
                        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34668n = null;
                        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34671t = null;
                        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34664O = 3;
                        obj = DragGestureDetectorKt.o(awaitPointerEventScope2, id2, function1, this);
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.J2;
            ResultKt.throwOnFailure(obj);
            motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = this;
        } else {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.J2;
            this.J2 = awaitPointerEventScope3;
            this.f34664O = 1;
            motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = this;
            obj = TapGestureDetectorKt.J2(awaitPointerEventScope3, true, null, motionDragHandlerKt$detectDragGesturesWhenNeeded$2, 2, null);
            if (obj != coroutine_suspended) {
                awaitPointerEventScope = awaitPointerEventScope3;
            }
            return coroutine_suspended;
        }
        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
        if (!((Boolean) motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34670r.invoke(Offset.nr(pointerInputChange3.getPosition()))).booleanValue()) {
            return Unit.INSTANCE;
        }
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = Offset.INSTANCE.t();
        awaitPointerEventScope2 = awaitPointerEventScope;
        longRef = longRef2;
        pointerInputChange = pointerInputChange3;
        long id3 = pointerInputChange.getId();
        Function2<PointerInputChange, Offset, Unit> function23 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange32, Offset offset) {
                n(pointerInputChange32, offset.getPackedValue());
                return Unit.INSTANCE;
            }

            public final void n(PointerInputChange pointerInputChange32, long j2) {
                pointerInputChange32.n();
                longRef.element = j2;
            }
        };
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.J2 = awaitPointerEventScope2;
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34668n = pointerInputChange;
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34671t = longRef;
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.f34664O = 2;
        obj = DragGestureDetectorKt.xMQ(awaitPointerEventScope2, id3, function23, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
