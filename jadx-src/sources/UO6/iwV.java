package UO6;

import com.alightcreative.app.motion.activities.w6O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class iwV {

    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((w6O) obj2).t()), Integer.valueOf(((w6O) obj).t()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rl(boolean z2) {
        Collection collectionEmptyList;
        Set<kPg.aC> setN = j.Pl.f69244n.n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setN, 10));
        for (kPg.aC aCVar : setN) {
            arrayList.add(aCVar.rl() != null ? new w6O(aCVar.t(), aCVar.t() + "p (" + aCVar.rl() + ")", null, 4, null) : new w6O(aCVar.t(), null, null, 6, null));
        }
        if (z2) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            Set<kPg.aC> setMinus = SetsKt.minus(ArraysKt.toSet(kPg.aC.values()), (Iterable) setN);
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setMinus, 10));
            for (kPg.aC aCVar2 : setMinus) {
                collectionEmptyList.add(new w6O(aCVar2.t(), aCVar2.t() + "p (No Video)", null, 4, null));
            }
        }
        return CollectionsKt.sortedWith(CollectionsKt.plus((Collection) arrayList, (Iterable) collectionEmptyList), new j());
    }
}
