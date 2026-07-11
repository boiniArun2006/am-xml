package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R \u0010\u0016\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/carousel/CarouselDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/carousel/CarouselState;", "state", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "O", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "nr", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "t", "()F", "MinSmallItemSize", "MaxSmallItemSize", c.f62177j, "AnchorSize", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,693:1\n1223#2,6:694\n148#3:700\n148#3:701\n148#3:702\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselDefaults\n*L\n675#1:694,6\n685#1:700\n688#1:701\n690#1:702\n*E\n"})
public final class CarouselDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CarouselDefaults f28872n = new CarouselDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float MinSmallItemSize = Dp.KN(40);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float MaxSmallItemSize = Dp.KN(56);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float AnchorSize = Dp.KN(10);

    public final TargetedFlingBehavior O(CarouselState carouselState, AnimationSpec animationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if (ComposerKt.v()) {
            ComposerKt.p5(1701587199, i2, -1, "androidx.compose.material3.carousel.CarouselDefaults.singleAdvanceFlingBehavior (Carousel.kt:611)");
        }
        TargetedFlingBehavior targetedFlingBehaviorN = PagerDefaults.f18854n.n(carouselState.getPagerState(), PagerSnapDistance.INSTANCE.n(1), null, animationSpec2, 0.0f, composer, ((i2 << 6) & 7168) | (PagerDefaults.rl << 15), 20);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return targetedFlingBehaviorN;
    }

    public final float n() {
        return AnchorSize;
    }

    public final float rl() {
        return MaxSmallItemSize;
    }

    public final float t() {
        return MinSmallItemSize;
    }

    private CarouselDefaults() {
    }

    public final TargetedFlingBehavior nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-418415756, i2, -1, "androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior (Carousel.kt:673)");
        }
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.carousel.CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float n(float velocity) {
                    return 0.0f;
                }
            };
            composer.o(objIF);
        }
        TargetedFlingBehavior targetedFlingBehaviorTy = SnapFlingBehaviorKt.ty((CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1) objIF, composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return targetedFlingBehaviorTy;
    }
}
