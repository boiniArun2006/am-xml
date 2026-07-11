package Z;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {

    public static final class j extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f12273n;

        public j(int i2) {
            super(null);
            this.f12273n = i2;
            if (i2 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f12273n == ((j) obj).f12273n;
        }

        public int hashCode() {
            return this.f12273n;
        }

        public String toString() {
            return String.valueOf(this.f12273n);
        }
    }

    public static final class n extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f12274n = new n();

        private n() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w6() {
    }
}
