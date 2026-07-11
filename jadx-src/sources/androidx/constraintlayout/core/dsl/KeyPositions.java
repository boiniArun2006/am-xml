package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class KeyPositions extends Keys {
    private float[] J2;
    private float[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float[] f35121O;
    private float[] Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f35122n;
    private int[] nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Type f35123t;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPositions:{\n");
        nr(sb, "target", this.f35122n);
        sb.append("frame:");
        sb.append(Arrays.toString(this.nr));
        sb.append(",\n");
        if (this.f35123t != null) {
            sb.append("type:'");
            sb.append(this.f35123t);
            sb.append("',\n");
        }
        rl(sb, "easing", this.rl);
        t(sb, "percentX", this.Uo);
        t(sb, "percentX", this.KN);
        t(sb, "percentWidth", this.f35121O);
        t(sb, "percentHeight", this.J2);
        sb.append("},\n");
        return sb.toString();
    }
}
