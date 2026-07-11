package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a.\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a>\u0010\u001d\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001e\u0010+\u001a\u00020)*\u00020)2\u0006\u0010*\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/graphics/Shape;", "shape", "O", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "J2", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Brush;", "brush", "KN", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "gh", "(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "borderSize", "", "fillArea", "", "strokeWidthPx", "qie", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/Path;", "targetPath", "Landroidx/compose/ui/geometry/RoundRect;", "roundedRect", "strokeWidth", "mUb", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/RoundRect;FZ)Landroidx/compose/ui/graphics/Path;", "widthPx", "xMQ", "(FLandroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "az", "(JF)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,468:1\n1#2:469\n48#3:470\n53#3:473\n60#4:471\n70#4:474\n53#4,3:476\n22#5:472\n33#6:475\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n467#1:470\n467#1:473\n467#1:471\n467#1:474\n467#1:476,3\n467#1:472\n467#1:475\n*E\n"})
public final class BorderKt {
    public static final Modifier J2(Modifier modifier, float f3, long j2, Shape shape) {
        return KN(modifier, f3, new SolidColor(j2, null), shape);
    }

    public static final Modifier KN(Modifier modifier, float f3, Brush brush, Shape shape) {
        return modifier.Zmq(new BorderModifierNodeElement(f3, brush, shape, null));
    }

    public static /* synthetic */ Modifier Uo(Modifier modifier, float f3, long j2, Shape shape, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            shape = RectangleShapeKt.n();
        }
        return J2(modifier, f3, j2, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long az(long j2, float f3) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f3);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f3);
        return CornerRadius.rl((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult gh(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                n(contentDrawScope);
                return Unit.INSTANCE;
            }

            public final void n(ContentDrawScope contentDrawScope) {
                contentDrawScope.l2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult qie(CacheDrawScope cacheDrawScope, final Brush brush, long j2, long j3, boolean z2, float f3) {
        final long jT2 = z2 ? Offset.INSTANCE.t() : j2;
        final long jT3 = z2 ? cacheDrawScope.t() : j3;
        final DrawStyle stroke = z2 ? Fill.f31654n : new Stroke(f3, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                n(contentDrawScope);
                return Unit.INSTANCE;
            }

            public final void n(ContentDrawScope contentDrawScope) {
                contentDrawScope.l2();
                DrawScope.s(contentDrawScope, brush, jT2, jT3, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    public static final Modifier O(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return KN(modifier, borderStroke.getWidth(), borderStroke.getBrush(), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path mUb(Path path, RoundRect roundRect, float f3, boolean z2) {
        path.reset();
        Path.ty(path, roundRect, null, 2, null);
        if (!z2) {
            Path pathN = AndroidPath_androidKt.n();
            Path.ty(pathN, xMQ(f3, roundRect), null, 2, null);
            path.o(path, pathN, PathOperation.INSTANCE.n());
        }
        return path;
    }

    private static final RoundRect xMQ(float f3, RoundRect roundRect) {
        return new RoundRect(f3, f3, roundRect.mUb() - f3, roundRect.nr() - f3, az(roundRect.getTopLeftCornerRadius(), f3), az(roundRect.getTopRightCornerRadius(), f3), az(roundRect.getBottomRightCornerRadius(), f3), az(roundRect.getBottomLeftCornerRadius(), f3), null);
    }
}
