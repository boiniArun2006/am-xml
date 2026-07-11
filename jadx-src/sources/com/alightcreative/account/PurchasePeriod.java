package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/account/PurchasePeriod;", "", "Lcom/alightcreative/account/PurchasePeriod$Unit;", "unit", "", JavetError.PARAMETER_COUNT, "<init>", "(Lcom/alightcreative/account/PurchasePeriod$Unit;I)V", "component1", "()Lcom/alightcreative/account/PurchasePeriod$Unit;", "component2", "()I", "copy", "(Lcom/alightcreative/account/PurchasePeriod$Unit;I)Lcom/alightcreative/account/PurchasePeriod;", "", "toString", "()Ljava/lang/String;", "hashCode", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/alightcreative/account/PurchasePeriod$Unit;", "getUnit", "I", "getCount", "Companion", "Unit", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchasePeriod {
    public static final int $stable = 0;
    private final int count;
    private final Unit unit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PurchasePeriod ONE_YEAR = new PurchasePeriod(Unit.Year, 1);
    private static final PurchasePeriod ONE_MONTH = new PurchasePeriod(Unit.Month, 1);
    private static final PurchasePeriod ONE_WEEK = new PurchasePeriod(Unit.Week, 1);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @JsonClass(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/alightcreative/account/PurchasePeriod$Unit;", "", "<init>", "(Ljava/lang/String;I)V", "Year", "Month", "Day", "Hour", "Minute", "Week", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unit {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Unit[] $VALUES;
        public static final Unit Year = new Unit("Year", 0);
        public static final Unit Month = new Unit("Month", 1);
        public static final Unit Day = new Unit("Day", 2);
        public static final Unit Hour = new Unit("Hour", 3);
        public static final Unit Minute = new Unit("Minute", 4);
        public static final Unit Week = new Unit("Week", 5);

        private static final /* synthetic */ Unit[] $values() {
            return new Unit[]{Year, Month, Day, Hour, Minute, Week};
        }

        public static EnumEntries<Unit> getEntries() {
            return $ENTRIES;
        }

        static {
            Unit[] unitArr$values = $values();
            $VALUES = unitArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(unitArr$values);
        }

        public static Unit valueOf(String str) {
            return (Unit) Enum.valueOf(Unit.class, str);
        }

        public static Unit[] values() {
            return (Unit[]) $VALUES.clone();
        }

        private Unit(String str, int i2) {
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.account.PurchasePeriod$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchasePeriod n() {
            return PurchasePeriod.ONE_MONTH;
        }

        public final PurchasePeriod rl() {
            return PurchasePeriod.ONE_WEEK;
        }

        public final PurchasePeriod t() {
            return PurchasePeriod.ONE_YEAR;
        }
    }

    public static /* synthetic */ PurchasePeriod copy$default(PurchasePeriod purchasePeriod, Unit unit, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            unit = purchasePeriod.unit;
        }
        if ((i3 & 2) != 0) {
            i2 = purchasePeriod.count;
        }
        return purchasePeriod.copy(unit, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Unit getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final PurchasePeriod copy(Unit unit, int count) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new PurchasePeriod(unit, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchasePeriod)) {
            return false;
        }
        PurchasePeriod purchasePeriod = (PurchasePeriod) other;
        return this.unit == purchasePeriod.unit && this.count == purchasePeriod.count;
    }

    public int hashCode() {
        return (this.unit.hashCode() * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        return "PurchasePeriod(unit=" + this.unit + ", count=" + this.count + ")";
    }

    public PurchasePeriod(Unit unit, int i2) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.count = i2;
    }

    public final int getCount() {
        return this.count;
    }

    public final Unit getUnit() {
        return this.unit;
    }
}
