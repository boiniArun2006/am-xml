package j8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre implements j8.j {

    public static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f69309O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69310n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69311t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f69309O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(this.f69309O, continuation);
            ml.f69311t = obj;
            return ml;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Ml) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            int i2 = this.f69310n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(String.class).toJson(objNr);
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
                Function2 function2 = this.f69309O;
                Unit unit = Unit.INSTANCE;
                this.f69310n = 1;
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

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69312n;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wre.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69312n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Wre wre = Wre.this;
            this.f69312n = 1;
            Object objNr = wre.nr(this);
            if (objNr == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objNr;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((j) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69314n;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wre.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69314n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Wre wre = Wre.this;
            this.f69314n = 1;
            Object objT = wre.t(this);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objT;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((n) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f69316O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69317n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69318t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f69316O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(this.f69316O, continuation);
            w6Var.f69318t = obj;
            return w6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((w6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            int i2 = this.f69317n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(String.class).toJson(objNr);
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
                Function2 function2 = this.f69316O;
                Unit unit = Unit.INSTANCE;
                this.f69317n = 1;
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

    public abstract Object nr(Continuation continuation);

    public abstract Object t(Continuation continuation);

    @Override // j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.n("getKind", new w6(new j(null), null));
        scope.n("getColor", new Ml(new n(null), null));
    }

    @Override // j8.j
    public String rl() {
        return "Theme";
    }
}
