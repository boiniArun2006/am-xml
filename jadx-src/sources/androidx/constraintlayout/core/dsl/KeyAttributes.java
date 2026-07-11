package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class KeyAttributes extends Keys {
    private float[] HI;
    private float[] Ik;
    private Visibility[] J2;
    private float[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int[] f35086O;
    private float[] Uo;
    private float[] az;
    private float[] ck;
    private float[] gh;
    private float[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f35087n;
    private Fit nr;
    private float[] qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f35088r;
    private String[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f35089t;
    private float[] ty;
    private float[] xMQ;

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
        nr(sb, "target", this.rl);
        sb.append("frame:");
        sb.append(Arrays.toString(this.f35086O));
        sb.append(",\n");
        rl(sb, "easing", this.f35089t);
        if (this.nr != null) {
            sb.append("fit:'");
            sb.append(this.nr);
            sb.append("',\n");
        }
        if (this.J2 != null) {
            sb.append("visibility:'");
            sb.append(Arrays.toString(this.J2));
            sb.append("',\n");
        }
        t(sb, "alpha", this.Uo);
        t(sb, "rotationX", this.xMQ);
        t(sb, "rotationY", this.mUb);
        t(sb, "rotationZ", this.KN);
        t(sb, "pivotX", this.gh);
        t(sb, "pivotY", this.qie);
        t(sb, "pathRotate", this.az);
        t(sb, "scaleX", this.ty);
        t(sb, "scaleY", this.HI);
        t(sb, "translationX", this.ck);
        t(sb, "translationY", this.Ik);
        t(sb, "translationZ", this.f35088r);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35087n);
        sb.append(":{\n");
        J2(sb);
        sb.append("},\n");
        return sb.toString();
    }
}
