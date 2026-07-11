package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.Vector4D;
import com.alightcreative.app.motion.scene.animators.Animator;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J8\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006#"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableVector4D;", "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/Vector4D;", "keyed", "", "keyframes", "", "Lcom/alightcreative/app/motion/scene/Keyframe;", "animators", "Lcom/alightcreative/app/motion/scene/animators/Animator;", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "getKeyed", "()Z", "getKeyframes", "()Ljava/util/List;", "getAnimators", "interp", "v1", "v2", TtmlNode.TAG_P, "", "copyWith", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableVector4D implements Keyable<Vector4D> {
    private static final KeyableVector4D ONE;
    private static final KeyableVector4D UNIT;
    private static final KeyableVector4D ZERO;
    private final List<Animator<Vector4D>> animators;
    private final boolean keyed;
    private final List<Keyframe<Vector4D>> keyframes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableVector4D$Companion;", "", "<init>", "()V", "ZERO", "Lcom/alightcreative/app/motion/scene/KeyableVector4D;", "getZERO", "()Lcom/alightcreative/app/motion/scene/KeyableVector4D;", "ONE", "getONE", "UNIT", "getUNIT", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyableVector4D getONE() {
            return KeyableVector4D.ONE;
        }

        public final KeyableVector4D getUNIT() {
            return KeyableVector4D.UNIT;
        }

        public final KeyableVector4D getZERO() {
            return KeyableVector4D.ZERO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyableVector4D copy$default(KeyableVector4D keyableVector4D, boolean z2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = keyableVector4D.keyed;
        }
        if ((i2 & 2) != 0) {
            list = keyableVector4D.keyframes;
        }
        if ((i2 & 4) != 0) {
            list2 = keyableVector4D.animators;
        }
        return keyableVector4D.copy(z2, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getKeyed() {
        return this.keyed;
    }

    public final List<Keyframe<Vector4D>> component2() {
        return this.keyframes;
    }

    public final List<Animator<Vector4D>> component3() {
        return this.animators;
    }

    public final KeyableVector4D copy(boolean keyed, List<Keyframe<Vector4D>> keyframes, List<? extends Animator<Vector4D>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        return new KeyableVector4D(keyed, keyframes, animators);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyableVector4D)) {
            return false;
        }
        KeyableVector4D keyableVector4D = (KeyableVector4D) other;
        return this.keyed == keyableVector4D.keyed && Intrinsics.areEqual(this.keyframes, keyableVector4D.keyframes) && Intrinsics.areEqual(this.animators, keyableVector4D.animators);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.keyed) * 31) + this.keyframes.hashCode()) * 31) + this.animators.hashCode();
    }

    public String toString() {
        return "KeyableVector4D(keyed=" + this.keyed + ", keyframes=" + this.keyframes + ", animators=" + this.animators + ")";
    }

    static {
        Vector4D.Companion companion = Vector4D.INSTANCE;
        ZERO = KeyableKt.keyable(companion.getZERO());
        ONE = KeyableKt.keyable(companion.getONE());
        UNIT = KeyableKt.keyable(companion.getUNIT());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyableVector4D(boolean z2, List<Keyframe<Vector4D>> keyframes, List<? extends Animator<Vector4D>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        this.keyed = z2;
        this.keyframes = keyframes;
        this.animators = animators;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public Keyable<Vector4D> copyWith(List<Keyframe<Vector4D>> keyframes, boolean keyed, List<? extends Animator<Vector4D>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        return copy(keyed, keyframes, animators);
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public List<Animator<Vector4D>> getAnimators() {
        return this.animators;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public boolean getKeyed() {
        return this.keyed;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public List<Keyframe<Vector4D>> getKeyframes() {
        return this.keyframes;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public Vector4D interp(Vector4D v1, Vector4D v2, float p2) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(v2, "v2");
        return GeometryKt.plus(v1, GeometryKt.times(GeometryKt.minus(v2, v1), p2));
    }
}
