package VV;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface qz {

    public static final class j implements qz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f10975n;

        public static int rl(int i2) {
            return i2;
        }

        public static String O(int i2) {
            return "RawRes(resId=" + i2 + ")";
        }

        public static final /* synthetic */ j n(int i2) {
            return new j(i2);
        }

        public static boolean t(int i2, Object obj) {
            return (obj instanceof j) && i2 == ((j) obj).J2();
        }

        public final /* synthetic */ int J2() {
            return this.f10975n;
        }

        public boolean equals(Object obj) {
            return t(this.f10975n, obj);
        }

        public int hashCode() {
            return nr(this.f10975n);
        }

        public String toString() {
            return O(this.f10975n);
        }

        private /* synthetic */ j(int i2) {
            this.f10975n = i2;
        }

        public static int nr(int i2) {
            return Integer.hashCode(i2);
        }
    }
}
