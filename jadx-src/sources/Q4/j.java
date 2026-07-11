package Q4;

import as.CN3;
import as.eO;
import as.o;
import as.qz;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f7908n;
    private final boolean nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f7909t;

    public /* synthetic */ j(int i2, int i3, int i5, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i5, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return qz.nr(this.f7908n, jVar.f7908n) && eO.Uo(this.rl, jVar.rl) && o.t(this.f7909t, jVar.f7909t) && this.nr == jVar.nr;
    }

    private j(int i2, int i3, int i5, boolean z2) {
        this.f7908n = i2;
        this.rl = i3;
        this.f7909t = i5;
        this.nr = z2;
    }

    public final CN3 O() {
        if (o.t(this.f7909t, as.j.f43098n.rl())) {
            return new CN3(this.f7908n, this.rl, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iO = ((((qz.O(this.f7908n) * 31) + eO.KN(this.rl)) * 31) + o.nr(this.f7909t)) * 31;
        boolean z2 = this.nr;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        return iO + r12;
    }

    public final int n() {
        return this.f7909t;
    }

    public final boolean nr() {
        return this.nr;
    }

    public final int rl() {
        return this.f7908n;
    }

    public final int t() {
        return this.rl;
    }

    public String toString() {
        return "AudioStreamProperties(channelCount=" + ((Object) qz.J2(this.f7908n)) + ", sampleRate=" + ((Object) eO.xMQ(this.rl)) + ", bytesPerSample=" + ((Object) o.J2(this.f7909t)) + ", isFloat=" + this.nr + ')';
    }
}
