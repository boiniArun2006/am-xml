package androidx.appcompat.widget;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class RtlSpacingHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14271n = 0;
    private int rl = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14272t = Integer.MIN_VALUE;
    private int nr = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f14270O = 0;
    private int J2 = 0;
    private boolean Uo = false;
    private boolean KN = false;

    public void O(int i2, int i3) {
        this.KN = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f14270O = i2;
            this.f14271n = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.J2 = i3;
            this.rl = i3;
        }
    }

    public void J2(boolean z2) {
        if (z2 == this.Uo) {
            return;
        }
        this.Uo = z2;
        if (!this.KN) {
            this.f14271n = this.f14270O;
            this.rl = this.J2;
            return;
        }
        if (z2) {
            int i2 = this.nr;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f14270O;
            }
            this.f14271n = i2;
            int i3 = this.f14272t;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.J2;
            }
            this.rl = i3;
            return;
        }
        int i5 = this.f14272t;
        if (i5 == Integer.MIN_VALUE) {
            i5 = this.f14270O;
        }
        this.f14271n = i5;
        int i7 = this.nr;
        if (i7 == Integer.MIN_VALUE) {
            i7 = this.J2;
        }
        this.rl = i7;
    }

    public void Uo(int i2, int i3) {
        this.f14272t = i2;
        this.nr = i3;
        this.KN = true;
        if (this.Uo) {
            if (i3 != Integer.MIN_VALUE) {
                this.f14271n = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.rl = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f14271n = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.rl = i3;
        }
    }

    public int n() {
        return this.Uo ? this.f14271n : this.rl;
    }

    public int nr() {
        return this.Uo ? this.rl : this.f14271n;
    }

    public int rl() {
        return this.f14271n;
    }

    public int t() {
        return this.rl;
    }

    RtlSpacingHelper() {
    }
}
