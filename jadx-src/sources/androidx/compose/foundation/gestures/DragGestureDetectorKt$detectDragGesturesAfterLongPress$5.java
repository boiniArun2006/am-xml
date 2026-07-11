package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {354, 355, 360}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1045:1\n34#2,6:1046\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n366#1:1046,6\n*E\n"})
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function1 f16750O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function2 f16752o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function0 f16753r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16754t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f16750O = function1;
        this.J2 = function0;
        this.f16753r = function02;
        this.f16752o = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.f16750O, this.J2, this.f16753r, this.f16752o, continuation);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16754t = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: CancellationException -> 0x00b3, PHI: r1 r8 r12
      0x0064: PHI (r1v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
      (r1v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
      (r1v9 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
     binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r8v6 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) = 
      (r8v2 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
      (r8v7 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
     binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r12v12 java.lang.Object) = (r12v0 java.lang.Object), (r12v18 java.lang.Object) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[Catch: CancellationException -> 0x00b3, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: CancellationException -> 0x00b3, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: CancellationException -> 0x00b3, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
        AwaitPointerEventScope awaitPointerEventScope;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16751n;
        if (i2 != 0) {
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            awaitPointerEventScope2 = (AwaitPointerEventScope) this.f16754t;
                            ResultKt.throwOnFailure(obj);
                            dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
                            if (!((Boolean) obj).booleanValue()) {
                                List changes = awaitPointerEventScope2.UF().getChanges();
                                int size = changes.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    PointerInputChange pointerInputChange2 = (PointerInputChange) changes.get(i3);
                                    if (PointerEventKt.t(pointerInputChange2)) {
                                        pointerInputChange2.n();
                                    }
                                }
                                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.J2.invoke();
                            } else {
                                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16753r.invoke();
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f16754t;
                        ResultKt.throwOnFailure(obj);
                        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16750O.invoke(Offset.nr(pointerInputChange.getPosition()));
                            long id = pointerInputChange.getId();
                            final Function2 function2 = dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16752o;
                            Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                    n(pointerInputChange3);
                                    return Unit.INSTANCE;
                                }

                                public final void n(PointerInputChange pointerInputChange3) {
                                    function2.invoke(pointerInputChange3, Offset.nr(PointerEventKt.Uo(pointerInputChange3)));
                                    pointerInputChange3.n();
                                }
                            };
                            dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16754t = awaitPointerEventScope;
                            dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16751n = 3;
                            obj = DragGestureDetectorKt.o(awaitPointerEventScope, id, function1, this);
                            if (obj != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                } else {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f16754t;
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
                    long id2 = ((PointerInputChange) obj).getId();
                    dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16754t = awaitPointerEventScope;
                    dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16751n = 2;
                    obj = DragGestureDetectorKt.Uo(awaitPointerEventScope, id2, this);
                    if (obj == coroutine_suspended) {
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                        }
                    }
                    return coroutine_suspended;
                }
            } catch (CancellationException e2) {
                cancellationException = e2;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16753r.invoke();
                throw cancellationException;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f16754t;
            try {
                this.f16754t = awaitPointerEventScope3;
                this.f16751n = 1;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
            } catch (CancellationException e3) {
                e = e3;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = this;
            }
            try {
                obj = TapGestureDetectorKt.J2(awaitPointerEventScope3, false, null, dragGestureDetectorKt$detectDragGesturesAfterLongPress$5, 2, null);
                if (obj != coroutine_suspended) {
                    awaitPointerEventScope = awaitPointerEventScope3;
                    long id22 = ((PointerInputChange) obj).getId();
                    dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16754t = awaitPointerEventScope;
                    dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16751n = 2;
                    obj = DragGestureDetectorKt.Uo(awaitPointerEventScope, id22, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return coroutine_suspended;
            } catch (CancellationException e4) {
                e = e4;
                cancellationException = e;
                dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f16753r.invoke();
                throw cancellationException;
            }
        }
        return Unit.INSTANCE;
    }
}
