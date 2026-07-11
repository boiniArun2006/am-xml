package x0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f75144n;
    private int rl;

    public void n(float f3) {
        float f4 = this.f75144n + f3;
        this.f75144n = f4;
        int i2 = this.rl + 1;
        this.rl = i2;
        if (i2 == Integer.MAX_VALUE) {
            this.f75144n = f4 / 2.0f;
            this.rl = i2 / 2;
        }
    }
}
