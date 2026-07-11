package com.alightcreative.importer.projectpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.export.projectpackage.SharedProjectPackageInfo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006-"}, d2 = {"Lcom/alightcreative/importer/projectpackage/AlightLinkMetadataResponse;", "", "result", "", "info", "Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;", NativeAdPresenter.DOWNLOAD, "liteVersionAvailable", "", "freeUserMaxDownloadSize", "", "message", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getInfo", "()Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;", "getDownload", "getLiteVersionAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFreeUserMaxDownloadSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMessage", "getErrorCode", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/alightcreative/importer/projectpackage/AlightLinkMetadataResponse;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AlightLinkMetadataResponse {
    public static final int $stable = 8;
    private final String download;
    private final String errorCode;
    private final String errorMessage;
    private final Long freeUserMaxDownloadSize;
    private final SharedProjectPackageInfo info;
    private final Boolean liteVersionAvailable;
    private final String message;
    private final String result;

    public static /* synthetic */ AlightLinkMetadataResponse copy$default(AlightLinkMetadataResponse alightLinkMetadataResponse, String str, SharedProjectPackageInfo sharedProjectPackageInfo, String str2, Boolean bool, Long l2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = alightLinkMetadataResponse.result;
        }
        if ((i2 & 2) != 0) {
            sharedProjectPackageInfo = alightLinkMetadataResponse.info;
        }
        if ((i2 & 4) != 0) {
            str2 = alightLinkMetadataResponse.download;
        }
        if ((i2 & 8) != 0) {
            bool = alightLinkMetadataResponse.liteVersionAvailable;
        }
        if ((i2 & 16) != 0) {
            l2 = alightLinkMetadataResponse.freeUserMaxDownloadSize;
        }
        if ((i2 & 32) != 0) {
            str3 = alightLinkMetadataResponse.message;
        }
        if ((i2 & 64) != 0) {
            str4 = alightLinkMetadataResponse.errorCode;
        }
        if ((i2 & 128) != 0) {
            str5 = alightLinkMetadataResponse.errorMessage;
        }
        String str6 = str4;
        String str7 = str5;
        Long l5 = l2;
        String str8 = str3;
        return alightLinkMetadataResponse.copy(str, sharedProjectPackageInfo, str2, bool, l5, str8, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SharedProjectPackageInfo getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDownload() {
        return this.download;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getLiteVersionAvailable() {
        return this.liteVersionAvailable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getFreeUserMaxDownloadSize() {
        return this.freeUserMaxDownloadSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final AlightLinkMetadataResponse copy(String result, SharedProjectPackageInfo info, String download, Boolean liteVersionAvailable, Long freeUserMaxDownloadSize, String message, String errorCode, String errorMessage) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new AlightLinkMetadataResponse(result, info, download, liteVersionAvailable, freeUserMaxDownloadSize, message, errorCode, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlightLinkMetadataResponse)) {
            return false;
        }
        AlightLinkMetadataResponse alightLinkMetadataResponse = (AlightLinkMetadataResponse) other;
        return Intrinsics.areEqual(this.result, alightLinkMetadataResponse.result) && Intrinsics.areEqual(this.info, alightLinkMetadataResponse.info) && Intrinsics.areEqual(this.download, alightLinkMetadataResponse.download) && Intrinsics.areEqual(this.liteVersionAvailable, alightLinkMetadataResponse.liteVersionAvailable) && Intrinsics.areEqual(this.freeUserMaxDownloadSize, alightLinkMetadataResponse.freeUserMaxDownloadSize) && Intrinsics.areEqual(this.message, alightLinkMetadataResponse.message) && Intrinsics.areEqual(this.errorCode, alightLinkMetadataResponse.errorCode) && Intrinsics.areEqual(this.errorMessage, alightLinkMetadataResponse.errorMessage);
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        SharedProjectPackageInfo sharedProjectPackageInfo = this.info;
        int iHashCode2 = (iHashCode + (sharedProjectPackageInfo == null ? 0 : sharedProjectPackageInfo.hashCode())) * 31;
        String str = this.download;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.liteVersionAvailable;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.freeUserMaxDownloadSize;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorCode;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "AlightLinkMetadataResponse(result=" + this.result + ", info=" + this.info + ", download=" + this.download + ", liteVersionAvailable=" + this.liteVersionAvailable + ", freeUserMaxDownloadSize=" + this.freeUserMaxDownloadSize + ", message=" + this.message + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
    }

    public AlightLinkMetadataResponse(String result, SharedProjectPackageInfo sharedProjectPackageInfo, String str, Boolean bool, Long l2, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.info = sharedProjectPackageInfo;
        this.download = str;
        this.liteVersionAvailable = bool;
        this.freeUserMaxDownloadSize = l2;
        this.message = str2;
        this.errorCode = str3;
        this.errorMessage = str4;
    }

    public final String getDownload() {
        return this.download;
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

    public final SharedProjectPackageInfo getInfo() {
        return this.info;
    }

    public final Boolean getLiteVersionAvailable() {
        return this.liteVersionAvailable;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getResult() {
        return this.result;
    }
}
