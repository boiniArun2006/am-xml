package Ect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2326n;
    private float rl;

    public Ml(float f3, float f4) {
        this.f2326n = f3;
        this.rl = f4;
    }

    public boolean n(float f3, float f4) {
        return this.f2326n == f3 && this.rl == f4;
    }

    public void nr(float f3, float f4) {
        this.f2326n = f3;
        this.rl = f4;
    }

    public float rl() {
        return this.f2326n;
    }

    public float t() {
        return this.rl;
    }

    public String toString() {
        return rl() + "x" + t();
    }

    public Ml() {
        this(1.0f, 1.0f);
    }
}
