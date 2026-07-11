package com.alightcreative.app.motion.scene.timemapping;

import com.alightcreative.app.motion.scene.Keyframe;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/app/motion/scene/timemapping/InterpolatedKeyframe;", "", "keyframe", "Lcom/alightcreative/app/motion/scene/Keyframe;", "", "isOriginal", "", "<init>", "(Lcom/alightcreative/app/motion/scene/Keyframe;Z)V", "getKeyframe", "()Lcom/alightcreative/app/motion/scene/Keyframe;", "()Z", "component1", "component2", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class InterpolatedKeyframe {
    private final boolean isOriginal;
    private final Keyframe<Float> keyframe;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterpolatedKeyframe copy$default(InterpolatedKeyframe interpolatedKeyframe, Keyframe keyframe, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            keyframe = interpolatedKeyframe.keyframe;
        }
        if ((i2 & 2) != 0) {
            z2 = interpolatedKeyframe.isOriginal;
        }
        return interpolatedKeyframe.copy(keyframe, z2);
    }

    public final Keyframe<Float> component1() {
        return this.keyframe;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsOriginal() {
        return this.isOriginal;
    }

    public final InterpolatedKeyframe copy(Keyframe<Float> keyframe, boolean isOriginal) {
        Intrinsics.checkNotNullParameter(keyframe, "keyframe");
        return new InterpolatedKeyframe(keyframe, isOriginal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterpolatedKeyframe)) {
            return false;
        }
        InterpolatedKeyframe interpolatedKeyframe = (InterpolatedKeyframe) other;
        return Intrinsics.areEqual(this.keyframe, interpolatedKeyframe.keyframe) && this.isOriginal == interpolatedKeyframe.isOriginal;
    }

    public int hashCode() {
        return (this.keyframe.hashCode() * 31) + Boolean.hashCode(this.isOriginal);
    }

    public String toString() {
        return "InterpolatedKeyframe(keyframe=" + this.keyframe + ", isOriginal=" + this.isOriginal + ")";
    }

    public InterpolatedKeyframe(Keyframe<Float> keyframe, boolean z2) {
        Intrinsics.checkNotNullParameter(keyframe, "keyframe");
        this.keyframe = keyframe;
        this.isOriginal = z2;
    }

    public final Keyframe<Float> getKeyframe() {
        return this.keyframe;
    }

    public final boolean isOriginal() {
        return this.isOriginal;
    }
}
