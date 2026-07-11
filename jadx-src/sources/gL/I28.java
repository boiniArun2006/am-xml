package gL;

import GO.C;
import GO.Pl;
import GO.aC;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class I28 {
    private final float HI;
    private final aC Ik;
    private final long J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final j f67476O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final boolean f67477S;
    private final String Uo;
    private final QJ.fuX ViF;
    private final QJ.j WPU;
    private final n XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final List f67478Z;
    private final c.aC aYN;
    private final float az;
    private final float ck;
    private final int gh;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f67479n;
    private final long nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final GO.n f67480o;
    private final int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C f67481r;
    private final FQq.Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f67482t;
    private final float ty;
    private final Pl xMQ;

    public enum j {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum n {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public I28(List list, FQq.Dsr dsr, String str, long j2, j jVar, long j3, String str2, List list2, Pl pl, int i2, int i3, int i5, float f3, float f4, float f5, float f6, aC aCVar, C c2, List list3, n nVar, GO.n nVar2, boolean z2, QJ.j jVar2, c.aC aCVar2, QJ.fuX fux) {
        this.f67479n = list;
        this.rl = dsr;
        this.f67482t = str;
        this.nr = j2;
        this.f67476O = jVar;
        this.J2 = j3;
        this.Uo = str2;
        this.KN = list2;
        this.xMQ = pl;
        this.mUb = i2;
        this.gh = i3;
        this.qie = i5;
        this.az = f3;
        this.ty = f4;
        this.HI = f5;
        this.ck = f6;
        this.Ik = aCVar;
        this.f67481r = c2;
        this.f67478Z = list3;
        this.XQ = nVar;
        this.f67480o = nVar2;
        this.f67477S = z2;
        this.WPU = jVar2;
        this.aYN = aCVar2;
        this.ViF = fux;
    }

    List HI() {
        return this.f67479n;
    }

    int Ik() {
        return this.gh;
    }

    List J2() {
        return this.f67478Z;
    }

    List KN() {
        return this.KN;
    }

    public long O() {
        return this.nr;
    }

    GO.n S() {
        return this.f67480o;
    }

    public j Uo() {
        return this.f67476O;
    }

    public boolean ViF() {
        return this.f67477S;
    }

    float WPU() {
        return this.az;
    }

    C XQ() {
        return this.f67481r;
    }

    aC Z() {
        return this.Ik;
    }

    Pl aYN() {
        return this.xMQ;
    }

    float az() {
        return this.HI;
    }

    int ck() {
        return this.qie;
    }

    long gh() {
        return this.J2;
    }

    public String mUb() {
        return this.f67482t;
    }

    public QJ.fuX n() {
        return this.ViF;
    }

    public String nY(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mUb());
        sb.append("\n");
        I28 i28XQ = this.rl.XQ(gh());
        if (i28XQ != null) {
            sb.append("\t\tParents: ");
            sb.append(i28XQ.mUb());
            I28 i28XQ2 = this.rl.XQ(i28XQ.gh());
            while (i28XQ2 != null) {
                sb.append("->");
                sb.append(i28XQ2.mUb());
                i28XQ2 = this.rl.XQ(i28XQ2.gh());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!KN().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(KN().size());
            sb.append("\n");
        }
        if (r() != 0 && Ik() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(Ik()), Integer.valueOf(ck())));
        }
        if (!this.f67479n.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.f67479n) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public c.aC nr() {
        return this.aYN;
    }

    float o() {
        return this.ty / this.rl.O();
    }

    float qie() {
        return this.ck;
    }

    int r() {
        return this.mUb;
    }

    public QJ.j rl() {
        return this.WPU;
    }

    FQq.Dsr t() {
        return this.rl;
    }

    public String toString() {
        return nY("");
    }

    public String ty() {
        return this.Uo;
    }

    n xMQ() {
        return this.XQ;
    }
}
