package f0P;

import com.alightcreative.app.motion.scene.BlendingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class gnv {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final OU f65599n;
    private final int nr;
    private final BlendingMode rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f65600t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnv)) {
            return false;
        }
        gnv gnvVar = (gnv) obj;
        return this.f65599n == gnvVar.f65599n && this.rl == gnvVar.rl && this.f65600t == gnvVar.f65600t && this.nr == gnvVar.nr;
    }

    public gnv(OU category, BlendingMode blendingMode, int i2, int i3) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(blendingMode, "blendingMode");
        this.f65599n = category;
        this.rl = blendingMode;
        this.f65600t = i2;
        this.nr = i3;
    }

    public int hashCode() {
        return (((((this.f65599n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f65600t)) * 31) + Integer.hashCode(this.nr);
    }

    public final BlendingMode n() {
        return this.rl;
    }

    public final int nr() {
        return this.nr;
    }

    public final OU rl() {
        return this.f65599n;
    }

    public final int t() {
        return this.f65600t;
    }

    public String toString() {
        return "BlendModeEntry(category=" + this.f65599n + ", blendingMode=" + this.rl + ", icon=" + this.f65600t + ", label=" + this.nr + ")";
    }
}
