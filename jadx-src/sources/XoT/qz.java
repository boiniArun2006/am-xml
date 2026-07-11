package XoT;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class qz {
    public static final void O(List list, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object obj = list.get(i2);
        list.set(i2, list.get(i3));
        list.set(i3, obj);
    }

    public static final Object n(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return nr(list);
    }

    public static final Object nr(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public static final void rl(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        list.addLast(obj);
    }

    public static final Object t(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }
}
