package Vy;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum fuX {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(InneractiveMediationNameConsts.OTHER);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11405n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f11405n;
    }

    fuX(String str) {
        this.f11405n = str;
    }
}
