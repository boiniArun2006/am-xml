package pFG;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Z {

    public static final class j extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f71774n;
        private final String nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f71775t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f71774n, jVar.f71774n) && this.rl == jVar.rl && this.f71775t == jVar.f71775t && Intrinsics.areEqual(this.nr, jVar.nr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List experiments, boolean z2, boolean z3, String searchText) {
            super(null);
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            this.f71774n = experiments;
            this.rl = z2;
            this.f71775t = z3;
            this.nr = searchText;
        }

        public int hashCode() {
            return (((((this.f71774n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f71775t)) * 31) + this.nr.hashCode();
        }

        public final List n() {
            return this.f71774n;
        }

        public final boolean nr() {
            return this.rl;
        }

        public final String rl() {
            return this.nr;
        }

        public final boolean t() {
            return this.f71775t;
        }

        public String toString() {
            return "Content(experiments=" + this.f71774n + ", showAllSegments=" + this.rl + ", showActiveExperiments=" + this.f71775t + ", searchText=" + this.nr + ")";
        }
    }

    public static final class n extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f71776n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f71776n, ((n) obj).f71776n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f71776n = message;
        }

        public int hashCode() {
            return this.f71776n.hashCode();
        }

        public final String n() {
            return this.f71776n;
        }

        public String toString() {
            return "Error(message=" + this.f71776n + ")";
        }
    }

    public static final class w6 extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f71777n = new w6();

        private w6() {
            super(null);
        }
    }

    public /* synthetic */ Z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Z() {
    }
}
