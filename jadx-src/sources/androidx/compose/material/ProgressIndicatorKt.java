package androidx.compose.material;

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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001aD\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a8\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a0\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a>\u0010\u0018\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a.\u0010\u001a\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aN\u0010\u001d\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aD\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a8\u0010!\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a0\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a6\u0010)\u001a\u00020\u000b*\u00020\u00142\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a&\u0010+\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010-\u001a\u00020\u000b*\u00020\u00142\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010*\u001a>\u0010.\u001a\u00020\u000b*\u00020\u00142\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\u0014\u00101\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00100\"\u0014\u00102\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00100\"\u0014\u00103\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100\"\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00105\"\u0014\u00108\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105\"\u0014\u0010:\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105\"\u0014\u0010<\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105\"\u0014\u0010>\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\f\u0010?\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010A\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u00020C8\nX\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "bzg", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "progress", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "gh", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "xMQ", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "qie", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "mUb", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", "v", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "rV9", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "rl", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "t", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "nr", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "N", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "nHg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "s7N", "wTp", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "F", "LinearIndicatorHeight", "LinearIndicatorWidth", "CircularIndicatorDiameter", "Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "O", "FirstLineTailEasing", "J2", "SecondLineHeadEasing", "Uo", "SecondLineTailEasing", "KN", "CircularEasing", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,629:1\n149#2:630\n149#2:705\n149#2:706\n71#3,16:631\n71#3,16:659\n1247#4,6:647\n1247#4,6:653\n1247#4,6:677\n1247#4,6:684\n75#5:675\n75#5:683\n1#6:676\n72#7,7:690\n85#8:697\n85#8:698\n85#8:699\n85#8:700\n85#8:701\n85#8:702\n85#8:703\n85#8:704\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n58#1:630\n572#1:705\n576#1:706\n110#1:631,16\n340#1:659,16\n116#1:647,6\n207#1:653,6\n342#1:677,6\n430#1:684,6\n341#1:675\n376#1:683\n554#1:690,7\n151#1:697\n164#1:698\n177#1:699\n190#1:700\n381#1:701\n395#1:702\n404#1:703\n418#1:704\n*E\n"})
public final class ProgressIndicatorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22503n = ProgressIndicatorDefaults.f22500n.n();
    private static final float rl = Dp.KN(240);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f22504t = Dp.KN(40);
    private static final CubicBezierEasing nr = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final CubicBezierEasing f22502O = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing J2 = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing Uo = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing KN = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nHg(DrawScope drawScope, long j2, Stroke stroke) {
        N(drawScope, 0.0f, 360.0f, j2, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rV9(DrawScope drawScope, long j2, float f3, int i2) {
        v(drawScope, 0.0f, 1.0f, j2, f3, i2);
    }

    public static final Modifier bzg(Modifier modifier) {
        final float fKN = Dp.KN(10);
        return PaddingKt.gh(SemanticsModifierKt.t(LayoutModifierKt.n(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return n(measureScope, measurable, constraints.getValue());
            }

            public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                final int iHow = measureScope.How(fKN);
                int i2 = iHow * 2;
                final Placeable placeableDR0 = measurable.dR0(ConstraintsKt.xMQ(j2, 0, i2));
                return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight() - i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$1.1
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
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$2
            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), 0.0f, fKN, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void gh(final float f3, Modifier modifier, long j2, long j3, int i2, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jMUb;
        long j4;
        int iN;
        Modifier modifier3;
        final int i8;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeGh;
        long jAz;
        final int i9;
        final long j7;
        Composer composerKN = composer.KN(-531984864);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.rl(f3) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i10 = i5 & 2;
        if (i10 == 0) {
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
                j4 = j3;
                i7 |= ((i5 & 8) == 0 && composerKN.nr(j4)) ? 2048 : 1024;
            } else {
                j4 = j3;
            }
            if ((i3 & 24576) != 0) {
                if ((i5 & 16) == 0) {
                    iN = i2;
                    int i11 = composerKN.t(iN) ? 16384 : 8192;
                    i7 |= i11;
                } else {
                    iN = i2;
                }
                i7 |= i11;
            } else {
                iN = i2;
            }
            boolean z2 = true;
            if (composerKN.HI((i7 & 9363) == 9362, i7 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
                i8 = iN;
                j5 = jMUb;
                j6 = j4;
            } else {
                composerKN.e();
                if ((i3 & 1) == 0 || composerKN.rV9()) {
                    modifier3 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i5 & 4) != 0) {
                        jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                        i7 &= -897;
                    }
                    long j9 = jMUb;
                    if ((i5 & 8) != 0) {
                        jAz = Color.az(j9, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        i7 &= -7169;
                    } else {
                        jAz = j4;
                    }
                    if ((i5 & 16) != 0) {
                        i7 &= -57345;
                        iN = StrokeCap.INSTANCE.n();
                    }
                    j4 = jAz;
                    jMUb = j9;
                } else {
                    composerKN.wTp();
                    if ((i5 & 4) != 0) {
                        i7 &= -897;
                    }
                    if ((i5 & 8) != 0) {
                        i7 &= -7169;
                    }
                    if ((i5 & 16) != 0) {
                        i7 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-531984864, i7, -1, Apsps.sPxEeGvOCuJqPPl);
                }
                float f4 = f3 >= 0.0f ? f3 : 0.0f;
                final float f5 = f4 > 1.0f ? 1.0f : f4;
                Modifier modifierS = SizeKt.S(ProgressSemanticsKt.t(bzg(modifier3), f5, null, 0, 6, null), rl, f22503n);
                boolean zRl = ((((i7 & 7168) ^ 3072) > 2048 && composerKN.nr(j4)) || (i7 & 3072) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && composerKN.t(iN)) || (i7 & 24576) == 16384) | composerKN.rl(f5);
                if ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 || !composerKN.nr(jMUb)) && (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                    z2 = false;
                }
                boolean z3 = zRl | z2;
                Object objIF = composerKN.iF();
                if (z3 || objIF == Composer.INSTANCE.n()) {
                    i9 = iN;
                    j5 = jMUb;
                    j7 = j4;
                    objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
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
                            float fXMQ = Size.xMQ(drawScope.t());
                            ProgressIndicatorKt.rV9(drawScope, j7, fXMQ, i9);
                            ProgressIndicatorKt.v(drawScope, 0.0f, f5, j5, fXMQ, i9);
                        }
                    };
                    composerKN.o(objIF);
                } else {
                    i9 = iN;
                    j5 = jMUb;
                    j7 = j4;
                }
                CanvasKt.rl(modifierS, (Function1) objIF, composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                j6 = j7;
                i8 = i9;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final Modifier modifier4 = modifier3;
                final long j10 = j5;
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
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
                        ProgressIndicatorKt.gh(f3, modifier4, j10, j6, i8, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                    }
                });
                return;
            }
            return;
        }
        i7 |= 48;
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) != 0) {
        }
        boolean z22 = true;
        if (composerKN.HI((i7 & 9363) == 9362, i7 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final /* synthetic */ void mUb(Modifier modifier, long j2, long j3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jMUb;
        long j4;
        final Modifier modifier3;
        final long j5;
        final long j6;
        long jAz;
        long j7;
        Modifier modifier4;
        Composer composerKN = composer.KN(-819397058);
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
                j4 = j3;
                int i9 = composerKN.nr(j4) ? 256 : 128;
                i5 |= i9;
            } else {
                j4 = j3;
            }
            i5 |= i9;
        } else {
            j4 = j3;
        }
        if (composerKN.HI((i5 & 147) != 146, i5 & 1)) {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                Modifier modifier5 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                    i5 &= -113;
                }
                long j9 = jMUb;
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                    modifier4 = modifier5;
                    jAz = Color.az(j9, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    j7 = j9;
                } else {
                    jAz = j4;
                    j7 = j9;
                    modifier4 = modifier5;
                }
            } else {
                composerKN.wTp();
                if ((i3 & 2) != 0) {
                    i5 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                jAz = j4;
                modifier4 = modifier2;
                j7 = jMUb;
            }
            composerKN.S();
            if (ComposerKt.v()) {
                ComposerKt.p5(-819397058, i5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:253)");
            }
            xMQ(modifier4, j7, jAz, StrokeCap.INSTANCE.n(), composerKN, i5 & 1022, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier4;
            j5 = j7;
            j6 = jAz;
        } else {
            composerKN.wTp();
            modifier3 = modifier2;
            j5 = jMUb;
            j6 = j4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$6
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
                    ProgressIndicatorKt.mUb(modifier3, j5, j6, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
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
    public static final void n(final float f3, Modifier modifier, long j2, float f4, long j3, int i2, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jMUb;
        int i8;
        float fN;
        int i9;
        long jJ2;
        int i10;
        int iN;
        ScopeUpdateScope scopeUpdateScopeGh;
        float f5;
        final Stroke stroke;
        final float f6;
        boolean z2;
        Object objIF;
        Composer composerKN = composer.KN(1746618448);
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
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    fN = f4;
                    i7 |= composerKN.rl(fN) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                    if ((i3 & 24576) == 0) {
                        jJ2 = j3;
                        i7 |= composerKN.nr(jJ2) ? 16384 : 8192;
                    }
                    if ((i3 & 196608) != 0) {
                        i10 = i2;
                        i7 |= ((i5 & 32) == 0 && composerKN.t(i10)) ? 131072 : 65536;
                    } else {
                        i10 = i2;
                    }
                    boolean z3 = true;
                    if (composerKN.HI((i7 & 74899) == 74898, i7 & 1)) {
                        composerKN.wTp();
                        iN = i10;
                    } else {
                        composerKN.e();
                        if ((i3 & 1) == 0 || composerKN.rV9()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i5 & 4) != 0) {
                                jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                                i7 &= -897;
                            }
                            if (i8 != 0) {
                                fN = ProgressIndicatorDefaults.f22500n.n();
                            }
                            if (i9 != 0) {
                                jJ2 = Color.INSTANCE.J2();
                            }
                            if ((i5 & 32) != 0) {
                                i7 &= -458753;
                                iN = StrokeCap.INSTANCE.n();
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1746618448, i7, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:338)");
                            }
                            f5 = f3 >= 0.0f ? f3 : 0.0f;
                            if (f5 > 1.0f) {
                                f5 = 1.0f;
                            }
                            stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(fN), 0.0f, iN, 0, null, 26, null);
                            f6 = f5;
                            Modifier modifierZ = SizeKt.Z(ProgressSemanticsKt.t(modifier2, f6, null, 0, 6, null), f22504t);
                            boolean zRl = composerKN.rl(f6) | ((57344 & i7) != 16384) | composerKN.E2(stroke);
                            if ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 || !composerKN.nr(jMUb)) && (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                                z3 = false;
                            }
                            z2 = zRl | z3;
                            objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                final long j4 = jMUb;
                                final long j5 = jJ2;
                                objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1$1
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
                                        float f7 = f6 * 360.0f;
                                        ProgressIndicatorKt.nHg(drawScope, j5, stroke);
                                        ProgressIndicatorKt.s7N(drawScope, 270.0f, f7, j4, stroke);
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            CanvasKt.rl(modifierZ, (Function1) objIF, composerKN, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        } else {
                            composerKN.wTp();
                            if ((i5 & 4) != 0) {
                                i7 &= -897;
                            }
                            if ((i5 & 32) != 0) {
                                i7 &= -458753;
                            }
                        }
                        iN = i10;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        if (f3 >= 0.0f) {
                        }
                        if (f5 > 1.0f) {
                        }
                        stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(fN), 0.0f, iN, 0, null, 26, null);
                        f6 = f5;
                        Modifier modifierZ2 = SizeKt.Z(ProgressSemanticsKt.t(modifier2, f6, null, 0, 6, null), f22504t);
                        boolean zRl2 = composerKN.rl(f6) | ((57344 & i7) != 16384) | composerKN.E2(stroke);
                        if (((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
                            z3 = false;
                            z2 = zRl2 | z3;
                            objIF = composerKN.iF();
                            if (z2) {
                                final long j42 = jMUb;
                                final long j52 = jJ2;
                                objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1$1
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
                                        float f7 = f6 * 360.0f;
                                        ProgressIndicatorKt.nHg(drawScope, j52, stroke);
                                        ProgressIndicatorKt.s7N(drawScope, 270.0f, f7, j42, stroke);
                                    }
                                };
                                composerKN.o(objIF);
                                CanvasKt.rl(modifierZ2, (Function1) objIF, composerKN, 0);
                                if (ComposerKt.v()) {
                                }
                            }
                        } else {
                            z3 = false;
                            z2 = zRl2 | z3;
                            objIF = composerKN.iF();
                            if (z2) {
                            }
                        }
                    }
                    final long j6 = jMUb;
                    final long j7 = jJ2;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        final Modifier modifier3 = modifier2;
                        final float f7 = fN;
                        final int i12 = iN;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
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
                                ProgressIndicatorKt.n(f3, modifier3, j6, f7, j7, i12, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 24576;
                jJ2 = j3;
                if ((i3 & 196608) != 0) {
                }
                boolean z32 = true;
                if (composerKN.HI((i7 & 74899) == 74898, i7 & 1)) {
                }
                final long j62 = jMUb;
                final long j72 = jJ2;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            fN = f4;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            jJ2 = j3;
            if ((i3 & 196608) != 0) {
            }
            boolean z322 = true;
            if (composerKN.HI((i7 & 74899) == 74898, i7 & 1)) {
            }
            final long j622 = jMUb;
            final long j722 = jJ2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        fN = f4;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        jJ2 = j3;
        if ((i3 & 196608) != 0) {
        }
        boolean z3222 = true;
        if (composerKN.HI((i7 & 74899) == 74898, i7 & 1)) {
        }
        final long j6222 = jMUb;
        final long j7222 = jJ2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void nr(Modifier modifier, long j2, float f3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jMUb;
        float f4;
        final Modifier modifier3;
        final long j3;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        float fN;
        long j4;
        Modifier modifier4;
        Composer composerKN = composer.KN(-392089979);
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
            jMUb = j2;
            i5 |= ((i3 & 2) == 0 && composerKN.nr(jMUb)) ? 32 : 16;
        } else {
            jMUb = j2;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                f4 = f3;
                i5 |= composerKN.rl(f4) ? 256 : 128;
            }
            if (composerKN.HI((i5 & 147) == 146, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
                j3 = jMUb;
                f5 = f4;
            } else {
                composerKN.e();
                if ((i2 & 1) == 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                        i5 &= -113;
                    }
                    fN = i8 != 0 ? ProgressIndicatorDefaults.f22500n.n() : f4;
                    j4 = jMUb;
                    modifier4 = modifier5;
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    fN = f4;
                    j4 = jMUb;
                    modifier4 = modifier2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-392089979, i5, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:467)");
                }
                rl(modifier4, j4, fN, Color.INSTANCE.J2(), StrokeCap.INSTANCE.t(), composerKN, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
                j3 = j4;
                f5 = fN;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$6
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
                        ProgressIndicatorKt.nr(modifier3, j3, f5, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        f4 = f3;
        if (composerKN.HI((i5 & 147) == 146, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void qie(final float f3, Modifier modifier, long j2, long j3, Composer composer, final int i2, final int i3) {
        float f4;
        int i5;
        Modifier modifier2;
        long j4;
        long j5;
        final Modifier modifier3;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeGh;
        long jMUb;
        long jAz;
        long j9;
        Modifier modifier4;
        Composer composerKN = composer.KN(-850309746);
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
            if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
                j6 = j4;
                j7 = j5;
            } else {
                composerKN.e();
                if ((i2 & 1) == 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                        jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                    } else {
                        jMUb = j4;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                        modifier4 = modifier5;
                        jAz = Color.az(jMUb, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        j9 = jMUb;
                    } else {
                        jAz = j5;
                        j9 = jMUb;
                        modifier4 = modifier5;
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
                    modifier4 = modifier2;
                    j9 = j4;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-850309746, i5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:238)");
                }
                gh(f4, modifier4, j9, jAz, StrokeCap.INSTANCE.n(), composerKN, i5 & 8190, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
                j6 = j9;
                j7 = jAz;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$5
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
                        ProgressIndicatorKt.qie(f3, modifier3, j6, j7, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
        if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0253  */
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
    public static final void rl(Modifier modifier, long j2, float f3, long j3, int i2, Composer composer, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        long jMUb;
        float fN;
        int i8;
        int i9;
        final Modifier modifier3;
        final int i10;
        final long j4;
        final float f4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        final long j6;
        int iT;
        long j7;
        int i11;
        final float f5;
        final Stroke stroke;
        final State stateRl;
        final State stateN;
        final State stateN2;
        final State stateN3;
        boolean zE2;
        Object objIF;
        final long j9;
        Composer composerKN = composer.KN(-1119119072);
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
            jMUb = j2;
            i7 |= ((i5 & 2) == 0 && composerKN.nr(jMUb)) ? 32 : 16;
        } else {
            jMUb = j2;
        }
        int i13 = i5 & 4;
        if (i13 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                fN = f3;
                i7 |= composerKN.rl(fN) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    i7 |= composerKN.nr(j3) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        i9 = i2;
                        int i14 = composerKN.t(i9) ? 16384 : 8192;
                        i7 |= i14;
                    } else {
                        i9 = i2;
                    }
                    i7 |= i14;
                } else {
                    i9 = i2;
                }
                if (composerKN.HI((i7 & 9363) != 9362, i7 & 1)) {
                    composerKN.e();
                    if ((i3 & 1) == 0 || composerKN.rV9()) {
                        modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i5 & 2) != 0) {
                            i7 &= -113;
                            jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                        }
                        if (i13 != 0) {
                            fN = ProgressIndicatorDefaults.f22500n.n();
                        }
                        long jJ2 = i8 != 0 ? Color.INSTANCE.J2() : j3;
                        if ((i5 & 16) != 0) {
                            j6 = jJ2;
                            iT = StrokeCap.INSTANCE.t();
                            j7 = jMUb;
                            i11 = i7 & (-57345);
                            f5 = fN;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:374)");
                            }
                            stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f5), 0.0f, iT, 0, null, 26, null);
                            int i15 = iT;
                            InfiniteTransition infiniteTransitionT = InfiniteTransitionKt.t(null, composerKN, 0, 1);
                            TwoWayConverter twoWayConverterMUb = VectorConvertersKt.mUb(IntCompanionObject.INSTANCE);
                            Modifier modifier5 = modifier4;
                            InfiniteRepeatableSpec infiniteRepeatableSpecO = AnimationSpecKt.O(AnimationSpecKt.ty(6660, 0, EasingKt.O(), 2, null), null, 0L, 6, null);
                            int i16 = InfiniteTransition.J2;
                            int i17 = InfiniteRepeatableSpec.nr;
                            stateRl = InfiniteTransitionKt.rl(infiniteTransitionT, 0, 5, twoWayConverterMUb, infiniteRepeatableSpecO, null, composerKN, i16 | 432 | (i17 << 12), 16);
                            stateN = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 286.0f, AnimationSpecKt.O(AnimationSpecKt.ty(1332, 0, EasingKt.O(), 2, null), null, 0L, 6, null), null, composerKN, i16 | 432 | (i17 << 9), 8);
                            stateN2 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    n(keyframesSpecConfig);
                                    return Unit.INSTANCE;
                                }

                                public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                                    keyframesSpecConfig.nr(1332);
                                    keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.KN);
                                    keyframesSpecConfig.J2(Float.valueOf(290.0f), 666);
                                }
                            }), null, 0L, 6, null), null, composerKN, i16 | 432 | (i17 << 9), 8);
                            stateN3 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    n(keyframesSpecConfig);
                                    return Unit.INSTANCE;
                                }

                                public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                                    keyframesSpecConfig.nr(1332);
                                    keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 666), ProgressIndicatorKt.KN);
                                    keyframesSpecConfig.J2(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                                }
                            }), null, 0L, 6, null), null, composerKN, i16 | 432 | (i17 << 9), 8);
                            Modifier modifierZ = SizeKt.Z(ProgressSemanticsKt.n(modifier5), f22504t);
                            zE2 = composerKN.E2(stroke) | ((i11 & 7168) != 2048) | composerKN.p5(stateRl) | composerKN.p5(stateN2) | composerKN.p5(stateN3) | composerKN.p5(stateN) | ((i11 & 896) != 256) | ((((i11 & 112) ^ 48) <= 32 && composerKN.nr(j7)) || (i11 & 48) == 32);
                            objIF = composerKN.iF();
                            if (zE2 || objIF == Composer.INSTANCE.n()) {
                                j9 = j7;
                                objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
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
                                        ProgressIndicatorKt.nHg(drawScope, j6, stroke);
                                        ProgressIndicatorKt.wTp(drawScope, ProgressIndicatorKt.Uo(stateN3) + (((ProgressIndicatorKt.KN(stateRl) * 216.0f) % 360.0f) - 90.0f) + ProgressIndicatorKt.O(stateN), f5, Math.abs(ProgressIndicatorKt.J2(stateN2) - ProgressIndicatorKt.Uo(stateN3)), j9, stroke);
                                    }
                                };
                                composerKN.o(objIF);
                            } else {
                                j9 = j7;
                            }
                            CanvasKt.rl(modifierZ, (Function1) objIF, composerKN, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            i10 = i15;
                            j5 = j6;
                            f4 = f5;
                            j4 = j9;
                            modifier3 = modifier5;
                        } else {
                            j6 = jJ2;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i5 & 2) != 0) {
                            i7 &= -113;
                        }
                        if ((i5 & 16) != 0) {
                            i7 &= -57345;
                        }
                        j6 = j3;
                        modifier4 = modifier2;
                    }
                    i11 = i7;
                    iT = i9;
                    j7 = jMUb;
                    f5 = fN;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    stroke = new Stroke(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f5), 0.0f, iT, 0, null, 26, null);
                    int i152 = iT;
                    InfiniteTransition infiniteTransitionT2 = InfiniteTransitionKt.t(null, composerKN, 0, 1);
                    TwoWayConverter twoWayConverterMUb2 = VectorConvertersKt.mUb(IntCompanionObject.INSTANCE);
                    Modifier modifier52 = modifier4;
                    InfiniteRepeatableSpec infiniteRepeatableSpecO2 = AnimationSpecKt.O(AnimationSpecKt.ty(6660, 0, EasingKt.O(), 2, null), null, 0L, 6, null);
                    int i162 = InfiniteTransition.J2;
                    int i172 = InfiniteRepeatableSpec.nr;
                    stateRl = InfiniteTransitionKt.rl(infiniteTransitionT2, 0, 5, twoWayConverterMUb2, infiniteRepeatableSpecO2, null, composerKN, i162 | 432 | (i172 << 12), 16);
                    stateN = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 286.0f, AnimationSpecKt.O(AnimationSpecKt.ty(1332, 0, EasingKt.O(), 2, null), null, 0L, 6, null), null, composerKN, i162 | 432 | (i172 << 9), 8);
                    stateN2 = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1332);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.KN);
                            keyframesSpecConfig.J2(Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), null, composerKN, i162 | 432 | (i172 << 9), 8);
                    stateN3 = InfiniteTransitionKt.n(infiniteTransitionT2, 0.0f, 290.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            n(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                            keyframesSpecConfig.nr(1332);
                            keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 666), ProgressIndicatorKt.KN);
                            keyframesSpecConfig.J2(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                        }
                    }), null, 0L, 6, null), null, composerKN, i162 | 432 | (i172 << 9), 8);
                    Modifier modifierZ2 = SizeKt.Z(ProgressSemanticsKt.n(modifier52), f22504t);
                    if (((i11 & 112) ^ 48) <= 32) {
                        zE2 = composerKN.E2(stroke) | ((i11 & 7168) != 2048) | composerKN.p5(stateRl) | composerKN.p5(stateN2) | composerKN.p5(stateN3) | composerKN.p5(stateN) | ((i11 & 896) != 256) | ((((i11 & 112) ^ 48) <= 32 && composerKN.nr(j7)) || (i11 & 48) == 32);
                        objIF = composerKN.iF();
                        if (zE2) {
                            j9 = j7;
                            objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
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
                                    ProgressIndicatorKt.nHg(drawScope, j6, stroke);
                                    ProgressIndicatorKt.wTp(drawScope, ProgressIndicatorKt.Uo(stateN3) + (((ProgressIndicatorKt.KN(stateRl) * 216.0f) % 360.0f) - 90.0f) + ProgressIndicatorKt.O(stateN), f5, Math.abs(ProgressIndicatorKt.J2(stateN2) - ProgressIndicatorKt.Uo(stateN3)), j9, stroke);
                                }
                            };
                            composerKN.o(objIF);
                            CanvasKt.rl(modifierZ2, (Function1) objIF, composerKN, 0);
                            if (ComposerKt.v()) {
                            }
                            i10 = i152;
                            j5 = j6;
                            f4 = f5;
                            j4 = j9;
                            modifier3 = modifier52;
                        }
                    } else {
                        zE2 = composerKN.E2(stroke) | ((i11 & 7168) != 2048) | composerKN.p5(stateRl) | composerKN.p5(stateN2) | composerKN.p5(stateN3) | composerKN.p5(stateN) | ((i11 & 896) != 256) | ((((i11 & 112) ^ 48) <= 32 && composerKN.nr(j7)) || (i11 & 48) == 32);
                        objIF = composerKN.iF();
                        if (zE2) {
                        }
                    }
                } else {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    i10 = i9;
                    j4 = jMUb;
                    f4 = fN;
                    j5 = j3;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i18) {
                            ProgressIndicatorKt.rl(modifier3, j4, f4, j5, i10, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 3072;
            if ((i3 & 24576) == 0) {
            }
            if (composerKN.HI((i7 & 9363) != 9362, i7 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        fN = f3;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if (composerKN.HI((i7 & 9363) != 9362, i7 & 1)) {
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
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void t(final float f3, Modifier modifier, long j2, float f4, Composer composer, final int i2, final int i3) {
        float f5;
        int i5;
        Modifier modifier2;
        long jMUb;
        int i7;
        float f6;
        final Modifier modifier3;
        final long j3;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeGh;
        float fN;
        long j4;
        Modifier modifier4;
        Composer composerKN = composer.KN(-409649739);
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
                jMUb = j2;
                i5 |= ((i3 & 4) == 0 && composerKN.nr(jMUb)) ? 256 : 128;
            } else {
                jMUb = j2;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    f6 = f4;
                    i5 |= composerKN.rl(f6) ? 2048 : 1024;
                }
                if (composerKN.HI((i5 & 1171) != 1170, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        Modifier modifier5 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) != 0) {
                            jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                            i5 &= -897;
                        }
                        fN = i7 != 0 ? ProgressIndicatorDefaults.f22500n.n() : f6;
                        j4 = jMUb;
                        modifier4 = modifier5;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        fN = f6;
                        j4 = jMUb;
                        modifier4 = modifier2;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-409649739, i5, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:451)");
                    }
                    n(f5, modifier4, j4, fN, Color.INSTANCE.J2(), StrokeCap.INSTANCE.n(), composerKN, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                    j3 = j4;
                    f7 = fN;
                } else {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    j3 = jMUb;
                    f7 = f6;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5
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
                            ProgressIndicatorKt.t(f3, modifier3, j3, f7, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            f6 = f4;
            if (composerKN.HI((i5 & 1171) != 1170, i5 & 1)) {
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
        if (composerKN.HI((i5 & 1171) != 1170, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

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
    public static final void xMQ(Modifier modifier, long j2, long j3, int i2, Composer composer, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        long jMUb;
        long j4;
        int iN;
        final Modifier modifier3;
        final int i8;
        final long j5;
        final long j6;
        Modifier modifier4;
        long jAz;
        int i9;
        long j7;
        long j9;
        final int i10;
        Composer composerKN = composer.KN(1501635280);
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
            j4 = j3;
            i7 |= ((i5 & 4) == 0 && composerKN.nr(j4)) ? 256 : 128;
        } else {
            j4 = j3;
        }
        if ((i3 & 3072) == 0) {
            if ((i5 & 8) == 0) {
                iN = i2;
                int i12 = composerKN.t(iN) ? 2048 : 1024;
                i7 |= i12;
            } else {
                iN = i2;
            }
            i7 |= i12;
        } else {
            iN = i2;
        }
        if (composerKN.HI((i7 & 1171) != 1170, i7 & 1)) {
            composerKN.e();
            if ((i3 & 1) == 0 || composerKN.rV9()) {
                modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i5 & 2) != 0) {
                    jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                    i7 &= -113;
                }
                long j10 = jMUb;
                if ((i5 & 4) != 0) {
                    jAz = Color.az(j10, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i7 &= -897;
                } else {
                    jAz = j4;
                }
                if ((i5 & 8) != 0) {
                    i7 &= -7169;
                    iN = StrokeCap.INSTANCE.n();
                }
                long j11 = jAz;
                i9 = i7;
                j7 = j10;
                j9 = j11;
            } else {
                composerKN.wTp();
                if ((i5 & 2) != 0) {
                    i7 &= -113;
                }
                if ((i5 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i7 &= -7169;
                }
                modifier4 = modifier2;
                j9 = j4;
                long j12 = jMUb;
                i9 = i7;
                j7 = j12;
            }
            composerKN.S();
            if (ComposerKt.v()) {
                ComposerKt.p5(1501635280, i9, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:144)");
            }
            InfiniteTransition infiniteTransitionT = InfiniteTransitionKt.t(null, composerKN, 0, 1);
            InfiniteRepeatableSpec infiniteRepeatableSpecO = AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    n(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                    keyframesSpecConfig.nr(1800);
                    keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 0), ProgressIndicatorKt.nr);
                    keyframesSpecConfig.J2(Float.valueOf(1.0f), 750);
                }
            }), null, 0L, 6, null);
            int i13 = InfiniteTransition.J2;
            int i14 = InfiniteRepeatableSpec.nr;
            Modifier modifier5 = modifier4;
            int i15 = i9;
            final long j13 = j9;
            final State stateN = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 1.0f, infiniteRepeatableSpecO, null, composerKN, (i14 << 9) | i13 | 432, 8);
            final State stateN2 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    n(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                    keyframesSpecConfig.nr(1800);
                    keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 333), ProgressIndicatorKt.f22502O);
                    keyframesSpecConfig.J2(Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), null, composerKN, i13 | 432 | (i14 << 9), 8);
            final long j14 = j7;
            final State stateN3 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    n(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                    keyframesSpecConfig.nr(1800);
                    keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.J2);
                    keyframesSpecConfig.J2(Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), null, composerKN, i13 | 432 | (i14 << 9), 8);
            final State stateN4 = InfiniteTransitionKt.n(infiniteTransitionT, 0.0f, 1.0f, AnimationSpecKt.O(AnimationSpecKt.J2(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    n(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                public final void n(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
                    keyframesSpecConfig.nr(1800);
                    keyframesSpecConfig.O(keyframesSpecConfig.J2(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.Uo);
                    keyframesSpecConfig.J2(Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), null, composerKN, i13 | 432 | (i14 << 9), 8);
            Modifier modifierS = SizeKt.S(ProgressSemanticsKt.n(bzg(modifier5)), rl, f22503n);
            boolean zP5 = ((((i15 & 112) ^ 48) > 32 && composerKN.nr(j14)) || (i15 & 48) == 32) | ((((i15 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composerKN.nr(j13)) || (i15 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i15 & 7168) ^ 3072) > 2048 && composerKN.t(iN)) || (i15 & 3072) == 2048) | composerKN.p5(stateN) | composerKN.p5(stateN2) | composerKN.p5(stateN3) | composerKN.p5(stateN4);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                i10 = iN;
                objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
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
                        DrawScope drawScope2;
                        float fXMQ = Size.xMQ(drawScope.t());
                        ProgressIndicatorKt.rV9(drawScope, j13, fXMQ, i10);
                        if (ProgressIndicatorKt.az(stateN) - ProgressIndicatorKt.ty(stateN2) > 0.0f) {
                            drawScope2 = drawScope;
                            ProgressIndicatorKt.v(drawScope2, ProgressIndicatorKt.az(stateN), ProgressIndicatorKt.ty(stateN2), j14, fXMQ, i10);
                        } else {
                            drawScope2 = drawScope;
                        }
                        if (ProgressIndicatorKt.HI(stateN3) - ProgressIndicatorKt.ck(stateN4) > 0.0f) {
                            ProgressIndicatorKt.v(drawScope2, ProgressIndicatorKt.HI(stateN3), ProgressIndicatorKt.ck(stateN4), j14, fXMQ, i10);
                        }
                    }
                };
                composerKN.o(objIF);
            } else {
                i10 = iN;
            }
            CanvasKt.rl(modifierS, (Function1) objIF, composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            j6 = j13;
            j5 = j14;
            i8 = i10;
            modifier3 = modifier5;
        } else {
            composerKN.wTp();
            modifier3 = modifier2;
            i8 = iN;
            j5 = jMUb;
            j6 = j4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i16) {
                    ProgressIndicatorKt.xMQ(modifier3, j5, j6, i8, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float HI(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float J2(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int KN(State state) {
        return ((Number) state.getValue()).intValue();
    }

    private static final void N(DrawScope drawScope, float f3, float f4, long j2, Stroke stroke) {
        float f5 = 2;
        float width = stroke.getWidth() / f5;
        float fGh = Size.gh(drawScope.t()) - (f5 * width);
        DrawScope.RQ(drawScope, j2, f3, f4, false, OffsetKt.n(width, width), androidx.compose.ui.geometry.SizeKt.n(fGh, fGh), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float O(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Uo(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float az(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ck(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s7N(DrawScope drawScope, float f3, float f4, long j2, Stroke stroke) {
        N(drawScope, f3, f4, j2, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ty(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DrawScope drawScope, float f3, float f4, long j2, float f5, int i2) {
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
    public static final void wTp(DrawScope drawScope, float f3, float f4, float f5, long j2, Stroke stroke) {
        float fKN;
        if (StrokeCap.Uo(stroke.getCap(), StrokeCap.INSTANCE.n())) {
            fKN = 0.0f;
        } else {
            fKN = ((f4 / Dp.KN(f22504t / 2)) * 57.29578f) / 2.0f;
        }
        N(drawScope, f3 + fKN, Math.max(f5, 0.1f), j2, stroke);
    }
}
