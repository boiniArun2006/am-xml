package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Chain extends Helper {
    protected static final Map J2;

    public class Anchor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Constraint.Anchor f35023n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35024t;

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            if (this.f35023n != null) {
                sb.append("'");
                sb.append(this.f35023n.rl());
                sb.append("',");
                sb.append("'");
                sb.append(this.f35023n.f35041n.toString().toLowerCase());
                sb.append("'");
            }
            if (this.rl != 0) {
                sb.append(",");
                sb.append(this.rl);
            }
            if (this.f35024t != Integer.MIN_VALUE) {
                if (this.rl == 0) {
                    sb.append(",0,");
                    sb.append(this.f35024t);
                } else {
                    sb.append(",");
                    sb.append(this.f35024t);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public enum Style {
        PACKED,
        SPREAD,
        SPREAD_INSIDE
    }

    static {
        HashMap map = new HashMap();
        J2 = map;
        map.put(Style.SPREAD, "'spread'");
        map.put(Style.SPREAD_INSIDE, "'spread_inside'");
        map.put(Style.PACKED, "'packed'");
    }
}
