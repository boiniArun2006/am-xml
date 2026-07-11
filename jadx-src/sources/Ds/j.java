package Ds;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    public static final class I28 extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f1936n = new I28();

        private I28() {
            super(null);
        }
    }

    public static final class Ml extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f1937n;
        private final Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f1938t;

        public Ml(int i2, Integer num, String str) {
            super(null);
            this.f1937n = i2;
            this.rl = num;
            this.f1938t = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return this.f1937n == ml.f1937n && Intrinsics.areEqual(this.rl, ml.rl) && Intrinsics.areEqual(this.f1938t, ml.f1938t);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f1937n) * 31;
            Integer num = this.rl;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f1938t;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final int nr() {
            return this.f1937n;
        }

        public final Integer rl() {
            return this.rl;
        }

        public final String t() {
            return this.f1938t;
        }

        public String toString() {
            return "Server(httpCode=" + this.f1937n + ", errorCode=" + this.rl + ", errorMessage=" + this.f1938t + ")";
        }
    }

    /* JADX INFO: renamed from: Ds.j$j, reason: collision with other inner class name */
    public static final class C0071j extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0071j f1939n = new C0071j();

        private C0071j() {
            super(null);
        }
    }

    public static final class n extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f1940n = new n();

        private n() {
            super(null);
        }
    }

    public static final class w6 extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f1941n = new w6();

        private w6() {
            super(null);
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }

    public final pq.Ml n() {
        pq.Ml ml = new pq.Ml();
        if (this instanceof Ml) {
            ml.O("type", "Server");
            Ml ml2 = (Ml) this;
            ml.nr("httpCode", Integer.valueOf(ml2.nr()));
            Integer numRl = ml2.rl();
            if (numRl != null) {
                ml.nr("errorCode", Integer.valueOf(numRl.intValue()));
            }
            String strT = ml2.t();
            if (strT != null) {
                ml.O("errorMessage", strT);
            }
            return ml;
        }
        if (Intrinsics.areEqual(this, C0071j.f1939n)) {
            ml.O("type", "Connectivity");
            return ml;
        }
        if (Intrinsics.areEqual(this, n.f1940n)) {
            ml.O("type", "Parsing");
            return ml;
        }
        if (Intrinsics.areEqual(this, w6.f1941n)) {
            ml.O("type", "Persistence");
            return ml;
        }
        if (!Intrinsics.areEqual(this, I28.f1936n)) {
            throw new NoWhenBranchMatchedException();
        }
        ml.O("type", "Unknown");
        return ml;
    }
}
