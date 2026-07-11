package SL;

import com.applovin.mediation.MaxAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface Wre {

    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MaxAd f9721n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f9721n, ((j) obj).f9721n);
        }

        public j(MaxAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            this.f9721n = ad;
        }

        public int hashCode() {
            return this.f9721n.hashCode();
        }

        @Override // SL.Wre
        public MaxAd n() {
            return this.f9721n;
        }

        public String toString() {
            return "DismissedBeforeReward(ad=" + this.f9721n + ")";
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MaxAd f9722n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f9722n, ((n) obj).f9722n);
        }

        public n(MaxAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            this.f9722n = ad;
        }

        public int hashCode() {
            return this.f9722n.hashCode();
        }

        @Override // SL.Wre
        public MaxAd n() {
            return this.f9722n;
        }

        public String toString() {
            return "Rewarded(ad=" + this.f9722n + ")";
        }
    }

    MaxAd n();
}
