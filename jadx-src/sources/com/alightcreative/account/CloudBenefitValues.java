package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.firestore.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/alightcreative/account/CloudBenefitValues;", "", "highTier", "", "lowTier", "default", "<init>", "(JJJ)V", "value", "getHighTier", "()J", "setHighTier", "(J)V", "getLowTier", "setLowTier", "getDefault", "setDefault", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloudBenefitValues {
    public static final int $stable = 8;
    private long default;
    private long highTier;
    private long lowTier;

    public CloudBenefitValues() {
        this(0L, 0L, 0L, 7, null);
    }

    public static /* synthetic */ CloudBenefitValues copy$default(CloudBenefitValues cloudBenefitValues, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = cloudBenefitValues.highTier;
        }
        long j5 = j2;
        if ((i2 & 2) != 0) {
            j3 = cloudBenefitValues.lowTier;
        }
        long j6 = j3;
        if ((i2 & 4) != 0) {
            j4 = cloudBenefitValues.default;
        }
        return cloudBenefitValues.copy(j5, j6, j4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getHighTier() {
        return this.highTier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLowTier() {
        return this.lowTier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDefault() {
        return this.default;
    }

    public final CloudBenefitValues copy(long highTier, long lowTier, long j2) {
        return new CloudBenefitValues(highTier, lowTier, j2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudBenefitValues)) {
            return false;
        }
        CloudBenefitValues cloudBenefitValues = (CloudBenefitValues) other;
        return this.highTier == cloudBenefitValues.highTier && this.lowTier == cloudBenefitValues.lowTier && this.default == cloudBenefitValues.default;
    }

    public int hashCode() {
        return (((Long.hashCode(this.highTier) * 31) + Long.hashCode(this.lowTier)) * 31) + Long.hashCode(this.default);
    }

    public String toString() {
        return "CloudBenefitValues(highTier=" + this.highTier + ", lowTier=" + this.lowTier + ", default=" + this.default + ")";
    }

    public CloudBenefitValues(long j2, long j3, long j4) {
        this.highTier = j2;
        this.lowTier = j3;
        this.default = j4;
    }

    public final long getDefault() {
        return this.default;
    }

    @r("CloudStorageHighTier")
    public final long getHighTier() {
        return this.highTier;
    }

    @r("CloudStorageLowTier")
    public final long getLowTier() {
        return this.lowTier;
    }

    public final void setDefault(long j2) {
        this.default = j2;
    }

    @r("CloudStorageHighTier")
    public final void setHighTier(long j2) {
        this.highTier = j2;
    }

    @r("CloudStorageLowTier")
    public final void setLowTier(long j2) {
        this.lowTier = j2;
    }

    public /* synthetic */ CloudBenefitValues(long j2, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0L : j3, (i2 & 4) != 0 ? 0L : j4);
    }
}
