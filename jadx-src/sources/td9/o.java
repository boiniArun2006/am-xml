package td9;

import GJW.RzR;
import QmE.iF;
import android.content.Context;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.safedk.android.analytics.AppLovinBridge;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import ga6.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class o implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73559n;
    private final GJW.vd nr;
    private final cg.qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iF f73560t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f73558O = new j(null);
    public static final int J2 = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n implements OnCompleteListener {
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Continuation f73562t;

        n(String str, Continuation continuation) {
            this.rl = str;
            this.f73562t = continuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (!task.isSuccessful()) {
                Continuation continuation = this.f73562t;
                Exception exception = task.getException();
                if (exception == null) {
                    exception = new IllegalStateException("Firebase fetchGifts not successful.");
                }
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(exception)));
                return;
            }
            x0X.n nVarXMQ = o.this.xMQ(((mCM.l3D) task.getResult()).f70669n, this.rl);
            Continuation continuation2 = this.f73562t;
            boolean z2 = nVarXMQ instanceof n.C1266n;
            if (!z2) {
                if (!(nVarXMQ instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                continuation2.resumeWith(Result.m313constructorimpl((Map) ((n.w6) nVarXMQ).n()));
            }
            Continuation continuation3 = this.f73562t;
            if (!z2) {
                if (!(nVarXMQ instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                Throwable th = (Throwable) ((n.C1266n) nVarXMQ).n();
                Result.Companion companion2 = Result.INSTANCE;
                continuation3.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(th)));
            }
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73563n;

        static final class j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73565n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ o f73566t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(o oVar, Continuation continuation) {
                super(1, continuation);
                this.f73566t = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new j(this.f73566t, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
            
                if (r1.gh((java.util.Map) r5, r4) != r0) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73565n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    o oVar = this.f73566t;
                    this.f73565n = 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (XoT.fuX.Ik(this.f73566t.f73559n)) {
                        o oVar2 = this.f73566t;
                        this.f73565n = 1;
                        obj = oVar2.KN(this);
                        if (obj != coroutine_suspended) {
                            o oVar3 = this.f73566t;
                            this.f73565n = 2;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73563n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                j jVar = new j(o.this, null);
                this.f73563n = 1;
                obj = x0X.w6.Uo(jVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            M3.j.rl(M3.n.rl((x0X.n) obj, j.w6.J2, j.EnumC0949j.f67614Z, null, null, 12, null), o.this.f73560t);
            return Unit.INSTANCE;
        }
    }

    public o(Context context, cg.qz rewardPricesRepository, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rewardPricesRepository, "rewardPricesRepository");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73559n = context;
        this.rl = rewardPricesRepository;
        this.f73560t = eventLogger;
        this.nr = RzR.f3449n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object KN(Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        String strRl = cg.n.f43808t.rl();
        com.google.firebase.functions.n.mUb.t().ck("fetchGifts").rl(MapsKt.mapOf(TuplesKt.to("campaign", strRl), TuplesKt.to(AppLovinBridge.f61288f, AppLovinBridge.f61290h))).addOnCompleteListener(new n(strRl, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object gh(Map map, Continuation continuation) {
        cg.qz qzVar = this.rl;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Boxing.boxLong((long) ((Number) entry.getValue()).doubleValue()));
        }
        Object objRl = qzVar.rl(linkedHashMap, continuation);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map mUb(Object obj, String str) {
        boolean z2 = obj instanceof Map;
        Map map = z2 ? (Map) obj : null;
        Object orDefault = map != null ? map.getOrDefault("result", null) : null;
        String str2 = orDefault instanceof String ? (String) orDefault : null;
        Map map2 = z2 ? (Map) obj : null;
        Object orDefault2 = map2 != null ? map2.getOrDefault(JavetError.PARAMETER_REASON, null) : null;
        String str3 = orDefault2 instanceof String ? (String) orDefault2 : null;
        Map map3 = z2 ? (Map) obj : null;
        Object orDefault3 = map3 != null ? map3.getOrDefault("gifts", null) : null;
        Map map4 = orDefault3 instanceof Map ? (Map) orDefault3 : null;
        if (Intrinsics.areEqual(str2, "success")) {
            return map4 == null ? MapsKt.emptyMap() : map4;
        }
        if (!Intrinsics.areEqual(str2, MRAIDPresenter.ERROR)) {
            throw new IllegalStateException("Firebase fetchGifts error: unexpected result.");
        }
        if (!Intrinsics.areEqual(str3, "campaign-not-found")) {
            throw new IllegalStateException("Firebase fetchGifts error: unknown reason.");
        }
        throw new IllegalStateException("Firebase fetchGifts error: campaign-not-found, campaign=" + str + ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n xMQ(final Object obj, final String str) {
        return x0X.w6.n(new Function0() { // from class: td9.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.mUb(obj, str);
            }
        });
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        GJW.C.nr(this.nr, null, null, new w6(null), 3, null);
        return new n.w6(Unit.INSTANCE);
    }
}
