package com.alightcreative.export.projectpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.nKK;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010A\u001a\u00020\u0015HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180\tHÆ\u0003JÜ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tHÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"¨\u0006K"}, d2 = {"Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;", "", "amVersionCode", "", "amVersionString", "", "amPackageVersion", "amPlatform", "requiredEffects", "", "maxFFVer", "title", "largeThumbUrl", "medThumbUrl", "smallThumbUrl", "tinyThumbUrl", "amPackageId", "shortLink", "shareDate", "Lcom/google/firebase/Timestamp;", "size", "", "unavailableNotice", "projects", "Lcom/alightcreative/export/projectpackage/SharedProjectInfo;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;JLjava/lang/String;Ljava/util/List;)V", "getAmVersionCode", "()I", "getAmVersionString", "()Ljava/lang/String;", "getAmPackageVersion", "getAmPlatform", "getRequiredEffects", "()Ljava/util/List;", "getMaxFFVer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getLargeThumbUrl", "getMedThumbUrl", "getSmallThumbUrl", "getTinyThumbUrl", "getAmPackageId", "getShortLink", "getShareDate", "()Lcom/google/firebase/Timestamp;", "getSize", "()J", "getUnavailableNotice", "getProjects", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;JLjava/lang/String;Ljava/util/List;)Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SharedProjectPackageInfo {
    public static final int $stable = 8;
    private final String amPackageId;
    private final String amPackageVersion;
    private final String amPlatform;
    private final int amVersionCode;
    private final String amVersionString;
    private final String largeThumbUrl;
    private final Integer maxFFVer;
    private final String medThumbUrl;
    private final List<SharedProjectInfo> projects;
    private final List<String> requiredEffects;

    @nKK
    private final Timestamp shareDate;
    private final String shortLink;
    private final long size;
    private final String smallThumbUrl;
    private final String tinyThumbUrl;
    private final String title;
    private final String unavailableNotice;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAmVersionCode() {
        return this.amVersionCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSmallThumbUrl() {
        return this.smallThumbUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTinyThumbUrl() {
        return this.tinyThumbUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAmPackageId() {
        return this.amPackageId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getShortLink() {
        return this.shortLink;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Timestamp getShareDate() {
        return this.shareDate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUnavailableNotice() {
        return this.unavailableNotice;
    }

    public final List<SharedProjectInfo> component17() {
        return this.projects;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmVersionString() {
        return this.amVersionString;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAmPackageVersion() {
        return this.amPackageVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAmPlatform() {
        return this.amPlatform;
    }

    public final List<String> component5() {
        return this.requiredEffects;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxFFVer() {
        return this.maxFFVer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLargeThumbUrl() {
        return this.largeThumbUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMedThumbUrl() {
        return this.medThumbUrl;
    }

    public final SharedProjectPackageInfo copy(int amVersionCode, String amVersionString, String amPackageVersion, String amPlatform, List<String> requiredEffects, Integer maxFFVer, String title, String largeThumbUrl, String medThumbUrl, String smallThumbUrl, String tinyThumbUrl, String amPackageId, String shortLink, Timestamp shareDate, long size, String unavailableNotice, List<SharedProjectInfo> projects) {
        Intrinsics.checkNotNullParameter(amVersionString, "amVersionString");
        Intrinsics.checkNotNullParameter(amPackageVersion, "amPackageVersion");
        Intrinsics.checkNotNullParameter(projects, "projects");
        return new SharedProjectPackageInfo(amVersionCode, amVersionString, amPackageVersion, amPlatform, requiredEffects, maxFFVer, title, largeThumbUrl, medThumbUrl, smallThumbUrl, tinyThumbUrl, amPackageId, shortLink, shareDate, size, unavailableNotice, projects);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedProjectPackageInfo)) {
            return false;
        }
        SharedProjectPackageInfo sharedProjectPackageInfo = (SharedProjectPackageInfo) other;
        return this.amVersionCode == sharedProjectPackageInfo.amVersionCode && Intrinsics.areEqual(this.amVersionString, sharedProjectPackageInfo.amVersionString) && Intrinsics.areEqual(this.amPackageVersion, sharedProjectPackageInfo.amPackageVersion) && Intrinsics.areEqual(this.amPlatform, sharedProjectPackageInfo.amPlatform) && Intrinsics.areEqual(this.requiredEffects, sharedProjectPackageInfo.requiredEffects) && Intrinsics.areEqual(this.maxFFVer, sharedProjectPackageInfo.maxFFVer) && Intrinsics.areEqual(this.title, sharedProjectPackageInfo.title) && Intrinsics.areEqual(this.largeThumbUrl, sharedProjectPackageInfo.largeThumbUrl) && Intrinsics.areEqual(this.medThumbUrl, sharedProjectPackageInfo.medThumbUrl) && Intrinsics.areEqual(this.smallThumbUrl, sharedProjectPackageInfo.smallThumbUrl) && Intrinsics.areEqual(this.tinyThumbUrl, sharedProjectPackageInfo.tinyThumbUrl) && Intrinsics.areEqual(this.amPackageId, sharedProjectPackageInfo.amPackageId) && Intrinsics.areEqual(this.shortLink, sharedProjectPackageInfo.shortLink) && Intrinsics.areEqual(this.shareDate, sharedProjectPackageInfo.shareDate) && this.size == sharedProjectPackageInfo.size && Intrinsics.areEqual(this.unavailableNotice, sharedProjectPackageInfo.unavailableNotice) && Intrinsics.areEqual(this.projects, sharedProjectPackageInfo.projects);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.amVersionCode) * 31) + this.amVersionString.hashCode()) * 31) + this.amPackageVersion.hashCode()) * 31;
        String str = this.amPlatform;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.requiredEffects;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.maxFFVer;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.largeThumbUrl;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.medThumbUrl;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.smallThumbUrl;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tinyThumbUrl;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.amPackageId;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shortLink;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Timestamp timestamp = this.shareDate;
        int iHashCode12 = (((iHashCode11 + (timestamp == null ? 0 : timestamp.hashCode())) * 31) + Long.hashCode(this.size)) * 31;
        String str9 = this.unavailableNotice;
        return ((iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.projects.hashCode();
    }

    public String toString() {
        return "SharedProjectPackageInfo(amVersionCode=" + this.amVersionCode + ", amVersionString=" + this.amVersionString + ", amPackageVersion=" + this.amPackageVersion + ", amPlatform=" + this.amPlatform + ", requiredEffects=" + this.requiredEffects + ", maxFFVer=" + this.maxFFVer + ", title=" + this.title + ", largeThumbUrl=" + this.largeThumbUrl + ", medThumbUrl=" + this.medThumbUrl + ", smallThumbUrl=" + this.smallThumbUrl + ", tinyThumbUrl=" + this.tinyThumbUrl + ", amPackageId=" + this.amPackageId + ", shortLink=" + this.shortLink + ", shareDate=" + this.shareDate + ", size=" + this.size + ", unavailableNotice=" + this.unavailableNotice + ", projects=" + this.projects + ")";
    }

    public SharedProjectPackageInfo(int i2, String amVersionString, String amPackageVersion, String str, List<String> list, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Timestamp timestamp, long j2, String str9, List<SharedProjectInfo> projects) {
        Intrinsics.checkNotNullParameter(amVersionString, "amVersionString");
        Intrinsics.checkNotNullParameter(amPackageVersion, "amPackageVersion");
        Intrinsics.checkNotNullParameter(projects, "projects");
        this.amVersionCode = i2;
        this.amVersionString = amVersionString;
        this.amPackageVersion = amPackageVersion;
        this.amPlatform = str;
        this.requiredEffects = list;
        this.maxFFVer = num;
        this.title = str2;
        this.largeThumbUrl = str3;
        this.medThumbUrl = str4;
        this.smallThumbUrl = str5;
        this.tinyThumbUrl = str6;
        this.amPackageId = str7;
        this.shortLink = str8;
        this.shareDate = timestamp;
        this.size = j2;
        this.unavailableNotice = str9;
        this.projects = projects;
    }

    public final String getAmPackageId() {
        return this.amPackageId;
    }

    public final String getAmPackageVersion() {
        return this.amPackageVersion;
    }

    public final String getAmPlatform() {
        return this.amPlatform;
    }

    public final int getAmVersionCode() {
        return this.amVersionCode;
    }

    public final String getAmVersionString() {
        return this.amVersionString;
    }

    public final String getLargeThumbUrl() {
        return this.largeThumbUrl;
    }

    public final Integer getMaxFFVer() {
        return this.maxFFVer;
    }

    public final String getMedThumbUrl() {
        return this.medThumbUrl;
    }

    public final List<SharedProjectInfo> getProjects() {
        return this.projects;
    }

    public final List<String> getRequiredEffects() {
        return this.requiredEffects;
    }

    public final Timestamp getShareDate() {
        return this.shareDate;
    }

    public final String getShortLink() {
        return this.shortLink;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getSmallThumbUrl() {
        return this.smallThumbUrl;
    }

    public final String getTinyThumbUrl() {
        return this.tinyThumbUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUnavailableNotice() {
        return this.unavailableNotice;
    }
}
