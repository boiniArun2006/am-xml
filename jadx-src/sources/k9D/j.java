package k9D;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j {

    /* JADX INFO: renamed from: k9D.j$j, reason: collision with other inner class name */
    public static final class C1005j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1005j f69665n = new C1005j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1005j);
        }

        public String toString() {
            return "Close";
        }

        private C1005j() {
        }

        public int hashCode() {
            return 466712216;
        }
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f69666n = new n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "OpenEditProfile";
        }

        private n() {
        }

        public int hashCode() {
            return 1709478965;
        }
    }

    public static final class w6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f69667n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f69667n, ((w6) obj).f69667n);
        }

        public w6(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f69667n = url;
        }

        public int hashCode() {
            return this.f69667n.hashCode();
        }

        public final String n() {
            return this.f69667n;
        }

        public String toString() {
            return "OpenUrl(url=" + this.f69667n + ")";
        }
    }
}
