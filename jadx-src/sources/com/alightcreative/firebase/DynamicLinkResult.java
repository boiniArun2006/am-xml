package com.alightcreative.firebase;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Keep
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/firebase/DynamicLinkResult;", "", "longLink", "", "result", JavetError.PARAMETER_REASON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLongLink", "()Ljava/lang/String;", "getResult", "getReason", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DynamicLinkResult {
    public static final int $stable = 0;
    private final String longLink;
    private final String reason;
    private final String result;

    public static /* synthetic */ DynamicLinkResult copy$default(DynamicLinkResult dynamicLinkResult, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dynamicLinkResult.longLink;
        }
        if ((i2 & 2) != 0) {
            str2 = dynamicLinkResult.result;
        }
        if ((i2 & 4) != 0) {
            str3 = dynamicLinkResult.reason;
        }
        return dynamicLinkResult.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLongLink() {
        return this.longLink;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final DynamicLinkResult copy(@Json(name = "long_link") String longLink, String result, String reason) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new DynamicLinkResult(longLink, result, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicLinkResult)) {
            return false;
        }
        DynamicLinkResult dynamicLinkResult = (DynamicLinkResult) other;
        return Intrinsics.areEqual(this.longLink, dynamicLinkResult.longLink) && Intrinsics.areEqual(this.result, dynamicLinkResult.result) && Intrinsics.areEqual(this.reason, dynamicLinkResult.reason);
    }

    public int hashCode() {
        String str = this.longLink;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.result.hashCode()) * 31;
        String str2 = this.reason;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DynamicLinkResult(longLink=" + this.longLink + ", result=" + this.result + ", reason=" + this.reason + ")";
    }

    public DynamicLinkResult(@Json(name = "long_link") String str, String result, String str2) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.longLink = str;
        this.result = result;
        this.reason = str2;
    }

    public final String getLongLink() {
        return this.longLink;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getResult() {
        return this.result;
    }
}
