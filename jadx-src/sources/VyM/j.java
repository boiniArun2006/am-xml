package VyM;

import Be4.CN3;
import FjR.Dsr;
import FjR.I28;
import FjR.Xo;
import VyM.w6;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f11412n;
    private final boolean nr;
    private final Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f11413t;

    /* JADX INFO: renamed from: VyM.j$j, reason: collision with other inner class name */
    public static final class C0408j implements w6.j {
        private final boolean nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f11414t;

        public C0408j(int i2, boolean z2) {
            this.f11414t = i2;
            this.nr = z2;
            if (i2 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0408j)) {
                return false;
            }
            C0408j c0408j = (C0408j) obj;
            return this.f11414t == c0408j.f11414t && this.nr == c0408j.nr;
        }

        public int hashCode() {
            return (this.f11414t * 31) + Boolean.hashCode(this.nr);
        }

        @Override // VyM.w6.j
        public w6 n(Ml ml, Dsr dsr) {
            return !(dsr instanceof Xo) ? w6.j.rl.n(ml, dsr) : ((Xo) dsr).t() == CN3.f517n ? w6.j.rl.n(ml, dsr) : new j(ml, dsr, this.f11414t, this.nr);
        }

        public /* synthetic */ C0408j(int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 100 : i2, (i3 & 2) != 0 ? false : z2);
        }
    }

    @Override // VyM.w6
    public void n() {
        Drawable drawableN = this.f11412n.n();
        Drawable drawableN2 = this.rl.n();
        Z.CN3 cn3NHg = this.rl.rl().nHg();
        int i2 = this.f11413t;
        Dsr dsr = this.rl;
        AL.n nVar = new AL.n(drawableN, drawableN2, cn3NHg, i2, ((dsr instanceof Xo) && ((Xo) dsr).nr()) ? false : true, this.nr);
        Dsr dsr2 = this.rl;
        if (dsr2 instanceof Xo) {
            this.f11412n.rl(nVar);
        } else {
            if (!(dsr2 instanceof I28)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f11412n.nr(nVar);
        }
    }

    public final int rl() {
        return this.f11413t;
    }

    public final boolean t() {
        return this.nr;
    }

    public j(Ml ml, Dsr dsr, int i2, boolean z2) {
        this.f11412n = ml;
        this.rl = dsr;
        this.f11413t = i2;
        this.nr = z2;
        if (i2 > 0) {
        } else {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }
}
