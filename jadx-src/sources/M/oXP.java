package M;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class oXP {

    public static final class j extends oXP {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f6448n;

        public j(boolean z2) {
            super(null);
            this.f6448n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f6448n == ((j) obj).f6448n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f6448n);
        }

        public final boolean n() {
            return this.f6448n;
        }

        public String toString() {
            return "CloseWithError(isSingleImport=" + this.f6448n + ")";
        }
    }

    public static final class n extends oXP {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6449n;
        private final Pair rl;

        public n(String str, Pair pair) {
            super(null);
            this.f6449n = str;
            this.rl = pair;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f6449n, nVar.f6449n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public int hashCode() {
            String str = this.f6449n;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Pair pair = this.rl;
            return iHashCode + (pair != null ? pair.hashCode() : 0);
        }

        public final String n() {
            return this.f6449n;
        }

        public final Pair rl() {
            return this.rl;
        }

        public String toString() {
            return "CloseWithSuccess(id=" + this.f6449n + ", importSuccessAndFailCount=" + this.rl + ")";
        }
    }

    public static final class w6 extends oXP {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f6450n = new w6();

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "OpenFilePicker";
        }

        public int hashCode() {
            return 1760777131;
        }
    }

    public /* synthetic */ oXP(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private oXP() {
    }
}
