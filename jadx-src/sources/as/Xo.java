package as;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Xo implements Comparable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f43093O = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f43094n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f43095t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Xo n(int i2) {
            return new Xo(0, i2, null);
        }
    }

    public /* synthetic */ Xo(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xo)) {
            return false;
        }
        Xo xo = (Xo) obj;
        return this.f43094n == xo.f43094n && eO.Uo(this.f43095t, xo.f43095t);
    }

    private Xo(int i2, int i3) {
        this.f43094n = i2;
        this.f43095t = i3;
    }

    public final Xo J2(int i2) {
        return new Xo(this.f43094n + i2, this.f43095t, null);
    }

    public final int Uo(CN3 streamProperties) {
        Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
        if (eO.Uo(this.f43095t, streamProperties.t())) {
            return w9.Ml.J2(I28.rl(Ml.t(this.f43094n), streamProperties.rl(), streamProperties.n()));
        }
        throw new IllegalArgumentException(("Inconsistent sample rates: " + ((Object) eO.xMQ(this.f43095t)) + " vs " + ((Object) eO.xMQ(streamProperties.t()))).toString());
    }

    public int hashCode() {
        return (Integer.hashCode(this.f43094n) * 31) + eO.KN(this.f43095t);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(Xo other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (eO.Uo(this.f43095t, other.f43095t)) {
            return Intrinsics.compare(this.f43094n, other.f43094n);
        }
        throw new IllegalArgumentException(("Cannot compare two FrameIndex with different sample rates. Found " + ((Object) eO.xMQ(this.f43095t)) + " and " + ((Object) eO.xMQ(other.f43095t))).toString());
    }

    public final int nr(Xo other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (eO.Uo(this.f43095t, other.f43095t)) {
            return Ml.t(this.f43094n - other.f43094n);
        }
        throw new IllegalArgumentException(("FrameIndexes must have same sample rate, found " + ((Object) eO.xMQ(this.f43095t)) + " and " + ((Object) eO.xMQ(other.f43095t)) + '.').toString());
    }

    public final int rl() {
        return this.f43094n;
    }

    public final int t() {
        return this.f43095t;
    }

    public String toString() {
        return "FrameIndex(index=" + this.f43094n + ", sampleRate=" + ((Object) eO.xMQ(this.f43095t)) + ')';
    }
}
