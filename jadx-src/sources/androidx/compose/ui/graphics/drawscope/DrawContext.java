package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\"\u0010\u0007\u001a\u00020\u00028&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawContext;", "", "Landroidx/compose/ui/geometry/Size;", "t", "()J", "xMQ", "(J)V", "size", "Landroidx/compose/ui/graphics/Canvas;", "<anonymous parameter 0>", "KN", "()Landroidx/compose/ui/graphics/Canvas;", "gh", "(Landroidx/compose/ui/graphics/Canvas;)V", "canvas", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "J2", "()Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "transform", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "rl", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "O", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "mUb", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Uo", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "graphicsLayer", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DrawContext {
    DrawTransform J2();

    default void O(Density density) {
    }

    default void Uo(GraphicsLayer graphicsLayer) {
    }

    default void gh(Canvas canvas) {
    }

    default GraphicsLayer mUb() {
        return null;
    }

    default void rl(LayoutDirection layoutDirection) {
    }

    long t();

    void xMQ(long j2);

    default Canvas KN() {
        return EmptyCanvas.f31653n;
    }

    default LayoutDirection getLayoutDirection() {
        return LayoutDirection.f34160n;
    }

    default Density getDensity() {
        return DrawContextKt.n();
    }
}
