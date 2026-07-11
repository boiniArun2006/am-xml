package WD;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 implements Ml {
    private final Object nr;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f11437t;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f11438n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f11438n, jVar.f11438n) && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public j(List categories, String str) {
            Intrinsics.checkNotNullParameter(categories, "categories");
            this.f11438n = categories;
            this.rl = str;
        }

        public int hashCode() {
            int iHashCode = this.f11438n.hashCode() * 31;
            String str = this.rl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OperationIdentifier(categories=" + this.f11438n + ", id=" + this.rl + ")";
        }
    }

    public CN3(Function0 timestampProvider) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        this.rl = timestampProvider;
        this.f11437t = new LinkedHashMap();
        this.nr = new Object();
    }

    @Override // WD.Ml
    public x0X.n n(List categories, String str) {
        x0X.n c1266n;
        Intrinsics.checkNotNullParameter(categories, "categories");
        synchronized (this.nr) {
            try {
                j jVar = new j(categories, str);
                Double d2 = (Double) this.f11437t.get(jVar);
                this.f11437t.put(jVar, this.rl.invoke());
                c1266n = d2 != null ? new n.C1266n(I28.f11439n) : new n.w6(Unit.INSTANCE);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1266n;
    }

    @Override // WD.Ml
    public x0X.n rl(List categories, String str) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        synchronized (this.nr) {
            j jVar = new j(categories, str);
            Double d2 = (Double) this.f11437t.get(jVar);
            if (d2 == null) {
                return new n.C1266n(Wre.f11441n);
            }
            double dDoubleValue = d2.doubleValue();
            this.f11437t.remove(jVar);
            return new n.w6(Double.valueOf(dDoubleValue));
        }
    }
}
