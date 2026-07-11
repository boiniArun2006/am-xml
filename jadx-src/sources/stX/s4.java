package stX;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import stX.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class s4 extends I28 {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final j f73380O;
    private final Integer nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f73381t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(Integer num, Integer num2, j setter, String name, boolean z2) {
        super(Intrinsics.areEqual(num, num2) ? num : null, name, null);
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f73381t = num;
        this.nr = num2;
        this.f73380O = setter;
        this.J2 = z2;
        if (rl() == null || new IntRange(1, 9).contains(rl().intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + t() + ": " + rl()).toString());
    }

    @Override // stX.I28
    public CN3 n(Object obj, CharSequence input, int i2, int i3) {
        Intrinsics.checkNotNullParameter(input, "input");
        Integer num = this.nr;
        if (num != null && i3 - i2 > num.intValue()) {
            return new CN3.Ml(this.nr.intValue());
        }
        Integer num2 = this.f73381t;
        if (num2 != null && i3 - i2 < num2.intValue()) {
            return new CN3.w6(this.f73381t.intValue());
        }
        Integer numO = Wre.O(input, i2, i3);
        if (numO == null) {
            return CN3.n.f73346n;
        }
        j jVar = this.f73380O;
        boolean z2 = this.J2;
        int iIntValue = numO.intValue();
        if (z2) {
            iIntValue = -iIntValue;
        }
        return Wre.J2(jVar, obj, Integer.valueOf(iIntValue));
    }
}
