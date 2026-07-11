package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J*\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J@\u0010-\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n0)¢\u0006\u0002\b+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010\u001b\u001a\u00020A8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00108R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u001cR*\u0010R\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\b7\u0010QR0\u0010Z\u001a\u00020S2\u0006\u0010L\u001a\u00020S8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR.\u0010a\u001a\u0004\u0018\u00010[2\b\u0010L\u001a\u0004\u0018\u00010[8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b<\u0010^\"\u0004\b_\u0010`R0\u0010g\u001a\u00020b2\u0006\u0010L\u001a\u00020b8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bc\u00108\u001a\u0004\bd\u0010:\"\u0004\be\u0010fR*\u0010j\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010N\u001a\u0004\bi\u0010P\"\u0004\bC\u0010QR*\u0010l\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010N\u001a\u0004\b8\u0010P\"\u0004\bc\u0010QR*\u0010n\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010N\u001a\u0004\bm\u0010P\"\u0004\bh\u0010QR*\u0010q\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010N\u001a\u0004\bp\u0010P\"\u0004\b>\u0010QR*\u0010t\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010N\u001a\u0004\br\u0010P\"\u0004\bs\u0010QR0\u0010y\u001a\u00020u2\u0006\u0010L\u001a\u00020u8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bv\u00108\u001a\u0004\bw\u0010:\"\u0004\bx\u0010fR0\u0010|\u001a\u00020u2\u0006\u0010L\u001a\u00020u8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u00108\u001a\u0004\bz\u0010:\"\u0004\b{\u0010fR*\u0010~\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010N\u001a\u0004\b}\u0010P\"\u0004\bM\u0010QR+\u0010\u0080\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010N\u001a\u0004\b\u007f\u0010P\"\u0004\bT\u0010QR,\u0010\u0082\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u007f\u0010N\u001a\u0005\b\u0081\u0001\u0010P\"\u0004\b\\\u0010QR,\u0010\u0084\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b4\u0010N\u001a\u0005\b\u0083\u0001\u0010P\"\u0004\bI\u0010QR/\u0010\u0089\u0001\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u00138\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u0085\u0001\u0010\u001c\u001a\u0005\b\u0086\u0001\u0010\u0015\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u001cR\u0018\u0010\u008c\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u001cR4\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010L\u001a\u0005\u0018\u00010\u008d\u00018\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b!\u0010\u008e\u0001\u001a\u0005\bo\u0010\u008f\u0001\"\u0005\bF\u0010\u0090\u0001R1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0004\bx\u0010U\u001a\u0004\bv\u0010W\"\u0005\b\u0092\u0001\u0010YR&\u0010\u0093\u0001\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\be\u0010\u001c\u001a\u0005\b\u0093\u0001\u0010\u0015\"\u0006\b\u008b\u0001\u0010\u0088\u0001R\u0015\u0010\u0094\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0095\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV29;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "", "t", "()V", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "v", "(Landroid/graphics/RenderNode;I)V", "jB", "", "bzg", "()Z", "Xw", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", "size", "Z", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "te", "(Landroid/graphics/Outline;J)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "r", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "nHg", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "aYN", "()Landroid/graphics/Matrix;", "J2", "rl", "J", "getOwnerId", "()J", "Landroidx/compose/ui/graphics/CanvasHolder;", "nr", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "O", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/geometry/Size;", "Landroid/graphics/Paint;", "Uo", "Landroid/graphics/Paint;", "layerPaint", "KN", "Landroid/graphics/Matrix;", "matrix", "xMQ", "outlineIsProvided", "", "value", "mUb", "F", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()F", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "gh", "I", "ck", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "qie", "Landroidx/compose/ui/graphics/ColorFilter;", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "Landroidx/compose/ui/geometry/Offset;", "az", "getPivotOffset-F1C5BW0", "fD", "(J)V", "pivotOffset", "ty", "s7N", "scaleX", "HI", "scaleY", "p5", "translationX", "Ik", "M7", "translationY", "N", "wTp", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "o", "XQ", "iF", "ambientShadowColor", "S", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "spotShadowColor", "eF", "rotationX", "WPU", "rotationY", "nY", "rotationZ", "E2", "cameraDistance", "ViF", "rV9", "X", "(Z)V", "clip", "clipToBounds", "g", "clipToOutline", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "()Landroidx/compose/ui/graphics/RenderEffect;", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "e", "isInvalidated", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGraphicsLayerV29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,298:1\n1#2:299\n278#3:300\n65#4:301\n69#4:304\n60#5:302\n70#5:305\n85#5:308\n90#5:310\n22#6:303\n22#6:306\n54#7:307\n59#7:309\n41#8,5:311\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n*L\n86#1:300\n89#1:301\n90#1:304\n89#1:302\n90#1:305\n222#1:308\n222#1:310\n89#1:303\n90#1:306\n222#1:307\n222#1:309\n243#1:311,5\n*E\n"})
public final class GraphicsLayerV29 implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Matrix matrix;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final CanvasDrawScope canvasDrawScope;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private ColorFilter colorFilter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CanvasHolder canvasHolder;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private RenderEffect renderEffect;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean outlineIsProvided;

    public GraphicsLayerV29(long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNodeN = androidx.compose.foundation.aC.n("graphicsLayer");
        this.renderNode = renderNodeN;
        this.size = Size.INSTANCE.rl();
        renderNodeN.setClipToBounds(false);
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        v(renderNodeN, companion.n());
        this.alpha = 1.0f;
        this.blendMode = BlendMode.INSTANCE.te();
        this.pivotOffset = Offset.INSTANCE.rl();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion2 = Color.INSTANCE;
        this.ambientShadowColor = companion2.n();
        this.spotShadowColor = companion2.n();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.n();
        this.isInvalidated = true;
    }

    private final void v(RenderNode renderNode, int i2) {
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        if (CompositingStrategy.J2(i2, companion.t())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.J2(i2, companion.rl())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: E2, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean HI() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: Ik, reason: from getter */
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void J2() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void KN(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.f31728n.n(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: M7, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: N, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void O(float f3) {
        this.translationY = f3;
        this.renderNode.setTranslationY(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: S, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void T(long j2) {
        this.spotShadowColor = j2;
        this.renderNode.setSpotShadowColor(ColorKt.mUb(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void Uo(float f3) {
        this.scaleX = f3;
        this.renderNode.setScaleX(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: WPU, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void X(boolean z2) {
        this.clip = z2;
        t();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: XQ, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void Z(int x2, int y2, long size) {
        this.renderNode.setPosition(x2, y2, ((int) (size >> 32)) + x2, ((int) (4294967295L & size)) + y2);
        this.size = IntSizeKt.O(size);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix aYN() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void az(float f3) {
        this.scaleY = f3;
        this.renderNode.setScaleY(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: ck, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void e(int i2) {
        this.compositingStrategy = i2;
        jB();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: eF, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void fD(long j2) {
        this.pivotOffset = j2;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void g(boolean z2) {
        this.isInvalidated = z2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void gh(float f3) {
        this.rotationY = f3;
        this.renderNode.setRotationY(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void iF(long j2) {
        this.ambientShadowColor = j2;
        this.renderNode.setAmbientShadowColor(ColorKt.mUb(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void mUb(float f3) {
        this.rotationX = f3;
        this.renderNode.setRotationX(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: n, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: nY, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: nr, reason: from getter */
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: o, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: p5, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void qie(float f3) {
        this.rotationZ = f3;
        this.renderNode.setRotationZ(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void r(Density density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1 block) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().te(recordingCanvasBeginRecording);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawContext drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.O(density);
            drawContext.rl(layoutDirection);
            drawContext.Uo(layer);
            drawContext.xMQ(this.size);
            drawContext.gh(androidCanvas);
            block.invoke(this.canvasDrawScope);
            canvasHolder.getAndroidCanvas().te(internalCanvas);
            this.renderNode.endRecording();
            g(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    /* JADX INFO: renamed from: rV9, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void rl(float f3) {
        this.alpha = f3;
        this.renderNode.setAlpha(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: s7N, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void te(Outline outline, long outlineSize) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        t();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void ty(float f3) {
        this.translationX = f3;
        this.renderNode.setTranslationX(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void wTp(float f3) {
        this.shadowElevation = f3;
        this.renderNode.setElevation(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void xMQ(float f3) {
        this.cameraDistance = f3;
        this.renderNode.setCameraDistance(f3);
    }

    private final boolean Xw() {
        if (BlendMode.e(getBlendMode(), BlendMode.INSTANCE.te()) && getColorFilter() == null) {
            return false;
        }
        return true;
    }

    private final boolean bzg() {
        if (!CompositingStrategy.J2(getCompositingStrategy(), CompositingStrategy.INSTANCE.t()) && !Xw() && getRenderEffect() == null) {
            return false;
        }
        return true;
    }

    private final void jB() {
        if (bzg()) {
            v(this.renderNode, CompositingStrategy.INSTANCE.t());
        } else {
            v(this.renderNode, getCompositingStrategy());
        }
    }

    private final void t() {
        boolean z2;
        boolean z3 = false;
        if (getClip() && !this.outlineIsProvided) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getClip() && this.outlineIsProvided) {
            z3 = true;
        }
        if (z2 != this.clipToBounds) {
            this.clipToBounds = z2;
            this.renderNode.setClipToBounds(z2);
        }
        if (z3 != this.clipToOutline) {
            this.clipToOutline = z3;
            this.renderNode.setClipToOutline(z3);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void nHg(androidx.compose.ui.graphics.Canvas canvas) {
        AndroidCanvas_androidKt.nr(canvas).drawRenderNode(this.renderNode);
    }

    public /* synthetic */ GraphicsLayerV29(long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i2 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
