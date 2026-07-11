package androidx.compose.animation;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/Constraints;", "constraints", c.f62177j, "(JJ)J"}, k = 3, mv = {1, 9, 0})
final class AnimateBoundsModifierKt$animateBounds$1 extends Lambda implements Function2<IntSize, Constraints, Constraints> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnimateBoundsModifierKt$animateBounds$1 f14938n = new AnimateBoundsModifierKt$animateBounds$1();

    AnimateBoundsModifierKt$animateBounds$1() {
        super(2);
    }

    public final long n(long j2, long j3) {
        return j3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Constraints invoke(IntSize intSize, Constraints constraints) {
        return Constraints.n(n(intSize.getPackedValue(), constraints.getValue()));
    }
}
