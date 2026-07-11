package com.bendingspoons.legal.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bendingspoons/legal/network/TermsOfServiceRequest;", "", NodeModuleProcess.PROPERTY_VERSION, "", "<init>", "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "legal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TermsOfServiceRequest {
    public static final int $stable = 0;
    private final String version;

    public static /* synthetic */ TermsOfServiceRequest copy$default(TermsOfServiceRequest termsOfServiceRequest, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = termsOfServiceRequest.version;
        }
        return termsOfServiceRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final TermsOfServiceRequest copy(@Json(name = NodeModuleProcess.PROPERTY_VERSION) String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new TermsOfServiceRequest(version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TermsOfServiceRequest) && Intrinsics.areEqual(this.version, ((TermsOfServiceRequest) other).version);
    }

    public int hashCode() {
        return this.version.hashCode();
    }

    public String toString() {
        return "TermsOfServiceRequest(version=" + this.version + ")";
    }

    public TermsOfServiceRequest(@Json(name = NodeModuleProcess.PROPERTY_VERSION) String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.version = version;
    }

    public final String getVersion() {
        return this.version;
    }
}
