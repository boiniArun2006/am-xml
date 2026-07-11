package pu;

import KfI.C1396z;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml implements qz {
    private static final j Uo = new j(null);
    private final yB.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final HZ.j f72074O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CoroutineContext f72075n;
    private final pu.j nr;
    private final s9b.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final KfI.n f72076t;

    /* JADX INFO: renamed from: pu.Ml$Ml, reason: collision with other inner class name */
    static final class C1106Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72077n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72078t;

        C1106Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1106Ml c1106Ml = new C1106Ml(continuation);
            c1106Ml.f72078t = obj;
            return c1106Ml;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((C1106Ml) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72077n == 0) {
                ResultKt.throwOnFailure(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f72078t));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f72079O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72080n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f72081r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72082t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72079O = obj;
            this.f72081r |= Integer.MIN_VALUE;
            return Ml.this.nr(this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f72083O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72084n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72086t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = Ml.this.new w6(continuation);
            w6Var.J2 = obj;
            return w6Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
        
            if (r13.mUb(r0, r12) == r4) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
        
            if (r13.gh(r0, r12) == r4) goto L66;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
        /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws JSONException {
            Ref.ObjectRef objectRef;
            Boolean bool;
            Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            Ref.ObjectRef objectRef4;
            Ref.ObjectRef objectRef5;
            Unit unit;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f72083O) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = (JSONObject) this.J2;
                    Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    if (jSONObject.has("app_quality")) {
                        Object obj2 = jSONObject.get("app_quality");
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        try {
                            bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        } catch (JSONException e2) {
                            e = e2;
                            bool = null;
                        }
                        try {
                            if (jSONObject2.has("sampling_rate")) {
                                objectRef6.element = (Double) jSONObject2.get("sampling_rate");
                            }
                            if (jSONObject2.has("session_timeout_seconds")) {
                                objectRef.element = (Integer) jSONObject2.get("session_timeout_seconds");
                            }
                            if (jSONObject2.has("cache_duration")) {
                                objectRef7.element = (Integer) jSONObject2.get("cache_duration");
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                        }
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        C cJ2 = Ml.this.J2();
                        this.J2 = objectRef6;
                        this.f72084n = objectRef;
                        this.f72086t = objectRef7;
                        this.f72083O = 1;
                        if (cJ2.ty(bool, this) != coroutine_suspended) {
                            objectRef4 = objectRef6;
                            objectRef5 = objectRef;
                            objectRef3 = objectRef7;
                            objectRef = objectRef5;
                            objectRef2 = objectRef4;
                            if (((Integer) objectRef.element) != null) {
                                C cJ22 = Ml.this.J2();
                                Integer num = (Integer) objectRef.element;
                                this.J2 = objectRef2;
                                this.f72084n = objectRef3;
                                this.f72086t = null;
                                this.f72083O = 2;
                                if (cJ22.az(num, this) != coroutine_suspended) {
                                }
                            }
                            if (((Double) objectRef2.element) != null) {
                                C cJ23 = Ml.this.J2();
                                Double d2 = (Double) objectRef2.element;
                                this.J2 = objectRef3;
                                this.f72084n = null;
                                this.f72086t = null;
                                this.f72083O = 3;
                                if (cJ23.xMQ(d2, this) != coroutine_suspended) {
                                }
                            }
                            if (((Integer) objectRef3.element) == null) {
                                unit = null;
                                if (unit == null) {
                                    C cJ24 = Ml.this.J2();
                                    Integer numBoxInt = Boxing.boxInt(86400);
                                    this.J2 = null;
                                    this.f72084n = null;
                                    this.f72086t = null;
                                    this.f72083O = 5;
                                    if (cJ24.mUb(numBoxInt, this) != coroutine_suspended) {
                                    }
                                }
                                C cJ25 = Ml.this.J2();
                                Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                                this.J2 = null;
                                this.f72084n = null;
                                this.f72086t = null;
                                this.f72083O = 6;
                            } else {
                                C cJ26 = Ml.this.J2();
                                Integer num2 = (Integer) objectRef3.element;
                                this.J2 = null;
                                this.f72084n = null;
                                this.f72086t = null;
                                this.f72083O = 4;
                            }
                            break;
                        }
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef6;
                    objectRef3 = objectRef7;
                    if (((Integer) objectRef.element) != null) {
                    }
                    if (((Double) objectRef2.element) != null) {
                    }
                    if (((Integer) objectRef3.element) == null) {
                    }
                    break;
                case 1:
                    objectRef3 = (Ref.ObjectRef) this.f72086t;
                    objectRef5 = (Ref.ObjectRef) this.f72084n;
                    objectRef4 = (Ref.ObjectRef) this.J2;
                    ResultKt.throwOnFailure(obj);
                    objectRef = objectRef5;
                    objectRef2 = objectRef4;
                    if (((Integer) objectRef.element) != null) {
                    }
                    if (((Double) objectRef2.element) != null) {
                    }
                    if (((Integer) objectRef3.element) == null) {
                    }
                    break;
                case 2:
                    objectRef3 = (Ref.ObjectRef) this.f72084n;
                    objectRef2 = (Ref.ObjectRef) this.J2;
                    ResultKt.throwOnFailure(obj);
                    if (((Double) objectRef2.element) != null) {
                    }
                    if (((Integer) objectRef3.element) == null) {
                    }
                    break;
                case 3:
                    objectRef3 = (Ref.ObjectRef) this.J2;
                    ResultKt.throwOnFailure(obj);
                    if (((Integer) objectRef3.element) == null) {
                    }
                    break;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    unit = Unit.INSTANCE;
                    if (unit == null) {
                    }
                    C cJ252 = Ml.this.J2();
                    Long lBoxLong2 = Boxing.boxLong(System.currentTimeMillis());
                    this.J2 = null;
                    this.f72084n = null;
                    this.f72086t = null;
                    this.f72083O = 6;
                    break;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    C cJ2522 = Ml.this.J2();
                    Long lBoxLong22 = Boxing.boxLong(System.currentTimeMillis());
                    this.J2 = null;
                    this.f72084n = null;
                    this.f72086t = null;
                    this.f72083O = 6;
                    break;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, Continuation continuation) {
            return ((w6) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Ml(CoroutineContext backgroundDispatcher, s9b.I28 firebaseInstallationsApi, KfI.n appInfo, pu.j configsFetcher, HZ.j lazySettingsCache) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(lazySettingsCache, "lazySettingsCache");
        this.f72075n = backgroundDispatcher;
        this.rl = firebaseInstallationsApi;
        this.f72076t = appInfo;
        this.nr = configsFetcher;
        this.f72074O = lazySettingsCache;
        this.J2 = yB.CN3.rl(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C J2() {
        Object obj = this.f72074O.get();
        Intrinsics.checkNotNullExpressionValue(obj, "lazySettingsCache.get()");
        return (C) obj;
    }

    private final String Uo(String str) {
        return new Regex("/").replace(str, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b9, B:49:0x00c7, B:52:0x00d2), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b9, B:49:0x00c7, B:52:0x00d2), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pu.qz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Continuation continuation) throws Throwable {
        n nVar;
        yB.j jVar;
        Ml ml;
        yB.j jVar2;
        Throwable th;
        yB.j jVar3;
        String strRl;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f72081r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f72081r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f72079O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f72081r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.J2.Uo() && !J2().nr()) {
                    return Unit.INSTANCE;
                }
                jVar = this.J2;
                nVar.f72080n = this;
                nVar.f72082t = jVar;
                nVar.f72081r = 1;
                if (jVar.Z(null, nVar) != coroutine_suspended) {
                    ml = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = (yB.j) nVar.f72080n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        jVar2.T(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        jVar2.T(null);
                        throw th;
                    }
                }
                jVar3 = (yB.j) nVar.f72082t;
                ml = (Ml) nVar.f72080n;
                try {
                    ResultKt.throwOnFailure(obj);
                    strRl = ((C1396z) obj).rl();
                    if (!Intrinsics.areEqual(strRl, "")) {
                        Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        Unit unit2 = Unit.INSTANCE;
                        jVar3.T(null);
                        return unit2;
                    }
                    Pair pair = TuplesKt.to("X-Crashlytics-Installation-ID", strRl);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    Pair pair2 = TuplesKt.to("X-Crashlytics-Device-Model", ml.Uo(str));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                    Pair pair3 = TuplesKt.to("X-Crashlytics-OS-Build-Version", ml.Uo(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    Map mapMapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("X-Crashlytics-OS-Display-Version", ml.Uo(RELEASE)), TuplesKt.to("X-Crashlytics-API-Client-Version", ml.f72076t.J2()));
                    Log.d("SessionConfigFetcher", "Fetching settings from server.");
                    pu.j jVar4 = ml.nr;
                    w6 w6Var = ml.new w6(null);
                    C1106Ml c1106Ml = new C1106Ml(null);
                    nVar.f72080n = jVar3;
                    nVar.f72082t = null;
                    nVar.f72081r = 3;
                    if (jVar4.n(mapMapOf, w6Var, c1106Ml, nVar) != coroutine_suspended) {
                        jVar2 = jVar3;
                        Unit unit3 = Unit.INSTANCE;
                        jVar2.T(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    jVar2 = jVar3;
                    jVar2.T(null);
                    throw th;
                }
            }
            yB.j jVar5 = (yB.j) nVar.f72082t;
            ml = (Ml) nVar.f72080n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar5;
            if (!ml.J2().nr()) {
                Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                Unit unit4 = Unit.INSTANCE;
                jVar.T(null);
                return unit4;
            }
            C1396z.j jVar6 = C1396z.f5761t;
            s9b.I28 i28 = ml.rl;
            nVar.f72080n = ml;
            nVar.f72082t = jVar;
            nVar.f72081r = 2;
            Object objN = jVar6.n(i28, nVar);
            if (objN != coroutine_suspended) {
                jVar3 = jVar;
                obj = objN;
                strRl = ((C1396z) obj).rl();
                if (!Intrinsics.areEqual(strRl, "")) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            jVar2 = jVar;
            th = th4;
            jVar2.T(null);
            throw th;
        }
    }

    @Override // pu.qz
    public Boolean n() {
        return J2().Uo();
    }

    @Override // pu.qz
    public Duration rl() {
        Integer numO = J2().O();
        if (numO != null) {
            Duration.Companion companion = Duration.INSTANCE;
            return Duration.m1650boximpl(DurationKt.toDuration(numO.intValue(), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // pu.qz
    public Double t() {
        return J2().J2();
    }
}
