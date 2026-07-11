package bV;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List nr(List list, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(function1.invoke(obj), obj);
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zD.j t(Exception exc) {
        return new zD.j(j.w6.f76395O, j.EnumC1290j.f76384o, j.n.J2, exc.getMessage(), exc);
    }
}
