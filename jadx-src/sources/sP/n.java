package sP;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface n {

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f73251n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f73251n, ((j) obj).f73251n);
        }

        public j(String zippedAssetPath) {
            Intrinsics.checkNotNullParameter(zippedAssetPath, "zippedAssetPath");
            this.f73251n = zippedAssetPath;
        }

        public int hashCode() {
            return this.f73251n.hashCode();
        }

        public final String t() {
            return this.f73251n;
        }

        public String toString() {
            return "Local(zippedAssetPath=" + this.f73251n + ")";
        }
    }

    /* JADX INFO: renamed from: sP.n$n, reason: collision with other inner class name */
    public interface InterfaceC1169n extends n {
        j n();

        Object rl(Continuation continuation);
    }
}
