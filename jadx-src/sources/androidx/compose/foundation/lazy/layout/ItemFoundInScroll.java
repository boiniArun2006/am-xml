package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "previousAnimation", "<init>", "(ILandroidx/compose/animation/core/AnimationState;)V", c.f62177j, "I", "()I", "t", "Landroidx/compose/animation/core/AnimationState;", "rl", "()Landroidx/compose/animation/core/AnimationState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ItemFoundInScroll extends CancellationException {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int itemOffset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AnimationState previousAnimation;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getItemOffset() {
        return this.itemOffset;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final AnimationState getPreviousAnimation() {
        return this.previousAnimation;
    }

    public ItemFoundInScroll(int i2, AnimationState animationState) {
        this.itemOffset = i2;
        this.previousAnimation = animationState;
    }
}
