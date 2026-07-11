package kuA;

import GJW.C;
import GJW.FKk;
import GJW.Lu;
import GJW.nSC;
import GJW.vd;
import K6D.j;
import Pb7.Pl;
import TFv.nKK;
import TFv.r;
import android.content.Context;
import android.content.SharedPreferences;
import com.bendingspoons.crisper.internal.AsyncComputationException;
import com.bendingspoons.crisper.internal.InvalidMainFunctionResultException;
import com.bendingspoons.crisper.internal.MethodWrapper;
import com.bendingspoons.crisper.internal.console.CrisperConsole;
import com.bendingspoons.crisper.internal.context.CrisperContext;
import com.bendingspoons.crisper.internal.pico.CrisperPico;
import com.bendingspoons.crisper.internal.spidersense.CrisperSpiderSense;
import com.bendingspoons.crisper.internal.storage.CrisperStorage;
import com.caoccao.javet.enums.JavetPromiseRejectEvent;
import com.caoccao.javet.exceptions.JavetCompilationException;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Host;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetPromiseRejectCallback;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.primitive.V8ValueUndefined;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValuePromise;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml implements sqD.n {
    public static final j HI = new j(null);
    private final rB.Ml J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CrisperStorage f70298O;
    private final JSONObject Uo;
    private final Lazy az;
    private final FKk gh;
    private final TFv.Wre mUb;
    private final CrisperConsole nr;
    private final vd qie;
    private final sqD.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CZF.I28 f70299t;
    private final Map ty;
    private final r xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ml f70300O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70301n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ JSONObject f70302t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(JSONObject jSONObject, Ml ml, Continuation continuation) {
            super(2, continuation);
            this.f70302t = jSONObject;
            this.f70300O = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new CN3(this.f70302t, this.f70300O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f70301n == 0) {
                ResultKt.throwOnFailure(obj);
                Iterator<String> itKeys = this.f70302t.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                Ml ml = this.f70300O;
                JSONObject jSONObject = this.f70302t;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ml.Uo.put(next, jSONObject.get(next));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class I28 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f70303O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f70305Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f70306g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70307n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f70308o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f70309r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70310t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70305Z = obj;
            this.f70306g |= Integer.MIN_VALUE;
            return Ml.this.S(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kuA.Ml$Ml, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class C1042Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f70311O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70312n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f70313r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70314t;

        C1042Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70311O = obj;
            this.f70313r |= Integer.MIN_VALUE;
            return Ml.this.Z(null, this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Wre implements sqD.Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f70315n;

        @Override // sqD.Dsr
        public String getValue() {
            return this.f70315n;
        }

        Wre(aC aCVar) {
            this.f70315n = ((fuX) aCVar).n();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n extends ContinuationImpl {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f70316O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f70317S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f70318Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70320n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f70321o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f70322r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70323t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70317S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return Ml.this.r(null, this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ JSONObject E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f70324O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f70326Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ sqD.CN3 f70327g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70328n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f70329o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f70330r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f70331t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(sqD.CN3 cn3, JSONObject jSONObject, Continuation continuation) {
            super(2, continuation);
            this.f70327g = cn3;
            this.E2 = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new w6(this.f70327g, this.E2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0220 A[Catch: AsyncComputationException -> 0x0032, InvalidMainFunctionResultException -> 0x0035, JavetException -> 0x0038, TRY_LEAVE, TryCatch #17 {AsyncComputationException -> 0x0032, InvalidMainFunctionResultException -> 0x0035, JavetException -> 0x0038, blocks: (B:10:0x002b, B:107:0x01ed, B:116:0x0219, B:118:0x0220, B:21:0x0052), top: B:148:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0159 A[Catch: AsyncComputationException -> 0x01b8, InvalidMainFunctionResultException -> 0x01bd, JavetException -> 0x01c2, TRY_LEAVE, TryCatch #13 {AsyncComputationException -> 0x01b8, InvalidMainFunctionResultException -> 0x01bd, JavetException -> 0x01c2, blocks: (B:64:0x0153, B:66:0x0159, B:101:0x01ca, B:103:0x01ce, B:110:0x01f1, B:112:0x01f9, B:120:0x0224, B:121:0x0229), top: B:156:0x0153 }] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v29 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v35 */
        /* JADX WARN: Type inference failed for: r1v37 */
        /* JADX WARN: Type inference failed for: r1v38 */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r1v4, types: [K6D.j] */
        /* JADX WARN: Type inference failed for: r1v40 */
        /* JADX WARN: Type inference failed for: r1v41, types: [K6D.j] */
        /* JADX WARN: Type inference failed for: r1v43 */
        /* JADX WARN: Type inference failed for: r1v44 */
        /* JADX WARN: Type inference failed for: r1v45 */
        /* JADX WARN: Type inference failed for: r1v53 */
        /* JADX WARN: Type inference failed for: r1v54 */
        /* JADX WARN: Type inference failed for: r1v57 */
        /* JADX WARN: Type inference failed for: r1v6, types: [K6D.j] */
        /* JADX WARN: Type inference failed for: r1v8, types: [K6D.j] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v34 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v4, types: [org.json.JSONObject] */
        /* JADX WARN: Type inference failed for: r2v46 */
        /* JADX WARN: Type inference failed for: r2v47 */
        /* JADX WARN: Type inference failed for: r2v5, types: [org.json.JSONObject] */
        /* JADX WARN: Type inference failed for: r2v50 */
        /* JADX WARN: Type inference failed for: r2v51 */
        /* JADX WARN: Type inference failed for: r2v6, types: [org.json.JSONObject] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v28 */
        /* JADX WARN: Type inference failed for: r3v29 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r3v32 */
        /* JADX WARN: Type inference failed for: r3v33 */
        /* JADX WARN: Type inference failed for: r3v4, types: [sqD.CN3] */
        /* JADX WARN: Type inference failed for: r3v41 */
        /* JADX WARN: Type inference failed for: r3v42 */
        /* JADX WARN: Type inference failed for: r3v45 */
        /* JADX WARN: Type inference failed for: r3v46 */
        /* JADX WARN: Type inference failed for: r3v5, types: [sqD.CN3] */
        /* JADX WARN: Type inference failed for: r3v6, types: [sqD.CN3] */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            sqD.CN3 cn3;
            JSONObject jSONObject2;
            K6D.j jVar;
            Ml ml;
            sqD.CN3 cn32;
            K6D.Ml mlO;
            Object objO;
            JSONObject jSONObject3;
            aC aCVar;
            Object objWPU;
            K6D.j jVar2;
            JSONObject jSONObject4;
            sqD.CN3 cn33;
            AutoCloseable autoCloseableN;
            Throwable th;
            Object objWPU2;
            K6D.j jVar3;
            JSONObject jSONObject5;
            AutoCloseable autoCloseable;
            sqD.CN3 cn34;
            JSONObject jSONObject6;
            Throwable th2;
            sqD.Dsr dsr;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f70326Z;
            ?? r12 = 5;
            r12 = 5;
            r12 = 5;
            ?? r2 = 4;
            r2 = 4;
            r2 = 4;
            ?? r3 = 3;
            r3 = 3;
            r3 = 3;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ml ml2 = Ml.this;
                    sqD.CN3 cn35 = this.f70327g;
                    jSONObject = this.E2;
                    String string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    ajd.j jVarT = kuA.I28.t(cn35.getValue(), jSONObject);
                    rB.Ml ml3 = ml2.J2;
                    K6D.j jVarRl = (ml3 == null || (mlO = ml3.O()) == null) ? null : mlO.rl(jVarT, string);
                    try {
                        V8Runtime v8RuntimeXQ = ml2.XQ();
                        Intrinsics.checkNotNullExpressionValue(v8RuntimeXQ, "access$getRuntime(...)");
                        this.f70328n = cn35;
                        this.f70331t = jSONObject;
                        this.f70324O = ml2;
                        this.J2 = cn35;
                        this.f70330r = jSONObject;
                        this.f70329o = jVarRl;
                        this.f70326Z = 1;
                        if (ml2.r(v8RuntimeXQ, this) != coroutine_suspended) {
                            cn3 = cn35;
                            jSONObject2 = jSONObject;
                            jVar = jVarRl;
                            ml = ml2;
                            cn32 = cn3;
                            V8Runtime v8RuntimeXQ2 = ml.XQ();
                            Intrinsics.checkNotNullExpressionValue(v8RuntimeXQ2, "access$getRuntime(...)");
                            this.f70328n = cn3;
                            this.f70331t = jSONObject2;
                            this.f70324O = ml;
                            this.J2 = cn32;
                            this.f70330r = jVar;
                            this.f70329o = null;
                            this.f70326Z = 2;
                            objO = ml.o(v8RuntimeXQ2, cn32, jSONObject, this);
                            if (objO != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (AsyncComputationException e2) {
                        e = e2;
                        r3 = cn35;
                        r2 = jSONObject;
                        r12 = jVarRl;
                        if (r12 != 0) {
                            kuA.I28.J2(r12, e);
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    } catch (InvalidMainFunctionResultException e3) {
                        e = e3;
                        r3 = cn35;
                        r2 = jSONObject;
                        r12 = jVarRl;
                        if (r12 != 0) {
                            kuA.I28.Uo(r12, e);
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    } catch (JavetException e4) {
                        e = e4;
                        r3 = cn35;
                        r2 = jSONObject;
                        r12 = jVarRl;
                        if (r12 != 0) {
                            kuA.I28.KN(r12, e);
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    }
                }
                if (i2 == 1) {
                    jVar = (K6D.j) this.f70329o;
                    JSONObject jSONObject7 = (JSONObject) this.f70330r;
                    sqD.CN3 cn36 = (sqD.CN3) this.J2;
                    ml = (Ml) this.f70324O;
                    jSONObject2 = (JSONObject) this.f70331t;
                    cn3 = (sqD.CN3) this.f70328n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        jSONObject = jSONObject7;
                        cn32 = cn36;
                        V8Runtime v8RuntimeXQ22 = ml.XQ();
                        Intrinsics.checkNotNullExpressionValue(v8RuntimeXQ22, "access$getRuntime(...)");
                        this.f70328n = cn3;
                        this.f70331t = jSONObject2;
                        this.f70324O = ml;
                        this.J2 = cn32;
                        this.f70330r = jVar;
                        this.f70329o = null;
                        this.f70326Z = 2;
                        objO = ml.o(v8RuntimeXQ22, cn32, jSONObject, this);
                        if (objO != coroutine_suspended) {
                            jSONObject3 = jSONObject2;
                            aCVar = (aC) objO;
                            if (aCVar instanceof kuA.CN3) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (AsyncComputationException e5) {
                        e = e5;
                        r12 = jVar;
                        r2 = jSONObject2;
                        r3 = cn3;
                        if (r12 != 0) {
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    } catch (InvalidMainFunctionResultException e6) {
                        e = e6;
                        r12 = jVar;
                        r2 = jSONObject2;
                        r3 = cn3;
                        if (r12 != 0) {
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    } catch (JavetException e7) {
                        e = e7;
                        r12 = jVar;
                        r2 = jSONObject2;
                        r3 = cn3;
                        if (r12 != 0) {
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    }
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            K6D.j jVar4 = (K6D.j) this.f70324O;
                            JSONObject jSONObject8 = (JSONObject) this.f70331t;
                            sqD.CN3 cn37 = (sqD.CN3) this.f70328n;
                            ResultKt.throwOnFailure(obj);
                            objWPU = obj;
                            jVar2 = jVar4;
                            jSONObject4 = jSONObject8;
                            cn33 = cn37;
                        } else {
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            K6D.j jVar5 = (K6D.j) this.f70324O;
                            JSONObject jSONObject9 = (JSONObject) this.f70331t;
                            sqD.CN3 cn38 = (sqD.CN3) this.f70328n;
                            ResultKt.throwOnFailure(obj);
                            objWPU = obj;
                            jVar2 = jVar5;
                            jSONObject4 = jSONObject9;
                            cn33 = cn38;
                        }
                        dsr = (sqD.Dsr) objWPU;
                        r12 = jVar2;
                        r2 = jSONObject4;
                        r3 = cn33;
                        n.w6 w6Var = new n.w6(dsr);
                        if (r12 != 0) {
                            j.C0175j.n(r12, null, 1, null);
                        }
                        return w6Var;
                    }
                    autoCloseable = (AutoCloseable) this.J2;
                    jVar3 = (K6D.j) this.f70324O;
                    jSONObject5 = (JSONObject) this.f70331t;
                    sqD.CN3 cn39 = (sqD.CN3) this.f70328n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objWPU2 = obj;
                        cn3 = cn39;
                    } catch (Throwable th3) {
                        th2 = th3;
                        autoCloseableN = autoCloseable;
                        jVar = jVar3;
                        jSONObject6 = jSONObject5;
                        cn34 = cn39;
                        th = th2;
                        r2 = jSONObject6;
                        r3 = cn34;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            try {
                                AutoCloseableKt.closeFinally(autoCloseableN, th);
                                throw th4;
                            } catch (AsyncComputationException e8) {
                                e = e8;
                                r12 = jVar;
                                if (r12 != 0) {
                                }
                                return new n.C1266n(new sqD.Ml(e, r3, r2));
                            } catch (InvalidMainFunctionResultException e9) {
                                e = e9;
                                r12 = jVar;
                                if (r12 != 0) {
                                }
                                return new n.C1266n(new sqD.Ml(e, r3, r2));
                            } catch (JavetException e10) {
                                e = e10;
                                r12 = jVar;
                                if (r12 != 0) {
                                }
                                return new n.C1266n(new sqD.Ml(e, r3, r2));
                            }
                        }
                    }
                    try {
                        dsr = (sqD.Dsr) objWPU2;
                        try {
                            AutoCloseableKt.closeFinally(autoCloseable, null);
                            r12 = jVar3;
                            r2 = jSONObject5;
                            r3 = cn3;
                            n.w6 w6Var2 = new n.w6(dsr);
                            if (r12 != 0) {
                            }
                            return w6Var2;
                        } catch (AsyncComputationException e11) {
                            e = e11;
                            r12 = jVar3;
                            r2 = jSONObject5;
                            r3 = cn3;
                            if (r12 != 0) {
                            }
                            return new n.C1266n(new sqD.Ml(e, r3, r2));
                        } catch (InvalidMainFunctionResultException e12) {
                            e = e12;
                            r12 = jVar3;
                            r2 = jSONObject5;
                            r3 = cn3;
                            if (r12 != 0) {
                            }
                            return new n.C1266n(new sqD.Ml(e, r3, r2));
                        } catch (JavetException e13) {
                            e = e13;
                            r12 = jVar3;
                            r2 = jSONObject5;
                            r3 = cn3;
                            if (r12 != 0) {
                            }
                            return new n.C1266n(new sqD.Ml(e, r3, r2));
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        autoCloseableN = autoCloseable;
                        jVar = jVar3;
                        jSONObject6 = jSONObject5;
                        cn34 = cn3;
                        th = th2;
                        r2 = jSONObject6;
                        r3 = cn34;
                        throw th;
                    }
                }
                K6D.j jVar6 = (K6D.j) this.f70330r;
                cn32 = (sqD.CN3) this.J2;
                Ml ml4 = (Ml) this.f70324O;
                jSONObject3 = (JSONObject) this.f70331t;
                sqD.CN3 cn310 = (sqD.CN3) this.f70328n;
                try {
                    ResultKt.throwOnFailure(obj);
                    cn3 = cn310;
                    ml = ml4;
                    jVar = jVar6;
                    objO = obj;
                    try {
                        aCVar = (aC) objO;
                        if (aCVar instanceof kuA.CN3) {
                            sqD.CN3 cn311 = cn32;
                            Ml ml5 = ml;
                            if (aCVar instanceof fuX) {
                                V8Runtime v8RuntimeXQ3 = ml5.XQ();
                                Intrinsics.checkNotNullExpressionValue(v8RuntimeXQ3, "access$getRuntime(...)");
                                this.f70328n = cn3;
                                this.f70331t = jSONObject3;
                                this.f70324O = jVar;
                                this.J2 = null;
                                this.f70330r = null;
                                this.f70326Z = 4;
                                objWPU = ml5.WPU(v8RuntimeXQ3, aCVar, null, cn311, this);
                                if (objWPU != coroutine_suspended) {
                                    jVar2 = jVar;
                                    jSONObject4 = jSONObject3;
                                    cn33 = cn3;
                                    dsr = (sqD.Dsr) objWPU;
                                    r12 = jVar2;
                                    r2 = jSONObject4;
                                    r3 = cn33;
                                }
                            } else {
                                if (!Intrinsics.areEqual(aCVar, Dsr.f70297n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                V8Runtime v8RuntimeXQ4 = ml5.XQ();
                                Intrinsics.checkNotNullExpressionValue(v8RuntimeXQ4, "access$getRuntime(...)");
                                this.f70328n = cn3;
                                this.f70331t = jSONObject3;
                                this.f70324O = jVar;
                                this.J2 = null;
                                this.f70330r = null;
                                this.f70326Z = 5;
                                objWPU = ml5.WPU(v8RuntimeXQ4, aCVar, null, cn311, this);
                                if (objWPU != coroutine_suspended) {
                                    jVar2 = jVar;
                                    jSONObject4 = jSONObject3;
                                    cn33 = cn3;
                                    dsr = (sqD.Dsr) objWPU;
                                    r12 = jVar2;
                                    r2 = jSONObject4;
                                    r3 = cn33;
                                }
                            }
                            n.w6 w6Var22 = new n.w6(dsr);
                            if (r12 != 0) {
                            }
                            return w6Var22;
                        }
                        autoCloseableN = ((kuA.CN3) aCVar).n();
                        try {
                            V8Runtime v8RuntimeXQ5 = ml.XQ();
                            Intrinsics.checkNotNullExpressionValue(v8RuntimeXQ5, "access$getRuntime(...)");
                            this.f70328n = cn3;
                            this.f70331t = jSONObject3;
                            this.f70324O = jVar;
                            this.J2 = autoCloseableN;
                            this.f70330r = null;
                            this.f70326Z = 3;
                            objWPU2 = ml.WPU(v8RuntimeXQ5, aCVar, null, cn32, this);
                            if (objWPU2 != coroutine_suspended) {
                                jVar3 = jVar;
                                jSONObject5 = jSONObject3;
                                autoCloseable = autoCloseableN;
                                dsr = (sqD.Dsr) objWPU2;
                                AutoCloseableKt.closeFinally(autoCloseable, null);
                                r12 = jVar3;
                                r2 = jSONObject5;
                                r3 = cn3;
                                n.w6 w6Var222 = new n.w6(dsr);
                                if (r12 != 0) {
                                }
                                return w6Var222;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            r2 = jSONObject3;
                            r3 = cn3;
                            throw th;
                        }
                        return coroutine_suspended;
                    } catch (AsyncComputationException e14) {
                        e = e14;
                        r12 = jVar;
                        r2 = jSONObject3;
                        r3 = cn3;
                        if (r12 != 0) {
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    } catch (InvalidMainFunctionResultException e15) {
                        e = e15;
                        r12 = jVar;
                        r2 = jSONObject3;
                        r3 = cn3;
                        if (r12 != 0) {
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    } catch (JavetException e16) {
                        e = e16;
                        r12 = jVar;
                        r2 = jSONObject3;
                        r3 = cn3;
                        if (r12 != 0) {
                        }
                        return new n.C1266n(new sqD.Ml(e, r3, r2));
                    }
                } catch (AsyncComputationException e17) {
                    e = e17;
                    r12 = jVar6;
                    r2 = jSONObject3;
                    r3 = cn310;
                    if (r12 != 0) {
                    }
                    return new n.C1266n(new sqD.Ml(e, r3, r2));
                } catch (InvalidMainFunctionResultException e18) {
                    e = e18;
                    r12 = jVar6;
                    r2 = jSONObject3;
                    r3 = cn310;
                    if (r12 != 0) {
                    }
                    return new n.C1266n(new sqD.Ml(e, r3, r2));
                } catch (JavetException e19) {
                    e = e19;
                    r12 = jVar6;
                    r2 = jSONObject3;
                    r3 = cn310;
                    if (r12 != 0) {
                    }
                    return new n.C1266n(new sqD.Ml(e, r3, r2));
                }
            } catch (AsyncComputationException e20) {
                e = e20;
            } catch (InvalidMainFunctionResultException e21) {
                e = e21;
            } catch (JavetException e22) {
                e = e22;
            }
        }
    }

    public Ml(Context context, sqD.Wre experienceFactory, CZF.I28 i28, rB.Ml ml, CrisperConsole console, CrisperStorage storage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experienceFactory, "experienceFactory");
        Intrinsics.checkNotNullParameter(console, "console");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.rl = experienceFactory;
        this.f70299t = i28;
        this.nr = console;
        this.f70298O = storage;
        this.J2 = ml != null ? d3.j.nr(ml, "crisper") : null;
        this.Uo = new JSONObject();
        this.KN = new ArrayList();
        r rVarRl = nKK.rl(0, 100, null, 5, null);
        this.xMQ = rVarRl;
        this.mUb = rVarRl;
        FKk fKkRl = nSC.rl("Crisper");
        this.gh = fKkRl;
        this.qie = Lu.n(fKkRl);
        this.az = LazyKt.lazy(new Function0() { // from class: kuA.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.g();
            }
        });
        this.ty = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void te(JavetPromiseRejectEvent javetPromiseRejectEvent, V8ValuePromise v8ValuePromise, V8Value v8Value) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015e, code lost:
    
        if (r15 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017e, code lost:
    
        if (r15 == r0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(V8Runtime v8Runtime, V8ValueObject v8ValueObject, sqD.Dsr dsr, sqD.CN3 cn3, Continuation continuation) throws InvalidMainFunctionResultException, JavetException {
        I28 i28;
        JSONObject jSONObjectXMQ;
        sqD.I28 i28N;
        Ml ml;
        aC fux;
        Throwable th;
        AutoCloseable autoCloseable;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f70306g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f70306g = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        I28 i282 = i28;
        Object orThrow = i282.f70305Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i282.f70306g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(orThrow);
            if (v8ValueObject == null || (jSONObjectXMQ = bIo.I28.xMQ(v8ValueObject)) == null || (i28N = this.rl.n(jSONObjectXMQ)) == null) {
                return dsr;
            }
            i282.f70307n = this;
            i282.f70310t = v8Runtime;
            i282.f70303O = v8ValueObject;
            i282.J2 = dsr;
            i282.f70309r = cn3;
            i282.f70308o = i28N;
            i282.f70306g = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(i282));
            if (!this.xMQ.t(new sqD.w6(cn3, i28N, safeContinuation, this.J2))) {
                safeContinuation.resumeWith(Result.m313constructorimpl(dsr));
            }
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(i282);
            }
            if (orThrow != coroutine_suspended) {
                ml = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    ResultKt.throwOnFailure(orThrow);
                    return (sqD.Dsr) orThrow;
                }
                if (i3 != 4) {
                    throw new IllegalStateException(KfLR.qYAeXyahJjjYL);
                }
                ResultKt.throwOnFailure(orThrow);
                return (sqD.Dsr) orThrow;
            }
            autoCloseable = (AutoCloseable) i282.f70307n;
            try {
                ResultKt.throwOnFailure(orThrow);
                sqD.Dsr dsr2 = (sqD.Dsr) orThrow;
                AutoCloseableKt.closeFinally(autoCloseable, null);
                return dsr2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AutoCloseableKt.closeFinally(autoCloseable, th);
                    throw th3;
                }
            }
        }
        cn3 = (sqD.CN3) i282.f70309r;
        dsr = (sqD.Dsr) i282.J2;
        v8ValueObject = (V8ValueObject) i282.f70303O;
        v8Runtime = (V8Runtime) i282.f70310t;
        ml = (Ml) i282.f70307n;
        ResultKt.throwOnFailure(orThrow);
        sqD.CN3 cn32 = cn3;
        sqD.Dsr dsr3 = (sqD.Dsr) orThrow;
        if (dsr3 == null) {
            return dsr;
        }
        if (!v8ValueObject.has("onFinish")) {
            return dsr3;
        }
        V8Value v8ValueInvoke = v8ValueObject.invoke("onFinish", dsr3.getValue());
        if (v8ValueInvoke instanceof V8ValueObject) {
            fux = new kuA.CN3((V8ValueObject) v8ValueInvoke);
        } else if (v8ValueInvoke instanceof V8ValueString) {
            String value = ((V8ValueString) v8ValueInvoke).getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            fux = new fuX(value);
        } else {
            if (!(v8ValueInvoke instanceof V8ValueUndefined)) {
                Intrinsics.checkNotNull(v8ValueInvoke);
                throw new InvalidMainFunctionResultException(v8ValueInvoke);
            }
            fux = Dsr.f70297n;
        }
        if (fux instanceof kuA.CN3) {
            V8ValueObject v8ValueObjectN = ((kuA.CN3) fux).n();
            try {
                i282.f70307n = v8ValueObjectN;
                i282.f70310t = null;
                i282.f70303O = null;
                i282.J2 = null;
                i282.f70309r = null;
                i282.f70308o = null;
                i282.f70306g = 2;
                orThrow = ml.WPU(v8Runtime, fux, dsr3, cn32, i282);
                if (orThrow != coroutine_suspended) {
                    autoCloseable = v8ValueObjectN;
                    sqD.Dsr dsr22 = (sqD.Dsr) orThrow;
                    AutoCloseableKt.closeFinally(autoCloseable, null);
                    return dsr22;
                }
            } catch (Throwable th4) {
                th = th4;
                autoCloseable = v8ValueObjectN;
                throw th;
            }
        } else {
            V8Runtime v8Runtime2 = v8Runtime;
            aC aCVar = fux;
            if (aCVar instanceof fuX) {
                i282.f70307n = null;
                i282.f70310t = null;
                i282.f70303O = null;
                i282.J2 = null;
                i282.f70309r = null;
                i282.f70308o = null;
                i282.f70306g = 3;
                orThrow = ml.WPU(v8Runtime2, aCVar, dsr3, cn32, i282);
            } else {
                if (!Intrinsics.areEqual(aCVar, Dsr.f70297n)) {
                    throw new NoWhenBranchMatchedException();
                }
                i282.f70307n = null;
                i282.f70310t = null;
                i282.f70303O = null;
                i282.J2 = null;
                i282.f70309r = null;
                i282.f70308o = null;
                i282.f70306g = 4;
                orThrow = ml.WPU(v8Runtime2, aCVar, dsr3, cn32, i282);
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pl ViF(Function1 function1, Pl[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Pl pl = it[0];
        Intrinsics.checkNotNull(pl, "null cannot be cast to non-null type T of com.bendingspoons.crisper.internal.CrisperImpl.registerMethod");
        return (Pl) function1.invoke(pl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object WPU(V8Runtime v8Runtime, aC aCVar, sqD.Dsr dsr, sqD.CN3 cn3, Continuation continuation) {
        if (aCVar instanceof kuA.CN3) {
            return S(v8Runtime, ((kuA.CN3) aCVar).n(), dsr, cn3, continuation);
        }
        if (aCVar instanceof fuX) {
            return new Wre(aCVar);
        }
        if (Intrinsics.areEqual(aCVar, Dsr.f70297n)) {
            return dsr;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V8Runtime XQ() {
        return (V8Runtime) this.az.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.caoccao.javet.values.V8Value, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(V8Value v8Value, Continuation continuation) throws InvalidMainFunctionResultException {
        C1042Ml c1042Ml;
        ?? r2;
        Ml ml;
        if (continuation instanceof C1042Ml) {
            c1042Ml = (C1042Ml) continuation;
            int i2 = c1042Ml.f70313r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1042Ml.f70313r = i2 - Integer.MIN_VALUE;
            } else {
                c1042Ml = new C1042Ml(continuation);
            }
        }
        Object objO = c1042Ml.f70311O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1042Ml.f70313r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objO);
                if (v8Value instanceof V8ValuePromise) {
                    c1042Ml.f70312n = v8Value;
                    c1042Ml.f70314t = this;
                    c1042Ml.f70313r = 1;
                    objO = bIo.I28.O((V8ValuePromise) v8Value, c1042Ml);
                    if (objO != coroutine_suspended) {
                        r2 = v8Value;
                        ml = this;
                    }
                    return coroutine_suspended;
                }
                if (v8Value instanceof V8ValueObject) {
                    return new kuA.CN3((V8ValueObject) v8Value);
                }
                if (v8Value instanceof V8ValueString) {
                    String value = ((V8ValueString) v8Value).getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    return new fuX(value);
                }
                if ((v8Value instanceof V8ValueUndefined) || v8Value == 0) {
                    return Dsr.f70297n;
                }
                throw new InvalidMainFunctionResultException(v8Value);
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AutoCloseable autoCloseable = (AutoCloseable) c1042Ml.f70312n;
                ResultKt.throwOnFailure(objO);
                v8Value = autoCloseable;
                aC aCVar = (aC) objO;
                AutoCloseableKt.closeFinally(v8Value, null);
                return aCVar;
            }
            ml = (Ml) c1042Ml.f70314t;
            r2 = (AutoCloseable) c1042Ml.f70312n;
            try {
                ResultKt.throwOnFailure(objO);
                r2 = r2;
            } catch (Throwable th) {
                th = th;
                v8Value = r2;
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(v8Value, th);
                    throw th2;
                }
            }
            c1042Ml.f70312n = r2;
            c1042Ml.f70314t = null;
            c1042Ml.f70313r = 2;
            objO = ml.Z((V8Value) objO, c1042Ml);
            if (objO != coroutine_suspended) {
                v8Value = r2;
                aC aCVar2 = (aC) objO;
                AutoCloseableKt.closeFinally(v8Value, null);
                return aCVar2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void aYN(String str, String str2, int i2, Function1 function1) throws JavetException {
        V8Runtime v8RuntimeXQ = XQ();
        Intrinsics.checkNotNullExpressionValue(v8RuntimeXQ, "<get-runtime>(...)");
        MethodWrapper methodWrapper = new MethodWrapper(v8RuntimeXQ, i2, function1);
        JavetCallbackContext javetCallbackContext = new JavetCallbackContext(str2, methodWrapper, methodWrapper.getInvokeMethod());
        Map map = this.ty;
        Object objCreateV8ValueObject = map.get(str);
        if (objCreateV8ValueObject == null) {
            objCreateV8ValueObject = XQ().createV8ValueObject();
            Intrinsics.checkNotNullExpressionValue(objCreateV8ValueObject, "createV8ValueObject(...)");
            map.put(str, objCreateV8ValueObject);
        }
        V8ValueObject v8ValueObject = (V8ValueObject) objCreateV8ValueObject;
        if (!v8ValueObject.has(str2)) {
            v8ValueObject.bindFunction(javetCallbackContext);
            return;
        }
        throw new IllegalArgumentException(("Redefinition of methods is illegal! Method " + str + "." + str2 + " already declared.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #2 {all -> 0x00c1, blocks: (B:31:0x00b8, B:44:0x00d1, B:46:0x00d5, B:48:0x00ea, B:53:0x00f4, B:54:0x00f7, B:55:0x00f8, B:39:0x00c9, B:40:0x00cc, B:47:0x00d9, B:51:0x00f2, B:37:0x00c7), top: B:76:0x0022, inners: #1, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(V8Runtime v8Runtime, Continuation continuation) throws JavetException {
        n nVar;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        Ml ml;
        AutoCloseable autoCloseable3;
        V8Runtime v8Runtime2;
        CrisperPico crisperPico;
        V8ValueObject v8ValueObject;
        V8ValueObject v8ValueObject2;
        rB.Ml ml2;
        V8ValueObject v8ValueObject3;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.E2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f70317S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.E2;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                V8ValueObject v8ValueObjectCreateV8ValueObject = v8Runtime.createV8ValueObject();
                try {
                    V8ValueObject v8ValueObjectCreateV8ValueObject2 = v8Runtime.createV8ValueObject();
                    try {
                        Intrinsics.checkNotNull(v8ValueObjectCreateV8ValueObject2);
                        nY(v8ValueObjectCreateV8ValueObject2, this.nr);
                        v8ValueObjectCreateV8ValueObject.set("console", v8ValueObjectCreateV8ValueObject2);
                        AutoCloseableKt.closeFinally(v8ValueObjectCreateV8ValueObject2, null);
                        V8ValueObject v8ValueObjectCreateV8ValueObject3 = v8Runtime.createV8ValueObject();
                        try {
                            Intrinsics.checkNotNull(v8ValueObjectCreateV8ValueObject3);
                            nY(v8ValueObjectCreateV8ValueObject3, this.f70298O);
                            v8ValueObjectCreateV8ValueObject.set("storage", v8ValueObjectCreateV8ValueObject3);
                            AutoCloseableKt.closeFinally(v8ValueObjectCreateV8ValueObject3, null);
                            CZF.I28 i28 = this.f70299t;
                            if (i28 == null) {
                                ml = this;
                                autoCloseable = v8ValueObjectCreateV8ValueObject;
                                v8ValueObject2 = v8ValueObjectCreateV8ValueObject;
                                ml2 = ml.J2;
                                if (ml2 != null) {
                                    V8ValueObject v8ValueObjectCreateV8ValueObject4 = v8Runtime.createV8ValueObject();
                                    try {
                                        Intrinsics.checkNotNull(v8ValueObjectCreateV8ValueObject4);
                                        ml.nY(v8ValueObjectCreateV8ValueObject4, new CrisperSpiderSense(ml2, v8Runtime));
                                        boolean z2 = v8ValueObject2.set("spiderSense", v8ValueObjectCreateV8ValueObject4);
                                        AutoCloseableKt.closeFinally(v8ValueObjectCreateV8ValueObject4, null);
                                        Boxing.boxBoolean(z2);
                                    } finally {
                                    }
                                }
                                v8Runtime.getGlobalObject().set("Crisper", v8ValueObject2);
                                Unit unit = Unit.INSTANCE;
                                AutoCloseableKt.closeFinally(autoCloseable, null);
                                return Unit.INSTANCE;
                            }
                            V8ValueObject v8ValueObjectCreateV8ValueObject5 = v8Runtime.createV8ValueObject();
                            try {
                                CrisperPico crisperPico2 = new CrisperPico(i28, v8Runtime);
                                nVar.f70320n = this;
                                nVar.f70323t = v8Runtime;
                                nVar.f70316O = v8ValueObjectCreateV8ValueObject;
                                nVar.J2 = v8ValueObjectCreateV8ValueObject;
                                nVar.f70322r = v8ValueObjectCreateV8ValueObject5;
                                nVar.f70321o = v8ValueObjectCreateV8ValueObject5;
                                nVar.f70318Z = crisperPico2;
                                nVar.E2 = 1;
                                if (crisperPico2.n(nVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                v8Runtime2 = v8Runtime;
                                crisperPico = crisperPico2;
                                ml = this;
                                V8ValueObject v8ValueObject4 = v8ValueObjectCreateV8ValueObject;
                                v8ValueObject = v8ValueObjectCreateV8ValueObject5;
                                autoCloseable3 = v8ValueObject;
                                autoCloseable = v8ValueObject4;
                                v8ValueObject3 = v8ValueObject4;
                            } catch (Throwable th) {
                                th = th;
                                autoCloseable3 = v8ValueObjectCreateV8ValueObject5;
                                autoCloseable = v8ValueObjectCreateV8ValueObject;
                                throw th;
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    autoCloseable2 = v8ValueObjectCreateV8ValueObject;
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                crisperPico = (CrisperPico) nVar.f70318Z;
                v8ValueObject = (V8ValueObject) nVar.f70321o;
                autoCloseable3 = (AutoCloseable) nVar.f70322r;
                V8ValueObject v8ValueObject5 = (V8ValueObject) nVar.J2;
                autoCloseable = (AutoCloseable) nVar.f70316O;
                v8Runtime2 = (V8Runtime) nVar.f70323t;
                ml = (Ml) nVar.f70320n;
                try {
                    ResultKt.throwOnFailure(obj);
                    v8ValueObject3 = v8ValueObject5;
                    autoCloseable = autoCloseable;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            Intrinsics.checkNotNull(v8ValueObject);
            ml.nY(v8ValueObject, crisperPico);
            boolean z3 = v8ValueObject3.set("pico", v8ValueObject);
            AutoCloseableKt.closeFinally(autoCloseable3, null);
            Boxing.boxBoolean(z3);
            v8ValueObject2 = v8ValueObject3;
            v8Runtime = v8Runtime2;
            autoCloseable = autoCloseable;
            ml2 = ml.J2;
            if (ml2 != null) {
            }
            v8Runtime.getGlobalObject().set("Crisper", v8ValueObject2);
            Unit unit2 = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(autoCloseable, null);
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
            autoCloseable2 = autoCloseable;
            throw th;
        }
    }

    @Override // sqD.n
    public void J2(Function0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.KN.add(provider);
    }

    @Override // sqD.n
    public void O(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        C.nr(this.qie, null, null, new CN3(json, this, null), 3, null);
    }

    @Override // sqD.n
    public TFv.Wre n() {
        return this.mUb;
    }

    @Override // sqD.n
    public Object nr(sqD.CN3 cn3, JSONObject jSONObject, Continuation continuation) {
        return GJW.Dsr.Uo(this.gh, new w6(cn3, jSONObject, null), continuation);
    }

    @Override // sqD.fuX
    public void rl(String moduleName, String methodName, final Function1 block) throws JavetException {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(block, "block");
        aYN(moduleName, methodName, 1, new Function1() { // from class: kuA.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.ViF(block, (Pl[]) obj);
            }
        });
    }

    @Override // sqD.n
    public x0X.n t(String script) throws JavetException {
        Intrinsics.checkNotNullParameter(script, "script");
        try {
            XQ().getExecutor(script).executeVoid();
            ((V8ValueFunction) XQ().getGlobalObject().get("main")).close();
            return new n.w6(Unit.INSTANCE);
        } catch (JavetCompilationException e2) {
            rB.Ml ml = this.J2;
            if (ml != null) {
                ml.t(kuA.I28.rl("Compilation failed due to " + e2.getMessage(), null, 2, null));
            }
            return new n.C1266n(e2);
        } catch (ClassCastException e3) {
            rB.Ml ml2 = this.J2;
            if (ml2 != null) {
                ml2.t(kuA.I28.rl("Compilation failure due to main function type mismatch: " + e3.getMessage(), null, 2, null));
            }
            return new n.C1266n(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V8Runtime g() throws JavetException {
        V8Runtime v8RuntimeCreateV8Runtime = V8Host.getV8Instance().createV8Runtime();
        v8RuntimeCreateV8Runtime.setPromiseRejectCallback(new IJavetPromiseRejectCallback() { // from class: kuA.w6
            @Override // com.caoccao.javet.interop.callback.IJavetPromiseRejectCallback
            public final void callback(JavetPromiseRejectEvent javetPromiseRejectEvent, V8ValuePromise v8ValuePromise, V8Value v8Value) {
                Ml.te(javetPromiseRejectEvent, v8ValuePromise, v8Value);
            }
        });
        return v8RuntimeCreateV8Runtime;
    }

    private final V8ValueObject nY(V8ValueObject v8ValueObject, Object obj) throws JavetException {
        Object obj2;
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
                v8ValueObject.bindFunction(new JavetCallbackContext(method.getName(), obj2, method));
            }
        }
        return v8ValueObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(V8Runtime v8Runtime, sqD.CN3 cn3, JSONObject jSONObject, Continuation continuation) throws InvalidMainFunctionResultException, JavetException {
        V8ValueObject v8ValueObjectCreateV8ValueObject = v8Runtime.createV8ValueObject();
        try {
            List list = this.KN;
            JSONObject jSONObjectJ2 = this.Uo;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONObjectJ2 = bIo.Wre.J2(jSONObjectJ2, (JSONObject) ((Function0) it.next()).invoke());
            }
            Intrinsics.checkNotNull(v8ValueObjectCreateV8ValueObject);
            nY(v8ValueObjectCreateV8ValueObject, new CrisperContext(v8Runtime, jSONObjectJ2));
            v8ValueObjectCreateV8ValueObject.set("hook", cn3.getValue());
            V8ValueObject v8ValueObjectXMQ = bIo.Wre.xMQ(jSONObject, v8Runtime);
            try {
                v8ValueObjectCreateV8ValueObject.set("params", v8ValueObjectXMQ);
                AutoCloseableKt.closeFinally(v8ValueObjectXMQ, null);
                V8ValueObject v8ValueObjectCreateV8ValueObject2 = v8Runtime.createV8ValueObject();
                for (Map.Entry entry : this.ty.entrySet()) {
                    Object obj = (String) entry.getKey();
                    Object obj2 = (V8ValueObject) entry.getValue();
                    v8ValueObjectCreateV8ValueObject2.set(obj, obj2);
                    v8ValueObjectCreateV8ValueObject.set(obj, obj2);
                }
                v8ValueObjectCreateV8ValueObject.set("modules", v8ValueObjectCreateV8ValueObject2);
                V8Value v8ValueInvoke = v8Runtime.getGlobalObject().invoke("main", v8ValueObjectCreateV8ValueObject);
                AutoCloseableKt.closeFinally(v8ValueObjectCreateV8ValueObject, null);
                Object objZ = Z(v8ValueInvoke, continuation);
                if (objZ == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objZ;
                }
                return (aC) objZ;
            } finally {
            }
        } finally {
        }
    }

    public /* synthetic */ Ml(Context context, sqD.Wre wre, CZF.I28 i28, rB.Ml ml, CrisperConsole crisperConsole, CrisperStorage crisperStorage, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        CrisperConsole crisperConsole2 = (i2 & 16) != 0 ? new CrisperConsole() : crisperConsole;
        if ((i2 & 32) != 0) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("crisper_storage", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            crisperStorage = new CrisperStorage(sharedPreferences);
        }
        this(context, wre, i28, ml, crisperConsole2, crisperStorage);
    }
}
