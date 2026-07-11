package f;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class DAz implements sqD.Dsr {

    public static final class j extends DAz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f63964n = new j();
        private static final String rl = "unlock_pro_features/success";

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
            return "Success";
        }

        public int hashCode() {
            return -1936134292;
        }
    }

    public /* synthetic */ DAz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DAz() {
    }
}
