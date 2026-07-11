package com.alightcreative.app.motion.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.j;
import com.squareup.moshi.Json;
import ep.oxM.esLNYym;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0016HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003JÕ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0007HÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c¨\u0006K"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedContentRequest;", "", AppLovinBridge.f61288f, "", "appPackage", "versionName", j.f63195h, "", "deviceProduct", "deviceModel", "deviceCategory", "language", "osver", "appday", "benefits", "", "sig", "debugMode", "projectCount", "elementCount", "exportCount", "installDate", "", "abTestTags", "cachedFeedHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;IIIJLjava/util/List;Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "getAppPackage", "getVersionName", "getVersionCode", "()I", "getDeviceProduct", "getDeviceModel", "getDeviceCategory", "getLanguage", "getOsver", "getAppday", "getBenefits", "()Ljava/util/List;", "getSig", "getDebugMode", "getProjectCount", "getElementCount", "getExportCount", "getInstallDate", "()J", "getAbTestTags", "getCachedFeedHash", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedContentRequest {
    public static final int $stable = 8;
    private final List<String> abTestTags;
    private final String appPackage;
    private final int appday;
    private final List<String> benefits;
    private final String cachedFeedHash;
    private final String debugMode;
    private final String deviceCategory;
    private final String deviceModel;
    private final String deviceProduct;
    private final int elementCount;
    private final int exportCount;
    private final long installDate;
    private final String language;
    private final String osver;
    private final String platform;
    private final int projectCount;
    private final String sig;
    private final int versionCode;
    private final String versionName;

    public FeedContentRequest(String platform, @Json(name = "package") String appPackage, String versionName, int i2, String deviceProduct, String deviceModel, String str, String str2, String osver, int i3, List<String> benefits, String str3, String debugMode, int i5, int i7, int i8, long j2, List<String> abTestTags, String cachedFeedHash) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(deviceProduct, "deviceProduct");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(str, esLNYym.lEnmBXyqGXkKb);
        Intrinsics.checkNotNullParameter(str2, KfLR.wZn);
        Intrinsics.checkNotNullParameter(osver, "osver");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(debugMode, "debugMode");
        Intrinsics.checkNotNullParameter(abTestTags, "abTestTags");
        Intrinsics.checkNotNullParameter(cachedFeedHash, "cachedFeedHash");
        this.platform = platform;
        this.appPackage = appPackage;
        this.versionName = versionName;
        this.versionCode = i2;
        this.deviceProduct = deviceProduct;
        this.deviceModel = deviceModel;
        this.deviceCategory = str;
        this.language = str2;
        this.osver = osver;
        this.appday = i3;
        this.benefits = benefits;
        this.sig = str3;
        this.debugMode = debugMode;
        this.projectCount = i5;
        this.elementCount = i7;
        this.exportCount = i8;
        this.installDate = j2;
        this.abTestTags = abTestTags;
        this.cachedFeedHash = cachedFeedHash;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedContentRequest copy$default(FeedContentRequest feedContentRequest, String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, int i3, List list, String str9, String str10, int i5, int i7, int i8, long j2, List list2, String str11, int i9, Object obj) {
        String str12 = (i9 & 1) != 0 ? feedContentRequest.platform : str;
        return feedContentRequest.copy(str12, (i9 & 2) != 0 ? feedContentRequest.appPackage : str2, (i9 & 4) != 0 ? feedContentRequest.versionName : str3, (i9 & 8) != 0 ? feedContentRequest.versionCode : i2, (i9 & 16) != 0 ? feedContentRequest.deviceProduct : str4, (i9 & 32) != 0 ? feedContentRequest.deviceModel : str5, (i9 & 64) != 0 ? feedContentRequest.deviceCategory : str6, (i9 & 128) != 0 ? feedContentRequest.language : str7, (i9 & 256) != 0 ? feedContentRequest.osver : str8, (i9 & 512) != 0 ? feedContentRequest.appday : i3, (i9 & 1024) != 0 ? feedContentRequest.benefits : list, (i9 & 2048) != 0 ? feedContentRequest.sig : str9, (i9 & 4096) != 0 ? feedContentRequest.debugMode : str10, (i9 & 8192) != 0 ? feedContentRequest.projectCount : i5, (i9 & 16384) != 0 ? feedContentRequest.elementCount : i7, (i9 & 32768) != 0 ? feedContentRequest.exportCount : i8, (i9 & 65536) != 0 ? feedContentRequest.installDate : j2, (i9 & 131072) != 0 ? feedContentRequest.abTestTags : list2, (i9 & 262144) != 0 ? feedContentRequest.cachedFeedHash : str11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getAppday() {
        return this.appday;
    }

    public final List<String> component11() {
        return this.benefits;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSig() {
        return this.sig;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDebugMode() {
        return this.debugMode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getProjectCount() {
        return this.projectCount;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getElementCount() {
        return this.elementCount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getExportCount() {
        return this.exportCount;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getInstallDate() {
        return this.installDate;
    }

    public final List<String> component18() {
        return this.abTestTags;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getCachedFeedHash() {
        return this.cachedFeedHash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceProduct() {
        return this.deviceProduct;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceCategory() {
        return this.deviceCategory;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOsver() {
        return this.osver;
    }

    public final FeedContentRequest copy(String platform, @Json(name = "package") String appPackage, String versionName, int versionCode, String deviceProduct, String deviceModel, String deviceCategory, String language, String osver, int appday, List<String> benefits, String sig, String debugMode, int projectCount, int elementCount, int exportCount, long installDate, List<String> abTestTags, String cachedFeedHash) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(deviceProduct, "deviceProduct");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceCategory, "deviceCategory");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(osver, "osver");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(debugMode, "debugMode");
        Intrinsics.checkNotNullParameter(abTestTags, "abTestTags");
        Intrinsics.checkNotNullParameter(cachedFeedHash, "cachedFeedHash");
        return new FeedContentRequest(platform, appPackage, versionName, versionCode, deviceProduct, deviceModel, deviceCategory, language, osver, appday, benefits, sig, debugMode, projectCount, elementCount, exportCount, installDate, abTestTags, cachedFeedHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedContentRequest)) {
            return false;
        }
        FeedContentRequest feedContentRequest = (FeedContentRequest) other;
        return Intrinsics.areEqual(this.platform, feedContentRequest.platform) && Intrinsics.areEqual(this.appPackage, feedContentRequest.appPackage) && Intrinsics.areEqual(this.versionName, feedContentRequest.versionName) && this.versionCode == feedContentRequest.versionCode && Intrinsics.areEqual(this.deviceProduct, feedContentRequest.deviceProduct) && Intrinsics.areEqual(this.deviceModel, feedContentRequest.deviceModel) && Intrinsics.areEqual(this.deviceCategory, feedContentRequest.deviceCategory) && Intrinsics.areEqual(this.language, feedContentRequest.language) && Intrinsics.areEqual(this.osver, feedContentRequest.osver) && this.appday == feedContentRequest.appday && Intrinsics.areEqual(this.benefits, feedContentRequest.benefits) && Intrinsics.areEqual(this.sig, feedContentRequest.sig) && Intrinsics.areEqual(this.debugMode, feedContentRequest.debugMode) && this.projectCount == feedContentRequest.projectCount && this.elementCount == feedContentRequest.elementCount && this.exportCount == feedContentRequest.exportCount && this.installDate == feedContentRequest.installDate && Intrinsics.areEqual(this.abTestTags, feedContentRequest.abTestTags) && Intrinsics.areEqual(this.cachedFeedHash, feedContentRequest.cachedFeedHash);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.platform.hashCode() * 31) + this.appPackage.hashCode()) * 31) + this.versionName.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31) + this.deviceProduct.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.deviceCategory.hashCode()) * 31) + this.language.hashCode()) * 31) + this.osver.hashCode()) * 31) + Integer.hashCode(this.appday)) * 31) + this.benefits.hashCode()) * 31;
        String str = this.sig;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.debugMode.hashCode()) * 31) + Integer.hashCode(this.projectCount)) * 31) + Integer.hashCode(this.elementCount)) * 31) + Integer.hashCode(this.exportCount)) * 31) + Long.hashCode(this.installDate)) * 31) + this.abTestTags.hashCode()) * 31) + this.cachedFeedHash.hashCode();
    }

    public String toString() {
        return "FeedContentRequest(platform=" + this.platform + ", appPackage=" + this.appPackage + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", deviceProduct=" + this.deviceProduct + ", deviceModel=" + this.deviceModel + ", deviceCategory=" + this.deviceCategory + ", language=" + this.language + ", osver=" + this.osver + ", appday=" + this.appday + ", benefits=" + this.benefits + ", sig=" + this.sig + ", debugMode=" + this.debugMode + ", projectCount=" + this.projectCount + ", elementCount=" + this.elementCount + ", exportCount=" + this.exportCount + ", installDate=" + this.installDate + ", abTestTags=" + this.abTestTags + ", cachedFeedHash=" + this.cachedFeedHash + ")";
    }

    public final List<String> getAbTestTags() {
        return this.abTestTags;
    }

    public final String getAppPackage() {
        return this.appPackage;
    }

    public final int getAppday() {
        return this.appday;
    }

    public final List<String> getBenefits() {
        return this.benefits;
    }

    public final String getCachedFeedHash() {
        return this.cachedFeedHash;
    }

    public final String getDebugMode() {
        return this.debugMode;
    }

    public final String getDeviceCategory() {
        return this.deviceCategory;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceProduct() {
        return this.deviceProduct;
    }

    public final int getElementCount() {
        return this.elementCount;
    }

    public final int getExportCount() {
        return this.exportCount;
    }

    public final long getInstallDate() {
        return this.installDate;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getOsver() {
        return this.osver;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int getProjectCount() {
        return this.projectCount;
    }

    public final String getSig() {
        return this.sig;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }
}
