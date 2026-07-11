package com.bendingspoons.injet.module;

import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class NativeStorageModule implements j8.j {

    public static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51348O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51349n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51350t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51348O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            I28 i28 = new I28(this.f51348O, continuation);
            i28.f51350t = obj;
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
            int i2 = this.f51349n;
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
                String str = (String) this.f51350t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(SetValueInput.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51348O;
                this.f51349n = 2;
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
        final /* synthetic */ Function2 f51351O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51352n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51353t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51351O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(this.f51351O, continuation);
            ml.f51353t = obj;
            return ml;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Ml) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objFromJson;
            x0X.n nVar;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51352n;
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
                            json = et.w6.rl().adapter(Object.class).toJson(objNr);
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
                String str = (String) this.f51353t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51351O;
                this.f51352n = 2;
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

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bendingspoons/injet/module/NativeStorageModule$SetValueInput;", "", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetValueInput {
        public static final int $stable = 8;
        private final String key;
        private final Object value;

        public static /* synthetic */ SetValueInput copy$default(SetValueInput setValueInput, String str, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                str = setValueInput.key;
            }
            if ((i2 & 2) != 0) {
                obj = setValueInput.value;
            }
            return setValueInput.copy(str, obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final SetValueInput copy(@Json(name = "key") String key, @Json(name = "value") Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return new SetValueInput(key, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetValueInput)) {
                return false;
            }
            SetValueInput setValueInput = (SetValueInput) other;
            return Intrinsics.areEqual(this.key, setValueInput.key) && Intrinsics.areEqual(this.value, setValueInput.value);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "SetValueInput(key=" + this.key + ", value=" + this.value + ")";
        }

        public SetValueInput(@Json(name = "key") String key, @Json(name = "value") Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
        }

        public final String getKey() {
            return this.key;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    public static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51354O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51355n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51356t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51354O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f51354O, continuation);
            wre.f51356t = obj;
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
            int i2 = this.f51355n;
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
                String str = (String) this.f51356t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(String.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51354O;
                this.f51355n = 2;
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

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2, SuspendFunction {
        j(Object obj) {
            super(2, obj, NativeStorageModule.class, "get", "get(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation continuation) {
            return ((NativeStorageModule) this.receiver).t(str, continuation);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2, SuspendFunction {
        n(Object obj) {
            super(2, obj, NativeStorageModule.class, "set", "set(Lcom/bendingspoons/injet/module/NativeStorageModule$SetValueInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SetValueInput setValueInput, Continuation continuation) {
            return ((NativeStorageModule) this.receiver).O(setValueInput, continuation);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function2, SuspendFunction {
        w6(Object obj) {
            super(2, obj, NativeStorageModule.class, "remove", "remove(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation continuation) {
            return ((NativeStorageModule) this.receiver).nr(str, continuation);
        }
    }

    public abstract Object O(SetValueInput setValueInput, Continuation continuation);

    public abstract Object nr(String str, Continuation continuation);

    public abstract Object t(String str, Continuation continuation);

    @Override // j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.n("get", new Ml(new j(this), null));
        scope.n("set", new I28(new n(this), null));
        scope.n("remove", new Wre(new w6(this), null));
    }

    @Override // j8.j
    public String rl() {
        return "NativeStorage";
    }
}
