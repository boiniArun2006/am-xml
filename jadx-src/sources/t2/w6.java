package t2;

import com.alightcreative.time.Kw.znsSxz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface w6 extends I28 {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class n implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f73441n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f73441n, ((n) obj).f73441n);
        }

        public n(Throwable th) {
            Intrinsics.checkNotNullParameter(th, znsSxz.fZSGQepEr);
            this.f73441n = th;
        }

        public int hashCode() {
            return this.f73441n.hashCode();
        }

        public String toString() {
            return "UnknownError(cause=" + this.f73441n + ')';
        }
    }

    public static final class j implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f73440n = new j();

        private j() {
        }
    }
}
