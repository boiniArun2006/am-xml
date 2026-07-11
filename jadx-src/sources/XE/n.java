package XE;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface n {

    public enum j {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* JADX INFO: renamed from: XE.n$n, reason: collision with other inner class name */
    public static final class C0427n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f11811n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0427n) && Intrinsics.areEqual(this.f11811n, ((C0427n) obj).f11811n);
        }

        public C0427n(String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f11811n = sessionId;
        }

        public int hashCode() {
            return this.f11811n.hashCode();
        }

        public final String n() {
            return this.f11811n;
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f11811n + ')';
        }
    }

    boolean n();

    j rl();

    void t(C0427n c0427n);
}
