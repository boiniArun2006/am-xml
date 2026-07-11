package androidx.compose.foundation.gestures;

import GJW.AbstractC1363t;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0007\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0011\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0013\u001a\u00020\u0003*\u00020\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0086@¢\u0006\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "J2", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", c.f62177j, "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)Z", "t", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "rl", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "O", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,120:1\n329#2:121\n329#2:140\n102#3,2:122\n34#3,6:124\n104#3:130\n102#3,2:131\n34#3,6:133\n104#3:139\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:121\n98#1:140\n71#1:122,2\n71#1:124,6\n71#1:130\n85#1:131,2\n85#1:133,6\n85#1:139\n*E\n"})
public final class ForEachGestureKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J2(PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
        ForEachGestureKt$forEachGesture$1 forEachGestureKt$forEachGesture$1;
        ?? context;
        ?? r8;
        ?? r82;
        ?? r2;
        if (continuation instanceof ForEachGestureKt$forEachGesture$1) {
            forEachGestureKt$forEachGesture$1 = (ForEachGestureKt$forEachGesture$1) continuation;
            int i2 = forEachGestureKt$forEachGesture$1.f16906r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$forEachGesture$1.f16906r = i2 - Integer.MIN_VALUE;
            } else {
                forEachGestureKt$forEachGesture$1 = new ForEachGestureKt$forEachGesture$1(continuation);
            }
        }
        Object obj = forEachGestureKt$forEachGesture$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r22 = forEachGestureKt$forEachGesture$1.f16906r;
        try {
        } catch (CancellationException e2) {
            e = e2;
            if (AbstractC1363t.ck(pointerInputScope)) {
            }
        }
        if (r22 == 0) {
            ResultKt.throwOnFailure(obj);
            r8 = pointerInputScope;
            context = forEachGestureKt$forEachGesture$1.getContext();
            if (AbstractC1363t.ck(context)) {
            }
        } else {
            if (r22 != 1) {
                if (r22 == 2) {
                    CoroutineContext coroutineContext = (CoroutineContext) forEachGestureKt$forEachGesture$1.f16904O;
                    function2 = (Function2) forEachGestureKt$forEachGesture$1.f16907t;
                    PointerInputScope pointerInputScope2 = (PointerInputScope) forEachGestureKt$forEachGesture$1.f16905n;
                    ResultKt.throwOnFailure(obj);
                    r2 = pointerInputScope2;
                    r82 = coroutineContext;
                } else {
                    if (r22 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CoroutineContext coroutineContext2 = (CoroutineContext) forEachGestureKt$forEachGesture$1.f16904O;
                    function2 = (Function2) forEachGestureKt$forEachGesture$1.f16907t;
                    PointerInputScope pointerInputScope3 = (PointerInputScope) forEachGestureKt$forEachGesture$1.f16905n;
                    ResultKt.throwOnFailure(obj);
                    r2 = pointerInputScope3;
                    r82 = coroutineContext2;
                }
                context = r82;
                r8 = r2;
                if (AbstractC1363t.ck(context)) {
                    return Unit.INSTANCE;
                }
                try {
                } catch (CancellationException e3) {
                    r22 = r8;
                    pointerInputScope = context;
                    e = e3;
                    if (AbstractC1363t.ck(pointerInputScope)) {
                        throw e;
                    }
                    forEachGestureKt$forEachGesture$1.f16905n = r22;
                    forEachGestureKt$forEachGesture$1.f16907t = function2;
                    forEachGestureKt$forEachGesture$1.f16904O = pointerInputScope;
                    forEachGestureKt$forEachGesture$1.f16906r = 3;
                    Object objT = t(r22, forEachGestureKt$forEachGesture$1);
                    r2 = r22;
                    r82 = pointerInputScope;
                }
                forEachGestureKt$forEachGesture$1.f16905n = r8;
                forEachGestureKt$forEachGesture$1.f16907t = function2;
                forEachGestureKt$forEachGesture$1.f16904O = context;
                forEachGestureKt$forEachGesture$1.f16906r = 1;
                if (function2.invoke(r8, forEachGestureKt$forEachGesture$1) != coroutine_suspended) {
                    r22 = r8;
                    pointerInputScope = context;
                    forEachGestureKt$forEachGesture$1.f16905n = r22;
                    forEachGestureKt$forEachGesture$1.f16907t = function2;
                    forEachGestureKt$forEachGesture$1.f16904O = pointerInputScope;
                    forEachGestureKt$forEachGesture$1.f16906r = 2;
                    Object objT2 = t(r22, forEachGestureKt$forEachGesture$1);
                    r2 = r22;
                    r82 = pointerInputScope;
                }
                return coroutine_suspended;
            }
            CoroutineContext coroutineContext3 = (CoroutineContext) forEachGestureKt$forEachGesture$1.f16904O;
            function2 = (Function2) forEachGestureKt$forEachGesture$1.f16907t;
            PointerInputScope pointerInputScope4 = (PointerInputScope) forEachGestureKt$forEachGesture$1.f16905n;
            ResultKt.throwOnFailure(obj);
            r22 = pointerInputScope4;
            pointerInputScope = coroutineContext3;
            forEachGestureKt$forEachGesture$1.f16905n = r22;
            forEachGestureKt$forEachGesture$1.f16907t = function2;
            forEachGestureKt$forEachGesture$1.f16904O = pointerInputScope;
            forEachGestureKt$forEachGesture$1.f16906r = 2;
            Object objT22 = t(r22, forEachGestureKt$forEachGesture$1);
            r2 = r22;
            r82 = pointerInputScope;
        }
    }

    public static /* synthetic */ Object nr(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.f32077O;
        }
        return rl(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (n(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation) {
        ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        if (continuation instanceof ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3) continuation;
            int i2 = forEachGestureKt$awaitAllPointersUp$3.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.J2 = i2 - Integer.MIN_VALUE;
            } else {
                forEachGestureKt$awaitAllPointersUp$3 = new ForEachGestureKt$awaitAllPointersUp$3(continuation);
            }
        }
        Object objHBN = forEachGestureKt$awaitAllPointersUp$3.f16898O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = forEachGestureKt$awaitAllPointersUp$3.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PointerEventPass pointerEventPass2 = (PointerEventPass) forEachGestureKt$awaitAllPointersUp$3.f16900t;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) forEachGestureKt$awaitAllPointersUp$3.f16899n;
            ResultKt.throwOnFailure(objHBN);
            pointerEventPass = pointerEventPass2;
            awaitPointerEventScope = awaitPointerEventScope2;
            List changes = ((PointerEvent) objHBN).getChanges();
            int size = changes.size();
            int i5 = 0;
            while (i5 < size) {
                if (((PointerInputChange) changes.get(i5)).getPressed()) {
                    forEachGestureKt$awaitAllPointersUp$3.f16899n = awaitPointerEventScope;
                    forEachGestureKt$awaitAllPointersUp$3.f16900t = pointerEventPass;
                    forEachGestureKt$awaitAllPointersUp$3.J2 = 1;
                    objHBN = awaitPointerEventScope.HBN(pointerEventPass, forEachGestureKt$awaitAllPointersUp$3);
                    if (objHBN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List changes2 = ((PointerEvent) objHBN).getChanges();
                    int size2 = changes2.size();
                    int i52 = 0;
                    while (i52 < size2) {
                    }
                } else {
                    i52++;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objHBN);
    }

    public static final Object t(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objETf = pointerInputScope.eTf(new ForEachGestureKt$awaitAllPointersUp$2(null), continuation);
        return objETf == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objETf : Unit.INSTANCE;
    }

    public static final Object O(PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
        Object objETf = pointerInputScope.eTf(new ForEachGestureKt$awaitEachGesture$2(continuation.getContext(), function2, null), continuation);
        if (objETf == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objETf;
        }
        return Unit.INSTANCE;
    }

    public static final boolean n(AwaitPointerEventScope awaitPointerEventScope) {
        List changes = awaitPointerEventScope.UF().getChanges();
        int size = changes.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((PointerInputChange) changes.get(i2)).getPressed()) {
                z2 = true;
                break;
            }
            i2++;
        }
        return !z2;
    }
}
