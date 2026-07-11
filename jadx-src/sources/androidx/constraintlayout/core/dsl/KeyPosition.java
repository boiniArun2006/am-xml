package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class KeyPosition extends Keys {
    private float J2;
    private Type KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f35115O;
    private float Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f35116n;
    private float nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35117t;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPositions:{\n");
        rl(sb, "target", this.f35116n);
        sb.append("frame:");
        sb.append(this.f35117t);
        sb.append(",\n");
        if (this.KN != null) {
            sb.append("type:'");
            sb.append(this.KN);
            sb.append("',\n");
        }
        rl(sb, "easing", this.rl);
        n(sb, "percentX", this.J2);
        n(sb, "percentY", this.Uo);
        n(sb, "percentWidth", this.nr);
        n(sb, "percentHeight", this.f35115O);
        sb.append("},\n");
        return sb.toString();
    }
}
