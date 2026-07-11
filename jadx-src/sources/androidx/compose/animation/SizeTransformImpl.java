package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012<\u0010\u000b\u001a8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0004¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012RM\u0010\u000b\u001a8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/SizeTransformImpl;", "Landroidx/compose/animation/SizeTransform;", "", "clip", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "rl", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;", c.f62177j, "Z", "()Z", "Lkotlin/jvm/functions/Function2;", "getSizeAnimationSpec", "()Lkotlin/jvm/functions/Function2;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SizeTransformImpl implements SizeTransform {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean clip;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function2 sizeAnimationSpec;

    @Override // androidx.compose.animation.SizeTransform
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.animation.SizeTransform
    public FiniteAnimationSpec rl(long initialSize, long targetSize) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.rl(initialSize), IntSize.rl(targetSize));
    }

    public SizeTransformImpl(boolean z2, Function2 function2) {
        this.clip = z2;
        this.sizeAnimationSpec = function2;
    }
}
