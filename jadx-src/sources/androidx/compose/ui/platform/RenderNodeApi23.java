package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b1\b\u0001\u0018\u0000 r2\u00020\u0001:\u0002\u0088\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ5\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010:\u001a\u0004\b9\u0010=\"\u0004\b>\u0010\u001bR\"\u0010\u0013\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010=\"\u0004\bA\u0010\u001bR\"\u0010\u0014\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010:\u001a\u0004\b<\u0010=\"\u0004\bB\u0010\u001bR\"\u0010\u0015\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010:\u001a\u0004\bD\u0010=\"\u0004\bE\u0010\u001bR$\u0010L\u001a\u0004\u0018\u00010F8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bG\u0010KR*\u0010S\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u00168\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010\u001c\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010=R\u0014\u0010W\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010=R$\u0010\\\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\bC\u0010[R$\u0010_\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010Z\"\u0004\b^\u0010[R$\u0010b\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010Z\"\u0004\ba\u0010[R$\u0010d\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010Z\"\u0004\b?\u0010[R$\u0010g\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010Z\"\u0004\bf\u0010[R$\u0010j\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010=\"\u0004\bi\u0010\u001bR$\u0010m\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010=\"\u0004\bl\u0010\u001bR$\u0010p\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010Z\"\u0004\bo\u0010[R$\u0010s\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010Z\"\u0004\br\u0010[R$\u0010v\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010Z\"\u0004\bu\u0010[R$\u0010x\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010Z\"\u0004\bN\u0010[R$\u0010{\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\by\u0010Z\"\u0004\bz\u0010[R$\u0010~\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b|\u0010Z\"\u0004\b}\u0010[R&\u0010\u0081\u0001\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010P\"\u0005\b\u0080\u0001\u0010RR%\u0010\u0082\u0001\u001a\u00020X2\u0006\u0010M\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010Z\"\u0004\b6\u0010[R-\u0010\u0085\u0001\u001a\u0002082\u0006\u0010M\u001a\u0002088V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010=\"\u0005\b\u0084\u0001\u0010\u001bR\u0016\u0010\u0087\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "s7N", "()V", "Landroid/view/RenderNode;", "renderNode", "Xw", "(Landroid/view/RenderNode;)V", "Landroid/graphics/Outline;", "outline", "E2", "(Landroid/graphics/Outline;)V", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "", "r", "(IIII)Z", "offset", "g", "(I)V", "Z", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "nY", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "ck", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "ViF", "(Z)Z", "J2", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "rl", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/CompositingStrategy;", "t", "I", "internalCompositingStrategy", "nr", "()I", "v", "O", "WPU", "bzg", "rV9", "Uo", "te", "wTp", "Landroidx/compose/ui/graphics/RenderEffect;", "KN", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "value", "xMQ", "XQ", "()Z", "Ik", "(Z)V", "clipToBounds", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "(F)V", "scaleX", "getScaleY", "az", "scaleY", "getTranslationX", "ty", "translationX", "getTranslationY", "translationY", "nHg", "o", "elevation", "getAmbientShadowColor", "e", "ambientShadowColor", "getSpotShadowColor", "N", "spotShadowColor", "getRotationZ", "qie", "rotationZ", "getRotationX", "mUb", "rotationX", "getRotationY", "gh", "rotationY", "getCameraDistance", "cameraDistance", "getPivotX", "iF", "pivotX", "getPivotY", "fD", "pivotY", "aYN", "X", "clipToOutline", "alpha", "getCompositingStrategy--NrFUSI", "S", "compositingStrategy", "HI", "hasDisplayList", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,411:1\n41#2,5:412\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:412,5\n*E\n"})
public final class RenderNodeApi23 implements DeviceRenderNode {
    private static boolean qie;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int right;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private RenderEffect renderEffect;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int top;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private int bottom;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int left;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean clipToBounds;
    public static final int gh = 8;
    private static boolean az = true;

    private final void Xw(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.f33046n;
            renderNodeVerificationHelper28.t(renderNode, renderNodeVerificationHelper28.n(renderNode));
            renderNodeVerificationHelper28.nr(renderNode, renderNodeVerificationHelper28.rl(renderNode));
        }
    }

    private final void s7N() {
        RenderNodeVerificationHelper24.f33045n.n(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void E2(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean HI() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void Ik(boolean z2) {
        this.clipToBounds = z2;
        this.renderNode.setClipToBounds(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void KN(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void N(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.f33046n.nr(this.renderNode, i2);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void O(float f3) {
        this.renderNode.setTranslationY(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void S(int i2) {
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        if (CompositingStrategy.J2(i2, companion.t())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.J2(i2, companion.rl())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void T(CanvasHolder canvasHolder, Path clipPath, Function1 drawBlock) {
        DisplayListCanvas displayListCanvasStart = this.renderNode.start(getWidth(), getHeight());
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().te((Canvas) displayListCanvasStart);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.O();
            androidx.compose.ui.graphics.Canvas.gh(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.n();
        }
        canvasHolder.getAndroidCanvas().te(internalCanvas);
        this.renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void Uo(float f3) {
        this.renderNode.setScaleX(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean ViF(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: WPU, reason: from getter */
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void X(boolean z2) {
        this.renderNode.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: XQ, reason: from getter */
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean aYN() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void az(float f3) {
        this.renderNode.setScaleY(f3);
    }

    public void bzg(int i2) {
        this.top = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void ck(Canvas canvas) {
        Intrinsics.checkNotNull(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void e(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.f33046n.t(this.renderNode, i2);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void fD(float f3) {
        this.renderNode.setPivotY(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void gh(float f3) {
        this.renderNode.setRotationY(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void iF(float f3) {
        this.renderNode.setPivotX(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void mUb(float f3) {
        this.renderNode.setRotationX(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float n() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float nHg() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void nY(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: nr, reason: from getter */
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void o(float f3) {
        this.renderNode.setElevation(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void qie(float f3) {
        this.renderNode.setRotation(f3);
    }

    public void rV9(int i2) {
        this.right = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void rl(float f3) {
        this.renderNode.setAlpha(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: t, reason: from getter */
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: te, reason: from getter */
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void ty(float f3) {
        this.renderNode.setTranslationX(f3);
    }

    public void v(int i2) {
        this.left = i2;
    }

    public void wTp(int i2) {
        this.bottom = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void xMQ(float f3) {
        this.renderNode.setCameraDistance(-f3);
    }

    public RenderNodeApi23(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.renderNode = renderNodeCreate;
        this.internalCompositingStrategy = CompositingStrategy.INSTANCE.n();
        if (az) {
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
            Xw(renderNodeCreate);
            s7N();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            az = false;
        }
        if (!qie) {
        } else {
            throw new NoClassDefFoundError();
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void J2() {
        s7N();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void Z(int offset) {
        bzg(getTop() + offset);
        wTp(getBottom() + offset);
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void g(int offset) {
        v(getLeft() + offset);
        rV9(getRight() + offset);
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return getRight() - getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean r(int left, int top, int right, int bottom) {
        v(left);
        bzg(top);
        rV9(right);
        wTp(bottom);
        return this.renderNode.setLeftTopRightBottom(left, top, right, bottom);
    }
}
