package com.bendingspoons.monopoly;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/monopoly/PeriodTimeUnit;", "", "<init>", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "YEAR", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PeriodTimeUnit {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PeriodTimeUnit[] $VALUES;

    @Json(name = "day")
    public static final PeriodTimeUnit DAY = new PeriodTimeUnit("DAY", 0);

    @Json(name = "week")
    public static final PeriodTimeUnit WEEK = new PeriodTimeUnit("WEEK", 1);

    @Json(name = "month")
    public static final PeriodTimeUnit MONTH = new PeriodTimeUnit("MONTH", 2);

    @Json(name = "year")
    public static final PeriodTimeUnit YEAR = new PeriodTimeUnit("YEAR", 3);

    private static final /* synthetic */ PeriodTimeUnit[] $values() {
        return new PeriodTimeUnit[]{DAY, WEEK, MONTH, YEAR};
    }

    public static EnumEntries<PeriodTimeUnit> getEntries() {
        return $ENTRIES;
    }

    static {
        PeriodTimeUnit[] periodTimeUnitArr$values = $values();
        $VALUES = periodTimeUnitArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(periodTimeUnitArr$values);
    }

    public static PeriodTimeUnit valueOf(String str) {
        return (PeriodTimeUnit) Enum.valueOf(PeriodTimeUnit.class, str);
    }

    public static PeriodTimeUnit[] values() {
        return (PeriodTimeUnit[]) $VALUES.clone();
    }

    private PeriodTimeUnit(String str, int i2) {
    }
}
