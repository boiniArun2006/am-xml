package f;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Z implements sqD.Dsr {

    public static final class j extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f64008n = new j();
        private static final String rl = "survey/completed";

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
            return "Completed";
        }

        public int hashCode() {
            return -574673920;
        }
    }

    public static final class n extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f64009n = new n();
        private static final String rl = "survey/skipped";

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
            return "Skipped";
        }

        public int hashCode() {
            return -479623643;
        }
    }

    public /* synthetic */ Z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Z() {
    }
}
