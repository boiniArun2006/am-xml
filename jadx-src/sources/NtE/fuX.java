package NtE;

import Q6.aC;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class fuX {
    public static final aC nr(MoG.I28 toSoundInstruction, d2n.Wre rangeInTimeline, d2n.Wre itemRange, long j2) {
        Intrinsics.checkNotNullParameter(toSoundInstruction, "$this$toSoundInstruction");
        Intrinsics.checkNotNullParameter(rangeInTimeline, "rangeInTimeline");
        Intrinsics.checkNotNullParameter(itemRange, "itemRange");
        return new aC(toSoundInstruction.n(), rl(toSoundInstruction, itemRange, toSoundInstruction.t().n(), bK.j.J2(j2)), rangeInTimeline, null);
    }

    private static final float n(float f3) {
        double d2 = ((double) 0.05f) - 1.0E-4d;
        double d4 = ((double) 50.0f) + 1.0E-4d;
        double d5 = f3;
        if (d2 <= d5 && d5 <= d4) {
            return RangesKt.coerceIn(f3, 0.05f, 50.0f);
        }
        throw new IllegalStateException(("Value " + f3 + " must be in range [" + d2 + ", " + d4 + ']').toString());
    }

    private static final List rl(MoG.I28 i28, d2n.Wre wre, sz.n nVar, long j2) {
        List<d2n.Wre> list = SequencesKt.toList(d2n.CN3.n(wre, j2));
        d2n.Wre wreT = bK.w6.t(wre, i28.nr().O(), i28.O());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (d2n.Wre wre2 : list) {
            d2n.Wre wreT2 = bK.w6.t(wre2, i28.nr().O(), i28.O());
            arrayList.add(new Q6.CN3(d2n.CN3.xMQ(wreT, wreT2.O()), new xkG.j(nVar.n(wre2.O()), nVar.n(wre2.nr())), n(t(i28, wre2))));
        }
        return CollectionsKt.toList(arrayList);
    }

    private static final float t(MoG.I28 i28, d2n.Wre wre) {
        if (!d2n.j.r(wre.t())) {
            return bK.w6.t(wre, i28.nr().O(), i28.O()).t() / wre.t();
        }
        throw new IllegalArgumentException("Range duration must be positive, but is zero.");
    }
}
