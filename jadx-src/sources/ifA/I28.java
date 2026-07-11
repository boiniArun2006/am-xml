package ifA;

import ep.oxM.esLNYym;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface I28 {

    public static final class j implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f68130n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "Skip";
        }

        private j() {
        }

        public int hashCode() {
            return 171201022;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class n implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68131n;
        private final Long nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f68132t;

        public n(String userId, List list, boolean z2, Long l2) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(list, esLNYym.mIFcwQdDUzBnZ);
            this.f68131n = userId;
            this.rl = list;
            this.f68132t = z2;
            this.nr = l2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f68131n, nVar.f68131n) && Intrinsics.areEqual(this.rl, nVar.rl) && this.f68132t == nVar.f68132t && Intrinsics.areEqual(this.nr, nVar.nr);
        }

        public int hashCode() {
            int iHashCode = ((((this.f68131n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f68132t)) * 31;
            Long l2 = this.nr;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        public final List n() {
            return this.rl;
        }

        public final String nr() {
            return this.f68131n;
        }

        public final Long rl() {
            return this.nr;
        }

        public final boolean t() {
            return this.f68132t;
        }

        public String toString() {
            return "Upload(userId=" + this.f68131n + ", rules=" + this.rl + ", shouldBackendSample=" + this.f68132t + ", sendNextBatchIntervalMillis=" + this.nr + ")";
        }

        public /* synthetic */ n(String str, List list, boolean z2, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, z2, (i2 & 8) != 0 ? null : l2);
        }
    }
}
