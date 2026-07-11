package defpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"LLatestVersion;", "", "webAppUrl", "", "signature", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWebAppUrl", "()Ljava/lang/String;", "getSignature", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LatestVersion {
    public static final int $stable = 0;
    private final String signature;
    private final String webAppUrl;

    public static /* synthetic */ LatestVersion copy$default(LatestVersion latestVersion, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = latestVersion.webAppUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = latestVersion.signature;
        }
        return latestVersion.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWebAppUrl() {
        return this.webAppUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final LatestVersion copy(String webAppUrl, String signature) {
        Intrinsics.checkNotNullParameter(webAppUrl, "webAppUrl");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new LatestVersion(webAppUrl, signature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestVersion)) {
            return false;
        }
        LatestVersion latestVersion = (LatestVersion) other;
        return Intrinsics.areEqual(this.webAppUrl, latestVersion.webAppUrl) && Intrinsics.areEqual(this.signature, latestVersion.signature);
    }

    public int hashCode() {
        return (this.webAppUrl.hashCode() * 31) + this.signature.hashCode();
    }

    public String toString() {
        return "LatestVersion(webAppUrl=" + this.webAppUrl + ", signature=" + this.signature + ")";
    }

    public LatestVersion(String webAppUrl, String signature) {
        Intrinsics.checkNotNullParameter(webAppUrl, "webAppUrl");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.webAppUrl = webAppUrl;
        this.signature = signature;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getWebAppUrl() {
        return this.webAppUrl;
    }
}
