package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationSpec;", "", "rl", "Landroidx/compose/animation/core/AnimationSpec;", "t", "()Landroidx/compose/animation/core/AnimationSpec;", "SnapAnimationSpec", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "PositionalThreshold", "Landroidx/compose/animation/core/DecayAnimationSpec;", "nr", "Landroidx/compose/animation/core/DecayAnimationSpec;", c.f62177j, "()Landroidx/compose/animation/core/DecayAnimationSpec;", "DecayAnimationSpec", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1753:1\n75#2:1754\n1247#3,6:1755\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n*L\n1522#1:1754\n1523#1:1755,6\n*E\n"})
public final class AnchoredDraggableDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnchoredDraggableDefaults f16446n = new AnchoredDraggableDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final AnimationSpec SnapAnimationSpec = AnimationSpecKt.ty(0, 0, null, 7, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final Function1 PositionalThreshold = new Function1<Float, Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableDefaults$PositionalThreshold$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f3) {
            return n(f3.floatValue());
        }

        public final Float n(float f3) {
            return Float.valueOf(f3 / 2.0f);
        }
    };

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final DecayAnimationSpec DecayAnimationSpec = DecayAnimationSpecKt.t(0.0f, 0.0f, 3, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f16445O = 8;

    public final DecayAnimationSpec n() {
        return DecayAnimationSpec;
    }

    public final Function1 rl() {
        return PositionalThreshold;
    }

    public final AnimationSpec t() {
        return SnapAnimationSpec;
    }

    private AnchoredDraggableDefaults() {
    }
}
