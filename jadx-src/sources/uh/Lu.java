package uh;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Lu {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f74454n;
    private int rl;

    public static Lu n() {
        return new Lu(1, 1);
    }

    private void nr(int i2) {
        wqP.n.t((i2 & 1) == this.rl, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f74454n = i2;
    }

    public static Lu rl(int i2) {
        Lu lu = new Lu(0, i2);
        lu.t();
        return lu;
    }

    public int t() {
        int i2 = this.f74454n;
        this.f74454n = i2 + 2;
        return i2;
    }

    Lu(int i2, int i3) {
        boolean z2;
        if ((i2 & 1) == i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i2), 1);
        this.rl = i2;
        nr(i3);
    }
}
