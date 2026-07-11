package pq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j {

    public static final class I28 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f72041n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof I28)) {
                return false;
            }
            I28 i28 = (I28) obj;
            return Intrinsics.areEqual(this.f72041n, i28.f72041n) && Intrinsics.areEqual(this.rl, i28.rl);
        }

        public I28(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72041n = key;
            this.rl = value;
        }

        public int hashCode() {
            return (this.f72041n.hashCode() * 31) + this.rl.hashCode();
        }

        @Override // pq.j
        public void n(pq.Ml destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.O(this.f72041n, this.rl);
        }

        public String toString() {
            return "String(key=" + this.f72041n + ", value=" + this.rl + ")";
        }
    }

    public static final class Ml implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f72042n;
        private final Number rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return Intrinsics.areEqual(this.f72042n, ml.f72042n) && Intrinsics.areEqual(this.rl, ml.rl);
        }

        public Ml(String key, Number value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72042n = key;
            this.rl = value;
        }

        public int hashCode() {
            return (this.f72042n.hashCode() * 31) + this.rl.hashCode();
        }

        @Override // pq.j
        public void n(pq.Ml destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.nr(this.f72042n, this.rl);
        }

        public String toString() {
            return "Number(key=" + this.f72042n + ", value=" + this.rl + ")";
        }
    }

    /* JADX INFO: renamed from: pq.j$j, reason: collision with other inner class name */
    public static final class C1105j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f72043n;
        private final boolean rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1105j)) {
                return false;
            }
            C1105j c1105j = (C1105j) obj;
            return Intrinsics.areEqual(this.f72043n, c1105j.f72043n) && this.rl == c1105j.rl;
        }

        public C1105j(String key, boolean z2) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f72043n = key;
            this.rl = z2;
        }

        public int hashCode() {
            return (this.f72043n.hashCode() * 31) + Boolean.hashCode(this.rl);
        }

        @Override // pq.j
        public void n(pq.Ml destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.KN(this.f72043n, this.rl);
        }

        public String toString() {
            return "Boolean(key=" + this.f72043n + ", value=" + this.rl + ")";
        }
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f72044n;
        private final pq.w6 rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f72044n, nVar.f72044n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public n(String key, pq.w6 value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72044n = key;
            this.rl = value;
        }

        public int hashCode() {
            return (this.f72044n.hashCode() * 31) + this.rl.hashCode();
        }

        @Override // pq.j
        public void n(pq.Ml destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.J2(this.f72044n, this.rl);
        }

        public String toString() {
            return "List(key=" + this.f72044n + ", value=" + this.rl + ")";
        }
    }

    public static final class w6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f72045n;
        private final pq.Ml rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f72045n, w6Var.f72045n) && Intrinsics.areEqual(this.rl, w6Var.rl);
        }

        public w6(String key, pq.Ml value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f72045n = key;
            this.rl = value;
        }

        public int hashCode() {
            return (this.f72045n.hashCode() * 31) + this.rl.hashCode();
        }

        @Override // pq.j
        public void n(pq.Ml destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.Uo(this.f72045n, this.rl);
        }

        public String toString() {
            return "Map(key=" + this.f72045n + ", value=" + this.rl + ")";
        }
    }

    void n(pq.Ml ml);
}
