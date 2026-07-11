package qE;

import com.bendingspoons.oracle.models.IdentityToken;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.models.User;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okio.Buffer;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class QJ {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final v8.j f72210O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f72211n;
    private final qE.I28 nr;
    private final oh.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eO f72212t;

    static final class CN3 extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72213O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72214n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f72215o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72217t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f72215o |= Integer.MIN_VALUE;
            return QJ.this.KN(null, null, null, false, this);
        }
    }

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72218n;

        I28(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return QJ.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String rawBody;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72218n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre response = QJ.this.f72211n.getResponse();
                this.f72218n = 1;
                obj = TFv.fuX.ViF(response, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            OracleResponse oracleResponse = (OracleResponse) obj;
            if (oracleResponse != null && (rawBody = oracleResponse.getRawBody()) != null) {
                JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(rawBody));
                try {
                    Intrinsics.checkNotNull(jsonReaderOf);
                    xFr.aC.J2(jsonReaderOf, "settings");
                    List listSorted = CollectionsKt.sorted(CollectionsKt.toList(xFr.aC.O(jsonReaderOf)));
                    String strNr = xFr.s4.nr(listSorted, 40, StringsKt.repeat(" ", 36));
                    String str = listSorted.size() + " settings from cached response: \t" + strNr;
                    CloseableKt.closeFinally(jsonReaderOf, null);
                    if (str != null) {
                        return str;
                    }
                    return "No cached response.";
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(jsonReaderOf, th);
                        throw th2;
                    }
                }
            }
            return "No cached response.";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72220n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f72221t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(String str, Continuation continuation) {
            super(1, continuation);
            this.f72221t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Ml(this.f72221t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72220n == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f72221t;
                if (str != null) {
                    JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(str));
                    try {
                        Intrinsics.checkNotNull(jsonReaderOf);
                        xFr.aC.J2(jsonReaderOf, "settings");
                        List listSorted = CollectionsKt.sorted(CollectionsKt.toList(xFr.aC.O(jsonReaderOf)));
                        String strNr = xFr.s4.nr(listSorted, 40, StringsKt.repeat(" ", 36));
                        String str2 = listSorted.size() + " settings from Oracle response: \t" + strNr;
                        CloseableKt.closeFinally(jsonReaderOf, null);
                        if (str2 != null) {
                            return str2;
                        }
                        return "No settings in Oracle response.";
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(jsonReaderOf, th);
                            throw th2;
                        }
                    }
                }
                return "No settings in Oracle response.";
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72222n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ OracleResponse f72223t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(OracleResponse oracleResponse, Continuation continuation) {
            super(1, continuation);
            this.f72223t = oracleResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Wre(this.f72223t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72222n == 0) {
                ResultKt.throwOnFailure(obj);
                String rawBody = this.f72223t.getRawBody();
                if (rawBody != null) {
                    JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(rawBody));
                    try {
                        Intrinsics.checkNotNull(jsonReaderOf);
                        xFr.aC.J2(jsonReaderOf, "settings");
                        String str = "Merged settings:\n" + xFr.fuX.Uo(jsonReaderOf, 2, 0, null, null, false, 30, null);
                        CloseableKt.closeFinally(jsonReaderOf, null);
                        if (str != null) {
                            return str;
                        }
                        return "No settings in merged response.";
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(jsonReaderOf, th);
                            throw th2;
                        }
                    }
                }
                return "No settings in merged response.";
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private static final class j extends Exception {
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f72224O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72225n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f72226r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72227t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72224O = obj;
            this.f72226r |= Integer.MIN_VALUE;
            return QJ.this.O(null, null, null, false, this);
        }
    }

    static final class w6 extends ContinuationImpl {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72228O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f72229S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f72230Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72232n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f72233o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f72234r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72235t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72229S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return QJ.this.Uo(null, null, null, this);
        }
    }

    public QJ(fuX oracleResponseDataStore, oh.I28 oracleAuthenticationDataStore, eO externalSettingsMerger, qE.I28 cacheMerger, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(oracleResponseDataStore, "oracleResponseDataStore");
        Intrinsics.checkNotNullParameter(oracleAuthenticationDataStore, "oracleAuthenticationDataStore");
        Intrinsics.checkNotNullParameter(externalSettingsMerger, "externalSettingsMerger");
        Intrinsics.checkNotNullParameter(cacheMerger, "cacheMerger");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.f72211n = oracleResponseDataStore;
        this.rl = oracleAuthenticationDataStore;
        this.f72212t = externalSettingsMerger;
        this.nr = cacheMerger;
        this.f72210O = localLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2(Throwable th) {
        return "Failed to fetch settings: " + th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(OracleResponse oracleResponse, String str, pq.Ml ml, boolean z2, Continuation continuation) {
        CN3 cn3;
        QJ qj;
        pq.Ml ml2;
        x0X.n nVar;
        String str2;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f72215o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f72215o = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objViF = cn3.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f72215o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (z2 || str == null || !Intrinsics.areEqual(oracleResponse.getSettingsHash(), str)) {
                return new n.w6(oracleResponse);
            }
            TFv.Wre response = this.f72211n.getResponse();
            cn3.f72214n = this;
            cn3.f72217t = oracleResponse;
            cn3.f72213O = ml;
            cn3.f72215o = 1;
            objViF = TFv.fuX.ViF(response, cn3);
            if (objViF != coroutine_suspended) {
                qj = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ml2 = (pq.Ml) cn3.f72214n;
            ResultKt.throwOnFailure(objViF);
            nVar = (x0X.n) objViF;
            if (x0X.w6.J2(nVar)) {
                str2 = "failure: " + ((n.C1266n) nVar).n();
            } else {
                str2 = "success";
            }
            ml2.O("merge_settings_outcome", str2);
            return objViF;
        }
        ml = (pq.Ml) cn3.f72213O;
        oracleResponse = (OracleResponse) cn3.f72217t;
        qj = (QJ) cn3.f72214n;
        ResultKt.throwOnFailure(objViF);
        OracleResponse oracleResponse2 = (OracleResponse) objViF;
        if (oracleResponse2 == null) {
            return new n.C1266n(new IllegalStateException("cached response is null"));
        }
        qE.I28 i28 = qj.nr;
        cn3.f72214n = ml;
        cn3.f72217t = null;
        cn3.f72213O = null;
        cn3.f72215o = 2;
        objViF = i28.nr(oracleResponse, oracleResponse2, cn3);
        if (objViF != coroutine_suspended) {
            ml2 = ml;
            nVar = (x0X.n) objViF;
            if (x0X.w6.J2(nVar)) {
            }
            ml2.O("merge_settings_outcome", str2);
            return objViF;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(OracleResponse oracleResponse, String str, pq.Ml ml, boolean z2, Continuation continuation) {
        n nVar;
        QJ qj;
        String str2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f72226r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f72226r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objT = nVar.f72224O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f72226r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            if (!z2 && str != null && Intrinsics.areEqual(str, oracleResponse.getSettingsHash())) {
                ml.O("settings_extraction_type", "cache");
                return new n.w6(oracleResponse);
            }
            if (oracleResponse.getDefaultSettingsUrl() == null) {
                ml.O("settings_extraction_type", "setup_response_only");
                return new n.w6(oracleResponse);
            }
            ml.O("settings_extraction_type", oracleResponse.getOverridesUrl() == null ? "defaults_url_only" : "defaults_and_overrides_url");
            eO eOVar = this.f72212t;
            nVar.f72225n = this;
            nVar.f72227t = ml;
            nVar.f72226r = 1;
            objT = eOVar.t(oracleResponse, nVar);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            qj = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ml = (pq.Ml) nVar.f72227t;
            qj = (QJ) nVar.f72225n;
            ResultKt.throwOnFailure(objT);
        }
        x0X.n nVar2 = (x0X.n) objT;
        boolean z3 = nVar2 instanceof n.C1266n;
        if (z3) {
            final Throwable th = (Throwable) ((n.C1266n) nVar2).n();
            v8.n.n(qj.f72210O, new Function0() { // from class: qE.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QJ.J2(th);
                }
            });
        } else if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (x0X.w6.J2(nVar2)) {
            str2 = "success";
        } else {
            str2 = "failure: " + ((n.C1266n) nVar2).n();
        }
        ml.O("fetch_settings_outcome", str2);
        if (z3) {
            return new n.C1266n(new j());
        }
        if (nVar2 instanceof n.w6) {
            return nVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f9, code lost:
    
        if (r13.nr(r11, r6) != r0) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166 A[PHI: r1 r11 r12 r14
      0x0166: PHI (r1v9 qE.QJ) = (r1v14 qE.QJ), (r1v10 qE.QJ) binds: [B:41:0x0136, B:53:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r11v18 kotlin.jvm.internal.Ref$BooleanRef) = (r11v13 kotlin.jvm.internal.Ref$BooleanRef), (r11v28 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:41:0x0136, B:53:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r12v13 java.lang.Integer) = (r12v9 java.lang.Integer), (r12v16 java.lang.Integer) binds: [B:41:0x0136, B:53:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r14v15 x0X.n) = (r14v10 x0X.n), (r14v20 x0X.n) binds: [B:41:0x0136, B:53:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Uo(OracleResponse oracleResponse, pq.Ml ml, Integer num, Continuation continuation) {
        w6 w6Var;
        QJ qj;
        OracleResponse oracleResponse2;
        pq.Ml ml2;
        String str;
        Ref.BooleanRef booleanRef;
        Integer num2;
        ?? r52;
        QJ qj2;
        x0X.n w6Var2;
        QJ qj3;
        QJ qj4;
        OracleResponse oracleResponse3;
        x0X.n nVar;
        QJ qj5;
        User.AuthenticationResponse authentication;
        QJ qj6;
        User.AuthenticationResponse authentication2;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.E2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        w6 w6Var3 = w6Var;
        Object objViF = w6Var3.f72229S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (w6Var3.E2) {
            case 0:
                ResultKt.throwOnFailure(objViF);
                TFv.Wre wreN = this.f72211n.n();
                w6Var3.f72232n = this;
                w6Var3.f72235t = oracleResponse;
                w6Var3.f72228O = ml;
                w6Var3.J2 = num;
                w6Var3.E2 = 1;
                objViF = TFv.fuX.ViF(wreN, w6Var3);
                if (objViF != coroutine_suspended) {
                    qj = this;
                    oracleResponse2 = oracleResponse;
                    ml2 = ml;
                    str = (String) objViF;
                    boolean z2 = num == null;
                    ml2.KN("was_settings_cache_valid", str == null ? Intrinsics.areEqual(str, oracleResponse2.getSettingsHash()) : false);
                    v8.n.J2(qj.f72210O, new Ml(oracleResponse2.getRawBody(), null));
                    v8.n.J2(qj.f72210O, qj.new I28(null));
                    booleanRef = new Ref.BooleanRef();
                    w6Var3.f72232n = qj;
                    w6Var3.f72235t = oracleResponse2;
                    w6Var3.f72228O = ml2;
                    w6Var3.J2 = num;
                    w6Var3.f72234r = str;
                    w6Var3.f72233o = booleanRef;
                    w6Var3.f72230Z = z2 ? 1 : 0;
                    w6Var3.E2 = 2;
                    objViF = qj.O(oracleResponse2, str, ml2, z2, w6Var3);
                    if (objViF != coroutine_suspended) {
                        num2 = num;
                        qj2 = qj;
                        r52 = z2;
                        w6Var2 = (x0X.n) objViF;
                        if (!(w6Var2 instanceof n.C1266n)) {
                            booleanRef.element = true;
                            oracleResponse2.setSettingsHash(str);
                            w6Var2 = new n.w6(oracleResponse2);
                        } else if (!(w6Var2 instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qj4 = qj2;
                        if (w6Var2 instanceof n.C1266n) {
                            if (!(w6Var2 instanceof n.C1266n)) {
                            }
                            if (!(w6Var2 instanceof n.C1266n)) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (!(w6Var2 instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        OracleResponse oracleResponse4 = (OracleResponse) ((n.w6) w6Var2).n();
                        boolean z3 = r52 != 0;
                        w6Var3.f72232n = qj2;
                        w6Var3.f72235t = num2;
                        w6Var3.f72228O = booleanRef;
                        w6Var3.J2 = null;
                        w6Var3.f72234r = null;
                        w6Var3.f72233o = null;
                        w6Var3.E2 = 3;
                        objViF = qj2.KN(oracleResponse4, str, ml2, z3, w6Var3);
                        if (objViF != coroutine_suspended) {
                            qj3 = qj2;
                            w6Var2 = (x0X.n) objViF;
                            qj4 = qj3;
                            if (!(w6Var2 instanceof n.C1266n)) {
                                if (!(w6Var2 instanceof n.w6)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                OracleResponse oracleResponse5 = (OracleResponse) ((n.w6) w6Var2).n();
                                if (booleanRef.element) {
                                    oracleResponse5.setSettingsHash(null);
                                }
                                w6Var2 = new n.w6(oracleResponse5);
                            }
                            if (!(w6Var2 instanceof n.C1266n)) {
                                if (!(w6Var2 instanceof n.w6)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oracleResponse3 = (OracleResponse) ((n.w6) w6Var2).n();
                                v8.n.rl(qj4.f72210O, new Wre(oracleResponse3, null));
                                fuX fux = qj4.f72211n;
                                w6Var3.f72232n = qj4;
                                w6Var3.f72235t = w6Var2;
                                w6Var3.f72228O = oracleResponse3;
                                w6Var3.J2 = null;
                                w6Var3.f72234r = null;
                                w6Var3.f72233o = null;
                                w6Var3.E2 = 4;
                                if (fux.t(oracleResponse3, num2, w6Var3) != coroutine_suspended) {
                                    nVar = w6Var2;
                                    qj5 = qj4;
                                    authentication = oracleResponse3.getMe().getAuthentication();
                                    qj6 = qj5;
                                    if (authentication != null) {
                                        IdentityToken identityToken = authentication.getIdentityToken();
                                        qj6 = qj5;
                                        if (identityToken != null) {
                                            oh.I28 i28 = qj5.rl;
                                            w6Var3.f72232n = qj5;
                                            w6Var3.f72235t = nVar;
                                            w6Var3.f72228O = oracleResponse3;
                                            w6Var3.E2 = 5;
                                            qj6 = qj5;
                                            if (i28.rl(identityToken, w6Var3) != coroutine_suspended) {
                                            }
                                        }
                                    }
                                    authentication2 = oracleResponse3.getMe().getAuthentication();
                                    if (authentication2 != null && (r11 = authentication2.getRefreshToken()) != null) {
                                        oh.I28 i282 = qj6.rl;
                                        w6Var3.f72232n = nVar;
                                        w6Var3.f72235t = null;
                                        w6Var3.f72228O = null;
                                        w6Var3.E2 = 6;
                                    }
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                num = (Integer) w6Var3.J2;
                ml = (pq.Ml) w6Var3.f72228O;
                oracleResponse = (OracleResponse) w6Var3.f72235t;
                QJ qj7 = (QJ) w6Var3.f72232n;
                ResultKt.throwOnFailure(objViF);
                qj = qj7;
                oracleResponse2 = oracleResponse;
                ml2 = ml;
                str = (String) objViF;
                if (num == null) {
                }
                ml2.KN("was_settings_cache_valid", str == null ? Intrinsics.areEqual(str, oracleResponse2.getSettingsHash()) : false);
                v8.n.J2(qj.f72210O, new Ml(oracleResponse2.getRawBody(), null));
                v8.n.J2(qj.f72210O, qj.new I28(null));
                booleanRef = new Ref.BooleanRef();
                w6Var3.f72232n = qj;
                w6Var3.f72235t = oracleResponse2;
                w6Var3.f72228O = ml2;
                w6Var3.J2 = num;
                w6Var3.f72234r = str;
                w6Var3.f72233o = booleanRef;
                w6Var3.f72230Z = z2 ? 1 : 0;
                w6Var3.E2 = 2;
                objViF = qj.O(oracleResponse2, str, ml2, z2, w6Var3);
                if (objViF != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                int i3 = w6Var3.f72230Z;
                Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) w6Var3.f72233o;
                String str2 = (String) w6Var3.f72234r;
                Integer num3 = (Integer) w6Var3.J2;
                pq.Ml ml3 = (pq.Ml) w6Var3.f72228O;
                OracleResponse oracleResponse6 = (OracleResponse) w6Var3.f72235t;
                QJ qj8 = (QJ) w6Var3.f72232n;
                ResultKt.throwOnFailure(objViF);
                r52 = i3;
                booleanRef = booleanRef2;
                num2 = num3;
                qj2 = qj8;
                ml2 = ml3;
                oracleResponse2 = oracleResponse6;
                str = str2;
                w6Var2 = (x0X.n) objViF;
                if (!(w6Var2 instanceof n.C1266n)) {
                }
                qj4 = qj2;
                if (w6Var2 instanceof n.C1266n) {
                }
                return coroutine_suspended;
            case 3:
                booleanRef = (Ref.BooleanRef) w6Var3.f72228O;
                num2 = (Integer) w6Var3.f72235t;
                QJ qj9 = (QJ) w6Var3.f72232n;
                ResultKt.throwOnFailure(objViF);
                qj3 = qj9;
                w6Var2 = (x0X.n) objViF;
                qj4 = qj3;
                if (!(w6Var2 instanceof n.C1266n)) {
                }
                if (!(w6Var2 instanceof n.C1266n)) {
                }
                return Unit.INSTANCE;
            case 4:
                oracleResponse3 = (OracleResponse) w6Var3.f72228O;
                nVar = (x0X.n) w6Var3.f72235t;
                QJ qj10 = (QJ) w6Var3.f72232n;
                ResultKt.throwOnFailure(objViF);
                qj5 = qj10;
                authentication = oracleResponse3.getMe().getAuthentication();
                qj6 = qj5;
                if (authentication != null) {
                }
                authentication2 = oracleResponse3.getMe().getAuthentication();
                if (authentication2 != null) {
                    oh.I28 i2822 = qj6.rl;
                    w6Var3.f72232n = nVar;
                    w6Var3.f72235t = null;
                    w6Var3.f72228O = null;
                    w6Var3.E2 = 6;
                    break;
                }
                return Unit.INSTANCE;
            case 5:
                oracleResponse3 = (OracleResponse) w6Var3.f72228O;
                nVar = (x0X.n) w6Var3.f72235t;
                QJ qj11 = (QJ) w6Var3.f72232n;
                ResultKt.throwOnFailure(objViF);
                qj6 = qj11;
                authentication2 = oracleResponse3.getMe().getAuthentication();
                if (authentication2 != null) {
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(objViF);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
