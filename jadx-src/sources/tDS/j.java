package tDS;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class j {

    /* JADX INFO: renamed from: tDS.j$j, reason: collision with other inner class name */
    public static final class C1179j extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f73442n;

        public C1179j(boolean z2) {
            super(null);
            this.f73442n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1179j) && this.f73442n == ((C1179j) obj).f73442n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f73442n);
        }

        public final boolean n() {
            return this.f73442n;
        }

        public String toString() {
            return "Match(keepEvent=" + this.f73442n + ")";
        }
    }

    public static final class n extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f73443n = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "NoMatch";
        }

        public int hashCode() {
            return -1670576743;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
