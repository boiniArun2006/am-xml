package ka;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class eO {

    public static final class j extends eO {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f70001n;
        private final boolean nr;
        private final FX.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f70002t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f70001n, jVar.f70001n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f70002t == jVar.f70002t && this.nr == jVar.nr;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List creatorProfiles, FX.n nVar, boolean z2, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(creatorProfiles, "creatorProfiles");
            this.f70001n = creatorProfiles;
            this.rl = nVar;
            this.f70002t = z2;
            this.nr = z3;
        }

        public int hashCode() {
            int iHashCode = this.f70001n.hashCode() * 31;
            FX.n nVar = this.rl;
            return ((((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + Boolean.hashCode(this.f70002t)) * 31) + Boolean.hashCode(this.nr);
        }

        public final List n() {
            return this.f70001n;
        }

        public final boolean nr() {
            return this.nr;
        }

        public final FX.n rl() {
            return this.rl;
        }

        public final boolean t() {
            return this.f70002t;
        }

        public String toString() {
            return "Content(creatorProfiles=" + this.f70001n + ", currentCreatorRankingData=" + this.rl + ", signedIn=" + this.f70002t + ", standby=" + this.nr + ")";
        }
    }

    public /* synthetic */ eO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private eO() {
    }
}
