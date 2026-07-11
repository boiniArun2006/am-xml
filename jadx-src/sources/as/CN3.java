package as;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f43086n;
    private final int rl;

    public /* synthetic */ CN3(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return qz.nr(this.f43086n, cn3.f43086n) && eO.Uo(this.rl, cn3.rl);
    }

    private CN3(int i2, int i3) {
        this.f43086n = i2;
        this.rl = i3;
    }

    public int hashCode() {
        return (qz.O(this.f43086n) * 31) + eO.KN(this.rl);
    }

    public final int n() {
        return j.f43098n.rl();
    }

    public final int rl() {
        return this.f43086n;
    }

    public final int t() {
        return this.rl;
    }

    public String toString() {
        return "AudioStream16BitProperties(channelCount=" + ((Object) qz.J2(this.f43086n)) + ", sampleRate=" + ((Object) eO.xMQ(this.rl)) + ')';
    }
}
