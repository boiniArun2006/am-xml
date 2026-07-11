package O2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public enum w6 {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f7272n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f7272n;
    }

    w6(String str) {
        this.f7272n = str;
    }
}
