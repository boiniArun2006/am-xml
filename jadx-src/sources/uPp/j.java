package uPp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface j {

    /* JADX INFO: renamed from: uPp.j$j, reason: collision with other inner class name */
    public static final class C1227j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f74415n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1227j) && Intrinsics.areEqual(this.f74415n, ((C1227j) obj).f74415n);
        }

        public C1227j(String cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f74415n = cause;
        }

        public int hashCode() {
            return this.f74415n.hashCode();
        }

        public String toString() {
            return "SamplesNotRetrieved(cause=" + this.f74415n + ')';
        }
    }
}
