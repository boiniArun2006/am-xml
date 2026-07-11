package f04;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f64051n;

    public final Map n(int i2, int i3, int i5) {
        float fCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i5, 1), this.f64051n) * rl(i2), 0.0f);
        float f3 = i3;
        float fCoerceAtMost = f3 / RangesKt.coerceAtMost(fCoerceAtLeast, f3);
        int i7 = 0;
        IntRange intRangeUntil = RangesKt.until(0, i3);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10)), 16));
        for (Integer num : intRangeUntil) {
            int iIntValue = num.intValue();
            if (((int) (iIntValue % fCoerceAtMost)) == 0) {
                i7 = iIntValue;
            }
            linkedHashMap.put(num, Integer.valueOf(i7));
        }
        return linkedHashMap;
    }

    public final float rl(int i2) {
        return i2 / 1000.0f;
    }

    public w6(int i2) {
        this.f64051n = i2;
    }
}
