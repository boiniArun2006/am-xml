package kG;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface CN3 {

    public static final class j implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final t2.I28 f69751n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f69751n, ((j) obj).f69751n);
        }

        public j(t2.I28 cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f69751n = cause;
        }

        public int hashCode() {
            return this.f69751n.hashCode();
        }

        public String toString() {
            return "CannotOpenFile(cause=" + this.f69751n + ')';
        }
    }

    public static final class n implements CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f69752n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f69752n, ((n) obj).f69752n);
        }

        public n(Object cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f69752n = cause;
        }

        public int hashCode() {
            return this.f69752n.hashCode();
        }

        public String toString() {
            return "NotAnAnimatedGIFFailure(cause=" + this.f69752n + ')';
        }
    }
}
