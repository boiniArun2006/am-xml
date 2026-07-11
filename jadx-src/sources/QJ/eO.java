package QJ;

import android.graphics.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class eO implements w6 {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GO.Ml f8003O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f8004n;
    private final GO.j nr;
    private final Path.FillType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8005t;

    public boolean J2() {
        return this.J2;
    }

    public GO.Ml O() {
        return this.f8003O;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.CN3(xo, nVar, this);
    }

    public String nr() {
        return this.f8005t;
    }

    public GO.j rl() {
        return this.nr;
    }

    public Path.FillType t() {
        return this.rl;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f8004n + '}';
    }

    public eO(String str, boolean z2, Path.FillType fillType, GO.j jVar, GO.Ml ml, boolean z3) {
        this.f8005t = str;
        this.f8004n = z2;
        this.rl = fillType;
        this.nr = jVar;
        this.f8003O = ml;
        this.J2 = z3;
    }
}
