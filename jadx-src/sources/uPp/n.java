package uPp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface n extends w6 {

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f74416n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f74416n, ((j) obj).f74416n);
        }

        public j(String cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f74416n = cause;
        }

        public int hashCode() {
            return this.f74416n.hashCode();
        }

        public String toString() {
            return "UnsupportedDataStream(cause=" + this.f74416n + ')';
        }
    }
}
