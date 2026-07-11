package DSG;

import DSG.Wre;
import TFv.Lu;
import TFv.SPz;
import TFv.rv6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr implements fuX {
    private final SPz rl = Lu.n(CollectionsKt.emptyList());

    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(((aC) obj).n().nr(), ((aC) obj2).n().nr());
        }
    }

    @Override // DSG.fuX
    public void n(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        SPz sPz = this.rl;
        sPz.setValue(CollectionsKt.sortedWith(CollectionsKt.plus((Collection) sPz.getValue(), (Iterable) items), new j()));
    }

    @Override // DSG.fuX
    public Wre rl(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Iterable iterable = (Iterable) t().getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((aC) it.next()).n());
        }
        return nr(arrayList, id);
    }

    @Override // DSG.fuX
    public rv6 t() {
        return TFv.fuX.t(this.rl);
    }

    private final Wre nr(List list, String str) {
        Wre wreNr;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Wre wre = (Wre) it.next();
            if (Intrinsics.areEqual(wre.t(), str)) {
                return wre;
            }
            if ((wre instanceof Wre.Ml) && (wreNr = nr(((Wre.Ml) wre).O(), str)) != null) {
                return wreNr;
            }
        }
        return null;
    }
}
