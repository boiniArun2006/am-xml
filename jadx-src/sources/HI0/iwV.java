package HI0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class iwV {
    public static final List n(M m2, Function2 mergeFunc) {
        Intrinsics.checkNotNullParameter(m2, "<this>");
        Intrinsics.checkNotNullParameter(mergeFunc, "mergeFunc");
        ArrayList arrayList = new ArrayList();
        for (Object obj : m2.n()) {
            Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) arrayList);
            if (objLastOrNull == null || !((Boolean) m2.rl().invoke(objLastOrNull, obj)).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList.set(CollectionsKt.getLastIndex(arrayList), mergeFunc.invoke(objLastOrNull, obj));
            }
        }
        return arrayList;
    }

    public static final M rl(Iterable iterable, Function2 predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new M(iterable, predicate);
    }
}
