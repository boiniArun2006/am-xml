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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {661, 664, 672}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f16759O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function0 f16760Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function0 f16762o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function2 f16763r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f16764t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectHorizontalDragGestures$5(Function1 function1, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.J2 = function1;
        this.f16763r = function2;
        this.f16762o = function0;
        this.f16760Z = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.J2, this.f16763r, this.f16762o, this.f16760Z, continuation);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.f16759O = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5;
        AwaitPointerEventScope awaitPointerEventScope;
        final Ref.FloatRef floatRef;
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$52;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16764t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        dragGestureDetectorKt$detectHorizontalDragGestures$52 = this;
                        if (((Boolean) obj).booleanValue()) {
                            dragGestureDetectorKt$detectHorizontalDragGestures$52.f16762o.invoke();
                        } else {
                            dragGestureDetectorKt$detectHorizontalDragGestures$52.f16760Z.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef = (Ref.FloatRef) this.f16761n;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.f16759O;
                ResultKt.throwOnFailure(obj);
                dragGestureDetectorKt$detectHorizontalDragGestures$52 = this;
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                    dragGestureDetectorKt$detectHorizontalDragGestures$52.J2.invoke(Offset.nr(pointerInputChange.getPosition()));
                    dragGestureDetectorKt$detectHorizontalDragGestures$52.f16763r.invoke(pointerInputChange, Boxing.boxFloat(floatRef.element));
                    long id = pointerInputChange.getId();
                    final Function2 function2 = dragGestureDetectorKt$detectHorizontalDragGestures$52.f16763r;
                    Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                            n(pointerInputChange2);
                            return Unit.INSTANCE;
                        }

                        public final void n(PointerInputChange pointerInputChange2) {
                            function2.invoke(pointerInputChange2, Float.valueOf(Float.intBitsToFloat((int) (PointerEventKt.Uo(pointerInputChange2) >> 32))));
                            pointerInputChange2.n();
                        }
                    };
                    dragGestureDetectorKt$detectHorizontalDragGestures$52.f16759O = null;
                    dragGestureDetectorKt$detectHorizontalDragGestures$52.f16761n = null;
                    dragGestureDetectorKt$detectHorizontalDragGestures$52.f16764t = 3;
                    obj = DragGestureDetectorKt.Z(awaitPointerEventScope2, id, function1, this);
                }
                return Unit.INSTANCE;
            }
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f16759O;
            ResultKt.throwOnFailure(obj);
            dragGestureDetectorKt$detectHorizontalDragGestures$5 = this;
            awaitPointerEventScope = awaitPointerEventScope3;
        } else {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.f16759O;
            this.f16759O = awaitPointerEventScope4;
            this.f16764t = 1;
            dragGestureDetectorKt$detectHorizontalDragGestures$5 = this;
            obj = TapGestureDetectorKt.J2(awaitPointerEventScope4, false, null, dragGestureDetectorKt$detectHorizontalDragGestures$5, 2, null);
            if (obj != coroutine_suspended) {
                awaitPointerEventScope = awaitPointerEventScope4;
            }
            return coroutine_suspended;
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
        floatRef = new Ref.FloatRef();
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$53 = dragGestureDetectorKt$detectHorizontalDragGestures$5;
        long id2 = pointerInputChange2.getId();
        int type = pointerInputChange2.getType();
        Function2<PointerInputChange, Float, Unit> function22 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
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
        dragGestureDetectorKt$detectHorizontalDragGestures$53.f16759O = awaitPointerEventScope;
        dragGestureDetectorKt$detectHorizontalDragGestures$53.f16761n = floatRef;
        dragGestureDetectorKt$detectHorizontalDragGestures$53.f16764t = 2;
        obj = DragGestureDetectorKt.O(awaitPointerEventScope, id2, type, function22, dragGestureDetectorKt$detectHorizontalDragGestures$53);
        dragGestureDetectorKt$detectHorizontalDragGestures$52 = dragGestureDetectorKt$detectHorizontalDragGestures$53;
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
