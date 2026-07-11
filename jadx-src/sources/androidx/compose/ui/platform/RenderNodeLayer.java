package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0002fgBW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00128\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\u0013J!\u0010&\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u0013J\"\u0010,\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020\u001cH\u0016¢\u0006\u0004\b0\u00101JW\u00102\u001a\u00020\f28\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001a\u00108\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00107R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b:\u0010;RJ\u0010\r\u001a6\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010<R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010=R$\u0010B\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b0\u0010?\"\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u0016\u0010I\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010?R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001c\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010d\u001a\u0002048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "ty", "()V", "qie", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "KN", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", "position", "", "Uo", "(J)Z", "Landroidx/compose/ui/unit/IntSize;", "size", "nr", "(J)V", "Landroidx/compose/ui/unit/IntOffset;", "mUb", "invalidate", "O", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "gh", "destroy", "point", "inverse", "rl", "(JZ)J", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "J2", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "t", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "([F)V", "xMQ", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "value", "Z", "az", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/OutlineResolver;", "r", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", "o", "isDestroyed", "drawnWithZ", "Landroidx/compose/ui/graphics/Paint;", "S", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "g", "Landroidx/compose/ui/platform/LayerMatrixCache;", "matrixCache", "Landroidx/compose/ui/graphics/CanvasHolder;", "E2", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/TransformOrigin;", "e", "J", "transformOrigin", "X", "Landroidx/compose/ui/platform/DeviceRenderNode;", "renderNode", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "I", "mutatedFields", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "N", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n65#2:403\n69#2:406\n60#3:404\n70#3:407\n85#3:410\n90#3:412\n22#4:405\n22#4:408\n54#5:409\n59#5:411\n1#6:413\n*S KotlinDebug\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n*L\n196#1:403\n197#1:406\n196#1:404\n197#1:407\n210#1:410\n211#1:412\n196#1:405\n197#1:408\n210#1:409\n211#1:411\n*E\n"})
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function0 invalidateParentLayer;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Paint softwareLayerPaint;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final DeviceRenderNode renderNode;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function2 drawBlock;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f33029v = 8;
    private static final Function2 Xw = new Function2<DeviceRenderNode, Matrix, Unit>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            n(deviceRenderNode, matrix);
            return Unit.INSTANCE;
        }

        public final void n(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            deviceRenderNode.nY(matrix);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final OutlineResolver outlineResolver = new OutlineResolver();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final LayerMatrixCache matrixCache = new LayerMatrixCache(Xw);

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final CanvasHolder canvasHolder = new CanvasHolder();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = TransformOrigin.INSTANCE.n();

    @RequiresApi
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class UniqueDrawingIdApi29 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final UniqueDrawingIdApi29 f33042n = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }
    }

    private final void az(boolean z2) {
        if (z2 != this.isDirty) {
            this.isDirty = z2;
            this.ownerView.W(this, z2);
        }
    }

    private final void qie(Canvas canvas) {
        if (this.renderNode.aYN() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.n(canvas);
        }
    }

    private final void ty() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.f33159n.n(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void J2(MutableRect rect, boolean inverse) {
        if (inverse) {
            this.matrixCache.J2(this.renderNode, rect);
        } else {
            this.matrixCache.nr(this.renderNode, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean Uo(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & position));
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) this.renderNode.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.aYN()) {
            return this.outlineResolver.J2(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.HI()) {
            this.renderNode.J2();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        az(false);
        this.ownerView.Uf();
        this.ownerView.Bu(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo6getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.rl(this.renderNode);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void gh() {
        if (this.isDirty || !this.renderNode.HI()) {
            Path pathNr = (!this.renderNode.aYN() || this.outlineResolver.O()) ? null : this.outlineResolver.nr();
            final Function2 function2 = this.drawBlock;
            if (function2 != null) {
                this.renderNode.T(this.canvasHolder, pathNr, new Function1<Canvas, Unit>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
                        n(canvas);
                        return Unit.INSTANCE;
                    }

                    public final void n(Canvas canvas) {
                        function2.invoke(canvas, null);
                    }
                });
            }
            az(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        az(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mUb(long position) {
        int iT = this.renderNode.getAndroidx.media3.extractor.text.ttml.TtmlNode.LEFT java.lang.String();
        int iWPU = this.renderNode.getTop();
        int iGh = IntOffset.gh(position);
        int iQie = IntOffset.qie(position);
        if (iT == iGh && iWPU == iQie) {
            return;
        }
        if (iT != iGh) {
            this.renderNode.g(iGh - iT);
        }
        if (iWPU != iQie) {
            this.renderNode.Z(iQie - iWPU);
        }
        ty();
        this.matrixCache.t();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void n(float[] matrix) {
        androidx.compose.ui.graphics.Matrix.qie(matrix, this.matrixCache.rl(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void nr(long size) {
        int i2 = (int) (size >> 32);
        int i3 = (int) (size & 4294967295L);
        this.renderNode.iF(TransformOrigin.J2(this.transformOrigin) * i2);
        this.renderNode.fD(TransformOrigin.Uo(this.transformOrigin) * i3);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.r(deviceRenderNode.getAndroidx.media3.extractor.text.ttml.TtmlNode.LEFT java.lang.String(), this.renderNode.getTop(), this.renderNode.getAndroidx.media3.extractor.text.ttml.TtmlNode.LEFT java.lang.String() + i2, this.renderNode.getTop() + i3)) {
            this.renderNode.E2(this.outlineResolver.rl());
            invalidate();
            this.matrixCache.t();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public long rl(long point, boolean inverse) {
        return inverse ? this.matrixCache.Uo(this.renderNode, point) : this.matrixCache.O(this.renderNode, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void t(Function2 drawBlock, Function0 invalidateParentLayer) {
        this.matrixCache.KN();
        az(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.INSTANCE.n();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void xMQ(float[] matrix) {
        float[] fArrN = this.matrixCache.n(this.renderNode);
        if (fArrN != null) {
            androidx.compose.ui.graphics.Matrix.qie(matrix, fArrN);
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        DeviceRenderNode renderNodeApi23;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        if (Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new RenderNodeApi29(androidComposeView);
        } else {
            renderNodeApi23 = new RenderNodeApi23(androidComposeView);
        }
        renderNodeApi23.ViF(true);
        renderNodeApi23.Ik(false);
        this.renderNode = renderNodeApi23;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void KN(ReusableGraphicsLayerScope scope) {
        boolean z2;
        boolean z3;
        Function0 function0;
        boolean z4;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        int i2 = mutatedFields & 4096;
        if (i2 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        boolean z5 = false;
        if (this.renderNode.aYN() && !this.outlineResolver.O()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((mutatedFields & 1) != 0) {
            this.renderNode.Uo(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.renderNode.az(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.renderNode.rl(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.renderNode.ty(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.renderNode.O(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.renderNode.o(scope.getShadowElevation());
        }
        if ((mutatedFields & 64) != 0) {
            this.renderNode.e(ColorKt.mUb(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            this.renderNode.N(ColorKt.mUb(scope.getSpotShadowColor()));
        }
        if ((mutatedFields & 1024) != 0) {
            this.renderNode.qie(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.renderNode.mUb(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.renderNode.gh(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.renderNode.xMQ(scope.getCameraDistance());
        }
        if (i2 != 0) {
            this.renderNode.iF(TransformOrigin.J2(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.fD(TransformOrigin.Uo(this.transformOrigin) * this.renderNode.getHeight());
        }
        if (scope.getClip() && scope.getShape() != RectangleShapeKt.n()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((mutatedFields & 24576) != 0) {
            this.renderNode.X(z3);
            DeviceRenderNode deviceRenderNode = this.renderNode;
            if (scope.getClip() && scope.getShape() == RectangleShapeKt.n()) {
                z4 = true;
            } else {
                z4 = false;
            }
            deviceRenderNode.Ik(z4);
        }
        if ((131072 & mutatedFields) != 0) {
            this.renderNode.KN(scope.getRenderEffect());
        }
        if ((32768 & mutatedFields) != 0) {
            this.renderNode.S(scope.getCompositingStrategy());
        }
        boolean zKN = this.outlineResolver.KN(scope.getOutline(), scope.getAlpha(), z3, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            this.renderNode.E2(this.outlineResolver.rl());
        }
        if (z3 && !this.outlineResolver.O()) {
            z5 = true;
        }
        if (z2 == z5 && (!z5 || !zKN)) {
            ty();
        } else {
            invalidate();
        }
        if (!this.drawnWithZ && this.renderNode.nHg() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields & 7963) != 0) {
            this.matrixCache.t();
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void O(Canvas canvas, GraphicsLayer parentLayer) {
        android.graphics.Canvas canvasNr = AndroidCanvas_androidKt.nr(canvas);
        boolean z2 = false;
        if (canvasNr.isHardwareAccelerated()) {
            gh();
            if (this.renderNode.nHg() > 0.0f) {
                z2 = true;
            }
            this.drawnWithZ = z2;
            if (z2) {
                canvas.az();
            }
            this.renderNode.ck(canvasNr);
            if (this.drawnWithZ) {
                canvas.o();
                return;
            }
            return;
        }
        float fT = this.renderNode.getAndroidx.media3.extractor.text.ttml.TtmlNode.LEFT java.lang.String();
        float fWPU = this.renderNode.getTop();
        float fNr = this.renderNode.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        float fTe = this.renderNode.getBottom();
        if (this.renderNode.n() < 1.0f) {
            Paint paintN = this.softwareLayerPaint;
            if (paintN == null) {
                paintN = AndroidPaint_androidKt.n();
                this.softwareLayerPaint = paintN;
            }
            paintN.rl(this.renderNode.n());
            canvasNr.saveLayer(fT, fWPU, fNr, fTe, paintN.getInternalPaint());
        } else {
            canvas.O();
        }
        canvas.nr(fT, fWPU);
        canvas.Z(this.matrixCache.rl(this.renderNode));
        qie(canvas);
        Function2 function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(canvas, null);
        }
        canvas.n();
        az(false);
    }
}
