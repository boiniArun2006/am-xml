package uPp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface o {

    public static final class j implements o {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f74417n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f74417n, ((j) obj).f74417n);
        }

        public j(String cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f74417n = cause;
        }

        public int hashCode() {
            return this.f74417n.hashCode();
        }

        public String toString() {
            return "DecoderStuck(cause=" + this.f74417n + ')';
        }
    }

    public static final class n implements o {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f74418n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f74418n, ((n) obj).f74418n);
        }

        public n(String cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f74418n = cause;
        }

        public int hashCode() {
            return this.f74418n.hashCode();
        }

        public String toString() {
            return "FrameNotRendered(cause=" + this.f74418n + ')';
        }
    }
}
