package v9;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CN3 {
    public static final List n(List list, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (Intrinsics.areEqual(obj, obj2)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj3 : list) {
            if (Intrinsics.areEqual(obj3, obj)) {
                obj3 = obj2;
            }
            arrayList.add(obj3);
        }
        return arrayList;
    }
}
