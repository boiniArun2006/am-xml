package Eu;

import com.alightcreative.account.LicenseInfo;
import com.alightcreative.account.LicenseType;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bendingspoons.injet.module.MonetizationModule;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kgE.fuX;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml extends MonetizationModule {
    public static final int nr = MonetizationModule.f51306n;
    private final MonetizationModule rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fuX f2392t;

    public static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f2393O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2394n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2395t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f2393O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            I28 i28 = new I28(this.f2393O, continuation);
            i28.f2395t = obj;
            return i28;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((I28) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objFromJson;
            x0X.n nVar;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2394n;
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
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + JsonUtils.EMPTY_JSON + "\n                }\n            ");
                    }
                    Throwable th = (Throwable) x0X.w6.rl(nVar);
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "Unknown error";
                    }
                    return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f2395t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f2393O;
                this.f2394n = 2;
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

    /* JADX INFO: renamed from: Eu.Ml$Ml, reason: collision with other inner class name */
    static final class C0086Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2396n;

        C0086Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new C0086Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2396n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ml ml = Ml.this;
            this.f2396n = 1;
            Object objO = ml.O(this);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objO;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((C0086Ml) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f2398O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2399n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2400t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f2398O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f2398O, continuation);
            wre.f2400t = obj;
            return wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Wre) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            String message;
            String json;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2399n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(Boolean.class).toJson(objNr);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            } else {
                                json = null;
                            }
                            return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + json + "\n                }\n            ");
                        }
                        Throwable th = (Throwable) x0X.w6.rl(nVar);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "Unknown error";
                        }
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f2398O;
                Unit unit = Unit.INSTANCE;
                this.f2399n = 1;
                obj = function2.invoke(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = (x0X.n) obj;
            if (!(nVar instanceof n.w6)) {
            }
        }
    }

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2402n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2403t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2403t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ml.this.O(this);
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2405n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2406t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2406t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ml.this.xMQ(null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2408n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2409t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = Ml.this.new w6(continuation);
            w6Var.f2409t = obj;
            return w6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((w6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2408n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f2409t;
            Ml ml = Ml.this;
            this.f2408n = 1;
            Object objXMQ = ml.xMQ(str, this);
            if (objXMQ == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objXMQ;
        }
    }

    public Ml(MonetizationModule monopolyMonetizationModule, fuX iapManager) {
        Intrinsics.checkNotNullParameter(monopolyMonetizationModule, "monopolyMonetizationModule");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.rl = monopolyMonetizationModule;
        this.f2392t = iapManager;
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule
    public Object J2(Continuation continuation) {
        return this.rl.J2(continuation);
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule
    public Object KN(Continuation continuation) {
        return this.rl.KN(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(Continuation continuation) {
        j jVar;
        Ml ml;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objO = jVar.f2403t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        boolean z2 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            MonetizationModule monetizationModule = this.rl;
            jVar.f2402n = this;
            jVar.J2 = 1;
            objO = monetizationModule.O(jVar);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            ml = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ml = (Ml) jVar.f2402n;
            ResultKt.throwOnFailure(objO);
        }
        x0X.n nVar = (x0X.n) objO;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!((Boolean) ((n.w6) nVar).n()).booleanValue()) {
            List listIk = ml.f2392t.Ik();
            if (listIk == null || !listIk.isEmpty()) {
                Iterator it = listIk.iterator();
                while (it.hasNext()) {
                    if (((LicenseInfo) it.next()).getType() == LicenseType.Subscription) {
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
        }
        return new n.w6(Boxing.boxBoolean(z2));
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule
    public Object Uo(Continuation continuation) {
        return this.rl.Uo(continuation);
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule
    public Object mUb(Continuation continuation) {
        return this.rl.mUb(continuation);
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule, j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.rl.n(scope);
        scope.n("purchase", new I28(new w6(null), null));
        scope.n("getIsUserPro", new Wre(new C0086Ml(null), null));
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule
    public Object nr(Continuation continuation) {
        return this.rl.nr(continuation);
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule
    public Object t(Continuation continuation) {
        return this.rl.t(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object xMQ(String str, Continuation continuation) {
        n nVar;
        Ml ml;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objXMQ = nVar.f2406t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objXMQ);
            this.f2392t.t();
            MonetizationModule monetizationModule = this.rl;
            nVar.f2405n = this;
            nVar.J2 = 1;
            objXMQ = monetizationModule.xMQ(str, nVar);
            if (objXMQ == coroutine_suspended) {
                return coroutine_suspended;
            }
            ml = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ml = (Ml) nVar.f2405n;
            ResultKt.throwOnFailure(objXMQ);
        }
        x0X.n nVar2 = (x0X.n) objXMQ;
        if (nVar2 instanceof n.C1266n) {
            return nVar2;
        }
        if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        ml.f2392t.ty();
        return nVar2;
    }
}
