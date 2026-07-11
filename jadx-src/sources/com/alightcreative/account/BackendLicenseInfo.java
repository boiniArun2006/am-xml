package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0003J°\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, d2 = {"Lcom/alightcreative/account/BackendLicenseInfo;", "", "valid", "", "type", "", "store", "productId", "autoRenewing", "orderNumber", "period", "label", "", "details", "expires", "", "benefits", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Ljava/util/List;)V", "getValid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/String;", "getStore", "getProductId", "getAutoRenewing", "getOrderNumber", "getPeriod", "getLabel", "()Ljava/util/Map;", "getDetails", "getExpires", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBenefits", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Ljava/util/List;)Lcom/alightcreative/account/BackendLicenseInfo;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BackendLicenseInfo {
    public static final int $stable = 8;
    private final Boolean autoRenewing;
    private final List<String> benefits;
    private final Map<String, String> details;
    private final Long expires;
    private final Map<String, String> label;
    private final String orderNumber;
    private final String period;
    private final String productId;
    private final String store;
    private final String type;
    private final Boolean valid;

    public BackendLicenseInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackendLicenseInfo copy$default(BackendLicenseInfo backendLicenseInfo, Boolean bool, String str, String str2, String str3, Boolean bool2, String str4, String str5, Map map, Map map2, Long l2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = backendLicenseInfo.valid;
        }
        if ((i2 & 2) != 0) {
            str = backendLicenseInfo.type;
        }
        if ((i2 & 4) != 0) {
            str2 = backendLicenseInfo.store;
        }
        if ((i2 & 8) != 0) {
            str3 = backendLicenseInfo.productId;
        }
        if ((i2 & 16) != 0) {
            bool2 = backendLicenseInfo.autoRenewing;
        }
        if ((i2 & 32) != 0) {
            str4 = backendLicenseInfo.orderNumber;
        }
        if ((i2 & 64) != 0) {
            str5 = backendLicenseInfo.period;
        }
        if ((i2 & 128) != 0) {
            map = backendLicenseInfo.label;
        }
        if ((i2 & 256) != 0) {
            map2 = backendLicenseInfo.details;
        }
        if ((i2 & 512) != 0) {
            l2 = backendLicenseInfo.expires;
        }
        if ((i2 & 1024) != 0) {
            list = backendLicenseInfo.benefits;
        }
        Long l5 = l2;
        List list2 = list;
        Map map3 = map;
        Map map4 = map2;
        String str6 = str4;
        String str7 = str5;
        Boolean bool3 = bool2;
        String str8 = str2;
        return backendLicenseInfo.copy(bool, str, str8, str3, bool3, str6, str7, map3, map4, l5, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getExpires() {
        return this.expires;
    }

    public final List<String> component11() {
        return this.benefits;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStore() {
        return this.store;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    public final Map<String, String> component8() {
        return this.label;
    }

    public final Map<String, String> component9() {
        return this.details;
    }

    public final BackendLicenseInfo copy(Boolean valid, String type, String store, String productId, Boolean autoRenewing, String orderNumber, String period, Map<String, String> label, Map<String, String> details, Long expires, List<String> benefits) {
        return new BackendLicenseInfo(valid, type, store, productId, autoRenewing, orderNumber, period, label, details, expires, benefits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackendLicenseInfo)) {
            return false;
        }
        BackendLicenseInfo backendLicenseInfo = (BackendLicenseInfo) other;
        return Intrinsics.areEqual(this.valid, backendLicenseInfo.valid) && Intrinsics.areEqual(this.type, backendLicenseInfo.type) && Intrinsics.areEqual(this.store, backendLicenseInfo.store) && Intrinsics.areEqual(this.productId, backendLicenseInfo.productId) && Intrinsics.areEqual(this.autoRenewing, backendLicenseInfo.autoRenewing) && Intrinsics.areEqual(this.orderNumber, backendLicenseInfo.orderNumber) && Intrinsics.areEqual(this.period, backendLicenseInfo.period) && Intrinsics.areEqual(this.label, backendLicenseInfo.label) && Intrinsics.areEqual(this.details, backendLicenseInfo.details) && Intrinsics.areEqual(this.expires, backendLicenseInfo.expires) && Intrinsics.areEqual(this.benefits, backendLicenseInfo.benefits);
    }

    public int hashCode() {
        Boolean bool = this.valid;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.store;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.autoRenewing;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.orderNumber;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.period;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.label;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.details;
        int iHashCode9 = (iHashCode8 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Long l2 = this.expires;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<String> list = this.benefits;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BackendLicenseInfo(valid=" + this.valid + ", type=" + this.type + ", store=" + this.store + ", productId=" + this.productId + ", autoRenewing=" + this.autoRenewing + ", orderNumber=" + this.orderNumber + ", period=" + this.period + ", label=" + this.label + ", details=" + this.details + ", expires=" + this.expires + ", benefits=" + this.benefits + ")";
    }

    public BackendLicenseInfo(Boolean bool, String str, String str2, String str3, Boolean bool2, String str4, String str5, Map<String, String> map, Map<String, String> map2, Long l2, List<String> list) {
        this.valid = bool;
        this.type = str;
        this.store = str2;
        this.productId = str3;
        this.autoRenewing = bool2;
        this.orderNumber = str4;
        this.period = str5;
        this.label = map;
        this.details = map2;
        this.expires = l2;
        this.benefits = list;
    }

    public final Boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final List<String> getBenefits() {
        return this.benefits;
    }

    public final Map<String, String> getDetails() {
        return this.details;
    }

    public final Long getExpires() {
        return this.expires;
    }

    public final Map<String, String> getLabel() {
        return this.label;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getStore() {
        return this.store;
    }

    public final String getType() {
        return this.type;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public /* synthetic */ BackendLicenseInfo(Boolean bool, String str, String str2, String str3, Boolean bool2, String str4, String str5, Map map, Map map2, Long l2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : map, (i2 & 256) != 0 ? null : map2, (i2 & 512) != 0 ? null : l2, (i2 & 1024) != 0 ? null : list);
    }
}
