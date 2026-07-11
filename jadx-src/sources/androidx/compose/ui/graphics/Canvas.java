package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J$\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J*\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J7\u0010/\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b/\u00100JG\u00103\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b3\u00104J*\u00107\u001a\u00020\u00022\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b7\u00108JO\u0010=\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010<\u001a\u00020;2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b?\u0010@J*\u0010D\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bD\u0010EJJ\u0010L\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020F2\b\b\u0002\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ0\u0010R\u001a\u00020\u00022\u0006\u0010O\u001a\u00020N2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020*0P2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0002H&¢\u0006\u0004\bT\u0010\u0004J\u000f\u0010U\u001a\u00020\u0002H&¢\u0006\u0004\bU\u0010\u0004ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006VÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "", "O", "()V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "HI", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "nr", "(FF)V", "sx", "sy", "J2", "degrees", "Ik", "(F)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Z", "([F)V", "rect", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "XQ", "(Landroidx/compose/ui/geometry/Rect;I)V", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "rl", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", JavetError.PARAMETER_PATH, "t", "(Landroidx/compose/ui/graphics/Path;I)V", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "ck", "(JJLandroidx/compose/ui/graphics/Paint;)V", "Uo", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "aYN", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", TtmlNode.CENTER, "radius", "WPU", "(JFLandroidx/compose/ui/graphics/Paint;)V", "startAngle", "sweepAngle", "", "useCenter", "qie", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "S", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "mUb", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "xMQ", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "KN", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "az", "o", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/ui/graphics/Canvas\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,540:1\n30#2:541\n80#3:542\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/ui/graphics/Canvas\n*L\n494#1:541\n494#1:542\n*E\n"})
public interface Canvas {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void HI(Rect bounds, Paint paint);

    void Ik(float degrees);

    void J2(float sx, float sy);

    void KN(int pointMode, List points, Paint paint);

    void O();

    void S(Path path, Paint paint);

    void Uo(float left, float top, float right, float bottom, Paint paint);

    void WPU(long center, float radius, Paint paint);

    void Z(float[] matrix);

    void aYN(float left, float top, float right, float bottom, float radiusX, float radiusY, Paint paint);

    void az();

    void ck(long p1, long p2, Paint paint);

    void mUb(ImageBitmap image, long topLeftOffset, Paint paint);

    void n();

    void nr(float dx, float dy);

    void o();

    void qie(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint);

    void rl(float left, float top, float right, float bottom, int clipOp);

    void t(Path path, int clipOp);

    void xMQ(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, Paint paint);

    static /* synthetic */ void gh(Canvas canvas, Path path, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i3 & 2) != 0) {
            i2 = ClipOp.INSTANCE.rl();
        }
        canvas.t(path, i2);
    }

    static /* synthetic */ void r(Canvas canvas, Rect rect, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i3 & 2) != 0) {
            i2 = ClipOp.INSTANCE.rl();
        }
        canvas.XQ(rect, i2);
    }

    static /* synthetic */ void ty(Canvas canvas, float f3, float f4, float f5, float f6, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i3 & 16) != 0) {
            i2 = ClipOp.INSTANCE.rl();
        }
        canvas.rl(f3, f4, f5, f6, i2);
    }

    default void XQ(Rect rect, int clipOp) {
        rl(rect.getLeft(), rect.getTop(), rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rect.xMQ(), clipOp);
    }
}
