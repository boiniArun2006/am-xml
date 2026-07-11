package MoG;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6772n;
    private final eO rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f6772n == zVar.f6772n && Intrinsics.areEqual(this.rl, zVar.rl);
    }

    public z(int i2, eO format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f6772n = i2;
        this.rl = format;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f6772n) * 31) + this.rl.hashCode();
    }

    public final eO n() {
        return this.rl;
    }

    public final int rl() {
        return this.f6772n;
    }

    public String toString() {
        return "FMMediaTrack(id=" + this.f6772n + ", format=" + this.rl + ')';
    }
}
