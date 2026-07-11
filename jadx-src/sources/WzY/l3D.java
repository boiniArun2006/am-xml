package WzY;

import com.alightcreative.app.motion.scene.Vector2D;
import ep.oxM.esLNYym;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class l3D {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f11652O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Vector2D f11653n;
    private final boolean nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f11654t;

    public l3D(Vector2D p2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(p2, "p");
        this.f11653n = p2;
        this.rl = z2;
        this.f11654t = z3;
        this.nr = z4;
        this.f11652O = z5;
        this.J2 = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3D)) {
            return false;
        }
        l3D l3d = (l3D) obj;
        return Intrinsics.areEqual(this.f11653n, l3d.f11653n) && this.rl == l3d.rl && this.f11654t == l3d.f11654t && this.nr == l3d.nr && this.f11652O == l3d.f11652O && this.J2 == l3d.J2;
    }

    public int hashCode() {
        return (((((((((this.f11653n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f11654t)) * 31) + Boolean.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f11652O)) * 31) + Boolean.hashCode(this.J2);
    }

    public final boolean n() {
        return this.rl;
    }

    public final Vector2D rl() {
        return this.f11653n;
    }

    public final boolean t() {
        return this.nr;
    }

    public String toString() {
        return "SelectionPoint(p=" + this.f11653n + ", active=" + this.rl + ", selected=" + this.f11654t + ", pivot=" + this.nr + ", square=" + this.f11652O + esLNYym.CnaLFR + this.J2 + ")";
    }

    public /* synthetic */ l3D(Vector2D vector2D, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vector2D, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6);
    }
}
