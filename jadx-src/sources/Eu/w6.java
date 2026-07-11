package Eu;

import ScC.n;
import ScC.w6;
import android.app.Activity;
import android.app.Application;
import com.alightcreative.app.motion.AlightMotionApplication;
import dI8.I28;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 implements j8.j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f2410O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Application f2411n;
    private final NuI.w6 nr;
    private final NuI.CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final NuI.I28 f2412t;

    static final class CN3 extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f2413O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2414n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f2415o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2417t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f2415o |= Integer.MIN_VALUE;
            return w6.this.mUb(null, this);
        }
    }

    public static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f2418O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2419n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2420t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f2418O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            I28 i28 = new I28(this.f2418O, continuation);
            i28.f2420t = obj;
            return i28;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((I28) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objFromJson;
            x0X.n nVar;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2419n;
            String json = null;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    nVar = (x0X.n) obj;
                    if (!(nVar instanceof n.w6)) {
                        Object objNr = x0X.w6.nr(nVar);
                        if (objNr != null) {
                            json = et.w6.rl().adapter(String.class).toJson(objNr);
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + json + "\n                }\n            ");
                    }
                    Throwable th = (Throwable) x0X.w6.rl(nVar);
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "Unknown error";
                    }
                    return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f2420t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f2418O;
                this.f2419n = 2;
                obj = function2.invoke(objFromJson, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    public static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f2421O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2422n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2423t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f2421O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(this.f2421O, continuation);
            ml.f2423t = obj;
            return ml;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Ml) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objFromJson;
            x0X.n nVar;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2422n;
            String json = null;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    nVar = (x0X.n) obj;
                    if (!(nVar instanceof n.w6)) {
                        Object objNr = x0X.w6.nr(nVar);
                        if (objNr != null) {
                            json = et.w6.rl().adapter(String.class).toJson(objNr);
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + json + "\n                }\n            ");
                    }
                    Throwable th = (Throwable) x0X.w6.rl(nVar);
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "Unknown error";
                    }
                    return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f2423t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f2421O;
                this.f2422n = 2;
                obj = function2.invoke(objFromJson, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    static final class Wre extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f2424O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2425n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f2426o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2428t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f2426o |= Integer.MIN_VALUE;
            return w6.this.KN(null, this);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f2430o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ j[] f2431r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f2433n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f2432t = new j("COMPLETED", 0, "completed");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f2429O = new j("FAILED", 1, "failed");
        public static final j J2 = new j("CANCELLED", 2, "cancelled");

        static {
            j[] jVarArrN = n();
            f2431r = jVarArrN;
            f2430o = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f2432t, f2429O, J2};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f2431r.clone();
        }

        public final String rl() {
            return this.f2433n;
        }

        private j(String str, int i2, String str2) {
            this.f2433n = str2;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2435n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2436t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = w6.this.new n(continuation);
            nVar.f2436t = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((n) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2435n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f2436t;
                w6 w6Var = w6.this;
                this.f2435n = 1;
                obj = w6Var.KN(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.C1266n) {
                return nVar;
            }
            if (nVar instanceof n.w6) {
                return new n.w6(((j) ((n.w6) nVar).n()).rl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: Eu.w6$w6, reason: collision with other inner class name */
    static final class C0087w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2438n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2439t;

        C0087w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0087w6 c0087w6 = w6.this.new C0087w6(continuation);
            c0087w6.f2439t = obj;
            return c0087w6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((C0087w6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2438n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f2439t;
                w6 w6Var = w6.this;
                this.f2438n = 1;
                obj = w6Var.mUb(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.C1266n) {
                return nVar;
            }
            if (nVar instanceof n.w6) {
                return new n.w6(((j) ((n.w6) nVar).n()).rl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public w6(Application application, NuI.CN3 getRewardedAdLauncherUseCase, NuI.I28 getInterstitialAdLauncherUseCase, NuI.w6 getAdUnitIdUseCase) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(getRewardedAdLauncherUseCase, "getRewardedAdLauncherUseCase");
        Intrinsics.checkNotNullParameter(getInterstitialAdLauncherUseCase, "getInterstitialAdLauncherUseCase");
        Intrinsics.checkNotNullParameter(getAdUnitIdUseCase, "getAdUnitIdUseCase");
        this.f2411n = application;
        this.rl = getRewardedAdLauncherUseCase;
        this.f2412t = getInterstitialAdLauncherUseCase;
        this.nr = getAdUnitIdUseCase;
        this.f2410O = "AlightAds";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r11 != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(String str, Continuation continuation) {
        Wre wre;
        Activity activity;
        w6 w6Var;
        String str2;
        ScC.n nVar;
        j jVar;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f2426o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f2426o = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objN = wre.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f2426o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            x0X.n nVarRl = x0X.n.f75185n.rl(Uo(), new Function0() { // from class: Eu.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.xMQ();
                }
            });
            if (nVarRl instanceof n.C1266n) {
                return nVarRl;
            }
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Activity activity2 = (Activity) ((n.w6) nVarRl).n();
            NuI.I28 i28 = this.f2412t;
            wre.f2425n = this;
            wre.f2428t = str;
            wre.f2424O = activity2;
            wre.f2426o = 1;
            Object objN2 = i28.n(wre);
            if (objN2 != coroutine_suspended) {
                activity = activity2;
                objN = objN2;
                w6Var = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            Activity activity3 = (Activity) wre.f2424O;
            String str3 = (String) wre.f2428t;
            w6Var = (w6) wre.f2425n;
            ResultKt.throwOnFailure(objN);
            activity = activity3;
            str = str3;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objN);
                x0X.n nVar2 = (x0X.n) objN;
                if (nVar2 instanceof n.C1266n) {
                    jVar = j.f2429O;
                } else {
                    if (!(nVar2 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar = j.f2432t;
                }
                return new n.w6(jVar);
            }
            nVar = (ScC.n) wre.f2424O;
            activity = (Activity) wre.f2428t;
            str2 = (String) wre.f2425n;
            ResultKt.throwOnFailure(objN);
            n.C0320n c0320n = new n.C0320n(str2, null, 2, null);
            wre.f2425n = null;
            wre.f2428t = null;
            wre.f2424O = null;
            wre.f2426o = 3;
            objN = nVar.n(activity, (String) objN, c0320n, wre);
        }
        ScC.n nVar3 = (ScC.n) objN;
        NuI.w6 w6Var2 = w6Var.nr;
        k.I28 i282 = k.I28.f69644r;
        wre.f2425n = str;
        wre.f2428t = activity;
        wre.f2424O = nVar3;
        wre.f2426o = 2;
        Object objN3 = w6Var2.n(i282, wre);
        if (objN3 != coroutine_suspended) {
            str2 = str;
            nVar = nVar3;
            objN = objN3;
            n.C0320n c0320n2 = new n.C0320n(str2, null, 2, null);
            wre.f2425n = null;
            wre.f2428t = null;
            wre.f2424O = null;
            wre.f2426o = 3;
            objN = nVar.n(activity, (String) objN, c0320n2, wre);
        }
        return coroutine_suspended;
    }

    private final Activity Uo() {
        Application application = this.f2411n;
        AlightMotionApplication alightMotionApplication = application instanceof AlightMotionApplication ? (AlightMotionApplication) application : null;
        if (alightMotionApplication != null) {
            return alightMotionApplication.getCurrentActivity();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh() {
        return "AdsModule did not have a valid reference to an Activity";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r0 != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mUb(String str, Continuation continuation) {
        CN3 cn3;
        Activity activity;
        String str2;
        w6 w6Var;
        ScC.w6 w6Var2;
        Activity activity2;
        j jVar;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f2415o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f2415o = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        CN3 cn32 = cn3;
        Object objRl = cn32.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn32.f2415o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            x0X.n nVarRl = x0X.n.f75185n.rl(Uo(), new Function0() { // from class: Eu.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.gh();
                }
            });
            if (nVarRl instanceof n.C1266n) {
                return nVarRl;
            }
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Activity activity3 = (Activity) ((n.w6) nVarRl).n();
            NuI.CN3 cn33 = this.rl;
            cn32.f2414n = this;
            cn32.f2417t = str;
            cn32.f2413O = activity3;
            cn32.f2415o = 1;
            Object objN = cn33.n(cn32);
            if (objN != coroutine_suspended) {
                activity = activity3;
                objRl = objN;
                str2 = str;
                w6Var = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            activity = (Activity) cn32.f2413O;
            str2 = (String) cn32.f2417t;
            w6Var = (w6) cn32.f2414n;
            ResultKt.throwOnFailure(objRl);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRl);
                x0X.n nVar = (x0X.n) objRl;
                if (nVar instanceof n.C1266n) {
                    jVar = j.f2429O;
                } else {
                    if (!(nVar instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dI8.I28 i28 = (dI8.I28) ((n.w6) nVar).n();
                    if (Intrinsics.areEqual(i28, I28.j.f63473n)) {
                        jVar = j.J2;
                    } else {
                        if (!Intrinsics.areEqual(i28, I28.n.f63474n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jVar = j.f2432t;
                    }
                }
                return new n.w6(jVar);
            }
            w6Var2 = (ScC.w6) cn32.f2413O;
            activity2 = (Activity) cn32.f2417t;
            str2 = (String) cn32.f2414n;
            ResultKt.throwOnFailure(objRl);
            w6.n nVar2 = new w6.n(str2, null, null, 6, null);
            cn32.f2414n = null;
            cn32.f2417t = null;
            cn32.f2413O = null;
            cn32.f2415o = 3;
            objRl = w6Var2.rl(activity2, (String) objRl, true, nVar2, cn32);
        }
        ScC.w6 w6Var3 = (ScC.w6) objRl;
        NuI.w6 w6Var4 = w6Var.nr;
        k.I28 i282 = k.I28.f69641Z;
        cn32.f2414n = str2;
        cn32.f2417t = activity;
        cn32.f2413O = w6Var3;
        cn32.f2415o = 2;
        Object objN2 = w6Var4.n(i282, cn32);
        if (objN2 != coroutine_suspended) {
            Activity activity4 = activity;
            w6Var2 = w6Var3;
            objRl = objN2;
            activity2 = activity4;
            w6.n nVar22 = new w6.n(str2, null, null, 6, null);
            cn32.f2414n = null;
            cn32.f2417t = null;
            cn32.f2413O = null;
            cn32.f2415o = 3;
            objRl = w6Var2.rl(activity2, (String) objRl, true, nVar22, cn32);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ() {
        return "AdsModule did not have a valid reference to an Activity";
    }

    @Override // j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.n("showInterstitialAd", new Ml(new n(null), null));
        scope.n("showRewardedAd", new I28(new C0087w6(null), null));
    }

    @Override // j8.j
    public String rl() {
        return this.f2410O;
    }
}
