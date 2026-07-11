package a88;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public enum Dsr {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(InneractiveMediationNameConsts.OTHER);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12701n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f12701n;
    }

    Dsr(String str) {
        this.f12701n = str;
    }
}
