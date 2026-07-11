package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "rl", "(Landroidx/compose/ui/Modifier;FLkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ProgressSemanticsKt {
    public static final Modifier n(Modifier modifier) {
        return SemanticsModifierKt.t(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.ofS(semanticsPropertyReceiver, ProgressBarRangeInfo.INSTANCE.n());
            }
        });
    }

    public static final Modifier rl(Modifier modifier, final float f3, final ClosedFloatingPointRange closedFloatingPointRange, final int i2) {
        return SemanticsModifierKt.t(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.ofS(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) RangesKt.coerceIn(Float.valueOf(f3), (ClosedFloatingPointRange<Float>) closedFloatingPointRange)).floatValue(), closedFloatingPointRange, i2));
            }
        });
    }

    public static /* synthetic */ Modifier t(Modifier modifier, float f3, ClosedFloatingPointRange closedFloatingPointRange, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return rl(modifier, f3, closedFloatingPointRange, i2);
    }
}
