package q3M;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q3M.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class I28 {

    public static final class j implements q3M.n {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f72100t;

        @Override // q3M.n
        public void reset() {
        }

        j(long j2) {
            this.f72100t = j2;
            if (j2 < 0) {
                throw new IllegalArgumentException("Delay duration cannot be negative.");
            }
        }

        @Override // q3M.n
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public long n(Unit delayConditioner) {
            Intrinsics.checkNotNullParameter(delayConditioner, "delayConditioner");
            return this.f72100t;
        }
    }

    public static final class n implements q3M.n {
        final /* synthetic */ double J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f72101O;
        final /* synthetic */ long nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f72102t;

        n(long j2, long j3, double d2) {
            this.nr = j2;
            this.f72101O = j3;
            this.J2 = d2;
            if (j2 < 0) {
                throw new IllegalArgumentException("Initial delay duration cannot be negative.");
            }
            if (j3 < 0) {
                throw new IllegalArgumentException("Max delay duration cannot be negative.");
            }
            if (j2 >= j3) {
                throw new IllegalArgumentException("Initial delay should be lower than max delay.");
            }
            if (d2 < 0.0d) {
                throw new IllegalArgumentException("Growth rate cannot be negative.");
            }
            this.f72102t = j2;
        }

        @Override // q3M.n
        public void reset() {
            this.f72102t = this.nr;
        }

        @Override // q3M.n
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public long n(Unit delayConditioner) {
            Intrinsics.checkNotNullParameter(delayConditioner, "delayConditioner");
            long j2 = this.f72102t;
            this.f72102t = Long.min((long) (j2 * this.J2), this.f72101O);
            return j2;
        }
    }

    public static final q3M.n n(n.j jVar, long j2) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new j(j2);
    }

    public static final q3M.n rl(n.j jVar, long j2, double d2, long j3) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new n(j2, j3, d2);
    }

    public static final long t(q3M.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar.n(Unit.INSTANCE);
    }
}
