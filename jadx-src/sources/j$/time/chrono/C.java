package j$.time.chrono;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
abstract /* synthetic */ class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f68938a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f68938a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f68938a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f68938a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
