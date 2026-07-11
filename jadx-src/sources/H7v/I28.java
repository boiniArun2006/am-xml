package H7v;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {
    public static final Pair n(Ml closestPointsFor, long j2) {
        Intrinsics.checkNotNullParameter(closestPointsFor, "$this$closestPointsFor");
        Object objO = closestPointsFor.O(j2);
        Object obj = null;
        if (objO != null) {
            Wre wre = new Wre(j2, objO, null);
            return new Pair(wre, wre);
        }
        if (d2n.Ml.nr(j2, closestPointsFor.gh()) < 0) {
            Wre wreN = CN3.n((Map.Entry) CollectionsKt.first(closestPointsFor.entrySet()));
            return new Pair(wreN, wreN);
        }
        if (d2n.Ml.nr(j2, closestPointsFor.J2()) > 0) {
            Wre wreN2 = CN3.n((Map.Entry) CollectionsKt.last(closestPointsFor.entrySet()));
            return new Pair(wreN2, wreN2);
        }
        boolean z2 = false;
        for (Object obj2 : closestPointsFor.entrySet()) {
            if (d2n.Ml.nr(((d2n.Ml) ((Map.Entry) obj2).getKey()).Ik(), j2) < 0) {
                z2 = true;
                obj = obj2;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Wre wreN3 = CN3.n((Map.Entry) obj);
        for (Map.Entry entry : closestPointsFor.entrySet()) {
            if (d2n.Ml.nr(((d2n.Ml) entry.getKey()).Ik(), j2) > 0) {
                return new Pair(wreN3, CN3.n(entry));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final Ml rl(Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        SortedMap sortedMapSortedMapOf = MapsKt.sortedMapOf(new Pair[0]);
        for (Map.Entry entry : ml.entrySet()) {
            sortedMapSortedMapOf.put(entry.getValue(), entry.getKey());
        }
        return new Ml(sortedMapSortedMapOf);
    }

    public static final Ml t(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return new Ml(MapsKt.sortedMapOf((Pair[]) Arrays.copyOf(pairs, pairs.length)));
    }
}
