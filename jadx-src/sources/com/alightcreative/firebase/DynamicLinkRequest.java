package com.alightcreative.firebase;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Keep
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/alightcreative/firebase/DynamicLinkRequest;", "", "shortLink", "", "<init>", "(Ljava/lang/String;)V", "getShortLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DynamicLinkRequest {
    public static final int $stable = 0;
    private final String shortLink;

    public static /* synthetic */ DynamicLinkRequest copy$default(DynamicLinkRequest dynamicLinkRequest, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dynamicLinkRequest.shortLink;
        }
        return dynamicLinkRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShortLink() {
        return this.shortLink;
    }

    public final DynamicLinkRequest copy(@Json(name = "short_link") String shortLink) {
        Intrinsics.checkNotNullParameter(shortLink, "shortLink");
        return new DynamicLinkRequest(shortLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DynamicLinkRequest) && Intrinsics.areEqual(this.shortLink, ((DynamicLinkRequest) other).shortLink);
    }

    public int hashCode() {
        return this.shortLink.hashCode();
    }

    public String toString() {
        return "DynamicLinkRequest(shortLink=" + this.shortLink + ")";
    }

    public DynamicLinkRequest(@Json(name = "short_link") String shortLink) {
        Intrinsics.checkNotNullParameter(shortLink, "shortLink");
        this.shortLink = shortLink;
    }

    public final String getShortLink() {
        return this.shortLink;
    }
}
