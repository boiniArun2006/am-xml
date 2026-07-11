package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00128\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020&H\u0016ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0001¢\u0006\u0004\b+\u0010(J!\u0010,\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u0016J\u000f\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b/\u0010\u0016J\u000f\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u0010\u0016J\"\u00103\u001a\u00020!2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020#H\u0016ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u0002052\u0006\u00102\u001a\u00020#H\u0016¢\u0006\u0004\b7\u00108JW\u00109\u001a\u00020\u000f28\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010>\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\b>\u0010=R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010?R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010ARJ\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010BR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010CR\u001c\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010FR\u001a\u0010J\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010L\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bK\u0010IR$\u0010Q\u001a\u00020#2\u0006\u0010M\u001a\u00020#8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u0010F\"\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001e\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001c\u0010c\u001a\u00020a8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bb\u0010ER\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010FR\u0016\u0010k\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010FR\u0016\u0010m\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010FR\u0016\u0010o\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010FR%\u0010u\u001a\u0013\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u000f0p¢\u0006\u0002\br8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010w\u001a\u00020\u00188VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bv\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006x"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroidx/compose/ui/graphics/GraphicsContext;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "canvas", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "ck", "()V", "r", "Landroidx/compose/ui/graphics/Matrix;", "ty", "()[F", "az", "Ik", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "KN", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", "position", "", "Uo", "(J)Z", "Landroidx/compose/ui/unit/IntOffset;", "mUb", "(J)V", "Landroidx/compose/ui/unit/IntSize;", "size", "nr", "O", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "gh", "invalidate", "destroy", "point", "inverse", "rl", "(JZ)J", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "J2", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "t", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "matrix", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "([F)V", "xMQ", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "o", "J", "Z", "isDestroyed", "S", "[F", "matrixCache", "g", "inverseMatrixCache", "value", "E2", "HI", "(Z)V", "isDirty", "Landroidx/compose/ui/unit/Density;", "e", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "X", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "", "N", "I", "mutatedFields", "Landroidx/compose/ui/graphics/TransformOrigin;", "v", "transformOrigin", "Landroidx/compose/ui/graphics/Outline;", "Xw", "Landroidx/compose/ui/graphics/Outline;", "outline", "jB", "isMatrixDirty", "U", "isInverseMatrixDirty", "P5", "isIdentity", "M7", "drawnWithEnabledZ", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "p5", "Lkotlin/jvm/functions/Function1;", "recordLambda", "getUnderlyingMatrix-sQKQjiQ", "underlyingMatrix", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGraphicsLayerOwnerLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,415:1\n30#2:416\n30#2:452\n80#3:417\n85#3:419\n90#3:421\n53#3,3:423\n60#3:427\n70#3:430\n85#3:433\n90#3:435\n53#3,3:437\n80#3:453\n60#3:461\n70#3:465\n54#4:418\n59#4:420\n54#4:432\n59#4:434\n30#5:422\n30#5:436\n278#5:458\n65#6:426\n69#6:429\n71#6:459\n65#6:460\n73#6:463\n69#6:464\n22#7:428\n22#7:431\n22#7:462\n22#7:466\n76#8,7:440\n102#8,5:447\n1#9:454\n49#10:455\n52#10,2:456\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n*L\n62#1:416\n336#1:452\n62#1:417\n147#1:419\n148#1:421\n146#1:423,3\n211#1:427\n212#1:430\n250#1:433\n251#1:435\n249#1:437,3\n336#1:453\n390#1:461\n389#1:465\n147#1:418\n148#1:420\n250#1:432\n251#1:434\n146#1:422\n249#1:436\n390#1:458\n211#1:426\n212#1:429\n390#1:459\n390#1:460\n389#1:463\n389#1:464\n211#1:428\n212#1:431\n390#1:462\n389#1:466\n313#1:440,7\n316#1:447,5\n369#1:455\n381#1:456,2\n*E\n"})
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function2 drawBlock;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean drawnWithEnabledZ;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseMatrixDirty;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Outline outline;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float[] inverseMatrixCache;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isMatrixDirty;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer graphicsLayer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function0 invalidateParentLayer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final GraphicsContext context;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float[] matrixCache = Matrix.t(null, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Density density = DensityKt.rl(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.f34160n;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final CanvasDrawScope scope = new CanvasDrawScope();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = TransformOrigin.INSTANCE.n();

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean isIdentity = true;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Function1 recordLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            n(drawScope);
            return Unit.INSTANCE;
        }

        public final void n(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.f32979n;
            Canvas canvasKN = drawScope.getDrawContext().KN();
            Function2 function2 = graphicsLayerOwnerLayer.drawBlock;
            if (function2 != null) {
                function2.invoke(canvasKN, drawScope.getDrawContext().getGraphicsLayer());
            }
        }
    };

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        HI(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.rl(this.graphicsLayer);
            this.ownerView.Bu(this);
        }
    }

    private final void HI(boolean z2) {
        if (z2 != this.isDirty) {
            this.isDirty = z2;
            this.ownerView.W(this, z2);
        }
    }

    private final void Ik() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long jRl = (graphicsLayer.getPivotOffset() & 9223372034707292159L) == 9205357640488583168L ? SizeKt.rl(IntSizeKt.O(this.size)) : graphicsLayer.getPivotOffset();
            Matrix.xMQ(this.matrixCache, Float.intBitsToFloat((int) (jRl >> 32)), Float.intBitsToFloat((int) (jRl & 4294967295L)), graphicsLayer.nY(), graphicsLayer.g(), 1.0f, graphicsLayer.r(), graphicsLayer.o(), graphicsLayer.Z(), graphicsLayer.XQ(), graphicsLayer.S(), 1.0f);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.n(this.matrixCache);
        }
    }

    private final float[] az() {
        float[] fArrT = this.inverseMatrixCache;
        if (fArrT == null) {
            fArrT = Matrix.t(null, 1, null);
            this.inverseMatrixCache = fArrT;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrT[0])) {
                return null;
            }
            return fArrT;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrTy = ty();
        if (this.isIdentity) {
            return fArrTy;
        }
        if (InvertMatrixKt.n(fArrTy, fArrT)) {
            return fArrT;
        }
        fArrT[0] = Float.NaN;
        return null;
    }

    private final void ck() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.f33159n.n(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    private final void r() {
        Function0 function0;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.rl(this.graphicsLayer, outline);
        if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (function0 = this.invalidateParentLayer) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void J2(MutableRect rect, boolean inverse) {
        float[] fArrAz = inverse ? az() : ty();
        if (this.isIdentity) {
            return;
        }
        if (fArrAz == null) {
            rect.Uo(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.Uo(fArrAz, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean Uo(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.t(this.graphicsLayer.ck(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void gh() {
        if (this.isDirty) {
            if (!TransformOrigin.O(this.transformOrigin, TransformOrigin.INSTANCE.n()) && !IntSize.O(this.graphicsLayer.getSize(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fJ2 = TransformOrigin.J2(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.U(Offset.O((((long) Float.floatToRawIntBits(TransformOrigin.Uo(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fJ2) << 32)));
            }
            this.graphicsLayer.X(this.density, this.layoutDirection, this.size, this.recordLambda);
            HI(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        HI(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mUb(long position) {
        this.graphicsLayer.GR(position);
        ck();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void nr(long size) {
        if (IntSize.O(size, this.size)) {
            return;
        }
        this.size = size;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public long rl(long point, boolean inverse) {
        float[] fArrTy;
        if (inverse) {
            fArrTy = az();
            if (fArrTy == null) {
                return Offset.INSTANCE.n();
            }
        } else {
            fArrTy = ty();
        }
        return this.isIdentity ? point : Matrix.J2(fArrTy, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void t(Function2 drawBlock, Function0 invalidateParentLayer) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            InlineClassHelperKt.nr("currently reuse is only supported when we manage the layer lifecycle");
            throw new KotlinNothingValueException();
        }
        if (!this.graphicsLayer.getIsReleased()) {
            InlineClassHelperKt.n("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.n();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.KN(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.KN(fArr);
        }
        this.transformOrigin = TransformOrigin.INSTANCE.n();
        this.drawnWithEnabledZ = false;
        long j2 = Integer.MAX_VALUE;
        this.size = IntSize.t((j2 & 4294967295L) | (j2 << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        long j2 = Integer.MAX_VALUE;
        this.size = IntSize.t((j2 & 4294967295L) | (j2 << 32));
    }

    private final float[] ty() {
        Ik();
        return this.matrixCache;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void KN(ReusableGraphicsLayerScope scope) {
        int iRl;
        Function0 function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i2 = mutatedFields & 4096;
        if (i2 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.B(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.J(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.wTp(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.Nxk(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.Y(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.D(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.v(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.I(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.M(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.eF(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.E(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.rV9(scope.getCameraDistance());
        }
        if (i2 != 0) {
            if (TransformOrigin.O(this.transformOrigin, TransformOrigin.INSTANCE.n())) {
                this.graphicsLayer.U(Offset.INSTANCE.rl());
            } else {
                this.graphicsLayer.U(Offset.O((((long) Float.floatToRawIntBits(TransformOrigin.Uo(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(TransformOrigin.J2(this.transformOrigin) * ((int) (this.size >> 32)))) << 32)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.bzg(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            this.graphicsLayer.p5(scope.getRenderEffect());
        }
        if ((32768 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
            if (CompositingStrategy.J2(compositingStrategy, companion.n())) {
                iRl = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.n();
            } else if (CompositingStrategy.J2(compositingStrategy, companion.t())) {
                iRl = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.t();
            } else if (CompositingStrategy.J2(compositingStrategy, companion.rl())) {
                iRl = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.rl();
            } else {
                throw new IllegalStateException("Not supported composition strategy");
            }
            graphicsLayer.Xw(iRl);
        }
        boolean z2 = true;
        if ((mutatedFields & 7963) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (!Intrinsics.areEqual(this.outline, scope.getOutline())) {
            this.outline = scope.getOutline();
            r();
        } else {
            z2 = false;
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields == 0 && !z2) {
            return;
        }
        ck();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void O(Canvas canvas, GraphicsLayer parentLayer) {
        boolean z2;
        gh();
        if (this.graphicsLayer.WPU() > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.drawnWithEnabledZ = z2;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.gh(canvas);
        drawContext.Uo(parentLayer);
        GraphicsLayerKt.n(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo6getUnderlyingMatrixsQKQjiQ() {
        return ty();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void n(float[] matrix) {
        Matrix.qie(matrix, ty());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void xMQ(float[] matrix) {
        float[] fArrAz = az();
        if (fArrAz != null) {
            Matrix.qie(matrix, fArrAz);
        }
    }
}
