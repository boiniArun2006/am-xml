package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.animators.Animator;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J8\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006#"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableQuaternion;", "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/Quaternion;", "keyed", "", "keyframes", "", "Lcom/alightcreative/app/motion/scene/Keyframe;", "animators", "Lcom/alightcreative/app/motion/scene/animators/Animator;", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "getKeyed", "()Z", "getKeyframes", "()Ljava/util/List;", "getAnimators", "interp", "v1", "v2", TtmlNode.TAG_P, "", "copyWith", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableQuaternion implements Keyable<Quaternion> {
    private final List<Animator<Quaternion>> animators;
    private final boolean keyed;
    private final List<Keyframe<Quaternion>> keyframes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KeyableQuaternion IDENTITY = KeyableKt.keyable(Quaternion.INSTANCE.getIDENTITY());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableQuaternion$Companion;", "", "<init>", "()V", "IDENTITY", "Lcom/alightcreative/app/motion/scene/KeyableQuaternion;", "getIDENTITY", "()Lcom/alightcreative/app/motion/scene/KeyableQuaternion;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyableQuaternion getIDENTITY() {
            return KeyableQuaternion.IDENTITY;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyableQuaternion copy$default(KeyableQuaternion keyableQuaternion, boolean z2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = keyableQuaternion.keyed;
        }
        if ((i2 & 2) != 0) {
            list = keyableQuaternion.keyframes;
        }
        if ((i2 & 4) != 0) {
            list2 = keyableQuaternion.animators;
        }
        return keyableQuaternion.copy(z2, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getKeyed() {
        return this.keyed;
    }

    public final List<Keyframe<Quaternion>> component2() {
        return this.keyframes;
    }

    public final List<Animator<Quaternion>> component3() {
        return this.animators;
    }

    public final KeyableQuaternion copy(boolean keyed, List<Keyframe<Quaternion>> keyframes, List<? extends Animator<Quaternion>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        return new KeyableQuaternion(keyed, keyframes, animators);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyableQuaternion)) {
            return false;
        }
        KeyableQuaternion keyableQuaternion = (KeyableQuaternion) other;
        return this.keyed == keyableQuaternion.keyed && Intrinsics.areEqual(this.keyframes, keyableQuaternion.keyframes) && Intrinsics.areEqual(this.animators, keyableQuaternion.animators);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.keyed) * 31) + this.keyframes.hashCode()) * 31) + this.animators.hashCode();
    }

    public String toString() {
        return "KeyableQuaternion(keyed=" + this.keyed + ", keyframes=" + this.keyframes + ", animators=" + this.animators + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyableQuaternion(boolean z2, List<Keyframe<Quaternion>> keyframes, List<? extends Animator<Quaternion>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        this.keyed = z2;
        this.keyframes = keyframes;
        this.animators = animators;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public Keyable<Quaternion> copyWith(List<Keyframe<Quaternion>> keyframes, boolean keyed, List<? extends Animator<Quaternion>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        return copy(keyed, keyframes, animators);
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public List<Animator<Quaternion>> getAnimators() {
        return this.animators;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public boolean getKeyed() {
        return this.keyed;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public List<Keyframe<Quaternion>> getKeyframes() {
        return this.keyframes;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public Quaternion interp(Quaternion v1, Quaternion v2, float p2) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(v2, "v2");
        return QuaternionKt.slerp(v1, v2, p2);
    }
}
