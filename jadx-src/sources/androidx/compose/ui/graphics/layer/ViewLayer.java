package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b'\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001JB#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J7\u0010(\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u001cR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00109\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010:R*\u0010@\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u00108R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR'\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "ownerView", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroid/view/View;Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroid/graphics/Outline;", "outline", "", "nr", "(Landroid/graphics/Outline;)Z", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBlock", "t", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", CmcdData.STREAM_TYPE_LIVE, "r", "b", "onLayout", "(ZIIII)V", "forceLayout", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "O", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "J2", "Z", "rl", "setInvalidated", "(Z)V", "isInvalidated", "Landroid/graphics/Outline;", "layerOutline", "value", "o", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "S", "Landroidx/compose/ui/unit/Density;", "g", "Landroidx/compose/ui/unit/LayoutDirection;", "E2", "Lkotlin/jvm/functions/Function1;", "e", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,583:1\n41#2,3:584\n44#2,2:617\n33#3:587\n53#4,3:588\n305#5,26:591\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer\n*L\n122#1:584,3\n122#1:617,2\n127#1:587\n127#1:588,3\n123#1:591,26\n*E\n"})
public final class ViewLayer extends View {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Function1 drawBlock;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final CanvasDrawScope canvasDrawScope;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer parentLayer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final View ownerView;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean canUseCompositingLayer;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Outline layerOutline;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CanvasHolder canvasHolder;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final ViewOutlineProvider f31734N = new ViewOutlineProvider() { // from class: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }
    };

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l2, int t3, int r2, int b2) {
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas canvasG = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().te(canvas);
        AndroidCanvas androidCanvasN = canvasHolder.getAndroidCanvas();
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        Density density = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        float width = getWidth();
        long jNr = Size.nr((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        GraphicsLayer graphicsLayer = this.parentLayer;
        Function1 function1 = this.drawBlock;
        Density density2 = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvasKN = canvasDrawScope.getDrawContext().KN();
        long jT2 = canvasDrawScope.getDrawContext().t();
        GraphicsLayer graphicsLayerMUb = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContextMx = canvasDrawScope.getDrawContext();
        drawContextMx.O(density);
        drawContextMx.rl(layoutDirection);
        drawContextMx.gh(androidCanvasN);
        drawContextMx.xMQ(jNr);
        drawContextMx.Uo(graphicsLayer);
        androidCanvasN.O();
        try {
            function1.invoke(canvasDrawScope);
            androidCanvasN.n();
            DrawContext drawContextMx2 = canvasDrawScope.getDrawContext();
            drawContextMx2.O(density2);
            drawContextMx2.rl(layoutDirection2);
            drawContextMx2.gh(canvasKN);
            drawContextMx2.xMQ(jT2);
            drawContextMx2.Uo(graphicsLayerMUb);
            canvasHolder.getAndroidCanvas().te(canvasG);
            this.isInvalidated = false;
        } catch (Throwable th) {
            androidCanvasN.n();
            DrawContext drawContextMx3 = canvasDrawScope.getDrawContext();
            drawContextMx3.O(density2);
            drawContextMx3.rl(layoutDirection2);
            drawContextMx3.gh(canvasKN);
            drawContextMx3.xMQ(jT2);
            drawContextMx3.Uo(graphicsLayerMUb);
            throw th;
        }
    }

    /* JADX INFO: renamed from: getCanUseCompositingLayer$ui_graphics_release, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final boolean nr(Outline outline) {
        this.layerOutline = outline;
        return OutlineUtils.f31726n.n(this);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z2) {
        if (this.canUseCompositingLayer != z2) {
            this.canUseCompositingLayer = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.isInvalidated = z2;
    }

    public final void t(Density density, LayoutDirection layoutDirection, GraphicsLayer parentLayer, Function1 drawBlock) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = drawBlock;
        this.parentLayer = parentLayer;
    }

    public ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        setOutlineProvider(f31734N);
        this.canUseCompositingLayer = true;
        this.density = DrawContextKt.n();
        this.layoutDirection = LayoutDirection.f34160n;
        this.drawBlock = GraphicsLayerImpl.INSTANCE.n();
        setWillNotDraw(false);
        setClipBounds(null);
    }
}
