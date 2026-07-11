package xAo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class s4 implements sqD.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f75311n;

    public s4(M.CN3 tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.f75311n = "did_tap_home_screen_tab/" + tab.J2();
    }

    @Override // sqD.CN3
    public String getValue() {
        return this.f75311n;
    }
}
