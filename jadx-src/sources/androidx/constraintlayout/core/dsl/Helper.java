package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Helper {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected static final Map f35067O;
    protected static final Map nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final String f35068n;
    protected HelperType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected Map f35069t;

    public static final class HelperType {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f35070n;

        public String toString() {
            return this.f35070n;
        }
    }

    public enum Type {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    static {
        HashMap map = new HashMap();
        nr = map;
        map.put(Constraint.Side.LEFT, "'left'");
        map.put(Constraint.Side.RIGHT, "'right'");
        map.put(Constraint.Side.TOP, "'top'");
        map.put(Constraint.Side.BOTTOM, "'bottom'");
        map.put(Constraint.Side.START, "'start'");
        map.put(Constraint.Side.END, "'end'");
        map.put(Constraint.Side.BASELINE, "'baseline'");
        HashMap map2 = new HashMap();
        f35067O = map2;
        map2.put(Type.VERTICAL_GUIDELINE, "vGuideline");
        map2.put(Type.HORIZONTAL_GUIDELINE, "hGuideline");
        map2.put(Type.VERTICAL_CHAIN, "vChain");
        map2.put(Type.HORIZONTAL_CHAIN, "hChain");
        map2.put(Type.BARRIER, "barrier");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f35068n + ":{\n");
        if (this.rl != null) {
            sb.append("type:'");
            sb.append(this.rl.toString());
            sb.append("',\n");
        }
        Map map = this.f35069t;
        if (map != null) {
            n(map, sb);
        }
        sb.append("},\n");
        return sb.toString();
    }

    public void n(Map map, StringBuilder sb) {
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(":");
                sb.append((String) map.get(str));
                sb.append(",\n");
            }
        }
    }
}
