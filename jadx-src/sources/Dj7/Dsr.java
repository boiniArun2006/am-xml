package Dj7;

import androidx.compose.ui.graphics.Color;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Dsr {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f1611O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f1612n;
    private final long nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f1613t;

    public /* synthetic */ Dsr(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return Color.HI(this.f1612n, dsr.f1612n) && Color.HI(this.rl, dsr.rl) && Color.HI(this.f1613t, dsr.f1613t) && Color.HI(this.nr, dsr.nr) && Color.HI(this.f1611O, dsr.f1611O) && Color.HI(this.J2, dsr.J2);
    }

    private Dsr(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f1612n = j2;
        this.rl = j3;
        this.f1613t = j4;
        this.nr = j5;
        this.f1611O = j6;
        this.J2 = j7;
    }

    public static /* synthetic */ Dsr rl(Dsr dsr, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = dsr.f1612n;
        }
        return dsr.n(j2, (i2 & 2) != 0 ? dsr.rl : j3, (i2 & 4) != 0 ? dsr.f1613t : j4, (i2 & 8) != 0 ? dsr.nr : j5, (i2 & 16) != 0 ? dsr.f1611O : j6, (i2 & 32) != 0 ? dsr.J2 : j7);
    }

    public final long J2() {
        return this.f1612n;
    }

    public final long KN() {
        return this.f1613t;
    }

    public final long O() {
        return this.rl;
    }

    public final long Uo() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((((Color.XQ(this.f1612n) * 31) + Color.XQ(this.rl)) * 31) + Color.XQ(this.f1613t)) * 31) + Color.XQ(this.nr)) * 31) + Color.XQ(this.f1611O)) * 31) + Color.XQ(this.J2);
    }

    public final Dsr n(long j2, long j3, long j4, long j5, long j6, long j7) {
        return new Dsr(j2, j3, j4, j5, j6, j7, null);
    }

    public final long nr() {
        return this.f1611O;
    }

    public final long t() {
        return this.J2;
    }

    public String toString() {
        return "ButtonColorSchema(idleContentColor=" + Color.S(this.f1612n) + GDEJgAYrPQHfw.YSTvVmZq + Color.S(this.rl) + ", pressedContentColor=" + Color.S(this.f1613t) + ", pressedBackgroundColor=" + Color.S(this.nr) + ", disabledContentColor=" + Color.S(this.f1611O) + ", disabledBackgroundColor=" + Color.S(this.J2) + ")";
    }
}
