package B7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface Q {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f248n;
        private final boolean rl;

        public /* synthetic */ j(long j2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return d2n.Ml.KN(this.f248n, jVar.f248n) && this.rl == jVar.rl;
        }

        private j(long j2, boolean z2) {
            this.f248n = j2;
            this.rl = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iQie = d2n.Ml.qie(this.f248n) * 31;
            boolean z2 = this.rl;
            ?? r12 = z2;
            if (z2) {
                r12 = 1;
            }
            return iQie + r12;
        }

        public String toString() {
            return "Indication(time=" + ((Object) d2n.Ml.ck(this.f248n)) + ", isLastFrame=" + this.rl + ')';
        }
    }

    void n(boolean z2);

    TFv.Wre nr();

    boolean rl();

    void t(boolean z2);
}
