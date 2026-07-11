package androidx.compose.ui.platform;

import GJW.xuv;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.view.LifecycleOwner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {388}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Recomposer J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f33127O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ View f33128Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f33129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f33130o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f33131r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f33132t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef objectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, Continuation continuation) {
        super(2, continuation);
        this.f33127O = objectRef;
        this.J2 = recomposer;
        this.f33131r = lifecycleOwner;
        this.f33130o = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.f33128Z = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.f33127O, this.J2, this.f33131r, this.f33130o, this.f33128Z, continuation);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.f33132t = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [GJW.xuv] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [GJW.xuv] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ?? r12;
        xuv xuvVarNr;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r13 = this.f33129n;
        try {
            if (r13 != 0) {
                if (r13 == 1) {
                    xuv xuvVar = (xuv) this.f33132t;
                    ResultKt.throwOnFailure(obj);
                    r13 = xuvVar;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                GJW.vd vdVar = (GJW.vd) this.f33132t;
                try {
                    MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) this.f33127O.element;
                    if (motionDurationScaleImpl != null) {
                        TFv.rv6 rv6VarO = WindowRecomposer_androidKt.O(this.f33128Z.getContext().getApplicationContext());
                        motionDurationScaleImpl.t(((Number) rv6VarO.getValue()).floatValue());
                        xuvVarNr = GJW.C.nr(vdVar, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(rv6VarO, motionDurationScaleImpl, null), 3, null);
                    } else {
                        xuvVarNr = null;
                    }
                    Recomposer recomposer = this.J2;
                    this.f33132t = xuvVarNr;
                    this.f33129n = 1;
                    r13 = xuvVarNr;
                    if (recomposer.ER(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r12 = 0;
                    if (r12 != 0) {
                        xuv.j.rl(r12, null, 1, null);
                    }
                    this.f33131r.getLifecycleRegistry().nr(this.f33130o);
                    throw th;
                }
            }
            if (r13 != 0) {
                xuv.j.rl(r13, null, 1, null);
            }
            this.f33131r.getLifecycleRegistry().nr(this.f33130o);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            r12 = r13;
        }
    }
}
