package Sbr;

import MoG.CN3;
import TFv.rv6;
import android.view.SurfaceHolder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w9.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface j extends aC {

    public interface Ml {
        void n(SurfaceHolder surfaceHolder);
    }

    /* JADX INFO: renamed from: Sbr.j$j, reason: collision with other inner class name */
    public static final class C0315j {
        public static /* synthetic */ void n(j jVar, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playUntil-YfmLsvs");
            }
            if ((i2 & 1) != 0) {
                j2 = d2n.Ml.f63370t.nr();
            }
            jVar.gh(j2);
        }
    }

    public interface n {

        /* JADX INFO: renamed from: Sbr.j$n$j, reason: collision with other inner class name */
        public static final class C0316j implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Oe.w6 f9785n;
            private final boolean rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final Float f9786t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0316j)) {
                    return false;
                }
                C0316j c0316j = (C0316j) obj;
                return Intrinsics.areEqual(this.f9785n, c0316j.f9785n) && this.rl == c0316j.rl && Intrinsics.areEqual((Object) this.f9786t, (Object) c0316j.f9786t);
            }

            public C0316j(Oe.w6 outputSize, boolean z2, Float f3) {
                Intrinsics.checkNotNullParameter(outputSize, "outputSize");
                this.f9785n = outputSize;
                this.rl = z2;
                this.f9786t = f3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v7 */
            public int hashCode() {
                int iHashCode = this.f9785n.hashCode() * 31;
                boolean z2 = this.rl;
                ?? r12 = z2;
                if (z2) {
                    r12 = 1;
                }
                int i2 = (iHashCode + r12) * 31;
                Float f3 = this.f9786t;
                return i2 + (f3 == null ? 0 : f3.hashCode());
            }

            public final Float n() {
                return this.f9786t;
            }

            public final Oe.w6 rl() {
                return this.f9785n;
            }

            public final boolean t() {
                return this.rl;
            }

            public String toString() {
                return "Active(outputSize=" + this.f9785n + ", isPlaying=" + this.rl + ", audioPeak=" + this.f9786t + ')';
            }
        }

        /* JADX INFO: renamed from: Sbr.j$n$n, reason: collision with other inner class name */
        public static final class C0317n implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0317n f9787n = new C0317n();

            private C0317n() {
            }
        }
    }

    public interface w6 {

        /* JADX INFO: renamed from: Sbr.j$w6$j, reason: collision with other inner class name */
        public static final class C0318j implements w6 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final CN3 f9788n;
            private final n nr;
            private final Object rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final long f9789t;

            public /* synthetic */ C0318j(CN3 cn3, Object obj, long j2, n nVar, DefaultConstructorMarker defaultConstructorMarker) {
                this(cn3, obj, j2, nVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0318j)) {
                    return false;
                }
                C0318j c0318j = (C0318j) obj;
                return Intrinsics.areEqual(this.f9788n, c0318j.f9788n) && Intrinsics.areEqual(this.rl, c0318j.rl) && d2n.Ml.KN(this.f9789t, c0318j.f9789t) && Intrinsics.areEqual(this.nr, c0318j.nr);
            }

            private C0318j(CN3 cn3, Object obj, long j2, n nVar) {
                this.f9788n = cn3;
                this.rl = obj;
                this.f9789t = j2;
                this.nr = nVar;
            }

            public int hashCode() {
                int iHashCode = this.f9788n.hashCode() * 31;
                Object obj = this.rl;
                return ((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + d2n.Ml.qie(this.f9789t)) * 31) + this.nr.hashCode();
            }

            public final CN3 n() {
                return this.f9788n;
            }

            public final long nr() {
                return this.f9789t;
            }

            public final Object rl() {
                return this.rl;
            }

            public final n t() {
                return this.nr;
            }

            public String toString() {
                return "Created(composition=" + this.f9788n + ", compositionInstruction=" + this.rl + ", time=" + ((Object) d2n.Ml.ck(this.f9789t)) + ", playbackState=" + this.nr + ')';
            }
        }

        public static final class n implements w6 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f9790n = new n();

            private n() {
            }
        }
    }

    void HI(CN3 cn3, Object obj);

    void WPU(int i2);

    void Z(long j2);

    Ml ck();

    rv6 getState();

    void gh(long j2);

    void nr();

    void pause();
}
