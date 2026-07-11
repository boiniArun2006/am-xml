package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Ref {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f35161n;
    private float nr;
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f35162t;

    public String toString() {
        String str = this.f35161n;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = (Float.isNaN(this.rl) && Float.isNaN(this.f35162t) && Float.isNaN(this.nr)) ? false : true;
        if (z2) {
            sb.append("[");
        }
        sb.append("'");
        sb.append(this.f35161n);
        sb.append("'");
        if (!Float.isNaN(this.nr)) {
            sb.append(",");
            sb.append(!Float.isNaN(this.rl) ? this.rl : 0.0f);
            sb.append(",");
            sb.append(Float.isNaN(this.f35162t) ? 0.0f : this.f35162t);
            sb.append(",");
            sb.append(this.nr);
        } else if (!Float.isNaN(this.f35162t)) {
            sb.append(",");
            sb.append(Float.isNaN(this.rl) ? 0.0f : this.rl);
            sb.append(",");
            sb.append(this.f35162t);
        } else if (!Float.isNaN(this.rl)) {
            sb.append(",");
            sb.append(this.rl);
        }
        if (z2) {
            sb.append("]");
        }
        sb.append(",");
        return sb.toString();
    }
}
