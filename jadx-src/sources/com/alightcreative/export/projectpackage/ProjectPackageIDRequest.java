package com.alightcreative.export.projectpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/export/projectpackage/ProjectPackageIDRequest;", "", "packageSize", "", "acctTestMode", "", "<init>", "(JLjava/lang/String;)V", "getPackageSize", "()J", "getAcctTestMode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProjectPackageIDRequest {
    public static final int $stable = 0;
    private final String acctTestMode;
    private final long packageSize;

    public static /* synthetic */ ProjectPackageIDRequest copy$default(ProjectPackageIDRequest projectPackageIDRequest, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = projectPackageIDRequest.packageSize;
        }
        if ((i2 & 2) != 0) {
            str = projectPackageIDRequest.acctTestMode;
        }
        return projectPackageIDRequest.copy(j2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPackageSize() {
        return this.packageSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAcctTestMode() {
        return this.acctTestMode;
    }

    public final ProjectPackageIDRequest copy(long packageSize, String acctTestMode) {
        Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
        return new ProjectPackageIDRequest(packageSize, acctTestMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectPackageIDRequest)) {
            return false;
        }
        ProjectPackageIDRequest projectPackageIDRequest = (ProjectPackageIDRequest) other;
        return this.packageSize == projectPackageIDRequest.packageSize && Intrinsics.areEqual(this.acctTestMode, projectPackageIDRequest.acctTestMode);
    }

    public int hashCode() {
        return (Long.hashCode(this.packageSize) * 31) + this.acctTestMode.hashCode();
    }

    public String toString() {
        return "ProjectPackageIDRequest(packageSize=" + this.packageSize + ", acctTestMode=" + this.acctTestMode + ")";
    }

    public ProjectPackageIDRequest(long j2, String acctTestMode) {
        Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
        this.packageSize = j2;
        this.acctTestMode = acctTestMode;
    }

    public final String getAcctTestMode() {
        return this.acctTestMode;
    }

    public final long getPackageSize() {
        return this.packageSize;
    }
}
