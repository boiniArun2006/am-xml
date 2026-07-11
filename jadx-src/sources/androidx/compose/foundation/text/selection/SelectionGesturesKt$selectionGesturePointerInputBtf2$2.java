package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.vungle.ads.internal.protos.Sdk;
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
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n87#2,2:450\n34#2,6:452\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n*L\n215#1:450,2\n215#1:452,6\n215#1:458\n*E\n"})
final class SelectionGesturesKt$selectionGesturePointerInputBtf2$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MouseSelectionObserver J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ClicksCounter f20833O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20834n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ TextDragObserver f20835r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f20836t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionGesturesKt$selectionGesturePointerInputBtf2$2(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation continuation) {
        super(2, continuation);
        this.f20833O = clicksCounter;
        this.J2 = mouseSelectionObserver;
        this.f20835r = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionGesturesKt$selectionGesturePointerInputBtf2$2 selectionGesturesKt$selectionGesturePointerInputBtf2$2 = new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(this.f20833O, this.J2, this.f20835r, continuation);
        selectionGesturesKt$selectionGesturePointerInputBtf2$2.f20836t = obj;
        return selectionGesturesKt$selectionGesturePointerInputBtf2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((SelectionGesturesKt$selectionGesturePointerInputBtf2$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.qie(r1, r2, r3, r13, r12) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.ck(r1, r2, r13, r12) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.Ik(r1, r3, r13, r12) == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f20834n;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.f20836t;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.f20836t;
            this.f20836t = awaitPointerEventScope;
            this.f20834n = 1;
            obj = SelectionGesturesKt.KN(awaitPointerEventScope, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        PointerEvent pointerEvent = (PointerEvent) obj;
        this.f20833O.nr(pointerEvent);
        boolean zMUb = SelectionGesturesKt.mUb(pointerEvent);
        if (zMUb && PointerEvent_androidKt.t(pointerEvent.getButtons())) {
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!((PointerInputChange) changes.get(i3)).ck()) {
                }
            }
            MouseSelectionObserver mouseSelectionObserver = this.J2;
            ClicksCounter clicksCounter = this.f20833O;
            this.f20836t = null;
            this.f20834n = 2;
        }
        if (!zMUb) {
            if (this.f20833O.getClicks() == 1) {
                TextDragObserver textDragObserver = this.f20835r;
                this.f20836t = null;
                this.f20834n = 3;
            } else {
                TextDragObserver textDragObserver2 = this.f20835r;
                this.f20836t = null;
                this.f20834n = 4;
            }
        }
        return Unit.INSTANCE;
    }
}
