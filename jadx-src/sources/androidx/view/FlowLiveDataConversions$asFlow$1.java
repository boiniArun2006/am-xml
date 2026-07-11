package androidx.view;

import GJW.DC;
import GJW.Dsr;
import GJW.OU;
import GJW.V1;
import GJW.vd;
import GJW.yg;
import ILs.s4;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LILs/s4;", "", "<anonymous>", "(LILs/s4;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 1}, l = {105, 106, 108}, m = "invokeSuspend", n = {"observer", "observer"}, s = {"L$0", "L$0"})
final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements Function2<s4, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LiveData f38862O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f38863n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f38864t;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Observer f38865O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f38866n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LiveData f38867t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LiveData liveData, Observer observer, Continuation continuation) {
            super(2, continuation);
            this.f38867t = liveData;
            this.f38865O = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f38867t, this.f38865O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f38866n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f38867t.gh(this.f38865O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Observer f38868O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f38869n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LiveData f38870t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LiveData liveData, Observer observer, Continuation continuation) {
            super(2, continuation);
            this.f38870t = liveData;
            this.f38868O = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f38870t, this.f38868O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f38869n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f38870t.HI(this.f38868O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowLiveDataConversions$asFlow$1(LiveData liveData, Continuation continuation) {
        super(2, continuation);
        this.f38862O = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.f38862O, continuation);
        flowLiveDataConversions$asFlow$1.f38864t = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(s4 s4Var, Object obj) {
        s4Var.nr(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final Object invoke(s4 s4Var, Continuation continuation) {
        return ((FlowLiveDataConversions$asFlow$1) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Observer observer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f38863n;
        try {
        } catch (Throwable th) {
            CoroutineContext coroutineContextPlus = OU.t().p0N().plus(V1.f3456n);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f38862O, r12, null);
            this.f38864t = th;
            this.f38863n = 3;
            if (Dsr.Uo(coroutineContextPlus, anonymousClass2, this) != coroutine_suspended) {
                throw th;
            }
        }
        if (r12 != 0) {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f38864t;
                    ResultKt.throwOnFailure(obj);
                    throw th2;
                }
                Observer observer2 = (Observer) this.f38864t;
                ResultKt.throwOnFailure(obj);
                r12 = observer2;
                throw new KotlinNothingValueException();
            }
            Observer observer3 = (Observer) this.f38864t;
            ResultKt.throwOnFailure(obj);
            observer = observer3;
        } else {
            ResultKt.throwOnFailure(obj);
            final s4 s4Var = (s4) this.f38864t;
            Observer observer4 = new Observer() { // from class: androidx.lifecycle.w6
                @Override // androidx.view.Observer
                public final void onChanged(Object obj2) {
                    FlowLiveDataConversions$asFlow$1.xMQ(s4Var, obj2);
                }
            };
            DC dcP0N = OU.t().p0N();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38862O, observer4, null);
            this.f38864t = observer4;
            this.f38863n = 1;
            observer = observer4;
            if (Dsr.Uo(dcP0N, anonymousClass1, this) == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        this.f38864t = observer;
        this.f38863n = 2;
        r12 = observer;
        if (yg.n(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        throw new KotlinNothingValueException();
    }
}
