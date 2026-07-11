package KW9;

import ajd.j;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import d8q.jqQ.QTafcm;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f5466n;
    private final pq.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j.EnumC0481j f5467t;

    public static abstract class I28 extends n {
        private final pq.Ml nr;

        public static final class j extends I28 {
            private final long J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5468O;
            private final String Uo;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return Intrinsics.areEqual(this.f5468O, jVar.f5468O) && this.J2 == jVar.J2 && Intrinsics.areEqual(this.Uo, jVar.Uo);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String functionName, long j2, String str) {
                super(CollectionsKt.listOf("slow_native_function_call"), pq.I28.n(pq.n.O("function_name", functionName), pq.n.nr("execution_time_ms", Long.valueOf(j2)), pq.n.O("json_input", str == null ? V8ValueNull.NULL : str)), null);
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.f5468O = functionName;
                this.J2 = j2;
                this.Uo = str;
            }

            public int hashCode() {
                int iHashCode = ((this.f5468O.hashCode() * 31) + Long.hashCode(this.J2)) * 31;
                String str = this.Uo;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SlowNativeFunctionCall(functionName=" + this.f5468O + ", executionTimeMs=" + this.J2 + ", jsonInput=" + this.Uo + ")";
            }
        }

        public /* synthetic */ I28(List list, pq.Ml ml, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, ml);
        }

        private I28(List list, pq.Ml ml) {
            super(list, null, j.EnumC0481j.f13101O, 2, null);
            this.nr = ml;
        }

        @Override // KW9.n
        public pq.Ml n() {
            return this.nr;
        }
    }

    public static final class Ml extends n {
        public static final Ml nr = new Ml();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ml);
        }

        private Ml() {
            super(CollectionsKt.listOf("setup"), null, null, 6, null);
        }

        public String toString() {
            return "Setup";
        }

        public int hashCode() {
            return 563649827;
        }
    }

    public static abstract class j extends n {
        private final pq.Ml nr;

        public static final class C extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5469O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C) && Intrinsics.areEqual(this.f5469O, ((C) obj).f5469O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C(String functionName) {
                super(CollectionsKt.listOf("web_app_response_timeout"), pq.I28.n(pq.n.O("function_name", functionName)), null);
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.f5469O = functionName;
            }

            public int hashCode() {
                return this.f5469O.hashCode();
            }

            public String toString() {
                return "WebAppResponseTimeout(functionName=" + this.f5469O + ")";
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        public static final class CN3 extends j {
            private final pq.Ml J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final List f5470O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CN3)) {
                    return false;
                }
                CN3 cn3 = (CN3) obj;
                return Intrinsics.areEqual(this.f5470O, cn3.f5470O) && Intrinsics.areEqual(this.J2, cn3.J2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CN3(List remoteCategories, pq.Ml remoteInfo) {
                super(CollectionsKt.plus((Collection) CollectionsKt.listOf(QTafcm.nsKiXKmUycfAF), (Iterable) remoteCategories), pq.I28.n(pq.n.O("remote_info", remoteInfo.toString())), null);
                Intrinsics.checkNotNullParameter(remoteCategories, "remoteCategories");
                Intrinsics.checkNotNullParameter(remoteInfo, "remoteInfo");
                this.f5470O = remoteCategories;
                this.J2 = remoteInfo;
            }

            public int hashCode() {
                return (this.f5470O.hashCode() * 31) + this.J2.hashCode();
            }

            public String toString() {
                return "WebAppAssertionFailure(remoteCategories=" + this.f5470O + ", remoteInfo=" + this.J2 + ")";
            }
        }

        public static final class Dsr extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5471O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dsr) && Intrinsics.areEqual(this.f5471O, ((Dsr) obj).f5471O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dsr(String callbackId) {
                super(CollectionsKt.listOf("web_app_responded_to_missing_callback_id"), pq.I28.n(pq.n.O("callback_id", callbackId)), null);
                Intrinsics.checkNotNullParameter(callbackId, "callbackId");
                this.f5471O = callbackId;
            }

            public int hashCode() {
                return this.f5471O.hashCode();
            }

            public String toString() {
                return "WebAppRespondedToMissingCallbackId(callbackId=" + this.f5471O + ")";
            }
        }

        public static final class I28 extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final I28 f5472O = new I28();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof I28);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private I28() {
                super(CollectionsKt.listOf("injet_presenter_activity_webview_is_null"), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "InjetPresenterActivityWebViewIsNull";
            }

            public int hashCode() {
                return -472928037;
            }
        }

        public static final class Ml extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final Throwable f5473O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Ml) && Intrinsics.areEqual(this.f5473O, ((Ml) obj).f5473O);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Ml(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                List listListOf = CollectionsKt.listOf("injet_presenter_activity_error_adding_webview");
                String message = error.getMessage();
                super(listListOf, pq.I28.n(pq.n.O(MRAIDPresenter.ERROR, message == null ? "" : message)), null);
                this.f5473O = error;
            }

            public int hashCode() {
                return this.f5473O.hashCode();
            }

            public String toString() {
                return "InjetPresenterActivityErrorAddingWebView(error=" + this.f5473O + ")";
            }
        }

        public static final class Wre extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final Wre f5474O = new Wre();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Wre);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Wre() {
                super(CollectionsKt.listOf("present_injet_called_in_wrong_evaluation_status"), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "PresentInjetCalledInWrongEvaluationStatus";
            }

            public int hashCode() {
                return 277566356;
            }
        }

        public static final class aC extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5475O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof aC) && Intrinsics.areEqual(this.f5475O, ((aC) obj).f5475O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public aC(String jsOutput) {
                super(CollectionsKt.listOf("web_app_responded_with_invalid_output"), pq.I28.n(pq.n.O("js_output", jsOutput)), null);
                Intrinsics.checkNotNullParameter(jsOutput, "jsOutput");
                this.f5475O = jsOutput;
            }

            public int hashCode() {
                return this.f5475O.hashCode();
            }

            public String toString() {
                return "WebAppRespondedWithInvalidOutput(jsOutput=" + this.f5475O + ")";
            }
        }

        public static final class fuX extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5476O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof fuX) && Intrinsics.areEqual(this.f5476O, ((fuX) obj).f5476O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public fuX(String functionName) {
                super(CollectionsKt.listOf("web_app_called_missing_function"), pq.I28.n(pq.n.O("function_name", functionName)), null);
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.f5476O = functionName;
            }

            public int hashCode() {
                return this.f5476O.hashCode();
            }

            public String toString() {
                return "WebAppCalledMissingFunction(functionName=" + this.f5476O + ")";
            }
        }

        /* JADX INFO: renamed from: KW9.n$j$j, reason: collision with other inner class name */
        public static final class C0182j extends j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final C0182j f5477O = new C0182j();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0182j);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private C0182j() {
                super(CollectionsKt.listOf("duplicate_injet_present_called"), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "DuplicateInjetPresentCalled";
            }

            public int hashCode() {
                return 1916810051;
            }
        }

        /* JADX INFO: renamed from: KW9.n$j$n, reason: collision with other inner class name */
        public static final class C0183n extends j {
            private final String J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5478O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0183n)) {
                    return false;
                }
                C0183n c0183n = (C0183n) obj;
                return Intrinsics.areEqual(this.f5478O, c0183n.f5478O) && Intrinsics.areEqual(this.J2, c0183n.J2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0183n(String trigger, String initializationStatus) {
                super(CollectionsKt.listOf("evaluate_trigger_called_before_initialization"), pq.I28.n(pq.n.O("trigger", trigger), pq.n.O("initialization_status", initializationStatus)), null);
                Intrinsics.checkNotNullParameter(trigger, "trigger");
                Intrinsics.checkNotNullParameter(initializationStatus, "initializationStatus");
                this.f5478O = trigger;
                this.J2 = initializationStatus;
            }

            public int hashCode() {
                return (this.f5478O.hashCode() * 31) + this.J2.hashCode();
            }

            public String toString() {
                return "EvaluateTriggerCalledBeforeInitialization(trigger=" + this.f5478O + ", initializationStatus=" + this.J2 + ")";
            }
        }

        public static final class w6 extends j {
            private final String J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5479O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof w6)) {
                    return false;
                }
                w6 w6Var = (w6) obj;
                return Intrinsics.areEqual(this.f5479O, w6Var.f5479O) && Intrinsics.areEqual(this.J2, w6Var.J2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w6(String trigger, String str) {
                super(CollectionsKt.listOf("evaluate_trigger_failed"), pq.I28.n(pq.n.O("trigger", trigger), pq.n.O(MRAIDPresenter.ERROR, str == null ? "" : str)), null);
                Intrinsics.checkNotNullParameter(trigger, "trigger");
                this.f5479O = trigger;
                this.J2 = str;
            }

            public int hashCode() {
                int iHashCode = this.f5479O.hashCode() * 31;
                String str = this.J2;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "EvaluateTriggerFailed(trigger=" + this.f5479O + ", errorDescription=" + this.J2 + ")";
            }
        }

        public /* synthetic */ j(List list, pq.Ml ml, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, ml);
        }

        public /* synthetic */ j(List list, pq.Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i2 & 2) != 0 ? pq.I28.n(new pq.j[0]) : ml, null);
        }

        @Override // KW9.n
        public pq.Ml n() {
            return this.nr;
        }

        private j(List list, pq.Ml ml) {
            super(CollectionsKt.plus((Collection) CollectionsKt.listOf("assertion_failure"), (Iterable) list), null, j.EnumC0481j.f13104r, 2, null);
            this.nr = ml;
        }
    }

    /* JADX INFO: renamed from: KW9.n$n, reason: collision with other inner class name */
    public static final class C0184n extends n {
        public static final C0184n nr = new C0184n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0184n);
        }

        private C0184n() {
            super(CollectionsKt.listOf(NativeAdPresenter.DOWNLOAD), null, null, 6, null);
        }

        public String toString() {
            return "Download";
        }

        public int hashCode() {
            return -1637966814;
        }
    }

    public static abstract class w6 extends n {
        private final pq.Ml nr;

        public static final class CN3 extends w6 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5480O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CN3) && Intrinsics.areEqual(this.f5480O, ((CN3) obj).f5480O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CN3(String productId) {
                super(CollectionsKt.listOf("missing_product"), pq.I28.n(pq.n.O("product_id", productId)), null);
                Intrinsics.checkNotNullParameter(productId, "productId");
                this.f5480O = productId;
            }

            public int hashCode() {
                return this.f5480O.hashCode();
            }

            public String toString() {
                return "MissingProduct(productId=" + this.f5480O + ")";
            }
        }

        public static final class I28 extends w6 {
            private final boolean J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5481O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof I28)) {
                    return false;
                }
                I28 i28 = (I28) obj;
                return Intrinsics.areEqual(this.f5481O, i28.f5481O) && this.J2 == i28.J2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public I28(String trigger, boolean z2) {
                super(CollectionsKt.listOf("evaluate_trigger_completed"), pq.I28.n(pq.n.O("trigger", trigger), pq.n.n("has_user_completed_flow", z2)), null);
                Intrinsics.checkNotNullParameter(trigger, "trigger");
                this.f5481O = trigger;
                this.J2 = z2;
            }

            public int hashCode() {
                return (this.f5481O.hashCode() * 31) + Boolean.hashCode(this.J2);
            }

            public String toString() {
                return "EvaluateTriggerCompleted(trigger=" + this.f5481O + ", hasUserCompletedFlow=" + this.J2 + ")";
            }
        }

        public static final class Ml extends w6 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5482O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Ml) && Intrinsics.areEqual(this.f5482O, ((Ml) obj).f5482O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ml(String trigger) {
                super(CollectionsKt.listOf("evaluate_trigger_called_in_background"), pq.I28.n(pq.n.O("trigger", trigger)), null);
                Intrinsics.checkNotNullParameter(trigger, "trigger");
                this.f5482O = trigger;
            }

            public int hashCode() {
                return this.f5482O.hashCode();
            }

            public String toString() {
                return "EvaluateTriggerCalledInBackground(trigger=" + this.f5482O + ")";
            }
        }

        public static final class Wre extends w6 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5483O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Wre) && Intrinsics.areEqual(this.f5483O, ((Wre) obj).f5483O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Wre(String trigger) {
                super(CollectionsKt.listOf("evaluate_trigger_succeeded"), pq.I28.n(pq.n.O("trigger", trigger)), null);
                Intrinsics.checkNotNullParameter(trigger, "trigger");
                this.f5483O = trigger;
            }

            public int hashCode() {
                return this.f5483O.hashCode();
            }

            public String toString() {
                return "EvaluateTriggerSucceeded(trigger=" + this.f5483O + ")";
            }
        }

        public static final class fuX extends w6 {
            private final long J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5484O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof fuX)) {
                    return false;
                }
                fuX fux = (fuX) obj;
                return Intrinsics.areEqual(this.f5484O, fux.f5484O) && this.J2 == fux.J2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public fuX(String trigger, long j2) {
                super(CollectionsKt.listOf("present_injet_called"), pq.I28.n(pq.n.O("trigger", trigger), pq.n.nr("ms_since_evaluate_trigger", Long.valueOf(j2))), null);
                Intrinsics.checkNotNullParameter(trigger, "trigger");
                this.f5484O = trigger;
                this.J2 = j2;
            }

            public int hashCode() {
                return (this.f5484O.hashCode() * 31) + Long.hashCode(this.J2);
            }

            public String toString() {
                return "PresentInjetCalled(trigger=" + this.f5484O + ", timeSinceEvaluateTrigger=" + this.J2 + ")";
            }
        }

        public static abstract class j extends w6 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final pq.Ml f5485O;

            public static final class I28 extends j {
                public static final I28 J2 = new I28();

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof I28);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private I28() {
                    super(CollectionsKt.listOf("using_hard_coded_web_app"), null, 2, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "UsingHardCodedWebApp";
                }

                public int hashCode() {
                    return 1092656004;
                }
            }

            public static final class Ml extends j {
                private final String J2;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Ml) && Intrinsics.areEqual(this.J2, ((Ml) obj).J2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ml(String version) {
                    super(CollectionsKt.listOf("using_downloaded_web_app"), pq.I28.n(pq.n.O(NodeModuleProcess.PROPERTY_VERSION, version)), null);
                    Intrinsics.checkNotNullParameter(version, "version");
                    this.J2 = version;
                }

                public int hashCode() {
                    return this.J2.hashCode();
                }

                public String toString() {
                    return "UsingDownloadedWebApp(version=" + this.J2 + ")";
                }
            }

            public static final class Wre extends j {
                private final URL J2;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Wre) && Intrinsics.areEqual(this.J2, ((Wre) obj).J2);
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public Wre(URL url) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    List listListOf = CollectionsKt.listOf("web_app_download_completed");
                    String string = url.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    super(listListOf, pq.I28.n(pq.n.O("url", string)), null);
                    this.J2 = url;
                }

                public int hashCode() {
                    return this.J2.hashCode();
                }

                public String toString() {
                    return "WebAppDownloadCompleted(url=" + this.J2 + ")";
                }
            }

            /* JADX INFO: renamed from: KW9.n$w6$j$j, reason: collision with other inner class name */
            public static final class C0185j extends j {
                private final URL J2;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0185j) && Intrinsics.areEqual(this.J2, ((C0185j) obj).J2);
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public C0185j(URL url) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    List listListOf = CollectionsKt.listOf("config_decoded");
                    String string = url.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    super(listListOf, pq.I28.n(pq.n.O("url", string)), null);
                    this.J2 = url;
                }

                public int hashCode() {
                    return this.J2.hashCode();
                }

                public String toString() {
                    return "ConfigDecoded(url=" + this.J2 + ")";
                }
            }

            /* JADX INFO: renamed from: KW9.n$w6$j$n, reason: collision with other inner class name */
            public static final class C0186n extends j {
                private final d8q.j J2;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0186n) && Intrinsics.areEqual(this.J2, ((C0186n) obj).J2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0186n(d8q.j error) {
                    super(CollectionsKt.listOf("exception"), pq.I28.n(pq.n.O(MRAIDPresenter.ERROR, error.toString())), null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.J2 = error;
                }

                public int hashCode() {
                    return this.J2.hashCode();
                }

                public String toString() {
                    return "Exception(error=" + this.J2 + ")";
                }
            }

            /* JADX INFO: renamed from: KW9.n$w6$j$w6, reason: collision with other inner class name */
            public static final class C0187w6 extends j {
                private final String J2;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0187w6) && Intrinsics.areEqual(this.J2, ((C0187w6) obj).J2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0187w6(String version) {
                    super(CollectionsKt.listOf("using_cached_web_app"), pq.I28.n(pq.n.O(NodeModuleProcess.PROPERTY_VERSION, version)), null);
                    Intrinsics.checkNotNullParameter(version, "version");
                    this.J2 = version;
                }

                public int hashCode() {
                    return this.J2.hashCode();
                }

                public String toString() {
                    return "UsingCachedWebApp(version=" + this.J2 + ")";
                }
            }

            public /* synthetic */ j(List list, pq.Ml ml, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, ml);
            }

            public /* synthetic */ j(List list, pq.Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i2 & 2) != 0 ? pq.I28.n(new pq.j[0]) : ml, null);
            }

            @Override // KW9.n.w6, KW9.n
            public pq.Ml n() {
                return this.f5485O;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private j(List list, pq.Ml ml) {
                super(CollectionsKt.plus((Collection) CollectionsKt.listOf("download_manager"), (Iterable) list), null, 2, 0 == true ? 1 : 0);
                this.f5485O = ml;
            }
        }

        /* JADX INFO: renamed from: KW9.n$w6$n, reason: collision with other inner class name */
        public static final class C0188n extends w6 {
            private final String J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5486O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0188n)) {
                    return false;
                }
                C0188n c0188n = (C0188n) obj;
                return Intrinsics.areEqual(this.f5486O, c0188n.f5486O) && Intrinsics.areEqual(this.J2, c0188n.J2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0188n(String newTrigger, String evaluationStatus) {
                super(CollectionsKt.listOf("duplicate_trigger_evaluation"), pq.I28.n(pq.n.O("new_trigger", newTrigger), pq.n.O("evaluation_status", evaluationStatus)), null);
                Intrinsics.checkNotNullParameter(newTrigger, "newTrigger");
                Intrinsics.checkNotNullParameter(evaluationStatus, "evaluationStatus");
                this.f5486O = newTrigger;
                this.J2 = evaluationStatus;
            }

            public int hashCode() {
                return (this.f5486O.hashCode() * 31) + this.J2.hashCode();
            }

            public String toString() {
                return "DuplicateTriggerEvaluation(newTrigger=" + this.f5486O + ", evaluationStatus=" + this.J2 + ")";
            }
        }

        /* JADX INFO: renamed from: KW9.n$w6$w6, reason: collision with other inner class name */
        public static final class C0189w6 extends w6 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final String f5487O;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0189w6) && Intrinsics.areEqual(this.f5487O, ((C0189w6) obj).f5487O);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0189w6(String trigger) {
                super(CollectionsKt.listOf("evaluate_trigger_called"), pq.I28.n(pq.n.O("trigger", trigger)), null);
                Intrinsics.checkNotNullParameter(trigger, "trigger");
                this.f5487O = trigger;
            }

            public int hashCode() {
                return this.f5487O.hashCode();
            }

            public String toString() {
                return "EvaluateTriggerCalled(trigger=" + this.f5487O + ")";
            }
        }

        public /* synthetic */ w6(List list, pq.Ml ml, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, ml);
        }

        public /* synthetic */ w6(List list, pq.Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i2 & 2) != 0 ? pq.I28.n(new pq.j[0]) : ml, null);
        }

        @Override // KW9.n
        public pq.Ml n() {
            return this.nr;
        }

        private w6(List list, pq.Ml ml) {
            super(list, null, j.EnumC0481j.f13105t, 2, null);
            this.nr = ml;
        }
    }

    public /* synthetic */ n(List list, pq.Ml ml, j.EnumC0481j enumC0481j, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, ml, enumC0481j);
    }

    private n(List list, pq.Ml ml, j.EnumC0481j enumC0481j) {
        this.f5466n = list;
        this.rl = ml;
        this.f5467t = enumC0481j;
    }

    public pq.Ml n() {
        return this.rl;
    }

    public j.EnumC0481j t() {
        return this.f5467t;
    }

    public final ajd.j rl() {
        return new ajd.j(CollectionsKt.plus((Collection) CollectionsKt.listOf((Object[]) new String[]{"injet", "android-library"}), (Iterable) this.f5466n), t(), null, null, n(), 12, null);
    }

    public /* synthetic */ n(List list, pq.Ml ml, j.EnumC0481j enumC0481j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? new pq.Ml() : ml, (i2 & 4) != 0 ? j.EnumC0481j.f13105t : enumC0481j, null);
    }
}
