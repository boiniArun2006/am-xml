package f;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC1980aC implements sqD.Dsr {

    /* JADX INFO: renamed from: f.aC$j */
    public static final class j extends AbstractC1980aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f64010n = new j();
        private static final String rl = "navigate/success";

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
            return -184844849;
        }
    }

    public /* synthetic */ AbstractC1980aC(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC1980aC() {
    }
}
