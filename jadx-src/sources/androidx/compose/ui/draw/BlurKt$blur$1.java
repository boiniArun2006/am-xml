package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", c.f62177j, "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V"}, k = 3, mv = {1, 9, 0})
final class BlurKt$blur$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ Shape J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ int f31241O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ float f31242n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f31243r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ float f31244t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        n(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    public final void n(GraphicsLayerScope graphicsLayerScope) {
        float fL = graphicsLayerScope.l(this.f31242n);
        float fL2 = graphicsLayerScope.l(this.f31244t);
        graphicsLayerScope.KN((fL <= 0.0f || fL2 <= 0.0f) ? null : RenderEffectKt.n(fL, fL2, this.f31241O));
        Shape shapeN = this.J2;
        if (shapeN == null) {
            shapeN = RectangleShapeKt.n();
        }
        graphicsLayerScope.pS(shapeN);
        graphicsLayerScope.X(this.f31243r);
    }
}
