package oC;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre {
    public static final j J2 = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I28 f71362O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Oe.j f71363n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f71364t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public Wre(Oe.j dimensions, int i2, float f3, int i3, I28 mime) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(mime, "mime");
        this.f71363n = dimensions;
        this.rl = i2;
        this.f71364t = f3;
        this.nr = i3;
        this.f71362O = mime;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return Intrinsics.areEqual(this.f71363n, wre.f71363n) && this.rl == wre.rl && Float.compare(this.f71364t, wre.f71364t) == 0 && this.nr == wre.nr && this.f71362O == wre.f71362O;
    }

    public static /* synthetic */ Wre rl(Wre wre, Oe.j jVar, int i2, float f3, int i3, I28 i28, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            jVar = wre.f71363n;
        }
        if ((i5 & 2) != 0) {
            i2 = wre.rl;
        }
        if ((i5 & 4) != 0) {
            f3 = wre.f71364t;
        }
        if ((i5 & 8) != 0) {
            i3 = wre.nr;
        }
        if ((i5 & 16) != 0) {
            i28 = wre.f71362O;
        }
        I28 i282 = i28;
        float f4 = f3;
        return wre.n(jVar, i2, f4, i3, i282);
    }

    public final int J2() {
        return this.nr;
    }

    public final float O() {
        return this.f71364t;
    }

    public final I28 Uo() {
        return this.f71362O;
    }

    public int hashCode() {
        return (((((((this.f71363n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Float.hashCode(this.f71364t)) * 31) + Integer.hashCode(this.nr)) * 31) + this.f71362O.hashCode();
    }

    public final Wre n(Oe.j dimensions, int i2, float f3, int i3, I28 mime) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(mime, "mime");
        return new Wre(dimensions, i2, f3, i3, mime);
    }

    public final Oe.j nr() {
        return this.f71363n;
    }

    public final int t() {
        return this.rl;
    }

    public String toString() {
        return "VideoParams(dimensions=" + this.f71363n + ", bitRate=" + this.rl + ", frameRate=" + this.f71364t + ", iframeInterval=" + this.nr + ", mime=" + this.f71362O + ')';
    }

    public /* synthetic */ Wre(Oe.j jVar, int i2, float f3, int i3, I28 i28, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, i2, f3, (i5 & 8) != 0 ? 1 : i3, (i5 & 16) != 0 ? I28.f71359n.n() : i28);
    }
}
