package ISg;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f4260n;
    private final int[] nr = new int[10];
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f4261t;

    public boolean nr(int i2) {
        return ((1 << i2) & this.f4260n) != 0;
    }

    int J2() {
        return Integer.bitCount(this.f4260n);
    }

    public Dsr O(int i2, int i3, int i5) {
        int[] iArr = this.nr;
        if (i2 >= iArr.length) {
            return this;
        }
        int i7 = 1 << i2;
        this.f4260n |= i7;
        if ((i3 & 1) != 0) {
            this.rl |= i7;
        } else {
            this.rl &= ~i7;
        }
        if ((i3 & 2) != 0) {
            this.f4261t |= i7;
        } else {
            this.f4261t &= ~i7;
        }
        iArr[i2] = i5;
        return this;
    }

    public int n(int i2) {
        return this.nr[i2];
    }

    int rl() {
        if ((this.f4260n & 2) != 0) {
            return this.nr[1];
        }
        return -1;
    }

    int t(int i2) {
        return (this.f4260n & 32) != 0 ? this.nr[5] : i2;
    }
}
