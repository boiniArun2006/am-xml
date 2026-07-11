package QmE;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class eO implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8368n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eO) && Intrinsics.areEqual(this.f8368n, ((eO) obj).f8368n);
    }

    public int hashCode() {
        String str = this.f8368n;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String n() {
        return this.f8368n;
    }

    public String toString() {
        return "Failed(firstPaywallSetupError=" + this.f8368n + ")";
    }

    public eO(String str) {
        this.f8368n = str;
    }
}
