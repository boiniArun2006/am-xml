package C6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class s4 {
    private final String J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f792O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f793n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f794t;
    private final int xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return this.f793n == s4Var.f793n && this.rl == s4Var.rl && this.f794t == s4Var.f794t && this.nr == s4Var.nr && this.f792O == s4Var.f792O && Intrinsics.areEqual(this.J2, s4Var.J2) && this.Uo == s4Var.Uo && this.KN == s4Var.KN && this.xMQ == s4Var.xMQ;
    }

    public s4(int i2, int i3, int i5, int i7, int i8, String videoMime, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(videoMime, "videoMime");
        this.f793n = i2;
        this.rl = i3;
        this.f794t = i5;
        this.nr = i7;
        this.f792O = i8;
        this.J2 = videoMime;
        this.Uo = i9;
        this.KN = i10;
        this.xMQ = i11;
    }

    public final int J2() {
        return this.KN;
    }

    public final String KN() {
        return this.J2;
    }

    public final int O() {
        return this.Uo;
    }

    public final int Uo() {
        return this.f794t;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f793n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f794t)) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f792O)) * 31) + this.J2.hashCode()) * 31) + Integer.hashCode(this.Uo)) * 31) + Integer.hashCode(this.KN)) * 31) + Integer.hashCode(this.xMQ);
    }

    public final int n() {
        return this.xMQ;
    }

    public final int nr() {
        return this.nr;
    }

    public final int rl() {
        return this.f792O;
    }

    public final int t() {
        return this.rl;
    }

    public String toString() {
        return "CodecTestParams(width=" + this.f793n + ", height=" + this.rl + ", videoBitrate=" + this.f794t + ", idrInterval=" + this.nr + ", fphs=" + this.f792O + ", videoMime=" + this.J2 + ", layerCount=" + this.Uo + ", layerStartIntervalSeconds=" + this.KN + ", durationFrames=" + this.xMQ + ")";
    }

    public final int xMQ() {
        return this.f793n;
    }
}
