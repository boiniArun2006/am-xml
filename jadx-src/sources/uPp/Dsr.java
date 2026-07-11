package uPp;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d2n.j f74410n;
    private final Set rl;

    public /* synthetic */ Dsr(d2n.j jVar, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return Intrinsics.areEqual(this.f74410n, dsr.f74410n) && Intrinsics.areEqual(this.rl, dsr.rl);
    }

    private Dsr(d2n.j jVar, Set set) {
        this.f74410n = jVar;
        this.rl = set;
    }

    public int hashCode() {
        d2n.j jVar = this.f74410n;
        return ((jVar == null ? 0 : d2n.j.ck(jVar.WPU())) * 31) + this.rl.hashCode();
    }

    public final d2n.j n() {
        return this.f74410n;
    }

    public final Set rl() {
        return this.rl;
    }

    public String toString() {
        return "StreamInfo(duration=" + this.f74410n + ", tracks=" + this.rl + ')';
    }
}
