package C6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Q {
    private final List J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f725O;
    private final List Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f726n;
    private final List nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f727t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q2 = (Q) obj;
        return this.f726n == q2.f726n && this.rl == q2.rl && this.f727t == q2.f727t && Intrinsics.areEqual(this.nr, q2.nr) && Intrinsics.areEqual(this.f725O, q2.f725O) && Intrinsics.areEqual(this.J2, q2.J2) && Intrinsics.areEqual(this.Uo, q2.Uo) && Intrinsics.areEqual(this.KN, q2.KN);
    }

    public Q(long j2, long j3, int i2, List totalFramesByLayer, List averageFrameTimeByLayer, List totalFramesByLayerSegment, List totalFramesByLayerBySegment, List averageFrameTimeByLayerBySegment) {
        Intrinsics.checkNotNullParameter(totalFramesByLayer, "totalFramesByLayer");
        Intrinsics.checkNotNullParameter(averageFrameTimeByLayer, "averageFrameTimeByLayer");
        Intrinsics.checkNotNullParameter(totalFramesByLayerSegment, "totalFramesByLayerSegment");
        Intrinsics.checkNotNullParameter(totalFramesByLayerBySegment, "totalFramesByLayerBySegment");
        Intrinsics.checkNotNullParameter(averageFrameTimeByLayerBySegment, "averageFrameTimeByLayerBySegment");
        this.f726n = j2;
        this.rl = j3;
        this.f727t = i2;
        this.nr = totalFramesByLayer;
        this.f725O = averageFrameTimeByLayer;
        this.J2 = totalFramesByLayerSegment;
        this.Uo = totalFramesByLayerBySegment;
        this.KN = averageFrameTimeByLayerBySegment;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f726n) * 31) + Long.hashCode(this.rl)) * 31) + Integer.hashCode(this.f727t)) * 31) + this.nr.hashCode()) * 31) + this.f725O.hashCode()) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode()) * 31) + this.KN.hashCode();
    }

    public String toString() {
        return "CodecTestReport(earliestTime=" + this.f726n + ", latestTime=" + this.rl + ", totalFrames=" + this.f727t + ", totalFramesByLayer=" + this.nr + ", averageFrameTimeByLayer=" + this.f725O + ", totalFramesByLayerSegment=" + this.J2 + ", totalFramesByLayerBySegment=" + this.Uo + ", averageFrameTimeByLayerBySegment=" + this.KN + ")";
    }
}
