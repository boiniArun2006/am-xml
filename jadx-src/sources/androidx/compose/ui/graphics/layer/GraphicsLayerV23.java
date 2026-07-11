package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u0098\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010%\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J@\u00101\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0-¢\u0006\u0002\b/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u0015J\u000f\u0010;\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010=R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010 R\u001c\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bN\u0010=R0\u0010\r\u001a\u00020\f2\u0006\u0010O\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\u0010R0\u0010Y\u001a\u00020U2\u0006\u0010O\u001a\u00020U8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010\u0010R.\u0010`\u001a\u0004\u0018\u00010Z2\b\u0010O\u001a\u0004\u0018\u00010Z8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\bA\u0010]\"\u0004\b^\u0010_R*\u0010g\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\b<\u0010fR\u0016\u0010i\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010 R0\u0010n\u001a\u00020j2\u0006\u0010O\u001a\u00020j8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u0010=\u001a\u0004\bk\u0010?\"\u0004\bl\u0010mR*\u0010q\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010c\u001a\u0004\bp\u0010e\"\u0004\bF\u0010fR*\u0010r\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010c\u001a\u0004\b=\u0010e\"\u0004\b[\u0010fR*\u0010t\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010c\u001a\u0004\bs\u0010e\"\u0004\bb\u0010fR*\u0010v\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010c\u001a\u0004\bu\u0010e\"\u0004\bC\u0010fR*\u0010z\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010c\u001a\u0004\bx\u0010e\"\u0004\by\u0010fR0\u0010~\u001a\u00020{2\u0006\u0010O\u001a\u00020{8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b|\u0010=\u001a\u0004\bw\u0010?\"\u0004\b}\u0010mR2\u0010\u0081\u0001\u001a\u00020{2\u0006\u0010O\u001a\u00020{8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0004\b\u007f\u0010=\u001a\u0004\b|\u0010?\"\u0005\b\u0080\u0001\u0010mR,\u0010\u0083\u0001\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b8\u0010c\u001a\u0005\b\u0082\u0001\u0010e\"\u0004\bN\u0010fR,\u0010\u0085\u0001\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u0084\u0001\u0010c\u001a\u0004\b\u007f\u0010e\"\u0004\bP\u0010fR-\u0010\u0087\u0001\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0086\u0001\u0010c\u001a\u0005\b\u0086\u0001\u0010e\"\u0004\bV\u0010fR-\u0010\u008a\u0001\u001a\u00020a2\u0006\u0010O\u001a\u00020a8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0088\u0001\u0010c\u001a\u0005\b\u0089\u0001\u0010e\"\u0004\bL\u0010fR.\u0010\u008e\u0001\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0004\b%\u0010 \u001a\u0005\b\u008b\u0001\u0010\u0013\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010 R\u0017\u0010\u0090\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010 R*\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u0089\u0001\u0010\u0092\u0001\u001a\u0005\bo\u0010\u0093\u0001\"\u0005\bI\u0010\u0094\u0001R&\u0010\u0096\u0001\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\bT\u0010 \u001a\u0005\b\u0096\u0001\u0010\u0013\"\u0006\b\u0088\u0001\u0010\u008d\u0001R\u0015\u0010\u0097\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0099\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroid/view/View;", "ownerView", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "", "v", "(I)V", "", "Xw", "()Z", "jB", "()V", "t", "Landroid/view/RenderNode;", "renderNode", "U", "(Landroid/view/RenderNode;)V", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", "size", "Z", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "te", "(Landroid/graphics/Outline;J)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "r", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "nHg", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "aYN", "()Landroid/graphics/Matrix;", "J2", "rV9", "rl", "J", "getOwnerId", "()J", "Landroidx/compose/ui/graphics/CanvasHolder;", "nr", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "O", "Landroid/view/RenderNode;", "Landroid/graphics/Paint;", "Uo", "Landroid/graphics/Paint;", "layerPaint", "KN", "Landroid/graphics/Matrix;", "matrix", "xMQ", "outlineIsProvided", "mUb", "value", "gh", "I", "o", "()I", "e", "Landroidx/compose/ui/graphics/BlendMode;", "qie", "ck", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "az", "Landroidx/compose/ui/graphics/ColorFilter;", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "", "ty", "F", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()F", "(F)V", "alpha", "HI", "shouldManuallySetCenterPivot", "Landroidx/compose/ui/geometry/Offset;", "getPivotOffset-F1C5BW0", "fD", "(J)V", "pivotOffset", "Ik", "s7N", "scaleX", "scaleY", "p5", "translationX", "M7", "translationY", "XQ", "N", "wTp", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "S", "iF", "ambientShadowColor", "WPU", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "spotShadowColor", "eF", "rotationX", "ViF", "rotationY", "nY", "rotationZ", "g", "E2", "cameraDistance", "bzg", "X", "(Z)V", "clip", "clipToBounds", "clipToOutline", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "()Landroidx/compose/ui/graphics/RenderEffect;", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "isInvalidated", "hasDisplayList", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGraphicsLayerV23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,426:1\n1#2:427\n278#3:428\n54#4:429\n59#4:431\n54#4:439\n59#4:441\n54#4:443\n59#4:445\n54#4:447\n59#4:449\n85#5:430\n90#5:432\n60#5:434\n70#5:437\n85#5:440\n90#5:442\n85#5:444\n90#5:446\n85#5:448\n90#5:450\n65#6:433\n69#6:436\n22#7:435\n22#7:438\n41#8,3:451\n44#8,2:480\n305#9,26:454\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n*L\n181#1:428\n183#1:429\n184#1:431\n295#1:439\n295#1:441\n298#1:443\n299#1:445\n325#1:447\n326#1:449\n183#1:430\n184#1:432\n187#1:434\n188#1:437\n295#1:440\n295#1:442\n298#1:444\n299#1:446\n325#1:448\n326#1:450\n187#1:433\n188#1:436\n187#1:435\n188#1:438\n329#1:451,3\n329#1:480,2\n330#1:454,26\n*E\n"})
public final class GraphicsLayerV23 implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static boolean f31681T;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private RenderEffect renderEffect;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Matrix matrix;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private ColorFilter colorFilter;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private long outlineSize;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final CanvasDrawScope canvasDrawScope;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CanvasHolder canvasHolder;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean outlineIsProvided;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final AtomicBoolean f31680N = new AtomicBoolean(true);

    public GraphicsLayerV23(View view, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        IntSize.Companion companion = IntSize.INSTANCE;
        this.size = companion.n();
        this.outlineSize = companion.n();
        if (f31680N.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            U(renderNodeCreate);
            rV9();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f31681T) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        CompositingStrategy.Companion companion2 = CompositingStrategy.INSTANCE;
        v(companion2.n());
        this.compositingStrategy = companion2.n();
        this.blendMode = BlendMode.INSTANCE.te();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.INSTANCE.rl();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion3 = Color.INSTANCE;
        this.ambientShadowColor = companion3.n();
        this.spotShadowColor = companion3.n();
        this.cameraDistance = 8.0f;
        this.isInvalidated = true;
    }

    private final void U(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.f31731n;
            renderNodeVerificationHelper28.t(renderNode, renderNodeVerificationHelper28.n(renderNode));
            renderNodeVerificationHelper28.nr(renderNode, renderNodeVerificationHelper28.rl(renderNode));
        }
    }

    private final void v(int compositingStrategy) {
        RenderNode renderNode = this.renderNode;
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        if (CompositingStrategy.J2(compositingStrategy, companion.t())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.J2(compositingStrategy, companion.rl())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
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
        return this.renderNode.isValid();
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
    public void KN(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j2;
            RenderNodeVerificationHelper28.f31731n.nr(this.renderNode, ColorKt.mUb(j2));
        }
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
        int i2 = (int) (size >> 32);
        int i3 = (int) (4294967295L & size);
        this.renderNode.setLeftTopRightBottom(x2, y2, x2 + i2, y2 + i3);
        if (IntSize.O(this.size, size)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(i2 / 2.0f);
            this.renderNode.setPivotY(i3 / 2.0f);
        }
        this.size = size;
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

    /* JADX INFO: renamed from: bzg, reason: from getter */
    public boolean getClip() {
        return this.clip;
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
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.renderNode.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j2;
            RenderNodeVerificationHelper28.f31731n.t(this.renderNode, ColorKt.mUb(j2));
        }
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
        this.renderNode.setRotation(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void r(Density density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1 block) {
        Canvas canvasStart = this.renderNode.start(Math.max((int) (this.size >> 32), (int) (this.outlineSize >> 32)), Math.max((int) (this.size & 4294967295L), (int) (this.outlineSize & 4294967295L)));
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().te(canvasStart);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
            long jO = IntSizeKt.O(this.size);
            Density density2 = canvasDrawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvasKN = canvasDrawScope.getDrawContext().KN();
            long jT2 = canvasDrawScope.getDrawContext().t();
            GraphicsLayer graphicsLayerMUb = canvasDrawScope.getDrawContext().getGraphicsLayer();
            DrawContext drawContext = canvasDrawScope.getDrawContext();
            drawContext.O(density);
            drawContext.rl(layoutDirection);
            drawContext.gh(androidCanvas);
            drawContext.xMQ(jO);
            drawContext.Uo(layer);
            androidCanvas.O();
            try {
                block.invoke(canvasDrawScope);
                androidCanvas.n();
                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                drawContext2.O(density2);
                drawContext2.rl(layoutDirection2);
                drawContext2.gh(canvasKN);
                drawContext2.xMQ(jT2);
                drawContext2.Uo(graphicsLayerMUb);
                canvasHolder.getAndroidCanvas().te(internalCanvas);
                this.renderNode.end(canvasStart);
                g(false);
            } catch (Throwable th) {
                androidCanvas.n();
                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                drawContext3.O(density2);
                drawContext3.rl(layoutDirection2);
                drawContext3.gh(canvasKN);
                drawContext3.xMQ(jT2);
                drawContext3.Uo(graphicsLayerMUb);
                throw th;
            }
        } catch (Throwable th2) {
            this.renderNode.end(canvasStart);
            throw th2;
        }
    }

    public final void rV9() {
        RenderNodeVerificationHelper24.f31730n.n(this.renderNode);
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
        this.outlineSize = outlineSize;
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
        this.renderNode.setCameraDistance(-f3);
    }

    private final boolean Xw() {
        if (!CompositingStrategy.J2(getCompositingStrategy(), CompositingStrategy.INSTANCE.t()) && BlendMode.e(getBlendMode(), BlendMode.INSTANCE.te()) && getColorFilter() == null) {
            return false;
        }
        return true;
    }

    private final void jB() {
        if (Xw()) {
            v(CompositingStrategy.INSTANCE.t());
        } else {
            v(getCompositingStrategy());
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
    public void J2() {
        rV9();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void nHg(androidx.compose.ui.graphics.Canvas canvas) {
        DisplayListCanvas displayListCanvasNr = AndroidCanvas_androidKt.nr(canvas);
        Intrinsics.checkNotNull(displayListCanvasNr, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasNr.drawRenderNode(this.renderNode);
    }

    public /* synthetic */ GraphicsLayerV23(View view, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j2, (i2 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
