package qE;

import GJW.OU;
import GJW.vd;
import K6D.Ml;
import K6D.j;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.oracle.models.OracleHttpRequestMethod;
import com.bendingspoons.oracle.models.OracleResponse;
import com.squareup.moshi.JsonDataException;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpMethod;
import qE.ci;
import qu.Dsr;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class ci implements qu.Dsr {
    private final QJ J2;
    private final rB.Ml KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final OkHttpClient f72267O;
    private final v8.j Uo;
    private final Q nr;
    private final Dsr.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qu.n f72268t;
    public static final j xMQ = new j(null);
    public static final int mUb = 8;
    private static final MediaType gh = MediaType.INSTANCE.get("application/json; charset=UTF-8");

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ et.n f72269N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72270O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        long f72271S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ Integer f72272T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ KPz.j f72273X;
        final /* synthetic */ et.n Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        long f72274Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f72276g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72277n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f72278o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f72279r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72280t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ et.n f72281v;

        static final class j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f72282n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f72283t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(String str, Continuation continuation) {
                super(1, continuation);
                this.f72283t = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new j(this.f72283t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f72282n == 0) {
                    ResultKt.throwOnFailure(obj);
                    return "Received response:\n" + xFr.fuX.O(this.f72283t, 2, 0, null, null, false, 30, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(KPz.j jVar, Integer num, et.n nVar, et.n nVar2, et.n nVar3, Continuation continuation) {
            super(2, continuation);
            this.f72273X = jVar;
            this.f72272T = num;
            this.f72269N = nVar;
            this.f72281v = nVar2;
            this.Xw = nVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final String xMQ(Ref.ObjectRef objectRef) {
            return "Sending request:\n" + xFr.s4.KN(((Request) objectRef.element).toString(), Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, null, 2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ci.this.new n(this.f72273X, this.f72272T, this.f72269N, this.f72281v, this.Xw, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0298  */
        /* JADX WARN: Type inference failed for: r2v28, types: [T, kotlin.time.Duration] */
        /* JADX WARN: Type inference failed for: r4v23, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final Ref.ObjectRef objectRef;
            long jM1761markNowz9LOYto;
            Object objUo;
            K6D.j jVar;
            Ref.ObjectRef objectRef2;
            long jNanoTime;
            Ref.LongRef longRef;
            Object objN;
            K6D.j jVar2;
            long j2;
            Ref.LongRef longRef2;
            x0X.n nVar;
            Ref.ObjectRef objectRef3;
            long jM1766elapsedNowUwyO8pc;
            pq.Ml ml;
            K6D.j jVar3;
            Ref.ObjectRef objectRef4;
            Ref.ObjectRef objectRef5;
            long j3;
            long j4;
            Ref.ObjectRef objectRef6;
            Ref.ObjectRef objectRef7;
            pq.Ml ml2;
            Duration duration;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.E2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                K6D.j jVarNr = Ml.n.nr(ci.this.KN.O(), qE.j.f72306n.rl(this.f72273X), null, 2, null);
                boolean z2 = this.f72272T != null;
                objectRef = new Ref.ObjectRef();
                ci ciVar = ci.this;
                KPz.j jVar4 = this.f72273X;
                et.n nVar2 = this.f72269N;
                jM1761markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto();
                this.f72277n = jVarNr;
                this.f72280t = objectRef;
                this.f72270O = objectRef;
                this.f72274Z = jM1761markNowz9LOYto;
                this.E2 = 1;
                objUo = ciVar.Uo(jVar4, nVar2, z2, this);
                if (objUo != coroutine_suspended) {
                    jVar = jVarNr;
                    objectRef2 = objectRef;
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                long j5 = this.f72274Z;
                objectRef2 = (Ref.ObjectRef) this.f72270O;
                Ref.ObjectRef objectRef8 = (Ref.ObjectRef) this.f72280t;
                jVar = (K6D.j) this.f72277n;
                ResultKt.throwOnFailure(obj);
                jM1761markNowz9LOYto = j5;
                objectRef = objectRef8;
                objUo = obj;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = this.f72276g;
                    jM1766elapsedNowUwyO8pc = this.f72271S;
                    j4 = this.f72274Z;
                    objectRef6 = (Ref.ObjectRef) this.f72278o;
                    ml2 = (pq.Ml) this.f72279r;
                    objectRef7 = (Ref.ObjectRef) this.J2;
                    objectRef5 = (Ref.ObjectRef) this.f72270O;
                    longRef2 = (Ref.LongRef) this.f72280t;
                    jVar3 = (K6D.j) this.f72277n;
                    ResultKt.throwOnFailure(obj);
                    objectRef6.element = Duration.m1650boximpl(TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(j3));
                    ml = ml2;
                    objectRef3 = objectRef5;
                    long j6 = j4;
                    objectRef4 = objectRef7;
                    j2 = j6;
                    K6D.j jVar5 = jVar3;
                    pq.Ml ml3 = new pq.Ml();
                    DurationUnit durationUnit = DurationUnit.SECONDS;
                    ml3.nr("preparation_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(j2, durationUnit)));
                    ml3.nr("execution_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(longRef2.element, durationUnit)));
                    ml3.nr("deserialization_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(jM1766elapsedNowUwyO8pc, durationUnit)));
                    duration = (Duration) objectRef4.element;
                    if (duration != null) {
                        ml3.nr("handling_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(duration.getRawValue(), durationUnit)));
                    }
                    jVar5.n(ml3.rl(ml));
                    return new n.w6(objectRef3.element);
                }
                long j7 = this.f72271S;
                j2 = this.f72274Z;
                longRef = (Ref.LongRef) this.f72280t;
                K6D.j jVar6 = (K6D.j) this.f72277n;
                ResultKt.throwOnFailure(obj);
                jNanoTime = j7;
                jVar2 = jVar6;
                objN = obj;
                longRef2 = longRef;
                nVar = (x0X.n) objN;
                if (!(nVar instanceof n.C1266n)) {
                    NetworkError.n nVar3 = new NetworkError.n((IOException) ((n.C1266n) nVar).n());
                    Z.rl(jVar2, nVar3, null, 2, null);
                    return new n.C1266n(nVar3);
                }
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objN2 = ((n.w6) nVar).n();
                longRef2.element = DurationKt.toDuration(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS);
                Closeable closeable = (Closeable) objN2;
                et.n nVar4 = this.f72281v;
                try {
                    final Response response = (Response) closeable;
                    String str = (String) x0X.w6.nr(x0X.w6.n(new Function0() { // from class: qE.afx
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ci.n.mUb(response);
                        }
                    }));
                    if (str == null) {
                        NetworkError.n nVar5 = new NetworkError.n(new IOException("No response body."));
                        Z.rl(jVar2, nVar5, null, 2, null);
                        n.C1266n c1266n = new n.C1266n(nVar5);
                        CloseableKt.closeFinally(closeable, null);
                        return c1266n;
                    }
                    if (!response.isSuccessful()) {
                        NetworkError.j jVar7 = new NetworkError.j(response.code(), x0X.w6.nr(nVar4.n(str)));
                        Z.rl(jVar2, jVar7, null, 2, null);
                        n.C1266n c1266n2 = new n.C1266n(jVar7);
                        CloseableKt.closeFinally(closeable, null);
                        return c1266n2;
                    }
                    CloseableKt.closeFinally(closeable, null);
                    v8.n.J2(ci.this.Uo, new j(str, null));
                    objectRef3 = new Ref.ObjectRef();
                    et.n nVar6 = this.Xw;
                    TimeSource.Monotonic monotonic = TimeSource.Monotonic.INSTANCE;
                    long jM1761markNowz9LOYto2 = monotonic.m1761markNowz9LOYto();
                    x0X.n nVarN = nVar6.n(str);
                    if (nVarN instanceof n.C1266n) {
                        NetworkError.w6 w6Var = new NetworkError.w6(new JsonDataException((Throwable) ((n.C1266n) nVarN).n()), null, 2, null);
                        j.C0175j.rl(jVar2, com.bendingspoons.networking.j.rl(w6Var), null, null, 6, null);
                        return new n.C1266n(w6Var);
                    }
                    if (!(nVarN instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objectRef3.element = ((n.w6) nVarN).n();
                    jM1766elapsedNowUwyO8pc = TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(jM1761markNowz9LOYto2);
                    Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                    ml = new pq.Ml();
                    T t3 = objectRef3.element;
                    if (!(t3 instanceof OracleResponse)) {
                        jVar3 = jVar2;
                        objectRef4 = objectRef9;
                        K6D.j jVar52 = jVar3;
                        pq.Ml ml32 = new pq.Ml();
                        DurationUnit durationUnit2 = DurationUnit.SECONDS;
                        ml32.nr("preparation_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(j2, durationUnit2)));
                        ml32.nr("execution_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(longRef2.element, durationUnit2)));
                        ml32.nr("deserialization_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(jM1766elapsedNowUwyO8pc, durationUnit2)));
                        duration = (Duration) objectRef4.element;
                        if (duration != null) {
                        }
                        jVar52.n(ml32.rl(ml));
                        return new n.w6(objectRef3.element);
                    }
                    ((OracleResponse) t3).setRawBody(str);
                    ci ciVar2 = ci.this;
                    Integer num = this.f72272T;
                    long jM1761markNowz9LOYto3 = monotonic.m1761markNowz9LOYto();
                    QJ qj = ciVar2.J2;
                    OracleResponse oracleResponse = (OracleResponse) objectRef3.element;
                    this.f72277n = jVar2;
                    this.f72280t = longRef2;
                    this.f72270O = objectRef3;
                    this.J2 = objectRef9;
                    this.f72279r = ml;
                    this.f72278o = objectRef9;
                    this.f72274Z = j2;
                    jVar3 = jVar2;
                    this.f72271S = jM1766elapsedNowUwyO8pc;
                    this.f72276g = jM1761markNowz9LOYto3;
                    this.E2 = 3;
                    if (qj.Uo(oracleResponse, ml, num, this) != coroutine_suspended) {
                        objectRef5 = objectRef3;
                        j3 = jM1761markNowz9LOYto3;
                        jM1766elapsedNowUwyO8pc = jM1766elapsedNowUwyO8pc;
                        j4 = j2;
                        objectRef6 = objectRef9;
                        objectRef7 = objectRef6;
                        ml2 = ml;
                        objectRef6.element = Duration.m1650boximpl(TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(j3));
                        ml = ml2;
                        objectRef3 = objectRef5;
                        long j62 = j4;
                        objectRef4 = objectRef7;
                        j2 = j62;
                        K6D.j jVar522 = jVar3;
                        pq.Ml ml322 = new pq.Ml();
                        DurationUnit durationUnit22 = DurationUnit.SECONDS;
                        ml322.nr("preparation_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(j2, durationUnit22)));
                        ml322.nr("execution_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(longRef2.element, durationUnit22)));
                        ml322.nr("deserialization_duration", Boxing.boxDouble(Duration.m1688toDoubleimpl(jM1766elapsedNowUwyO8pc, durationUnit22)));
                        duration = (Duration) objectRef4.element;
                        if (duration != null) {
                        }
                        jVar522.n(ml322.rl(ml));
                        return new n.w6(objectRef3.element);
                    }
                    return coroutine_suspended;
                } finally {
                }
            }
            x0X.n nVar7 = (x0X.n) objUo;
            if (nVar7 instanceof n.C1266n) {
                n.C1266n c1266n3 = (n.C1266n) nVar7;
                Z.rl(jVar, (NetworkError) c1266n3.n(), null, 2, null);
                return c1266n3;
            }
            if (!(nVar7 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            objectRef2.element = ((n.w6) nVar7).n();
            long jM1766elapsedNowUwyO8pc2 = TimeSource.Monotonic.ValueTimeMark.m1766elapsedNowUwyO8pc(jM1761markNowz9LOYto);
            v8.n.O(ci.this.Uo, new Function0() { // from class: qE.g9s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ci.n.xMQ(objectRef);
                }
            });
            jNanoTime = System.nanoTime();
            longRef = new Ref.LongRef();
            Call callNewCall = ci.this.f72267O.newCall((Request) objectRef.element);
            this.f72277n = jVar;
            this.f72280t = longRef;
            this.f72270O = null;
            this.f72274Z = jM1766elapsedNowUwyO8pc2;
            this.f72271S = jNanoTime;
            this.E2 = 2;
            objN = Ht.j.n(callNewCall, this);
            if (objN != coroutine_suspended) {
                jVar2 = jVar;
                j2 = jM1766elapsedNowUwyO8pc2;
                longRef2 = longRef;
                nVar = (x0X.n) objN;
                if (!(nVar instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String mUb(Response response) {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                return responseBodyBody.string();
            }
            return null;
        }
    }

    static final class w6 extends ContinuationImpl {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72284O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f72285S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f72286Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72288n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f72289o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f72290r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72291t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72285S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return ci.this.Uo(null, null, false, this);
        }
    }

    public ci(Dsr.n config, qu.n endpointProvider, Q baseHeaderProvider, OkHttpClient client, rB.Ml spiderSense, QJ oracleResponseHandler, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(endpointProvider, "endpointProvider");
        Intrinsics.checkNotNullParameter(baseHeaderProvider, "baseHeaderProvider");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(oracleResponseHandler, "oracleResponseHandler");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.rl = config;
        this.f72268t = endpointProvider;
        this.nr = baseHeaderProvider;
        this.f72267O = client;
        this.J2 = oracleResponseHandler;
        this.Uo = localLogger;
        this.KN = d3.j.J2(spiderSense, "oracle", "service");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140 A[LOOP:0: B:44:0x013a->B:46:0x0140, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Uo(KPz.j jVar, et.n nVar, boolean z2, Continuation continuation) {
        w6 w6Var;
        KPz.j jVar2;
        HttpUrl.Companion companion;
        RequestBody requestBody;
        ci ciVar;
        x0X.n nVarT;
        HttpUrl httpUrl;
        Request.Builder builder;
        KPz.j jVar3;
        ci ciVar2;
        RequestBody requestBody2;
        Request.Builder builder2;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.E2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objN = w6Var.f72285S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.E2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Object objN2 = jVar.n();
            RequestBody requestBodyCreate = null;
            if (objN2 != null && (nVarT = nVar.t(objN2)) != null) {
                if (nVarT instanceof n.C1266n) {
                    return new n.C1266n(new NetworkError.w6(new JsonDataException((Throwable) ((n.C1266n) nVarT).n()), null, 2, null));
                }
                if (!(nVarT instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = (String) ((n.w6) nVarT).n();
                if (str != null) {
                    requestBodyCreate = RequestBody.INSTANCE.create(str, gh);
                }
            }
            HttpUrl.Companion companion2 = HttpUrl.INSTANCE;
            qu.n nVar2 = this.f72268t;
            w6Var.f72288n = this;
            w6Var.f72291t = jVar;
            w6Var.f72284O = requestBodyCreate;
            w6Var.J2 = companion2;
            w6Var.f72286Z = z2;
            w6Var.E2 = 1;
            objN = nVar2.n(w6Var);
            if (objN != coroutine_suspended) {
                RequestBody requestBody3 = requestBodyCreate;
                jVar2 = jVar;
                companion = companion2;
                requestBody = requestBody3;
                ciVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ciVar2 = (ci) w6Var.f72289o;
            builder2 = (Request.Builder) w6Var.f72290r;
            builder = (Request.Builder) w6Var.J2;
            httpUrl = (HttpUrl) w6Var.f72284O;
            requestBody2 = (RequestBody) w6Var.f72291t;
            jVar3 = (KPz.j) w6Var.f72288n;
            ResultKt.throwOnFailure(objN);
            for (Map.Entry entry : jVar3.t().entrySet()) {
                builder2.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            return new n.w6(ciVar2.KN(builder.url(httpUrl), jVar3.nr(), requestBody2).build());
        }
        z2 = w6Var.f72286Z;
        companion = (HttpUrl.Companion) w6Var.J2;
        requestBody = (RequestBody) w6Var.f72284O;
        jVar2 = (KPz.j) w6Var.f72291t;
        ciVar = (ci) w6Var.f72288n;
        ResultKt.throwOnFailure(objN);
        HttpUrl.Builder builderAddEncodedPathSegments = companion.get((String) objN).newBuilder().addEncodedPathSegments(StringsKt.removeSurrounding(jVar2.rl(), (CharSequence) "/"));
        for (Map.Entry entry2 : jVar2.O().entrySet()) {
            builderAddEncodedPathSegments.addEncodedQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        HttpUrl httpUrlBuild = builderAddEncodedPathSegments.build();
        Request.Builder builder3 = new Request.Builder();
        Q q2 = ciVar.nr;
        w6Var.f72288n = jVar2;
        w6Var.f72291t = requestBody;
        w6Var.f72284O = httpUrlBuild;
        w6Var.J2 = builder3;
        w6Var.f72290r = builder3;
        w6Var.f72289o = ciVar;
        w6Var.E2 = 2;
        if (q2.n(builder3, z2, w6Var) != coroutine_suspended) {
            httpUrl = httpUrlBuild;
            builder = builder3;
            jVar3 = jVar2;
            ciVar2 = ciVar;
            requestBody2 = requestBody;
            builder2 = builder;
            while (r11.hasNext()) {
            }
            return new n.w6(ciVar2.KN(builder.url(httpUrl), jVar3.nr(), requestBody2).build());
        }
        return coroutine_suspended;
    }

    @Override // qu.Dsr
    public Dsr.n getConfig() {
        return this.rl;
    }

    private final Request.Builder KN(Request.Builder builder, OracleHttpRequestMethod oracleHttpRequestMethod, RequestBody requestBody) {
        String string = oracleHttpRequestMethod.toString();
        if (requestBody == null && HttpMethod.requiresRequestBody(string)) {
            requestBody = RequestBody.INSTANCE.create("", gh);
        }
        builder.method(string, requestBody);
        return builder;
    }

    @Override // qu.Dsr
    public Object n(KPz.j jVar, et.n nVar, et.n nVar2, et.n nVar3, Integer num, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new n(jVar, num, nVar, nVar3, nVar2, null), continuation);
    }
}
