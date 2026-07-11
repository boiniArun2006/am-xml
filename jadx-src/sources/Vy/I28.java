package Vy;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum I28 {
    HTML(CreativeInfo.al),
    NATIVE("native"),
    JAVASCRIPT("javascript");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11381n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f11381n;
    }

    I28(String str) {
        this.f11381n = str;
    }
}
