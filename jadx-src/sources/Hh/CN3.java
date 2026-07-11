package Hh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class CN3 extends HashMap {
    public static Map of(Object obj, Object obj2) {
        HashMap map = new HashMap(1);
        map.put(obj, obj2);
        return Collections.unmodifiableMap(map);
    }

    public static CN3 t(Map map) {
        return new CN3(map);
    }

    private CN3(Map map) {
        super(map);
    }

    public static Map of(Object obj, Object obj2, Object obj3, Object obj4) {
        HashMap map = new HashMap(2);
        map.put(obj, obj2);
        map.put(obj3, obj4);
        return Collections.unmodifiableMap(map);
    }
}
