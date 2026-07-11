package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.LongPressResult;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", i = {0, 1}, l = {386, 409}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout"}, s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$waitForLongPress$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n87#2,2:551\n34#2,6:553\n89#2:559\n102#2,2:560\n34#2,6:562\n104#2:568\n102#2,2:569\n34#2,6:571\n104#2:577\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$waitForLongPress$2\n*L\n387#1:551,2\n387#1:553,6\n387#1:559\n399#1:560,2\n399#1:562,6\n399#1:568\n410#1:569,2\n410#1:571,6\n410#1:577\n*E\n"})
final class TapGestureDetectorKt$waitForLongPress$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PointerEventPass f17168O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17169n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f17170t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.f17168O = pointerEventPass;
        this.J2 = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.f17168O, this.J2, continuation);
        tapGestureDetectorKt$waitForLongPress$2.f17170t = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((TapGestureDetectorKt$waitForLongPress$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.rl(r14) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        r13.J2.element = androidx.compose.foundation.gestures.LongPressResult.Success.f16910n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        r14 = r14.getChanges();
        r5 = r14.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r6 >= r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r14.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r7.ck() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.J2(r7, r1.n(), r1.hRu()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r13.J2.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.f16908n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        r14 = androidx.compose.ui.input.pointer.PointerEventPass.f32077O;
        r13.f17170t = r1;
        r13.f17169n = 2;
        r14 = r1.HBN(r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r14 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        r13.J2.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.f16908n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.foundation.gestures.LongPressResult$Success] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Released] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a1 -> B:34:0x00a4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        AwaitPointerEventScope awaitPointerEventScope2;
        int size;
        int i2;
        Object objHBN;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f17169n;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.f17170t;
                    ResultKt.throwOnFailure(obj);
                    List changes = ((PointerEvent) obj).getChanges();
                    int size2 = changes.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (((PointerInputChange) changes.get(i5)).ck()) {
                            break;
                        }
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    PointerEventPass pointerEventPass = this.f17168O;
                    this.f17170t = awaitPointerEventScope;
                    this.f17169n = 1;
                    objHBN = awaitPointerEventScope.HBN(pointerEventPass, this);
                    if (objHBN != coroutine_suspended) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        obj = objHBN;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List changes2 = pointerEvent.getChanges();
                        size = changes2.size();
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                if (!PointerEventKt.t((PointerInputChange) changes2.get(i2))) {
                                    break;
                                }
                                i2++;
                            } else {
                                this.J2.element = new LongPressResult.Released((PointerInputChange) pointerEvent.getChanges().get(0));
                                break;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.f17170t;
            ResultKt.throwOnFailure(obj);
            PointerEvent pointerEvent2 = (PointerEvent) obj;
            List changes22 = pointerEvent2.getChanges();
            size = changes22.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2++;
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(obj);
        awaitPointerEventScope = (AwaitPointerEventScope) this.f17170t;
        PointerEventPass pointerEventPass2 = this.f17168O;
        this.f17170t = awaitPointerEventScope;
        this.f17169n = 1;
        objHBN = awaitPointerEventScope.HBN(pointerEventPass2, this);
        if (objHBN != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
