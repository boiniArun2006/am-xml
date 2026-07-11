package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", "target", "Landroidx/compose/foundation/interaction/Interaction;", "from", "to", "", "nr", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Easing;", c.f62177j, "Landroidx/compose/animation/core/Easing;", "OutgoingSpecEasing", "Landroidx/compose/animation/core/TweenSpec;", "rl", "Landroidx/compose/animation/core/TweenSpec;", "DefaultIncomingSpec", "t", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ElevationKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Easing f29192n;
    private static final TweenSpec nr;
    private static final TweenSpec rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final TweenSpec f29193t;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        f29192n = cubicBezierEasing;
        rl = new TweenSpec(b.f61769v, 0, EasingKt.nr(), 2, null);
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i3 = 0;
        f29193t = new TweenSpec(150, i3, cubicBezierEasing, i2, defaultConstructorMarker);
        nr = new TweenSpec(b.f61769v, i3, cubicBezierEasing, i2, defaultConstructorMarker);
    }

    public static final Object nr(Animatable animatable, float f3, Interaction interaction, Interaction interaction2, Continuation continuation) {
        AnimationSpec animationSpecN = interaction2 != null ? ElevationDefaults.f29191n.n(interaction2) : interaction != null ? ElevationDefaults.f29191n.rl(interaction) : null;
        if (animationSpecN != null) {
            Object objJ2 = Animatable.J2(animatable, Dp.nr(f3), animationSpecN, null, null, continuation, 12, null);
            return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
        }
        Object objXQ = animatable.XQ(Dp.nr(f3), continuation);
        return objXQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objXQ : Unit.INSTANCE;
    }
}
