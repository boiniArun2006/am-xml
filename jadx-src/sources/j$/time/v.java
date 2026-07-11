package j$.time;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f69194a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f69194a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f69194a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
