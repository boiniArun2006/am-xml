package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", c.f62177j, "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,958:1\n30#2:959\n80#3:960\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideOutOfContainer$1\n*L\n521#1:959\n521#1:960\n*E\n"})
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$1 extends Lambda implements Function1<Integer, Integer> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ AnimatedContentTransitionScopeImpl f15013n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Function1 f15014t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return n(num.intValue());
    }

    public final Integer n(int i2) {
        State state = (State) this.f15013n.getTargetSizeMap().O(this.f15013n.getTransition().Ik());
        long j2 = i2;
        return (Integer) this.f15014t.invoke(Integer.valueOf((-IntOffset.gh(this.f15013n.Uo(IntSize.t((j2 & 4294967295L) | (j2 << 32)), state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.n()))) - i2));
    }
}
