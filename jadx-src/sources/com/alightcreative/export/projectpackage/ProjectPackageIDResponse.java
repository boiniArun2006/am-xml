package com.alightcreative.export.projectpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/alightcreative/export/projectpackage/ProjectPackageIDResponse;", "", "result", "", "packageId", "errorCode", "errorMessage", "freeUserMaxDownloadSize", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getResult", "()Ljava/lang/String;", "getPackageId", "getErrorCode", "getErrorMessage", "getFreeUserMaxDownloadSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/alightcreative/export/projectpackage/ProjectPackageIDResponse;", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProjectPackageIDResponse {
    public static final int $stable = 0;
    private final String errorCode;
    private final String errorMessage;
    private final Long freeUserMaxDownloadSize;
    private final String packageId;
    private final String result;

    public static /* synthetic */ ProjectPackageIDResponse copy$default(ProjectPackageIDResponse projectPackageIDResponse, String str, String str2, String str3, String str4, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = projectPackageIDResponse.result;
        }
        if ((i2 & 2) != 0) {
            str2 = projectPackageIDResponse.packageId;
        }
        if ((i2 & 4) != 0) {
            str3 = projectPackageIDResponse.errorCode;
        }
        if ((i2 & 8) != 0) {
            str4 = projectPackageIDResponse.errorMessage;
        }
        if ((i2 & 16) != 0) {
            l2 = projectPackageIDResponse.freeUserMaxDownloadSize;
        }
        Long l5 = l2;
        String str5 = str3;
        return projectPackageIDResponse.copy(str, str2, str5, str4, l5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getFreeUserMaxDownloadSize() {
        return this.freeUserMaxDownloadSize;
    }

    public final ProjectPackageIDResponse copy(String result, String packageId, String errorCode, String errorMessage, Long freeUserMaxDownloadSize) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new ProjectPackageIDResponse(result, packageId, errorCode, errorMessage, freeUserMaxDownloadSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectPackageIDResponse)) {
            return false;
        }
        ProjectPackageIDResponse projectPackageIDResponse = (ProjectPackageIDResponse) other;
        return Intrinsics.areEqual(this.result, projectPackageIDResponse.result) && Intrinsics.areEqual(this.packageId, projectPackageIDResponse.packageId) && Intrinsics.areEqual(this.errorCode, projectPackageIDResponse.errorCode) && Intrinsics.areEqual(this.errorMessage, projectPackageIDResponse.errorMessage) && Intrinsics.areEqual(this.freeUserMaxDownloadSize, projectPackageIDResponse.freeUserMaxDownloadSize);
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        String str = this.packageId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.freeUserMaxDownloadSize;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "ProjectPackageIDResponse(result=" + this.result + ", packageId=" + this.packageId + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", freeUserMaxDownloadSize=" + this.freeUserMaxDownloadSize + ")";
    }

    public ProjectPackageIDResponse(String result, String str, String str2, String str3, Long l2) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.packageId = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.freeUserMaxDownloadSize = l2;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Long getFreeUserMaxDownloadSize() {
        return this.freeUserMaxDownloadSize;
    }

    public final String getPackageId() {
        return this.packageId;
    }

    public final String getResult() {
        return this.result;
    }
}
