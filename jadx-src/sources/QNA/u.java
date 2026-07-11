package QNA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum u {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f8152n;

    public static u rl(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int t() {
        return this.f8152n;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f8152n);
    }

    u(int i2) {
        this.f8152n = i2;
    }
}
