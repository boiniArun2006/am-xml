package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawContext;", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "rl", "(Landroidx/compose/ui/graphics/drawscope/DrawContext;)Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform rl(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void KN(float degrees, long pivot) {
                Canvas canvasKN = drawContext.KN();
                int i2 = (int) (pivot >> 32);
                int i3 = (int) (pivot & 4294967295L);
                canvasKN.nr(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                canvasKN.Ik(degrees);
                canvasKN.nr(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void Uo(float scaleX, float scaleY, long pivot) {
                Canvas canvasKN = drawContext.KN();
                int i2 = (int) (pivot >> 32);
                int i3 = (int) (pivot & 4294967295L);
                canvasKN.nr(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                canvasKN.J2(scaleX, scaleY);
                canvasKN.nr(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
            }

            public long mUb() {
                return drawContext.t();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void n(float[] matrix) {
                drawContext.KN().Z(matrix);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void nr(float left, float top) {
                drawContext.KN().nr(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void rl(float left, float top, float right, float bottom, int clipOp) {
                drawContext.KN().rl(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void t(Path path, int clipOp) {
                drawContext.KN().t(path, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void xMQ(float left, float top, float right, float bottom) {
                Canvas canvasKN = drawContext.KN();
                DrawContext drawContext2 = drawContext;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mUb() >> 32)) - (right + left);
                long jNr = Size.nr((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (mUb() & 4294967295L)) - (bottom + top))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
                if (!(Float.intBitsToFloat((int) (jNr >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jNr & 4294967295L)) >= 0.0f)) {
                    InlineClassHelperKt.n("Width and height must be greater than or equal to zero");
                }
                drawContext2.xMQ(jNr);
                canvasKN.nr(left, top);
            }
        };
    }
}
