package com.bendingspoons.injet.webbridge;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bendingspoons/injet/webbridge/WebOutput;", "", "type", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getData", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WebOutput {
    public static final int $stable = 0;
    private final String data;
    private final String type;

    public WebOutput(@Json(name = "type") String type, @Json(name = "data") String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.data = str;
    }

    public static /* synthetic */ WebOutput copy$default(WebOutput webOutput, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = webOutput.type;
        }
        if ((i2 & 2) != 0) {
            str2 = webOutput.data;
        }
        return webOutput.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final WebOutput copy(@Json(name = "type") String type, @Json(name = "data") String data) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new WebOutput(type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebOutput)) {
            return false;
        }
        WebOutput webOutput = (WebOutput) other;
        return Intrinsics.areEqual(this.type, webOutput.type) && Intrinsics.areEqual(this.data, webOutput.data);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.data;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "WebOutput(type=" + this.type + ", data=" + this.data + ")";
    }

    public final String getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public /* synthetic */ WebOutput(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2);
    }
}
