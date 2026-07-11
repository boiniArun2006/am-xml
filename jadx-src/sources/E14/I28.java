package E14;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f2241n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Intrinsics.areEqual(this.f2241n, i28.f2241n) && Intrinsics.areEqual(this.rl, i28.rl);
    }

    public I28(n headerUIState, List sections) {
        Intrinsics.checkNotNullParameter(headerUIState, "headerUIState");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f2241n = headerUIState;
        this.rl = sections;
    }

    public int hashCode() {
        return (this.f2241n.hashCode() * 31) + this.rl.hashCode();
    }

    public final n n() {
        return this.f2241n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "SecretMenuUIState(headerUIState=" + this.f2241n + ", sections=" + this.rl + ")";
    }
}
