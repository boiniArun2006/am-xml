package TD;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10224n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10225t;

    public void n() {
        this.f10224n = false;
        this.rl = 4;
        t();
    }

    public void t() {
        this.f10225t = 0;
    }

    public boolean O() {
        return this.f10224n && this.f10225t < this.rl;
    }

    public void nr(boolean z2) {
        this.f10224n = z2;
    }

    public void rl() {
        this.f10225t++;
    }

    public Ml() {
        n();
    }
}
