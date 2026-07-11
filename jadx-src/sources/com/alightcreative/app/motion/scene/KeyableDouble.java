package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.animators.Animator;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016J8\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006H\u0016J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006#"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableDouble;", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "keyed", "", "keyframes", "", "Lcom/alightcreative/app/motion/scene/Keyframe;", "animators", "Lcom/alightcreative/app/motion/scene/animators/Animator;", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "getKeyed", "()Z", "getKeyframes", "()Ljava/util/List;", "getAnimators", "interp", "v1", "v2", TtmlNode.TAG_P, "", "(DDF)Ljava/lang/Double;", "copyWith", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableDouble implements Keyable<Double> {
    public static final int $stable = 8;
    private final List<Animator<Double>> animators;
    private final boolean keyed;
    private final List<Keyframe<Double>> keyframes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyableDouble copy$default(KeyableDouble keyableDouble, boolean z2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = keyableDouble.keyed;
        }
        if ((i2 & 2) != 0) {
            list = keyableDouble.keyframes;
        }
        if ((i2 & 4) != 0) {
            list2 = keyableDouble.animators;
        }
        return keyableDouble.copy(z2, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getKeyed() {
        return this.keyed;
    }

    public final List<Keyframe<Double>> component2() {
        return this.keyframes;
    }

    public final List<Animator<Double>> component3() {
        return this.animators;
    }

    public final KeyableDouble copy(boolean keyed, List<Keyframe<Double>> keyframes, List<? extends Animator<Double>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        return new KeyableDouble(keyed, keyframes, animators);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyableDouble)) {
            return false;
        }
        KeyableDouble keyableDouble = (KeyableDouble) other;
        return this.keyed == keyableDouble.keyed && Intrinsics.areEqual(this.keyframes, keyableDouble.keyframes) && Intrinsics.areEqual(this.animators, keyableDouble.animators);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.keyed) * 31) + this.keyframes.hashCode()) * 31) + this.animators.hashCode();
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public /* bridge */ /* synthetic */ Double interp(Double d2, Double d4, float f3) {
        return interp(d2.doubleValue(), d4.doubleValue(), f3);
    }

    public String toString() {
        return "KeyableDouble(keyed=" + this.keyed + ", keyframes=" + this.keyframes + ", animators=" + this.animators + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyableDouble(boolean z2, List<Keyframe<Double>> keyframes, List<? extends Animator<Double>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        this.keyed = z2;
        this.keyframes = keyframes;
        this.animators = animators;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public Keyable<Double> copyWith(List<Keyframe<Double>> keyframes, boolean keyed, List<? extends Animator<Double>> animators) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.checkNotNullParameter(animators, "animators");
        return copy(keyed, keyframes, animators);
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public List<Animator<Double>> getAnimators() {
        return this.animators;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public boolean getKeyed() {
        return this.keyed;
    }

    @Override // com.alightcreative.app.motion.scene.Keyable
    public List<Keyframe<Double>> getKeyframes() {
        return this.keyframes;
    }

    public Double interp(double v1, double v2, float p2) {
        return Double.valueOf(v1 + ((v2 - v1) * ((double) p2)));
    }
}
