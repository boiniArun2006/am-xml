package RK;

import Oe.w6;
import d2n.Ml;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f8686n;
    private final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f8687t;

    public /* synthetic */ j(long j2, w6 w6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, w6Var, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Ml.KN(this.f8686n, jVar.f8686n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f8687t == jVar.f8687t;
    }

    private j(long j2, w6 w6Var, int i2) {
        this.f8686n = j2;
        this.rl = w6Var;
        this.f8687t = i2;
    }

    public int hashCode() {
        return (((Ml.qie(this.f8686n) * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f8687t);
    }

    public final w6 n() {
        return this.rl;
    }

    public final long rl() {
        return this.f8686n;
    }

    public String toString() {
        return "FrameInfo(time=" + ((Object) Ml.ck(this.f8686n)) + ", size=" + this.rl + ", number=" + this.f8687t + ')';
    }
}
