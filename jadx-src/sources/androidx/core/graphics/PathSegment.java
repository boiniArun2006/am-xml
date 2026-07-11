package androidx.core.graphics;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.graphics.PointF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class PathSegment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PointF f36415n;
    private final float nr;
    private final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PointF f36416t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.rl, pathSegment.rl) == 0 && Float.compare(this.nr, pathSegment.nr) == 0 && this.f36415n.equals(pathSegment.f36415n) && this.f36416t.equals(pathSegment.f36416t);
    }

    public int hashCode() {
        int iHashCode = this.f36415n.hashCode() * 31;
        float f3 = this.rl;
        int iFloatToIntBits = (((iHashCode + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31) + this.f36416t.hashCode()) * 31;
        float f4 = this.nr;
        return iFloatToIntBits + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f36415n + ", startFraction=" + this.rl + ", end=" + this.f36416t + pTYaLzzmJSGAPQ.MpmtF + this.nr + '}';
    }
}
