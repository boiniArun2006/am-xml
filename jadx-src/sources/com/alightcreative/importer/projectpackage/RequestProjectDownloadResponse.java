package com.alightcreative.importer.projectpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/alightcreative/importer/projectpackage/RequestProjectDownloadResponse;", "", "result", "", "downloadUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getDownloadUri", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RequestProjectDownloadResponse {
    public static final int $stable = 0;
    private final String downloadUri;
    private final String result;

    public static /* synthetic */ RequestProjectDownloadResponse copy$default(RequestProjectDownloadResponse requestProjectDownloadResponse, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = requestProjectDownloadResponse.result;
        }
        if ((i2 & 2) != 0) {
            str2 = requestProjectDownloadResponse.downloadUri;
        }
        return requestProjectDownloadResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDownloadUri() {
        return this.downloadUri;
    }

    public final RequestProjectDownloadResponse copy(String result, String downloadUri) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new RequestProjectDownloadResponse(result, downloadUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestProjectDownloadResponse)) {
            return false;
        }
        RequestProjectDownloadResponse requestProjectDownloadResponse = (RequestProjectDownloadResponse) other;
        return Intrinsics.areEqual(this.result, requestProjectDownloadResponse.result) && Intrinsics.areEqual(this.downloadUri, requestProjectDownloadResponse.downloadUri);
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        String str = this.downloadUri;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RequestProjectDownloadResponse(result=" + this.result + ", downloadUri=" + this.downloadUri + ")";
    }

    public RequestProjectDownloadResponse(String result, String str) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.downloadUri = str;
    }

    public final String getDownloadUri() {
        return this.downloadUri;
    }

    public final String getResult() {
        return this.result;
    }
}
