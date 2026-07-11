package pFG;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {

    public static final class j extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f71838n = new j();

        private j() {
            super(null);
        }
    }

    public static final class n extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CN3 f71839n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f71839n, ((n) obj).f71839n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(CN3 experiment) {
            super(null);
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            this.f71839n = experiment;
        }

        public int hashCode() {
            return this.f71839n.hashCode();
        }

        public final CN3 n() {
            return this.f71839n;
        }

        public String toString() {
            return "Show(experiment=" + this.f71839n + ")";
        }
    }

    public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w6() {
    }
}
