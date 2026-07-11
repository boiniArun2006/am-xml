package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatableSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.StartOffsetType;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", c.f62177j, "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
final class Utils_androidKt$createTransitionInfo$startTimeMs$2 extends Lambda implements Function0<Long> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f34100n;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Long invoke() {
        AnimationSpec animationSpec = this.f34100n;
        return Long.valueOf((animationSpec instanceof TweenSpec ? Integer.valueOf(((TweenSpec) animationSpec).getDelay()) : animationSpec instanceof SnapSpec ? Integer.valueOf(((SnapSpec) animationSpec).getDelay()) : animationSpec instanceof KeyframesSpec ? Integer.valueOf(((KeyframesSpec) animationSpec).getConfig().getDelayMillis()) : animationSpec instanceof RepeatableSpec ? StartOffsetType.O(StartOffset.Uo(((RepeatableSpec) animationSpec).getInitialStartOffset()), StartOffsetType.INSTANCE.n()) ? Integer.valueOf(StartOffset.J2(((RepeatableSpec) this.f34100n).getInitialStartOffset())) : 0L : animationSpec instanceof InfiniteRepeatableSpec ? StartOffsetType.O(StartOffset.Uo(((InfiniteRepeatableSpec) animationSpec).getInitialStartOffset()), StartOffsetType.INSTANCE.n()) ? Integer.valueOf(StartOffset.J2(((InfiniteRepeatableSpec) this.f34100n).getInitialStartOffset())) : 0L : animationSpec instanceof VectorizedDurationBasedAnimationSpec ? Integer.valueOf(((VectorizedDurationBasedAnimationSpec) animationSpec).getDelayMillis()) : 0L).longValue());
    }
}
