package androidx.view;

import GJW.vd;
import ILs.r;
import ILs.s4;
import TFv.CN3;
import TFv.Wre;
import androidx.view.Lifecycle;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LILs/s4;", "", "<anonymous>", "(LILs/s4;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements Function2<s4, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle.State J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Lifecycle f38854O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f38855n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Wre f38856r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f38857t;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ s4 f38858O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f38859n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f38860t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f38860t, this.f38858O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Wre wre, s4 s4Var, Continuation continuation) {
            super(2, continuation);
            this.f38860t = wre;
            this.f38858O = s4Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f38859n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Wre wre = this.f38860t;
                final s4 s4Var = this.f38858O;
                CN3 cn3 = new CN3() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // TFv.CN3
                    public final Object rl(Object obj2, Continuation continuation) {
                        Object objMUb = s4Var.mUb(obj2, continuation);
                        return objMUb == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMUb : Unit.INSTANCE;
                    }
                };
                this.f38859n = 1;
                if (wre.n(cn3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.f38854O, this.J2, this.f38856r, continuation);
        flowExtKt$flowWithLifecycle$1.f38857t = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, Wre wre, Continuation continuation) {
        super(2, continuation);
        this.f38854O = lifecycle;
        this.J2 = state;
        this.f38856r = wre;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s4 s4Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f38855n;
        if (i2 != 0) {
            if (i2 == 1) {
                s4Var = (s4) this.f38857t;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            s4 s4Var2 = (s4) this.f38857t;
            Lifecycle lifecycle = this.f38854O;
            Lifecycle.State state = this.J2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38856r, s4Var2, null);
            this.f38857t = s4Var2;
            this.f38855n = 1;
            if (RepeatOnLifecycleKt.n(lifecycle, state, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            s4Var = s4Var2;
        }
        r.j.n(s4Var, null, 1, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(s4 s4Var, Continuation continuation) {
        return ((FlowExtKt$flowWithLifecycle$1) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
