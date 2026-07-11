package Jfs;

import FX.Ml;
import QmE.iF;
import XoT.C;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ga6.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import mCM.QJ;
import mCM.l3D;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CN3 {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f4639t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f4640n;

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4642n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f4643t;

        static final class j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Continuation f4644n;

            j(Continuation continuation) {
                this.f4644n = continuation;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Exception) obj);
                return Unit.INSTANCE;
            }

            public final void n(Exception exc) {
                if (exc != null) {
                    Continuation continuation = this.f4644n;
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(exc)));
                } else {
                    Continuation continuation2 = this.f4644n;
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation2.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                }
            }
        }

        I28(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4643t;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CN3 cn3 = CN3.this;
                this.f4642n = cn3;
                this.f4643t = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                cn3.O(false, null, new j(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4646n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4647t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4647t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.xMQ(this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4649n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4650t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4650t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.Uo(null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f4651O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4652n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ CN3 f4653r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4654t;

        static final class j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Continuation f4655n;

            j(Continuation continuation) {
                this.f4655n = continuation;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((Exception) obj);
                return Unit.INSTANCE;
            }

            public final void n(Exception exc) {
                if (exc != null) {
                    Continuation continuation = this.f4655n;
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(exc)));
                } else {
                    Continuation continuation2 = this.f4655n;
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation2.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(List list, CN3 cn3, Continuation continuation) {
            super(1, continuation);
            this.J2 = list;
            this.f4653r = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new w6(this.J2, this.f4653r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4651O;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                List<FX.Ml> list = this.J2;
                CN3 cn3 = this.f4653r;
                this.f4652n = list;
                this.f4654t = cn3;
                this.f4651O = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (FX.Ml ml : list) {
                    if (ml instanceof Ml.n) {
                        str = "tiktok";
                    } else if (ml instanceof Ml.w6) {
                        str = "youtube";
                    } else if (ml instanceof Ml.j) {
                        str = "instagram";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    linkedHashMap.put(str, ml.rl());
                }
                cn3.O(true, linkedHashMap, new j(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CN3(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f4640n = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(CN3 cn3, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        function1.invoke(!task.isSuccessful() ? new IllegalStateException("Function setAccountProperty completes with failure", task.getException()) : cn3.gh(((l3D) task.getResult()).f70669n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(Throwable th) {
        return "Opt-in to creator ranking failure: exception=" + th + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(boolean z2, Map map, final Function1 function1) {
        QJ qjCk = com.google.firebase.functions.n.mUb.t().ck("setAccountProperty");
        Pair pair = TuplesKt.to("campaign", cg.n.f43806O.rl());
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("accepted", Boolean.valueOf(z2));
        if (map != null) {
            mapCreateMapBuilder.put("socials", map);
        }
        Unit unit = Unit.INSTANCE;
        qjCk.rl(MapsKt.mapOf(pair, TuplesKt.to("data", MapsKt.build(mapCreateMapBuilder)))).addOnCompleteListener(new OnCompleteListener() { // from class: Jfs.Wre
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                CN3.J2(this.f4658n, function1, task);
            }
        });
    }

    private final Exception gh(Object obj) {
        boolean z2 = obj instanceof Map;
        Map map = z2 ? (Map) obj : null;
        String str = map != null ? (String) map.getOrDefault("result", null) : null;
        Map map2 = z2 ? (Map) obj : null;
        String str2 = map2 != null ? (String) map2.getOrDefault(JavetError.PARAMETER_REASON, null) : null;
        if (Intrinsics.areEqual(str, "success")) {
            return null;
        }
        return new IllegalStateException("Function setAccountProperty returns an error: result=" + str + ", reason=" + str2 + ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(Throwable th) {
        return "Opt-out to creator ranking failure: exception=" + th + ".";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Uo(List list, Continuation continuation) {
        n nVar;
        CN3 cn3;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objUo = nVar.f4650t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            w6 w6Var = new w6(list, this, null);
            nVar.f4649n = this;
            nVar.J2 = 1;
            objUo = x0X.w6.Uo(w6Var, nVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) nVar.f4649n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar2 = (x0X.n) objUo;
        if (nVar2 instanceof n.C1266n) {
            final Throwable th = (Throwable) ((n.C1266n) nVar2).n();
            C.mUb(cn3, new Function0() { // from class: Jfs.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CN3.KN(th);
                }
            });
        } else if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return M3.j.rl(M3.n.rl(nVar2, j.w6.J2, j.EnumC0949j.f67612S, null, null, 12, null), cn3.f4640n);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(Continuation continuation) {
        Ml ml;
        CN3 cn3;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objUo = ml.f4647t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            I28 i28 = new I28(null);
            ml.f4646n = this;
            ml.J2 = 1;
            objUo = x0X.w6.Uo(i28, ml);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) ml.f4646n;
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            final Throwable th = (Throwable) ((n.C1266n) nVar).n();
            C.mUb(cn3, new Function0() { // from class: Jfs.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CN3.mUb(th);
                }
            });
        } else if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return M3.j.rl(M3.n.rl(nVar, j.w6.J2, j.EnumC0949j.f67612S, null, null, 12, null), cn3.f4640n);
    }
}
