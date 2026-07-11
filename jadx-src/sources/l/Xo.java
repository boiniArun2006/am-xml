package l;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Xo {

    public static final class j extends Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f70376n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return -306102050;
        }
    }

    public static final class n extends Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final okd.j f70377n;
        private final float rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f70377n == nVar.f70377n && Float.compare(this.rl, nVar.rl) == 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(okd.j operation, float f3) {
            super(null);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f70377n = operation;
            this.rl = f3;
        }

        public int hashCode() {
            return (this.f70377n.hashCode() * 31) + Float.hashCode(this.rl);
        }

        public final okd.j n() {
            return this.f70377n;
        }

        public final float rl() {
            return this.rl;
        }

        public String toString() {
            return "LoadingCloudOperation(operation=" + this.f70377n + ", progress=" + this.rl + ")";
        }
    }

    public /* synthetic */ Xo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Xo() {
    }
}
