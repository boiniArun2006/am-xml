package Cwp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public enum n {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    f1053Z(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f1058n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f1059t;

    public int n() {
        return this.f1059t;
    }

    n(int[] iArr, int i2) {
        this.f1058n = iArr;
        this.f1059t = i2;
    }

    public int rl(w6 w6Var) {
        char c2;
        int iJ2 = w6Var.J2();
        if (iJ2 <= 9) {
            c2 = 0;
        } else if (iJ2 <= 26) {
            c2 = 1;
        } else {
            c2 = 2;
        }
        return this.f1058n[c2];
    }
}
