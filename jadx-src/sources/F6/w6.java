package F6;

import as.CN3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface w6 {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final F6.j f2515n;
        private final CN3 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final F6.j f2516t;

        public j(F6.j compositionSlice, CN3 outputStreamProperties, F6.j jVar) {
            Intrinsics.checkNotNullParameter(compositionSlice, "compositionSlice");
            Intrinsics.checkNotNullParameter(outputStreamProperties, "outputStreamProperties");
            this.f2515n = compositionSlice;
            this.rl = outputStreamProperties;
            this.f2516t = jVar;
            if (jVar == null || n.rl(jVar, compositionSlice)) {
                return;
            }
            throw new IllegalArgumentException(("Slice " + compositionSlice + " must equal given predicted slice " + jVar + " except for range").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f2515n, jVar.f2515n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f2516t, jVar.f2516t);
        }

        public static /* synthetic */ j rl(j jVar, F6.j jVar2, CN3 cn3, F6.j jVar3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                jVar2 = jVar.f2515n;
            }
            if ((i2 & 2) != 0) {
                cn3 = jVar.rl;
            }
            if ((i2 & 4) != 0) {
                jVar3 = jVar.f2516t;
            }
            return jVar.n(jVar2, cn3, jVar3);
        }

        public final F6.j O() {
            return this.f2516t;
        }

        public int hashCode() {
            int iHashCode = ((this.f2515n.hashCode() * 31) + this.rl.hashCode()) * 31;
            F6.j jVar = this.f2516t;
            return iHashCode + (jVar == null ? 0 : jVar.hashCode());
        }

        public final j n(F6.j compositionSlice, CN3 outputStreamProperties, F6.j jVar) {
            Intrinsics.checkNotNullParameter(compositionSlice, "compositionSlice");
            Intrinsics.checkNotNullParameter(outputStreamProperties, "outputStreamProperties");
            return new j(compositionSlice, outputStreamProperties, jVar);
        }

        public final CN3 nr() {
            return this.rl;
        }

        public final F6.j t() {
            return this.f2515n;
        }

        public String toString() {
            return "Request(compositionSlice=" + this.f2515n + ", outputStreamProperties=" + this.rl + ", predictedNextCompositionSlice=" + this.f2516t + ')';
        }

        public /* synthetic */ j(F6.j jVar, CN3 cn3, F6.j jVar2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(jVar, cn3, (i2 & 4) != 0 ? null : jVar2);
        }
    }

    Object n(Continuation continuation);

    Object rl(j jVar, Continuation continuation);
}
