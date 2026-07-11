package Z4;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import w9.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface Ml extends aC {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Z4.n f12275n;
        private final n rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f12275n, jVar.f12275n) && this.rl == jVar.rl;
        }

        public j(Z4.n predictedSlice, n prefetchingPolicy) {
            Intrinsics.checkNotNullParameter(predictedSlice, "predictedSlice");
            Intrinsics.checkNotNullParameter(prefetchingPolicy, "prefetchingPolicy");
            this.f12275n = predictedSlice;
            this.rl = prefetchingPolicy;
        }

        public int hashCode() {
            return (this.f12275n.hashCode() * 31) + this.rl.hashCode();
        }

        public final Z4.n n() {
            return this.f12275n;
        }

        public final n rl() {
            return this.rl;
        }

        public String toString() {
            return "PrefetchInfo(predictedSlice=" + this.f12275n + ", prefetchingPolicy=" + this.rl + ')';
        }
    }

    public enum n {
        MEMORY_SAVING,
        HIGH_PERFORMANCE
    }

    Object az(Z4.n nVar, j jVar, Continuation continuation);

    Object n(Continuation continuation);
}
