package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "", "scale", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/pullrefresh/PullRefreshState;Z)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PullRefreshIndicatorTransformKt {
    public static final Modifier n(Modifier modifier, final PullRefreshState pullRefreshState, final boolean z2) {
        return GraphicsLayerModifierKt.n(DrawModifierKt.nr(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                n(contentDrawScope);
                return Unit.INSTANCE;
            }

            public final void n(ContentDrawScope contentDrawScope) {
                int iRl = ClipOp.INSTANCE.rl();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jT2 = drawContext.t();
                drawContext.KN().O();
                try {
                    drawContext.getTransform().rl(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iRl);
                    contentDrawScope.l2();
                } finally {
                    drawContext.KN().n();
                    drawContext.xMQ(jT2);
                }
            }
        }), new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                n(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            public final void n(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.O(pullRefreshState.xMQ() - Size.xMQ(graphicsLayerScope.t()));
                if (!z2 || pullRefreshState.gh()) {
                    return;
                }
                float fN = EasingKt.J2().n(pullRefreshState.xMQ() / pullRefreshState.qie());
                if (fN < 0.0f) {
                    fN = 0.0f;
                }
                if (fN > 1.0f) {
                    fN = 1.0f;
                }
                graphicsLayerScope.Uo(fN);
                graphicsLayerScope.az(fN);
            }
        });
    }
}
