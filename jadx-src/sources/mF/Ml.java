package mF;

import android.view.Surface;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f70678n;
    private final Surface rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f70679t;

    public /* synthetic */ Ml(Map map, Surface surface, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, surface, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f70678n, ml.f70678n) && Intrinsics.areEqual(this.rl, ml.rl) && d2n.Ml.KN(this.f70679t, ml.f70679t);
    }

    private Ml(Map map, Surface surface, long j2) {
        this.f70678n = map;
        this.rl = surface;
        this.f70679t = j2;
    }

    public int hashCode() {
        return (((this.f70678n.hashCode() * 31) + this.rl.hashCode()) * 31) + d2n.Ml.qie(this.f70679t);
    }

    public final long n() {
        return this.f70679t;
    }

    public final Map rl() {
        return this.f70678n;
    }

    public final Surface t() {
        return this.rl;
    }

    public String toString() {
        return "FMRenderRequest(media=" + this.f70678n + ", outputSurface=" + this.rl + ", bufferTimestamp=" + ((Object) d2n.Ml.ck(this.f70679t)) + ')';
    }
}
