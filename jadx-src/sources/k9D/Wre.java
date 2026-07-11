package k9D;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Wre {

    public static final class Ml implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f69661n = new Ml();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ml);
        }

        public String toString() {
            return "Hidden";
        }

        private Ml() {
        }

        public int hashCode() {
            return -1391233985;
        }
    }

    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f69662n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "CreatorProgramOptIn";
        }

        private j() {
        }

        public int hashCode() {
            return -1067618069;
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f69663n = new n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "CreatorRankingOptIn";
        }

        private n() {
        }

        public int hashCode() {
            return 1206026873;
        }
    }

    public static final class w6 implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f69664n;

        public w6(boolean z2) {
            this.f69664n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && this.f69664n == ((w6) obj).f69664n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f69664n);
        }

        public final boolean n() {
            return this.f69664n;
        }

        public String toString() {
            return "CreatorRankingOptOut(isLoading=" + this.f69664n + ")";
        }

        public /* synthetic */ w6(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2);
        }
    }
}
