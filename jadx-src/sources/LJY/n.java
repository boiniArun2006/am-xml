package LJY;

import LJY.n;
import TFv.Wre;
import TFv.rv6;
import androidx.view.ComponentActivity;
import bH.CN3;
import fb.AbstractC2109j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f5939n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final n nr() {
            return new Ml();
        }

        public final n t() {
            return (n) n(new Function0() { // from class: LJY.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.nr();
                }
            });
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: LJY.n$n, reason: collision with other inner class name */
    public static final class C0204n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f5940n;
        private final w6 rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0204n)) {
                return false;
            }
            C0204n c0204n = (C0204n) obj;
            return Intrinsics.areEqual(this.f5940n, c0204n.f5940n) && Intrinsics.areEqual(this.rl, c0204n.rl);
        }

        public C0204n(w6 normal, w6 developer) {
            Intrinsics.checkNotNullParameter(normal, "normal");
            Intrinsics.checkNotNullParameter(developer, "developer");
            this.f5940n = normal;
            this.rl = developer;
        }

        public int hashCode() {
            return (this.f5940n.hashCode() * 31) + this.rl.hashCode();
        }

        public final w6 n() {
            return this.rl;
        }

        public final w6 rl() {
            return this.f5940n;
        }

        public String toString() {
            return "Config(normal=" + this.f5940n + ", developer=" + this.rl + ")";
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f5941n;
        private final long rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return this.f5941n == w6Var.f5941n && this.rl == w6Var.rl;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f5941n) * 31) + Long.hashCode(this.rl);
        }

        public final long n() {
            return this.rl;
        }

        public final int rl() {
            return this.f5941n;
        }

        public String toString() {
            return "GestureConfig(fingersCount=" + this.f5941n + ", delay=" + this.rl + ")";
        }

        public w6(int i2, long j2) {
            this.f5941n = i2;
            this.rl = j2;
        }
    }

    void n(ComponentActivity componentActivity, CN3 cn3, rv6 rv6Var, Wre wre, C0204n c0204n);
}
