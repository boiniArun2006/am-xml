package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aH\u0010\u000b\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001am\u0010\u0013\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a:\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aD\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aB\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a8\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a0\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a>\u0010\"\u001a\u00020\n*\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aR\u0010$\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\\\u0010&\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aD\u0010(\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aL\u0010*\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a8\u0010,\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a0\u0010.\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a6\u00104\u001a\u00020\n*\u00020\u00102\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a&\u00106\u001a\u00020\n*\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a6\u00108\u001a\u00020\n*\u00020\u00102\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00105\u001a>\u00109\u001a\u00020\n*\u00020\u00102\u0006\u00100\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\"\u0014\u0010<\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010;\"\u0014\u0010>\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010=\"\u001a\u0010A\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010;\u001a\u0004\b?\u0010@\"\u001a\u0010C\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010;\u001a\u0004\bB\u0010@\"\u001a\u0010E\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010;\u001a\u0004\bD\u0010@\"\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010G\"\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010G\"\u0014\u0010J\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010G\"\u0014\u0010K\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010G\"\u0014\u0010L\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010G\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "trackColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "gh", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "gapSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drawStopIndicator", "KN", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJIFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Uo", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "az", "(Landroidx/compose/ui/Modifier;JJIFLandroidx/compose/runtime/Composer;II)V", "mUb", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "qie", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "xMQ", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "startFraction", "endFraction", "strokeWidth", "iF", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "t", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V", "nr", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", c.f62177j, "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "O", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "J2", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "ViF", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "nY", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "g", "te", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "F", "SemanticsBoundsPadding", "Landroidx/compose/ui/Modifier;", "IncreaseSemanticsBounds", "getLinearIndicatorWidth", "()F", "LinearIndicatorWidth", "getLinearIndicatorHeight", "LinearIndicatorHeight", "getCircularIndicatorDiameter", "CircularIndicatorDiameter", "Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "CircularEasing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1024:1\n1223#2,6:1025\n1223#2,6:1031\n1223#2,6:1037\n1223#2,6:1043\n1223#2,6:1049\n1223#2,6:1055\n1223#2,6:1061\n1223#2,6:1069\n1223#2,6:1075\n1223#2,6:1082\n1223#2,6:1088\n77#3:1067\n77#3:1081\n1#4:1068\n71#5,7:1094\n86#5:1103\n56#5:1104\n148#6:1101\n148#6:1102\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n*L\n145#1:1025,6\n154#1:1031,6\n158#1:1037,6\n162#1:1043,6\n316#1:1049,6\n391#1:1055,6\n582#1:1061,6\n586#1:1069,6\n590#1:1075,6\n692#1:1082,6\n737#1:1088,6\n583#1:1067\n639#1:1081\n824#1:1094,7\n970#1:1103\n970#1:1104\n469#1:1101\n961#1:1102\n*E\n"})
public final class ProgressIndicatorKt {
    private static final CubicBezierEasing J2;
    private static final CubicBezierEasing KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f26996O;
    private static final CubicBezierEasing Uo;
    private static final CubicBezierEasing mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26997n;
    private static final float nr;
    private static final Modifier rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f26998t;
    private static final CubicBezierEasing xMQ;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nY(DrawScope drawScope, long j2, Stroke stroke) {
        ViF(drawScope, 0.0f, 360.0f, j2, stroke);
    }

    static {
        float fKN = Dp.KN(10);
        f26997n = fKN;
        rl = PaddingKt.gh(SemanticsModifierKt.t(LayoutModifierKt.n(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return n(measureScope, measurable, constraints.getValue());
            }

            public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                final int iHow = measureScope.How(ProgressIndicatorKt.f26997n);
                int i2 = iHow * 2;
                final Placeable placeableDR0 = measurable.dR0(ConstraintsKt.xMQ(j2, 0, i2));
                return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight() - i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        n(placementScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, -iHow, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), 0.0f, fKN, 1, null);
        f26998t = Dp.KN(240);
        ProgressIndicatorTokens progressIndicatorTokens = ProgressIndicatorTokens.f29843n;
        nr = progressIndicatorTokens.J2();
        f26996O = Dp.KN(progressIndicatorTokens.t() - Dp.KN(progressIndicatorTokens.J2() * 2));
        J2 = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        Uo = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        KN = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        xMQ = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        mUb = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void J2(Modifier modifier, long j2, float f3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jRl;
        float f4;
        float fKN;
        long j3;
        Modifier modifier3;
        final Modifier modifier4;
        final long j4;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(947193756);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            jRl = j2;
            i5 |= ((i3 & 2) == 0 && composerKN.nr(jRl)) ? 32 : 16;
        } else {
            jRl = j2;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                f4 = f3;
                i5 |= composerKN.rl(f4) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        jRl = ProgressIndicatorDefaults.f26994n.rl(composerKN, 6);
                        i5 &= -113;
                    }
                    fKN = i8 == 0 ? ProgressIndicatorDefaults.f26994n.KN() : f4;
                    j3 = jRl;
                    modifier3 = modifier5;
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    fKN = f4;
                    j3 = jRl;
                    modifier3 = modifier2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(947193756, i5, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:770)");
                }
                ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.f26994n;
                nr(modifier3, j3, fKN, progressIndicatorDefaults.xMQ(composerKN, 6), progressIndicatorDefaults.O(), composerKN, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
                j4 = j3;
                f5 = fKN;
            } else {
                composerKN.wTp();
                modifier4 = modifier2;
                j4 = jRl;
                f5 = f4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$10
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
                        ProgressIndicatorKt.J2(modifier4, j4, f5, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        f4 = f3;
        if ((i5 & 147) == 146) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 2) != 0) {
                }
                if (i8 == 0) {
                }
                j3 = jRl;
                modifier3 = modifier5;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                ProgressIndicatorDefaults progressIndicatorDefaults2 = ProgressIndicatorDefaults.f26994n;
                nr(modifier3, j3, fKN, progressIndicatorDefaults2.xMQ(composerKN, 6), progressIndicatorDefaults2.O(), composerKN, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896), 0);
                if (ComposerKt.v()) {
                }
                modifier4 = modifier3;
                j4 = j3;
                f5 = fKN;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final Function0 function0, Modifier modifier, long j2, long j3, int i2, float f3, Function1 function1, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        final long jMUb;
        long jAz;
        int i8;
        int i9;
        int i10;
        float fGh;
        Function1 function12;
        boolean z2;
        Modifier modifier3;
        final float f4;
        final int i11;
        boolean z3;
        Object objIF;
        final Function0 function02;
        boolean zP5;
        Object objIF2;
        boolean z4;
        Object objIF3;
        final Function1 function13;
        final long j4;
        final long j5;
        final int i12;
        final float f5;
        final long j6;
        final Function1 function14;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-339970038);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i13 = i5 & 2;
        if (i13 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                jMUb = j2;
                i7 |= ((i5 & 4) == 0 && composerKN.nr(jMUb)) ? 256 : 128;
            } else {
                jMUb = j2;
            }
            if ((i3 & 3072) != 0) {
                jAz = j3;
                i7 |= ((i5 & 8) == 0 && composerKN.nr(jAz)) ? 2048 : 1024;
            } else {
                jAz = j3;
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    i9 = i2;
                    i7 |= composerKN.t(i9) ? 16384 : 8192;
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                    i7 |= 196608;
                    fGh = f3;
                } else {
                    fGh = f3;
                    if ((i3 & 196608) == 0) {
                        i7 |= composerKN.rl(fGh) ? 131072 : 65536;
                    }
                }
                if ((i3 & 1572864) == 0) {
                    function12 = function1;
                    i7 |= ((i5 & 64) == 0 && composerKN.E2(function12)) ? 1048576 : 524288;
                } else {
                    function12 = function1;
                }
                if ((i7 & 599187) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    f5 = fGh;
                    modifier3 = modifier2;
                    i12 = i9;
                    j6 = jMUb;
                    function14 = function12;
                } else {
                    composerKN.e();
                    z2 = true;
                    if ((i3 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i5 & 4) != 0) {
                            jMUb = ProgressIndicatorDefaults.f26994n.mUb(composerKN, 6);
                            i7 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jAz = ProgressIndicatorDefaults.f26994n.az(composerKN, 6);
                            i7 &= -7169;
                        }
                        final int iQie = i8 == 0 ? ProgressIndicatorDefaults.f26994n.qie() : i9;
                        if (i10 != 0) {
                            fGh = ProgressIndicatorDefaults.f26994n.gh();
                        }
                        if ((i5 & 64) != 0) {
                            boolean z5 = ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jMUb)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((57344 & i7) == 16384);
                            Object objIF4 = composerKN.iF();
                            if (z5 || objIF4 == Composer.INSTANCE.n()) {
                                objIF4 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
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
                                        ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.f26994n;
                                        progressIndicatorDefaults.n(drawScope, progressIndicatorDefaults.ty(), jMUb, iQie);
                                    }
                                };
                                composerKN.o(objIF4);
                            }
                            function12 = (Function1) objIF4;
                            i7 &= -3670017;
                        }
                        f4 = fGh;
                        i11 = iQie;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 4) != 0) {
                            i7 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            i7 &= -7169;
                        }
                        if ((i5 & 64) != 0) {
                            i7 &= -3670017;
                        }
                        f4 = fGh;
                        modifier3 = modifier2;
                        i11 = i9;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-339970038, i7, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:152)");
                    }
                    z3 = (i7 & 14) != 4;
                    objIF = composerKN.iF();
                    if (!z3 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final Float invoke() {
                                return Float.valueOf(RangesKt.coerceIn(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                            }
                        };
                        composerKN.o(objIF);
                    }
                    function02 = (Function0) objIF;
                    Modifier modifierZmq = modifier3.Zmq(rl);
                    zP5 = composerKN.p5(function02);
                    objIF2 = composerKN.iF();
                    if (!zP5 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.ofS(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) function02.invoke()).floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    Modifier modifierS = SizeKt.S(SemanticsModifierKt.t(modifierZmq, true, (Function1) objIF2), f26998t, nr);
                    boolean zP52 = ((57344 & i7) != 16384) | ((458752 & i7) != 131072) | composerKN.p5(function02) | ((((i7 & 7168) ^ 3072) <= 2048 && composerKN.nr(jAz)) || (i7 & 3072) == 2048) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jMUb)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                    if ((((3670016 & i7) ^ 1572864) <= 1048576 || !composerKN.p5(function12)) && (i7 & 1572864) != 1048576) {
                        z2 = false;
                    }
                    z4 = zP52 | z2;
                    objIF3 = composerKN.iF();
                    if (z4 || objIF3 == Composer.INSTANCE.n()) {
                        function13 = function12;
                        j4 = jMUb;
                        j5 = jAz;
                        objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
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
                                float fKN;
                                DrawScope drawScope2;
                                float fXMQ = Size.xMQ(drawScope.t());
                                if (!StrokeCap.Uo(i11, StrokeCap.INSTANCE.n()) && Size.xMQ(drawScope.t()) <= Size.gh(drawScope.t())) {
                                    fKN = Dp.KN(f4 + drawScope.bzg(fXMQ));
                                } else {
                                    fKN = f4;
                                }
                                float fBzg = fKN / drawScope.bzg(Size.gh(drawScope.t()));
                                float fFloatValue = ((Number) function02.invoke()).floatValue();
                                float fMin = fFloatValue + Math.min(fFloatValue, fBzg);
                                if (fMin <= 1.0f) {
                                    drawScope2 = drawScope;
                                    ProgressIndicatorKt.iF(drawScope2, fMin, 1.0f, j5, fXMQ, i11);
                                } else {
                                    drawScope2 = drawScope;
                                }
                                ProgressIndicatorKt.iF(drawScope2, 0.0f, fFloatValue, j4, fXMQ, i11);
                                function13.invoke(drawScope2);
                            }
                        };
                        composerKN.o(objIF3);
                    } else {
                        function13 = function12;
                        j4 = jMUb;
                        j5 = jAz;
                    }
                    CanvasKt.rl(modifierS, (Function1) objIF3, composerKN, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    i12 = i11;
                    f5 = f4;
                    jAz = j5;
                    j6 = j4;
                    function14 = function13;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    final Modifier modifier4 = modifier3;
                    final long j7 = jAz;
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i14) {
                            ProgressIndicatorKt.KN(function0, modifier4, j6, j7, i12, f5, function14, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 24576;
            i9 = i2;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i7 & 599187) == 599186) {
                composerKN.e();
                z2 = true;
                if ((i3 & 1) != 0) {
                    if (i13 == 0) {
                    }
                    if ((i5 & 4) != 0) {
                    }
                    if ((i5 & 8) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i5 & 64) != 0) {
                    }
                    f4 = fGh;
                    i11 = iQie;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    if ((i7 & 14) != 4) {
                    }
                    objIF = composerKN.iF();
                    if (!z3) {
                        objIF = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final Float invoke() {
                                return Float.valueOf(RangesKt.coerceIn(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                            }
                        };
                        composerKN.o(objIF);
                        function02 = (Function0) objIF;
                        Modifier modifierZmq2 = modifier3.Zmq(rl);
                        zP5 = composerKN.p5(function02);
                        objIF2 = composerKN.iF();
                        if (!zP5) {
                            objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.ofS(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) function02.invoke()).floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                                }
                            };
                            composerKN.o(objIF2);
                            Modifier modifierS2 = SizeKt.S(SemanticsModifierKt.t(modifierZmq2, true, (Function1) objIF2), f26998t, nr);
                            if (((i7 & 7168) ^ 3072) <= 2048) {
                                if (((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
                                    boolean zP522 = ((57344 & i7) != 16384) | ((458752 & i7) != 131072) | composerKN.p5(function02) | ((((i7 & 7168) ^ 3072) <= 2048 && composerKN.nr(jAz)) || (i7 & 3072) == 2048) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jMUb)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                                    if (((3670016 & i7) ^ 1572864) <= 1048576) {
                                        z2 = false;
                                        z4 = zP522 | z2;
                                        objIF3 = composerKN.iF();
                                        if (z4) {
                                            function13 = function12;
                                            j4 = jMUb;
                                            j5 = jAz;
                                            objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
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
                                                    float fKN;
                                                    DrawScope drawScope2;
                                                    float fXMQ = Size.xMQ(drawScope.t());
                                                    if (!StrokeCap.Uo(i11, StrokeCap.INSTANCE.n()) && Size.xMQ(drawScope.t()) <= Size.gh(drawScope.t())) {
                                                        fKN = Dp.KN(f4 + drawScope.bzg(fXMQ));
                                                    } else {
                                                        fKN = f4;
                                                    }
                                                    float fBzg = fKN / drawScope.bzg(Size.gh(drawScope.t()));
                                                    float fFloatValue = ((Number) function02.invoke()).floatValue();
                                                    float fMin = fFloatValue + Math.min(fFloatValue, fBzg);
                                                    if (fMin <= 1.0f) {
                                                        drawScope2 = drawScope;
                                                        ProgressIndicatorKt.iF(drawScope2, fMin, 1.0f, j5, fXMQ, i11);
                                                    } else {
                                                        drawScope2 = drawScope;
                                                    }
                                                    ProgressIndicatorKt.iF(drawScope2, 0.0f, fFloatValue, j4, fXMQ, i11);
                                                    function13.invoke(drawScope2);
                                                }
                                            };
                                            composerKN.o(objIF3);
                                            CanvasKt.rl(modifierS2, (Function1) objIF3, composerKN, 0);
                                            if (ComposerKt.v()) {
                                            }
                                            i12 = i11;
                                            f5 = f4;
                                            jAz = j5;
                                            j6 = j4;
                                            function14 = function13;
                                        }
                                    } else {
                                        z2 = false;
                                        z4 = zP522 | z2;
                                        objIF3 = composerKN.iF();
                                        if (z4) {
                                        }
                                    }
                                } else {
                                    boolean zP5222 = ((57344 & i7) != 16384) | ((458752 & i7) != 131072) | composerKN.p5(function02) | ((((i7 & 7168) ^ 3072) <= 2048 && composerKN.nr(jAz)) || (i7 & 3072) == 2048) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jMUb)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                                    if (((3670016 & i7) ^ 1572864) <= 1048576) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i2;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i7 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void O(final float f3, Modifier modifier, long j2, float f4, Composer composer, final int i2, final int i3) {
        float f5;
        int i5;
        Modifier modifier2;
        long jRl;
        int i7;
        float f6;
        float fKN;
        long j3;
        Modifier modifier3;
        final Modifier modifier4;
        final long j4;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(402841196);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            f5 = f3;
        } else if ((i2 & 6) == 0) {
            f5 = f3;
            i5 = (composerKN.rl(f5) ? 4 : 2) | i2;
        } else {
            f5 = f3;
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                jRl = j2;
                i5 |= ((i3 & 4) == 0 && composerKN.nr(jRl)) ? 256 : 128;
            } else {
                jRl = j2;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    f6 = f4;
                    i5 |= composerKN.rl(f6) ? 2048 : 1024;
                }
                if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    j4 = jRl;
                    f7 = f6;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) != 0) {
                            jRl = ProgressIndicatorDefaults.f26994n.rl(composerKN, 6);
                            i5 &= -897;
                        }
                        fKN = i7 == 0 ? ProgressIndicatorDefaults.f26994n.KN() : f6;
                        j3 = jRl;
                        modifier3 = modifier5;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        modifier3 = modifier2;
                        fKN = f6;
                        j3 = jRl;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(402841196, i5, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:753)");
                    }
                    ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.f26994n;
                    float f8 = fKN;
                    n(f5, modifier3, j3, f8, progressIndicatorDefaults.xMQ(composerKN, 6), progressIndicatorDefaults.t(), composerKN, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier4 = modifier3;
                    j4 = j3;
                    f7 = f8;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$9
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
                            ProgressIndicatorKt.O(f3, modifier4, j4, f7, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            f6 = f4;
            if ((i5 & 1171) == 1170) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i8 == 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i7 == 0) {
                    }
                    j3 = jRl;
                    modifier3 = modifier5;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    ProgressIndicatorDefaults progressIndicatorDefaults2 = ProgressIndicatorDefaults.f26994n;
                    float f82 = fKN;
                    n(f5, modifier3, j3, f82, progressIndicatorDefaults2.xMQ(composerKN, 6), progressIndicatorDefaults2.t(), composerKN, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                    if (ComposerKt.v()) {
                    }
                    modifier4 = modifier3;
                    j4 = j3;
                    f7 = f82;
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        f6 = f4;
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void Uo(Modifier modifier, long j2, long j3, int i2, Composer composer, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        long jMUb;
        long jAz;
        int i8;
        long j4;
        int iQie;
        Modifier modifier3;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final int i9;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-476865359);
        int i10 = i5 & 1;
        if (i10 != 0) {
            i7 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i7 = (composerKN.p5(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            if ((i5 & 2) == 0) {
                jMUb = j2;
                int i11 = composerKN.nr(jMUb) ? 32 : 16;
                i7 |= i11;
            } else {
                jMUb = j2;
            }
            i7 |= i11;
        } else {
            jMUb = j2;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            jAz = j3;
            i7 |= ((i5 & 4) == 0 && composerKN.nr(jAz)) ? 256 : 128;
        } else {
            jAz = j3;
        }
        int i12 = i5 & 8;
        if (i12 == 0) {
            if ((i3 & 3072) == 0) {
                i8 = i2;
                i7 |= composerKN.t(i8) ? 2048 : 1024;
            }
            if ((i7 & 1171) == 1170 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i3 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i5 & 2) != 0) {
                        jMUb = ProgressIndicatorDefaults.f26994n.mUb(composerKN, 6);
                        i7 &= -113;
                    }
                    if ((i5 & 4) != 0) {
                        jAz = ProgressIndicatorDefaults.f26994n.az(composerKN, 6);
                        i7 &= -897;
                    }
                    if (i12 == 0) {
                        iQie = ProgressIndicatorDefaults.f26994n.qie();
                        j4 = jAz;
                    } else {
                        j4 = jAz;
                        iQie = i8;
                    }
                    modifier3 = modifier5;
                } else {
                    composerKN.wTp();
                    if ((i5 & 2) != 0) {
                        i7 &= -113;
                    }
                    if ((i5 & 4) != 0) {
                        i7 &= -897;
                    }
                    j4 = jAz;
                    iQie = i8;
                    modifier3 = modifier2;
                }
                long j7 = jMUb;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-476865359, i7, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:217)");
                }
                az(modifier3, j7, j4, iQie, ProgressIndicatorDefaults.f26994n.gh(), composerKN, (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
                j5 = j7;
                j6 = j4;
                i9 = iQie;
            } else {
                composerKN.wTp();
                modifier4 = modifier2;
                j5 = jMUb;
                j6 = jAz;
                i9 = i8;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i13) {
                        ProgressIndicatorKt.Uo(modifier4, j5, j6, i9, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                    }
                });
                return;
            }
            return;
        }
        i7 |= 3072;
        i8 = i2;
        if ((i7 & 1171) == 1170) {
            composerKN.e();
            if ((i3 & 1) != 0) {
                if (i10 == 0) {
                }
                if ((i5 & 2) != 0) {
                }
                if ((i5 & 4) != 0) {
                }
                if (i12 == 0) {
                }
                modifier3 = modifier5;
                long j72 = jMUb;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                az(modifier3, j72, j4, iQie, ProgressIndicatorDefaults.f26994n.gh(), composerKN, (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168), 0);
                if (ComposerKt.v()) {
                }
                modifier4 = modifier3;
                j5 = j72;
                j6 = j4;
                i9 = iQie;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void az(Modifier modifier, long j2, long j3, int i2, float f3, Composer composer, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        long jMUb;
        long jAz;
        int iQie;
        int i8;
        final float f4;
        Modifier modifier3;
        final float fGh;
        final int i9;
        final State stateN;
        final State stateN2;
        final State stateN3;
        final State stateN4;
        boolean zP5;
        Object objIF;
        final long j4;
        final long j5;
        final Modifier modifier4;
        Composer composer2;
        final int i10;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(567589233);
        int i11 = i5 & 1;
        if (i11 != 0) {
            i7 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i7 = (composerKN.p5(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            jMUb = j2;
            i7 |= ((i5 & 2) == 0 && composerKN.nr(jMUb)) ? 32 : 16;
        } else {
            jMUb = j2;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            jAz = j3;
            i7 |= ((i5 & 4) == 0 && composerKN.nr(jAz)) ? 256 : 128;
        } else {
            jAz = j3;
        }
        int i12 = i5 & 8;
        if (i12 != 0) {
            i7 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                iQie = i2;
                i7 |= composerKN.t(iQie) ? 2048 : 1024;
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    f4 = f3;
                    i7 |= composerKN.rl(f4) ? 16384 : 8192;
                }
                if ((i7 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier4 = modifier2;
                    j7 = jMUb;
                    j6 = jAz;
                    i10 = iQie;
                } else {
                    composerKN.e();
                    if ((i3 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i5 & 2) != 0) {
                            jMUb = ProgressIndicatorDefaults.f26994n.mUb(composerKN, 6);
                            i7 &= -113;
                        }
                        if ((i5 & 4) != 0) {
                            jAz = ProgressIndicatorDefaults.f26994n.az(composerKN, 6);
                            i7 &= -897;
                        }
                        if (i12 != 0) {
                            iQie = ProgressIndicatorDefaults.f26994n.qie();
                        }
                        if (i8 == 0) {
                            fGh = ProgressIndicatorDefaults.f26994n.gh();
                        }
                        i9 = iQie;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(567589233, i7, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:253)");
                        }
                        InfiniteTransition infiniteTransitionT = InfiniteTransitionKt.t(null, composerKN, 0, 1);
                        InfiniteRepeatableSpec infiniteRepeatableSpecO = AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                n(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                                keyframesSpecConfig.nr(1800);
                                keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.J2);
                                keyframesSpecConfig.J2(Float.valueOf(1.0f), 750);
                            }
                        }), null, 0L, 6, null);
                        int i13 = InfiniteTransition.J2;
                        int i14 = InfiniteRepeatableSpec.nr;
                        stateN = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 1.0f, infiniteRepeatableSpecO, null, composerKN, i13 | 432 | (i14 << 9), 8);
                        stateN2 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                n(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                                keyframesSpecConfig.nr(1800);
                                keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 333), ProgressIndicatorKt.Uo);
                                keyframesSpecConfig.J2(Float.valueOf(1.0f), 1183);
                            }
                        }), null, 0L, 6, null), null, composerKN, i13 | 432 | (i14 << 9), 8);
                        stateN3 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                n(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                                keyframesSpecConfig.nr(1800);
                                keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.KN);
                                keyframesSpecConfig.J2(Float.valueOf(1.0f), 1567);
                            }
                        }), null, 0L, 6, null), null, composerKN, i13 | 432 | (i14 << 9), 8);
                        stateN4 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                n(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                                keyframesSpecConfig.nr(1800);
                                keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.xMQ);
                                keyframesSpecConfig.J2(Float.valueOf(1.0f), 1800);
                            }
                        }), null, 0L, 6, null), null, composerKN, i13 | 432 | (i14 << 9), 8);
                        Modifier modifierS = SizeKt.S(ProgressSemanticsKt.n(modifier3.Zmq(rl)), f26998t, nr);
                        zP5 = ((57344 & i7) == 16384) | ((i7 & 7168) == 2048) | composerKN.p5(stateN) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jAz)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.p5(stateN2) | ((((i7 & 112) ^ 48) > 32 && composerKN.nr(jMUb)) || (i7 & 48) == 32) | composerKN.p5(stateN3) | composerKN.p5(stateN4);
                        objIF = composerKN.iF();
                        if (zP5 || objIF == Composer.INSTANCE.n()) {
                            j4 = jMUb;
                            j5 = jAz;
                            objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7$1
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
                                    float fKN;
                                    DrawScope drawScope2;
                                    float fFloatValue;
                                    float fFloatValue2;
                                    float fFloatValue3;
                                    float fXMQ = Size.xMQ(drawScope.t());
                                    if (!StrokeCap.Uo(i9, StrokeCap.INSTANCE.n()) && Size.xMQ(drawScope.t()) <= Size.gh(drawScope.t())) {
                                        fKN = Dp.KN(fGh + drawScope.bzg(fXMQ));
                                    } else {
                                        fKN = fGh;
                                    }
                                    float fBzg = fKN / drawScope.bzg(Size.gh(drawScope.t()));
                                    float fFloatValue4 = 1.0f;
                                    if (((Number) stateN.getValue()).floatValue() < 1.0f - fBzg) {
                                        if (((Number) stateN.getValue()).floatValue() > 0.0f) {
                                            fFloatValue3 = ((Number) stateN.getValue()).floatValue() + fBzg;
                                        } else {
                                            fFloatValue3 = 0.0f;
                                        }
                                        drawScope2 = drawScope;
                                        ProgressIndicatorKt.iF(drawScope2, fFloatValue3, 1.0f, j5, fXMQ, i9);
                                    } else {
                                        drawScope2 = drawScope;
                                    }
                                    if (((Number) stateN.getValue()).floatValue() - ((Number) stateN2.getValue()).floatValue() > 0.0f) {
                                        ProgressIndicatorKt.iF(drawScope2, ((Number) stateN.getValue()).floatValue(), ((Number) stateN2.getValue()).floatValue(), j4, fXMQ, i9);
                                    }
                                    if (((Number) stateN2.getValue()).floatValue() > fBzg) {
                                        if (((Number) stateN3.getValue()).floatValue() > 0.0f) {
                                            fFloatValue = ((Number) stateN3.getValue()).floatValue() + fBzg;
                                        } else {
                                            fFloatValue = 0.0f;
                                        }
                                        if (((Number) stateN2.getValue()).floatValue() < 1.0f) {
                                            fFloatValue2 = ((Number) stateN2.getValue()).floatValue() - fBzg;
                                        } else {
                                            fFloatValue2 = 1.0f;
                                        }
                                        ProgressIndicatorKt.iF(drawScope2, fFloatValue, fFloatValue2, j5, fXMQ, i9);
                                    }
                                    if (((Number) stateN3.getValue()).floatValue() - ((Number) stateN4.getValue()).floatValue() > 0.0f) {
                                        ProgressIndicatorKt.iF(drawScope2, ((Number) stateN3.getValue()).floatValue(), ((Number) stateN4.getValue()).floatValue(), j4, fXMQ, i9);
                                    }
                                    if (((Number) stateN4.getValue()).floatValue() > fBzg) {
                                        if (((Number) stateN4.getValue()).floatValue() < 1.0f) {
                                            fFloatValue4 = ((Number) stateN4.getValue()).floatValue() - fBzg;
                                        }
                                        ProgressIndicatorKt.iF(drawScope2, 0.0f, fFloatValue4, j5, fXMQ, i9);
                                    }
                                }
                            };
                            composerKN.o(objIF);
                        } else {
                            j4 = jMUb;
                            j5 = jAz;
                        }
                        CanvasKt.rl(modifierS, (Function1) objIF, composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier4 = modifier3;
                        composer2 = composerKN;
                        i10 = i9;
                        f4 = fGh;
                        j6 = j5;
                        j7 = j4;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 2) != 0) {
                            i7 &= -113;
                        }
                        if ((i5 & 4) != 0) {
                            i7 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                    fGh = f4;
                    i9 = iQie;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    InfiniteTransition infiniteTransitionT2 = InfiniteTransitionKt.t(null, composerKN, 0, 1);
                    InfiniteRepeatableSpec infiniteRepeatableSpecO2 = AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1800);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.J2);
                            keyframesSpecConfig.J2(Float.valueOf(1.0f), 750);
                        }
                    }), null, 0L, 6, null);
                    int i132 = InfiniteTransition.J2;
                    int i142 = InfiniteRepeatableSpec.nr;
                    stateN = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 1.0f, infiniteRepeatableSpecO2, null, composerKN, i132 | 432 | (i142 << 9), 8);
                    stateN2 = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1800);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 333), ProgressIndicatorKt.Uo);
                            keyframesSpecConfig.J2(Float.valueOf(1.0f), 1183);
                        }
                    }), null, 0L, 6, null), null, composerKN, i132 | 432 | (i142 << 9), 8);
                    stateN3 = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1800);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.KN);
                            keyframesSpecConfig.J2(Float.valueOf(1.0f), 1567);
                        }
                    }), null, 0L, 6, null), null, composerKN, i132 | 432 | (i142 << 9), 8);
                    stateN4 = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1800);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.xMQ);
                            keyframesSpecConfig.J2(Float.valueOf(1.0f), 1800);
                        }
                    }), null, 0L, 6, null), null, composerKN, i132 | 432 | (i142 << 9), 8);
                    Modifier modifierS2 = SizeKt.S(ProgressSemanticsKt.n(modifier3.Zmq(rl)), f26998t, nr);
                    if ((i7 & 7168) == 2048) {
                    }
                    if (((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
                        if (((i7 & 112) ^ 48) > 32) {
                            zP5 = ((57344 & i7) == 16384) | ((i7 & 7168) == 2048) | composerKN.p5(stateN) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jAz)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.p5(stateN2) | ((((i7 & 112) ^ 48) > 32 && composerKN.nr(jMUb)) || (i7 & 48) == 32) | composerKN.p5(stateN3) | composerKN.p5(stateN4);
                            objIF = composerKN.iF();
                            if (zP5) {
                                j4 = jMUb;
                                j5 = jAz;
                                objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7$1
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
                                        float fKN;
                                        DrawScope drawScope2;
                                        float fFloatValue;
                                        float fFloatValue2;
                                        float fFloatValue3;
                                        float fXMQ = Size.xMQ(drawScope.t());
                                        if (!StrokeCap.Uo(i9, StrokeCap.INSTANCE.n()) && Size.xMQ(drawScope.t()) <= Size.gh(drawScope.t())) {
                                            fKN = Dp.KN(fGh + drawScope.bzg(fXMQ));
                                        } else {
                                            fKN = fGh;
                                        }
                                        float fBzg = fKN / drawScope.bzg(Size.gh(drawScope.t()));
                                        float fFloatValue4 = 1.0f;
                                        if (((Number) stateN.getValue()).floatValue() < 1.0f - fBzg) {
                                            if (((Number) stateN.getValue()).floatValue() > 0.0f) {
                                                fFloatValue3 = ((Number) stateN.getValue()).floatValue() + fBzg;
                                            } else {
                                                fFloatValue3 = 0.0f;
                                            }
                                            drawScope2 = drawScope;
                                            ProgressIndicatorKt.iF(drawScope2, fFloatValue3, 1.0f, j5, fXMQ, i9);
                                        } else {
                                            drawScope2 = drawScope;
                                        }
                                        if (((Number) stateN.getValue()).floatValue() - ((Number) stateN2.getValue()).floatValue() > 0.0f) {
                                            ProgressIndicatorKt.iF(drawScope2, ((Number) stateN.getValue()).floatValue(), ((Number) stateN2.getValue()).floatValue(), j4, fXMQ, i9);
                                        }
                                        if (((Number) stateN2.getValue()).floatValue() > fBzg) {
                                            if (((Number) stateN3.getValue()).floatValue() > 0.0f) {
                                                fFloatValue = ((Number) stateN3.getValue()).floatValue() + fBzg;
                                            } else {
                                                fFloatValue = 0.0f;
                                            }
                                            if (((Number) stateN2.getValue()).floatValue() < 1.0f) {
                                                fFloatValue2 = ((Number) stateN2.getValue()).floatValue() - fBzg;
                                            } else {
                                                fFloatValue2 = 1.0f;
                                            }
                                            ProgressIndicatorKt.iF(drawScope2, fFloatValue, fFloatValue2, j5, fXMQ, i9);
                                        }
                                        if (((Number) stateN3.getValue()).floatValue() - ((Number) stateN4.getValue()).floatValue() > 0.0f) {
                                            ProgressIndicatorKt.iF(drawScope2, ((Number) stateN3.getValue()).floatValue(), ((Number) stateN4.getValue()).floatValue(), j4, fXMQ, i9);
                                        }
                                        if (((Number) stateN4.getValue()).floatValue() > fBzg) {
                                            if (((Number) stateN4.getValue()).floatValue() < 1.0f) {
                                                fFloatValue4 = ((Number) stateN4.getValue()).floatValue() - fBzg;
                                            }
                                            ProgressIndicatorKt.iF(drawScope2, 0.0f, fFloatValue4, j5, fXMQ, i9);
                                        }
                                    }
                                };
                                composerKN.o(objIF);
                                CanvasKt.rl(modifierS2, (Function1) objIF, composerKN, 0);
                                if (ComposerKt.v()) {
                                }
                                modifier4 = modifier3;
                                composer2 = composerKN;
                                i10 = i9;
                                f4 = fGh;
                                j6 = j5;
                                j7 = j4;
                            }
                        } else {
                            zP5 = ((57344 & i7) == 16384) | ((i7 & 7168) == 2048) | composerKN.p5(stateN) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jAz)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.p5(stateN2) | ((((i7 & 112) ^ 48) > 32 && composerKN.nr(jMUb)) || (i7 & 48) == 32) | composerKN.p5(stateN3) | composerKN.p5(stateN4);
                            objIF = composerKN.iF();
                            if (zP5) {
                            }
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i15) {
                            ProgressIndicatorKt.az(modifier4, j7, j6, i10, f4, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 24576;
            f4 = f3;
            if ((i7 & 9363) == 9362) {
                composerKN.e();
                if ((i3 & 1) != 0) {
                    if (i11 == 0) {
                    }
                    if ((i5 & 2) != 0) {
                    }
                    if ((i5 & 4) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i8 == 0) {
                        fGh = f4;
                    }
                    i9 = iQie;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    InfiniteTransition infiniteTransitionT22 = InfiniteTransitionKt.t(null, composerKN, 0, 1);
                    InfiniteRepeatableSpec infiniteRepeatableSpecO22 = AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1800);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.J2);
                            keyframesSpecConfig.J2(Float.valueOf(1.0f), 750);
                        }
                    }), null, 0L, 6, null);
                    int i1322 = InfiniteTransition.J2;
                    int i1422 = InfiniteRepeatableSpec.nr;
                    stateN = InfiniteTransitionKt.n(infiniteTransitionT22, 0.0f, 1.0f, infiniteRepeatableSpecO22, null, composerKN, i1322 | 432 | (i1422 << 9), 8);
                    stateN2 = InfiniteTransitionKt.n(infiniteTransitionT22, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1800);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 333), ProgressIndicatorKt.Uo);
                            keyframesSpecConfig.J2(Float.valueOf(1.0f), 1183);
                        }
                    }), null, 0L, 6, null), null, composerKN, i1322 | 432 | (i1422 << 9), 8);
                    stateN3 = InfiniteTransitionKt.n(infiniteTransitionT22, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1800);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.KN);
                            keyframesSpecConfig.J2(Float.valueOf(1.0f), 1567);
                        }
                    }), null, 0L, 6, null), null, composerKN, i1322 | 432 | (i1422 << 9), 8);
                    stateN4 = InfiniteTransitionKt.n(infiniteTransitionT22, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1800);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.xMQ);
                            keyframesSpecConfig.J2(Float.valueOf(1.0f), 1800);
                        }
                    }), null, 0L, 6, null), null, composerKN, i1322 | 432 | (i1422 << 9), 8);
                    Modifier modifierS22 = SizeKt.S(ProgressSemanticsKt.n(modifier3.Zmq(rl)), f26998t, nr);
                    if ((i7 & 7168) == 2048) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        iQie = i2;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        f4 = f3;
        if ((i7 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void gh(final Function0 function0, Modifier modifier, long j2, long j3, int i2, Composer composer, final int i3, final int i5) {
        Function0 function02;
        int i7;
        Modifier modifier2;
        long j4;
        long jAz;
        int i8;
        int i9;
        long jMUb;
        long j5;
        int iQie;
        Modifier modifier3;
        long j6;
        Composer composer2;
        final Modifier modifier4;
        final long j7;
        final long j9;
        final int i10;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1796992155);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i3 & 6) == 0) {
                i7 = (composerKN.E2(function02) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    j4 = j2;
                    int i12 = composerKN.nr(j4) ? 256 : 128;
                    i7 |= i12;
                } else {
                    j4 = j2;
                }
                i7 |= i12;
            } else {
                j4 = j2;
            }
            if ((i3 & 3072) != 0) {
                jAz = j3;
                i7 |= ((i5 & 8) == 0 && composerKN.nr(jAz)) ? 2048 : 1024;
            } else {
                jAz = j3;
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    i9 = i2;
                    i7 |= composerKN.t(i9) ? 16384 : 8192;
                }
                if ((i7 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier4 = modifier2;
                    j7 = j4;
                    j9 = jAz;
                    i10 = i9;
                } else {
                    composerKN.e();
                    if ((i3 & 1) != 0 || composerKN.rV9()) {
                        Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i5 & 4) == 0) {
                            jMUb = ProgressIndicatorDefaults.f26994n.mUb(composerKN, 6);
                            i7 &= -897;
                        } else {
                            jMUb = j4;
                        }
                        if ((i5 & 8) != 0) {
                            jAz = ProgressIndicatorDefaults.f26994n.az(composerKN, 6);
                            i7 &= -7169;
                        }
                        if (i8 == 0) {
                            iQie = ProgressIndicatorDefaults.f26994n.qie();
                            j5 = jAz;
                        } else {
                            j5 = jAz;
                            iQie = i9;
                        }
                        modifier3 = modifier5;
                        j6 = jMUb;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 4) != 0) {
                            i7 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            i7 &= -7169;
                        }
                        j5 = jAz;
                        iQie = i9;
                        modifier3 = modifier2;
                        j6 = j4;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1796992155, i7, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:99)");
                    }
                    composer2 = composerKN;
                    KN(function02, modifier3, j6, j5, iQie, ProgressIndicatorDefaults.f26994n.gh(), null, composer2, (i7 & 14) | 196608 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344), 64);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier4 = modifier3;
                    j7 = j6;
                    j9 = j5;
                    i10 = iQie;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i13) {
                            ProgressIndicatorKt.gh(function0, modifier4, j7, j9, i10, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 24576;
            i9 = i2;
            if ((i7 & 9363) == 9362) {
                composerKN.e();
                if ((i3 & 1) != 0) {
                    if (i11 == 0) {
                    }
                    if ((i5 & 4) == 0) {
                    }
                    if ((i5 & 8) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    modifier3 = modifier5;
                    j6 = jMUb;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    composer2 = composerKN;
                    KN(function02, modifier3, j6, j5, iQie, ProgressIndicatorDefaults.f26994n.gh(), null, composer2, (i7 & 14) | 196608 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344), 64);
                    if (ComposerKt.v()) {
                    }
                    modifier4 = modifier3;
                    j7 = j6;
                    j9 = j5;
                    i10 = iQie;
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i2;
        if ((i7 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final float f3, Modifier modifier, long j2, long j3, int i2, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jMUb;
        long jAz;
        int i8;
        int i9;
        int iQie;
        boolean z2;
        Object objIF;
        Composer composer2;
        final Modifier modifier3;
        final long j4;
        final long j5;
        final int i10;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(905419617);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.rl(f3) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                jMUb = j2;
                i7 |= ((i5 & 4) == 0 && composerKN.nr(jMUb)) ? 256 : 128;
            } else {
                jMUb = j2;
            }
            if ((i3 & 3072) != 0) {
                jAz = j3;
                i7 |= ((i5 & 8) == 0 && composerKN.nr(jAz)) ? 2048 : 1024;
            } else {
                jAz = j3;
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    i9 = i2;
                    i7 |= composerKN.t(i9) ? 16384 : 8192;
                }
                if ((i7 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier3 = modifier2;
                    j4 = jMUb;
                    j5 = jAz;
                    i10 = i9;
                } else {
                    composerKN.e();
                    if ((i3 & 1) != 0 || composerKN.rV9()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i5 & 4) != 0) {
                            jMUb = ProgressIndicatorDefaults.f26994n.mUb(composerKN, 6);
                            i7 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            jAz = ProgressIndicatorDefaults.f26994n.az(composerKN, 6);
                            i7 &= -7169;
                        }
                        if (i8 == 0) {
                            iQie = ProgressIndicatorDefaults.f26994n.qie();
                        }
                        long j6 = jAz;
                        long j7 = jMUb;
                        Modifier modifier4 = modifier2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(905419617, i7, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:389)");
                        }
                        z2 = (i7 & 14) == 4;
                        objIF = composerKN.iF();
                        if (z2 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(f3);
                                }
                            };
                            composerKN.o(objIF);
                        }
                        composer2 = composerKN;
                        KN((Function0) objIF, modifier4, j7, j6, iQie, 0.0f, null, composer2, i7 & 65520, 96);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        j4 = j7;
                        j5 = j6;
                        i10 = iQie;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 4) != 0) {
                            i7 &= -897;
                        }
                        if ((i5 & 8) != 0) {
                            i7 &= -7169;
                        }
                    }
                    iQie = i9;
                    long j62 = jAz;
                    long j72 = jMUb;
                    Modifier modifier42 = modifier2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    if ((i7 & 14) == 4) {
                    }
                    objIF = composerKN.iF();
                    if (z2) {
                        objIF = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final Float invoke() {
                                return Float.valueOf(f3);
                            }
                        };
                        composerKN.o(objIF);
                        composer2 = composerKN;
                        KN((Function0) objIF, modifier42, j72, j62, iQie, 0.0f, null, composer2, i7 & 65520, 96);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier42;
                        j4 = j72;
                        j5 = j62;
                        i10 = iQie;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i12) {
                            ProgressIndicatorKt.mUb(f3, modifier3, j4, j5, i10, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 24576;
            i9 = i2;
            if ((i7 & 9363) == 9362) {
                composerKN.e();
                if ((i3 & 1) != 0) {
                    if (i11 != 0) {
                    }
                    if ((i5 & 4) != 0) {
                    }
                    if ((i5 & 8) != 0) {
                    }
                    if (i8 == 0) {
                        iQie = i9;
                    }
                    long j622 = jAz;
                    long j722 = jMUb;
                    Modifier modifier422 = modifier2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    if ((i7 & 14) == 4) {
                    }
                    objIF = composerKN.iF();
                    if (z2) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i2;
        if ((i7 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final float f3, Modifier modifier, long j2, float f4, long j3, int i2, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jRl;
        int i8;
        float fKN;
        long jXMQ;
        int i9;
        int i10;
        int iT;
        float f5;
        long j4;
        int i11;
        Modifier modifier3;
        boolean z2;
        Object objIF;
        Composer composer2;
        final Modifier modifier4;
        final long j5;
        final float f6;
        final long j6;
        final int i12;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1472321743);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.rl(f3) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i13 = i5 & 2;
        if (i13 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    jRl = j2;
                    int i14 = composerKN.nr(jRl) ? 256 : 128;
                    i7 |= i14;
                } else {
                    jRl = j2;
                }
                i7 |= i14;
            } else {
                jRl = j2;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    fKN = f4;
                    i7 |= composerKN.rl(fKN) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        jXMQ = j3;
                        int i15 = composerKN.nr(jXMQ) ? 16384 : 8192;
                        i7 |= i15;
                    } else {
                        jXMQ = j3;
                    }
                    i7 |= i15;
                } else {
                    jXMQ = j3;
                }
                i9 = i5 & 32;
                if (i9 == 0) {
                    if ((196608 & i3) == 0) {
                        i10 = i2;
                        i7 |= composerKN.t(i10) ? 131072 : 65536;
                    }
                    if ((i7 & 74899) == 74898 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i3 & 1) != 0 || composerKN.rV9()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i5 & 4) != 0) {
                                jRl = ProgressIndicatorDefaults.f26994n.rl(composerKN, 6);
                                i7 &= -897;
                            }
                            if (i8 != 0) {
                                fKN = ProgressIndicatorDefaults.f26994n.KN();
                            }
                            if ((i5 & 16) != 0) {
                                jXMQ = ProgressIndicatorDefaults.f26994n.xMQ(composerKN, 6);
                                i7 &= -57345;
                            }
                            if (i9 == 0) {
                                iT = ProgressIndicatorDefaults.f26994n.t();
                                f5 = fKN;
                                j4 = jXMQ;
                                i11 = -1472321743;
                                modifier3 = modifier2;
                            }
                            long j7 = jRl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i11, i7, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:735)");
                            }
                            z2 = (i7 & 14) == 4;
                            objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final Float invoke() {
                                        return Float.valueOf(f3);
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            composer2 = composerKN;
                            t((Function0) objIF, modifier3, j7, f5, j4, iT, 0.0f, composer2, i7 & 524272, 64);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier4 = modifier3;
                            j5 = j7;
                            f6 = f5;
                            j6 = j4;
                            i12 = iT;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 4) != 0) {
                                i7 &= -897;
                            }
                            if ((i5 & 16) != 0) {
                                i7 &= -57345;
                            }
                        }
                        f5 = fKN;
                        iT = i10;
                        i11 = -1472321743;
                        modifier3 = modifier2;
                        j4 = jXMQ;
                        long j72 = jRl;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        if ((i7 & 14) == 4) {
                        }
                        objIF = composerKN.iF();
                        if (z2) {
                            objIF = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(f3);
                                }
                            };
                            composerKN.o(objIF);
                            composer2 = composerKN;
                            t((Function0) objIF, modifier3, j72, f5, j4, iT, 0.0f, composer2, i7 & 524272, 64);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            j5 = j72;
                            f6 = f5;
                            j6 = j4;
                            i12 = iT;
                        }
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        j5 = jRl;
                        f6 = fKN;
                        j6 = jXMQ;
                        i12 = i10;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i16) {
                                ProgressIndicatorKt.n(f3, modifier4, j5, f6, j6, i12, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 196608;
                i10 = i2;
                if ((i7 & 74899) == 74898) {
                    composerKN.e();
                    if ((i3 & 1) != 0) {
                        if (i13 != 0) {
                        }
                        if ((i5 & 4) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if ((i5 & 16) != 0) {
                        }
                        if (i9 == 0) {
                            f5 = fKN;
                            iT = i10;
                            i11 = -1472321743;
                            modifier3 = modifier2;
                            j4 = jXMQ;
                        }
                        long j722 = jRl;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        if ((i7 & 14) == 4) {
                        }
                        objIF = composerKN.iF();
                        if (z2) {
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            fKN = f4;
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i2;
            if ((i7 & 74899) == 74898) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        fKN = f4;
        if ((i3 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i2;
        if ((i7 & 74899) == 74898) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(Modifier modifier, long j2, float f3, long j3, int i2, Composer composer, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        long jRl;
        float fKN;
        long jJ2;
        int i8;
        int i9;
        Modifier modifier3;
        int iO;
        int i10;
        long j4;
        final float f4;
        long j5;
        final Stroke stroke;
        boolean z2;
        final State stateRl;
        final State stateN;
        final State stateN2;
        final State stateN3;
        boolean z3;
        Object objIF;
        final long j6;
        final long j7;
        final long j9;
        final float f5;
        final long j10;
        final int i11;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-115871647);
        int i12 = i5 & 1;
        if (i12 != 0) {
            i7 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i7 = (composerKN.p5(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            jRl = j2;
            i7 |= ((i5 & 2) == 0 && composerKN.nr(jRl)) ? 32 : 16;
        } else {
            jRl = j2;
        }
        int i13 = i5 & 4;
        if (i13 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                fKN = f3;
                i7 |= composerKN.rl(fKN) ? 256 : 128;
            }
            if ((i3 & 3072) != 0) {
                jJ2 = j3;
                i7 |= ((i5 & 8) == 0 && composerKN.nr(jJ2)) ? 2048 : 1024;
            } else {
                jJ2 = j3;
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    i9 = i2;
                    i7 |= composerKN.t(i9) ? 16384 : 8192;
                }
                if ((i7 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    i11 = i9;
                    j10 = jRl;
                    f5 = fKN;
                    j9 = jJ2;
                } else {
                    composerKN.e();
                    if ((i3 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i5 & 2) != 0) {
                            jRl = ProgressIndicatorDefaults.f26994n.rl(composerKN, 6);
                            i7 &= -113;
                        }
                        if (i13 != 0) {
                            fKN = ProgressIndicatorDefaults.f26994n.KN();
                        }
                        if ((i5 & 8) != 0) {
                            i7 &= -7169;
                            jJ2 = ProgressIndicatorDefaults.f26994n.J2(composerKN, 6);
                        }
                        if (i8 == 0) {
                            iO = ProgressIndicatorDefaults.f26994n.O();
                            i10 = i7;
                        }
                        j4 = jRl;
                        f4 = fKN;
                        j5 = jJ2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-115871647, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
                        }
                        stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f4), 0.0f, iO, 0, null, 26, null);
                        int i14 = iO;
                        InfiniteTransition infiniteTransitionT = InfiniteTransitionKt.t(null, composerKN, 0, 1);
                        TwoWayConverter twoWayConverterMUb = VectorConvertersKt.mUb(IntCompanionObject.INSTANCE);
                        Modifier modifier5 = modifier3;
                        InfiniteRepeatableSpec infiniteRepeatableSpecO = AnimationSpecKt.O(AnimationSpecKt.ty(6660, 0, EasingKt.O(), 2, null), null, 0L, 6, null);
                        int i15 = InfiniteTransition.J2;
                        int i16 = InfiniteRepeatableSpec.nr;
                        z2 = true;
                        stateRl = InfiniteTransitionKt.rl(infiniteTransitionT, 0, 5, twoWayConverterMUb, infiniteRepeatableSpecO, null, composerKN, i15 | 432 | (i16 << 12), 16);
                        stateN = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 286.0f, AnimationSpecKt.O(AnimationSpecKt.ty(1332, 0, EasingKt.O(), 2, null), null, 0L, 6, null), null, composerKN, i15 | 432 | (i16 << 9), 8);
                        stateN2 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                n(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                                keyframesSpecConfig.nr(1332);
                                keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.mUb);
                                keyframesSpecConfig.J2(Float.valueOf(290.0f), 666);
                            }
                        }), null, 0L, 6, null), null, composerKN, i15 | 432 | (i16 << 9), 8);
                        stateN3 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                n(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                                keyframesSpecConfig.nr(1332);
                                keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 666), ProgressIndicatorKt.mUb);
                                keyframesSpecConfig.J2(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                            }
                        }), null, 0L, 6, null), null, composerKN, i15 | 432 | (i16 << 9), 8);
                        Modifier modifierZ = SizeKt.Z(ProgressSemanticsKt.n(modifier5), f26996O);
                        boolean zE2 = ((i10 & 896) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && composerKN.nr(j5)) || (i10 & 3072) == 2048) | composerKN.E2(stroke) | composerKN.p5(stateRl) | composerKN.p5(stateN2) | composerKN.p5(stateN3) | composerKN.p5(stateN);
                        if ((((i10 & 112) ^ 48) <= 32 || !composerKN.nr(j4)) && (i10 & 48) != 32) {
                            z2 = false;
                        }
                        z3 = zE2 | z2;
                        objIF = composerKN.iF();
                        if (z3 || objIF == Composer.INSTANCE.n()) {
                            j6 = j4;
                            j7 = j5;
                            objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
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
                                    ProgressIndicatorKt.nY(drawScope, j7, stroke);
                                    ProgressIndicatorKt.te(drawScope, ((Number) stateN3.getValue()).floatValue() + (((((Number) stateRl.getValue()).floatValue() * 216.0f) % 360.0f) - 90.0f) + ((Number) stateN.getValue()).floatValue(), f4, Math.abs(((Number) stateN2.getValue()).floatValue() - ((Number) stateN3.getValue()).floatValue()), j6, stroke);
                                }
                            };
                            composerKN.o(objIF);
                        } else {
                            j6 = j4;
                            j7 = j5;
                        }
                        CanvasKt.rl(modifierZ, (Function1) objIF, composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        j9 = j7;
                        f5 = f4;
                        j10 = j6;
                        i11 = i14;
                        modifier4 = modifier5;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 2) != 0) {
                            i7 &= -113;
                        }
                        if ((i5 & 8) != 0) {
                            i7 &= -7169;
                        }
                        modifier3 = modifier2;
                    }
                    i10 = i7;
                    iO = i9;
                    j4 = jRl;
                    f4 = fKN;
                    j5 = jJ2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f4), 0.0f, iO, 0, null, 26, null);
                    int i142 = iO;
                    InfiniteTransition infiniteTransitionT2 = InfiniteTransitionKt.t(null, composerKN, 0, 1);
                    TwoWayConverter twoWayConverterMUb2 = VectorConvertersKt.mUb(IntCompanionObject.INSTANCE);
                    Modifier modifier52 = modifier3;
                    InfiniteRepeatableSpec infiniteRepeatableSpecO2 = AnimationSpecKt.O(AnimationSpecKt.ty(6660, 0, EasingKt.O(), 2, null), null, 0L, 6, null);
                    int i152 = InfiniteTransition.J2;
                    int i162 = InfiniteRepeatableSpec.nr;
                    z2 = true;
                    stateRl = InfiniteTransitionKt.rl(infiniteTransitionT2, 0, 5, twoWayConverterMUb2, infiniteRepeatableSpecO2, null, composerKN, i152 | 432 | (i162 << 12), 16);
                    stateN = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 286.0f, AnimationSpecKt.O(AnimationSpecKt.ty(1332, 0, EasingKt.O(), 2, null), null, 0L, 6, null), null, composerKN, i152 | 432 | (i162 << 9), 8);
                    stateN2 = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1332);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.mUb);
                            keyframesSpecConfig.J2(Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), null, composerKN, i152 | 432 | (i162 << 9), 8);
                    stateN3 = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1332);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 666), ProgressIndicatorKt.mUb);
                            keyframesSpecConfig.J2(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                        }
                    }), null, 0L, 6, null), null, composerKN, i152 | 432 | (i162 << 9), 8);
                    Modifier modifierZ2 = SizeKt.Z(ProgressSemanticsKt.n(modifier52), f26996O);
                    if (((i10 & 7168) ^ 3072) > 2048) {
                        boolean zE22 = ((i10 & 896) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && composerKN.nr(j5)) || (i10 & 3072) == 2048) | composerKN.E2(stroke) | composerKN.p5(stateRl) | composerKN.p5(stateN2) | composerKN.p5(stateN3) | composerKN.p5(stateN);
                        if (((i10 & 112) ^ 48) <= 32) {
                            z2 = false;
                            z3 = zE22 | z2;
                            objIF = composerKN.iF();
                            if (z3) {
                                j6 = j4;
                                j7 = j5;
                                objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
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
                                        ProgressIndicatorKt.nY(drawScope, j7, stroke);
                                        ProgressIndicatorKt.te(drawScope, ((Number) stateN3.getValue()).floatValue() + (((((Number) stateRl.getValue()).floatValue() * 216.0f) % 360.0f) - 90.0f) + ((Number) stateN.getValue()).floatValue(), f4, Math.abs(((Number) stateN2.getValue()).floatValue() - ((Number) stateN3.getValue()).floatValue()), j6, stroke);
                                    }
                                };
                                composerKN.o(objIF);
                                CanvasKt.rl(modifierZ2, (Function1) objIF, composerKN, 0);
                                if (ComposerKt.v()) {
                                }
                                j9 = j7;
                                f5 = f4;
                                j10 = j6;
                                i11 = i142;
                                modifier4 = modifier52;
                            }
                        } else {
                            z2 = false;
                            z3 = zE22 | z2;
                            objIF = composerKN.iF();
                            if (z3) {
                            }
                        }
                    } else {
                        boolean zE222 = ((i10 & 896) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && composerKN.nr(j5)) || (i10 & 3072) == 2048) | composerKN.E2(stroke) | composerKN.p5(stateRl) | composerKN.p5(stateN2) | composerKN.p5(stateN3) | composerKN.p5(stateN);
                        if (((i10 & 112) ^ 48) <= 32) {
                        }
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i17) {
                            ProgressIndicatorKt.nr(modifier4, j10, f5, j9, i11, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 24576;
            i9 = i2;
            if ((i7 & 9363) == 9362) {
                composerKN.e();
                if ((i3 & 1) != 0) {
                    if (i12 == 0) {
                    }
                    if ((i5 & 2) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if ((i5 & 8) != 0) {
                    }
                    if (i8 == 0) {
                        i10 = i7;
                        iO = i9;
                    }
                    j4 = jRl;
                    f4 = fKN;
                    j5 = jJ2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f4), 0.0f, iO, 0, null, 26, null);
                    int i1422 = iO;
                    InfiniteTransition infiniteTransitionT22 = InfiniteTransitionKt.t(null, composerKN, 0, 1);
                    TwoWayConverter twoWayConverterMUb22 = VectorConvertersKt.mUb(IntCompanionObject.INSTANCE);
                    Modifier modifier522 = modifier3;
                    InfiniteRepeatableSpec infiniteRepeatableSpecO22 = AnimationSpecKt.O(AnimationSpecKt.ty(6660, 0, EasingKt.O(), 2, null), null, 0L, 6, null);
                    int i1522 = InfiniteTransition.J2;
                    int i1622 = InfiniteRepeatableSpec.nr;
                    z2 = true;
                    stateRl = InfiniteTransitionKt.rl(infiniteTransitionT22, 0, 5, twoWayConverterMUb22, infiniteRepeatableSpecO22, null, composerKN, i1522 | 432 | (i1622 << 12), 16);
                    stateN = InfiniteTransitionKt.n(infiniteTransitionT22, 0.0f, 286.0f, AnimationSpecKt.O(AnimationSpecKt.ty(1332, 0, EasingKt.O(), 2, null), null, 0L, 6, null), null, composerKN, i1522 | 432 | (i1622 << 9), 8);
                    stateN2 = InfiniteTransitionKt.n(infiniteTransitionT22, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1332);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.mUb);
                            keyframesSpecConfig.J2(Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), null, composerKN, i1522 | 432 | (i1622 << 9), 8);
                    stateN3 = InfiniteTransitionKt.n(infiniteTransitionT22, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1332);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 666), ProgressIndicatorKt.mUb);
                            keyframesSpecConfig.J2(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                        }
                    }), null, 0L, 6, null), null, composerKN, i1522 | 432 | (i1622 << 9), 8);
                    Modifier modifierZ22 = SizeKt.Z(ProgressSemanticsKt.n(modifier522), f26996O);
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        fKN = f3;
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i2;
        if ((i7 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void qie(final float f3, Modifier modifier, long j2, long j3, Composer composer, final int i2, final int i3) {
        float f4;
        int i5;
        Modifier modifier2;
        long j4;
        long j5;
        long jMUb;
        long jAz;
        Modifier modifier3;
        long j6;
        final Modifier modifier4;
        final long j7;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-372717133);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            f4 = f3;
        } else {
            f4 = f3;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.rl(f4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    j4 = j2;
                    int i8 = composerKN.nr(j4) ? 256 : 128;
                    i5 |= i8;
                } else {
                    j4 = j2;
                }
                i5 |= i8;
            } else {
                j4 = j2;
            }
            if ((i2 & 3072) != 0) {
                j5 = j3;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(j5)) ? 2048 : 1024;
            } else {
                j5 = j3;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) == 0) {
                        jMUb = ProgressIndicatorDefaults.f26994n.mUb(composerKN, 6);
                        i5 &= -897;
                    } else {
                        jMUb = j4;
                    }
                    if ((i3 & 8) == 0) {
                        i5 &= -7169;
                        modifier3 = modifier5;
                        j6 = jMUb;
                        jAz = ProgressIndicatorDefaults.f26994n.az(composerKN, 6);
                    } else {
                        jAz = j5;
                        modifier3 = modifier5;
                        j6 = jMUb;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    jAz = j5;
                    modifier3 = modifier2;
                    j6 = j4;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-372717133, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:406)");
                }
                mUb(f4, modifier3, j6, jAz, ProgressIndicatorDefaults.f26994n.qie(), composerKN, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
                j7 = j6;
                j9 = jAz;
            } else {
                composerKN.wTp();
                modifier4 = modifier2;
                j7 = j4;
                j9 = j5;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$11
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
                        ProgressIndicatorKt.qie(f3, modifier4, j7, j9, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i5 & 1171) == 1170) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                mUb(f4, modifier3, j6, jAz, ProgressIndicatorDefaults.f26994n.qie(), composerKN, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                if (ComposerKt.v()) {
                }
                modifier4 = modifier3;
                j7 = j6;
                j9 = jAz;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final Function0 function0, Modifier modifier, long j2, float f3, long j3, int i2, Composer composer, final int i3, final int i5) {
        Function0 function02;
        int i7;
        Modifier modifier2;
        long jRl;
        int i8;
        float fKN;
        long jNr;
        int i9;
        int i10;
        long j4;
        int iT;
        Modifier modifier3;
        long j5;
        float f4;
        int i11;
        Composer composer2;
        final Modifier modifier4;
        final long j6;
        final float f5;
        final long j7;
        final int i12;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-761680467);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i3 & 6) == 0) {
                i7 = (composerKN.E2(function02) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        int i13 = i5 & 2;
        if (i13 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    jRl = j2;
                    int i14 = composerKN.nr(jRl) ? 256 : 128;
                    i7 |= i14;
                } else {
                    jRl = j2;
                }
                i7 |= i14;
            } else {
                jRl = j2;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    fKN = f3;
                    i7 |= composerKN.rl(fKN) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        jNr = j3;
                        int i15 = composerKN.nr(jNr) ? 16384 : 8192;
                        i7 |= i15;
                    } else {
                        jNr = j3;
                    }
                    i7 |= i15;
                } else {
                    jNr = j3;
                }
                i9 = i5 & 32;
                if (i9 == 0) {
                    if ((196608 & i3) == 0) {
                        i10 = i2;
                        i7 |= composerKN.t(i10) ? 131072 : 65536;
                    }
                    if ((74899 & i7) == 74898 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i3 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier5 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i5 & 4) != 0) {
                                jRl = ProgressIndicatorDefaults.f26994n.rl(composerKN, 6);
                                i7 &= -897;
                            }
                            if (i8 != 0) {
                                fKN = ProgressIndicatorDefaults.f26994n.KN();
                            }
                            if ((i5 & 16) != 0) {
                                i7 &= -57345;
                                jNr = ProgressIndicatorDefaults.f26994n.nr(composerKN, 6);
                            }
                            if (i9 == 0) {
                                iT = ProgressIndicatorDefaults.f26994n.t();
                                f4 = fKN;
                                j4 = jNr;
                                modifier3 = modifier5;
                                j5 = jRl;
                            } else {
                                j4 = jNr;
                                iT = i10;
                                modifier3 = modifier5;
                                j5 = jRl;
                                f4 = fKN;
                            }
                            i11 = -761680467;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 4) != 0) {
                                i7 &= -897;
                            }
                            if ((i5 & 16) != 0) {
                                i7 &= -57345;
                            }
                            j4 = jNr;
                            iT = i10;
                            i11 = -761680467;
                            modifier3 = modifier2;
                            j5 = jRl;
                            f4 = fKN;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(i11, i7, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:533)");
                        }
                        composer2 = composerKN;
                        t(function02, modifier3, j5, f4, j4, iT, ProgressIndicatorDefaults.f26994n.Uo(), composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier4 = modifier3;
                        j6 = j5;
                        f5 = f4;
                        j7 = j4;
                        i12 = iT;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        j6 = jRl;
                        f5 = fKN;
                        j7 = jNr;
                        i12 = i10;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i16) {
                                ProgressIndicatorKt.rl(function0, modifier4, j6, f5, j7, i12, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 196608;
                i10 = i2;
                if ((74899 & i7) == 74898) {
                    composerKN.e();
                    if ((i3 & 1) != 0) {
                        if (i13 == 0) {
                        }
                        if ((i5 & 4) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if ((i5 & 16) != 0) {
                        }
                        if (i9 == 0) {
                        }
                        i11 = -761680467;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        composer2 = composerKN;
                        t(function02, modifier3, j5, f4, j4, iT, ProgressIndicatorDefaults.f26994n.Uo(), composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 0);
                        if (ComposerKt.v()) {
                        }
                        modifier4 = modifier3;
                        j6 = j5;
                        f5 = f4;
                        j7 = j4;
                        i12 = iT;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            fKN = f3;
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i2;
            if ((74899 & i7) == 74898) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        fKN = f3;
        if ((i3 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i2;
        if ((74899 & i7) == 74898) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function0 function0, Modifier modifier, long j2, float f3, long j3, int i2, float f4, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jRl;
        int i8;
        float fKN;
        long j4;
        int i9;
        int iT;
        int i10;
        float f5;
        long jNr;
        final float fUo;
        final int i11;
        boolean z2;
        Object objIF;
        final Function0 function02;
        final Stroke stroke;
        boolean zP5;
        Object objIF2;
        boolean zP52;
        Object objIF3;
        final long j5;
        final long j6;
        final float f6;
        final float f7;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1798883595);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i12 = i5 & 2;
        if (i12 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                jRl = j2;
                i7 |= ((i5 & 4) == 0 && composerKN.nr(jRl)) ? 256 : 128;
            } else {
                jRl = j2;
            }
            i8 = i5 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    fKN = f3;
                    i7 |= composerKN.rl(fKN) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    j4 = j3;
                    i7 |= ((i5 & 16) == 0 && composerKN.nr(j4)) ? 16384 : 8192;
                } else {
                    j4 = j3;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                    iT = i2;
                } else {
                    iT = i2;
                    if ((i3 & 196608) == 0) {
                        i7 |= composerKN.t(iT) ? 131072 : 65536;
                    }
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                    f5 = f4;
                } else {
                    f5 = f4;
                    if ((i3 & 1572864) == 0) {
                        i7 |= composerKN.rl(f5) ? 1048576 : 524288;
                    }
                }
                if ((i7 & 599187) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    j7 = jRl;
                    f7 = fKN;
                    fUo = f5;
                    i11 = iT;
                } else {
                    composerKN.e();
                    if ((i3 & 1) != 0 || composerKN.rV9()) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i5 & 4) != 0) {
                            jRl = ProgressIndicatorDefaults.f26994n.rl(composerKN, 6);
                            i7 &= -897;
                        }
                        if (i8 != 0) {
                            fKN = ProgressIndicatorDefaults.f26994n.KN();
                        }
                        if ((i5 & 16) == 0) {
                            jNr = ProgressIndicatorDefaults.f26994n.nr(composerKN, 6);
                            i7 &= -57345;
                        } else {
                            jNr = j4;
                        }
                        if (i9 != 0) {
                            iT = ProgressIndicatorDefaults.f26994n.t();
                        }
                        if (i10 == 0) {
                            fUo = ProgressIndicatorDefaults.f26994n.Uo();
                        }
                        i11 = iT;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1798883595, i7, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:580)");
                        }
                        z2 = (i7 & 14) == 4;
                        objIF = composerKN.iF();
                        if (z2 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(RangesKt.coerceIn(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                                }
                            };
                            composerKN.o(objIF);
                        }
                        function02 = (Function0) objIF;
                        stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(fKN), 0.0f, i11, 0, null, 26, null);
                        zP5 = composerKN.p5(function02);
                        objIF2 = composerKN.iF();
                        if (!zP5 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.ofS(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) function02.invoke()).floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        Modifier modifierZ = SizeKt.Z(SemanticsModifierKt.t(modifier2, true, (Function1) objIF2), f26996O);
                        zP52 = ((i7 & 458752) != 131072) | composerKN.p5(function02) | ((3670016 & i7) != 1048576) | ((i7 & 7168) != 2048) | ((((57344 & i7) ^ 24576) <= 16384 && composerKN.nr(jNr)) || (i7 & 24576) == 16384) | composerKN.E2(stroke) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jRl)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                        objIF3 = composerKN.iF();
                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                            j5 = jNr;
                            j6 = jRl;
                            f6 = fKN;
                            objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3$1
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
                                    float fFloatValue = ((Number) function02.invoke()).floatValue() * 360.0f;
                                    float fKN2 = (((StrokeCap.Uo(i11, StrokeCap.INSTANCE.n()) || Size.xMQ(drawScope.t()) > Size.gh(drawScope.t())) ? fUo : Dp.KN(fUo + f6)) / ((float) (((double) drawScope.bzg(Size.gh(drawScope.t()))) * 3.141592653589793d))) * 360.0f;
                                    ProgressIndicatorKt.ViF(drawScope, 270.0f + fFloatValue + Math.min(fFloatValue, fKN2), (360.0f - fFloatValue) - (Math.min(fFloatValue, fKN2) * 2), j5, stroke);
                                    ProgressIndicatorKt.g(drawScope, 270.0f, fFloatValue, j6, stroke);
                                }
                            };
                            composerKN.o(objIF3);
                        } else {
                            j5 = jNr;
                            j6 = jRl;
                            f6 = fKN;
                        }
                        CanvasKt.rl(modifierZ, (Function1) objIF3, composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        f7 = f6;
                        j4 = j5;
                        j7 = j6;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 4) != 0) {
                            i7 &= -897;
                        }
                        if ((i5 & 16) != 0) {
                            i7 &= -57345;
                        }
                        jNr = j4;
                    }
                    fUo = f5;
                    i11 = iT;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    if ((i7 & 14) == 4) {
                    }
                    objIF = composerKN.iF();
                    if (z2) {
                        objIF = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final Float invoke() {
                                return Float.valueOf(RangesKt.coerceIn(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                            }
                        };
                        composerKN.o(objIF);
                        function02 = (Function0) objIF;
                        stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(fKN), 0.0f, i11, 0, null, 26, null);
                        zP5 = composerKN.p5(function02);
                        objIF2 = composerKN.iF();
                        if (!zP5) {
                            objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.ofS(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) function02.invoke()).floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                                }
                            };
                            composerKN.o(objIF2);
                            Modifier modifierZ2 = SizeKt.Z(SemanticsModifierKt.t(modifier2, true, (Function1) objIF2), f26996O);
                            if (((57344 & i7) ^ 24576) <= 16384) {
                                if (((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
                                    zP52 = ((i7 & 458752) != 131072) | composerKN.p5(function02) | ((3670016 & i7) != 1048576) | ((i7 & 7168) != 2048) | ((((57344 & i7) ^ 24576) <= 16384 && composerKN.nr(jNr)) || (i7 & 24576) == 16384) | composerKN.E2(stroke) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jRl)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                                    objIF3 = composerKN.iF();
                                    if (zP52) {
                                        j5 = jNr;
                                        j6 = jRl;
                                        f6 = fKN;
                                        objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3$1
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
                                                float fFloatValue = ((Number) function02.invoke()).floatValue() * 360.0f;
                                                float fKN2 = (((StrokeCap.Uo(i11, StrokeCap.INSTANCE.n()) || Size.xMQ(drawScope.t()) > Size.gh(drawScope.t())) ? fUo : Dp.KN(fUo + f6)) / ((float) (((double) drawScope.bzg(Size.gh(drawScope.t()))) * 3.141592653589793d))) * 360.0f;
                                                ProgressIndicatorKt.ViF(drawScope, 270.0f + fFloatValue + Math.min(fFloatValue, fKN2), (360.0f - fFloatValue) - (Math.min(fFloatValue, fKN2) * 2), j5, stroke);
                                                ProgressIndicatorKt.g(drawScope, 270.0f, fFloatValue, j6, stroke);
                                            }
                                        };
                                        composerKN.o(objIF3);
                                        CanvasKt.rl(modifierZ2, (Function1) objIF3, composerKN, 0);
                                        if (ComposerKt.v()) {
                                        }
                                        f7 = f6;
                                        j4 = j5;
                                        j7 = j6;
                                    }
                                } else {
                                    zP52 = ((i7 & 458752) != 131072) | composerKN.p5(function02) | ((3670016 & i7) != 1048576) | ((i7 & 7168) != 2048) | ((((57344 & i7) ^ 24576) <= 16384 && composerKN.nr(jNr)) || (i7 & 24576) == 16384) | composerKN.E2(stroke) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(jRl)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                                    objIF3 = composerKN.iF();
                                    if (zP52) {
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    final Modifier modifier3 = modifier2;
                    final long j9 = j4;
                    final int i13 = i11;
                    final float f8 = fUo;
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i14) {
                            ProgressIndicatorKt.t(function0, modifier3, j7, f7, j9, i13, f8, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 3072;
            fKN = f3;
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            if ((i7 & 599187) == 599186) {
                composerKN.e();
                if ((i3 & 1) != 0) {
                    if (i12 != 0) {
                    }
                    if ((i5 & 4) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i5 & 16) == 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 == 0) {
                        fUo = f5;
                    }
                    i11 = iT;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    if ((i7 & 14) == 4) {
                    }
                    objIF = composerKN.iF();
                    if (z2) {
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        fKN = f3;
        if ((i3 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        if ((i7 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final /* synthetic */ void xMQ(Modifier modifier, long j2, long j3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jMUb;
        long jAz;
        long j4;
        Modifier modifier3;
        final Modifier modifier4;
        final long j5;
        final long j6;
        Composer composerKN = composer.KN(585576195);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                jMUb = j2;
                int i8 = composerKN.nr(jMUb) ? 32 : 16;
                i5 |= i8;
            } else {
                jMUb = j2;
            }
            i5 |= i8;
        } else {
            jMUb = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                jAz = j3;
                int i9 = composerKN.nr(jAz) ? 256 : 128;
                i5 |= i9;
            } else {
                jAz = j3;
            }
            i5 |= i9;
        } else {
            jAz = j3;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier4 = modifier2;
            j5 = jMUb;
            j6 = jAz;
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                Modifier modifier5 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    jMUb = ProgressIndicatorDefaults.f26994n.mUb(composerKN, 6);
                    i5 &= -113;
                }
                if ((i3 & 4) != 0) {
                    jAz = ProgressIndicatorDefaults.f26994n.az(composerKN, 6);
                    i5 &= -897;
                }
                j4 = jAz;
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                if ((i3 & 2) != 0) {
                    i5 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                j4 = jAz;
                modifier3 = modifier2;
            }
            long j7 = jMUb;
            composerKN.S();
            if (ComposerKt.v()) {
                ComposerKt.p5(585576195, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:421)");
            }
            az(modifier3, j7, j4, ProgressIndicatorDefaults.f26994n.qie(), 0.0f, composerKN, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896), 16);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier4 = modifier3;
            j5 = j7;
            j6 = j4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i10) {
                    ProgressIndicatorKt.xMQ(modifier4, j5, j6, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViF(DrawScope drawScope, float f3, float f4, long j2, Stroke stroke) {
        float f5 = 2;
        float width = stroke.getWidth() / f5;
        float fGh = Size.gh(drawScope.t()) - (f5 * width);
        DrawScope.RQ(drawScope, j2, f3, f4, false, OffsetKt.n(width, width), androidx.compose.ui.geometry.SizeKt.n(fGh, fGh), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(DrawScope drawScope, float f3, float f4, long j2, Stroke stroke) {
        ViF(drawScope, f3, f4, j2, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iF(DrawScope drawScope, float f3, float f4, long j2, float f5, int i2) {
        boolean z2;
        float f6;
        float f7;
        float fGh = Size.gh(drawScope.t());
        float fXMQ = Size.xMQ(drawScope.t());
        float f8 = 2;
        float f9 = fXMQ / f8;
        if (drawScope.getLayoutDirection() == LayoutDirection.f34160n) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f6 = f3;
        } else {
            f6 = 1.0f - f4;
        }
        float f10 = f6 * fGh;
        if (z2) {
            f7 = f4;
        } else {
            f7 = 1.0f - f3;
        }
        float f11 = f7 * fGh;
        if (!StrokeCap.Uo(i2, StrokeCap.INSTANCE.n()) && fXMQ <= fGh) {
            float f12 = f5 / f8;
            ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(f12, fGh - f12);
            float fFloatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f10), closedFloatingPointRangeRangeTo)).floatValue();
            float fFloatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(f11), closedFloatingPointRangeRangeTo)).floatValue();
            if (Math.abs(f4 - f3) > 0.0f) {
                DrawScope.mI(drawScope, j2, OffsetKt.n(fFloatValue, f9), OffsetKt.n(fFloatValue2, f9), f5, i2, null, 0.0f, null, 0, 480, null);
                return;
            }
            return;
        }
        DrawScope.mI(drawScope, j2, OffsetKt.n(f10, f9), OffsetKt.n(f11, f9), f5, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void te(DrawScope drawScope, float f3, float f4, float f5, long j2, Stroke stroke) {
        float fKN;
        if (StrokeCap.Uo(stroke.getCap(), StrokeCap.INSTANCE.n())) {
            fKN = 0.0f;
        } else {
            fKN = ((f4 / Dp.KN(f26996O / 2)) * 57.29578f) / 2.0f;
        }
        ViF(drawScope, f3 + fKN, Math.max(f5, 0.1f), j2, stroke);
    }
}
