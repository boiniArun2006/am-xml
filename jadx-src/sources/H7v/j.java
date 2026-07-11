package H7v;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0130j f3795O = new C0130j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f3796n;
    private final Ml nr;
    private final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f3797t;

    /* JADX INFO: renamed from: H7v.j$j, reason: collision with other inner class name */
    public static final class C0130j {
        public /* synthetic */ C0130j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0130j() {
        }

        public final j n(double d2) {
            return new j(I28.t(TuplesKt.to(d2n.Ml.rl(d2n.Ml.f63370t.J2()), Double.valueOf(d2))), w6.NONE);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f3796n, jVar.f3796n) && this.rl == jVar.rl;
    }

    public j(Ml points, w6 interpolationType) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(interpolationType, "interpolationType");
        this.f3796n = points;
        this.rl = interpolationType;
        if (!points.isEmpty()) {
            Iterator it = points.entrySet().iterator();
            while (it.hasNext()) {
                if (((Number) ((Map.Entry) it.next()).getValue()).doubleValue() <= 0.0d) {
                    Ml ml = this.f3796n;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ml.entrySet()) {
                        if (((Number) entry.getValue()).doubleValue() <= 0.0d) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    throw new IllegalArgumentException(("All speed points must have a speed value greater than 0. Found: " + linkedHashMap).toString());
                }
            }
        }
        Ml mlJ2 = n.J2(this);
        this.f3797t = mlJ2;
        this.nr = I28.rl(mlJ2);
    }

    public int hashCode() {
        return (this.f3796n.hashCode() * 31) + this.rl.hashCode();
    }

    public final w6 n() {
        return this.rl;
    }

    public final Ml nr() {
        return this.nr;
    }

    public final Ml rl() {
        return this.f3797t;
    }

    public final Ml t() {
        return this.f3796n;
    }

    public String toString() {
        return "FMSpeedFunction(points=" + this.f3796n + ", interpolationType=" + this.rl + ')';
    }
}
