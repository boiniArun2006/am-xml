package defpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"LFreeze;", "", "nativeBuildNumber", "", "webAppUrl", "", "signature", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getNativeBuildNumber", "()I", "getWebAppUrl", "()Ljava/lang/String;", "getSignature", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Freeze {
    public static final int $stable = 0;
    private final int nativeBuildNumber;
    private final String signature;
    private final String webAppUrl;

    public static /* synthetic */ Freeze copy$default(Freeze freeze, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = freeze.nativeBuildNumber;
        }
        if ((i3 & 2) != 0) {
            str = freeze.webAppUrl;
        }
        if ((i3 & 4) != 0) {
            str2 = freeze.signature;
        }
        return freeze.copy(i2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNativeBuildNumber() {
        return this.nativeBuildNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWebAppUrl() {
        return this.webAppUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final Freeze copy(@Json(name = "build_native") int nativeBuildNumber, @Json(name = "build_url") String webAppUrl, String signature) {
        Intrinsics.checkNotNullParameter(webAppUrl, "webAppUrl");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new Freeze(nativeBuildNumber, webAppUrl, signature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Freeze)) {
            return false;
        }
        Freeze freeze = (Freeze) other;
        return this.nativeBuildNumber == freeze.nativeBuildNumber && Intrinsics.areEqual(this.webAppUrl, freeze.webAppUrl) && Intrinsics.areEqual(this.signature, freeze.signature);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.nativeBuildNumber) * 31) + this.webAppUrl.hashCode()) * 31) + this.signature.hashCode();
    }

    public String toString() {
        return "Freeze(nativeBuildNumber=" + this.nativeBuildNumber + ", webAppUrl=" + this.webAppUrl + ", signature=" + this.signature + ")";
    }

    public Freeze(@Json(name = "build_native") int i2, @Json(name = "build_url") String webAppUrl, String signature) {
        Intrinsics.checkNotNullParameter(webAppUrl, "webAppUrl");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.nativeBuildNumber = i2;
        this.webAppUrl = webAppUrl;
        this.signature = signature;
    }

    public final int getNativeBuildNumber() {
        return this.nativeBuildNumber;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getWebAppUrl() {
        return this.webAppUrl;
    }
}
