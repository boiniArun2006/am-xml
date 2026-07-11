package nN;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface fuX {

    public static final class I28 implements fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f71086n;
        private final long rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof I28)) {
                return false;
            }
            I28 i28 = (I28) obj;
            return this.f71086n == i28.f71086n && this.rl == i28.rl;
        }

        public int hashCode() {
            return (Long.hashCode(this.f71086n) * 31) + Long.hashCode(this.rl);
        }

        public final long n() {
            return this.f71086n;
        }

        public final long rl() {
            return this.rl;
        }

        public String toString() {
            return "Status(downloadCount=" + this.f71086n + ", tokenCount=" + this.rl + ")";
        }

        public I28(long j2, long j3) {
            this.f71086n = j2;
            this.rl = j3;
        }
    }

    public static final class Ml implements fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f71087n = new Ml();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ml);
        }

        public String toString() {
            return "SignedOut";
        }

        private Ml() {
        }

        public int hashCode() {
            return -249576435;
        }
    }

    public static final class j implements fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f71088n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "Hidden";
        }

        private j() {
        }

        public int hashCode() {
            return 1275454991;
        }
    }

    public static final class n implements fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f71089n = new n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "OptedOut";
        }

        private n() {
        }

        public int hashCode() {
            return -957137279;
        }
    }

    public static final class w6 implements fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f71090n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "ProgramSuspended";
        }

        private w6() {
        }

        public int hashCode() {
            return -1657769508;
        }
    }
}
