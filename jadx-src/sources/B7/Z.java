package B7;

import android.view.Surface;
import cS.Zv.SzFNXybiSxdx;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Z {

    public static final class j extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f257n = new j();

        private j() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class n extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Oe.w6 f258n;
        private final Surface rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f258n, nVar.f258n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Oe.w6 size, Surface surface) {
            super(null);
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(surface, "surface");
            this.f258n = size;
            this.rl = surface;
        }

        public int hashCode() {
            return (this.f258n.hashCode() * 31) + this.rl.hashCode();
        }

        public final Oe.w6 n() {
            return this.f258n;
        }

        public final Surface rl() {
            return this.rl;
        }

        public String toString() {
            return "Ready(size=" + this.f258n + SzFNXybiSxdx.upObtrodtZS + this.rl + ')';
        }
    }

    public /* synthetic */ Z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Z() {
    }
}
