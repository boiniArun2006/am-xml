package mA;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Shape shape, float f3, float f4, float f5, int i2, Brush brush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        Outline outlineN = shape.n(drawWithContent.t(), drawWithContent.getLayoutDirection(), drawWithContent);
        Stroke stroke = new Stroke(drawWithContent.l(f3), 0.0f, i2, 0, PathEffect.Companion.rl(PathEffect.INSTANCE, new float[]{drawWithContent.l(f4), drawWithContent.l(f5)}, 0.0f, 2, null), 10, null);
        drawWithContent.l2();
        OutlineKt.t(drawWithContent, outlineN, brush, 0.0f, stroke, null, 0, 52, null);
        return Unit.INSTANCE;
    }

    public static final Modifier nr(Modifier dashedBorder, final Brush brush, final Shape shape, final float f3, final float f4, final float f5, final int i2) {
        Intrinsics.checkNotNullParameter(dashedBorder, "$this$dashedBorder");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return DrawModifierKt.nr(dashedBorder, new Function1() { // from class: mA.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w6.O(shape, f3, f4, f5, i2, brush, (ContentDrawScope) obj);
            }
        });
    }

    public static final Modifier rl(Modifier dashedBorder, long j2, Shape shape, float f3, float f4, float f5, int i2) {
        Intrinsics.checkNotNullParameter(dashedBorder, "$this$dashedBorder");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return nr(dashedBorder, new SolidColor(j2, null), shape, f3, f4, f5, i2);
    }

    public static /* synthetic */ Modifier t(Modifier modifier, long j2, Shape shape, float f3, float f4, float f5, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f3 = Dp.KN(2);
        }
        float f6 = f3;
        if ((i3 & 8) != 0) {
            f4 = Dp.KN(4);
        }
        float f7 = f4;
        if ((i3 & 16) != 0) {
            f5 = Dp.KN(4);
        }
        return rl(modifier, j2, shape, f6, f7, f5, (i3 & 32) != 0 ? StrokeCap.INSTANCE.rl() : i2);
    }
}
