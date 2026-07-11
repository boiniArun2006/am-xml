package com.alightcreative.monorepo.settings;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/alightcreative/monorepo/settings/StackedIntroOffersEntity;", "Landroid/os/Parcelable;", "isEnabled", "", "weeklyProductId", "", "weeklyNoTrialProductId", "yearlyProductId", "yearlyNoTrialProductId", "treatment", "Lcom/alightcreative/monorepo/settings/StackedIntroOffersEntity$Treatment;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alightcreative/monorepo/settings/StackedIntroOffersEntity$Treatment;)V", "()Z", "getWeeklyProductId", "()Ljava/lang/String;", "getWeeklyNoTrialProductId", "getYearlyProductId", "getYearlyNoTrialProductId", "getTreatment", "()Lcom/alightcreative/monorepo/settings/StackedIntroOffersEntity$Treatment;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Treatment", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StackedIntroOffersEntity implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<StackedIntroOffersEntity> CREATOR = new j();
    private final boolean isEnabled;
    private final Treatment treatment;
    private final String weeklyNoTrialProductId;
    private final String weeklyProductId;
    private final String yearlyNoTrialProductId;
    private final String yearlyProductId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/monorepo/settings/StackedIntroOffersEntity$Treatment;", "", "<init>", "(Ljava/lang/String;I)V", "SIMPLE_STACKED_INTRO_OFFERS", "TIMELINE_INTRO_OFFER", "TIMELINE_NO_INTRO_OFFER", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Treatment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Treatment[] $VALUES;

        @Json(name = "simple_stacked_intro_offers")
        public static final Treatment SIMPLE_STACKED_INTRO_OFFERS = new Treatment("SIMPLE_STACKED_INTRO_OFFERS", 0);

        @Json(name = "timeline_intro_offer")
        public static final Treatment TIMELINE_INTRO_OFFER = new Treatment("TIMELINE_INTRO_OFFER", 1);

        @Json(name = "timeline_no_intro_offer")
        public static final Treatment TIMELINE_NO_INTRO_OFFER = new Treatment("TIMELINE_NO_INTRO_OFFER", 2);

        private static final /* synthetic */ Treatment[] $values() {
            return new Treatment[]{SIMPLE_STACKED_INTRO_OFFERS, TIMELINE_INTRO_OFFER, TIMELINE_NO_INTRO_OFFER};
        }

        public static EnumEntries<Treatment> getEntries() {
            return $ENTRIES;
        }

        static {
            Treatment[] treatmentArr$values = $values();
            $VALUES = treatmentArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(treatmentArr$values);
        }

        public static Treatment valueOf(String str) {
            return (Treatment) Enum.valueOf(Treatment.class, str);
        }

        public static Treatment[] values() {
            return (Treatment[]) $VALUES.clone();
        }

        private Treatment(String str, int i2) {
        }
    }

    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final StackedIntroOffersEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StackedIntroOffersEntity(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Treatment.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final StackedIntroOffersEntity[] newArray(int i2) {
            return new StackedIntroOffersEntity[i2];
        }
    }

    public static /* synthetic */ StackedIntroOffersEntity copy$default(StackedIntroOffersEntity stackedIntroOffersEntity, boolean z2, String str, String str2, String str3, String str4, Treatment treatment, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = stackedIntroOffersEntity.isEnabled;
        }
        if ((i2 & 2) != 0) {
            str = stackedIntroOffersEntity.weeklyProductId;
        }
        if ((i2 & 4) != 0) {
            str2 = stackedIntroOffersEntity.weeklyNoTrialProductId;
        }
        if ((i2 & 8) != 0) {
            str3 = stackedIntroOffersEntity.yearlyProductId;
        }
        if ((i2 & 16) != 0) {
            str4 = stackedIntroOffersEntity.yearlyNoTrialProductId;
        }
        if ((i2 & 32) != 0) {
            treatment = stackedIntroOffersEntity.treatment;
        }
        String str5 = str4;
        Treatment treatment2 = treatment;
        return stackedIntroOffersEntity.copy(z2, str, str2, str3, str5, treatment2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWeeklyProductId() {
        return this.weeklyProductId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWeeklyNoTrialProductId() {
        return this.weeklyNoTrialProductId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getYearlyProductId() {
        return this.yearlyProductId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getYearlyNoTrialProductId() {
        return this.yearlyNoTrialProductId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Treatment getTreatment() {
        return this.treatment;
    }

    public final StackedIntroOffersEntity copy(@Json(name = "is_enabled") boolean isEnabled, @Json(name = "weekly_product_id") String weeklyProductId, @Json(name = "weekly_no_trial_product_id") String weeklyNoTrialProductId, @Json(name = "yearly_product_id") String yearlyProductId, @Json(name = "yearly_no_trial_product_id") String yearlyNoTrialProductId, @Json(name = "treatment") Treatment treatment) {
        Intrinsics.checkNotNullParameter(weeklyProductId, "weeklyProductId");
        Intrinsics.checkNotNullParameter(weeklyNoTrialProductId, "weeklyNoTrialProductId");
        Intrinsics.checkNotNullParameter(yearlyProductId, "yearlyProductId");
        Intrinsics.checkNotNullParameter(yearlyNoTrialProductId, "yearlyNoTrialProductId");
        Intrinsics.checkNotNullParameter(treatment, "treatment");
        return new StackedIntroOffersEntity(isEnabled, weeklyProductId, weeklyNoTrialProductId, yearlyProductId, yearlyNoTrialProductId, treatment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StackedIntroOffersEntity)) {
            return false;
        }
        StackedIntroOffersEntity stackedIntroOffersEntity = (StackedIntroOffersEntity) other;
        return this.isEnabled == stackedIntroOffersEntity.isEnabled && Intrinsics.areEqual(this.weeklyProductId, stackedIntroOffersEntity.weeklyProductId) && Intrinsics.areEqual(this.weeklyNoTrialProductId, stackedIntroOffersEntity.weeklyNoTrialProductId) && Intrinsics.areEqual(this.yearlyProductId, stackedIntroOffersEntity.yearlyProductId) && Intrinsics.areEqual(this.yearlyNoTrialProductId, stackedIntroOffersEntity.yearlyNoTrialProductId) && this.treatment == stackedIntroOffersEntity.treatment;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isEnabled) * 31) + this.weeklyProductId.hashCode()) * 31) + this.weeklyNoTrialProductId.hashCode()) * 31) + this.yearlyProductId.hashCode()) * 31) + this.yearlyNoTrialProductId.hashCode()) * 31) + this.treatment.hashCode();
    }

    public String toString() {
        return "StackedIntroOffersEntity(isEnabled=" + this.isEnabled + ", weeklyProductId=" + this.weeklyProductId + ", weeklyNoTrialProductId=" + this.weeklyNoTrialProductId + ", yearlyProductId=" + this.yearlyProductId + ", yearlyNoTrialProductId=" + this.yearlyNoTrialProductId + ", treatment=" + this.treatment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeString(this.weeklyProductId);
        dest.writeString(this.weeklyNoTrialProductId);
        dest.writeString(this.yearlyProductId);
        dest.writeString(this.yearlyNoTrialProductId);
        dest.writeString(this.treatment.name());
    }

    public StackedIntroOffersEntity(@Json(name = "is_enabled") boolean z2, @Json(name = "weekly_product_id") String weeklyProductId, @Json(name = "weekly_no_trial_product_id") String weeklyNoTrialProductId, @Json(name = "yearly_product_id") String yearlyProductId, @Json(name = "yearly_no_trial_product_id") String yearlyNoTrialProductId, @Json(name = "treatment") Treatment treatment) {
        Intrinsics.checkNotNullParameter(weeklyProductId, "weeklyProductId");
        Intrinsics.checkNotNullParameter(weeklyNoTrialProductId, "weeklyNoTrialProductId");
        Intrinsics.checkNotNullParameter(yearlyProductId, "yearlyProductId");
        Intrinsics.checkNotNullParameter(yearlyNoTrialProductId, "yearlyNoTrialProductId");
        Intrinsics.checkNotNullParameter(treatment, "treatment");
        this.isEnabled = z2;
        this.weeklyProductId = weeklyProductId;
        this.weeklyNoTrialProductId = weeklyNoTrialProductId;
        this.yearlyProductId = yearlyProductId;
        this.yearlyNoTrialProductId = yearlyNoTrialProductId;
        this.treatment = treatment;
    }

    public final Treatment getTreatment() {
        return this.treatment;
    }

    public final String getWeeklyNoTrialProductId() {
        return this.weeklyNoTrialProductId;
    }

    public final String getWeeklyProductId() {
        return this.weeklyProductId;
    }

    public final String getYearlyNoTrialProductId() {
        return this.yearlyNoTrialProductId;
    }

    public final String getYearlyProductId() {
        return this.yearlyProductId;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }
}
