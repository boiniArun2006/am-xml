package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "state", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", c.f62177j, "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)Lkotlin/jvm/functions/Function2;"}, k = 3, mv = {1, 9, 0})
final class FlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1 extends Lambda implements Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function3 f17660n;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Function2 invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
        final Function3 function3 = this.f17660n;
        return ComposableLambdaKt.rl(-972285589, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                n(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-972285589, i2, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:158)");
                }
                function3.invoke(new FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        });
    }
}
