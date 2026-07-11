package com.alightcreative.app.motion.easing;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"clamped", "Lcom/alightcreative/app/motion/easing/SplittableEasing;", "getClamped", "(Lcom/alightcreative/app/motion/easing/SplittableEasing;)Lcom/alightcreative/app/motion/easing/SplittableEasing;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SplittableEasingKt {
    public static final SplittableEasing getClamped(SplittableEasing splittableEasing) {
        Intrinsics.checkNotNullParameter(splittableEasing, "<this>");
        if (splittableEasing instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) splittableEasing;
            return new CubicBezierEasing(RangesKt.coerceIn(cubicBezierEasing.getP1x(), 0.0f, 1.0f), RangesKt.coerceIn(cubicBezierEasing.getP1y(), 0.0f, 1.0f), RangesKt.coerceIn(cubicBezierEasing.getP2x(), 0.0f, 1.0f), RangesKt.coerceIn(cubicBezierEasing.getP2y(), 0.0f, 1.0f));
        }
        if (Intrinsics.areEqual(splittableEasing, LinearEasing.INSTANCE)) {
            return splittableEasing;
        }
        throw new NoWhenBranchMatchedException();
    }
}
