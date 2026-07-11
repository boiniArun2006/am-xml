package androidx.compose.animation;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "animatedSize", "Landroidx/compose/ui/unit/Constraints;", "<anonymous parameter 1>", c.f62177j, "(JJ)J"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,444:1\n54#2:445\n59#2:447\n85#3:446\n90#3:448\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2\n*L\n142#1:445\n142#1:447\n142#1:446\n142#1:448\n*E\n"})
final class AnimateBoundsModifierKt$animateBounds$2 extends Lambda implements Function2<IntSize, Constraints, Constraints> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnimateBoundsModifierKt$animateBounds$2 f14939n = new AnimateBoundsModifierKt$animateBounds$2();

    AnimateBoundsModifierKt$animateBounds$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Constraints invoke(IntSize intSize, Constraints constraints) {
        return Constraints.n(n(intSize.getPackedValue(), constraints.getValue()));
    }

    public final long n(long j2, long j3) {
        return Constraints.INSTANCE.t((int) (j2 >> 32), (int) (j2 & 4294967295L));
    }
}
