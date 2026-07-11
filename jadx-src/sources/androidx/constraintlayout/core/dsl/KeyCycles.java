package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class KeyCycles extends KeyAttributes {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float[] f35105S;
    private float[] XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float[] f35106Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Wave f35107o;

    public enum Wave {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttributes
    protected void J2(StringBuilder sb) {
        super.J2(sb);
        if (this.f35107o != null) {
            sb.append("shape:'");
            sb.append(this.f35107o);
            sb.append("',\n");
        }
        t(sb, "period", this.f35106Z);
        t(sb, "offset", this.XQ);
        t(sb, "phase", this.f35105S);
    }
}
