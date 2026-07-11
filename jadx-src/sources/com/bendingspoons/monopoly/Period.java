package com.bendingspoons.monopoly;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/bendingspoons/monopoly/Period;", "", "value", "", "timeUnit", "Lcom/bendingspoons/monopoly/PeriodTimeUnit;", "<init>", "(ILcom/bendingspoons/monopoly/PeriodTimeUnit;)V", "getValue", "()I", "getTimeUnit", "()Lcom/bendingspoons/monopoly/PeriodTimeUnit;", "isSingleValue", "", "()Z", "component1", "component2", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Period {
    public static final int $stable = 0;
    private final PeriodTimeUnit timeUnit;
    private final int value;

    public static /* synthetic */ Period copy$default(Period period, int i2, PeriodTimeUnit periodTimeUnit, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = period.value;
        }
        if ((i3 & 2) != 0) {
            periodTimeUnit = period.timeUnit;
        }
        return period.copy(i2, periodTimeUnit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PeriodTimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public final Period copy(int value, PeriodTimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return new Period(value, timeUnit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Period)) {
            return false;
        }
        Period period = (Period) other;
        return this.value == period.value && this.timeUnit == period.timeUnit;
    }

    public int hashCode() {
        return (Integer.hashCode(this.value) * 31) + this.timeUnit.hashCode();
    }

    public String toString() {
        return "Period(value=" + this.value + ", timeUnit=" + this.timeUnit + ")";
    }

    public Period(int i2, PeriodTimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.value = i2;
        this.timeUnit = timeUnit;
    }

    public final PeriodTimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isSingleValue() {
        return this.value == 1;
    }
}
