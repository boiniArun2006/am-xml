package com.alightcreative.importer.projectpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.AppLovinBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/importer/projectpackage/AlightLinkMetadataRequest;", "", "uid", "", "pid", AppLovinBridge.f61288f, "appBuild", "", "acctTestMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getUid", "()Ljava/lang/String;", "getPid", "getPlatform", "getAppBuild", "()I", "getAcctTestMode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AlightLinkMetadataRequest {
    public static final int $stable = 0;
    private final String acctTestMode;
    private final int appBuild;
    private final String pid;
    private final String platform;
    private final String uid;

    public static /* synthetic */ AlightLinkMetadataRequest copy$default(AlightLinkMetadataRequest alightLinkMetadataRequest, String str, String str2, String str3, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = alightLinkMetadataRequest.uid;
        }
        if ((i3 & 2) != 0) {
            str2 = alightLinkMetadataRequest.pid;
        }
        if ((i3 & 4) != 0) {
            str3 = alightLinkMetadataRequest.platform;
        }
        if ((i3 & 8) != 0) {
            i2 = alightLinkMetadataRequest.appBuild;
        }
        if ((i3 & 16) != 0) {
            str4 = alightLinkMetadataRequest.acctTestMode;
        }
        String str5 = str4;
        String str6 = str3;
        return alightLinkMetadataRequest.copy(str, str2, str6, i2, str5);
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
    public final String getAcctTestMode() {
        return this.acctTestMode;
    }

    public final AlightLinkMetadataRequest copy(String uid, String pid, String platform, int appBuild, String acctTestMode) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(pid, "pid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
        return new AlightLinkMetadataRequest(uid, pid, platform, appBuild, acctTestMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlightLinkMetadataRequest)) {
            return false;
        }
        AlightLinkMetadataRequest alightLinkMetadataRequest = (AlightLinkMetadataRequest) other;
        return Intrinsics.areEqual(this.uid, alightLinkMetadataRequest.uid) && Intrinsics.areEqual(this.pid, alightLinkMetadataRequest.pid) && Intrinsics.areEqual(this.platform, alightLinkMetadataRequest.platform) && this.appBuild == alightLinkMetadataRequest.appBuild && Intrinsics.areEqual(this.acctTestMode, alightLinkMetadataRequest.acctTestMode);
    }

    public int hashCode() {
        return (((((((this.uid.hashCode() * 31) + this.pid.hashCode()) * 31) + this.platform.hashCode()) * 31) + Integer.hashCode(this.appBuild)) * 31) + this.acctTestMode.hashCode();
    }

    public String toString() {
        return "AlightLinkMetadataRequest(uid=" + this.uid + ", pid=" + this.pid + ", platform=" + this.platform + ", appBuild=" + this.appBuild + ", acctTestMode=" + this.acctTestMode + ")";
    }

    public AlightLinkMetadataRequest(String uid, String pid, String platform, int i2, String acctTestMode) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(pid, "pid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(acctTestMode, "acctTestMode");
        this.uid = uid;
        this.pid = pid;
        this.platform = platform;
        this.appBuild = i2;
        this.acctTestMode = acctTestMode;
    }

    public final String getAcctTestMode() {
        return this.acctTestMode;
    }

    public final int getAppBuild() {
        return this.appBuild;
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
