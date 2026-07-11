package f;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f.I28, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC1975I28 implements sqD.Dsr {

    /* JADX INFO: renamed from: f.I28$j */
    public static final class j extends AbstractC1975I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f63972n = new j();
        private static final String rl = "ad/dismissed";

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
            return "AdDismissed";
        }

        public int hashCode() {
            return -1382684988;
        }
    }

    /* JADX INFO: renamed from: f.I28$n */
    public static final class n extends AbstractC1975I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f63973n = new n();
        private static final String rl = "ad/watched";

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
            return "AdWatched";
        }

        public int hashCode() {
            return 1419331209;
        }
    }

    public /* synthetic */ AbstractC1975I28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC1975I28() {
    }
}
