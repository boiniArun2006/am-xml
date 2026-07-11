package Ax;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface QJ {

    public static final class Ml implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FX.n f155n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && Intrinsics.areEqual(this.f155n, ((Ml) obj).f155n);
        }

        public Ml(FX.n creatorRankingData) {
            Intrinsics.checkNotNullParameter(creatorRankingData, "creatorRankingData");
            this.f155n = creatorRankingData;
        }

        public int hashCode() {
            return this.f155n.hashCode();
        }

        public final FX.n n() {
            return this.f155n;
        }

        public String toString() {
            return "Status(creatorRankingData=" + this.f155n + ")";
        }
    }

    public static final class j implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f156n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "Hidden";
        }

        private j() {
        }

        public int hashCode() {
            return -1006535824;
        }
    }

    public static final class n implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f157n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f157n == ((n) obj).f157n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f157n);
        }

        public final boolean n() {
            return this.f157n;
        }

        public String toString() {
            return "OptedOut(isBlacklisted=" + this.f157n + ")";
        }

        public n(boolean z2) {
            this.f157n = z2;
        }
    }

    public static final class w6 implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f158n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "SignedOut";
        }

        private w6() {
        }

        public int hashCode() {
            return 1999382284;
        }
    }
}
