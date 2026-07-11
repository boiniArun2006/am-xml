package aO;

import Hr.Dsr;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr.j f12848n;
    private final SurfaceTexture nr;
    private final Dsr.n.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Surface f12849t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f12848n, ml.f12848n) && Intrinsics.areEqual(this.rl, ml.rl) && Intrinsics.areEqual(this.f12849t, ml.f12849t) && Intrinsics.areEqual(this.nr, ml.nr);
    }

    public Ml(Dsr.j reader, Dsr.n.Ml videoTrackInfo, Surface surface, SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(videoTrackInfo, "videoTrackInfo");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.f12848n = reader;
        this.rl = videoTrackInfo;
        this.f12849t = surface;
        this.nr = surfaceTexture;
    }

    public int hashCode() {
        return (((((this.f12848n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f12849t.hashCode()) * 31) + this.nr.hashCode();
    }

    public final Dsr.j n() {
        return this.f12848n;
    }

    public final Dsr.n.Ml nr() {
        return this.rl;
    }

    public final Surface rl() {
        return this.f12849t;
    }

    public final SurfaceTexture t() {
        return this.nr;
    }

    public String toString() {
        return "VideoDecodingTools(reader=" + this.f12848n + ", videoTrackInfo=" + this.rl + ", surface=" + this.f12849t + ", surfaceTexture=" + this.nr + ")";
    }
}
