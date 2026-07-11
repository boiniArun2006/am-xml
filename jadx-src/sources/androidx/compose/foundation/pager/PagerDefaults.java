package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0003\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "snapPositionalThreshold", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", c.f62177j, "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rl", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,592:1\n96#2,5:593\n75#3:598\n75#3:599\n1247#4,6:600\n1247#4,6:606\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n385#1:593,5\n389#1:598\n390#1:599\n391#1:600,6\n434#1:606,6\n*E\n"})
public final class PagerDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PagerDefaults f18854n = new PagerDefaults();
    public static final int rl = 0;

    public final TargetedFlingBehavior n(final PagerState pagerState, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec, final float f3, Composer composer, int i2, int i3) {
        boolean z2 = true;
        if ((i3 & 2) != 0) {
            pagerSnapDistance = PagerSnapDistance.INSTANCE.n(1);
        }
        if ((i3 & 4) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rl(composer, 0);
        }
        if ((i3 & 8) != 0) {
            animationSpec = AnimationSpecKt.qie(0.0f, 400.0f, Float.valueOf(VisibilityThresholdsKt.rl(IntCompanionObject.INSTANCE)), 1, null);
        }
        if ((i3 & 16) != 0) {
            f3 = 0.5f;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1559769181, i2, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:383)");
        }
        if (!(0.0f <= f3 && f3 <= 1.0f)) {
            InlineClassHelperKt.n("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f3);
        }
        Object obj = (Density) composer.ty(CompositionLocalsKt.J2());
        final LayoutDirection layoutDirection = (LayoutDirection) composer.ty(CompositionLocalsKt.az());
        boolean zP5 = ((((i2 & 14) ^ 6) > 4 && composer.p5(pagerState)) || (i2 & 6) == 4) | composer.p5(decayAnimationSpec) | composer.p5(animationSpec);
        if ((((i2 & 112) ^ 48) <= 32 || !composer.p5(pagerSnapDistance)) && (i2 & 48) != 32) {
            z2 = false;
        }
        boolean zP52 = zP5 | z2 | composer.p5(obj) | composer.p5(layoutDirection);
        Object objIF = composer.iF();
        if (zP52 || objIF == Composer.INSTANCE.n()) {
            objIF = SnapFlingBehaviorKt.HI(PagerSnapLayoutInfoProviderKt.n(pagerState, pagerSnapDistance, new Function3<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Float invoke(Float f4, Float f5, Float f6) {
                    return n(f4.floatValue(), f5.floatValue(), f6.floatValue());
                }

                public final Float n(float f4, float f5, float f6) {
                    return Float.valueOf(PagerSnapLayoutInfoProviderKt.t(pagerState, layoutDirection, f3, f4, f5, f6));
                }
            }), decayAnimationSpec, animationSpec);
            composer.o(objIF);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return targetedFlingBehavior;
    }

    private PagerDefaults() {
    }

    public final NestedScrollConnection rl(PagerState pagerState, Orientation orientation, Composer composer, int i2) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(877583120, i2, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:432)");
        }
        boolean z3 = false;
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(pagerState)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i2 & 112) ^ 48) > 32 && composer.p5(orientation)) || (i2 & 48) == 32) {
            z3 = true;
        }
        boolean z4 = z2 | z3;
        Object objIF = composer.iF();
        if (z4 || objIF == Composer.INSTANCE.n()) {
            objIF = new DefaultPagerNestedScrollConnection(pagerState, orientation);
            composer.o(objIF);
        }
        DefaultPagerNestedScrollConnection defaultPagerNestedScrollConnection = (DefaultPagerNestedScrollConnection) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultPagerNestedScrollConnection;
    }
}
