package PMG;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {

    public static final class j extends Ml {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final C0270j f7693O = new C0270j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f7694n;
        private final double nr;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f7695t;

        /* JADX INFO: renamed from: PMG.Ml$j$j, reason: collision with other inner class name */
        public static final class C0270j {
            public /* synthetic */ C0270j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0270j() {
            }
        }

        public /* synthetic */ j(long j2, long j3, long j4, double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 6000L : j2, (i2 & 2) != 0 ? 2000L : j3, (i2 & 4) != 0 ? 7200000L : j4, (i2 & 8) != 0 ? 2.0d : d2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f7694n == jVar.f7694n && this.rl == jVar.rl && this.f7695t == jVar.f7695t && Double.compare(this.nr, jVar.nr) == 0;
        }

        public j(long j2, long j3, long j4, double d2) {
            super(null);
            this.f7694n = j2;
            this.rl = j3;
            this.f7695t = j4;
            this.nr = d2;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f7694n) * 31) + Long.hashCode(this.rl)) * 31) + Long.hashCode(this.f7695t)) * 31) + Double.hashCode(this.nr);
        }

        public final double n() {
            return this.nr;
        }

        public final long nr() {
            return this.f7695t;
        }

        public final long rl() {
            return this.f7694n;
        }

        public final long t() {
            return this.rl;
        }

        public String toString() {
            return "OnDemand(defaultDelayInMillis=" + this.f7694n + ", initialBackoffDelayInMillis=" + this.rl + ", maxBackoffDelayInMillis=" + this.f7695t + ", backoffMultiplier=" + this.nr + ")";
        }
    }

    public /* synthetic */ Ml(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Ml() {
    }
}
