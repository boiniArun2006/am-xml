package dC;

import as.CN3;
import as.Pl;
import as.fuX;
import as.qz;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements xkG.n {
    @Override // xkG.n
    public as.n n(as.n fragment) {
        ByteBuffer byteBufferO;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        int iNr = fragment.nr();
        if (iNr == 1) {
            ShortBuffer shortBufferRl = v9.n.rl(fragment.O());
            byteBufferO = v9.n.O(w9.w6.az(v9.n.KN(fragment.O()), 2), null, 2, null);
            int iT = as.w6.t(fragment);
            for (int i2 = 0; i2 < iT; i2++) {
                short s2 = shortBufferRl.get();
                byteBufferO.putShort(s2);
                byteBufferO.putShort(s2);
            }
            byteBufferO.position(0);
        } else if (iNr != 2) {
            ShortBuffer shortBufferRl2 = v9.n.rl(fragment.O());
            byteBufferO = v9.n.O(fuX.O(fuX.nr(as.w6.t(fragment), qz.rl(2)), as.j.f43098n.rl()), null, 2, null);
            int iT2 = as.w6.t(fragment);
            for (int i3 = 0; i3 < iT2; i3++) {
                IntRange intRangeUntil = RangesKt.until(0, fragment.nr());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    arrayList.add(Short.valueOf(shortBufferRl2.get()));
                }
                short sSumOfShort = (short) (CollectionsKt.sumOfShort(arrayList) / fragment.nr());
                byteBufferO.putShort(sSumOfShort);
                byteBufferO.putShort(sSumOfShort);
            }
            byteBufferO.position(0);
        } else {
            byteBufferO = fragment.O();
        }
        return new as.n(byteBufferO, new CN3(Pl.n(2), fragment.J2(), null));
    }

    @Override // xkG.n
    public as.n rl(as.n fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment.nr() == 1) {
            return fragment;
        }
        ShortBuffer shortBufferRl = v9.n.rl(fragment.O());
        ByteBuffer byteBufferO = v9.n.O(w9.w6.Uo(v9.n.KN(fragment.O()), fragment.nr()), null, 2, null);
        int iT = as.w6.t(fragment);
        for (int i2 = 0; i2 < iT; i2++) {
            IntRange intRangeUntil = RangesKt.until(0, fragment.nr());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(Short.valueOf(shortBufferRl.get()));
            }
            byteBufferO.putShort((short) (CollectionsKt.sumOfShort(arrayList) / fragment.nr()));
        }
        byteBufferO.position(0);
        return new as.n(byteBufferO, new CN3(Pl.n(1), fragment.J2(), null));
    }
}
