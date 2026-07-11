package yc;

import com.alightcreative.app.motion.scene.SolidColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class M {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SolidColor f75804n;
    private final SolidColor rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m2 = (M) obj;
        return Intrinsics.areEqual(this.f75804n, m2.f75804n) && Intrinsics.areEqual(this.rl, m2.rl);
    }

    public M(SolidColor start, SolidColor end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.f75804n = start;
        this.rl = end;
    }

    public int hashCode() {
        return (this.f75804n.hashCode() * 31) + this.rl.hashCode();
    }

    public final SolidColor n() {
        return this.rl;
    }

    public final SolidColor rl() {
        return this.f75804n;
    }

    public String toString() {
        return "ColorRange(start=" + this.f75804n + ", end=" + this.rl + ")";
    }
}
