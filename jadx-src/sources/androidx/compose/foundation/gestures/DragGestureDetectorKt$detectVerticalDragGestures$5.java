package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {510, 513, 521}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f16770O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function0 f16771Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function0 f16773o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function2 f16774r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f16775t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectVerticalDragGestures$5(Function1 function1, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.J2 = function1;
        this.f16774r = function2;
        this.f16773o = function0;
        this.f16771Z = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new DragGestureDetectorKt$detectVerticalDragGestures$5(this.J2, this.f16774r, this.f16773o, this.f16771Z, continuation);
        dragGestureDetectorKt$detectVerticalDragGestures$5.f16770O = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$detectVerticalDragGestures$5) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5;
        AwaitPointerEventScope awaitPointerEventScope;
        final Ref.FloatRef floatRef;
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$52;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16775t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        dragGestureDetectorKt$detectVerticalDragGestures$52 = this;
                        if (((Boolean) obj).booleanValue()) {
                            dragGestureDetectorKt$detectVerticalDragGestures$52.f16773o.invoke();
                        } else {
                            dragGestureDetectorKt$detectVerticalDragGestures$52.f16771Z.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef = (Ref.FloatRef) this.f16772n;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.f16770O;
                ResultKt.throwOnFailure(obj);
                dragGestureDetectorKt$detectVerticalDragGestures$52 = this;
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                    dragGestureDetectorKt$detectVerticalDragGestures$52.J2.invoke(Offset.nr(pointerInputChange.getPosition()));
                    dragGestureDetectorKt$detectVerticalDragGestures$52.f16774r.invoke(pointerInputChange, Boxing.boxFloat(floatRef.element));
                    long id = pointerInputChange.getId();
                    final Function2 function2 = dragGestureDetectorKt$detectVerticalDragGestures$52.f16774r;
                    Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                            n(pointerInputChange2);
                            return Unit.INSTANCE;
                        }

                        public final void n(PointerInputChange pointerInputChange2) {
                            function2.invoke(pointerInputChange2, Float.valueOf(Float.intBitsToFloat((int) (PointerEventKt.Uo(pointerInputChange2) & 4294967295L))));
                            pointerInputChange2.n();
                        }
                    };
                    dragGestureDetectorKt$detectVerticalDragGestures$52.f16770O = null;
                    dragGestureDetectorKt$detectVerticalDragGestures$52.f16772n = null;
                    dragGestureDetectorKt$detectVerticalDragGestures$52.f16775t = 3;
                    obj = DragGestureDetectorKt.WPU(awaitPointerEventScope2, id, function1, this);
                }
                return Unit.INSTANCE;
            }
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f16770O;
            ResultKt.throwOnFailure(obj);
            dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
            awaitPointerEventScope = awaitPointerEventScope3;
        } else {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.f16770O;
            this.f16770O = awaitPointerEventScope4;
            this.f16775t = 1;
            dragGestureDetectorKt$detectVerticalDragGestures$5 = this;
            obj = TapGestureDetectorKt.J2(awaitPointerEventScope4, false, null, dragGestureDetectorKt$detectVerticalDragGestures$5, 2, null);
            if (obj != coroutine_suspended) {
                awaitPointerEventScope = awaitPointerEventScope4;
            }
            return coroutine_suspended;
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
        floatRef = new Ref.FloatRef();
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$53 = dragGestureDetectorKt$detectVerticalDragGestures$5;
        long id2 = pointerInputChange2.getId();
        int type = pointerInputChange2.getType();
        Function2<PointerInputChange, Float, Unit> function22 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3, Float f3) {
                n(pointerInputChange3, f3.floatValue());
                return Unit.INSTANCE;
            }

            public final void n(PointerInputChange pointerInputChange3, float f3) {
                pointerInputChange3.n();
                floatRef.element = f3;
            }
        };
        dragGestureDetectorKt$detectVerticalDragGestures$53.f16770O = awaitPointerEventScope;
        dragGestureDetectorKt$detectVerticalDragGestures$53.f16772n = floatRef;
        dragGestureDetectorKt$detectVerticalDragGestures$53.f16775t = 2;
        obj = DragGestureDetectorKt.gh(awaitPointerEventScope, id2, type, function22, dragGestureDetectorKt$detectVerticalDragGestures$53);
        dragGestureDetectorKt$detectVerticalDragGestures$52 = dragGestureDetectorKt$detectVerticalDragGestures$53;
        if (obj != coroutine_suspended) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
