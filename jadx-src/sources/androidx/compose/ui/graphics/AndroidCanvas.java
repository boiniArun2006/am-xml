package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J:\u0010+\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\"\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0014\u00102\u001a\u000201*\u00020)ø\u0001\u0000¢\u0006\u0004\b2\u00103J*\u00106\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J7\u00108\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u00109JG\u0010<\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010=J*\u0010@\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJO\u0010F\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u00162\u0006\u0010E\u001a\u00020D2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\t2\u0006\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010IJ*\u0010M\u001a\u00020\t2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJB\u0010U\u001a\u00020\t2\u0006\u0010K\u001a\u00020J2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020O2\u0006\u0010T\u001a\u00020Q2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ0\u0010Y\u001a\u00020\t2\u0006\u0010X\u001a\u00020W2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\tH\u0016¢\u0006\u0004\b[\u0010\u0003J\u000f\u0010\\\u001a\u00020\tH\u0016¢\u0006\u0004\b\\\u0010\u0003R,\u0010e\u001a\u00060]j\u0002`^8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010_\u0012\u0004\bd\u0010\u0003\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010g\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006j"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "Landroidx/compose/ui/geometry/Offset;", "points", "Landroidx/compose/ui/graphics/Paint;", "paint", "", "nY", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "", "stepBy", "ViF", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;I)V", "O", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/geometry/Rect;", "bounds", "HI", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "nr", "(FF)V", "sx", "sy", "J2", "degrees", "Ik", "(F)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Z", "([F)V", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "rl", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", JavetError.PARAMETER_PATH, "t", "(Landroidx/compose/ui/graphics/Path;I)V", "Landroid/graphics/Region$Op;", "iF", "(I)Landroid/graphics/Region$Op;", "p1", "p2", "ck", "(JJLandroidx/compose/ui/graphics/Paint;)V", "Uo", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "aYN", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", TtmlNode.CENTER, "radius", "WPU", "(JFLandroidx/compose/ui/graphics/Paint;)V", "startAngle", "sweepAngle", "", "useCenter", "qie", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "S", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "mUb", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "xMQ", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "KN", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "az", "o", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "g", "()Landroid/graphics/Canvas;", "te", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n36#2,5:373\n36#2,5:388\n65#3:378\n69#3:381\n65#3:383\n69#3:386\n65#3:393\n69#3:396\n65#3:411\n69#3:414\n65#3:417\n69#3:420\n60#4:379\n70#4:382\n60#4:384\n70#4:387\n60#4:394\n70#4:397\n85#4:400\n90#4:402\n85#4:404\n90#4:406\n60#4:412\n70#4:415\n60#4:418\n70#4:421\n22#5:380\n22#5:385\n22#5:395\n22#5:398\n22#5:413\n22#5:419\n54#6:399\n59#6:401\n54#6:403\n59#6:405\n34#7,4:407\n39#7:416\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n128#1:373,5\n199#1:388,5\n139#1:378\n139#1:381\n172#1:383\n172#1:386\n206#1:393\n207#1:396\n271#1:411\n271#1:414\n293#1:417\n293#1:420\n139#1:379\n139#1:382\n172#1:384\n172#1:387\n206#1:394\n207#1:397\n233#1:400\n234#1:402\n239#1:404\n240#1:406\n271#1:412\n271#1:415\n293#1:418\n293#1:421\n139#1:380\n172#1:385\n206#1:395\n207#1:398\n271#1:413\n293#1:419\n233#1:399\n234#1:401\n239#1:403\n240#1:405\n270#1:407,4\n270#1:416\n*E\n"})
public final class AndroidCanvas implements Canvas {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.f31393n;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Rect srcRect;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Rect dstRect;

    @Override // androidx.compose.ui.graphics.Canvas
    public void HI(androidx.compose.ui.geometry.Rect bounds, Paint paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), bounds.xMQ(), paint.getInternalPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void Ik(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void J2(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void KN(int pointMode, List points, Paint paint) {
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.J2(pointMode, companion.n())) {
            ViF(points, paint, 2);
        } else if (PointMode.J2(pointMode, companion.t())) {
            ViF(points, paint, 1);
        } else if (PointMode.J2(pointMode, companion.rl())) {
            nY(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void O() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void S(Path path, Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void Uo(float left, float top, float right, float bottom, Paint paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void WPU(long center, float radius, Paint paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (center >> 32)), Float.intBitsToFloat((int) (center & 4294967295L)), radius, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void aYN(float left, float top, float right, float bottom, float radiusX, float radiusY, Paint paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void az() {
        CanvasUtils.f31431n.n(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void ck(long p1, long p2, Paint paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) (p1 & 4294967295L)), Float.intBitsToFloat((int) (p2 >> 32)), Float.intBitsToFloat((int) (p2 & 4294967295L)), paint.getInternalPaint());
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final Region.Op iF(int i2) {
        return ClipOp.O(i2, ClipOp.INSTANCE.n()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void mUb(ImageBitmap image, long topLeftOffset, Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.rl(image), Float.intBitsToFloat((int) (topLeftOffset >> 32)), Float.intBitsToFloat((int) (topLeftOffset & 4294967295L)), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void n() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void nr(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void o() {
        CanvasUtils.f31431n.n(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void qie(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rl(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, iF(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void t(Path path, int clipOp) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), iF(clipOp));
    }

    public final void te(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void xMQ(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapRl = AndroidImageBitmap_androidKt.rl(image);
        Rect rect = this.srcRect;
        Intrinsics.checkNotNull(rect);
        rect.left = IntOffset.gh(srcOffset);
        rect.top = IntOffset.qie(srcOffset);
        rect.right = IntOffset.gh(srcOffset) + ((int) (srcSize >> 32));
        rect.bottom = IntOffset.qie(srcOffset) + ((int) (srcSize & 4294967295L));
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.dstRect;
        Intrinsics.checkNotNull(rect2);
        rect2.left = IntOffset.gh(dstOffset);
        rect2.top = IntOffset.qie(dstOffset);
        rect2.right = IntOffset.gh(dstOffset) + ((int) (dstSize >> 32));
        rect2.bottom = IntOffset.qie(dstOffset) + ((int) (dstSize & 4294967295L));
        canvas.drawBitmap(bitmapRl, rect, rect2, paint.getInternalPaint());
    }

    private final void ViF(List points, Paint paint, int stepBy) {
        if (points.size() >= 2) {
            android.graphics.Paint paintG = paint.getInternalPaint();
            int i2 = 0;
            while (i2 < points.size() - 1) {
                long packedValue = ((Offset) points.get(i2)).getPackedValue();
                long packedValue2 = ((Offset) points.get(i2 + 1)).getPackedValue();
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (packedValue >> 32)), Float.intBitsToFloat((int) (packedValue & 4294967295L)), Float.intBitsToFloat((int) (packedValue2 >> 32)), Float.intBitsToFloat((int) (packedValue2 & 4294967295L)), paintG);
                i2 += stepBy;
            }
        }
    }

    private final void nY(List points, Paint paint) {
        int size = points.size();
        for (int i2 = 0; i2 < size; i2++) {
            long packedValue = ((Offset) points.get(i2)).getPackedValue();
            this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (packedValue >> 32)), Float.intBitsToFloat((int) (packedValue & 4294967295L)), paint.getInternalPaint());
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void Z(float[] matrix) {
        if (!MatrixKt.n(matrix)) {
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            AndroidMatrixConversions_androidKt.n(matrix2, matrix);
            this.internalCanvas.concat(matrix2);
        }
    }
}
