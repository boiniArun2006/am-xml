package f;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f.Xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC1979Xo implements sqD.Dsr {

    /* JADX INFO: renamed from: f.Xo$j */
    public static final class j extends AbstractC1979Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f64005n = new j();
        private static final String rl = "paywall/dismissed";

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        @Override // sqD.Dsr
        public String getValue() {
            return rl;
        }

        public String toString() {
            return "Dismissed";
        }

        public int hashCode() {
            return 935078174;
        }
    }

    /* JADX INFO: renamed from: f.Xo$n */
    public static final class n extends AbstractC1979Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f64006n = new n();
        private static final String rl = "paywall/dismissedWithAd";

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        @Override // sqD.Dsr
        public String getValue() {
            return rl;
        }

        public String toString() {
            return "DismissedWithAd";
        }

        public int hashCode() {
            return 665314887;
        }
    }

    /* JADX INFO: renamed from: f.Xo$w6 */
    public static final class w6 extends AbstractC1979Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f64007n = new w6();
        private static final String rl = "paywall/purchased";

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        @Override // sqD.Dsr
        public String getValue() {
            return rl;
        }

        public String toString() {
            return "Purchased";
        }

        public int hashCode() {
            return -1015906312;
        }
    }

    public /* synthetic */ AbstractC1979Xo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC1979Xo() {
    }
}
