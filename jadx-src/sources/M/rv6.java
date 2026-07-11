package M;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface rv6 {

    public static final class j implements rv6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f6518n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f6518n == ((j) obj).f6518n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f6518n);
        }

        public final boolean n() {
            return this.f6518n;
        }

        public String toString() {
            return "HandleXMLImportError(isSingleImport=" + this.f6518n + ")";
        }

        public j(boolean z2) {
            this.f6518n = z2;
        }
    }

    public static final class n implements rv6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6519n;
        private final Pair rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f6519n, nVar.f6519n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public int hashCode() {
            String str = this.f6519n;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Pair pair = this.rl;
            return iHashCode + (pair != null ? pair.hashCode() : 0);
        }

        public final String n() {
            return this.f6519n;
        }

        public final Pair rl() {
            return this.rl;
        }

        public String toString() {
            return "HandleXMLImportSuccess(id=" + this.f6519n + ", importSuccessAndFailCount=" + this.rl + ")";
        }

        public n(String str, Pair pair) {
            this.f6519n = str;
            this.rl = pair;
        }
    }

    public static final class w6 implements rv6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f6520n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "OpenFilePicker";
        }

        private w6() {
        }

        public int hashCode() {
            return -1604183524;
        }
    }
}
