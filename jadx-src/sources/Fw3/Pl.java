package Fw3;

import Hr.CQ.USEaHtCMH;
import gB.I28;
import gB.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Pl {

    static final class I28 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f3239n = new I28();

        I28() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final fuX invoke(MoG.fuX block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new fuX(block.rl(), gB.Wre.t((MoG.C) block.n()));
        }
    }

    public static final class Ml implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ gB.fuX f3240n;

        public Ml(gB.fuX fux) {
            this.f3240n = fux;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            fuX fux = (fuX) obj;
            fuX fux2 = (fuX) obj2;
            return ComparisonsKt.compareValues(d2n.Ml.rl(d2n.Ml.ty(fux.n().O(), bK.j.O(this.f3240n.n(fux.rl())))), d2n.Ml.rl(d2n.Ml.ty(fux2.n().O(), bK.j.O(this.f3240n.n(fux2.rl())))));
        }
    }

    static final class Wre extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f3241n = new Wre();

        Wre() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final gB.I28 invoke(fuX it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.rl();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f3242n = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final MoG.C invoke(MoG.fuX fux) {
            Intrinsics.checkNotNullParameter(fux, USEaHtCMH.dbyCR);
            return (MoG.C) fux.n();
        }
    }

    static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f3243n = new n();

        n() {
            super(1);
        }

        public final I28.n n(MoG.Pl it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return gB.Wre.rl(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.j.n(obj);
            return n(null);
        }
    }

    public static final class w6 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f3244n = new w6();

        public w6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final j.C0937j n(gB.fuX drawableTextureRequestFor, Z4.n slice, Z4.n nVar, long j2, boolean z2) {
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(drawableTextureRequestFor, "$this$drawableTextureRequestFor");
        Intrinsics.checkNotNullParameter(slice, "slice");
        Sequence sequenceFilter = SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(slice.n()), j.f3242n), w6.f3244n);
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Set set = SequencesKt.toSet(SequencesKt.map(sequenceFilter, n.f3243n));
        Set setN = slice.n();
        ArrayList<MoG.fuX> arrayList = new ArrayList();
        Iterator it = setN.iterator();
        while (true) {
            MoG.fuX fux = null;
            if (!it.hasNext()) {
                break;
            }
            MoG.fuX fux2 = (MoG.fuX) it.next();
            if (fux2.n() instanceof MoG.n) {
                Intrinsics.checkNotNull(fux2, "null cannot be cast to non-null type com.bendingspoons.fellini.fmfoundation.domain.FMCompositionBlock<T of com.bendingspoons.fellini.fmfoundation.domain.FMCompositionBlockKt.withItemOrNull>");
                fux = fux2;
            }
            if (fux != null) {
                arrayList.add(fux);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (MoG.fuX fux3 : arrayList) {
            Pair pair = TuplesKt.to(gB.Wre.n((MoG.n) fux3.n()), d2n.Ml.rl(bK.n.rl(slice.O(), fux3.rl().O(), ((MoG.n) fux3.n()).t().O(), ((MoG.n) fux3.n()).nr())));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Set setEmptySet = (z2 || nVar == null) ? SetsKt.emptySet() : rl(drawableTextureRequestFor, Z4.w6.n(nVar, j2));
        if (nVar != null) {
            Set<MoG.fuX> setN2 = nVar.n();
            ArrayList<MoG.fuX> arrayList2 = new ArrayList();
            for (MoG.fuX fux4 : setN2) {
                if (fux4.n() instanceof MoG.n) {
                    Intrinsics.checkNotNull(fux4, "null cannot be cast to non-null type com.bendingspoons.fellini.fmfoundation.domain.FMCompositionBlock<T of com.bendingspoons.fellini.fmfoundation.domain.FMCompositionBlockKt.withItemOrNull>");
                } else {
                    fux4 = null;
                }
                if (fux4 != null) {
                    arrayList2.add(fux4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (MoG.fuX fux5 : arrayList2) {
                I28.j jVarN = gB.Wre.n((MoG.n) fux5.n());
                Pair pair2 = (setEmptySet.contains(jVarN) || linkedHashMap.containsKey(jVarN)) ? TuplesKt.to(jVarN, d2n.Ml.rl(bK.n.rl(nVar.O(), fux5.rl().O(), ((MoG.n) fux5.n()).t().O(), ((MoG.n) fux5.n()).nr()))) : null;
                if (pair2 != null) {
                    arrayList3.add(pair2);
                }
            }
            mapEmptyMap = MapsKt.toMap(arrayList3);
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
        }
        return new j.C0937j(linkedHashMap, set, setEmptySet, mapEmptyMap);
    }

    private static final Set rl(gB.fuX fux, Z4.j jVar) {
        return SequencesKt.toSet(SequencesKt.distinct(SequencesKt.map(SequencesKt.sortedWith(SequencesKt.map(CollectionsKt.asSequence(jVar.n()), I28.f3239n), new Ml(fux)), Wre.f3241n)));
    }
}
