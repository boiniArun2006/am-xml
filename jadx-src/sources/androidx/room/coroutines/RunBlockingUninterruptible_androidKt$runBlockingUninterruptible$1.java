package androidx.room.coroutines;

import GJW.Dsr;
import GJW.RzR;
import GJW.ci;
import GJW.h;
import GJW.r;
import GJW.vd;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function2 f41628O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41629n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f41630t;

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRunBlockingUninterruptible.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunBlockingUninterruptible.android.kt\nandroidx/room/coroutines/RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ r f41631O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41632n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f41633t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f41631O, this.J2, continuation);
            anonymousClass1.f41633t = obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(r rVar, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f41631O = rVar;
            this.J2 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object objM313constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f41632n;
            if (i2 != 0) {
                if (i2 == 1) {
                    rVar = (r) this.f41633t;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion = Result.INSTANCE;
                        objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f41633t;
                r rVar2 = this.f41631O;
                Function2 function2 = this.J2;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    this.f41633t = rVar2;
                    this.f41632n = 1;
                    obj = function2.invoke(vdVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    rVar = rVar2;
                } catch (Throwable th2) {
                    th = th2;
                    rVar = rVar2;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
            }
            objM313constructorimpl = Result.m313constructorimpl(obj);
            ci.nr(rVar, objM313constructorimpl);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41634n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r f41635t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f41635t, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(r rVar, Continuation continuation) {
            super(2, continuation);
            this.f41635t = rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<Object> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f41634n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            r rVar = this.f41635t;
            this.f41634n = 1;
            Object objAwait = rVar.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f41628O = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 = new RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(this.f41628O, continuation);
        runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.f41630t = obj;
        return runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<Object> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f41629n == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext.Element element = ((vd) this.f41630t).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
            Intrinsics.checkNotNull(element);
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) element;
            r rVarT = ci.t(null, 1, null);
            Dsr.t(RzR.f3449n, continuationInterceptor, h.J2, new AnonymousClass1(rVarT, this.f41628O, null));
            while (!rVarT.isCompleted()) {
                try {
                    return Dsr.O(continuationInterceptor, new AnonymousClass2(rVarT, null));
                } catch (InterruptedException unused) {
                }
            }
            return rVarT.getCompleted();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
