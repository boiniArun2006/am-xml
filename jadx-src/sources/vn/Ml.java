package vn;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public enum Ml {
    YES,
    NO,
    UNSET;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74758n;

        static {
            int[] iArr = new int[Ml.values().length];
            f74758n = iArr;
            try {
                iArr[Ml.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74758n[Ml.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74758n[Ml.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static Ml t(boolean z2) {
        return z2 ? YES : NO;
    }

    public boolean n() {
        int i2 = j.f74758n[ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        if (i2 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public boolean rl() {
        return this != UNSET;
    }
}
