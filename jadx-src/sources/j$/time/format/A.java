package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f69001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f69002b;

    A(Map map) {
        this.f69001a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l2 = (Long) entry2.getKey();
                int i2 = B.f69006d;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l2));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, B.f69004b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, B.f69004b);
        this.f69002b = map2;
    }

    final String a(long j2, TextStyle textStyle) {
        Map map = (Map) this.f69001a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j2));
        }
        return null;
    }

    final Iterator b(TextStyle textStyle) {
        List list = (List) this.f69002b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
