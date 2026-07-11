package dI8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface n {

    public static final class Ml implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f63483n = new Ml();
        private static final String rl = "notEligibleForAds";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f63484t = "User was marked as not eligible for ads at initialization.";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ml);
        }

        @Override // dI8.n
        public String getMessage() {
            return f63484t;
        }

        @Override // dI8.n
        public String getTitle() {
            return rl;
        }

        public String toString() {
            return "UserIsNotEligibleForAds";
        }

        private Ml() {
        }

        public int hashCode() {
            return 565969911;
        }
    }

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f63485n = new j();
        private static final String rl = "adsAreDisabled";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f63486t = "Ads are disabled in the AdOrable configuration.";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        @Override // dI8.n
        public String getMessage() {
            return f63486t;
        }

        @Override // dI8.n
        public String getTitle() {
            return rl;
        }

        public String toString() {
            return "AdsAreDisabled";
        }

        private j() {
        }

        public int hashCode() {
            return 910430085;
        }
    }

    /* JADX INFO: renamed from: dI8.n$n, reason: collision with other inner class name */
    public static final class C0837n implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f63487n;
        private final String rl = "timeoutExpired";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f63488t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0837n) && this.f63487n == ((C0837n) obj).f63487n;
        }

        @Override // dI8.n
        public String getMessage() {
            return this.f63488t;
        }

        @Override // dI8.n
        public String getTitle() {
            return this.rl;
        }

        public int hashCode() {
            return Long.hashCode(this.f63487n);
        }

        public String toString() {
            return "Timeout(timeoutMillis=" + this.f63487n + ")";
        }

        public C0837n(long j2) {
            this.f63487n = j2;
            this.f63488t = "Loading timeout of " + j2 + " ms reached.";
        }
    }

    public static final class w6 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f63489n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f63489n, w6Var.f63489n) && Intrinsics.areEqual(this.rl, w6Var.rl);
        }

        public w6(String title, String message) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f63489n = title;
            this.rl = message;
        }

        @Override // dI8.n
        public String getMessage() {
            return this.rl;
        }

        @Override // dI8.n
        public String getTitle() {
            return this.f63489n;
        }

        public int hashCode() {
            return (this.f63489n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "Unknown(title=" + this.f63489n + ", message=" + this.rl + ")";
        }
    }

    String getMessage();

    String getTitle();
}
