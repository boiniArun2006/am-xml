package Sr2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f9963n;
    private final Object rl;

    public /* synthetic */ j(long j2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return d2n.Ml.KN(this.f9963n, jVar.f9963n) && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    private j(long j2, Object obj) {
        this.f9963n = j2;
        this.rl = obj;
    }

    public int hashCode() {
        int iQie = d2n.Ml.qie(this.f9963n) * 31;
        Object obj = this.rl;
        return iQie + (obj == null ? 0 : obj.hashCode());
    }

    public final Object n() {
        return this.rl;
    }

    public final long rl() {
        return this.f9963n;
    }

    public String toString() {
        return "FMExternalCompositionRequest(currentTime=" + ((Object) d2n.Ml.ck(this.f9963n)) + ", compositionInstruction=" + this.rl + ')';
    }
}
