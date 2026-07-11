package com.alightcreative.export.projectpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/export/projectpackage/RegisterAMProjectPackageRequest;", "", "packageInfo", "Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;", "packageId", "", "acctTestMode", "<init>", "(Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;Ljava/lang/String;Ljava/lang/String;)V", "getPackageInfo", "()Lcom/alightcreative/export/projectpackage/SharedProjectPackageInfo;", "getPackageId", "()Ljava/lang/String;", "getAcctTestMode", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegisterAMProjectPackageRequest {
    public static final int $stable = 8;
    private final String acctTestMode;
    private final String packageId;
    private final SharedProjectPackageInfo packageInfo;

    public static /* synthetic */ RegisterAMProjectPackageRequest copy$default(RegisterAMProjectPackageRequest registerAMProjectPackageRequest, SharedProjectPackageInfo sharedProjectPackageInfo, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sharedProjectPackageInfo = registerAMProjectPackageRequest.packageInfo;
        }
        if ((i2 & 2) != 0) {
            str = registerAMProjectPackageRequest.packageId;
        }
        if ((i2 & 4) != 0) {
            str2 = registerAMProjectPackageRequest.acctTestMode;
        }
        return registerAMProjectPackageRequest.copy(sharedProjectPackageInfo, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SharedProjectPackageInfo getPackageInfo() {
        return this.packageInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAcctTestMode() {
        return this.acctTestMode;
    }

    public final RegisterAMProjectPackageRequest copy(SharedProjectPackageInfo packageInfo, String packageId, String acctTestMode) {
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
        return new RegisterAMProjectPackageRequest(packageInfo, packageId, acctTestMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterAMProjectPackageRequest)) {
            return false;
        }
        RegisterAMProjectPackageRequest registerAMProjectPackageRequest = (RegisterAMProjectPackageRequest) other;
        return Intrinsics.areEqual(this.packageInfo, registerAMProjectPackageRequest.packageInfo) && Intrinsics.areEqual(this.packageId, registerAMProjectPackageRequest.packageId) && Intrinsics.areEqual(this.acctTestMode, registerAMProjectPackageRequest.acctTestMode);
    }

    public int hashCode() {
        return (((this.packageInfo.hashCode() * 31) + this.packageId.hashCode()) * 31) + this.acctTestMode.hashCode();
    }

    public String toString() {
        return "RegisterAMProjectPackageRequest(packageInfo=" + this.packageInfo + ", packageId=" + this.packageId + ", acctTestMode=" + this.acctTestMode + ")";
    }

    public RegisterAMProjectPackageRequest(SharedProjectPackageInfo packageInfo, String packageId, String acctTestMode) {
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
        this.packageInfo = packageInfo;
        this.packageId = packageId;
        this.acctTestMode = acctTestMode;
    }

    public final String getAcctTestMode() {
        return this.acctTestMode;
    }

    public final String getPackageId() {
        return this.packageId;
    }

    public final SharedProjectPackageInfo getPackageInfo() {
        return this.packageInfo;
    }
}
