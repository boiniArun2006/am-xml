package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@DrawScopeMarker
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 b2\u00020\u0001:\u0001cJ\u001e\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006Jj\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018Jj\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJX\u0010!\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JX\u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b#\u0010$JN\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b'\u0010(Jv\u00101\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00100\u001a\u00020/H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102Jb\u00105\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b5\u00106Jb\u00107\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b7\u00108JX\u0010;\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b;\u0010<JX\u0010=\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b=\u0010>Jp\u0010C\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020A2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bC\u0010DJL\u0010G\u001a\u00020\u00162\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJL\u0010I\u001a\u00020\u00162\u0006\u0010F\u001a\u00020E2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bI\u0010JJp\u0010O\u001a\u00020\u00162\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030K2\u0006\u0010N\u001a\u00020M2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ9\u0010U\u001a\u00020\u0016*\u00020Q2\b\b\u0002\u0010\u001e\u001a\u00020+2\u0017\u0010T\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160R¢\u0006\u0002\bSH\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010:\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b]\u0010\\R\u0014\u0010a\u001a\u00020^8&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006dÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Offset;", "offset", "SR", "(JJ)J", "Landroidx/compose/ui/graphics/Brush;", "brush", TtmlNode.START, TtmlNode.END, "", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "iV", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "nO", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "size", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "y", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "o9", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "JVN", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "oz", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "EN", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "a63", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", TtmlNode.CENTER, "WH", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Toy", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "startAngle", "sweepAngle", "", "useCenter", "I9f", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", JavetError.PARAMETER_PATH, "vl", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "GD", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "uQ", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "rxp", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "mx", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "Co", "()J", "t", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "nY", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1008:1\n30#2:1009\n30#2:1011\n80#3:1010\n80#3:1012\n60#3:1014\n70#3:1018\n53#3,3:1021\n57#4:1013\n61#4:1017\n22#5:1015\n65#6:1016\n69#6:1019\n33#7:1020\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n*L\n521#1:1009\n558#1:1011\n521#1:1010\n558#1:1012\n920#1:1014\n920#1:1018\n920#1:1021,3\n920#1:1013\n920#1:1017\n920#1:1015\n920#1:1016\n920#1:1019\n920#1:1020\n*E\n"})
public interface DrawScope extends Density {

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31649n;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/BlendMode;", "rl", "I", c.f62177j, "()I", "DefaultBlendMode", "Landroidx/compose/ui/graphics/FilterQuality;", "t", "DefaultFilterQuality", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31649n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final int DefaultBlendMode = BlendMode.INSTANCE.te();

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultFilterQuality = FilterQuality.INSTANCE.n();

        public final int n() {
            return DefaultBlendMode;
        }

        public final int rl() {
            return DefaultFilterQuality;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void EN(Brush brush, long topLeft, long size, long cornerRadius, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    void GD(Path path, Brush brush, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    void I9f(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    void JVN(ImageBitmap image, long topLeft, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    void Toy(long color, float radius, long center, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    void WH(Brush brush, float radius, long center, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    void a63(long color, long topLeft, long size, long cornerRadius, DrawStyle style, float alpha, ColorFilter colorFilter, int blendMode);

    LayoutDirection getLayoutDirection();

    void iV(Brush brush, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode);

    /* JADX INFO: renamed from: mx */
    DrawContext getDrawContext();

    void nO(long color, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode);

    void o9(long color, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    void uQ(List points, int pointMode, long color, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode);

    void vl(Path path, long color, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    void y(Brush brush, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    static /* synthetic */ void EF(DrawScope drawScope, ImageBitmap imageBitmap, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.JVN(imageBitmap, (i3 & 2) != 0 ? Offset.INSTANCE.t() : j2, (i3 & 4) != 0 ? 1.0f : f3, (i3 & 8) != 0 ? Fill.f31654n : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? INSTANCE.n() : i2);
    }

    static /* synthetic */ void EWS(DrawScope drawScope, Path path, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i3 & 4) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        if ((i3 & 8) != 0) {
            drawStyle = Fill.f31654n;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        drawScope.vl(path, j2, f4, drawStyle2, colorFilter, (i3 & 32) != 0 ? INSTANCE.n() : i2);
    }

    static /* synthetic */ void Fp(DrawScope drawScope, List list, int i2, long j2, float f3, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.uQ(list, i2, j2, (i7 & 8) != 0 ? 0.0f : f3, (i7 & 16) != 0 ? StrokeCap.INSTANCE.n() : i3, (i7 & 32) != 0 ? null : pathEffect, (i7 & 64) != 0 ? 1.0f : f4, (i7 & 128) != 0 ? null : colorFilter, (i7 & 256) != 0 ? INSTANCE.n() : i5);
    }

    static /* synthetic */ void HE(DrawScope drawScope, long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f3, ColorFilter colorFilter, int i2, int i3, Object obj) {
        DrawScope drawScope2;
        long jSR;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jT2 = (i3 & 2) != 0 ? Offset.INSTANCE.t() : j3;
        if ((i3 & 4) != 0) {
            drawScope2 = drawScope;
            jSR = drawScope2.SR(drawScope.t(), jT2);
        } else {
            drawScope2 = drawScope;
            jSR = j4;
        }
        drawScope2.a63(j2, jT2, jSR, (i3 & 8) != 0 ? CornerRadius.INSTANCE.n() : j5, (i3 & 16) != 0 ? Fill.f31654n : drawStyle, (i3 & 32) != 0 ? 1.0f : f3, (i3 & 64) != 0 ? null : colorFilter, (i3 & 128) != 0 ? INSTANCE.n() : i2);
    }

    static /* synthetic */ void Lu(DrawScope drawScope, long j2, float f3, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i3 & 2) != 0) {
            f3 = Size.mUb(drawScope.t()) / 2.0f;
        }
        drawScope.Toy(j2, f3, (i3 & 4) != 0 ? drawScope.Co() : j3, (i3 & 8) != 0 ? 1.0f : f4, (i3 & 16) != 0 ? Fill.f31654n : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? INSTANCE.n() : i2);
    }

    static /* synthetic */ void QgZ(DrawScope drawScope, Brush brush, float f3, long j2, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.WH(brush, (i3 & 2) != 0 ? Size.mUb(drawScope.t()) / 2.0f : f3, (i3 & 4) != 0 ? drawScope.Co() : j2, (i3 & 8) != 0 ? 1.0f : f4, (i3 & 16) != 0 ? Fill.f31654n : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? INSTANCE.n() : i2);
    }

    static /* synthetic */ void RQ(DrawScope drawScope, long j2, float f3, float f4, boolean z2, long j3, long j4, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        DrawScope drawScope2;
        long jSR;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jT2 = (i3 & 16) != 0 ? Offset.INSTANCE.t() : j3;
        if ((i3 & 32) != 0) {
            drawScope2 = drawScope;
            jSR = drawScope2.SR(drawScope.t(), jT2);
        } else {
            drawScope2 = drawScope;
            jSR = j4;
        }
        drawScope2.I9f(j2, f3, f4, z2, jT2, jSR, (i3 & 64) != 0 ? 1.0f : f5, (i3 & 128) != 0 ? Fill.f31654n : drawStyle, (i3 & 256) != 0 ? null : colorFilter, (i3 & 512) != 0 ? INSTANCE.n() : i2);
    }

    static /* synthetic */ void Ro(DrawScope drawScope, Path path, Brush brush, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i3 & 4) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        if ((i3 & 8) != 0) {
            drawStyle = Fill.f31654n;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i3 & 32) != 0) {
            i2 = INSTANCE.n();
        }
        drawScope.GD(path, brush, f4, drawStyle2, colorFilter2, i2);
    }

    private default long SR(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L));
        return Size.nr((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    static /* synthetic */ void c32(DrawScope drawScope, Brush brush, long j2, long j3, float f3, int i2, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i3, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.iV(brush, j2, j3, (i5 & 8) != 0 ? 0.0f : f3, (i5 & 16) != 0 ? Stroke.INSTANCE.n() : i2, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f4, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? INSTANCE.n() : i3);
    }

    static /* synthetic */ void fW(DrawScope drawScope, Brush brush, long j2, long j3, long j4, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jT2 = (i3 & 2) != 0 ? Offset.INSTANCE.t() : j2;
        drawScope.EN(brush, jT2, (i3 & 4) != 0 ? drawScope.SR(drawScope.t(), jT2) : j3, (i3 & 8) != 0 ? CornerRadius.INSTANCE.n() : j4, (i3 & 16) != 0 ? 1.0f : f3, (i3 & 32) != 0 ? Fill.f31654n : drawStyle, (i3 & 64) != 0 ? null : colorFilter, (i3 & 128) != 0 ? INSTANCE.n() : i2);
    }

    static /* synthetic */ void h(DrawScope drawScope, long j2, long j3, long j4, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jT2 = (i3 & 2) != 0 ? Offset.INSTANCE.t() : j3;
        drawScope.o9(j2, jT2, (i3 & 4) != 0 ? drawScope.SR(drawScope.t(), jT2) : j4, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? Fill.f31654n : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? INSTANCE.n() : i2);
    }

    static /* synthetic */ void k(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jRl = (i5 & 2) != 0 ? IntOffset.INSTANCE.rl() : j2;
        long jT2 = (i5 & 4) != 0 ? IntSize.t((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32)) : j3;
        drawScope.oz(imageBitmap, jRl, jT2, (i5 & 8) != 0 ? IntOffset.INSTANCE.rl() : j4, (i5 & 16) != 0 ? jT2 : j5, (i5 & 32) != 0 ? 1.0f : f3, (i5 & 64) != 0 ? Fill.f31654n : drawStyle, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? INSTANCE.n() : i2, (i5 & 512) != 0 ? INSTANCE.rl() : i3);
    }

    static /* synthetic */ void mI(DrawScope drawScope, long j2, long j3, long j4, float f3, int i2, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i3, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.nO(j2, j3, j4, (i5 & 8) != 0 ? 0.0f : f3, (i5 & 16) != 0 ? Stroke.INSTANCE.n() : i2, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f4, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? INSTANCE.n() : i3);
    }

    static /* synthetic */ void qva(DrawScope drawScope, GraphicsLayer graphicsLayer, long j2, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i2 & 1) != 0) {
            j2 = IntSizeKt.nr(drawScope.t());
        }
        drawScope.rxp(graphicsLayer, j2, function1);
    }

    static /* synthetic */ void s(DrawScope drawScope, Brush brush, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jT2 = (i3 & 2) != 0 ? Offset.INSTANCE.t() : j2;
        drawScope.y(brush, jT2, (i3 & 4) != 0 ? drawScope.SR(drawScope.t(), jT2) : j3, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? Fill.f31654n : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? INSTANCE.n() : i2);
    }

    default void oz(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        k(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    default long Co() {
        return SizeKt.rl(getDrawContext().t());
    }

    default void rxp(GraphicsLayer graphicsLayer, long j2, final Function1 function1) {
        graphicsLayer.X(this, getLayoutDirection(), j2, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                n(drawScope);
                return Unit.INSTANCE;
            }

            public final void n(DrawScope drawScope) {
                DrawScope drawScope2 = this.f31651n;
                Density density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                Canvas canvasKN = drawScope.getDrawContext().KN();
                long jT2 = drawScope.getDrawContext().t();
                GraphicsLayer graphicsLayerMUb = drawScope.getDrawContext().mUb();
                Function1 function12 = function1;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvasKN2 = drawScope2.getDrawContext().KN();
                long jT3 = drawScope2.getDrawContext().t();
                GraphicsLayer graphicsLayerMUb2 = drawScope2.getDrawContext().mUb();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.O(density);
                drawContext.rl(layoutDirection);
                drawContext.gh(canvasKN);
                drawContext.xMQ(jT2);
                drawContext.Uo(graphicsLayerMUb);
                canvasKN.O();
                try {
                    function12.invoke(drawScope2);
                } finally {
                    canvasKN.n();
                    DrawContext drawContext2 = drawScope2.getDrawContext();
                    drawContext2.O(density2);
                    drawContext2.rl(layoutDirection2);
                    drawContext2.gh(canvasKN2);
                    drawContext2.xMQ(jT3);
                    drawContext2.Uo(graphicsLayerMUb2);
                }
            }
        });
    }

    default long t() {
        return getDrawContext().t();
    }
}
