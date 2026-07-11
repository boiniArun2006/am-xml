package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/Drag2DScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
final class Draggable2DNode$drag$2 extends SuspendLambda implements Function2<Drag2DScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Draggable2DNode J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function2 f16861O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16862n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16863t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Draggable2DNode$drag$2(Function2 function2, Draggable2DNode draggable2DNode, Continuation continuation) {
        super(2, continuation);
        this.f16861O = function2;
        this.J2 = draggable2DNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Draggable2DNode$drag$2 draggable2DNode$drag$2 = new Draggable2DNode$drag$2(this.f16861O, this.J2, continuation);
        draggable2DNode$drag$2.f16863t = obj;
        return draggable2DNode$drag$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Drag2DScope drag2DScope, Continuation continuation) {
        return ((Draggable2DNode$drag$2) create(drag2DScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16862n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final Drag2DScope drag2DScope = (Drag2DScope) this.f16863t;
            Function2 function2 = this.f16861O;
            final Draggable2DNode draggable2DNode = this.J2;
            Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DNode$drag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragEvent.DragDelta dragDelta) {
                    n(dragDelta);
                    return Unit.INSTANCE;
                }

                public final void n(DragEvent.DragDelta dragDelta) {
                    Drag2DScope drag2DScope2 = drag2DScope;
                    Draggable2DNode draggable2DNode2 = draggable2DNode;
                    long delta = dragDelta.getDelta();
                    if (draggable2DNode2.reverseDirection) {
                        delta = Offset.O(delta ^ (-9223372034707292160L));
                    }
                    drag2DScope2.n(delta);
                }
            };
            this.f16862n = 1;
            if (function2.invoke(function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
