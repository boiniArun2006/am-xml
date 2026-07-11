package C6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ew {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f702O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f703n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f704t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ew)) {
            return false;
        }
        Ew ew = (Ew) obj;
        return this.f703n == ew.f703n && this.rl == ew.rl && this.f704t == ew.f704t && this.nr == ew.nr && this.f702O == ew.f702O && Intrinsics.areEqual(this.J2, ew.J2);
    }

    public Ew(int i2, int i3, int i5, int i7, int i8, String videoMime) {
        Intrinsics.checkNotNullParameter(videoMime, "videoMime");
        this.f703n = i2;
        this.rl = i3;
        this.f704t = i5;
        this.nr = i7;
        this.f702O = i8;
        this.J2 = videoMime;
    }

    public final int J2() {
        return this.f703n;
    }

    public final String O() {
        return this.J2;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f703n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f704t)) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f702O)) * 31) + this.J2.hashCode();
    }

    public final int n() {
        return this.f702O;
    }

    public final int nr() {
        return this.f704t;
    }

    public final int rl() {
        return this.rl;
    }

    public final int t() {
        return this.nr;
    }

    public String toString() {
        return "EncoderTestParams(width=" + this.f703n + ", height=" + this.rl + ", videoBitrate=" + this.f704t + ", idrInterval=" + this.nr + ", fphs=" + this.f702O + ", videoMime=" + this.J2 + ")";
    }
}
