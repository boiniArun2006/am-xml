package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.Timestamp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/alightcreative/account/AccountDoc;", "", "documentFormatVersion", "", "accountCreated", "Lcom/google/firebase/Timestamp;", "licenses", "", "Lcom/alightcreative/account/BackendLicenseInfo;", "campaigns", "Lcom/alightcreative/account/Campaigns;", "cloud", "Lcom/alightcreative/account/CloudStorageStatus;", "<init>", "(JLcom/google/firebase/Timestamp;Ljava/util/List;Lcom/alightcreative/account/Campaigns;Lcom/alightcreative/account/CloudStorageStatus;)V", "getDocumentFormatVersion", "()J", "getAccountCreated", "()Lcom/google/firebase/Timestamp;", "getLicenses", "()Ljava/util/List;", "getCampaigns", "()Lcom/alightcreative/account/Campaigns;", "getCloud", "()Lcom/alightcreative/account/CloudStorageStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountDoc {
    public static final int $stable = 8;
    private final Timestamp accountCreated;
    private final Campaigns campaigns;
    private final CloudStorageStatus cloud;
    private final long documentFormatVersion;
    private final List<BackendLicenseInfo> licenses;

    public AccountDoc() {
        this(0L, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountDoc copy$default(AccountDoc accountDoc, long j2, Timestamp timestamp, List list, Campaigns campaigns, CloudStorageStatus cloudStorageStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = accountDoc.documentFormatVersion;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            timestamp = accountDoc.accountCreated;
        }
        Timestamp timestamp2 = timestamp;
        if ((i2 & 4) != 0) {
            list = accountDoc.licenses;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            campaigns = accountDoc.campaigns;
        }
        Campaigns campaigns2 = campaigns;
        if ((i2 & 16) != 0) {
            cloudStorageStatus = accountDoc.cloud;
        }
        return accountDoc.copy(j3, timestamp2, list2, campaigns2, cloudStorageStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDocumentFormatVersion() {
        return this.documentFormatVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Timestamp getAccountCreated() {
        return this.accountCreated;
    }

    public final List<BackendLicenseInfo> component3() {
        return this.licenses;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Campaigns getCampaigns() {
        return this.campaigns;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CloudStorageStatus getCloud() {
        return this.cloud;
    }

    public final AccountDoc copy(long documentFormatVersion, Timestamp accountCreated, List<BackendLicenseInfo> licenses, Campaigns campaigns, CloudStorageStatus cloud) {
        Intrinsics.checkNotNullParameter(licenses, "licenses");
        return new AccountDoc(documentFormatVersion, accountCreated, licenses, campaigns, cloud);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDoc)) {
            return false;
        }
        AccountDoc accountDoc = (AccountDoc) other;
        return this.documentFormatVersion == accountDoc.documentFormatVersion && Intrinsics.areEqual(this.accountCreated, accountDoc.accountCreated) && Intrinsics.areEqual(this.licenses, accountDoc.licenses) && Intrinsics.areEqual(this.campaigns, accountDoc.campaigns) && Intrinsics.areEqual(this.cloud, accountDoc.cloud);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.documentFormatVersion) * 31;
        Timestamp timestamp = this.accountCreated;
        int iHashCode2 = (((iHashCode + (timestamp == null ? 0 : timestamp.hashCode())) * 31) + this.licenses.hashCode()) * 31;
        Campaigns campaigns = this.campaigns;
        int iHashCode3 = (iHashCode2 + (campaigns == null ? 0 : campaigns.hashCode())) * 31;
        CloudStorageStatus cloudStorageStatus = this.cloud;
        return iHashCode3 + (cloudStorageStatus != null ? cloudStorageStatus.hashCode() : 0);
    }

    public String toString() {
        return "AccountDoc(documentFormatVersion=" + this.documentFormatVersion + ", accountCreated=" + this.accountCreated + ", licenses=" + this.licenses + ", campaigns=" + this.campaigns + ", cloud=" + this.cloud + ")";
    }

    public AccountDoc(long j2, Timestamp timestamp, List<BackendLicenseInfo> licenses, Campaigns campaigns, CloudStorageStatus cloudStorageStatus) {
        Intrinsics.checkNotNullParameter(licenses, "licenses");
        this.documentFormatVersion = j2;
        this.accountCreated = timestamp;
        this.licenses = licenses;
        this.campaigns = campaigns;
        this.cloud = cloudStorageStatus;
    }

    public final Timestamp getAccountCreated() {
        return this.accountCreated;
    }

    public final Campaigns getCampaigns() {
        return this.campaigns;
    }

    public final CloudStorageStatus getCloud() {
        return this.cloud;
    }

    public final long getDocumentFormatVersion() {
        return this.documentFormatVersion;
    }

    public final List<BackendLicenseInfo> getLicenses() {
        return this.licenses;
    }

    public /* synthetic */ AccountDoc(long j2, Timestamp timestamp, List list, Campaigns campaigns, CloudStorageStatus cloudStorageStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? null : timestamp, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? null : campaigns, (i2 & 16) != 0 ? null : cloudStorageStatus);
    }
}
