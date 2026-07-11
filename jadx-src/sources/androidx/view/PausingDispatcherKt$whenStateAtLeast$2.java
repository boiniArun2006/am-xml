package androidx.view;

import GJW.Dsr;
import GJW.vd;
import GJW.xuv;
import androidx.view.Lifecycle;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {
    final /* synthetic */ Lifecycle.State J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Lifecycle f38937O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f38938n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function2 f38939r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f38940t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f38937O = lifecycle;
        this.J2 = state;
        this.f38939r = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f38937O, this.J2, this.f38939r, continuation);
        pausingDispatcherKt$whenStateAtLeast$2.f38940t = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<Object> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LifecycleController lifecycleController;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f38938n;
        if (i2 != 0) {
            if (i2 == 1) {
                lifecycleController = (LifecycleController) this.f38940t;
                try {
                    ResultKt.throwOnFailure(obj);
                    lifecycleController.rl();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.rl();
                    throw th;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        xuv xuvVar = (xuv) ((vd) this.f38940t).getCoroutineContext().get(xuv.nr);
        if (xuvVar != null) {
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.f38937O, this.J2, pausingDispatcher.dispatchQueue, xuvVar);
            try {
                Function2 function2 = this.f38939r;
                this.f38940t = lifecycleController2;
                this.f38938n = 1;
                obj = Dsr.Uo(pausingDispatcher, function2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.rl();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.rl();
                throw th;
            }
        }
        throw new IllegalStateException("when[State] methods should have a parent job");
    }
}
