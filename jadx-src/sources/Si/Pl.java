package Si;

import com.alightcreative.app.motion.scene.SceneHolderState;
import com.alightcreative.app.motion.scene.SpoidEnv;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f9819O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SceneHolderState f9820n;
    private final SpoidEnv nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f9821t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pl)) {
            return false;
        }
        Pl pl = (Pl) obj;
        return Intrinsics.areEqual(this.f9820n, pl.f9820n) && this.rl == pl.rl && this.f9821t == pl.f9821t && Intrinsics.areEqual(this.nr, pl.nr) && this.f9819O == pl.f9819O;
    }

    public Pl(SceneHolderState sceneHolderState, int i2, int i3, SpoidEnv spoidEnv, int i5) {
        Intrinsics.checkNotNullParameter(sceneHolderState, "sceneHolderState");
        Intrinsics.checkNotNullParameter(spoidEnv, "spoidEnv");
        this.f9820n = sceneHolderState;
        this.rl = i2;
        this.f9821t = i3;
        this.nr = spoidEnv;
        this.f9819O = i5;
    }

    public int hashCode() {
        return (((((((this.f9820n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f9821t)) * 31) + this.nr.hashCode()) * 31) + Integer.hashCode(this.f9819O);
    }

    public final int n() {
        return this.rl;
    }

    public final SceneHolderState rl() {
        return this.f9820n;
    }

    public String toString() {
        return "SceneCompositionInstruction(sceneHolderState=" + this.f9820n + ", generationId=" + this.rl + ", editMode=" + this.f9821t + ", spoidEnv=" + this.nr + ", editingSerial=" + this.f9819O + ")";
    }
}
