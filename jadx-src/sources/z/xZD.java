package z;

import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class xZD extends fg {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Surface f76343n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xZD) && Intrinsics.areEqual(this.f76343n, ((xZD) obj).f76343n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xZD(Surface surface) {
        super(null);
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f76343n = surface;
    }

    public int hashCode() {
        return this.f76343n.hashCode();
    }

    public final Surface n() {
        return this.f76343n;
    }

    public String toString() {
        return "SurfaceRenderTarget(surface=" + this.f76343n + ")";
    }
}
