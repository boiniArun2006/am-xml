package com.alightcreative.backup.domain.usecases.internal;

import androidx.annotation.Keep;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.Timestamp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00109\u001a\u00020\u0011HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\tHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J·\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001b¨\u0006E"}, d2 = {"Lcom/alightcreative/backup/domain/usecases/internal/FirestoreCloudProjectPackage;", "", "amVersionCode", "", "amVersionString", "", "amPackageVersion", "amPlatform", "requiredEffects", "", "maxFFVer", "title", "medThumbUrl", "amPackageId", "shareDate", "Lcom/google/firebase/Timestamp;", "size", "", "projects", "Lcom/alightcreative/backup/domain/usecases/internal/FirestoreSharedProjectInfo;", "fphs", "duration", "width", "height", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;JLjava/util/List;IIII)V", "getAmVersionCode", "()I", "getAmVersionString", "()Ljava/lang/String;", "getAmPackageVersion", "getAmPlatform", "getRequiredEffects", "()Ljava/util/List;", "getMaxFFVer", "getTitle", "getMedThumbUrl", "getAmPackageId", "getShareDate", "()Lcom/google/firebase/Timestamp;", "getSize", "()J", "getProjects", "getFphs", "getDuration", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FirestoreCloudProjectPackage {
    private final String amPackageId;
    private final String amPackageVersion;
    private final String amPlatform;
    private final int amVersionCode;
    private final String amVersionString;
    private final int duration;
    private final int fphs;
    private final int height;
    private final int maxFFVer;
    private final String medThumbUrl;
    private final List<FirestoreSharedProjectInfo> projects;
    private final List<String> requiredEffects;
    private final Timestamp shareDate;
    private final long size;
    private final String title;
    private final int width;

    public FirestoreCloudProjectPackage() {
        this(0, null, null, null, null, 0, null, null, null, null, 0L, null, 0, 0, 0, 0, 65535, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAmVersionCode() {
        return this.amVersionCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Timestamp getShareDate() {
        return this.shareDate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final List<FirestoreSharedProjectInfo> component12() {
        return this.projects;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getFphs() {
        return this.fphs;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getHeight() {
        return this.height;
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
    public final int getMaxFFVer() {
        return this.maxFFVer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMedThumbUrl() {
        return this.medThumbUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAmPackageId() {
        return this.amPackageId;
    }

    public final FirestoreCloudProjectPackage copy(int amVersionCode, String amVersionString, String amPackageVersion, String amPlatform, List<String> requiredEffects, int maxFFVer, String title, String medThumbUrl, String amPackageId, Timestamp shareDate, long size, List<FirestoreSharedProjectInfo> projects, int fphs, int duration, int width, int height) {
        Intrinsics.checkNotNullParameter(amVersionString, "amVersionString");
        Intrinsics.checkNotNullParameter(amPackageVersion, "amPackageVersion");
        Intrinsics.checkNotNullParameter(amPlatform, "amPlatform");
        Intrinsics.checkNotNullParameter(requiredEffects, "requiredEffects");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(medThumbUrl, "medThumbUrl");
        Intrinsics.checkNotNullParameter(amPackageId, "amPackageId");
        Intrinsics.checkNotNullParameter(projects, "projects");
        return new FirestoreCloudProjectPackage(amVersionCode, amVersionString, amPackageVersion, amPlatform, requiredEffects, maxFFVer, title, medThumbUrl, amPackageId, shareDate, size, projects, fphs, duration, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirestoreCloudProjectPackage)) {
            return false;
        }
        FirestoreCloudProjectPackage firestoreCloudProjectPackage = (FirestoreCloudProjectPackage) other;
        return this.amVersionCode == firestoreCloudProjectPackage.amVersionCode && Intrinsics.areEqual(this.amVersionString, firestoreCloudProjectPackage.amVersionString) && Intrinsics.areEqual(this.amPackageVersion, firestoreCloudProjectPackage.amPackageVersion) && Intrinsics.areEqual(this.amPlatform, firestoreCloudProjectPackage.amPlatform) && Intrinsics.areEqual(this.requiredEffects, firestoreCloudProjectPackage.requiredEffects) && this.maxFFVer == firestoreCloudProjectPackage.maxFFVer && Intrinsics.areEqual(this.title, firestoreCloudProjectPackage.title) && Intrinsics.areEqual(this.medThumbUrl, firestoreCloudProjectPackage.medThumbUrl) && Intrinsics.areEqual(this.amPackageId, firestoreCloudProjectPackage.amPackageId) && Intrinsics.areEqual(this.shareDate, firestoreCloudProjectPackage.shareDate) && this.size == firestoreCloudProjectPackage.size && Intrinsics.areEqual(this.projects, firestoreCloudProjectPackage.projects) && this.fphs == firestoreCloudProjectPackage.fphs && this.duration == firestoreCloudProjectPackage.duration && this.width == firestoreCloudProjectPackage.width && this.height == firestoreCloudProjectPackage.height;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((Integer.hashCode(this.amVersionCode) * 31) + this.amVersionString.hashCode()) * 31) + this.amPackageVersion.hashCode()) * 31) + this.amPlatform.hashCode()) * 31) + this.requiredEffects.hashCode()) * 31) + Integer.hashCode(this.maxFFVer)) * 31) + this.title.hashCode()) * 31) + this.medThumbUrl.hashCode()) * 31) + this.amPackageId.hashCode()) * 31;
        Timestamp timestamp = this.shareDate;
        return ((((((((((((iHashCode + (timestamp == null ? 0 : timestamp.hashCode())) * 31) + Long.hashCode(this.size)) * 31) + this.projects.hashCode()) * 31) + Integer.hashCode(this.fphs)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    public String toString() {
        return "FirestoreCloudProjectPackage(amVersionCode=" + this.amVersionCode + ", amVersionString=" + this.amVersionString + ", amPackageVersion=" + this.amPackageVersion + ", amPlatform=" + this.amPlatform + ", requiredEffects=" + this.requiredEffects + ", maxFFVer=" + this.maxFFVer + ", title=" + this.title + ", medThumbUrl=" + this.medThumbUrl + ", amPackageId=" + this.amPackageId + ", shareDate=" + this.shareDate + ", size=" + this.size + ", projects=" + this.projects + ", fphs=" + this.fphs + ", duration=" + this.duration + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public FirestoreCloudProjectPackage(int i2, String amVersionString, String amPackageVersion, String amPlatform, List<String> requiredEffects, int i3, String title, String medThumbUrl, String amPackageId, Timestamp timestamp, long j2, List<FirestoreSharedProjectInfo> projects, int i5, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(amVersionString, "amVersionString");
        Intrinsics.checkNotNullParameter(amPackageVersion, "amPackageVersion");
        Intrinsics.checkNotNullParameter(amPlatform, "amPlatform");
        Intrinsics.checkNotNullParameter(requiredEffects, "requiredEffects");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(medThumbUrl, "medThumbUrl");
        Intrinsics.checkNotNullParameter(amPackageId, "amPackageId");
        Intrinsics.checkNotNullParameter(projects, "projects");
        this.amVersionCode = i2;
        this.amVersionString = amVersionString;
        this.amPackageVersion = amPackageVersion;
        this.amPlatform = amPlatform;
        this.requiredEffects = requiredEffects;
        this.maxFFVer = i3;
        this.title = title;
        this.medThumbUrl = medThumbUrl;
        this.amPackageId = amPackageId;
        this.shareDate = timestamp;
        this.size = j2;
        this.projects = projects;
        this.fphs = i5;
        this.duration = i7;
        this.width = i8;
        this.height = i9;
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

    public final int getDuration() {
        return this.duration;
    }

    public final int getFphs() {
        return this.fphs;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMaxFFVer() {
        return this.maxFFVer;
    }

    public final String getMedThumbUrl() {
        return this.medThumbUrl;
    }

    public final List<FirestoreSharedProjectInfo> getProjects() {
        return this.projects;
    }

    public final List<String> getRequiredEffects() {
        return this.requiredEffects;
    }

    public final Timestamp getShareDate() {
        return this.shareDate;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ FirestoreCloudProjectPackage(int i2, String str, String str2, String str3, List list, int i3, String str4, String str5, String str6, Timestamp timestamp, long j2, List list2, int i5, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i2, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? CollectionsKt.emptyList() : list, (i10 & 32) != 0 ? 0 : i3, (i10 & 64) != 0 ? "" : str4, (i10 & 128) != 0 ? "" : str5, (i10 & 256) == 0 ? str6 : "", (i10 & 512) != 0 ? null : timestamp, (i10 & 1024) != 0 ? 0L : j2, (i10 & 2048) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 4096) != 0 ? 0 : i5, (i10 & 8192) != 0 ? 0 : i7, (i10 & 16384) != 0 ? 0 : i8, (i10 & 32768) != 0 ? 0 : i9);
    }
}
