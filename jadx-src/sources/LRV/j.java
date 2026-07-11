package LRV;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface j {

    /* JADX INFO: renamed from: LRV.j$j, reason: collision with other inner class name */
    public static final class C0210j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6114n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0210j) && Intrinsics.areEqual(this.f6114n, ((C0210j) obj).f6114n);
        }

        public C0210j(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f6114n = url;
            this.rl = "Custom";
        }

        @Override // LRV.j
        public String getUrl() {
            return this.f6114n;
        }

        public int hashCode() {
            return this.f6114n.hashCode();
        }

        public String n() {
            return this.rl;
        }

        public String toString() {
            return "Custom(url=" + this.f6114n + ")";
        }
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6115n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f6115n, nVar.f6115n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public n(String name, String url) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f6115n = name;
            this.rl = url;
        }

        @Override // LRV.j
        public String getUrl() {
            return this.rl;
        }

        public int hashCode() {
            return (this.f6115n.hashCode() * 31) + this.rl.hashCode();
        }

        public String n() {
            return this.f6115n;
        }

        public String toString() {
            return "Predefined(name=" + this.f6115n + ", url=" + this.rl + ")";
        }
    }

    String getUrl();
}
