package nI;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n[] f71015n;
    private final int nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f71016t;

    n n() {
        return this.f71015n[this.rl];
    }

    public byte[][] rl(int i2, int i3) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f71016t * i3, this.nr * i2);
        int i5 = this.f71016t * i3;
        for (int i7 = 0; i7 < i5; i7++) {
            bArr[(i5 - i7) - 1] = this.f71015n[i7 / i3].rl(i2);
        }
        return bArr;
    }

    void t() {
        this.rl++;
    }

    j(int i2, int i3) {
        n[] nVarArr = new n[i2];
        this.f71015n = nVarArr;
        int length = nVarArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f71015n[i5] = new n(((i3 + 4) * 17) + 1);
        }
        this.nr = i3 * 17;
        this.f71016t = i2;
        this.rl = -1;
    }
}
