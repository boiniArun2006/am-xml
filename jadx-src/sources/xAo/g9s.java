package xAo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class g9s implements sqD.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f75277n;

    public g9s(String effectName) {
        Intrinsics.checkNotNullParameter(effectName, "effectName");
        this.f75277n = "did_tap_premium_effect/" + effectName;
    }

    @Override // sqD.CN3
    public String getValue() {
        return this.f75277n;
    }
}
