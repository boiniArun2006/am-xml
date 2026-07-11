package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b>\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010=R\u0014\u0010\r\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010=R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010=R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010A\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010=R\u0014\u0010C\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010=R$\u0010J\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010M\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR$\u0010P\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010G\"\u0004\bO\u0010IR$\u0010S\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010G\"\u0004\bR\u0010IR$\u0010V\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010G\"\u0004\bU\u0010IR$\u0010Y\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010=\"\u0004\bX\u0010\u0015R$\u0010\\\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010=\"\u0004\b[\u0010\u0015R$\u0010_\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010G\"\u0004\b^\u0010IR$\u0010b\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010G\"\u0004\ba\u0010IR$\u0010e\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010G\"\u0004\bd\u0010IR$\u0010h\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010G\"\u0004\bg\u0010IR$\u0010k\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010G\"\u0004\bj\u0010IR$\u0010n\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010G\"\u0004\bm\u0010IR$\u0010s\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010v\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010p\"\u0004\bu\u0010rR$\u0010w\u001a\u00020D2\u0006\u0010E\u001a\u00020D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010G\"\u0004\b2\u0010IR(\u0010|\u001a\u0004\u0018\u0001052\b\u0010E\u001a\u0004\u0018\u0001058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R*\u0010\u007f\u001a\u0002092\u0006\u0010E\u001a\u0002098V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b}\u0010=\"\u0004\b~\u0010\u0015R\u0016\u0010\u0081\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010p\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0082\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroid/graphics/Outline;", "outline", "", "E2", "(Landroid/graphics/Outline;)V", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "", "r", "(IIII)Z", "offset", "g", "(I)V", "Z", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "nY", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "ck", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "ViF", "(Z)Z", "J2", "()V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", "rl", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/RenderEffect;", "t", "Landroidx/compose/ui/graphics/RenderEffect;", "internalRenderEffect", "Landroidx/compose/ui/graphics/CompositingStrategy;", "nr", "I", "internalCompositingStrategy", "()I", "WPU", "te", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "Uo", "(F)V", "scaleX", "getScaleY", "az", "scaleY", "getTranslationX", "ty", "translationX", "getTranslationY", "O", "translationY", "nHg", "o", "elevation", "getAmbientShadowColor", "e", "ambientShadowColor", "getSpotShadowColor", "N", "spotShadowColor", "getRotationZ", "qie", "rotationZ", "getRotationX", "mUb", "rotationX", "getRotationY", "gh", "rotationY", "getCameraDistance", "xMQ", "cameraDistance", "getPivotX", "iF", "pivotX", "getPivotY", "fD", "pivotY", "aYN", "()Z", "X", "(Z)V", "clipToOutline", "XQ", "Ik", "clipToBounds", "alpha", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "KN", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "S", "compositingStrategy", "HI", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,279:1\n41#2,5:280\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n210#1:280,5\n*E\n"})
public final class RenderNodeApi29 implements DeviceRenderNode {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private RenderEffect internalRenderEffect;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final RenderNode renderNode = androidx.compose.foundation.aC.n("Compose");

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int internalCompositingStrategy = CompositingStrategy.INSTANCE.n();

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void E2(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean HI() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void Ik(boolean z2) {
        this.renderNode.setClipToBounds(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void J2() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void KN(RenderEffect renderEffect) {
        this.internalRenderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.f33027n.n(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void N(int i2) {
        this.renderNode.setSpotShadowColor(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void O(float f3) {
        this.renderNode.setTranslationY(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void S(int i2) {
        RenderNode renderNode = this.renderNode;
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        if (CompositingStrategy.J2(i2, companion.t())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.J2(i2, companion.rl())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i2;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void T(CanvasHolder canvasHolder, Path clipPath, Function1 drawBlock) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().te(recordingCanvasBeginRecording);
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
        this.renderNode.endRecording();
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
    /* JADX INFO: renamed from: WPU */
    public int getTop() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void X(boolean z2) {
        this.renderNode.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: XQ */
    public boolean getClipToBounds() {
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void Z(int offset) {
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean aYN() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void az(float f3) {
        this.renderNode.setScaleY(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void ck(Canvas canvas) {
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void e(int i2) {
        this.renderNode.setAmbientShadowColor(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void fD(float f3) {
        this.renderNode.setPivotY(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void g(int offset) {
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.renderNode.getHeight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.renderNode.getWidth();
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
    /* JADX INFO: renamed from: nr */
    public int getRight() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void o(float f3) {
        this.renderNode.setElevation(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void qie(float f3) {
        this.renderNode.setRotationZ(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean r(int left, int top, int right, int bottom) {
        return this.renderNode.setPosition(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void rl(float f3) {
        this.renderNode.setAlpha(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: t */
    public int getLeft() {
        return this.renderNode.getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: te */
    public int getBottom() {
        return this.renderNode.getBottom();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void ty(float f3) {
        this.renderNode.setTranslationX(f3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void xMQ(float f3) {
        this.renderNode.setCameraDistance(f3);
    }

    public RenderNodeApi29(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }
}
