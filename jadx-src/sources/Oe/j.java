package Oe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0252j f7482t = new C0252j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f7483n;
    private final n rl;

    /* JADX INFO: renamed from: Oe.j$j, reason: collision with other inner class name */
    public static final class C0252j {
        public /* synthetic */ C0252j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0252j() {
        }

        public final j n(w6 size, n rotation) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(rotation, "rotation");
            if (Oe.n.t(rotation)) {
                size = Ml.t(size);
            }
            return new j(size, rotation);
        }
    }

    public enum n {
        DEGREE_0(0),
        DEGREE_90(90),
        DEGREE_180(180),
        DEGREE_270(270);


        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0253j f7488t = new C0253j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f7489n;

        /* JADX INFO: renamed from: Oe.j$n$j, reason: collision with other inner class name */
        public static final class C0253j {
            public /* synthetic */ C0253j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0253j() {
            }

            public final n rl(int i2) {
                if (i2 == 0) {
                    return n.DEGREE_0;
                }
                if (i2 == 90) {
                    return n.DEGREE_90;
                }
                if (i2 == 180) {
                    return n.DEGREE_180;
                }
                if (i2 != 270) {
                    return null;
                }
                return n.DEGREE_270;
            }

            public final n n(int i2) {
                n nVarRl = rl(i2);
                if (nVarRl != null) {
                    return nVarRl;
                }
                throw new IllegalArgumentException(("Degrees value must be one of [0, 90, 180, 270], found: " + i2 + '.').toString());
            }
        }

        public final int rl() {
            return this.f7489n;
        }

        n(int i2) {
            this.f7489n = i2;
        }
    }

    public j(w6 size, n rotation) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        this.f7483n = size;
        this.rl = rotation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f7483n, jVar.f7483n) && this.rl == jVar.rl;
    }

    public int hashCode() {
        return (this.f7483n.hashCode() * 31) + this.rl.hashCode();
    }

    public final n n() {
        return this.rl;
    }

    public final w6 rl() {
        return this.f7483n;
    }

    public String toString() {
        return "ImageDimensions(size=" + this.f7483n + ", rotation=" + this.rl + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(w6 size, int i2) {
        this(size, n.f7488t.n(i2));
        Intrinsics.checkNotNullParameter(size, "size");
    }
}
