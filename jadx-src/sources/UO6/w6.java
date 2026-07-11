package UO6;

import com.alightcreative.app.motion.persist.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w6 {
    private j.Ml J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j.fuX f10736O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f10737n;
    private j.Pl nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10738t;
    private boolean xMQ;

    public w6(int i2, int i3, int i5, j.Pl codec, j.fuX format, j.Ml frameRate, int i7, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(frameRate, "frameRate");
        this.f10737n = i2;
        this.rl = i3;
        this.f10738t = i5;
        this.nr = codec;
        this.f10736O = format;
        this.J2 = frameRate;
        this.Uo = i7;
        this.KN = z2;
        this.xMQ = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return this.f10737n == w6Var.f10737n && this.rl == w6Var.rl && this.f10738t == w6Var.f10738t && this.nr == w6Var.nr && this.f10736O == w6Var.f10736O && this.J2 == w6Var.J2 && this.Uo == w6Var.Uo && this.KN == w6Var.KN && this.xMQ == w6Var.xMQ;
    }

    public final int J2() {
        return this.rl;
    }

    public final void KN(int i2) {
        this.Uo = i2;
    }

    public final int O() {
        return this.f10738t;
    }

    public final boolean Uo() {
        return this.xMQ;
    }

    public final void az(boolean z2) {
        this.xMQ = z2;
    }

    public final void gh(j.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<set-?>");
        this.J2 = ml;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f10737n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f10738t)) * 31) + this.nr.hashCode()) * 31) + this.f10736O.hashCode()) * 31) + this.J2.hashCode()) * 31) + Integer.hashCode(this.Uo)) * 31) + Boolean.hashCode(this.KN)) * 31) + Boolean.hashCode(this.xMQ);
    }

    public final void mUb(j.fuX fux) {
        Intrinsics.checkNotNullParameter(fux, "<set-?>");
        this.f10736O = fux;
    }

    public final int n() {
        return this.Uo;
    }

    public final j.Ml nr() {
        return this.J2;
    }

    public final void qie(int i2) {
        this.f10738t = i2;
    }

    public final j.Pl rl() {
        return this.nr;
    }

    public final j.fuX t() {
        return this.f10736O;
    }

    public String toString() {
        return this.f10737n + "," + this.rl + "," + this.f10738t + "," + this.nr + "," + this.f10736O + "," + this.J2 + "," + this.Uo + "," + this.KN + "," + this.xMQ;
    }

    public final void ty(int i2) {
        this.rl = i2;
    }

    public final void xMQ(j.Pl pl) {
        Intrinsics.checkNotNullParameter(pl, "<set-?>");
        this.nr = pl;
    }

    public /* synthetic */ w6(int i2, int i3, int i5, j.Pl pl, j.fuX fux, j.Ml ml, int i7, boolean z2, boolean z3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i5, pl, fux, ml, i7, z2, (i8 & 256) != 0 ? false : z3);
    }
}
