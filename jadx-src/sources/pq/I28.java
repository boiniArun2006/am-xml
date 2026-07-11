package pq;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class I28 {
    public static final Ml n(j... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Ml ml = new Ml();
        for (j jVar : pairs) {
            jVar.n(ml);
        }
        return ml;
    }

    public static final w6 rl(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        w6 w6Var = new w6();
        for (Object obj : iterable) {
            if (obj instanceof Boolean) {
                w6Var.J2(((Boolean) obj).booleanValue());
            } else if (obj instanceof Number) {
                w6Var.rl((Number) obj);
            } else if (obj instanceof Character) {
                w6Var.n(((Character) obj).charValue());
            } else if (obj instanceof String) {
                w6Var.t((String) obj);
            } else if (obj instanceof List) {
                if (obj != null) {
                    w6Var.nr(rl((List) obj));
                }
            } else if ((obj instanceof Map) && obj != null) {
                w6Var.O(t((Map) obj));
            }
        }
        return w6Var;
    }

    public static final Ml t(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Ml ml = new Ml();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                ml.KN(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Number) {
                ml.nr(str, (Number) value);
            } else if (value instanceof Character) {
                ml.t(str, ((Character) value).charValue());
            } else if (value instanceof String) {
                ml.O(str, (String) value);
            } else if (value instanceof List) {
                if (value != null) {
                    ml.J2(str, rl((List) value));
                }
            } else if ((value instanceof Map) && value != null) {
                ml.Uo(str, t((Map) value));
            }
        }
        return ml;
    }
}
