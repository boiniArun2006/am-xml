package Msr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum Ml {
    ENCRYPTION_EXCEPTION(1100),
    RAW_ONE_DT_ERROR(1101),
    ONE_DT_PARSE_ERROR(1102),
    ONE_DT_AUTHENTICATION_ERROR(1103),
    ONE_DT_BROADCAST_ERROR(1104),
    ONE_DT_REQUEST_ERROR(1105),
    ONE_DT_GENERAL_ERROR(1106);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f6780n;

    public final int n() {
        return this.f6780n;
    }

    Ml(int i2) {
        this.f6780n = i2;
    }
}
