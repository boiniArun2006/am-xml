package H7v;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f3794n;
    private final Object rl;

    public /* synthetic */ Wre(long j2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return d2n.Ml.KN(this.f3794n, wre.f3794n) && Intrinsics.areEqual(this.rl, wre.rl);
    }

    private Wre(long j2, Object obj) {
        this.f3794n = j2;
        this.rl = obj;
    }

    public int hashCode() {
        int iQie = d2n.Ml.qie(this.f3794n) * 31;
        Object obj = this.rl;
        return iQie + (obj == null ? 0 : obj.hashCode());
    }

    public final long n() {
        return this.f3794n;
    }

    public final Object nr() {
        return this.rl;
    }

    public final Object rl() {
        return this.rl;
    }

    public final long t() {
        return this.f3794n;
    }

    public String toString() {
        return "TimedValue(time=" + ((Object) d2n.Ml.ck(this.f3794n)) + ", value=" + this.rl + ')';
    }
}
