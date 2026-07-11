package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Transition {
    private float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f35163O;
    private KeyFrames Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private OnSwipe f35164n;
    private String nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f35165t;

    public String toString() {
        String str = this.rl + ":{\nfrom:'" + this.nr + "',\nto:'" + this.f35165t + "',\n";
        if (this.f35163O != 400) {
            str = str + "duration:" + this.f35163O + ",\n";
        }
        if (this.J2 != 0.0f) {
            str = str + "stagger:" + this.J2 + ",\n";
        }
        if (this.f35164n != null) {
            str = str + this.f35164n.toString();
        }
        return (str + this.Uo.toString()) + "},\n";
    }
}
