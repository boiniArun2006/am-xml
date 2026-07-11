package OB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C;
import kotlinx.serialization.json.Dsr;
import kotlinx.serialization.json.nKK;
import kotlinx.serialization.json.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {
    public static final Dsr n(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Map) {
                arrayList.add(rl((Map) next));
            } else if (next instanceof Collection) {
                arrayList.add(n((Collection) next));
            } else if (next instanceof Boolean) {
                arrayList.add(C.n((Boolean) next));
            } else if (next instanceof Number) {
                arrayList.add(C.rl((Number) next));
            } else {
                arrayList.add(C.t(next != null ? next.toString() : null));
            }
        }
        return new w6(arrayList);
    }

    public static final Dsr rl(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                if (value instanceof Map) {
                    linkedHashMap.put(key, rl((Map) value));
                } else if (value instanceof Collection) {
                    linkedHashMap.put(key, n((Collection) value));
                } else if (value instanceof Boolean) {
                    linkedHashMap.put(key, C.n((Boolean) value));
                } else if (value instanceof Number) {
                    linkedHashMap.put(key, C.rl((Number) value));
                } else {
                    linkedHashMap.put(key, C.t(value != null ? value.toString() : null));
                }
            }
        }
        return new nKK(linkedHashMap);
    }
}
