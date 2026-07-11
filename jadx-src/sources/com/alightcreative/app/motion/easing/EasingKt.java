package com.alightcreative.app.motion.easing;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.alightcreative.app.motion.easing.CubicBezierEasing;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0003\u001a\f\u0010\t\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a\n\u0010\u000e\u001a\u00020\u0003*\u00020\u0003\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\u000b*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\r\"\u0015\u0010\u0013\u001a\u00020\u000b*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\r\"\u0015\u0010\u0015\u001a\u00020\u000b*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r\"\u0015\u0010\u0016\u001a\u00020\u000b*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"getUIVisualRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "Lcom/alightcreative/app/motion/easing/Easing;", "getLabelResource", "", "getDebugLabel", "", "getExportSnapshotLabel", "getIcon", "requiresManualOvershoot", "", "getRequiresManualOvershoot", "(Lcom/alightcreative/app/motion/easing/Easing;)Z", "reversed", "unwrapped", "getUnwrapped", "(Lcom/alightcreative/app/motion/easing/Easing;)Lcom/alightcreative/app/motion/easing/Easing;", "isBasic", "advanced", "getAdvanced", "isReversible", "isReversed", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Easing.kt\ncom/alightcreative/app/motion/easing/EasingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
public final class EasingKt {
    public static final boolean getAdvanced(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        return (Intrinsics.areEqual(easing, LinearEasing.INSTANCE) || (easing instanceof CubicBezierEasing)) ? false : true;
    }

    public static final String getDebugLabel(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        if (Intrinsics.areEqual(easing, LinearEasing.INSTANCE)) {
            return "Linear";
        }
        if (easing instanceof CubicBezierEasing) {
            return "CubicBezier";
        }
        if (easing instanceof StepEasing) {
            return "Step";
        }
        if (easing instanceof RandomEasing) {
            return "Random";
        }
        if (easing instanceof ElasticEasing) {
            return "Elastic";
        }
        if (easing instanceof BounceEasing) {
            return "Bounce";
        }
        if (easing instanceof ElasticStepEasing) {
            return "ElasticStep";
        }
        if (easing instanceof CyclicEasing) {
            return "Cyclic";
        }
        if (easing instanceof ReversedEasing) {
            return getDebugLabel(((ReversedEasing) easing).getBaseEasing());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getExportSnapshotLabel(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        if (easing instanceof LinearEasing) {
            return "linear";
        }
        if (easing instanceof CubicBezierEasing) {
            return "bezier";
        }
        if (easing instanceof StepEasing) {
            return "steps";
        }
        if (easing instanceof RandomEasing) {
            return "random";
        }
        if (easing instanceof ElasticEasing) {
            return "elastic";
        }
        if (easing instanceof BounceEasing) {
            return "bounce";
        }
        if (easing instanceof ElasticStepEasing) {
            return "elastic_steps";
        }
        if (easing instanceof CyclicEasing) {
            return "cyclic";
        }
        if (easing instanceof ReversedEasing) {
            return getExportSnapshotLabel(((ReversedEasing) easing).getBaseEasing());
        }
        throw new NoWhenBranchMatchedException();
    }

    @DrawableRes
    public static final int getIcon(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        if (Intrinsics.areEqual(easing, LinearEasing.INSTANCE)) {
            return 2131231680;
        }
        if (easing instanceof CubicBezierEasing) {
            CubicBezierEasing.Companion companion = CubicBezierEasing.INSTANCE;
            if (Intrinsics.areEqual(easing, companion.getEASE_IN())) {
                return 2131231671;
            }
            return Intrinsics.areEqual(easing, companion.getEASE_OUT()) ? 2131231673 : 2131231672;
        }
        if (easing instanceof BounceEasing) {
            return 2131231674;
        }
        if (easing instanceof ElasticEasing) {
            return 2131231677;
        }
        if (easing instanceof CyclicEasing) {
            return 2131231681;
        }
        if (easing instanceof RandomEasing) {
            return 2131231682;
        }
        if (easing instanceof StepEasing) {
            return 2131231685;
        }
        if (easing instanceof ElasticStepEasing) {
            return 2131231684;
        }
        if (easing instanceof ReversedEasing) {
            return getIcon(((ReversedEasing) easing).getBaseEasing());
        }
        throw new NoWhenBranchMatchedException();
    }

    @StringRes
    public static final int getLabelResource(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        if (Intrinsics.areEqual(easing, LinearEasing.INSTANCE) || (easing instanceof CubicBezierEasing)) {
            return 2132017724;
        }
        if (easing instanceof StepEasing) {
            return 2132017737;
        }
        if (easing instanceof RandomEasing) {
            return 2132017734;
        }
        if (easing instanceof ElasticEasing) {
            return 2132017728;
        }
        if (easing instanceof BounceEasing) {
            return 2132017721;
        }
        if (easing instanceof ElasticStepEasing) {
            return 2132017731;
        }
        if (easing instanceof CyclicEasing) {
            return 2132017726;
        }
        if (easing instanceof ReversedEasing) {
            return getLabelResource(((ReversedEasing) easing).getBaseEasing());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean getRequiresManualOvershoot(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        Easing unwrapped = getUnwrapped(easing);
        if (!(unwrapped instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) unwrapped;
        float p1y = cubicBezierEasing.getP1y();
        if (0.0f > p1y || p1y > 1.0f) {
            return true;
        }
        float p2y = cubicBezierEasing.getP2y();
        if (0.0f > p2y || p2y > 1.0f) {
            return true;
        }
        float p1x = cubicBezierEasing.getP1x();
        if (0.0f > p1x || p1x > 1.0f) {
            return true;
        }
        float p2x = cubicBezierEasing.getP2x();
        return 0.0f > p2x || p2x > 1.0f;
    }

    public static final ClosedFloatingPointRange<Float> getUIVisualRange(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        if (Intrinsics.areEqual(easing, LinearEasing.INSTANCE)) {
            return RangesKt.rangeTo(-0.25f, 1.25f);
        }
        if (easing instanceof StepEasing) {
            return RangesKt.rangeTo(-0.25f, 1.25f);
        }
        if (easing instanceof ElasticEasing) {
            return RangesKt.rangeTo(-0.3f, 2.05f);
        }
        if (easing instanceof BounceEasing) {
            return RangesKt.rangeTo(-0.25f, 1.25f);
        }
        if (easing instanceof ElasticStepEasing) {
            return RangesKt.rangeTo(-0.25f, 1.25f);
        }
        if (easing instanceof RandomEasing) {
            return RangesKt.rangeTo(-0.25f, 1.25f);
        }
        if (easing instanceof CyclicEasing) {
            return RangesKt.rangeTo(-0.5f, 1.5f);
        }
        if (easing instanceof CubicBezierEasing) {
            return RangesKt.rangeTo(-0.25f, 1.25f);
        }
        if (!(easing instanceof ReversedEasing)) {
            throw new NoWhenBranchMatchedException();
        }
        ReversedEasing reversedEasing = (ReversedEasing) easing;
        if (reversedEasing.getBaseEasing() instanceof ElasticEasing) {
            ClosedFloatingPointRange<Float> uIVisualRange = getUIVisualRange(reversedEasing.getBaseEasing());
            return RangesKt.rangeTo(0.6f - uIVisualRange.getEndInclusive().floatValue(), 0.6f - uIVisualRange.getStart().floatValue());
        }
        ClosedFloatingPointRange<Float> uIVisualRange2 = getUIVisualRange(reversedEasing.getBaseEasing());
        return RangesKt.rangeTo(1.0f - uIVisualRange2.getEndInclusive().floatValue(), 1.0f - uIVisualRange2.getStart().floatValue());
    }

    public static final Easing getUnwrapped(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        return easing instanceof ReversedEasing ? getUnwrapped(((ReversedEasing) easing).getBaseEasing()) : easing;
    }

    public static final boolean isBasic(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        Easing unwrapped = getUnwrapped(easing);
        return (unwrapped instanceof LinearEasing) || (unwrapped instanceof CubicBezierEasing);
    }

    public static final boolean isReversed(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        return easing instanceof ReversedEasing;
    }

    public static final boolean isReversible(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        return (Intrinsics.areEqual(easing, LinearEasing.INSTANCE) || (easing instanceof StepEasing) || (easing instanceof RandomEasing) || (easing instanceof CyclicEasing)) ? false : true;
    }

    public static final Easing reversed(Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "<this>");
        if (Intrinsics.areEqual(easing, LinearEasing.INSTANCE)) {
            return easing;
        }
        if (!(easing instanceof CubicBezierEasing)) {
            return easing instanceof ReversedEasing ? ((ReversedEasing) easing).getBaseEasing() : new ReversedEasing(easing);
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) easing;
        return new CubicBezierEasing(1.0f - cubicBezierEasing.getP2x(), 1.0f - cubicBezierEasing.getP2y(), 1.0f - cubicBezierEasing.getP1x(), 1.0f - cubicBezierEasing.getP1y());
    }
}
