package DSG;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f1455n;
    private final Wre rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return this.f1455n == aCVar.f1455n && Intrinsics.areEqual(this.rl, aCVar.rl);
    }

    public aC(boolean z2, Wre item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f1455n = z2;
        this.rl = item;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f1455n) * 31) + this.rl.hashCode();
    }

    public final Wre n() {
        return this.rl;
    }

    public final boolean rl() {
        return this.f1455n;
    }

    public String toString() {
        return "TopLevelSecretMenuItem(isDeveloperItem=" + this.f1455n + ", item=" + this.rl + ")";
    }
}
