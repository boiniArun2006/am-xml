package com.bendingspoons.injet.module;

import Hr.CQ.USEaHtCMH;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.bendingspoons.injet.webbridge.I28;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class WolfModule implements j8.j {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51357O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51358n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51359t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51357O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(this.f51357O, continuation);
            ml.f51359t = obj;
            return ml;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((Ml) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objFromJson;
            x0X.n nVar;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51358n;
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
                        return StringsKt.trimIndent("\n                {\n                    \"type\": \"success\",\n                    \"data\": " + USEaHtCMH.xHHJfEYWWEYaj + "\n                }\n            ");
                    }
                    Throwable th = (Throwable) x0X.w6.rl(nVar);
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "Unknown error";
                    }
                    return StringsKt.trimIndent("\n                {\n                    \"type\": \"error\",\n                    \"data\": \"" + message + "\"\n                }\n            ");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f51359t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(Object.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51357O;
                this.f51358n = 2;
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

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @StabilityInferred
    @Keep
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/bendingspoons/injet/module/WolfModule$WolfPredictionInfo;", "", "prediction", "", "isExperienceModifiedByPrediction", "", "predictionModel", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPrediction", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPredictionModel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/bendingspoons/injet/module/WolfModule$WolfPredictionInfo;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WolfPredictionInfo {
        public static final int $stable = 0;
        private final Boolean isExperienceModifiedByPrediction;
        private final Double prediction;
        private final String predictionModel;

        public WolfPredictionInfo() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ WolfPredictionInfo copy$default(WolfPredictionInfo wolfPredictionInfo, Double d2, Boolean bool, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d2 = wolfPredictionInfo.prediction;
            }
            if ((i2 & 2) != 0) {
                bool = wolfPredictionInfo.isExperienceModifiedByPrediction;
            }
            if ((i2 & 4) != 0) {
                str = wolfPredictionInfo.predictionModel;
            }
            return wolfPredictionInfo.copy(d2, bool, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Double getPrediction() {
            return this.prediction;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsExperienceModifiedByPrediction() {
            return this.isExperienceModifiedByPrediction;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPredictionModel() {
            return this.predictionModel;
        }

        public final WolfPredictionInfo copy(@Json(name = "prediction") Double prediction, @Json(name = "isExperienceModifiedByPrediction") Boolean isExperienceModifiedByPrediction, @Json(name = "predictionModel") String predictionModel) {
            return new WolfPredictionInfo(prediction, isExperienceModifiedByPrediction, predictionModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WolfPredictionInfo)) {
                return false;
            }
            WolfPredictionInfo wolfPredictionInfo = (WolfPredictionInfo) other;
            return Intrinsics.areEqual((Object) this.prediction, (Object) wolfPredictionInfo.prediction) && Intrinsics.areEqual(this.isExperienceModifiedByPrediction, wolfPredictionInfo.isExperienceModifiedByPrediction) && Intrinsics.areEqual(this.predictionModel, wolfPredictionInfo.predictionModel);
        }

        public int hashCode() {
            Double d2 = this.prediction;
            int iHashCode = (d2 == null ? 0 : d2.hashCode()) * 31;
            Boolean bool = this.isExperienceModifiedByPrediction;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.predictionModel;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "WolfPredictionInfo(prediction=" + this.prediction + ", isExperienceModifiedByPrediction=" + this.isExperienceModifiedByPrediction + ", predictionModel=" + this.predictionModel + ")";
        }

        public WolfPredictionInfo(@Json(name = "prediction") Double d2, @Json(name = "isExperienceModifiedByPrediction") Boolean bool, @Json(name = "predictionModel") String str) {
            this.prediction = d2;
            this.isExperienceModifiedByPrediction = bool;
            this.predictionModel = str;
        }

        public final Double getPrediction() {
            return this.prediction;
        }

        public final String getPredictionModel() {
            return this.predictionModel;
        }

        public final Boolean isExperienceModifiedByPrediction() {
            return this.isExperienceModifiedByPrediction;
        }

        public /* synthetic */ WolfPredictionInfo(Double d2, Boolean bool, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : d2, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : str);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    /* synthetic */ class n extends AdaptedFunctionReference implements Function2, SuspendFunction {
        n(Object obj) {
            super(2, obj, WolfModule.class, "trackPaywallAction", "trackPaywallAction(Ljava/lang/Object;)Lcom/bendingspoons/core/functional/Either;", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Continuation continuation) {
            return WolfModule.O((WolfModule) this.receiver, obj, continuation);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51362O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51363n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51364t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51362O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(this.f51362O, continuation);
            w6Var.f51364t = obj;
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
            int i2 = this.f51363n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.w6)) {
                            Object objNr = x0X.w6.nr(nVar);
                            if (objNr != null) {
                                json = et.w6.rl().adapter(WolfPredictionInfo.class).toJson(objNr);
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
                Function2 function2 = this.f51362O;
                Unit unit = Unit.INSTANCE;
                this.f51363n = 1;
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

    public abstract x0X.n J2(Object obj);

    public abstract x0X.n nr();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51360n;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return WolfModule.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((j) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51360n == 0) {
                ResultKt.throwOnFailure(obj);
                return WolfModule.this.nr();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // j8.j
    public void n(I28 i28) {
        Intrinsics.checkNotNullParameter(i28, qfEYuUHwj.LUmKZy);
        i28.n("getPredictionInfo", new w6(new j(null), null));
        i28.n("trackPaywallAction", new Ml(new n(this), null));
    }

    @Override // j8.j
    public String rl() {
        return "WolfAnalytics";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object O(WolfModule wolfModule, Object obj, Continuation continuation) {
        return wolfModule.J2(obj);
    }
}
