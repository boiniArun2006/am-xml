package ICC;

import ICC.C;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f4092n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f4093t;

    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((Long) ((Pair) obj).getFirst(), (Long) ((Pair) obj2).getFirst());
        }
    }

    /* JADX INFO: renamed from: ICC.n$n, reason: collision with other inner class name */
    public static final class C0140n implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((Long) ((Pair) obj).getFirst(), (Long) ((Pair) obj2).getFirst());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f4092n, nVar.f4092n) && this.rl == nVar.rl;
    }

    public n(List tracks, int i2) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        this.f4092n = tracks;
        this.rl = i2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tracks, 10));
        Iterator it = tracks.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((C) it.next()).rl()));
        }
        if (CollectionsKt.distinct(arrayList).size() != this.f4092n.size()) {
            throw new IllegalArgumentException("Duplicate track ID detected");
        }
        this.f4093t = LazyKt.lazy(new Function0() { // from class: ICC.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.t(this.f4091n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qz t(n nVar) {
        List list = nVar.f4092n;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((C) obj).nr() == C.j.f4083n) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<C> list2 = (List) pair.component1();
        List<C> list3 = (List) pair.component2();
        ArrayList arrayList3 = new ArrayList();
        for (C c2 : list2) {
            CollectionsKt.addAll(arrayList3, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Long.valueOf(c2.t()), 1), TuplesKt.to(Long.valueOf(c2.n()), -1)}));
        }
        Iterator it = CollectionsKt.sortedWith(arrayList3, new j()).iterator();
        int iMax = 0;
        int iIntValue = 0;
        int iMax2 = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) ((Pair) it.next()).getSecond()).intValue();
            iMax2 = Math.max(iMax2, iIntValue);
        }
        ArrayList arrayList4 = new ArrayList();
        for (C c4 : list3) {
            CollectionsKt.addAll(arrayList4, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Long.valueOf(c4.t()), 1), TuplesKt.to(Long.valueOf(c4.n()), -1)}));
        }
        Iterator it2 = CollectionsKt.sortedWith(arrayList4, new C0140n()).iterator();
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            iIntValue2 += ((Number) ((Pair) it2.next()).getSecond()).intValue();
            iMax = Math.max(iMax, iIntValue2);
        }
        return new qz(list2.size(), iMax2, list3.size(), iMax);
    }

    public int hashCode() {
        return (this.f4092n.hashCode() * 31) + Integer.hashCode(this.rl);
    }

    public final qz rl() {
        return (qz) this.f4093t.getValue();
    }

    public String toString() {
        return "MediaComp(tracks=" + this.f4092n + ", framesPerHundredSeconds=" + this.rl + ")";
    }
}
