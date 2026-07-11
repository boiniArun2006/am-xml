package androidx.compose.foundation.gestures;

import GJW.AbstractC1363t;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {102, 105, 110}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f16901O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16902n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16903t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ForEachGestureKt$awaitEachGesture$2(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f16901O = coroutineContext;
        this.J2 = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.f16901O, this.J2, continuation);
        forEachGestureKt$awaitEachGesture$2.f16903t = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:12:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:12:0x0029). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r9;
        ?? r12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r13 = this.f16902n;
        try {
        } catch (CancellationException e2) {
            e = e2;
            if (!AbstractC1363t.ck(this.f16901O)) {
                this.f16903t = r13;
                this.f16902n = 3;
                Object objNr = ForEachGestureKt.nr(r13, null, this, 1, null);
                r12 = r13;
            } else {
                throw e;
            }
        }
        if (r13 != 0) {
            if (r13 != 1) {
                if (r13 != 2) {
                    if (r13 == 3) {
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f16903t;
                        ResultKt.throwOnFailure(obj);
                        r12 = awaitPointerEventScope;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.f16903t;
                    ResultKt.throwOnFailure(obj);
                    r12 = awaitPointerEventScope2;
                }
                r9 = r12;
                if (!AbstractC1363t.ck(this.f16901O)) {
                    try {
                    } catch (CancellationException e3) {
                        r13 = r9;
                        e = e3;
                        if (!AbstractC1363t.ck(this.f16901O)) {
                        }
                    }
                    Function2 function2 = this.J2;
                    this.f16903t = r9;
                    this.f16902n = 1;
                    if (function2.invoke(r9, this) != coroutine_suspended) {
                        r13 = r9;
                        this.f16903t = r13;
                        this.f16902n = 2;
                        Object objNr2 = ForEachGestureKt.nr(r13, null, this, 1, null);
                        r12 = r13;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f16903t;
            ResultKt.throwOnFailure(obj);
            r13 = awaitPointerEventScope3;
            this.f16903t = r13;
            this.f16902n = 2;
            Object objNr22 = ForEachGestureKt.nr(r13, null, this, 1, null);
            r12 = r13;
        } else {
            ResultKt.throwOnFailure(obj);
            r9 = (AwaitPointerEventScope) this.f16903t;
            if (!AbstractC1363t.ck(this.f16901O)) {
            }
        }
    }
}
