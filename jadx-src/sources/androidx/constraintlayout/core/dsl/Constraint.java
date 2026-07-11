package androidx.constraintlayout.core.dsl;

import d8q.jqQ.QTafcm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Constraint {
    public static final Constraint nHg = new Constraint("parent");
    static int s7N = Integer.MIN_VALUE;
    static Map wTp;
    private float E2;
    private String HI;
    private int Ik;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f35028N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35030S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f35031T;
    private Behaviour ViF;
    private ChainMode WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private String[] f35032X;
    private float XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f35033Z;
    private ChainMode aYN;
    private float az;
    private String ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35034e;
    private int fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35035g;
    private int gh;
    private int iF;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f35036n;
    private Behaviour nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35037o;
    private int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35038r;
    private int te;
    private float ty;
    String rl = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f35039t = null;
    private HAnchor nr = new HAnchor(HSide.LEFT);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private HAnchor f35029O = new HAnchor(HSide.RIGHT);
    private VAnchor J2 = new VAnchor(VSide.TOP);
    private VAnchor Uo = new VAnchor(VSide.BOTTOM);
    private HAnchor KN = new HAnchor(HSide.START);
    private HAnchor xMQ = new HAnchor(HSide.END);
    private VAnchor mUb = new VAnchor(VSide.BASELINE);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public class Anchor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Side f35041n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35042t;
        Anchor rl = null;
        int nr = Integer.MIN_VALUE;

        Anchor(Side side) {
            this.f35041n = side;
        }

        public void n(StringBuilder sb) {
            if (this.rl != null) {
                sb.append(this.f35041n.toString().toLowerCase());
                sb.append(QTafcm.Xwy);
                sb.append(this);
                sb.append(",\n");
            }
        }

        public String rl() {
            return Constraint.this.f35036n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            if (this.rl != null) {
                sb.append("'");
                sb.append(this.rl.rl());
                sb.append("',");
                sb.append("'");
                sb.append(this.rl.f35041n.toString().toLowerCase());
                sb.append("'");
            }
            if (this.f35042t != 0) {
                sb.append(",");
                sb.append(this.f35042t);
            }
            if (this.nr != Integer.MIN_VALUE) {
                if (this.f35042t == 0) {
                    sb.append(",0,");
                    sb.append(this.nr);
                } else {
                    sb.append(",");
                    sb.append(this.nr);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public enum Behaviour {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    public enum ChainMode {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public class HAnchor extends Anchor {
        HAnchor(HSide hSide) {
            super(Side.valueOf(hSide.name()));
        }
    }

    public enum HSide {
        LEFT,
        RIGHT,
        START,
        END
    }

    public enum Side {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    public class VAnchor extends Anchor {
        VAnchor(VSide vSide) {
            super(Side.valueOf(vSide.name()));
        }
    }

    public enum VSide {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        HashMap map = new HashMap();
        wTp = map;
        map.put(ChainMode.SPREAD, "spread");
        wTp.put(ChainMode.SPREAD_INSIDE, "spread_inside");
        wTp.put(ChainMode.PACKED, "packed");
    }

    public String t(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (i2 < strArr.length) {
            sb.append(i2 == 0 ? "'" : ",'");
            sb.append(strArr[i2]);
            sb.append("'");
            i2++;
        }
        sb.append("]");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f35036n + ":{\n");
        this.nr.n(sb);
        this.f35029O.n(sb);
        this.J2.n(sb);
        this.Uo.n(sb);
        this.KN.n(sb);
        this.xMQ.n(sb);
        this.mUb.n(sb);
        if (this.gh != s7N) {
            sb.append("width:");
            sb.append(this.gh);
            sb.append(",\n");
        }
        if (this.qie != s7N) {
            sb.append("height:");
            sb.append(this.qie);
            sb.append(",\n");
        }
        rl(sb, "horizontalBias", this.az);
        rl(sb, "verticalBias", this.ty);
        if (this.HI != null) {
            sb.append("dimensionRatio:'");
            sb.append(this.HI);
            sb.append("',\n");
        }
        if (this.ck != null && (!Float.isNaN(this.f35038r) || this.Ik != Integer.MIN_VALUE)) {
            sb.append("circular:['");
            sb.append(this.ck);
            sb.append("'");
            if (!Float.isNaN(this.f35038r)) {
                sb.append(",");
                sb.append(this.f35038r);
            }
            if (this.Ik != Integer.MIN_VALUE) {
                if (Float.isNaN(this.f35038r)) {
                    sb.append(",0,");
                    sb.append(this.Ik);
                } else {
                    sb.append(",");
                    sb.append(this.Ik);
                }
            }
            sb.append("],\n");
        }
        rl(sb, "verticalWeight", this.XQ);
        rl(sb, "horizontalWeight", this.f35030S);
        if (this.WPU != null) {
            sb.append("horizontalChainStyle:'");
            sb.append((String) wTp.get(this.WPU));
            sb.append("',\n");
        }
        if (this.aYN != null) {
            sb.append("verticalChainStyle:'");
            sb.append((String) wTp.get(this.aYN));
            sb.append("',\n");
        }
        if (this.ViF != null) {
            int i2 = this.f35035g;
            int i3 = s7N;
            if (i2 == i3 && this.iF == i3) {
                sb.append("width:'");
                sb.append(this.ViF.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("width:{value:'");
                sb.append(this.ViF.toString().toLowerCase());
                sb.append("'");
                if (this.f35035g != s7N) {
                    sb.append(",max:");
                    sb.append(this.f35035g);
                }
                if (this.iF != s7N) {
                    sb.append(",min:");
                    sb.append(this.iF);
                }
                sb.append("},\n");
            }
        }
        if (this.nY != null) {
            int i5 = this.te;
            int i7 = s7N;
            if (i5 == i7 && this.fD == i7) {
                sb.append("height:'");
                sb.append(this.nY.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("height:{value:'");
                sb.append(this.nY.toString().toLowerCase());
                sb.append("'");
                if (this.te != s7N) {
                    sb.append(",max:");
                    sb.append(this.te);
                }
                if (this.fD != s7N) {
                    sb.append(",min:");
                    sb.append(this.fD);
                }
                sb.append("},\n");
            }
        }
        if (!Double.isNaN(this.E2)) {
            sb.append("width:'");
            sb.append((int) this.E2);
            sb.append("%',\n");
        }
        if (!Double.isNaN(this.f35034e)) {
            sb.append("height:'");
            sb.append((int) this.f35034e);
            sb.append("%',\n");
        }
        if (this.f35032X != null) {
            sb.append("referenceIds:");
            sb.append(t(this.f35032X));
            sb.append(",\n");
        }
        if (this.f35031T) {
            sb.append("constrainedWidth:");
            sb.append(this.f35031T);
            sb.append(",\n");
        }
        if (this.f35028N) {
            sb.append("constrainedHeight:");
            sb.append(this.f35028N);
            sb.append(",\n");
        }
        sb.append("},\n");
        return sb.toString();
    }

    public Constraint(String str) {
        int i2 = s7N;
        this.gh = i2;
        this.qie = i2;
        this.az = Float.NaN;
        this.ty = Float.NaN;
        this.HI = null;
        this.ck = null;
        this.Ik = Integer.MIN_VALUE;
        this.f35038r = Float.NaN;
        this.f35037o = Integer.MIN_VALUE;
        this.f35033Z = Integer.MIN_VALUE;
        this.XQ = Float.NaN;
        this.f35030S = Float.NaN;
        this.WPU = null;
        this.aYN = null;
        this.ViF = null;
        this.nY = null;
        this.f35035g = i2;
        this.te = i2;
        this.iF = i2;
        this.fD = i2;
        this.E2 = Float.NaN;
        this.f35034e = Float.NaN;
        this.f35032X = null;
        this.f35031T = false;
        this.f35028N = false;
        this.f35036n = str;
    }

    protected void rl(StringBuilder sb, String str, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f3);
        sb.append(",\n");
    }
}
