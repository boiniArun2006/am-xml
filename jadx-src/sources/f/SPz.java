package f;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class SPz implements sqD.Dsr {

    public static final class j extends SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f63999n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.f63999n = "popup/buttonTapped/" + id;
        }

        @Override // sqD.Dsr
        public String getValue() {
            return this.f63999n;
        }
    }

    public static final class n extends SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f64000n = new n();
        private static final String rl = "popup/dismissed";

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
            return "Dismissed";
        }

        public int hashCode() {
            return -2122331048;
        }
    }

    public /* synthetic */ SPz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SPz() {
    }
}
