package com.bendingspoons.injet.module;

import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AnalyticsModule implements j8.j {

    public static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51282O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51283n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51284t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51282O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            CN3 cn3 = new CN3(this.f51282O, continuation);
            cn3.f51284t = obj;
            return cn3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((CN3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            int i2 = this.f51283n;
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
                String str = (String) this.f51284t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(FailableOperation.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51282O;
                this.f51283n = 2;
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
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fBC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/bendingspoons/injet/module/AnalyticsModule$DebugEvent;", "", "severity", "Lcom/bendingspoons/injet/module/AnalyticsModule$DebugEvent$Severity;", "categories", "", "", "info", "", "errorCode", "<init>", "(Lcom/bendingspoons/injet/module/AnalyticsModule$DebugEvent$Severity;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "getSeverity", "()Lcom/bendingspoons/injet/module/AnalyticsModule$DebugEvent$Severity;", "getCategories", "()Ljava/util/List;", "getInfo", "()Ljava/util/Map;", "getErrorCode", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "Severity", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DebugEvent {
        public static final int $stable = 8;
        private final List<String> categories;
        private final String errorCode;
        private final Map<String, Object> info;
        private final Severity severity;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @JsonClass(generateAdapter = false)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/injet/module/AnalyticsModule$DebugEvent$Severity;", "", "<init>", "(Ljava/lang/String;I)V", "CRITICAL", "ERROR", "WARNING", "INFO", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Severity {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Severity[] $VALUES;

            @Json(name = "critical")
            public static final Severity CRITICAL = new Severity("CRITICAL", 0);

            @Json(name = MRAIDPresenter.ERROR)
            public static final Severity ERROR = new Severity("ERROR", 1);

            @Json(name = "warning")
            public static final Severity WARNING = new Severity("WARNING", 2);

            @Json(name = "info")
            public static final Severity INFO = new Severity("INFO", 3);

            private static final /* synthetic */ Severity[] $values() {
                return new Severity[]{CRITICAL, ERROR, WARNING, INFO};
            }

            public static EnumEntries<Severity> getEntries() {
                return $ENTRIES;
            }

            static {
                Severity[] severityArr$values = $values();
                $VALUES = severityArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(severityArr$values);
            }

            public static Severity valueOf(String str) {
                return (Severity) Enum.valueOf(Severity.class, str);
            }

            public static Severity[] values() {
                return (Severity[]) $VALUES.clone();
            }

            private Severity(String str, int i2) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DebugEvent copy$default(DebugEvent debugEvent, Severity severity, List list, Map map, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                severity = debugEvent.severity;
            }
            if ((i2 & 2) != 0) {
                list = debugEvent.categories;
            }
            if ((i2 & 4) != 0) {
                map = debugEvent.info;
            }
            if ((i2 & 8) != 0) {
                str = debugEvent.errorCode;
            }
            return debugEvent.copy(severity, list, map, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Severity getSeverity() {
            return this.severity;
        }

        public final List<String> component2() {
            return this.categories;
        }

        public final Map<String, Object> component3() {
            return this.info;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        public final DebugEvent copy(@Json(name = "severity") Severity severity, @Json(name = "categories") List<String> categories, @Json(name = "info") Map<String, ? extends Object> info, @Json(name = "errorCode") String errorCode) {
            Intrinsics.checkNotNullParameter(severity, "severity");
            Intrinsics.checkNotNullParameter(categories, "categories");
            Intrinsics.checkNotNullParameter(info, "info");
            return new DebugEvent(severity, categories, info, errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DebugEvent)) {
                return false;
            }
            DebugEvent debugEvent = (DebugEvent) other;
            return this.severity == debugEvent.severity && Intrinsics.areEqual(this.categories, debugEvent.categories) && Intrinsics.areEqual(this.info, debugEvent.info) && Intrinsics.areEqual(this.errorCode, debugEvent.errorCode);
        }

        public int hashCode() {
            int iHashCode = ((((this.severity.hashCode() * 31) + this.categories.hashCode()) * 31) + this.info.hashCode()) * 31;
            String str = this.errorCode;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DebugEvent(severity=" + this.severity + ", categories=" + this.categories + ", info=" + this.info + ", errorCode=" + this.errorCode + ")";
        }

        public DebugEvent(@Json(name = "severity") Severity severity, @Json(name = "categories") List<String> categories, @Json(name = "info") Map<String, ? extends Object> info, @Json(name = "errorCode") String str) {
            Intrinsics.checkNotNullParameter(severity, "severity");
            Intrinsics.checkNotNullParameter(categories, "categories");
            Intrinsics.checkNotNullParameter(info, "info");
            this.severity = severity;
            this.categories = categories;
            this.info = info;
            this.errorCode = str;
        }

        public final List<String> getCategories() {
            return this.categories;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final Map<String, Object> getInfo() {
            return this.info;
        }

        public final Severity getSeverity() {
            return this.severity;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bendingspoons/injet/module/AnalyticsModule$FailableOperation;", "", "id", "", a.f62811a, "Lcom/bendingspoons/injet/module/AnalyticsModule$DebugEvent;", "status", "Lcom/bendingspoons/injet/module/AnalyticsModule$FailableOperation$Status;", "<init>", "(Ljava/lang/String;Lcom/bendingspoons/injet/module/AnalyticsModule$DebugEvent;Lcom/bendingspoons/injet/module/AnalyticsModule$FailableOperation$Status;)V", "getId", "()Ljava/lang/String;", "getEvent", "()Lcom/bendingspoons/injet/module/AnalyticsModule$DebugEvent;", "getStatus", "()Lcom/bendingspoons/injet/module/AnalyticsModule$FailableOperation$Status;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "Status", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FailableOperation {
        public static final int $stable = 8;
        private final DebugEvent event;
        private final String id;
        private final Status status;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/injet/module/AnalyticsModule$FailableOperation$Status;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "COMPLETED", "FAILED", "CANCELED", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            @Json(name = "started")
            public static final Status STARTED = new Status("STARTED", 0);

            @Json(name = "completed")
            public static final Status COMPLETED = new Status("COMPLETED", 1);

            @Json(name = "failed")
            public static final Status FAILED = new Status("FAILED", 2);

            @Json(name = "canceled")
            public static final Status CANCELED = new Status("CANCELED", 3);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{STARTED, COMPLETED, FAILED, CANCELED};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }

            private Status(String str, int i2) {
            }
        }

        public static /* synthetic */ FailableOperation copy$default(FailableOperation failableOperation, String str, DebugEvent debugEvent, Status status, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = failableOperation.id;
            }
            if ((i2 & 2) != 0) {
                debugEvent = failableOperation.event;
            }
            if ((i2 & 4) != 0) {
                status = failableOperation.status;
            }
            return failableOperation.copy(str, debugEvent, status);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DebugEvent getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        public final FailableOperation copy(@Json(name = "id") String id, @Json(name = a.f62811a) DebugEvent event, @Json(name = "status") Status status) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(status, "status");
            return new FailableOperation(id, event, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailableOperation)) {
                return false;
            }
            FailableOperation failableOperation = (FailableOperation) other;
            return Intrinsics.areEqual(this.id, failableOperation.id) && Intrinsics.areEqual(this.event, failableOperation.event) && this.status == failableOperation.status;
        }

        public int hashCode() {
            String str = this.id;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.event.hashCode()) * 31) + this.status.hashCode();
        }

        public String toString() {
            return "FailableOperation(id=" + this.id + ", event=" + this.event + ", status=" + this.status + ")";
        }

        public FailableOperation(@Json(name = "id") String str, @Json(name = a.f62811a) DebugEvent event, @Json(name = "status") Status status) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(status, "status");
            this.id = str;
            this.event = event;
            this.status = status;
        }

        public final DebugEvent getEvent() {
            return this.event;
        }

        public final String getId() {
            return this.id;
        }

        public final Status getStatus() {
            return this.status;
        }
    }

    public static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51285O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51286n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51287t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51285O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            I28 i28 = new I28(this.f51285O, continuation);
            i28.f51287t = obj;
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
            int i2 = this.f51286n;
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
                String str = (String) this.f51287t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(UserEvent.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51285O;
                this.f51286n = 2;
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bendingspoons/injet/module/AnalyticsModule$UserEvent;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "info", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserEvent {
        public static final int $stable = 8;
        private final Map<String, Object> info;
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserEvent copy$default(UserEvent userEvent, String str, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = userEvent.name;
            }
            if ((i2 & 2) != 0) {
                map = userEvent.info;
            }
            return userEvent.copy(str, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> component2() {
            return this.info;
        }

        public final UserEvent copy(@Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "info") Map<String, ? extends Object> info) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(info, "info");
            return new UserEvent(name, info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserEvent)) {
                return false;
            }
            UserEvent userEvent = (UserEvent) other;
            return Intrinsics.areEqual(this.name, userEvent.name) && Intrinsics.areEqual(this.info, userEvent.info);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.info.hashCode();
        }

        public String toString() {
            return "UserEvent(name=" + this.name + ", info=" + this.info + ")";
        }

        public UserEvent(@Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "info") Map<String, ? extends Object> info) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(info, "info");
            this.name = name;
            this.info = info;
        }

        public final Map<String, Object> getInfo() {
            return this.info;
        }

        public final String getName() {
            return this.name;
        }
    }

    public static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51291O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51292n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51293t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51291O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f51291O, continuation);
            wre.f51293t = obj;
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
            int i2 = this.f51292n;
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
                String str = (String) this.f51293t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(DebugEvent.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51291O;
                this.f51292n = 2;
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

    public static final class fuX extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f51294O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51295n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51296t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fuX(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f51294O = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            fuX fux = new fuX(this.f51294O, continuation);
            fux.f51296t = obj;
            return fux;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((fuX) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            int i2 = this.f51295n;
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
                String str = (String) this.f51296t;
                if (str != null) {
                    objFromJson = et.w6.rl().adapter(DebugEvent.class).fromJson(str);
                } else {
                    objFromJson = null;
                }
                if (objFromJson == null) {
                    return "{\n    \"type\": \"error\",\n    \"data\": \"invalid input\"\n}";
                }
                Function2 function2 = this.f51294O;
                this.f51295n = 2;
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

    public abstract x0X.n J2(UserEvent userEvent);

    public abstract x0X.n O(FailableOperation failableOperation);

    public abstract x0X.n nr(DebugEvent debugEvent);

    public abstract x0X.n t(DebugEvent debugEvent);

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51289n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51290t;

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = AnalyticsModule.this.new Ml(continuation);
            ml.f51290t = obj;
            return ml;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DebugEvent debugEvent, Continuation continuation) {
            return ((Ml) create(debugEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51289n == 0) {
                ResultKt.throwOnFailure(obj);
                return AnalyticsModule.this.t((DebugEvent) this.f51290t);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51298n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51299t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = AnalyticsModule.this.new j(continuation);
            jVar.f51299t = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserEvent userEvent, Continuation continuation) {
            return ((j) create(userEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51298n == 0) {
                ResultKt.throwOnFailure(obj);
                return AnalyticsModule.this.J2((UserEvent) this.f51299t);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51301n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51302t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = AnalyticsModule.this.new n(continuation);
            nVar.f51302t = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DebugEvent debugEvent, Continuation continuation) {
            return ((n) create(debugEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51301n == 0) {
                ResultKt.throwOnFailure(obj);
                return AnalyticsModule.this.nr((DebugEvent) this.f51302t);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51304n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51305t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = AnalyticsModule.this.new w6(continuation);
            w6Var.f51305t = obj;
            return w6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FailableOperation failableOperation, Continuation continuation) {
            return ((w6) create(failableOperation, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51304n == 0) {
                ResultKt.throwOnFailure(obj);
                return AnalyticsModule.this.O((FailableOperation) this.f51305t);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.n("trackUserEvent", new I28(new j(null), null));
        scope.n("trackDebugEvent", new Wre(new n(null), null));
        scope.n("trackFailableOperation", new CN3(new w6(null), null));
        scope.n("trackAssertionFailure", new fuX(new Ml(null), null));
    }

    @Override // j8.j
    public String rl() {
        return "Analytics";
    }
}
