package pFG;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface DAz {

    public static final class j implements DAz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f71711n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f71711n, ((j) obj).f71711n);
        }

        public j(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f71711n = error;
        }

        public int hashCode() {
            return this.f71711n.hashCode();
        }

        public final String n() {
            return this.f71711n;
        }

        public String toString() {
            return "ForceSegmentsFailed(error=" + this.f71711n + ")";
        }
    }

    public static final class n implements DAz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f71712n = new n();

        private n() {
        }
    }
}
