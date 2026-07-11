package v9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre {
    public static final Set n(Iterable iterable, Function1 transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : iterable) {
            Object objInvoke = transform.invoke(obj);
            List list = (List) linkedHashMap.get(objInvoke);
            if (list == null) {
                linkedHashMap.put(objInvoke, CollectionsKt.mutableListOf(obj));
            } else {
                list.add(obj);
            }
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (((List) obj2).size() > 1) {
                arrayList.add(obj2);
            }
        }
        return CollectionsKt.toSet(CollectionsKt.flatten(arrayList));
    }

    public static final boolean rl(Iterable iterable, Function1 transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (linkedHashSet.contains(objInvoke)) {
                return false;
            }
            linkedHashSet.add(objInvoke);
        }
        return true;
    }
}
