package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u000b*\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a2\u0010!\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text/selection/OffsetProvider;", "offsetProvider", "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "Landroidx/compose/ui/unit/DpSize;", "minTouchTargetSize", "", "lineHeight", "Landroidx/compose/ui/Modifier;", "modifier", "", "rl", "(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "iconVisible", "isLeft", "t", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "O", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "Landroidx/compose/ui/graphics/ImageBitmap;", "nr", "(Landroidx/compose/ui/draw/CacheDrawScope;F)Landroidx/compose/ui/graphics/ImageBitmap;", "positionProvider", "Landroidx/compose/ui/Alignment;", "handleReferencePoint", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,235:1\n1247#2,6:236\n1247#2,6:272\n75#3:242\n33#4:243\n33#4:256\n53#5,3:244\n53#5,3:257\n53#5,3:261\n536#6,9:247\n545#6,8:264\n30#7:260\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n72#1:236,6\n226#1:272,6\n84#1:242\n205#1:243\n212#1:256\n205#1:244,3\n212#1:257,3\n214#1:261,3\n201#1:247,9\n201#1:264,8\n214#1:260\n*E\n"})
public final class AndroidSelectionHandles_androidKt {
    public static final Modifier O(Modifier modifier, final Function0 function0, final boolean z2) {
        return ComposedModifierKt.t(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(-196777734);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-196777734, i2, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:133)");
                }
                final long selectionHandleColor = ((SelectionColors) composer.ty(TextSelectionColorsKt.rl())).getSelectionHandleColor();
                boolean zNr = composer.nr(selectionHandleColor) | composer.p5(function0) | composer.n(z2);
                final Function0 function02 = function0;
                final boolean z3 = z2;
                Object objIF = composer.iF();
                if (zNr || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            final ImageBitmap imageBitmapNr = AndroidSelectionHandles_androidKt.nr(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.t() >> 32)) / 2.0f);
                            final ColorFilter colorFilterRl = ColorFilter.Companion.rl(ColorFilter.INSTANCE, selectionHandleColor, 0, 2, null);
                            final Function0 function03 = function02;
                            final boolean z4 = z3;
                            return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
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
                                    if (!((Boolean) function03.invoke()).booleanValue()) {
                                        return;
                                    }
                                    if (z4) {
                                        ImageBitmap imageBitmap = imageBitmapNr;
                                        ColorFilter colorFilter = colorFilterRl;
                                        long jCo = contentDrawScope.Co();
                                        DrawContext drawContext = contentDrawScope.getDrawContext();
                                        long jT2 = drawContext.t();
                                        drawContext.KN().O();
                                        try {
                                            drawContext.getTransform().Uo(-1.0f, 1.0f, jCo);
                                            DrawScope.EF(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                            return;
                                        } finally {
                                            drawContext.KN().n();
                                            drawContext.xMQ(jT2);
                                        }
                                    }
                                    DrawScope.EF(contentDrawScope, imageBitmapNr, 0L, 0.0f, null, colorFilterRl, 0, 46, null);
                                }
                            });
                        }
                    };
                    composer.o(objIF);
                }
                Modifier modifierT = DrawModifierKt.t(modifier2, (Function1) objIF);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierT;
            }
        }, 1, null);
    }

    public static final void n(final OffsetProvider offsetProvider, final Alignment alignment, final Function2 function2, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(476043083);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(offsetProvider) : composerKN.E2(offsetProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(alignment) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function2) ? 256 : 128;
        }
        boolean z2 = false;
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(476043083, i3, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerKN.p5(offsetProvider))) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objIF = composerKN.iF();
            if (z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new HandlePositionProvider(alignment, offsetProvider);
                composerKN.o(objIF);
            }
            AndroidPopup_androidKt.n((HandlePositionProvider) objIF, null, new PopupProperties(false, false, false, (SecureFlagPolicy) null, true, false, 15, (DefaultConstructorMarker) null), function2, composerKN, ((i3 << 3) & 7168) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    AndroidSelectionHandles_androidKt.n(offsetProvider, alignment, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final ImageBitmap nr(CacheDrawScope cacheDrawScope, float f3) {
        int iCeil = ((int) Math.ceil(f3)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.f20745n;
        ImageBitmap imageBitmapT = handleImageCache.t();
        Canvas canvasN = handleImageCache.n();
        CanvasDrawScope canvasDrawScopeRl = handleImageCache.rl();
        if (imageBitmapT == null || canvasN == null || iCeil > imageBitmapT.getWidth() || iCeil > imageBitmapT.getHeight()) {
            imageBitmapT = ImageBitmapKt.rl(iCeil, iCeil, ImageBitmapConfig.INSTANCE.n(), false, null, 24, null);
            handleImageCache.J2(imageBitmapT);
            canvasN = CanvasKt.n(imageBitmapT);
            handleImageCache.nr(canvasN);
        }
        ImageBitmap imageBitmap = imageBitmapT;
        Canvas canvas = canvasN;
        if (canvasDrawScopeRl == null) {
            canvasDrawScopeRl = new CanvasDrawScope();
            handleImageCache.O(canvasDrawScopeRl);
        }
        CanvasDrawScope canvasDrawScope = canvasDrawScopeRl;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        float width = imageBitmap.getWidth();
        long jNr = Size.nr((((long) Float.floatToRawIntBits(imageBitmap.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityN = drawParams.n();
        LayoutDirection layoutDirectionRl = drawParams.rl();
        Canvas canvasT = drawParams.t();
        long jNr2 = drawParams.nr();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.mUb(cacheDrawScope);
        drawParams2.gh(layoutDirection);
        drawParams2.xMQ(canvas);
        drawParams2.qie(jNr);
        canvas.O();
        DrawScope.h(canvasDrawScope, Color.INSTANCE.n(), 0L, canvasDrawScope.t(), 0.0f, null, null, BlendMode.INSTANCE.n(), 58, null);
        DrawScope.h(canvasDrawScope, ColorKt.nr(4278190080L), Offset.INSTANCE.t(), Size.nr((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)), 0.0f, null, null, 0, b.f61769v, null);
        DrawScope.Lu(canvasDrawScope, ColorKt.nr(4278190080L), f3, Offset.O((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32)), 0.0f, null, null, 0, b.f61769v, null);
        canvas.n();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.mUb(densityN);
        drawParams3.gh(layoutDirectionRl);
        drawParams3.xMQ(canvasT);
        drawParams3.qie(jNr2);
        return imageBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final OffsetProvider offsetProvider, final boolean z2, ResolvedTextDirection resolvedTextDirection, boolean z3, long j2, final float f3, final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        ResolvedTextDirection resolvedTextDirection2;
        boolean z4;
        long jN;
        final boolean zJ2;
        boolean zN;
        Object objIF;
        Composer composerKN = composer.KN(-466280168);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(offsetProvider) : composerKN.E2(offsetProvider) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            resolvedTextDirection2 = resolvedTextDirection;
        } else {
            resolvedTextDirection2 = resolvedTextDirection;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(resolvedTextDirection2) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
            z4 = z3;
        } else {
            z4 = z3;
            if ((i2 & 3072) == 0) {
                i5 |= composerKN.n(z4) ? 2048 : 1024;
            }
        }
        if ((i2 & 24576) == 0) {
            jN = j2;
            i5 |= ((i3 & 16) == 0 && composerKN.nr(jN)) ? 16384 : 8192;
        } else {
            jN = j2;
        }
        if ((i3 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 |= composerKN.p5(modifier) ? 1048576 : 524288;
        }
        if (composerKN.HI((533651 & i5) != 533650, i5 & 1)) {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if ((i3 & 16) != 0) {
                    jN = DpSize.INSTANCE.n();
                    i5 &= -57345;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-466280168, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
                }
                zJ2 = SelectionHandlesKt.J2(z2, resolvedTextDirection, z3);
                AbsoluteAlignment absoluteAlignment = AbsoluteAlignment.f31033n;
                Alignment alignmentNr = !zJ2 ? absoluteAlignment.nr() : absoluteAlignment.t();
                int i7 = i5 & 14;
                zN = ((i5 & 112) != 32) | (i7 != 4 || ((i5 & 8) != 0 && composerKN.E2(offsetProvider))) | composerKN.n(zJ2);
                objIF = composerKN.iF();
                if (!zN || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            long jN2 = offsetProvider.n();
                            semanticsPropertyReceiver.t(SelectionHandlesKt.nr(), new SelectionHandleInfo(z2 ? Handle.f19679t : Handle.f19676O, jN2, zJ2 ? SelectionHandleAnchor.f20863n : SelectionHandleAnchor.f20862O, (9223372034707292159L & jN2) != 9205357640488583168L, null));
                        }
                    };
                    composerKN.o(objIF);
                }
                final Modifier modifierNr = SemanticsModifierKt.nr(modifier, false, (Function1) objIF, 1, null);
                final ViewConfiguration viewConfiguration = (ViewConfiguration) composerKN.ty(CompositionLocalsKt.XQ());
                final long j3 = jN;
                n(offsetProvider, alignmentNr, ComposableLambdaKt.nr(1365123137, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i8) {
                        if (!composer2.HI((i8 & 3) != 2, i8 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1365123137, i8, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
                        }
                        ProvidedValue providedValueNr = CompositionLocalsKt.XQ().nr(viewConfiguration);
                        final long j4 = j3;
                        final boolean z5 = zJ2;
                        final Modifier modifier2 = modifierNr;
                        final OffsetProvider offsetProvider2 = offsetProvider;
                        CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(1260045569, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void n(Composer composer3, int i9) {
                                if (!composer3.HI((i9 & 3) != 2, 1 & i9)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1260045569, i9, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
                                }
                                if (j4 != 9205357640488583168L) {
                                    composer3.eF(-837626688);
                                    Arrangement.Horizontal horizontalRl = z5 ? Arrangement.Absolute.f17403n.rl() : Arrangement.Absolute.f17403n.n();
                                    Modifier modifierR = SizeKt.r(modifier2, DpSize.mUb(j4), DpSize.xMQ(j4), 0.0f, 0.0f, 12, null);
                                    final OffsetProvider offsetProvider3 = offsetProvider2;
                                    boolean z6 = z5;
                                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalRl, Alignment.INSTANCE.qie(), composer3, 0);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierR);
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN = Updater.n(composer3);
                                    Updater.O(composerN, measurePolicyRl, companion.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                    Function2 function2Rl = companion.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion.nr());
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    boolean zE2 = composer3.E2(offsetProvider3);
                                    Object objIF2 = composer3.iF();
                                    if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke() {
                                                return Boolean.valueOf((offsetProvider3.n() & 9223372034707292159L) != 9205357640488583168L);
                                            }
                                        };
                                        composer3.o(objIF2);
                                    }
                                    AndroidSelectionHandles_androidKt.t(companion2, (Function0) objIF2, z6, composer3, 6);
                                    composer3.XQ();
                                    composer3.Xw();
                                } else {
                                    composer3.eF(-836697680);
                                    Modifier modifier3 = modifier2;
                                    boolean zE22 = composer3.E2(offsetProvider2);
                                    final OffsetProvider offsetProvider4 = offsetProvider2;
                                    Object objIF3 = composer3.iF();
                                    if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                                        objIF3 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke() {
                                                return Boolean.valueOf((offsetProvider4.n() & 9223372034707292159L) != 9205357640488583168L);
                                            }
                                        };
                                        composer3.o(objIF3);
                                    }
                                    AndroidSelectionHandles_androidKt.t(modifier3, (Function0) objIF3, z5, composer3, 0);
                                    composer3.Xw();
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, ProvidedValue.xMQ | 48);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, i7 | RendererCapabilities.DECODER_SUPPORT_MASK);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                jN = j3;
            } else {
                composerKN.wTp();
                if ((i3 & 16) != 0) {
                    i5 &= -57345;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                zJ2 = SelectionHandlesKt.J2(z2, resolvedTextDirection, z3);
                AbsoluteAlignment absoluteAlignment2 = AbsoluteAlignment.f31033n;
                if (!zJ2) {
                }
                int i72 = i5 & 14;
                if (i72 != 4) {
                    zN = ((i5 & 112) != 32) | (i72 != 4 || ((i5 & 8) != 0 && composerKN.E2(offsetProvider))) | composerKN.n(zJ2);
                    objIF = composerKN.iF();
                    if (!zN) {
                        objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                long jN2 = offsetProvider.n();
                                semanticsPropertyReceiver.t(SelectionHandlesKt.nr(), new SelectionHandleInfo(z2 ? Handle.f19679t : Handle.f19676O, jN2, zJ2 ? SelectionHandleAnchor.f20863n : SelectionHandleAnchor.f20862O, (9223372034707292159L & jN2) != 9205357640488583168L, null));
                            }
                        };
                        composerKN.o(objIF);
                        final Modifier modifierNr2 = SemanticsModifierKt.nr(modifier, false, (Function1) objIF, 1, null);
                        final ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerKN.ty(CompositionLocalsKt.XQ());
                        final long j32 = jN;
                        n(offsetProvider, alignmentNr, ComposableLambdaKt.nr(1365123137, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i8) {
                                if (!composer2.HI((i8 & 3) != 2, i8 & 1)) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1365123137, i8, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
                                }
                                ProvidedValue providedValueNr = CompositionLocalsKt.XQ().nr(viewConfiguration2);
                                final long j4 = j32;
                                final boolean z5 = zJ2;
                                final Modifier modifier2 = modifierNr2;
                                final OffsetProvider offsetProvider2 = offsetProvider;
                                CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(1260045569, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void n(Composer composer3, int i9) {
                                        if (!composer3.HI((i9 & 3) != 2, 1 & i9)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1260045569, i9, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
                                        }
                                        if (j4 != 9205357640488583168L) {
                                            composer3.eF(-837626688);
                                            Arrangement.Horizontal horizontalRl = z5 ? Arrangement.Absolute.f17403n.rl() : Arrangement.Absolute.f17403n.n();
                                            Modifier modifierR = SizeKt.r(modifier2, DpSize.mUb(j4), DpSize.xMQ(j4), 0.0f, 0.0f, 12, null);
                                            final OffsetProvider offsetProvider3 = offsetProvider2;
                                            boolean z6 = z5;
                                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalRl, Alignment.INSTANCE.qie(), composer3, 0);
                                            int iN = ComposablesKt.n(composer3, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer3, modifierR);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion.n();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer3.T();
                                            if (composer3.getInserting()) {
                                                composer3.s7N(function0N);
                                            } else {
                                                composer3.r();
                                            }
                                            Composer composerN = Updater.n(composer3);
                                            Updater.O(composerN, measurePolicyRl, companion.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                                            Function2 function2Rl = companion.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion.nr());
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            boolean zE2 = composer3.E2(offsetProvider3);
                                            Object objIF2 = composer3.iF();
                                            if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                                                objIF2 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                    public final Boolean invoke() {
                                                        return Boolean.valueOf((offsetProvider3.n() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                };
                                                composer3.o(objIF2);
                                            }
                                            AndroidSelectionHandles_androidKt.t(companion2, (Function0) objIF2, z6, composer3, 6);
                                            composer3.XQ();
                                            composer3.Xw();
                                        } else {
                                            composer3.eF(-836697680);
                                            Modifier modifier3 = modifier2;
                                            boolean zE22 = composer3.E2(offsetProvider2);
                                            final OffsetProvider offsetProvider4 = offsetProvider2;
                                            Object objIF3 = composer3.iF();
                                            if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                                                objIF3 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                    public final Boolean invoke() {
                                                        return Boolean.valueOf((offsetProvider4.n() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                };
                                                composer3.o(objIF3);
                                            }
                                            AndroidSelectionHandles_androidKt.t(modifier3, (Function0) objIF3, z5, composer3, 0);
                                            composer3.Xw();
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer2, 54), composer2, ProvidedValue.xMQ | 48);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, i72 | RendererCapabilities.DECODER_SUPPORT_MASK);
                        if (ComposerKt.v()) {
                        }
                        jN = j32;
                    }
                }
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final ResolvedTextDirection resolvedTextDirection3 = resolvedTextDirection2;
            final boolean z5 = z4;
            final long j4 = jN;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    AndroidSelectionHandles_androidKt.rl(offsetProvider, z2, resolvedTextDirection3, z5, j4, f3, modifier, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    public static final void t(final Modifier modifier, final Function0 function0, final boolean z2, Composer composer, final int i2) {
        int i3;
        boolean z3;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(2111672474);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function0)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.n(z2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerKN.HI(z3, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(2111672474, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:127)");
            }
            SpacerKt.n(O(SizeKt.S(modifier, SelectionHandlesKt.t(), SelectionHandlesKt.rl()), function0, z2), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandleIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    AndroidSelectionHandles_androidKt.t(modifier, function0, z2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
