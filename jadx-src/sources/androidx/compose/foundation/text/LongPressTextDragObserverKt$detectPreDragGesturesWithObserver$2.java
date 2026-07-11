package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {87, 91}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,106:1\n102#2,2:107\n34#2,6:109\n104#2:115\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n92#1:107,2\n92#1:109,6\n92#1:115\n*E\n"})
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TextDragObserver J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f19775O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f19776n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f19777t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(TextDragObserver textDragObserver, Continuation continuation) {
        super(2, continuation);
        this.J2 = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.J2, continuation);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f19775O = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r14 != r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
        AwaitPointerEventScope awaitPointerEventScope;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f19777t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    pointerInputChange = (PointerInputChange) this.f19776n;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.f19775O;
                    ResultKt.throwOnFailure(obj);
                    longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = this;
                    List changes = ((PointerEvent) obj).getChanges();
                    int size = changes.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange) changes.get(i3);
                        if (PointerId.t(pointerInputChange2.getId(), pointerInputChange.getId()) && pointerInputChange2.getPressed()) {
                            longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f19775O = awaitPointerEventScope2;
                            longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f19776n = pointerInputChange;
                            longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f19777t = 2;
                            obj = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, this, 1, null);
                        }
                    }
                    longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.J2.t();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.f19775O;
            ResultKt.throwOnFailure(obj);
            longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = this;
        } else {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f19775O;
            this.f19775O = awaitPointerEventScope3;
            this.f19777t = 1;
            longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = this;
            obj = TapGestureDetectorKt.J2(awaitPointerEventScope3, false, null, longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2, 2, null);
            if (obj != coroutine_suspended) {
                awaitPointerEventScope = awaitPointerEventScope3;
            }
            return coroutine_suspended;
        }
        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.J2.n(pointerInputChange3.getPosition());
        awaitPointerEventScope2 = awaitPointerEventScope;
        pointerInputChange = pointerInputChange3;
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f19775O = awaitPointerEventScope2;
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f19776n = pointerInputChange;
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f19777t = 2;
        obj = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, this, 1, null);
    }
}
