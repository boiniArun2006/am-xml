package dI8;

import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface w6 {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class I28 implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f63490n = new I28();
        private static final String rl = "notEligibleForAds";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f63491t = Apsps.LmAdtgLKTX;

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I28);
        }

        public String toString() {
            return "UserIsNotEligibleForAds";
        }

        private I28() {
        }

        public int hashCode() {
            return -1781337154;
        }
    }

    public static final class Ml implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f63492n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && Intrinsics.areEqual(this.f63492n, ((Ml) obj).f63492n);
        }

        public Ml(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f63492n = message;
            this.rl = "failedToLoad";
        }

        public int hashCode() {
            return this.f63492n.hashCode();
        }

        public String toString() {
            return "FailedToLoad(message=" + this.f63492n + ")";
        }
    }

    public static final class j implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f63493n = new j();
        private static final String rl = "adsAreDisabled";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f63494t = "Ads are disabled in the AdOrable configuration.";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "AdsAreDisabled";
        }

        private j() {
        }

        public int hashCode() {
            return -2087324706;
        }
    }

    public static final class n implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f63495n = new n();
        private static final String rl = "anotherAdShowing";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f63496t = "Another ad is showing already.";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "AnotherAdShowing";
        }

        private n() {
        }

        public int hashCode() {
            return -229306211;
        }
    }

    /* JADX INFO: renamed from: dI8.w6$w6, reason: collision with other inner class name */
    public static final class C0838w6 implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f63497n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0838w6)) {
                return false;
            }
            C0838w6 c0838w6 = (C0838w6) obj;
            return Intrinsics.areEqual(this.f63497n, c0838w6.f63497n) && Intrinsics.areEqual(this.rl, c0838w6.rl);
        }

        public C0838w6(String title, String message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f63497n = title;
            this.rl = message;
        }

        public int hashCode() {
            return (this.f63497n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "FailedToDisplay(title=" + this.f63497n + ", message=" + this.rl + ")";
        }
    }
}
