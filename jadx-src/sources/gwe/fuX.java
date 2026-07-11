package gwe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f67915n;

    public final List nr(int i2, int i3) {
        IntRange intRangeUntil = RangesKt.until(0, i3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(n(((IntIterator) it).nextInt() + i2)));
        }
        return arrayList;
    }

    public final boolean t(int i2, int i3, int i5) {
        int iN = n(i5 + i2);
        return i2 < iN ? i2 <= i3 && i3 <= iN : (i2 <= i3 && i3 <= this.f67915n) || (i3 >= 0 && i3 <= iN);
    }

    public final int n(int i2) {
        int i3 = i2 % this.f67915n;
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3 + this.f67915n;
    }

    public final int rl() {
        return this.f67915n;
    }

    public fuX(int i2) {
        this.f67915n = i2;
    }
}
