package com.alightcreative.importer.projectpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.AppLovinBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006!"}, d2 = {"Lcom/alightcreative/importer/projectpackage/RequestProjectDownloadRequest;", "", "uid", "", "pid", AppLovinBridge.f61288f, "appBuild", "", "liteVersion", "", "acctTestMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", "getUid", "()Ljava/lang/String;", "getPid", "getPlatform", "getAppBuild", "()I", "getLiteVersion", "()Z", "getAcctTestMode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RequestProjectDownloadRequest {
    public static final int $stable = 0;
    private final String acctTestMode;
    private final int appBuild;
    private final boolean liteVersion;
    private final String pid;
    private final String platform;
    private final String uid;

    public static /* synthetic */ RequestProjectDownloadRequest copy$default(RequestProjectDownloadRequest requestProjectDownloadRequest, String str, String str2, String str3, int i2, boolean z2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = requestProjectDownloadRequest.uid;
        }
        if ((i3 & 2) != 0) {
            str2 = requestProjectDownloadRequest.pid;
        }
        if ((i3 & 4) != 0) {
            str3 = requestProjectDownloadRequest.platform;
        }
        if ((i3 & 8) != 0) {
            i2 = requestProjectDownloadRequest.appBuild;
        }
        if ((i3 & 16) != 0) {
            z2 = requestProjectDownloadRequest.liteVersion;
        }
        if ((i3 & 32) != 0) {
            str4 = requestProjectDownloadRequest.acctTestMode;
        }
        boolean z3 = z2;
        String str5 = str4;
        return requestProjectDownloadRequest.copy(str, str2, str3, i2, z3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAppBuild() {
        return this.appBuild;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLiteVersion() {
        return this.liteVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAcctTestMode() {
        return this.acctTestMode;
    }

    public final RequestProjectDownloadRequest copy(String uid, String pid, String platform, int appBuild, boolean liteVersion, String acctTestMode) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(pid, "pid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
        return new RequestProjectDownloadRequest(uid, pid, platform, appBuild, liteVersion, acctTestMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestProjectDownloadRequest)) {
            return false;
        }
        RequestProjectDownloadRequest requestProjectDownloadRequest = (RequestProjectDownloadRequest) other;
        return Intrinsics.areEqual(this.uid, requestProjectDownloadRequest.uid) && Intrinsics.areEqual(this.pid, requestProjectDownloadRequest.pid) && Intrinsics.areEqual(this.platform, requestProjectDownloadRequest.platform) && this.appBuild == requestProjectDownloadRequest.appBuild && this.liteVersion == requestProjectDownloadRequest.liteVersion && Intrinsics.areEqual(this.acctTestMode, requestProjectDownloadRequest.acctTestMode);
    }

    public int hashCode() {
        return (((((((((this.uid.hashCode() * 31) + this.pid.hashCode()) * 31) + this.platform.hashCode()) * 31) + Integer.hashCode(this.appBuild)) * 31) + Boolean.hashCode(this.liteVersion)) * 31) + this.acctTestMode.hashCode();
    }

    public String toString() {
        return "RequestProjectDownloadRequest(uid=" + this.uid + ", pid=" + this.pid + ", platform=" + this.platform + ", appBuild=" + this.appBuild + ", liteVersion=" + this.liteVersion + ", acctTestMode=" + this.acctTestMode + ")";
    }

    public RequestProjectDownloadRequest(String uid, String pid, String platform, int i2, boolean z2, String acctTestMode) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(pid, "pid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
        this.uid = uid;
        this.pid = pid;
        this.platform = platform;
        this.appBuild = i2;
        this.liteVersion = z2;
        this.acctTestMode = acctTestMode;
    }

    public final String getAcctTestMode() {
        return this.acctTestMode;
    }

    public final int getAppBuild() {
        return this.appBuild;
    }

    public final boolean getLiteVersion() {
        return this.liteVersion;
    }

    public final String getPid() {
        return this.pid;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getUid() {
        return this.uid;
    }
}
