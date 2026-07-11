package HI0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class rv6 {
    public static final List J2(List list, Collection indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        ArrayList arrayList = new ArrayList(list.size() - 1);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!indices.contains(Integer.valueOf(i2))) {
                arrayList.add(obj);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static final List O(List list, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() - 1);
        int i3 = 0;
        for (Object obj : list) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (i3 != i2) {
                arrayList.add(obj);
            }
            i3 = i5;
        }
        return arrayList;
    }

    public static final List Uo(List list, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.plus((Collection) CollectionsKt.drop(list, i2), (Iterable) CollectionsKt.take(list, i2));
    }

    public static final List n(List list, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(i2, obj);
        return arrayList;
    }

    public static final List nr(List list, Object obj, Object obj2) {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (obj == obj2 || (iIndexOf = list.indexOf(obj)) < 0) {
            return list;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(iIndexOf, obj2);
        return mutableList;
    }

    public static final List rl(List list, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        Object obj = list.get(i2);
        arrayList.addAll(list);
        arrayList.remove(i2);
        arrayList.add(i3, obj);
        return arrayList;
    }

    public static final List t(List list, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 < 0) {
            return list;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i2, obj);
        return mutableList;
    }
}
