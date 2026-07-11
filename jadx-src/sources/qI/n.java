package qI;

import ajd.j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements j8.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rB.Ml f72425n;

    public static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f72426O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72427n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72428t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f72426O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            I28 i28 = new I28(this.f72426O, continuation);
            i28.f72428t = obj;
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
            int i2 = this.f72427n;
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
                String str = (String) this.f72428t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f72426O;
                this.f72427n = 2;
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
        final /* synthetic */ Function2 f72429O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72430n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72431t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f72429O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(this.f72429O, continuation);
            ml.f72431t = obj;
            return ml;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Ml) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            int i2 = this.f72430n;
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
                String str = (String) this.f72431t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f72429O;
                this.f72430n = 2;
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

    public static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f72432O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72433n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72434t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f72432O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f72432O, continuation);
            wre.f72434t = obj;
            return wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Wre) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            int i2 = this.f72433n;
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
                String str = (String) this.f72434t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f72432O;
                this.f72433n = 2;
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

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72436n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72437t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = n.this.new j(continuation);
            jVar.f72437t = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((j) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72436n == 0) {
                ResultKt.throwOnFailure(obj);
                return n.this.xMQ((String) this.f72437t);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: qI.n$n, reason: collision with other inner class name */
    static final class C1118n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72439n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72440t;

        C1118n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1118n c1118n = n.this.new C1118n(continuation);
            c1118n.f72440t = obj;
            return c1118n;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((C1118n) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72439n == 0) {
                ResultKt.throwOnFailure(obj);
                return n.this.Uo((String) this.f72440t);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72442n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72443t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = n.this.new w6(continuation);
            w6Var.f72443t = obj;
            return w6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((w6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72442n == 0) {
                ResultKt.throwOnFailure(obj);
                return n.this.KN((String) this.f72443t);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n Uo(String str) {
        rB.Ml ml = this.f72425n;
        if (ml != null) {
            rB.I28.n(ml, CollectionsKt.emptyList(), j.EnumC0481j.f13104r, null, null, pq.I28.n(pq.n.O("message", str)));
        }
        return new n.w6(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(String str) {
        return "Injet log: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n xMQ(final String str) {
        KW9.j.f5464n.n("HelperModule", new Function0() { // from class: qI.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.mUb(str);
            }
        });
        return new n.w6(Unit.INSTANCE);
    }

    @Override // j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.n(CreativeInfo.f62442f, new Ml(new j(null), null));
        scope.n("assertionFailure", new I28(new C1118n(null), null));
        scope.n("fatalError", new Wre(new w6(null), null));
    }

    @Override // j8.j
    public String rl() {
        return "Helper";
    }

    public n(rB.Ml ml) {
        this.f72425n = ml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n KN(String str) {
        Uo(str);
        throw new IllegalStateException(str.toString());
    }
}
