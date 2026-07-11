package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/alightcreative/account/CloudStorageConfig;", "", "benefitValues", "Lcom/alightcreative/account/CloudBenefitValues;", "<init>", "(Lcom/alightcreative/account/CloudBenefitValues;)V", "getBenefitValues", "()Lcom/alightcreative/account/CloudBenefitValues;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloudStorageConfig {
    public static final int $stable = 8;
    private final CloudBenefitValues benefitValues;

    /* JADX WARN: Multi-variable type inference failed */
    public CloudStorageConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CloudStorageConfig copy$default(CloudStorageConfig cloudStorageConfig, CloudBenefitValues cloudBenefitValues, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cloudBenefitValues = cloudStorageConfig.benefitValues;
        }
        return cloudStorageConfig.copy(cloudBenefitValues);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CloudBenefitValues getBenefitValues() {
        return this.benefitValues;
    }

    public final CloudStorageConfig copy(CloudBenefitValues benefitValues) {
        return new CloudStorageConfig(benefitValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CloudStorageConfig) && Intrinsics.areEqual(this.benefitValues, ((CloudStorageConfig) other).benefitValues);
    }

    public int hashCode() {
        CloudBenefitValues cloudBenefitValues = this.benefitValues;
        if (cloudBenefitValues == null) {
            return 0;
        }
        return cloudBenefitValues.hashCode();
    }

    public String toString() {
        return "CloudStorageConfig(benefitValues=" + this.benefitValues + ")";
    }

    public CloudStorageConfig(CloudBenefitValues cloudBenefitValues) {
        this.benefitValues = cloudBenefitValues;
    }

    public final CloudBenefitValues getBenefitValues() {
        return this.benefitValues;
    }

    public /* synthetic */ CloudStorageConfig(CloudBenefitValues cloudBenefitValues, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : cloudBenefitValues);
    }
}
