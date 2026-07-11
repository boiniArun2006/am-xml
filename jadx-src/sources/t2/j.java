package t2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface j {

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final I28 f73439n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f73439n, ((n) obj).f73439n);
        }

        public n(I28 cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f73439n = cause;
        }

        public int hashCode() {
            return this.f73439n.hashCode();
        }

        public String toString() {
            return "CannotOpenFile(cause=" + this.f73439n + ')';
        }
    }

    /* JADX INFO: renamed from: t2.j$j, reason: collision with other inner class name */
    public static final class C1178j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1178j f73438n = new C1178j();

        private C1178j() {
        }
    }
}
