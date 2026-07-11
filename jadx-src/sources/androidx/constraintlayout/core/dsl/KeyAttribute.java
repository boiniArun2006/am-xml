package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class KeyAttribute extends Keys {
    private float HI;
    private float Ik;
    private Visibility J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Fit f35076O;
    private float Uo;
    private float az;
    private float ck;
    private float gh;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f35077n;
    private String nr;
    private float qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35078r;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35079t;
    private float ty;
    private float xMQ;

    public enum Fit {
        SPLINE,
        LINEAR
    }

    public enum Visibility {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    protected void J2(StringBuilder sb) {
        rl(sb, "target", this.rl);
        sb.append("frame:");
        sb.append(this.f35079t);
        sb.append(",\n");
        rl(sb, "easing", this.nr);
        if (this.f35076O != null) {
            sb.append("fit:'");
            sb.append(this.f35076O);
            sb.append("',\n");
        }
        if (this.J2 != null) {
            sb.append("visibility:'");
            sb.append(this.J2);
            sb.append("',\n");
        }
        n(sb, "alpha", this.Uo);
        n(sb, "rotationX", this.xMQ);
        n(sb, "rotationY", this.mUb);
        n(sb, "rotationZ", this.KN);
        n(sb, "pivotX", this.gh);
        n(sb, "pivotY", this.qie);
        n(sb, "pathRotate", this.az);
        n(sb, "scaleX", this.ty);
        n(sb, "scaleY", this.HI);
        n(sb, "translationX", this.ck);
        n(sb, "translationY", this.Ik);
        n(sb, "translationZ", this.f35078r);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35077n);
        sb.append(":{\n");
        J2(sb);
        sb.append("},\n");
        return sb.toString();
    }
}
