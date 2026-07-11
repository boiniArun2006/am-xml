package com.bendingspoons.spidersense.domain.network.entities;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/DebugEventForBackend;", "", "id", "", "severity", "categories", "", "description", "errorCode", "info", "", "createdAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;D)V", "getId", "()Ljava/lang/String;", "getSeverity", "getCategories", "()Ljava/util/List;", "getDescription", "getErrorCode", "getInfo", "()Ljava/util/Map;", "getCreatedAt", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DebugEventForBackend {
    public static final int $stable = 8;

    @Json(name = "categories")
    private final List<String> categories;

    @Json(name = "created_at")
    private final double createdAt;

    @Json(name = "description")
    private final String description;

    @Json(name = "error_code")
    private final String errorCode;

    @Json(name = "id")
    private final String id;

    @Json(name = "info")
    private final Map<String, Object> info;

    @Json(name = "severity")
    private final String severity;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DebugEventForBackend copy$default(DebugEventForBackend debugEventForBackend, String str, String str2, List list, String str3, String str4, Map map, double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = debugEventForBackend.id;
        }
        if ((i2 & 2) != 0) {
            str2 = debugEventForBackend.severity;
        }
        if ((i2 & 4) != 0) {
            list = debugEventForBackend.categories;
        }
        if ((i2 & 8) != 0) {
            str3 = debugEventForBackend.description;
        }
        if ((i2 & 16) != 0) {
            str4 = debugEventForBackend.errorCode;
        }
        if ((i2 & 32) != 0) {
            map = debugEventForBackend.info;
        }
        if ((i2 & 64) != 0) {
            d2 = debugEventForBackend.createdAt;
        }
        double d4 = d2;
        String str5 = str4;
        Map map2 = map;
        return debugEventForBackend.copy(str, str2, list, str3, str5, map2, d4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSeverity() {
        return this.severity;
    }

    public final List<String> component3() {
        return this.categories;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final Map<String, Object> component6() {
        return this.info;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getCreatedAt() {
        return this.createdAt;
    }

    public final DebugEventForBackend copy(String id, String severity, List<String> categories, String description, String errorCode, Map<String, ? extends Object> info, double createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(info, "info");
        return new DebugEventForBackend(id, severity, categories, description, errorCode, info, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugEventForBackend)) {
            return false;
        }
        DebugEventForBackend debugEventForBackend = (DebugEventForBackend) other;
        return Intrinsics.areEqual(this.id, debugEventForBackend.id) && Intrinsics.areEqual(this.severity, debugEventForBackend.severity) && Intrinsics.areEqual(this.categories, debugEventForBackend.categories) && Intrinsics.areEqual(this.description, debugEventForBackend.description) && Intrinsics.areEqual(this.errorCode, debugEventForBackend.errorCode) && Intrinsics.areEqual(this.info, debugEventForBackend.info) && Double.compare(this.createdAt, debugEventForBackend.createdAt) == 0;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.severity.hashCode()) * 31) + this.categories.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorCode;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.info.hashCode()) * 31) + Double.hashCode(this.createdAt);
    }

    public String toString() {
        return "DebugEventForBackend(id=" + this.id + ", severity=" + this.severity + ", categories=" + this.categories + ", description=" + this.description + ", errorCode=" + this.errorCode + ", info=" + this.info + ", createdAt=" + this.createdAt + ")";
    }

    public DebugEventForBackend(String id, String severity, List<String> categories, String str, String str2, Map<String, ? extends Object> info, double d2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(info, "info");
        this.id = id;
        this.severity = severity;
        this.categories = categories;
        this.description = str;
        this.errorCode = str2;
        this.info = info;
        this.createdAt = d2;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final double getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, Object> getInfo() {
        return this.info;
    }

    public final String getSeverity() {
        return this.severity;
    }
}
