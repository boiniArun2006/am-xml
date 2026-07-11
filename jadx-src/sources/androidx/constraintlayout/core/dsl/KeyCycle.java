package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class KeyCycle extends KeyAttribute {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f35096S;
    private float XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f35097Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Wave f35098o;

    public enum Wave {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttribute
    protected void J2(StringBuilder sb) {
        super.J2(sb);
        if (this.f35098o != null) {
            sb.append("shape:'");
            sb.append(this.f35098o);
            sb.append("',\n");
        }
        n(sb, "period", this.f35097Z);
        n(sb, "offset", this.XQ);
        n(sb, "phase", this.f35096S);
    }
}
