package qE;

import GJW.Lu;
import GJW.OU;
import GJW.P;
import GJW.vd;
import K6D.Ml;
import K6D.j;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.squareup.moshi.JsonReader;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import qcD.nehv.Apsps;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final OkHttpClient f72344n;
    private rB.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f72343t = new j(null);
    public static final int nr = 8;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f72345O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f72346n;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f72346n = obj;
            this.f72345O |= Integer.MIN_VALUE;
            Object objJ2 = u.this.J2(null, this);
            return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : qf.n((Map) objJ2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f72349Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72350n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f72351o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f72352r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f72353t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ String J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ u f72354O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            long f72355n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f72356r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f72357t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(u uVar, String str, Ref.ObjectRef objectRef, Continuation continuation) {
                super(2, continuation);
                this.f72354O = uVar;
                this.J2 = str;
                this.f72356r = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f72354O, this.J2, this.f72356r, continuation);
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.time.Duration] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objJ2;
                long j2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f72357t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = this.f72355n;
                        ResultKt.throwOnFailure(obj);
                        objJ2 = ((qf) obj).xMQ();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    u uVar = this.f72354O;
                    String str = this.J2;
                    long jM1761markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto();
                    this.f72355n = jM1761markNowz9LOYto;
                    this.f72357t = 1;
                    objJ2 = uVar.J2(str, this);
                    if (objJ2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2 = jM1761markNowz9LOYto;
                }
                Pair pair = new Pair(qf.n((Map) objJ2), Duration.m1650boximpl(TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(j2)));
                Ref.ObjectRef objectRef = this.f72356r;
                Map mapXMQ = ((qf) pair.component1()).xMQ();
                objectRef.element = Duration.m1650boximpl(((Duration) pair.component2()).getRawValue());
                return qf.n(mapXMQ);
            }
        }

        static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ String J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f72358O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f72359n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f72360o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ u f72361r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            long f72362t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(String str, u uVar, Ref.ObjectRef objectRef, Continuation continuation) {
                super(2, continuation);
                this.J2 = str;
                this.f72361r = uVar;
                this.f72360o = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.J2, this.f72361r, this.f72360o, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
            /* JADX WARN: Type inference failed for: r0v8, types: [T, kotlin.time.Duration] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Map mapXMQ;
                Object objJ2;
                Ref.ObjectRef objectRef;
                long j2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f72358O;
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = this.f72362t;
                        objectRef = (Ref.ObjectRef) this.f72359n;
                        ResultKt.throwOnFailure(obj);
                        objJ2 = ((qf) obj).xMQ();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    String str = this.J2;
                    if (str != null) {
                        u uVar = this.f72361r;
                        Ref.ObjectRef objectRef2 = this.f72360o;
                        long jM1761markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto();
                        this.f72359n = objectRef2;
                        this.f72362t = jM1761markNowz9LOYto;
                        this.f72358O = 1;
                        objJ2 = uVar.J2(str, this);
                        if (objJ2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                        j2 = jM1761markNowz9LOYto;
                    } else {
                        mapXMQ = null;
                        if (mapXMQ != null) {
                            return null;
                        }
                        return qf.n(mapXMQ);
                    }
                }
                Pair pair = new Pair(qf.n((Map) objJ2), Duration.m1650boximpl(TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(j2)));
                mapXMQ = ((qf) pair.component1()).xMQ();
                objectRef.element = Duration.m1650boximpl(((Duration) pair.component2()).getRawValue());
                if (mapXMQ != null) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(String str, Ref.ObjectRef objectRef, String str2, Ref.ObjectRef objectRef2, Continuation continuation) {
            super(2, continuation);
            this.J2 = str;
            this.f72352r = objectRef;
            this.f72351o = str2;
            this.f72349Z = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = u.this.new Ml(this.J2, this.f72352r, this.f72351o, this.f72349Z, continuation);
            ml.f72353t = obj;
            return ml;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P pRl;
            Map map;
            qf qfVar;
            Map mapXMQ;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72350n;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        map = (Map) this.f72353t;
                        ResultKt.throwOnFailure(obj);
                        qfVar = (qf) obj;
                        if (qfVar == null) {
                            mapXMQ = qfVar.xMQ();
                        } else {
                            mapXMQ = null;
                        }
                        return new n(map, mapXMQ, defaultConstructorMarker);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pRl = (P) this.f72353t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f72353t;
                P pRl2 = GJW.C.rl(vdVar, OU.rl(), null, new j(u.this, this.J2, this.f72352r, null), 2, null);
                pRl = GJW.C.rl(vdVar, OU.rl(), null, new n(this.f72351o, u.this, this.f72349Z, null), 2, null);
                this.f72353t = pRl;
                this.f72350n = 1;
                obj = pRl2.await(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Map mapXMQ2 = ((qf) obj).xMQ();
            this.f72353t = mapXMQ2;
            this.f72350n = 2;
            Object objAwait = pRl.await(this);
            if (objAwait != coroutine_suspended) {
                map = mapXMQ2;
                obj = objAwait;
                qfVar = (qf) obj;
                if (qfVar == null) {
                }
                return new n(map, mapXMQ, defaultConstructorMarker);
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72364n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ int f72365t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2;
            rB.Ml ml;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f72364n;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                int i5 = this.f72365t;
                Call callNewCall = u.this.f72344n.newCall(new Request.Builder().url(this.J2).build());
                this.f72365t = i5;
                this.f72364n = 1;
                Object objN = Ht.j.n(callNewCall, this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = i5;
                obj = objN;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.f72365t;
                ResultKt.throwOnFailure(obj);
            }
            x0X.n c1266n = (x0X.n) obj;
            if (!(c1266n instanceof n.C1266n)) {
                if (!(c1266n instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                c1266n = new n.w6(((Response) ((n.w6) c1266n).n()).body());
            }
            if (!(c1266n instanceof n.C1266n)) {
                if (!(c1266n instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objN2 = ((n.w6) c1266n).n();
                c1266n = objN2 != null ? new n.w6(objN2) : new n.C1266n(new IOException("Null response body"));
            }
            String str = this.J2;
            if (c1266n instanceof n.C1266n) {
                c1266n = new n.C1266n(new IOException("Error fetching URL '" + str + "':\n  " + ((IOException) ((n.C1266n) c1266n).n())));
            } else if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            u uVar = u.this;
            boolean z2 = c1266n instanceof n.C1266n;
            if (z2) {
                IOException iOException = (IOException) ((n.C1266n) c1266n).n();
                if (i2 == 0 && (ml = uVar.rl) != null) {
                    ml.t(new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"bucket_fetch", "failed"}), null, null, null, pq.I28.n(pq.n.O(MRAIDPresenter.ERROR, String.valueOf(iOException.getMessage()))), 14, null));
                }
            } else if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                return c1266n;
            }
            if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            ResponseBody responseBody = (ResponseBody) ((n.w6) c1266n).n();
            try {
                String strString = responseBody.string();
                CloseableKt.closeFinally(responseBody, null);
                return new n.w6(strString);
            } finally {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(String str, Continuation continuation) {
            super(2, continuation);
            this.J2 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = u.this.new Wre(this.J2, continuation);
            wre.f72365t = ((Number) obj).intValue();
            return wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).intValue(), (Continuation) obj2);
        }

        public final Object n(int i2, Continuation continuation) {
            return ((Wre) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f72366n;
        private final Map rl;

        public /* synthetic */ n(Map map, Map map2, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, map2);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(Object obj) {
            boolean zO;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (!qf.O(this.f72366n, nVar.f72366n)) {
                return false;
            }
            Map map = this.rl;
            Map map2 = nVar.rl;
            if (map == null) {
                zO = map2 == null;
            } else if (map2 != null) {
                zO = qf.O(map, map2);
            }
            return zO;
        }

        private n(Map defaults, Map map) {
            Intrinsics.checkNotNullParameter(defaults, "defaults");
            this.f72366n = defaults;
            this.rl = map;
        }

        public int hashCode() {
            int iJ2 = qf.J2(this.f72366n) * 31;
            Map map = this.rl;
            return iJ2 + (map == null ? 0 : qf.J2(map));
        }

        public final Map n() {
            return this.f72366n;
        }

        public final Map rl() {
            return this.rl;
        }

        public String toString() {
            String strKN = qf.KN(this.f72366n);
            Map map = this.rl;
            return "SettingsPair(defaults=" + strKN + ", overrides=" + (map == null ? V8ValueNull.NULL : qf.KN(map)) + ")";
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class w6 extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72367O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72368n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f72369o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72371t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f72369o |= Integer.MIN_VALUE;
            return u.this.O(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(String str, String str2, Continuation continuation) {
        w6 w6Var;
        IOException iOException;
        K6D.j jVar;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        K6D.Ml mlO;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f72369o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f72369o = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj = w6Var.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f72369o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            rB.Ml ml = this.rl;
            K6D.j jVarNr = (ml == null || (mlO = ml.O()) == null) ? null : Ml.n.nr(mlO, qE.j.f72306n.n(), null, 2, null);
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            try {
                Ml ml2 = new Ml(str, objectRef3, str2, objectRef4, null);
                w6Var.f72368n = jVarNr;
                w6Var.f72371t = objectRef3;
                w6Var.f72367O = objectRef4;
                w6Var.f72369o = 1;
                Object objJ2 = Lu.J2(ml2, w6Var);
                if (objJ2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jVar = jVarNr;
                objectRef = objectRef3;
                obj = objJ2;
                objectRef2 = objectRef4;
            } catch (IOException e2) {
                iOException = e2;
                jVar = jVarNr;
                if (jVar != null) {
                    j.C0175j.rl(jVar, "IOException", null, pq.I28.n(pq.n.O("message", String.valueOf(iOException.getMessage()))), 2, null);
                }
                return new n.C1266n(iOException);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(Apsps.oKFtpzhejw);
            }
            objectRef2 = (Ref.ObjectRef) w6Var.f72367O;
            objectRef = (Ref.ObjectRef) w6Var.f72371t;
            jVar = (K6D.j) w6Var.f72368n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (IOException e3) {
                iOException = e3;
                if (jVar != null) {
                }
                return new n.C1266n(iOException);
            }
        }
        n nVar = (n) obj;
        if (jVar != null) {
            pq.Ml ml3 = new pq.Ml();
            Duration duration = (Duration) objectRef.element;
            if (duration != null) {
                ml3.nr("defaults_download_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(duration.getRawValue(), DurationUnit.SECONDS)));
            }
            Duration duration2 = (Duration) objectRef2.element;
            if (duration2 != null) {
                ml3.nr("overrides_download_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(duration2.getRawValue(), DurationUnit.SECONDS)));
            }
            jVar.n(ml3);
        }
        return new n.w6(nVar);
    }

    public u(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f72344n = okHttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(String str, Continuation continuation) throws Throwable {
        I28 i28;
        Throwable th;
        Object objT;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f72345O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f72345O = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        I28 i282 = i28;
        Object obj = i282.f72346n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i282.f72345O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Wre wre = new Wre(str, null);
            Function2 function2 = new Function2() { // from class: qE.DAz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Boolean.valueOf(u.Uo(((Integer) obj2).intValue(), (x0X.n) obj3));
                }
            };
            i282.f72345O = 1;
            th = null;
            objT = q3M.Ml.t(3, 500L, 0L, 1.0d, wre, function2, null, i282, 68, null);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objT = obj;
            th = null;
        }
        x0X.n nVar = (x0X.n) objT;
        if (nVar instanceof n.C1266n) {
            throw ((Throwable) ((n.C1266n) nVar).n());
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = (String) ((n.w6) nVar).n();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(str2));
        try {
            Intrinsics.checkNotNull(jsonReaderOf);
            jsonReaderOf.beginObject();
            while (jsonReaderOf.hasNext()) {
                String strNextName = jsonReaderOf.nextName();
                Intrinsics.checkNotNullExpressionValue(strNextName, "nextName(...)");
                BufferedSource bufferedSourceNextSource = jsonReaderOf.nextSource();
                try {
                    String utf8 = bufferedSourceNextSource.readUtf8();
                    CloseableKt.closeFinally(bufferedSourceNextSource, th);
                    mapCreateMapBuilder.put(strNextName, utf8);
                } finally {
                }
            }
            jsonReaderOf.endObject();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(jsonReaderOf, th);
            return qf.rl(MapsKt.build(mapCreateMapBuilder));
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(int i2, x0X.n result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return x0X.w6.J2(result);
    }

    public final void KN(rB.Ml logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.rl = logger;
    }
}
