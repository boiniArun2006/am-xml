package com.alightcreative.app.motion.scene.timemapping;

import com.alightcreative.app.motion.easing.CubicBezierEasing;
import com.alightcreative.app.motion.easing.Easing;
import com.alightcreative.app.motion.easing.LinearEasing;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"speedValueAtTime", "", "Lcom/alightcreative/app/motion/scene/Keyable;", "sourceTime", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SpeedComputationKt {
    public static final float speedValueAtTime(Keyable<Float> keyable, float f3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Keyframe keyframeClosestBeforeTime = KeyableKt.closestBeforeTime(keyable, f3);
        Keyframe keyframeClosestAfterTime = KeyableKt.closestAfterTime(keyable, f3);
        if (keyframeClosestBeforeTime == null) {
            Intrinsics.checkNotNull(keyframeClosestAfterTime);
            return ((Number) keyframeClosestAfterTime.getValue()).floatValue();
        }
        if (keyframeClosestAfterTime == null) {
            return ((Number) keyframeClosestBeforeTime.getValue()).floatValue();
        }
        if (((Number) keyframeClosestBeforeTime.getValue()).floatValue() == ((Number) keyframeClosestAfterTime.getValue()).floatValue()) {
            return ((Number) keyframeClosestBeforeTime.getValue()).floatValue();
        }
        Easing easing = keyframeClosestAfterTime.getEasing();
        if (!Intrinsics.areEqual(easing, LinearEasing.INSTANCE)) {
            if (easing instanceof CubicBezierEasing) {
                return ((Number) KeyableKt.valueAtTime(keyable, f3)).floatValue();
            }
            throw new IllegalStateException("Speed keyframes cannot have easing different than Linear or CubicBezierEasing.");
        }
        float time = keyframeClosestAfterTime.getTime() - keyframeClosestBeforeTime.getTime();
        float fFloatValue = ((Number) keyframeClosestAfterTime.getValue()).floatValue() - ((Number) keyframeClosestBeforeTime.getValue()).floatValue();
        float fFloatValue2 = ((Number) keyframeClosestBeforeTime.getValue()).floatValue() + ((Number) keyframeClosestAfterTime.getValue()).floatValue();
        float f4 = 2;
        float f5 = fFloatValue / (time / (fFloatValue2 / f4));
        float f6 = f5 / f4;
        return ((Number) keyframeClosestBeforeTime.getValue()).floatValue() + (f5 * ((((float) Math.sqrt((r3 * r3) - ((4 * f6) * (keyframeClosestBeforeTime.getTime() - f3)))) - ((Number) keyframeClosestBeforeTime.getValue()).floatValue()) / (f4 * f6)));
    }
}
