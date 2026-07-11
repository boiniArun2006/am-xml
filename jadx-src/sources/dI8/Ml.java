package dI8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface Ml {

    public static final class I28 implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f63475n = new I28();
        private static final String rl = "notEligibleForAds";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f63476t = "User was marked as not eligible for ads at initialization.";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I28);
        }

        public String toString() {
            return "UserIsNotEligibleForAds";
        }

        private I28() {
        }

        public int hashCode() {
            return -737191652;
        }
    }

    /* JADX INFO: renamed from: dI8.Ml$Ml, reason: collision with other inner class name */
    public static final class C0836Ml implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f63477n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0836Ml) && Intrinsics.areEqual(this.f63477n, ((C0836Ml) obj).f63477n);
        }

        public C0836Ml(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f63477n = message;
            this.rl = "failedToLoad";
        }

        public int hashCode() {
            return this.f63477n.hashCode();
        }

        public String toString() {
            return "FailedToLoad(message=" + this.f63477n + ")";
        }
    }

    public static final class j implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f63478n = new j();
        private static final String rl = "adsAreDisabled";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f63479t = "Ads are disabled in the AdOrable configuration.";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "AdsAreDisabled";
        }

        private j() {
        }

        public int hashCode() {
            return 1865837760;
        }
    }

    public static final class n implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f63480n = new n();
        private static final String rl = "anotherAdShowing";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f63481t = "Another ad is showing already.";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "AnotherAdShowing";
        }

        private n() {
        }

        public int hashCode() {
            return 2008733951;
        }
    }

    public static final class w6 implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f63482n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f63482n, w6Var.f63482n) && Intrinsics.areEqual(this.rl, w6Var.rl);
        }

        public w6(String title, String message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f63482n = title;
            this.rl = message;
        }

        public int hashCode() {
            return (this.f63482n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "FailedToDisplay(title=" + this.f63482n + ", message=" + this.rl + ")";
        }
    }
}
