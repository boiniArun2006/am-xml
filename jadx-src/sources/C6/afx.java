package C6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class afx {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J2(int i2, kO4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.t() == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long O(List list) {
        Intrinsics.checkNotNullParameter(list, "<destruct>");
        return ((kO4) list.get(1)).n() - ((kO4) list.get(0)).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Uo(List list) {
        Intrinsics.checkNotNullParameter(list, "<destruct>");
        return ((kO4) list.get(1)).n() - ((kO4) list.get(0)).n();
    }

    public static final Q nr(r rVar) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        int i2;
        long j2;
        Long lValueOf5;
        int i3;
        int i5;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(rVar2, "<this>");
        Iterator it = rVar2.J2().iterator();
        if (it.hasNext()) {
            lValueOf = Long.valueOf(((kO4) it.next()).rl());
            while (it.hasNext()) {
                Long lValueOf6 = Long.valueOf(((kO4) it.next()).rl());
                if (lValueOf.compareTo(lValueOf6) > 0) {
                    lValueOf = lValueOf6;
                }
            }
        } else {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : -1L;
        Iterator it2 = rVar2.J2().iterator();
        if (it2.hasNext()) {
            lValueOf2 = Long.valueOf(((kO4) it2.next()).rl());
            while (it2.hasNext()) {
                Long lValueOf7 = Long.valueOf(((kO4) it2.next()).rl());
                if (lValueOf2.compareTo(lValueOf7) < 0) {
                    lValueOf2 = lValueOf7;
                }
            }
        } else {
            lValueOf2 = null;
        }
        long jLongValue2 = lValueOf2 != null ? lValueOf2.longValue() : -1L;
        int size = rVar2.J2().size();
        IntRange intRange = new IntRange(0, rVar2.O().O());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it3 = intRange.iterator();
        while (it3.hasNext()) {
            int iNextInt = ((IntIterator) it3).nextInt();
            List listJ2 = rVar2.J2();
            if (listJ2 == null || !listJ2.isEmpty()) {
                Iterator it4 = listJ2.iterator();
                i5 = 0;
                while (it4.hasNext()) {
                    if (((kO4) it4.next()).t() == iNextInt && (i5 = i5 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            } else {
                i5 = 0;
            }
            arrayList.add(Integer.valueOf(i5));
        }
        IntRange intRange2 = new IntRange(0, rVar2.O().O());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange2, 10));
        Iterator<Integer> it5 = intRange2.iterator();
        while (it5.hasNext()) {
            final int iNextInt2 = ((IntIterator) it5).nextInt();
            arrayList2.add(Integer.valueOf((int) SequencesKt.averageOfLong(SequencesKt.map(SequencesKt.windowed$default(SequencesKt.filter(CollectionsKt.asSequence(rVar2.J2()), new Function1() { // from class: C6.SPz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(afx.J2(iNextInt2, (kO4) obj));
                }
            }), 2, 1, false, 4, null), new Function1() { // from class: C6.ci
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(afx.Uo((List) obj));
                }
            }))));
        }
        IntRange intRange3 = new IntRange(0, rVar2.O().O());
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange3, 10));
        Iterator<Integer> it6 = intRange3.iterator();
        while (it6.hasNext()) {
            int iNextInt3 = ((IntIterator) it6).nextInt();
            Iterator it7 = rVar2.J2().iterator();
            if (it7.hasNext()) {
                lValueOf5 = Long.valueOf(((kO4) it7.next()).rl());
                while (it7.hasNext()) {
                    Long lValueOf8 = Long.valueOf(((kO4) it7.next()).rl());
                    if (lValueOf5.compareTo(lValueOf8) > 0) {
                        lValueOf5 = lValueOf8;
                    }
                }
            } else {
                lValueOf5 = null;
            }
            long jLongValue3 = lValueOf5 != null ? lValueOf5.longValue() : -1L;
            long jJ2 = ((long) (iNextInt3 * rVar2.O().J2())) * 1000000;
            List listJ22 = rVar2.J2();
            if (listJ22 == null || !listJ22.isEmpty()) {
                Iterator it8 = listJ22.iterator();
                i3 = 0;
                while (it8.hasNext()) {
                    if (((kO4) it8.next()).rl() >= jJ2 + jLongValue3 && (i3 = i3 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            } else {
                i3 = 0;
            }
            arrayList3.add(Integer.valueOf(i3));
        }
        IntRange intRange4 = new IntRange(0, rVar2.O().O());
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange4, 10));
        Iterator<Integer> it9 = intRange4.iterator();
        while (it9.hasNext()) {
            int iNextInt4 = ((IntIterator) it9).nextInt();
            Iterator it10 = rVar2.J2().iterator();
            if (it10.hasNext()) {
                lValueOf4 = Long.valueOf(((kO4) it10.next()).rl());
                while (it10.hasNext()) {
                    Long lValueOf9 = Long.valueOf(((kO4) it10.next()).rl());
                    if (lValueOf4.compareTo(lValueOf9) > 0) {
                        lValueOf4 = lValueOf9;
                    }
                }
            } else {
                lValueOf4 = null;
            }
            long jLongValue4 = lValueOf4 != null ? lValueOf4.longValue() : -1L;
            long jJ22 = ((long) (rVar2.O().J2() * iNextInt4)) * 1000000;
            Iterator<Integer> it11 = it9;
            long jJ23 = ((long) ((iNextInt4 + 1) * rVar2.O().J2())) * 1000000;
            List<kO4> listJ23 = rVar.J2();
            if (listJ23 == null || !listJ23.isEmpty()) {
                i2 = 0;
                for (kO4 ko4 : listJ23) {
                    if (ko4.rl() < jJ22 + jLongValue4 || ko4.rl() > jJ23 + jLongValue4) {
                        j2 = jJ23;
                    } else {
                        j2 = jJ23;
                        if (ko4.t() == iNextInt4 && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                    jJ23 = j2;
                }
            } else {
                i2 = 0;
            }
            arrayList4.add(Integer.valueOf(i2));
            it9 = it11;
            rVar2 = rVar;
        }
        IntRange intRange5 = new IntRange(0, rVar.O().O());
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange5, 10));
        Iterator<Integer> it12 = intRange5.iterator();
        while (it12.hasNext()) {
            int iNextInt5 = ((IntIterator) it12).nextInt();
            Iterator it13 = rVar.J2().iterator();
            if (it13.hasNext()) {
                lValueOf3 = Long.valueOf(((kO4) it13.next()).rl());
                while (it13.hasNext()) {
                    Long lValueOf10 = Long.valueOf(((kO4) it13.next()).rl());
                    if (lValueOf3.compareTo(lValueOf10) > 0) {
                        lValueOf3 = lValueOf10;
                    }
                }
            } else {
                lValueOf3 = null;
            }
            long jLongValue5 = lValueOf3 != null ? lValueOf3.longValue() : -1L;
            long jJ24 = ((long) (rVar.O().J2() * iNextInt5)) * 1000000;
            Iterator<Integer> it14 = it12;
            ArrayList arrayList6 = arrayList3;
            ArrayList arrayList7 = arrayList4;
            long jJ25 = ((long) ((iNextInt5 + 1) * rVar.O().J2())) * 1000000;
            List listJ24 = rVar.J2();
            ArrayList arrayList8 = new ArrayList();
            for (Object obj : listJ24) {
                long j3 = jJ25;
                kO4 ko42 = (kO4) obj;
                if (ko42.rl() >= jJ24 + jLongValue5 && ko42.rl() <= j3 + jLongValue5 && ko42.t() == iNextInt5) {
                    arrayList8.add(obj);
                }
                jJ25 = j3;
            }
            arrayList5.add(Integer.valueOf((int) SequencesKt.averageOfLong(SequencesKt.map(SequencesKt.windowed$default(CollectionsKt.asSequence(arrayList8), 2, 1, false, 4, null), new Function1() { // from class: C6.g9s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Long.valueOf(afx.O((List) obj2));
                }
            }))));
            arrayList3 = arrayList6;
            arrayList4 = arrayList7;
            it12 = it14;
        }
        return new Q(jLongValue, jLongValue2, size, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }
}
