package cd;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class DAz {

    public static final class j extends DAz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f43698n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "Gone";
        }

        public int hashCode() {
            return -1705003182;
        }
    }

    public static final class n extends DAz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f43699n;
        private final int rl;

        public n(int i2, int i3) {
            super(null);
            this.f43699n = i2;
            this.rl = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f43699n == nVar.f43699n && this.rl == nVar.rl;
        }

        public static /* synthetic */ n rl(n nVar, int i2, int i3, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i2 = nVar.f43699n;
            }
            if ((i5 & 2) != 0) {
                i3 = nVar.rl;
            }
            return nVar.n(i2, i3);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f43699n) * 31) + Integer.hashCode(this.rl);
        }

        public final n n(int i2, int i3) {
            return new n(i2, i3);
        }

        public final int nr() {
            return this.f43699n;
        }

        public final int t() {
            return this.rl;
        }

        public String toString() {
            return "Visible(secondsLeft=" + this.f43699n + ", discountPercent=" + this.rl + ")";
        }
    }

    public /* synthetic */ DAz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DAz() {
    }
}
