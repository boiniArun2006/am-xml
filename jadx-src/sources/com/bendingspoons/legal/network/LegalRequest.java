package com.bendingspoons.legal.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/bendingspoons/legal/network/LegalRequest;", "", "privacyPolicy", "Lcom/bendingspoons/legal/network/LegalRequest$PrivacyPolicy;", "termsOfService", "Lcom/bendingspoons/legal/network/LegalRequest$TermsOfService;", "<init>", "(Lcom/bendingspoons/legal/network/LegalRequest$PrivacyPolicy;Lcom/bendingspoons/legal/network/LegalRequest$TermsOfService;)V", "getPrivacyPolicy", "()Lcom/bendingspoons/legal/network/LegalRequest$PrivacyPolicy;", "getTermsOfService", "()Lcom/bendingspoons/legal/network/LegalRequest$TermsOfService;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "PrivacyPolicy", "TermsOfService", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LegalRequest {
    public static final int $stable = 0;
    private final PrivacyPolicy privacyPolicy;
    private final TermsOfService termsOfService;

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bendingspoons/legal/network/LegalRequest$PrivacyPolicy;", "", NodeModuleProcess.PROPERTY_VERSION, "", "<init>", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PrivacyPolicy {
        public static final int $stable = 0;
        private final String version;

        public static /* synthetic */ PrivacyPolicy copy$default(PrivacyPolicy privacyPolicy, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = privacyPolicy.version;
            }
            return privacyPolicy.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PrivacyPolicy copy(@Json(name = NodeModuleProcess.PROPERTY_VERSION) String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new PrivacyPolicy(version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrivacyPolicy) && Intrinsics.areEqual(this.version, ((PrivacyPolicy) other).version);
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public String toString() {
            return "PrivacyPolicy(version=" + this.version + ")";
        }

        public PrivacyPolicy(@Json(name = NodeModuleProcess.PROPERTY_VERSION) String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.version = version;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bendingspoons/legal/network/LegalRequest$TermsOfService;", "", NodeModuleProcess.PROPERTY_VERSION, "", "<init>", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TermsOfService {
        public static final int $stable = 0;
        private final String version;

        public static /* synthetic */ TermsOfService copy$default(TermsOfService termsOfService, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = termsOfService.version;
            }
            return termsOfService.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final TermsOfService copy(@Json(name = NodeModuleProcess.PROPERTY_VERSION) String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new TermsOfService(version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TermsOfService) && Intrinsics.areEqual(this.version, ((TermsOfService) other).version);
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public String toString() {
            return "TermsOfService(version=" + this.version + ")";
        }

        public TermsOfService(@Json(name = NodeModuleProcess.PROPERTY_VERSION) String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.version = version;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    public static /* synthetic */ LegalRequest copy$default(LegalRequest legalRequest, PrivacyPolicy privacyPolicy, TermsOfService termsOfService, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            privacyPolicy = legalRequest.privacyPolicy;
        }
        if ((i2 & 2) != 0) {
            termsOfService = legalRequest.termsOfService;
        }
        return legalRequest.copy(privacyPolicy, termsOfService);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PrivacyPolicy getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TermsOfService getTermsOfService() {
        return this.termsOfService;
    }

    public final LegalRequest copy(@Json(name = "privacy_policy") PrivacyPolicy privacyPolicy, @Json(name = "terms_of_service") TermsOfService termsOfService) {
        Intrinsics.checkNotNullParameter(privacyPolicy, "privacyPolicy");
        Intrinsics.checkNotNullParameter(termsOfService, "termsOfService");
        return new LegalRequest(privacyPolicy, termsOfService);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalRequest)) {
            return false;
        }
        LegalRequest legalRequest = (LegalRequest) other;
        return Intrinsics.areEqual(this.privacyPolicy, legalRequest.privacyPolicy) && Intrinsics.areEqual(this.termsOfService, legalRequest.termsOfService);
    }

    public int hashCode() {
        return (this.privacyPolicy.hashCode() * 31) + this.termsOfService.hashCode();
    }

    public String toString() {
        return "LegalRequest(privacyPolicy=" + this.privacyPolicy + ", termsOfService=" + this.termsOfService + ")";
    }

    public LegalRequest(@Json(name = "privacy_policy") PrivacyPolicy privacyPolicy, @Json(name = "terms_of_service") TermsOfService termsOfService) {
        Intrinsics.checkNotNullParameter(privacyPolicy, "privacyPolicy");
        Intrinsics.checkNotNullParameter(termsOfService, "termsOfService");
        this.privacyPolicy = privacyPolicy;
        this.termsOfService = termsOfService;
    }

    public final PrivacyPolicy getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    public final TermsOfService getTermsOfService() {
        return this.termsOfService;
    }
}
