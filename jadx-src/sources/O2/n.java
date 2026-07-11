package O2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public enum n {
    f7262t("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f7263n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f7263n;
    }

    n(String str) {
        this.f7263n = str;
    }
}
