package Vy;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum CN3 {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER(InneractiveMediationNameConsts.OTHER);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11374n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f11374n;
    }

    CN3(String str) {
        this.f11374n = str;
    }
}
