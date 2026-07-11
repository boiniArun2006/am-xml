package xAo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Q implements sqD.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f75265n;

    public Q(DAz format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f75265n = "did_tap_main_editor_export/" + format.rl();
    }

    @Override // sqD.CN3
    public String getValue() {
        return this.f75265n;
    }
}
