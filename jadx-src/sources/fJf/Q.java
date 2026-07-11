package fJf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Q f66869n = new Q();

    public static final int n(int i2, int i3, int i5) {
        return Math.min(Math.max(0, i5 - i2), i3);
    }

    public static final void rl(int i2, int i3, int i5, int i7, int i8) {
        Hh.C.nr(i7 >= 0, "count (%d) ! >= 0", Integer.valueOf(i7));
        Hh.C.nr(i2 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i2));
        Hh.C.nr(i5 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i5));
        Hh.C.nr(i2 + i7 <= i8, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i2), Integer.valueOf(i7), Integer.valueOf(i8));
        Hh.C.nr(i5 + i7 <= i3, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i3));
    }

    private Q() {
    }
}
