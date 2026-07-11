package defpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"LLatestVersionJson;", "", "buildNative", "", "buildUrl", "signature", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildNative", "()Ljava/lang/String;", "getBuildUrl", "getSignature", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LatestVersionJson {
    public static final int $stable = 0;
    private final String buildNative;
    private final String buildUrl;
    private final String signature;

    public static /* synthetic */ LatestVersionJson copy$default(LatestVersionJson latestVersionJson, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = latestVersionJson.buildNative;
        }
        if ((i2 & 2) != 0) {
            str2 = latestVersionJson.buildUrl;
        }
        if ((i2 & 4) != 0) {
            str3 = latestVersionJson.signature;
        }
        return latestVersionJson.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBuildNative() {
        return this.buildNative;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBuildUrl() {
        return this.buildUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final LatestVersionJson copy(@Json(name = "build_native") String buildNative, @Json(name = "build_url") String buildUrl, String signature) {
        Intrinsics.checkNotNullParameter(buildNative, "buildNative");
        Intrinsics.checkNotNullParameter(buildUrl, "buildUrl");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new LatestVersionJson(buildNative, buildUrl, signature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestVersionJson)) {
            return false;
        }
        LatestVersionJson latestVersionJson = (LatestVersionJson) other;
        return Intrinsics.areEqual(this.buildNative, latestVersionJson.buildNative) && Intrinsics.areEqual(this.buildUrl, latestVersionJson.buildUrl) && Intrinsics.areEqual(this.signature, latestVersionJson.signature);
    }

    public int hashCode() {
        return (((this.buildNative.hashCode() * 31) + this.buildUrl.hashCode()) * 31) + this.signature.hashCode();
    }

    public String toString() {
        return "LatestVersionJson(buildNative=" + this.buildNative + ", buildUrl=" + this.buildUrl + ", signature=" + this.signature + ")";
    }

    public LatestVersionJson(@Json(name = "build_native") String buildNative, @Json(name = "build_url") String buildUrl, String signature) {
        Intrinsics.checkNotNullParameter(buildNative, "buildNative");
        Intrinsics.checkNotNullParameter(buildUrl, "buildUrl");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.buildNative = buildNative;
        this.buildUrl = buildUrl;
        this.signature = signature;
    }

    public final String getBuildNative() {
        return this.buildNative;
    }

    public final String getBuildUrl() {
        return this.buildUrl;
    }

    public final String getSignature() {
        return this.signature;
    }
}
