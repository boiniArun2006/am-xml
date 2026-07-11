package B7;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f271n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float[] f272t;

    public final void n() {
        this.rl = 0;
    }

    public final void nr(float f3) {
        float[] fArr = this.f272t;
        int i2 = this.rl;
        this.rl = i2 + 1;
        fArr[i2 % this.f271n] = f3;
    }

    public final Float rl(int i2) {
        int i3 = this.rl;
        if (RangesKt.coerceAtLeast(i3 - this.f271n, 0) > i2 || i2 >= i3) {
            return null;
        }
        return Float.valueOf(this.f272t[i2 % this.f271n]);
    }

    public final boolean t() {
        return this.rl == 0;
    }

    public r(int i2) {
        this.f271n = i2;
        this.f272t = new float[i2];
    }
}
