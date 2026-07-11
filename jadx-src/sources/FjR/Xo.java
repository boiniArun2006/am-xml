package FjR;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Xo extends Dsr {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f3016O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f3017n;
    private final MemoryCache.Key nr;
    private final fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Be4.CN3 f3018t;

    public Xo(Drawable drawable, fuX fux, Be4.CN3 cn3, MemoryCache.Key key, String str, boolean z2, boolean z3) {
        super(null);
        this.f3017n = drawable;
        this.rl = fux;
        this.f3018t = cn3;
        this.nr = key;
        this.f3016O = str;
        this.J2 = z2;
        this.Uo = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xo)) {
            return false;
        }
        Xo xo = (Xo) obj;
        return Intrinsics.areEqual(n(), xo.n()) && Intrinsics.areEqual(rl(), xo.rl()) && this.f3018t == xo.f3018t && Intrinsics.areEqual(this.nr, xo.nr) && Intrinsics.areEqual(this.f3016O, xo.f3016O) && this.J2 == xo.J2 && this.Uo == xo.Uo;
    }

    @Override // FjR.Dsr
    public Drawable n() {
        return this.f3017n;
    }

    public final boolean nr() {
        return this.Uo;
    }

    @Override // FjR.Dsr
    public fuX rl() {
        return this.rl;
    }

    public final Be4.CN3 t() {
        return this.f3018t;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = ((((n().hashCode() * 31) + rl().hashCode()) * 31) + this.f3018t.hashCode()) * 31;
        MemoryCache.Key key = this.nr;
        int iHashCode3 = 0;
        if (key != null) {
            iHashCode = key.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = (iHashCode2 + iHashCode) * 31;
        String str = this.f3016O;
        if (str != null) {
            iHashCode3 = str.hashCode();
        }
        return ((((i2 + iHashCode3) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo);
    }
}
