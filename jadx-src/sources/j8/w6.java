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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 implements j8.j {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69319n;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69319n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            w6 w6Var = w6.this;
            this.f69319n = 1;
            Object objT = w6Var.t(this);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objT;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((j) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f69321O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69322n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f69323t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f69321O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f69321O, continuation);
            nVar.f69323t = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((n) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            int i2 = this.f69322n;
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
                Function2 function2 = this.f69321O;
                Unit unit = Unit.INSTANCE;
                this.f69322n = 1;
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

    public abstract Object t(Continuation continuation);

    @Override // j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.n("getLanguage", new n(new j(null), null));
    }

    @Override // j8.j
    public String rl() {
        return "LanguageProvider";
    }
}
