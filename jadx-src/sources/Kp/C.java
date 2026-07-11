package Kp;

import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C implements sz.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SceneElement f5822n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.alightcreative.app.motion.engine.VolumeShaper");
        C c2 = (C) obj;
        return Intrinsics.areEqual(this.f5822n.getGain(), c2.f5822n.getGain()) && this.f5822n.getStartTime() == c2.f5822n.getStartTime() && this.f5822n.getEndTime() == c2.f5822n.getEndTime();
    }

    public C(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "sceneElement");
        this.f5822n = sceneElement;
    }

    public int hashCode() {
        return (((this.f5822n.getGain().hashCode() * 31) + this.f5822n.getStartTime()) * 31) + this.f5822n.getEndTime();
    }

    @Override // sz.n
    public float n(long j2) {
        return ((Number) KeyableKt.valueAtTime(this.f5822n.getGain(), SceneElementKt.fractionalTime(this.f5822n, ((int) d2n.Ml.mUb(j2)) + this.f5822n.getStartTime()))).floatValue();
    }
}
