package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u001a\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00104\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/unit/Dp;", "widthParameter", "Landroidx/compose/ui/graphics/Brush;", "brushParameter", "Landroidx/compose/ui/graphics/Shape;", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/draw/CacheDrawScope;", "brush", "Landroidx/compose/ui/graphics/Outline$Generic;", "outline", "", "fillArea", "", "strokeWidth", "Landroidx/compose/ui/draw/DrawResult;", "GT", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "borderSize", "Vd", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/foundation/BorderCache;", "jB", "Landroidx/compose/foundation/BorderCache;", "borderCache", "value", "U", "F", "ZwA", "()F", "kC", "(F)V", "width", "P5", "Landroidx/compose/ui/graphics/Brush;", "b", "()Landroidx/compose/ui/graphics/Brush;", "jE", "(Landroidx/compose/ui/graphics/Brush;)V", "M7", "Landroidx/compose/ui/graphics/Shape;", "WKb", "()Landroidx/compose/ui/graphics/Shape;", "pS", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "p5", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "drawWithCacheModifierNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 11 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,468:1\n56#2,6:469\n30#3:475\n80#4:476\n60#4:489\n70#4:493\n85#4:499\n90#4:501\n60#4:529\n70#4:532\n365#5,11:477\n376#5:491\n377#5,4:494\n381#5,2:502\n379#5,6:504\n387#5,3:511\n392#5,2:523\n394#5:556\n395#5,2:565\n57#6:488\n61#6:492\n57#6:528\n61#6:531\n22#7:490\n22#7:530\n54#8:498\n59#8:500\n1#9:510\n536#10,9:514\n545#10,8:557\n120#11,3:525\n167#11,6:533\n249#11,14:539\n124#11,3:553\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n240#1:469,6\n240#1:475\n240#1:476\n247#1:489\n247#1:493\n247#1:499\n247#1:501\n262#1:529\n262#1:532\n247#1:477,11\n247#1:491\n247#1:494,4\n247#1:502,2\n247#1:504,6\n247#1:511,3\n247#1:523,2\n247#1:556\n247#1:565,2\n247#1:488\n247#1:492\n262#1:528\n262#1:531\n247#1:490\n262#1:530\n247#1:498\n247#1:500\n247#1:510\n247#1:514,9\n247#1:557,8\n250#1:525,3\n262#1:533,6\n262#1:539,14\n250#1:553,3\n*E\n"})
public final class BorderModifierNode extends DelegatingNode {

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private Shape shape;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private Brush brush;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private float width;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private BorderCache borderCache;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final CacheDrawModifierNode drawWithCacheModifierNode;

    public /* synthetic */ BorderModifierNode(float f3, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, brush, shape);
    }

    private BorderModifierNode(float f3, Brush brush, Shape shape) {
        this.width = f3;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) UR(DrawModifierKt.n(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.l(this.f15991n.getWidth()) < 0.0f || Size.mUb(cacheDrawScope.t()) <= 0.0f) {
                    return BorderKt.gh(cacheDrawScope);
                }
                float f4 = 2;
                float fMin = Math.min(Dp.mUb(this.f15991n.getWidth(), Dp.INSTANCE.n()) ? 1.0f : (float) Math.ceil(cacheDrawScope.l(this.f15991n.getWidth())), (float) Math.ceil(Size.mUb(cacheDrawScope.t()) / f4));
                float f5 = fMin / f4;
                long jO = Offset.O((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
                long jNr = Size.nr((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.t() >> 32)) - fMin)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.t() & 4294967295L)) - fMin))));
                boolean z2 = f4 * fMin > Size.mUb(cacheDrawScope.t());
                Outline outlineN = this.f15991n.getShape().n(cacheDrawScope.t(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineN instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.f15991n;
                    return borderModifierNode.GT(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineN, z2, fMin);
                }
                if (outlineN instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.f15991n;
                    return borderModifierNode2.Vd(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineN, jO, jNr, z2, fMin);
                }
                if (outlineN instanceof Outline.Rectangle) {
                    return BorderKt.qie(cacheDrawScope, this.f15991n.getBrush(), jO, jNr, z2, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DrawResult GT(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z2, float f3) throws Throwable {
        int iRl;
        ColorFilter colorFilterRl;
        Rect rect;
        BorderCache borderCache;
        Ref.ObjectRef objectRef;
        ImageBitmap imageBitmap;
        Canvas canvas;
        CanvasDrawScope canvasDrawScope;
        CanvasDrawScope canvasDrawScope2;
        float f4;
        float f5;
        float f6;
        float f7;
        DrawContext drawContext;
        long jT2;
        DrawContext drawContext2;
        long j2;
        if (z2) {
            return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    n(contentDrawScope);
                    return Unit.INSTANCE;
                }

                public final void n(ContentDrawScope contentDrawScope) {
                    contentDrawScope.l2();
                    DrawScope.Ro(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            iRl = ImageBitmapConfig.INSTANCE.n();
            colorFilterRl = ColorFilter.Companion.rl(ColorFilter.INSTANCE, Color.az(((SolidColor) brush).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        } else {
            iRl = ImageBitmapConfig.INSTANCE.rl();
            colorFilterRl = null;
        }
        int i2 = iRl;
        Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        Path pathUo = borderCache2.Uo();
        pathUo.reset();
        Path.n(pathUo, bounds, null, 2, null);
        pathUo.o(pathUo, generic.getPath(), PathOperation.INSTANCE.n());
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final long jT3 = IntSize.t((((long) ((int) Math.ceil(bounds.xMQ() - bounds.getTop()))) & 4294967295L) | (((long) ((int) Math.ceil(bounds.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - bounds.getLeft()))) << 32));
        BorderCache borderCache3 = this.borderCache;
        Intrinsics.checkNotNull(borderCache3);
        ImageBitmap imageBitmap2 = borderCache3.imageBitmap;
        Canvas canvas2 = borderCache3.canvas;
        ImageBitmapConfig imageBitmapConfigJ2 = imageBitmap2 != null ? ImageBitmapConfig.J2(imageBitmap2.rl()) : null;
        boolean z3 = false;
        if (imageBitmapConfigJ2 == null ? false : ImageBitmapConfig.xMQ(imageBitmapConfigJ2.getValue(), ImageBitmapConfig.INSTANCE.rl())) {
            z3 = true;
        } else {
            if (ImageBitmapConfig.KN(i2, imageBitmap2 != null ? ImageBitmapConfig.J2(imageBitmap2.rl()) : null)) {
            }
        }
        try {
            try {
                try {
                    try {
                        if (imageBitmap2 != null && canvas2 != null) {
                            rect = bounds;
                            if (Float.intBitsToFloat((int) (cacheDrawScope.t() >> 32)) <= imageBitmap2.getWidth() && Float.intBitsToFloat((int) (cacheDrawScope.t() & 4294967295L)) <= imageBitmap2.getHeight() && z3) {
                                borderCache = borderCache3;
                                objectRef = objectRef2;
                                canvas = canvas2;
                                imageBitmap = imageBitmap2;
                            }
                            canvasDrawScope = borderCache.canvasDrawScope;
                            if (canvasDrawScope == null) {
                                canvasDrawScope = new CanvasDrawScope();
                                borderCache.canvasDrawScope = canvasDrawScope;
                            }
                            canvasDrawScope2 = canvasDrawScope;
                            long jO = IntSizeKt.O(jT3);
                            LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
                            CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
                            Density densityN = drawParams.n();
                            LayoutDirection layoutDirectionRl = drawParams.rl();
                            Canvas canvasT = drawParams.t();
                            long jNr = drawParams.nr();
                            CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
                            drawParams2.mUb(cacheDrawScope);
                            drawParams2.gh(layoutDirection);
                            drawParams2.xMQ(canvas);
                            drawParams2.qie(jO);
                            canvas.O();
                            long jN = Color.INSTANCE.n();
                            BlendMode.Companion companion = BlendMode.INSTANCE;
                            DrawScope.h(canvasDrawScope2, jN, 0L, jO, 0.0f, null, null, companion.n(), 58, null);
                            f4 = -rect.getLeft();
                            f5 = -rect.getTop();
                            canvasDrawScope2.getDrawContext().getTransform().nr(f4, f5);
                            ?? r12 = imageBitmap;
                            f7 = f5;
                            Canvas canvas3 = canvas;
                            final ColorFilter colorFilter = colorFilterRl;
                            f6 = f4;
                            DrawScope.Ro(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f3 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                            float f8 = 1;
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (canvasDrawScope2.t() >> 32)) + f8) / Float.intBitsToFloat((int) (canvasDrawScope2.t() >> 32));
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (canvasDrawScope2.t() & 4294967295L)) + f8) / Float.intBitsToFloat((int) (canvasDrawScope2.t() & 4294967295L));
                            long jCo = canvasDrawScope2.Co();
                            drawContext = canvasDrawScope2.getDrawContext();
                            jT2 = drawContext.t();
                            drawContext.KN().O();
                            drawContext.getTransform().Uo(fIntBitsToFloat, fIntBitsToFloat2, jCo);
                            final Ref.ObjectRef objectRef3 = objectRef;
                            j2 = jT2;
                            DrawScope.Ro(canvasDrawScope2, pathUo, brush, 0.0f, null, null, companion.n(), 28, null);
                            drawContext.KN().n();
                            drawContext.xMQ(j2);
                            canvasDrawScope2.getDrawContext().getTransform().nr(-f6, -f7);
                            canvas3.n();
                            CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
                            drawParams3.mUb(densityN);
                            drawParams3.gh(layoutDirectionRl);
                            drawParams3.xMQ(canvasT);
                            drawParams3.qie(jNr);
                            r12.n();
                            objectRef3.element = r12;
                            final Rect rect2 = rect;
                            return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                    n(contentDrawScope);
                                    return Unit.INSTANCE;
                                }

                                public final void n(ContentDrawScope contentDrawScope) {
                                    contentDrawScope.l2();
                                    float left = rect2.getLeft();
                                    float top = rect2.getTop();
                                    Ref.ObjectRef objectRef4 = objectRef3;
                                    long j3 = jT3;
                                    ColorFilter colorFilter2 = colorFilter;
                                    contentDrawScope.getDrawContext().getTransform().nr(left, top);
                                    try {
                                        DrawScope.k(contentDrawScope, (ImageBitmap) objectRef4.element, 0L, j3, 0L, 0L, 0.0f, null, colorFilter2, 0, 0, 890, null);
                                    } finally {
                                        contentDrawScope.getDrawContext().getTransform().nr(-left, -top);
                                    }
                                }
                            });
                        }
                        rect = bounds;
                        DrawScope.Ro(canvasDrawScope2, pathUo, brush, 0.0f, null, null, companion.n(), 28, null);
                        drawContext.KN().n();
                        drawContext.xMQ(j2);
                        canvasDrawScope2.getDrawContext().getTransform().nr(-f6, -f7);
                        canvas3.n();
                        CanvasDrawScope.DrawParams drawParams32 = canvasDrawScope2.getDrawParams();
                        drawParams32.mUb(densityN);
                        drawParams32.gh(layoutDirectionRl);
                        drawParams32.xMQ(canvasT);
                        drawParams32.qie(jNr);
                        r12.n();
                        objectRef3.element = r12;
                        final Rect rect22 = rect;
                        return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                n(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(ContentDrawScope contentDrawScope) {
                                contentDrawScope.l2();
                                float left = rect22.getLeft();
                                float top = rect22.getTop();
                                Ref.ObjectRef objectRef4 = objectRef3;
                                long j3 = jT3;
                                ColorFilter colorFilter2 = colorFilter;
                                contentDrawScope.getDrawContext().getTransform().nr(left, top);
                                try {
                                    DrawScope.k(contentDrawScope, (ImageBitmap) objectRef4.element, 0L, j3, 0L, 0L, 0.0f, null, colorFilter2, 0, 0, 890, null);
                                } finally {
                                    contentDrawScope.getDrawContext().getTransform().nr(-left, -top);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        drawContext2 = drawContext;
                        drawContext2.KN().n();
                        drawContext2.xMQ(j2);
                        throw th;
                    }
                    drawContext.getTransform().Uo(fIntBitsToFloat, fIntBitsToFloat2, jCo);
                    final Ref.ObjectRef objectRef32 = objectRef;
                    j2 = jT2;
                } catch (Throwable th2) {
                    th = th2;
                    drawContext2 = drawContext;
                    j2 = jT2;
                }
                DrawScope.Ro(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f3 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f82 = 1;
                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (canvasDrawScope2.t() >> 32)) + f82) / Float.intBitsToFloat((int) (canvasDrawScope2.t() >> 32));
                float fIntBitsToFloat22 = (Float.intBitsToFloat((int) (canvasDrawScope2.t() & 4294967295L)) + f82) / Float.intBitsToFloat((int) (canvasDrawScope2.t() & 4294967295L));
                long jCo2 = canvasDrawScope2.Co();
                drawContext = canvasDrawScope2.getDrawContext();
                jT2 = drawContext.t();
                drawContext.KN().O();
            } catch (Throwable th3) {
                th = th3;
                canvasDrawScope2.getDrawContext().getTransform().nr(-f6, -f7);
                throw th;
            }
            ?? r122 = imageBitmap;
            f7 = f5;
            Canvas canvas32 = canvas;
            final ColorFilter colorFilter2 = colorFilterRl;
            f6 = f4;
        } catch (Throwable th4) {
            th = th4;
            f6 = f4;
            f7 = f5;
        }
        borderCache = borderCache3;
        objectRef = objectRef2;
        ImageBitmap imageBitmapRl = ImageBitmapKt.rl((int) (jT3 >> 32), (int) (jT3 & 4294967295L), i2, false, null, 24, null);
        borderCache.imageBitmap = imageBitmapRl;
        Canvas canvasN = androidx.compose.ui.graphics.CanvasKt.n(imageBitmapRl);
        borderCache.canvas = canvasN;
        imageBitmap = imageBitmapRl;
        canvas = canvasN;
        canvasDrawScope = borderCache.canvasDrawScope;
        if (canvasDrawScope == null) {
        }
        canvasDrawScope2 = canvasDrawScope;
        long jO2 = IntSizeKt.O(jT3);
        LayoutDirection layoutDirection2 = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams4 = canvasDrawScope2.getDrawParams();
        Density densityN2 = drawParams4.n();
        LayoutDirection layoutDirectionRl2 = drawParams4.rl();
        Canvas canvasT2 = drawParams4.t();
        long jNr2 = drawParams4.nr();
        CanvasDrawScope.DrawParams drawParams22 = canvasDrawScope2.getDrawParams();
        drawParams22.mUb(cacheDrawScope);
        drawParams22.gh(layoutDirection2);
        drawParams22.xMQ(canvas);
        drawParams22.qie(jO2);
        canvas.O();
        long jN2 = Color.INSTANCE.n();
        BlendMode.Companion companion2 = BlendMode.INSTANCE;
        DrawScope.h(canvasDrawScope2, jN2, 0L, jO2, 0.0f, null, null, companion2.n(), 58, null);
        f4 = -rect.getLeft();
        f5 = -rect.getTop();
        canvasDrawScope2.getDrawContext().getTransform().nr(f4, f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawResult Vd(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j2, final long j3, final boolean z2, final float f3) {
        if (RoundRectKt.Uo(rounded.getRoundRect())) {
            final long topLeftCornerRadius = rounded.getRoundRect().getTopLeftCornerRadius();
            final float f4 = f3 / 2;
            final Stroke stroke = new Stroke(f3, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    n(contentDrawScope);
                    return Unit.INSTANCE;
                }

                public final void n(ContentDrawScope contentDrawScope) {
                    contentDrawScope.l2();
                    if (z2) {
                        DrawScope.fW(contentDrawScope, brush, 0L, 0L, topLeftCornerRadius, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (topLeftCornerRadius >> 32));
                    float f5 = f4;
                    if (fIntBitsToFloat >= f5) {
                        DrawScope.fW(contentDrawScope, brush, j2, j3, BorderKt.az(topLeftCornerRadius, f5), 0.0f, stroke, null, 0, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, null);
                        return;
                    }
                    float f6 = f3;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.t() >> 32)) - f3;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.t() & 4294967295L)) - f3;
                    int iN = ClipOp.INSTANCE.n();
                    Brush brush2 = brush;
                    long j4 = topLeftCornerRadius;
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jT2 = drawContext.t();
                    drawContext.KN().O();
                    try {
                        drawContext.getTransform().rl(f6, f6, fIntBitsToFloat2, fIntBitsToFloat3, iN);
                        DrawScope.fW(contentDrawScope, brush2, 0L, 0L, j4, 0.0f, null, null, 0, 246, null);
                    } finally {
                        drawContext.KN().n();
                        drawContext.xMQ(jT2);
                    }
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        final Path pathMUb = BorderKt.mUb(borderCache.Uo(), rounded.getRoundRect(), f3, z2);
        return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                n(contentDrawScope);
                return Unit.INSTANCE;
            }

            public final void n(ContentDrawScope contentDrawScope) {
                contentDrawScope.l2();
                DrawScope.Ro(contentDrawScope, pathMUb, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }

    /* JADX INFO: renamed from: WKb, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: ZwA, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Brush getBrush() {
        return this.brush;
    }

    public final void jE(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.xVH();
    }

    public final void kC(float f3) {
        if (Dp.mUb(this.width, f3)) {
            return;
        }
        this.width = f3;
        this.drawWithCacheModifierNode.xVH();
    }

    public final void pS(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.xVH();
    }
}
