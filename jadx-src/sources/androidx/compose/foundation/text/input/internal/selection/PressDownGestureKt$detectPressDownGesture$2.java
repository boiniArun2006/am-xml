package androidx.compose.foundation.text.input.internal.selection;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {31, 37}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nPressDownGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,47:1\n102#2,2:48\n34#2,6:50\n104#2:56\n*S KotlinDebug\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n*L\n38#1:48,2\n38#1:50,6\n38#1:56\n*E\n"})
final class PressDownGestureKt$detectPressDownGesture$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TapOnPosition J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f20383O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20384n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function0 f20385r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f20386t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressDownGestureKt$detectPressDownGesture$2(TapOnPosition tapOnPosition, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.J2 = tapOnPosition;
        this.f20385r = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new PressDownGestureKt$detectPressDownGesture$2(this.J2, this.f20385r, continuation);
        pressDownGestureKt$detectPressDownGesture$2.f20383O = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((PressDownGestureKt$detectPressDownGesture$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r14 != r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0061 -> B:20:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2;
        AwaitPointerEventScope awaitPointerEventScope;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f20386t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    pointerInputChange = (PointerInputChange) this.f20384n;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.f20383O;
                    ResultKt.throwOnFailure(obj);
                    pressDownGestureKt$detectPressDownGesture$2 = this;
                    List changes = ((PointerEvent) obj).getChanges();
                    int size = changes.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange) changes.get(i3);
                        if (PointerId.t(pointerInputChange2.getId(), pointerInputChange.getId()) && pointerInputChange2.getPressed()) {
                            pressDownGestureKt$detectPressDownGesture$2.f20383O = awaitPointerEventScope2;
                            pressDownGestureKt$detectPressDownGesture$2.f20384n = pointerInputChange;
                            pressDownGestureKt$detectPressDownGesture$2.f20386t = 2;
                            obj = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, this, 1, null);
                        }
                    }
                    pressDownGestureKt$detectPressDownGesture$2.f20385r.invoke();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.f20383O;
            ResultKt.throwOnFailure(obj);
            pressDownGestureKt$detectPressDownGesture$2 = this;
        } else {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f20383O;
            this.f20383O = awaitPointerEventScope3;
            this.f20386t = 1;
            pressDownGestureKt$detectPressDownGesture$2 = this;
            obj = TapGestureDetectorKt.J2(awaitPointerEventScope3, false, null, pressDownGestureKt$detectPressDownGesture$2, 2, null);
            if (obj != coroutine_suspended) {
                awaitPointerEventScope = awaitPointerEventScope3;
            }
            return coroutine_suspended;
        }
        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
        pressDownGestureKt$detectPressDownGesture$2.J2.n(pointerInputChange3.getPosition());
        if (pressDownGestureKt$detectPressDownGesture$2.f20385r != null) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = pointerInputChange3;
            pressDownGestureKt$detectPressDownGesture$2.f20383O = awaitPointerEventScope2;
            pressDownGestureKt$detectPressDownGesture$2.f20384n = pointerInputChange;
            pressDownGestureKt$detectPressDownGesture$2.f20386t = 2;
            obj = AwaitPointerEventScope.pJg(awaitPointerEventScope2, null, this, 1, null);
        }
        return Unit.INSTANCE;
    }
}
