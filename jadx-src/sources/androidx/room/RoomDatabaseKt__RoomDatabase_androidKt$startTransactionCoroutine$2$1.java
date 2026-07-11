package androidx.room;

import GJW.vd;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1 implements Runnable {
    final /* synthetic */ Function2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ RoomDatabase f41403O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f41404n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ GJW.Pl f41405t;

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", i = {}, l = {2048}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ GJW.Pl J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ RoomDatabase f41406O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41407n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function2 f41408r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f41409t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f41406O, this.J2, this.f41408r, continuation);
            anonymousClass1.f41409t = obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RoomDatabase roomDatabase, GJW.Pl pl, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f41406O = roomDatabase;
            this.J2 = pl;
            this.f41408r = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Continuation continuation;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f41407n;
            if (i2 != 0) {
                if (i2 == 1) {
                    continuation = (Continuation) this.f41409t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((vd) this.f41409t).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
                Intrinsics.checkNotNull(element);
                CoroutineContext coroutineContextRl = RoomDatabaseKt__RoomDatabase_androidKt.rl(this.f41406O, (ContinuationInterceptor) element);
                GJW.Pl pl = this.J2;
                Result.Companion companion = Result.INSTANCE;
                Function2 function2 = this.f41408r;
                this.f41409t = pl;
                this.f41407n = 1;
                obj = GJW.Dsr.Uo(coroutineContextRl, function2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                continuation = pl;
            }
            continuation.resumeWith(Result.m313constructorimpl(obj));
            return Unit.INSTANCE;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            GJW.Dsr.O(this.f41404n.minusKey(ContinuationInterceptor.INSTANCE), new AnonymousClass1(this.f41403O, this.f41405t, this.J2, null));
        } catch (Throwable th) {
            this.f41405t.cancel(th);
        }
    }
}
