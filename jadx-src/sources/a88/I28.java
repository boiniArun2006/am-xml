package a88;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum I28 {
    HTML(CreativeInfo.al),
    NATIVE("native"),
    JAVASCRIPT("javascript");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12705n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f12705n;
    }

    I28(String str) {
        this.f12705n = str;
    }
}
