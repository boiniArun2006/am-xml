package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0087\u0001\u0088\u0001B_\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00128\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010#J!\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010,J7\u00103\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u0010,J\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u0010,J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010,J\"\u0010:\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u0019H\u0016¢\u0006\u0004\b>\u0010?JW\u00100\u001a\u00020\u000f28\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0004\b0\u0010@J\u001a\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u000fH\u0002¢\u0006\u0004\bF\u0010,J\u000f\u0010G\u001a\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bL\u0010MRJ\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010NR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010OR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010QR\u0016\u0010U\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010WR*\u0010^\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010\u001b\"\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010TR\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00010e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010l\u001a\u00020i8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010TR\u001a\u0010s\u001a\u00020o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010k\u001a\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010y\u001a\u00020A8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010rR&\u0010\u0081\u0001\u001a\u00020|2\u0006\u0010Y\u001a\u00020|8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", TtmlNode.RUBY_CONTAINER, "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "KN", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "", "hasOverlappingRendering", "()Z", "Landroidx/compose/ui/geometry/Offset;", "position", "Uo", "(J)Z", "Landroidx/compose/ui/unit/IntSize;", "size", "nr", "(J)V", "Landroidx/compose/ui/unit/IntOffset;", "mUb", "O", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "()V", "changed", "", CmcdData.STREAM_TYPE_LIVE, "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "gh", "forceLayout", "point", "inverse", "rl", "(JZ)J", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "J2", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "([F)V", "xMQ", "WPU", "S", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/OutlineResolver;", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", "o", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "g", "XQ", "setInvalidated", "(Z)V", "isInvalidated", "E2", "drawnWithZ", "Landroidx/compose/ui/graphics/CanvasHolder;", "e", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/platform/LayerMatrixCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/platform/LayerMatrixCache;", "matrixCache", "Landroidx/compose/ui/graphics/TransformOrigin;", "N", "J", "mTransformOrigin", "v", "mHasOverlappingRendering", "", "Xw", "getLayerId", "()J", "layerId", "jB", "I", "mutatedFields", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "U", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,498:1\n65#2:499\n69#2:502\n60#3:500\n70#3:503\n85#3:506\n90#3:508\n22#4:501\n22#4:504\n54#5:505\n59#5:507\n41#6,5:509\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n240#1:499\n241#1:502\n240#1:500\n241#1:503\n277#1:506\n278#1:508\n240#1:501\n241#1:504\n277#1:505\n278#1:507\n315#1:509,5\n*E\n"})
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static Field f33082E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static boolean f33083FX;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static boolean f33084M;
    private static Method eF;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean drawnWithZ;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function0 invalidateParentLayer;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private long mTransformOrigin;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function2 drawBlock;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Rect clipBoundsCache;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final LayerMatrixCache matrixCache;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final long layerId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CanvasHolder canvasHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final OutlineResolver outlineResolver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final DrawChildContainer container;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean mHasOverlappingRendering;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int P5 = 8;
    private static final Function2 M7 = new Function2<View, Matrix, Unit>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
            n(view, matrix);
            return Unit.INSTANCE;
        }

        public final void n(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };
    private static final ViewOutlineProvider p5 = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineRl = ((ViewLayer) view).outlineResolver.rl();
            Intrinsics.checkNotNull(outlineRl);
            outline.set(outlineRl);
        }
    };

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "nr", "(Landroid/view/View;)V", "", "<set-?>", "hasRetrievedMethod", "Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Z", "shouldUseDispatchDraw", "rl", "t", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void nr(View view) {
            try {
                if (!n()) {
                    ViewLayer.f33084M = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.eF = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f33082E = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.eF = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f33082E = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.eF;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f33082E;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f33082E;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.eF;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                t(true);
            }
        }

        public final boolean n() {
            return ViewLayer.f33084M;
        }

        public final boolean rl() {
            return ViewLayer.f33083FX;
        }

        public final void t(boolean z2) {
            ViewLayer.f33083FX = z2;
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.Uf();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.Bu(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l2, int t3, int r2, int b2) {
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "<init>", "()V", "Landroid/view/View;", "view", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class UniqueDrawingIdApi29 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final UniqueDrawingIdApi29 f33098n = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        public static final long n(View view) {
            return view.getUniqueDrawingId();
        }
    }

    private final void S() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void WPU() {
        setOutlineProvider(this.outlineResolver.rl() != null ? p5 : null);
    }

    private final void setInvalidated(boolean z2) {
        if (z2 != this.isInvalidated) {
            this.isInvalidated = z2;
            this.ownerView.W(this, z2);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void J2(MutableRect rect, boolean inverse) {
        if (inverse) {
            this.matrixCache.J2(this, rect);
        } else {
            this.matrixCache.nr(this, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean Uo(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & position));
        if (this.clipToBounds) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.J2(position);
        }
        return true;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z2;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas canvasG = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().te(canvas);
        AndroidCanvas androidCanvasN = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z2 = false;
        } else {
            androidCanvasN.O();
            this.outlineResolver.n(androidCanvasN);
            z2 = true;
        }
        Function2 function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(androidCanvasN, null);
        }
        if (z2) {
            androidCanvasN.n();
        }
        canvasHolder.getAndroidCanvas().te(canvasG);
        setInvalidated(false);
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.n(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo6getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.rl(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void gh() {
        if (!this.isInvalidated || f33083FX) {
            return;
        }
        INSTANCE.nr(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void n(float[] matrix) {
        androidx.compose.ui.graphics.Matrix.qie(matrix, this.matrixCache.rl(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void nr(long size) {
        int i2 = (int) (size >> 32);
        int i3 = (int) (size & 4294967295L);
        if (i2 == getWidth() && i3 == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.J2(this.mTransformOrigin) * i2);
        setPivotY(TransformOrigin.Uo(this.mTransformOrigin) * i3);
        WPU();
        layout(getLeft(), getTop(), getLeft() + i2, getTop() + i3);
        S();
        this.matrixCache.t();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public long rl(long point, boolean inverse) {
        return inverse ? this.matrixCache.Uo(this, point) : this.matrixCache.O(this, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void t(Function2 drawBlock, Function0 invalidateParentLayer) {
        this.container.addView(this);
        this.matrixCache.KN();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.INSTANCE.n();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void xMQ(float[] matrix) {
        float[] fArrN = this.matrixCache.n(this);
        if (fArrN != null) {
            androidx.compose.ui.graphics.Matrix.qie(matrix, fArrN);
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function2 function2, Function0 function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new OutlineResolver();
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache(M7);
        this.mTransformOrigin = TransformOrigin.INSTANCE.n();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline() && !this.outlineResolver.O()) {
            return this.outlineResolver.nr();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void KN(ReusableGraphicsLayerScope scope) {
        boolean z2;
        boolean z3;
        boolean z4;
        Function0 function0;
        boolean z5;
        int iG = scope.getMutatedFields() | this.mutatedFields;
        if ((iG & 4096) != 0) {
            long jK = scope.getTransformOrigin();
            this.mTransformOrigin = jK;
            setPivotX(TransformOrigin.J2(jK) * getWidth());
            setPivotY(TransformOrigin.Uo(this.mTransformOrigin) * getHeight());
        }
        if ((iG & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((iG & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((iG & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((iG & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((iG & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((iG & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((iG & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((iG & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((iG & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((iG & 2048) != 0) {
            setCameraDistancePx(scope.getCameraDistance());
        }
        boolean z6 = false;
        if (getManualClipPath() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (scope.getClip() && scope.getShape() != RectangleShapeKt.n()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((iG & 24576) != 0) {
            if (scope.getClip() && scope.getShape() == RectangleShapeKt.n()) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.clipToBounds = z5;
            S();
            setClipToOutline(z3);
        }
        boolean zKN = this.outlineResolver.KN(scope.getOutline(), scope.getAlpha(), z3, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            WPU();
        }
        if (getManualClipPath() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 != z4 || (z4 && zKN)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((iG & 7963) != 0) {
            this.matrixCache.t();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if ((iG & 64) != 0) {
                ViewLayerVerificationHelper28.f33099n.n(this, ColorKt.mUb(scope.getAmbientShadowColor()));
            }
            if ((iG & 128) != 0) {
                ViewLayerVerificationHelper28.f33099n.rl(this, ColorKt.mUb(scope.getSpotShadowColor()));
            }
        }
        if (i2 >= 31 && (131072 & iG) != 0) {
            ViewLayerVerificationHelper31.f33100n.n(this, scope.getRenderEffect());
        }
        if ((iG & 32768) != 0) {
            int iR = scope.getCompositingStrategy();
            CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
            if (CompositingStrategy.J2(iR, companion.t())) {
                setLayerType(2, null);
            } else if (CompositingStrategy.J2(iR, companion.rl())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z6;
            } else {
                setLayerType(0, null);
            }
            z6 = true;
            this.mHasOverlappingRendering = z6;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void O(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer parentLayer) {
        boolean z2;
        if (getElevation() > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.drawnWithZ = z2;
        if (z2) {
            canvas.az();
        }
        this.container.n(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.o();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mUb(long position) {
        int iGh = IntOffset.gh(position);
        if (iGh != getLeft()) {
            offsetLeftAndRight(iGh - getLeft());
            this.matrixCache.t();
        }
        int iQie = IntOffset.qie(position);
        if (iQie != getTop()) {
            offsetTopAndBottom(iQie - getTop());
            this.matrixCache.t();
        }
    }

    public final void setCameraDistancePx(float f3) {
        setCameraDistance(f3 * getResources().getDisplayMetrics().densityDpi);
    }
}
