package B7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MoG.CN3 f270n;
    private final long rl;

    public /* synthetic */ j(MoG.CN3 cn3, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cn3, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f270n, jVar.f270n) && d2n.Ml.KN(this.rl, jVar.rl);
    }

    private j(MoG.CN3 cn3, long j2) {
        this.f270n = cn3;
        this.rl = j2;
        if (d2n.Ml.nr(j2, cn3.Uo().O()) < 0 || d2n.Ml.nr(j2, cn3.Uo().nr()) > 0) {
            throw new IllegalArgumentException(("Invalid position (" + ((Object) d2n.Ml.ck(j2)) + ") for composition with timeRange (" + cn3.Uo() + ')').toString());
        }
    }

    public static /* synthetic */ j rl(j jVar, MoG.CN3 cn3, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cn3 = jVar.f270n;
        }
        if ((i2 & 2) != 0) {
            j2 = jVar.rl;
        }
        return jVar.n(cn3, j2);
    }

    public int hashCode() {
        return (this.f270n.hashCode() * 31) + d2n.Ml.qie(this.rl);
    }

    public final j n(MoG.CN3 composition, long j2) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        return new j(composition, j2, null);
    }

    public final long nr() {
        return this.rl;
    }

    public final MoG.CN3 t() {
        return this.f270n;
    }

    public String toString() {
        return "AudioDataWithPosition(composition=" + this.f270n + ", position=" + ((Object) d2n.Ml.ck(this.rl)) + ')';
    }
}
