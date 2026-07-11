package j$.time.zone;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f69201a;

    static {
        int[] iArr = new int[d.values().length];
        f69201a = iArr;
        try {
            iArr[d.UTC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f69201a[d.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
