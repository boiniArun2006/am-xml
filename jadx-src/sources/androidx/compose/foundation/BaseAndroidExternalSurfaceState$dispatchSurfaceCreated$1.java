package androidx.compose.foundation;

import GJW.AbstractC1363t;
import GJW.vd;
import GJW.xuv;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", i = {0}, l = {130, 136}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Surface J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ BaseAndroidExternalSurfaceState f15889O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f15890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f15891o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f15892r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f15893t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, Surface surface, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.f15889O = baseAndroidExternalSurfaceState;
        this.J2 = surface;
        this.f15892r = i2;
        this.f15891o = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.f15889O, this.J2, this.f15892r, this.f15891o, continuation);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.f15893t = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r3.invoke(r4, r5, r6, r7, r9) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vd vdVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15890n;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vdVar = (vd) this.f15893t;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            vdVar = (vd) this.f15893t;
            xuv xuvVar = this.f15889O.job;
            if (xuvVar != null) {
                this.f15893t = vdVar;
                this.f15890n = 1;
                if (AbstractC1363t.Uo(xuvVar, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(this.f15889O, vdVar);
        Function5 function5 = this.f15889O.onSurface;
        if (function5 != null) {
            Surface surface = this.J2;
            Integer numBoxInt = Boxing.boxInt(this.f15892r);
            Integer numBoxInt2 = Boxing.boxInt(this.f15891o);
            this.f15893t = null;
            this.f15890n = 2;
        }
        return Unit.INSTANCE;
    }
}
