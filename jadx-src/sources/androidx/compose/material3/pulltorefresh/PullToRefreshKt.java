package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0081\u0001\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aN\u0010\u001a\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a(\u0010$\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00022\u0006\u0010#\u001a\u00020\u0017H\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a>\u0010-\u001a\u00020\u0003*\u00020&2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u0010/\u001a\u00020(2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b/\u00100\u001aF\u00104\u001a\u00020\u0003*\u00020&2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020*2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\"\u0014\u00107\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00106\"\u0014\u00108\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00106\"\u001a\u0010<\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u0010;\"\u001a\u0010>\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b=\u0010;\"\u0014\u0010@\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00106\"\u0014\u0010B\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00106\"\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020!0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\f\u0010G\u001a\u00020!8\nX\u008a\u0084\u0002"}, d2 = {"", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "indicator", AppLovinEventTypes.USER_VIEWED_CONTENT, "nr", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "threshold", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "elevation", "ck", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLandroidx/compose/ui/graphics/Shape;JF)Landroidx/compose/ui/Modifier;", "enabled", "ty", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "r", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "progress", TtmlNode.ATTR_TTS_COLOR, "rl", "(Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "alpha", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", IV8ValueMap.FUNCTION_VALUES, "Landroidx/compose/ui/geometry/Rect;", "arcBounds", "strokeWidth", "qie", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", c.f62177j, "(F)Landroidx/compose/material3/pulltorefresh/ArrowValues;", "Landroidx/compose/ui/graphics/Path;", "arrow", "bounds", "gh", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "F", "StrokeWidth", "ArcRadius", "t", "az", "()F", "SpinnerSize", "getSpinnerContainerSize", "SpinnerContainerSize", "O", "ArrowWidth", "J2", "ArrowHeight", "Landroidx/compose/animation/core/TweenSpec;", "Uo", "Landroidx/compose/animation/core/TweenSpec;", "AlphaTween", "targetAlpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,678:1\n71#2:679\n69#2,5:680\n74#2:713\n78#2:717\n78#3,6:685\n85#3,4:700\n89#3,2:710\n93#3:716\n368#4,9:691\n377#4:712\n378#4,2:714\n4032#5,6:704\n1223#6,3:718\n1226#6,3:722\n1223#6,6:725\n1223#6,6:731\n1223#6,6:737\n1#7:721\n147#8,5:743\n272#8,14:748\n81#9:762\n158#10:763\n158#10:764\n148#10:765\n148#10:766\n148#10:767\n148#10:768\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n136#1:679\n136#1:680,5\n136#1:713\n136#1:717\n136#1:685,6\n136#1:700,4\n136#1:710,2\n136#1:716\n136#1:691,9\n136#1:712\n136#1:714,2\n136#1:704,6\n563#1:718,3\n563#1:722,3\n565#1:725,6\n568#1:731,6\n572#1:737,6\n650#1:743,5\n650#1:748,14\n565#1:762\n659#1:763\n660#1:764\n661#1:765\n662#1:766\n663#1:767\n664#1:768\n*E\n"})
public final class PullToRefreshKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f29333n = Dp.KN((float) 2.5d);
    private static final float rl = Dp.KN((float) 5.5d);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f29334t = Dp.KN(16);
    private static final float nr = Dp.KN(40);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f29332O = Dp.KN(10);
    private static final float J2 = Dp.KN(5);
    private static final TweenSpec Uo = AnimationSpecKt.ty(d.f62986a, 0, EasingKt.O(), 2, null);

    public static /* synthetic */ Modifier HI(Modifier modifier, boolean z2, PullToRefreshState pullToRefreshState, boolean z3, float f3, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        boolean z4 = z3;
        if ((i2 & 8) != 0) {
            f3 = PullToRefreshDefaults.f29315n.O();
        }
        return ty(modifier, z2, pullToRefreshState, z4, f3, function0);
    }

    public static /* synthetic */ Modifier Ik(Modifier modifier, PullToRefreshState pullToRefreshState, boolean z2, float f3, Shape shape, long j2, float f4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f3 = PullToRefreshDefaults.f29315n.O();
        }
        float f5 = f3;
        if ((i2 & 8) != 0) {
            shape = PullToRefreshDefaults.f29315n.J2();
        }
        Shape shape2 = shape;
        if ((i2 & 16) != 0) {
            j2 = Color.INSTANCE.Uo();
        }
        return ck(modifier, pullToRefreshState, z2, f5, shape2, j2, (i2 & 32) != 0 ? PullToRefreshDefaults.f29315n.t() : f4);
    }

    public static final float az() {
        return f29334t;
    }

    public static final Modifier ck(Modifier modifier, final PullToRefreshState pullToRefreshState, final boolean z2, final float f3, final Shape shape, long j2, final float f4) {
        return BackgroundKt.t(GraphicsLayerModifierKt.n(DrawModifierKt.nr(SizeKt.Z(modifier, nr), new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                n(contentDrawScope);
                return Unit.INSTANCE;
            }

            public final void n(ContentDrawScope contentDrawScope) {
                int iRl = ClipOp.INSTANCE.rl();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jT2 = drawContext.t();
                drawContext.KN().O();
                try {
                    drawContext.getTransform().rl(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iRl);
                    contentDrawScope.l2();
                } finally {
                    drawContext.KN().n();
                    drawContext.xMQ(jT2);
                }
            }
        }), new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                n(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            public final void n(GraphicsLayerScope graphicsLayerScope) {
                boolean z3 = pullToRefreshState.n() > 0.0f || z2;
                graphicsLayerScope.O((pullToRefreshState.n() * graphicsLayerScope.How(f3)) - Size.xMQ(graphicsLayerScope.getSize()));
                graphicsLayerScope.wTp(z3 ? graphicsLayerScope.l(f4) : 0.0f);
                graphicsLayerScope.pS(shape);
                graphicsLayerScope.X(true);
            }
        }), j2, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(DrawScope drawScope, Path path, Rect rect, long j2, float f3, ArrowValues arrowValues, float f4) {
        path.reset();
        path.Ik(0.0f, 0.0f);
        float f5 = f29332O;
        path.S((drawScope.l(f5) * arrowValues.getScale()) / 2, drawScope.l(J2) * arrowValues.getScale());
        path.S(drawScope.l(f5) * arrowValues.getScale(), 0.0f);
        path.qie(OffsetKt.n(((Math.min(rect.S(), rect.ty()) / 2.0f) + Offset.az(rect.az())) - ((drawScope.l(f5) * arrowValues.getScale()) / 2.0f), Offset.ty(rect.az()) - drawScope.l(f4)));
        float endAngle = arrowValues.getEndAngle() - drawScope.l(f4);
        long jCo = drawScope.Co();
        DrawContext drawContext = drawScope.getDrawContext();
        long jT2 = drawContext.t();
        drawContext.KN().O();
        try {
            drawContext.getTransform().KN(endAngle, jCo);
            DrawScope.EWS(drawScope, path, j2, f3, new Stroke(drawScope.l(f4), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            drawContext.KN().n();
            drawContext.xMQ(jT2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues n(float f3) {
        float fMax = (Math.max(Math.min(1.0f, f3) - 0.4f, 0.0f) * 5) / 3;
        float fCoerceIn = RangesKt.coerceIn(Math.abs(f3) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4))) * 0.5f;
        float f4 = 360;
        return new ArrowValues(fPow, fPow * f4, ((0.8f * fMax) + fPow) * f4, Math.min(1.0f, fMax));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final boolean z2, final Function0 function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3 function3, final Function3 function32, Composer composer, final int i2, final int i3) {
        int i5;
        Function0 function02;
        Modifier modifier2;
        final PullToRefreshState pullToRefreshStateR;
        int i7;
        Alignment alignmentHI;
        int i8;
        Function3 function3Nr;
        Modifier modifier3;
        int i9;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final Modifier modifier4;
        final PullToRefreshState pullToRefreshState2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1902956467);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    pullToRefreshStateR = pullToRefreshState;
                    int i11 = composerKN.p5(pullToRefreshStateR) ? 2048 : 1024;
                    i5 |= i11;
                } else {
                    pullToRefreshStateR = pullToRefreshState;
                }
                i5 |= i11;
            } else {
                pullToRefreshStateR = pullToRefreshState;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    alignmentHI = alignment;
                    i5 |= composerKN.p5(alignmentHI) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        function3Nr = function3;
                        i5 |= composerKN.E2(function3Nr) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                    }
                    if ((599187 & i5) == 599186 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                                pullToRefreshStateR = r(composerKN, 0);
                            }
                            if (i7 != 0) {
                                alignmentHI = Alignment.INSTANCE.HI();
                            }
                            if (i8 == 0) {
                                i9 = i5;
                                function3Nr = ComposableLambdaKt.nr(1989171225, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                        n(boxScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(BoxScope boxScope, Composer composer2, int i12) {
                                        int i13;
                                        if ((i12 & 6) == 0) {
                                            i13 = i12 | (composer2.p5(boxScope) ? 4 : 2);
                                        } else {
                                            i13 = i12;
                                        }
                                        if ((i13 & 19) == 18 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1989171225, i13, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:127)");
                                        }
                                        PullToRefreshDefaults.f29315n.n(pullToRefreshStateR, z2, boxScope.n(Modifier.INSTANCE, Alignment.INSTANCE.az()), 0L, 0L, 0.0f, composer2, 1572864, 56);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                            } else {
                                i9 = i5;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            i9 = i5;
                            modifier3 = modifier2;
                        }
                        PullToRefreshState pullToRefreshState3 = pullToRefreshStateR;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1902956467, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:134)");
                        }
                        Modifier modifier5 = modifier3;
                        Modifier modifierHI = HI(modifier5, z2, pullToRefreshState3, false, 0.0f, function02, 12, null);
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentHI, false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifierHI);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N);
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo, companion.t());
                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                        function2Rl = companion.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        function32.invoke(boxScopeInstance, composerKN, Integer.valueOf(((i9 >> 15) & 112) | 6));
                        function3Nr.invoke(boxScopeInstance, composerKN, Integer.valueOf(((i9 >> 12) & 112) | 6));
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier4 = modifier5;
                        pullToRefreshState2 = pullToRefreshState3;
                    } else {
                        composerKN.wTp();
                        modifier4 = modifier2;
                        pullToRefreshState2 = pullToRefreshStateR;
                    }
                    final Alignment alignment2 = alignmentHI;
                    final Function3 function33 = function3Nr;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshBox$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i12) {
                                PullToRefreshKt.nr(z2, function0, modifier4, pullToRefreshState2, alignment2, function33, function32, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                function3Nr = function3;
                if ((i3 & 64) == 0) {
                }
                if ((599187 & i5) == 599186) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        PullToRefreshState pullToRefreshState32 = pullToRefreshStateR;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        Modifier modifier52 = modifier3;
                        Modifier modifierHI2 = HI(modifier52, z2, pullToRefreshState32, false, 0.0f, function02, 12, null);
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(alignmentHI, false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierHI2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N2 = companion2.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo2, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk2, companion2.O());
                        function2Rl = companion2.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO2, companion2.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            function32.invoke(boxScopeInstance2, composerKN, Integer.valueOf(((i9 >> 15) & 112) | 6));
                            function3Nr.invoke(boxScopeInstance2, composerKN, Integer.valueOf(((i9 >> 12) & 112) | 6));
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier52;
                            pullToRefreshState2 = pullToRefreshState32;
                        }
                    }
                }
                final Alignment alignment22 = alignmentHI;
                final Function3 function332 = function3Nr;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            alignmentHI = alignment;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            function3Nr = function3;
            if ((i3 & 64) == 0) {
            }
            if ((599187 & i5) == 599186) {
            }
            final Alignment alignment222 = alignmentHI;
            final Function3 function3322 = function3Nr;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 3072) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        alignmentHI = alignment;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        function3Nr = function3;
        if ((i3 & 64) == 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        final Alignment alignment2222 = alignmentHI;
        final Function3 function33222 = function3Nr;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final Function0 function0, final long j2, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-569718810);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-569718810, i3, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objIF;
            if (objIF == companion.n()) {
                Path pathN = AndroidPath_androidKt.n();
                pathN.KN(PathFillType.INSTANCE.n());
                composerKN.o(pathN);
                obj = pathN;
            }
            final Path path = (Path) obj;
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt.O(new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Float invoke() {
                        return Float.valueOf(((Number) function0.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerKN.o(objIF2);
            }
            final State stateNr = AnimateAsStateKt.nr(t((State) objIF2), Uo, 0.0f, null, null, composerKN, 48, 28);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            Object objIF3 = composerKN.iF();
            if (z2 || objIF3 == companion.n()) {
                objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.ofS(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) function0.invoke()).floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0));
                    }
                };
                composerKN.o(objIF3);
            }
            Modifier modifierZ = SizeKt.Z(SemanticsModifierKt.t(companion2, true, (Function1) objIF3), f29334t);
            boolean zP5 = (i5 == 4) | composerKN.p5(stateNr) | ((i3 & 112) == 32) | composerKN.E2(path);
            Object objIF4 = composerKN.iF();
            if (zP5 || objIF4 == companion.n()) {
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        n(drawScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(DrawScope drawScope) {
                        ArrowValues arrowValuesN = PullToRefreshKt.n(((Number) function0.invoke()).floatValue());
                        float fFloatValue = ((Number) stateNr.getValue()).floatValue();
                        float rotation = arrowValuesN.getRotation();
                        long j3 = j2;
                        Path path2 = path;
                        long jCo = drawScope.Co();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jT2 = drawContext.t();
                        drawContext.KN().O();
                        try {
                            drawContext.getTransform().KN(rotation, jCo);
                            Rect rectRl = RectKt.rl(androidx.compose.ui.geometry.SizeKt.rl(drawScope.t()), drawScope.l(PullToRefreshKt.rl) + (drawScope.l(PullToRefreshKt.f29333n) / 2.0f));
                            PullToRefreshKt.qie(drawScope, j3, fFloatValue, arrowValuesN, rectRl, PullToRefreshKt.f29333n);
                            PullToRefreshKt.gh(drawScope, path2, rectRl, j3, fFloatValue, arrowValuesN, PullToRefreshKt.f29333n);
                        } finally {
                            drawContext.KN().n();
                            drawContext.xMQ(jT2);
                        }
                    }
                };
                composerKN.o(function1);
                objIF4 = function1;
            }
            CanvasKt.rl(modifierZ, (Function1) objIF4, composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    PullToRefreshKt.rl(function0, j2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final Modifier ty(Modifier modifier, boolean z2, PullToRefreshState pullToRefreshState, boolean z3, float f3, Function0 function0) {
        return modifier.Zmq(new PullToRefreshElement(z2, function0, z3, pullToRefreshState, f3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(DrawScope drawScope, long j2, float f3, ArrowValues arrowValues, Rect rect, float f4) {
        DrawScope.RQ(drawScope, j2, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.Z(), rect.Ik(), f3, new Stroke(drawScope.l(f4), 0.0f, StrokeCap.INSTANCE.n(), 0, null, 26, null), null, 0, 768, null);
    }

    public static final PullToRefreshState r(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(318623070, i2, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.O(new Object[0], PullToRefreshStateImpl.INSTANCE.n(), null, new Function0<PullToRefreshStateImpl>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$rememberPullToRefreshState$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final PullToRefreshStateImpl invoke() {
                return new PullToRefreshStateImpl();
            }
        }, composer, 3072, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return pullToRefreshStateImpl;
    }

    private static final float t(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
