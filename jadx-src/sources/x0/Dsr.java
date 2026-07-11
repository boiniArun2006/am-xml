package x0;

import androidx.core.os.TraceCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String[] f75146n = new String[5];
    private final long[] rl = new long[5];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75147t = 0;
    private int nr = 0;

    public void n(String str) {
        int i2 = this.f75147t;
        if (i2 == 5) {
            this.nr++;
            return;
        }
        this.f75146n[i2] = str;
        this.rl[i2] = System.nanoTime();
        TraceCompat.n(str);
        this.f75147t++;
    }

    public float rl(String str) {
        int i2 = this.nr;
        if (i2 > 0) {
            this.nr = i2 - 1;
            return 0.0f;
        }
        int i3 = this.f75147t - 1;
        this.f75147t = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f75146n[i3])) {
            TraceCompat.rl();
            return (System.nanoTime() - this.rl[this.f75147t]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f75146n[this.f75147t] + ".");
    }
}
