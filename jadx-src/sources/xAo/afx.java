package xAo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class afx implements sqD.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f75272n;

    public afx(DAz format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f75272n = "did_tap_project_list_export/" + format.rl();
    }

    @Override // sqD.CN3
    public String getValue() {
        return this.f75272n;
    }
}
