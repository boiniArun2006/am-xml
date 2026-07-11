package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.vd;
import GJW.xuv;
import ILs.CN3;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "<anonymous>", "(LGJW/vd;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", i = {0}, l = {170}, m = "invokeSuspend", n = {"job"}, s = {"L$0"})
final class MouseWheelScrollingLogic$busyReceive$2 extends SuspendLambda implements Function2<vd, Continuation<? super MouseWheelScrollingLogic.MouseWheelScrollDelta>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CN3 f16920O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16921n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16922t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$busyReceive$2 mouseWheelScrollingLogic$busyReceive$2 = new MouseWheelScrollingLogic$busyReceive$2(this.f16920O, continuation);
        mouseWheelScrollingLogic$busyReceive$2.f16922t = obj;
        return mouseWheelScrollingLogic$busyReceive$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MouseWheelScrollingLogic$busyReceive$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$busyReceive$2(CN3 cn3, Continuation continuation) {
        super(2, continuation);
        this.f16920O = cn3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super MouseWheelScrollingLogic.MouseWheelScrollDelta> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [GJW.xuv] */
    /* JADX WARN: Type inference failed for: r1v3, types: [GJW.xuv] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f16921n;
        try {
            if (r12 != 0) {
                if (r12 == 1) {
                    xuv xuvVar = (xuv) this.f16922t;
                    ResultKt.throwOnFailure(obj);
                    r12 = xuvVar;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                xuv xuvVarNr = C.nr((vd) this.f16922t, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(null), 3, null);
                CN3 cn3 = this.f16920O;
                this.f16922t = xuvVarNr;
                this.f16921n = 1;
                obj = cn3.KN(this);
                r12 = xuvVarNr;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
            xuv.j.rl(r12, null, 1, null);
            return mouseWheelScrollDelta;
        } catch (Throwable th) {
            xuv.j.rl(r12, null, 1, null);
            throw th;
        }
    }
}
