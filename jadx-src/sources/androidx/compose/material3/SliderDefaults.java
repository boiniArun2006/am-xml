package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÄ\u0001\u0010\u001e\u001a\u00020\u0017*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u001f\u0010\u0019\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0002\b\u00182#\u0010\u001b\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0002\b\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010&\u001a\u00020\u0017*\u00020\u00042\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J2\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-JB\u00106\u001a\u00020\u00172\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u00020+2\b\b\u0002\u00103\u001a\u00020\u001c2\b\b\u0002\u00105\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J5\u0010:\u001a\u00020\u00172\u0006\u00109\u001a\u0002082\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u00020+2\b\b\u0002\u00103\u001a\u00020\u001cH\u0007¢\u0006\u0004\b:\u0010;J5\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020<2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u00020+2\b\b\u0002\u00103\u001a\u00020\u001cH\u0007¢\u0006\u0004\b>\u0010?J\u0096\u0001\u0010@\u001a\u00020\u00172\u0006\u0010=\u001a\u00020<2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u00020+2!\b\u0002\u0010\u0019\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0002\b\u00182%\b\u0002\u0010\u001b\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ5\u0010D\u001a\u00020\u00172\u0006\u0010C\u001a\u00020B2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u00020+2\b\b\u0002\u00103\u001a\u00020\u001cH\u0007¢\u0006\u0004\bD\u0010EJ\u0096\u0001\u0010F\u001a\u00020\u00172\u0006\u0010C\u001a\u00020B2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u00020+2!\b\u0002\u0010\u0019\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0002\b\u00182%\b\u0002\u0010\u001b\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010GR\u001d\u0010K\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010M\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010H\u001a\u0004\bL\u0010JR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010OR\u0018\u0010T\u001a\u00020+*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "tickFractions", "", "activeRangeStart", "activeRangeEnd", "Landroidx/compose/ui/graphics/Color;", "inactiveTrackColor", "activeTrackColor", "inactiveTickColor", "activeTickColor", "Landroidx/compose/ui/unit/Dp;", "height", "startThumbWidth", "endThumbWidth", "thumbTrackGapSize", "trackInsideCornerSize", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/ExtensionFunctionType;", "drawStopIndicator", "Lkotlin/Function3;", "drawTick", "", "isRangeSlider", "gh", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "offset", "Landroidx/compose/ui/geometry/Size;", "size", TtmlNode.ATTR_TTS_COLOR, "startCornerRadius", "endCornerRadius", "qie", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V", "drawScope", "mUb", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "Landroidx/compose/material3/SliderColors;", "xMQ", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "colors", "enabled", "Landroidx/compose/ui/unit/DpSize;", "thumbSize", c.f62177j, "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderPositions;", "sliderPositions", "t", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderState;", "sliderState", "nr", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "J2", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/RangeSliderState;", "rangeSliderState", "rl", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "O", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "F", "HI", "()F", "TrackStopIndicatorSize", "ty", "TickSize", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path;", "trackPath", "Landroidx/compose/material3/ColorScheme;", "az", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "defaultSliderColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2263:1\n1#2:2264\n1223#3,6:2265\n1223#3,6:2271\n1223#3,6:2278\n1223#3,6:2284\n1223#3,6:2291\n1223#3,6:2297\n1223#3,6:2304\n71#4:2277\n77#5:2290\n77#5:2303\n148#6:2310\n13694#7,3:2311\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n*L\n952#1:2265,6\n953#1:2271,6\n1005#1:2278,6\n1116#1:2284,6\n1139#1:2291,6\n1224#1:2297,6\n1247#1:2304,6\n968#1:2277\n1138#1:2290\n1246#1:2303\n1299#1:2310\n1348#1:2311,3\n*E\n"})
public final class SliderDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SliderDefaults f27553n = new SliderDefaults();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final Path trackPath;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float TrackStopIndicatorSize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float TickSize;

    static {
        SliderTokens sliderTokens = SliderTokens.f29892n;
        TrackStopIndicatorSize = sliderTokens.HI();
        TickSize = sliderTokens.HI();
        trackPath = AndroidPath_androidKt.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gh(DrawScope drawScope, float[] fArr, float f3, float f4, long j2, long j3, long j4, long j5, float f5, float f6, float f7, float f8, float f9, Function2 function2, Function3 function3, boolean z2) {
        float fL;
        float fL2;
        float f10;
        int i2;
        float f11;
        float f12;
        long jN = OffsetKt.n(0.0f, Offset.ty(drawScope.Co()));
        long jN2 = OffsetKt.n(Size.gh(drawScope.t()), Offset.ty(drawScope.Co()));
        float fL3 = drawScope.l(f5);
        long jN3 = OffsetKt.n(Offset.az(jN) + ((Offset.az(jN2) - Offset.az(jN)) * f4), Offset.ty(drawScope.Co()));
        long jN4 = OffsetKt.n(Offset.az(jN) + ((Offset.az(jN2) - Offset.az(jN)) * f3), Offset.ty(drawScope.Co()));
        float f13 = 2;
        float f14 = fL3 / f13;
        float fL4 = drawScope.l(f9);
        if (Dp.Uo(f8, Dp.KN(0)) > 0) {
            fL = (drawScope.l(f6) / f13) + drawScope.l(f8);
            fL2 = (drawScope.l(f7) / f13) + drawScope.l(f8);
        } else {
            fL = 0.0f;
            fL2 = 0.0f;
        }
        if (!z2 || Offset.az(jN4) <= Offset.az(jN) + fL + f14) {
            f10 = fL3;
            i2 = 0;
        } else {
            float fAz = Offset.az(jN);
            f10 = fL3;
            i2 = 0;
            qie(drawScope, Offset.INSTANCE.t(), SizeKt.n((Offset.az(jN4) - fL) - fAz, fL3), j2, f14, fL4);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.nr(OffsetKt.n(fAz + f14, Offset.ty(drawScope.Co()))));
            }
        }
        if (Offset.az(jN3) < (Offset.az(jN2) - fL2) - f14) {
            float fAz2 = Offset.az(jN3) + fL2;
            float fAz3 = Offset.az(jN2);
            float f15 = f10;
            f12 = f15;
            qie(drawScope, OffsetKt.n(fAz2, 0.0f), SizeKt.n(fAz3 - fAz2, f15), j2, fL4, f14);
            f11 = f14;
            fL4 = fL4;
            if (function2 != null) {
                function2.invoke(drawScope, Offset.nr(OffsetKt.n(fAz3 - f11, Offset.ty(drawScope.Co()))));
            }
        } else {
            f11 = f14;
            f12 = f10;
        }
        float fAz4 = z2 ? Offset.az(jN4) + fL : 0.0f;
        float fAz5 = Offset.az(jN3) - fL2;
        float f16 = z2 ? fL4 : f11;
        float f17 = fAz5 - fAz4;
        if (f17 > f16) {
            qie(drawScope, OffsetKt.n(fAz4, 0.0f), SizeKt.n(f17, f12), j3, f16, fL4);
        }
        long jN5 = OffsetKt.n(Offset.az(jN) + f11, Offset.ty(jN));
        long jN6 = OffsetKt.n(Offset.az(jN2) - f11, Offset.ty(jN2));
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(Offset.az(jN4) - fL, Offset.az(jN4) + fL);
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2 = RangesKt.rangeTo(Offset.az(jN3) - fL2, Offset.az(jN3) + fL2);
        int length = fArr.length;
        int i3 = i2;
        int i5 = i3;
        while (i3 < length) {
            float f18 = fArr[i3];
            int i7 = i5 + 1;
            int i8 = 1;
            if (function2 == null || ((!z2 || i5 != 0) && i5 != fArr.length - 1)) {
                if (f18 <= f4 && f18 >= f3) {
                    i8 = i2;
                }
                long jN7 = OffsetKt.n(Offset.az(OffsetKt.rl(jN5, jN6, f18)), Offset.ty(drawScope.Co()));
                if ((!z2 || !closedFloatingPointRangeRangeTo.contains(Float.valueOf(Offset.az(jN7)))) && !closedFloatingPointRangeRangeTo2.contains(Float.valueOf(Offset.az(jN7)))) {
                    function3.invoke(drawScope, Offset.nr(jN7), Color.xMQ(i8 != 0 ? j4 : j5));
                }
            }
            i3++;
            i5 = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mUb(DrawScope drawScope, long offset, float size, long color) {
        DrawScope.Lu(drawScope, color, drawScope.l(size) / 2.0f, offset, 0.0f, null, null, 0, b.f61769v, null);
    }

    private final void qie(DrawScope drawScope, long j2, long j3, long j4, float f3, float f4) {
        long jN = CornerRadiusKt.n(f3, f3);
        long jN2 = CornerRadiusKt.n(f4, f4);
        RoundRect roundRectT = RoundRectKt.t(RectKt.t(OffsetKt.n(Offset.az(j2), 0.0f), SizeKt.n(Size.gh(j3), Size.xMQ(j3))), jN, jN2, jN2, jN);
        Path path = trackPath;
        Path.ty(path, roundRectT, null, 2, null);
        DrawScope.EWS(drawScope, path, j4, 0.0f, null, null, 0, 60, null);
        path.gh();
    }

    public final float HI() {
        return TrackStopIndicatorSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0258 A[PHI: r2
      0x0258: PHI (r2v14 kotlin.jvm.functions.Function2) = (r2v11 kotlin.jvm.functions.Function2), (r2v15 kotlin.jvm.functions.Function2) binds: [B:171:0x0256, B:167:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J2(final SliderState sliderState, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        final boolean z3;
        final SliderColors sliderColors2;
        final Function2 function22;
        int i8;
        final Function3 function32;
        int i9;
        float f5;
        int i10;
        final float f6;
        int i11;
        Function2 function23;
        boolean z4;
        boolean z5;
        Object objIF;
        Composer composer2;
        SliderColors sliderColors3;
        final float f7;
        boolean z6;
        final float f8;
        final boolean z7;
        final SliderColors sliderColors4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i12;
        Composer composerKN = composer.KN(49984771);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(sliderState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        int i14 = composerKN.p5(sliderColors2) ? 2048 : 1024;
                        i5 |= i14;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i5 |= i14;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        function22 = function2;
                        int i15 = composerKN.E2(function22) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        function22 = function2;
                    }
                    i5 |= i15;
                } else {
                    function22 = function2;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i2 & 196608) == 0) {
                        i5 |= composerKN.E2(function32) ? 131072 : 65536;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    f5 = f3;
                } else {
                    f5 = f3;
                    if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.rl(f5) ? 1048576 : 524288;
                    }
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                    f6 = f4;
                } else {
                    f6 = f4;
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.rl(f6) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 256) == 0) {
                    i12 = (i2 & 100663296) == 0 ? composerKN.p5(this) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432 : 100663296;
                    if ((38347923 & i5) == 38347922 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                SliderColors sliderColorsXMQ = xMQ(composerKN, (i5 >> 24) & 14);
                                i5 &= -7169;
                                sliderColors2 = sliderColorsXMQ;
                            }
                            if ((i3 & 16) != 0) {
                                boolean z9 = ((((i5 & 7168) ^ 3072) > 2048 && composerKN.p5(sliderColors2)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                                Object objIF2 = composerKN.iF();
                                if (z9 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            n(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(DrawScope drawScope, long j2) {
                                            SliderDefaults sliderDefaults = SliderDefaults.f27553n;
                                            sliderDefaults.mUb(drawScope, j2, sliderDefaults.HI(), sliderColors2.t(z3, true));
                                        }
                                    };
                                    composerKN.o(objIF2);
                                }
                                i5 &= -57345;
                                function22 = (Function2) objIF2;
                            }
                            if (i8 != 0) {
                                function32 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        n(drawScope, offset.getPackedValue(), color.getValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(DrawScope drawScope, long j2, long j3) {
                                        SliderDefaults sliderDefaults = SliderDefaults.f27553n;
                                        sliderDefaults.mUb(drawScope, j2, sliderDefaults.ty(), j3);
                                    }
                                };
                            }
                            if (i9 != 0) {
                                f5 = SliderKt.f27628O;
                            }
                            if (i10 != 0) {
                                f6 = SliderKt.J2;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                        }
                        i11 = i5;
                        Modifier modifier4 = modifier2;
                        SliderColors sliderColors5 = sliderColors2;
                        float f9 = f5;
                        boolean z10 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(49984771, i11, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1128)");
                        }
                        final long jT2 = sliderColors5.t(z10, false);
                        final long jT3 = sliderColors5.t(z10, true);
                        float f10 = f6;
                        Function2 function24 = function22;
                        final long jRl = sliderColors5.rl(z10, false);
                        final long jRl2 = sliderColors5.rl(z10, true);
                        Modifier modifierN = RotateKt.n(androidx.compose.foundation.layout.SizeKt.xMQ(androidx.compose.foundation.layout.SizeKt.KN(modifier4, 0.0f, 1, null), SliderKt.WPU()), composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t ? 180.0f : 0.0f);
                        boolean zE2 = ((i11 & 3670016) != 1048576) | composerKN.E2(sliderState) | composerKN.nr(jT2) | composerKN.nr(jT3) | composerKN.nr(jRl) | composerKN.nr(jRl2) | ((29360128 & i11) != 8388608);
                        if (((57344 & i11) ^ 24576) <= 16384) {
                            function23 = function24;
                            if (composerKN.p5(function23)) {
                                z4 = true;
                                z5 = zE2 | z4 | ((458752 & i11) == 131072);
                                objIF = composerKN.iF();
                                if (z5 || objIF == Composer.INSTANCE.n()) {
                                    composer2 = composerKN;
                                    sliderColors3 = sliderColors5;
                                    f7 = f9;
                                    function22 = function23;
                                    f6 = f10;
                                    z6 = z10;
                                    Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
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
                                            SliderDefaults.f27553n.gh(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.Uo(), jT2, jT3, jRl, jRl2, drawScope.bzg(sliderState.Ik()), drawScope.rV9(0), drawScope.bzg(sliderState.ty()), f7, f6, function22, function32, false);
                                        }
                                    };
                                    composer2.o(function1);
                                    objIF = function1;
                                } else {
                                    f7 = f9;
                                    f6 = f10;
                                    function22 = function23;
                                    z6 = z10;
                                    composer2 = composerKN;
                                    sliderColors3 = sliderColors5;
                                }
                                CanvasKt.rl(modifierN, (Function1) objIF, composer2, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                f8 = f7;
                                z7 = z6;
                                sliderColors4 = sliderColors3;
                                modifier3 = modifier4;
                            }
                        } else {
                            function23 = function24;
                        }
                        if ((i11 & 24576) == 16384) {
                            z4 = false;
                        }
                        z5 = zE2 | z4 | ((458752 & i11) == 131072);
                        objIF = composerKN.iF();
                        if (z5) {
                            composer2 = composerKN;
                            sliderColors3 = sliderColors5;
                            f7 = f9;
                            function22 = function23;
                            f6 = f10;
                            z6 = z10;
                            Function1<DrawScope, Unit> function12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
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
                                    SliderDefaults.f27553n.gh(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.Uo(), jT2, jT3, jRl, jRl2, drawScope.bzg(sliderState.Ik()), drawScope.rV9(0), drawScope.bzg(sliderState.ty()), f7, f6, function22, function32, false);
                                }
                            };
                            composer2.o(function12);
                            objIF = function12;
                            CanvasKt.rl(modifierN, (Function1) objIF, composer2, 0);
                            if (ComposerKt.v()) {
                            }
                            f8 = f7;
                            z7 = z6;
                            sliderColors4 = sliderColors3;
                            modifier3 = modifier4;
                        }
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                        f8 = f5;
                        z7 = z3;
                    }
                    final float f11 = f6;
                    final Function2 function25 = function22;
                    final Function3 function33 = function32;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$7
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
                                this.f27616n.J2(sliderState, modifier3, z7, sliderColors4, function25, function33, f8, f11, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= i12;
                if ((38347923 & i5) == 38347922) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        i11 = i5;
                        Modifier modifier42 = modifier2;
                        SliderColors sliderColors52 = sliderColors2;
                        float f92 = f5;
                        boolean z102 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        final long jT22 = sliderColors52.t(z102, false);
                        final long jT32 = sliderColors52.t(z102, true);
                        float f102 = f6;
                        Function2 function242 = function22;
                        final long jRl3 = sliderColors52.rl(z102, false);
                        final long jRl22 = sliderColors52.rl(z102, true);
                        Modifier modifierN2 = RotateKt.n(androidx.compose.foundation.layout.SizeKt.xMQ(androidx.compose.foundation.layout.SizeKt.KN(modifier42, 0.0f, 1, null), SliderKt.WPU()), composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t ? 180.0f : 0.0f);
                        boolean zE22 = ((i11 & 3670016) != 1048576) | composerKN.E2(sliderState) | composerKN.nr(jT22) | composerKN.nr(jT32) | composerKN.nr(jRl3) | composerKN.nr(jRl22) | ((29360128 & i11) != 8388608);
                        if (((57344 & i11) ^ 24576) <= 16384) {
                        }
                        if ((i11 & 24576) == 16384) {
                        }
                        z5 = zE22 | z4 | ((458752 & i11) == 131072);
                        objIF = composerKN.iF();
                        if (z5) {
                        }
                    }
                }
                final float f112 = f6;
                final Function2 function252 = function22;
                final Function3 function332 = function32;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            i5 |= i12;
            if ((38347923 & i5) == 38347922) {
            }
            final float f1122 = f6;
            final Function2 function2522 = function22;
            final Function3 function3322 = function32;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i5 |= i12;
        if ((38347923 & i5) == 38347922) {
        }
        final float f11222 = f6;
        final Function2 function25222 = function22;
        final Function3 function33222 = function32;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0258 A[PHI: r2
      0x0258: PHI (r2v14 kotlin.jvm.functions.Function2) = (r2v11 kotlin.jvm.functions.Function2), (r2v15 kotlin.jvm.functions.Function2) binds: [B:171:0x0256, B:167:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(final RangeSliderState rangeSliderState, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        final boolean z3;
        final SliderColors sliderColors2;
        final Function2 function22;
        int i8;
        final Function3 function32;
        int i9;
        float f5;
        int i10;
        final float f6;
        int i11;
        Function2 function23;
        boolean z4;
        boolean z5;
        Object objIF;
        Composer composer2;
        SliderColors sliderColors3;
        final float f7;
        boolean z6;
        final float f8;
        final boolean z7;
        final SliderColors sliderColors4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i12;
        Composer composerKN = composer.KN(-541824132);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(rangeSliderState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        int i14 = composerKN.p5(sliderColors2) ? 2048 : 1024;
                        i5 |= i14;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i5 |= i14;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        function22 = function2;
                        int i15 = composerKN.E2(function22) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        function22 = function2;
                    }
                    i5 |= i15;
                } else {
                    function22 = function2;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i2 & 196608) == 0) {
                        i5 |= composerKN.E2(function32) ? 131072 : 65536;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    f5 = f3;
                } else {
                    f5 = f3;
                    if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.rl(f5) ? 1048576 : 524288;
                    }
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                    f6 = f4;
                } else {
                    f6 = f4;
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.rl(f6) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 256) == 0) {
                    i12 = (i2 & 100663296) == 0 ? composerKN.p5(this) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432 : 100663296;
                    if ((38347923 & i5) == 38347922 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                SliderColors sliderColorsXMQ = xMQ(composerKN, (i5 >> 24) & 14);
                                i5 &= -7169;
                                sliderColors2 = sliderColorsXMQ;
                            }
                            if ((i3 & 16) != 0) {
                                boolean z9 = ((((i5 & 7168) ^ 3072) > 2048 && composerKN.p5(sliderColors2)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                                Object objIF2 = composerKN.iF();
                                if (z9 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$9$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            n(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(DrawScope drawScope, long j2) {
                                            SliderDefaults sliderDefaults = SliderDefaults.f27553n;
                                            sliderDefaults.mUb(drawScope, j2, sliderDefaults.HI(), sliderColors2.t(z3, true));
                                        }
                                    };
                                    composerKN.o(objIF2);
                                }
                                i5 &= -57345;
                                function22 = (Function2) objIF2;
                            }
                            if (i8 != 0) {
                                function32 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$10
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        n(drawScope, offset.getPackedValue(), color.getValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(DrawScope drawScope, long j2, long j3) {
                                        SliderDefaults sliderDefaults = SliderDefaults.f27553n;
                                        sliderDefaults.mUb(drawScope, j2, sliderDefaults.ty(), j3);
                                    }
                                };
                            }
                            if (i9 != 0) {
                                f5 = SliderKt.f27628O;
                            }
                            if (i10 != 0) {
                                f6 = SliderKt.J2;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                        }
                        i11 = i5;
                        Modifier modifier4 = modifier2;
                        SliderColors sliderColors5 = sliderColors2;
                        float f9 = f5;
                        boolean z10 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-541824132, i11, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1236)");
                        }
                        final long jT2 = sliderColors5.t(z10, false);
                        final long jT3 = sliderColors5.t(z10, true);
                        float f10 = f6;
                        Function2 function24 = function22;
                        final long jRl = sliderColors5.rl(z10, false);
                        final long jRl2 = sliderColors5.rl(z10, true);
                        Modifier modifierN = RotateKt.n(androidx.compose.foundation.layout.SizeKt.xMQ(androidx.compose.foundation.layout.SizeKt.KN(modifier4, 0.0f, 1, null), SliderKt.WPU()), composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t ? 180.0f : 0.0f);
                        boolean zE2 = ((i11 & 3670016) != 1048576) | composerKN.E2(rangeSliderState) | composerKN.nr(jT2) | composerKN.nr(jT3) | composerKN.nr(jRl) | composerKN.nr(jRl2) | ((29360128 & i11) != 8388608);
                        if (((57344 & i11) ^ 24576) <= 16384) {
                            function23 = function24;
                            if (composerKN.p5(function23)) {
                                z4 = true;
                                z5 = zE2 | z4 | ((458752 & i11) == 131072);
                                objIF = composerKN.iF();
                                if (z5 || objIF == Composer.INSTANCE.n()) {
                                    composer2 = composerKN;
                                    sliderColors3 = sliderColors5;
                                    f7 = f9;
                                    function22 = function23;
                                    f6 = f10;
                                    z6 = z10;
                                    Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
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
                                            SliderDefaults.f27553n.gh(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.J2(), rangeSliderState.O(), jT2, jT3, jRl, jRl2, drawScope.bzg(rangeSliderState.XQ()), drawScope.bzg(rangeSliderState.Ik()), drawScope.bzg(rangeSliderState.KN()), f7, f6, function22, function32, true);
                                        }
                                    };
                                    composer2.o(function1);
                                    objIF = function1;
                                } else {
                                    f7 = f9;
                                    f6 = f10;
                                    function22 = function23;
                                    z6 = z10;
                                    composer2 = composerKN;
                                    sliderColors3 = sliderColors5;
                                }
                                CanvasKt.rl(modifierN, (Function1) objIF, composer2, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                f8 = f7;
                                z7 = z6;
                                sliderColors4 = sliderColors3;
                                modifier3 = modifier4;
                            }
                        } else {
                            function23 = function24;
                        }
                        if ((i11 & 24576) == 16384) {
                            z4 = false;
                        }
                        z5 = zE2 | z4 | ((458752 & i11) == 131072);
                        objIF = composerKN.iF();
                        if (z5) {
                            composer2 = composerKN;
                            sliderColors3 = sliderColors5;
                            f7 = f9;
                            function22 = function23;
                            f6 = f10;
                            z6 = z10;
                            Function1<DrawScope, Unit> function12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
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
                                    SliderDefaults.f27553n.gh(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.J2(), rangeSliderState.O(), jT2, jT3, jRl, jRl2, drawScope.bzg(rangeSliderState.XQ()), drawScope.bzg(rangeSliderState.Ik()), drawScope.bzg(rangeSliderState.KN()), f7, f6, function22, function32, true);
                                }
                            };
                            composer2.o(function12);
                            objIF = function12;
                            CanvasKt.rl(modifierN, (Function1) objIF, composer2, 0);
                            if (ComposerKt.v()) {
                            }
                            f8 = f7;
                            z7 = z6;
                            sliderColors4 = sliderColors3;
                            modifier3 = modifier4;
                        }
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                        f8 = f5;
                        z7 = z3;
                    }
                    final float f11 = f6;
                    final Function2 function25 = function22;
                    final Function3 function33 = function32;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$12
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
                                this.f27584n.O(rangeSliderState, modifier3, z7, sliderColors4, function25, function33, f8, f11, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= i12;
                if ((38347923 & i5) == 38347922) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        i11 = i5;
                        Modifier modifier42 = modifier2;
                        SliderColors sliderColors52 = sliderColors2;
                        float f92 = f5;
                        boolean z102 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        final long jT22 = sliderColors52.t(z102, false);
                        final long jT32 = sliderColors52.t(z102, true);
                        float f102 = f6;
                        Function2 function242 = function22;
                        final long jRl3 = sliderColors52.rl(z102, false);
                        final long jRl22 = sliderColors52.rl(z102, true);
                        Modifier modifierN2 = RotateKt.n(androidx.compose.foundation.layout.SizeKt.xMQ(androidx.compose.foundation.layout.SizeKt.KN(modifier42, 0.0f, 1, null), SliderKt.WPU()), composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t ? 180.0f : 0.0f);
                        boolean zE22 = ((i11 & 3670016) != 1048576) | composerKN.E2(rangeSliderState) | composerKN.nr(jT22) | composerKN.nr(jT32) | composerKN.nr(jRl3) | composerKN.nr(jRl22) | ((29360128 & i11) != 8388608);
                        if (((57344 & i11) ^ 24576) <= 16384) {
                        }
                        if ((i11 & 24576) == 16384) {
                        }
                        z5 = zE22 | z4 | ((458752 & i11) == 131072);
                        objIF = composerKN.iF();
                        if (z5) {
                        }
                    }
                }
                final float f112 = f6;
                final Function2 function252 = function22;
                final Function3 function332 = function32;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            i5 |= i12;
            if ((38347923 & i5) == 38347922) {
            }
            final float f1122 = f6;
            final Function2 function2522 = function22;
            final Function3 function3322 = function32;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i5 |= i12;
        if ((38347923 & i5) == 38347922) {
        }
        final float f11222 = f6;
        final Function2 function25222 = function22;
        final Function3 function33222 = function32;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public final SliderColors az(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderTokens sliderTokens = SliderTokens.f29892n;
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.Uo(colorScheme, sliderTokens.xMQ()), ColorSchemeKt.Uo(colorScheme, sliderTokens.rl()), ColorSchemeKt.Uo(colorScheme, sliderTokens.az()), ColorSchemeKt.Uo(colorScheme, sliderTokens.az()), ColorSchemeKt.Uo(colorScheme, sliderTokens.rl()), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, sliderTokens.O()), sliderTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.az(ColorSchemeKt.Uo(colorScheme, sliderTokens.t()), sliderTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, sliderTokens.Uo()), sliderTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, sliderTokens.Uo()), sliderTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, sliderTokens.t()), sliderTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.UF(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z2, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i7;
        boolean z3;
        int i8;
        long j3;
        long j4;
        Object objIF;
        Composer.Companion companion;
        SnapshotStateList snapshotStateList;
        boolean z4;
        Object objIF2;
        int i9;
        long jJ2;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-290277409);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(mutableInteractionSource) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i11 = composerKN.p5(sliderColors2) ? 256 : 128;
                    i5 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 |= i11;
            } else {
                sliderColors2 = sliderColors;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        j3 = j2;
                        i5 |= composerKN.nr(j3) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i5 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i5 |= composerKN.p5(this) ? 131072 : 65536;
                    }
                    if ((i5 & 74899) == 74898 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                SliderColors sliderColorsXMQ = xMQ(composerKN, (i5 >> 15) & 14);
                                i5 &= -897;
                                sliderColors2 = sliderColorsXMQ;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if (i8 == 0) {
                                j4 = SliderKt.nr;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-290277409, i5, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                            }
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                                objIF = SnapshotStateKt.J2();
                                composerKN.o(objIF);
                            }
                            snapshotStateList = (SnapshotStateList) objIF;
                            int i12 = i5 & 14;
                            z4 = i12 == 4;
                            objIF2 = composerKN.iF();
                            if (z4 || objIF2 == companion.n()) {
                                objIF2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                                composerKN.o(objIF2);
                            }
                            EffectsKt.O(mutableInteractionSource, (Function2) objIF2, composerKN, i12);
                            if (snapshotStateList.isEmpty()) {
                                i9 = 2;
                                jJ2 = DpSize.J2(j4, Dp.KN(DpSize.mUb(j4) / 2), 0.0f, 2, null);
                            } else {
                                i9 = 2;
                                jJ2 = j4;
                            }
                            SpacerKt.n(BackgroundKt.t(HoverableKt.rl(androidx.compose.foundation.layout.SizeKt.XQ(modifier2, jJ2), mutableInteractionSource, false, i9, null), sliderColors2.n(z3), ShapesKt.O(SliderTokens.f29892n.gh(), composerKN, 6)), composerKN, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            j5 = j4;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                        }
                        j4 = j3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                        }
                        snapshotStateList = (SnapshotStateList) objIF;
                        int i122 = i5 & 14;
                        if (i122 == 4) {
                        }
                        objIF2 = composerKN.iF();
                        if (z4) {
                            objIF2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                            composerKN.o(objIF2);
                            EffectsKt.O(mutableInteractionSource, (Function2) objIF2, composerKN, i122);
                            if (snapshotStateList.isEmpty()) {
                            }
                            SpacerKt.n(BackgroundKt.t(HoverableKt.rl(androidx.compose.foundation.layout.SizeKt.XQ(modifier2, jJ2), mutableInteractionSource, false, i9, null), sliderColors2.n(z3), ShapesKt.O(SliderTokens.f29892n.gh(), composerKN, 6)), composerKN, 0);
                            if (ComposerKt.v()) {
                            }
                            j5 = j4;
                        }
                    } else {
                        composerKN.wTp();
                        j5 = j3;
                    }
                    final SliderColors sliderColors3 = sliderColors2;
                    final boolean z5 = z3;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        final Modifier modifier3 = modifier2;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
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
                                this.f27562n.n(mutableInteractionSource, modifier3, sliderColors3, z5, j5, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                j3 = j2;
                if ((i3 & 32) == 0) {
                }
                if ((i5 & 74899) == 74898) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                            j4 = j3;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                        }
                        snapshotStateList = (SnapshotStateList) objIF;
                        int i1222 = i5 & 14;
                        if (i1222 == 4) {
                        }
                        objIF2 = composerKN.iF();
                        if (z4) {
                        }
                    }
                }
                final SliderColors sliderColors32 = sliderColors2;
                final boolean z52 = z3;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            j3 = j2;
            if ((i3 & 32) == 0) {
            }
            if ((i5 & 74899) == 74898) {
            }
            final SliderColors sliderColors322 = sliderColors2;
            final boolean z522 = z3;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        j3 = j2;
        if ((i3 & 32) == 0) {
        }
        if ((i5 & 74899) == 74898) {
        }
        final SliderColors sliderColors3222 = sliderColors2;
        final boolean z5222 = z3;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void nr(final SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i7;
        boolean z3;
        Modifier modifier3;
        SliderColors sliderColorsXMQ;
        int i8;
        boolean z4;
        final SliderColors sliderColors3;
        final boolean z5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(593554206);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(sliderState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i10 = composerKN.p5(sliderColors2) ? 256 : 128;
                    i5 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 |= i10;
            } else {
                sliderColors2 = sliderColors;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerKN.p5(this) ? 16384 : 8192;
                }
                if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    sliderColors3 = sliderColors2;
                    z5 = z3;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) == 0) {
                            sliderColorsXMQ = xMQ(composerKN, (i5 >> 12) & 14);
                            i5 &= -897;
                        } else {
                            sliderColorsXMQ = sliderColors2;
                        }
                        if (i7 == 0) {
                            i8 = i5;
                            z4 = true;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(593554206, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1081)");
                        }
                        Modifier modifier5 = modifier3;
                        sliderColors3 = sliderColorsXMQ;
                        J2(sliderState, modifier5, z4, sliderColors3, null, null, SliderKt.f27628O, SliderKt.J2, composerKN, (i8 & 14) | 14155776 | (i8 & 112) | ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | ((i8 << 12) & 234881024), 48);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        z5 = z4;
                        modifier4 = modifier5;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        modifier3 = modifier2;
                        sliderColorsXMQ = sliderColors2;
                    }
                    i8 = i5;
                    z4 = z3;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Modifier modifier52 = modifier3;
                    sliderColors3 = sliderColorsXMQ;
                    J2(sliderState, modifier52, z4, sliderColors3, null, null, SliderKt.f27628O, SliderKt.J2, composerKN, (i8 & 14) | 14155776 | (i8 & 112) | ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | ((i8 << 12) & 234881024), 48);
                    if (ComposerKt.v()) {
                    }
                    z5 = z4;
                    modifier4 = modifier52;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i11) {
                            this.f27596n.nr(sliderState, modifier4, sliderColors3, z5, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            z3 = z2;
            if ((i3 & 16) != 0) {
            }
            if ((i5 & 9363) == 9362) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 4) == 0) {
                    }
                    if (i7 == 0) {
                        i8 = i5;
                        z4 = z3;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Modifier modifier522 = modifier3;
                    sliderColors3 = sliderColorsXMQ;
                    J2(sliderState, modifier522, z4, sliderColors3, null, null, SliderKt.f27628O, SliderKt.J2, composerKN, (i8 & 14) | 14155776 | (i8 & 112) | ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | ((i8 << 12) & 234881024), 48);
                    if (ComposerKt.v()) {
                    }
                    z5 = z4;
                    modifier4 = modifier522;
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
        z3 = z2;
        if ((i3 & 16) != 0) {
        }
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void rl(final RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i7;
        boolean z3;
        Modifier modifier3;
        SliderColors sliderColorsXMQ;
        int i8;
        boolean z4;
        final SliderColors sliderColors3;
        final boolean z5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1617869097);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(rangeSliderState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i10 = composerKN.p5(sliderColors2) ? 256 : 128;
                    i5 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 |= i10;
            } else {
                sliderColors2 = sliderColors;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerKN.p5(this) ? 16384 : 8192;
                }
                if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    sliderColors3 = sliderColors2;
                    z5 = z3;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) == 0) {
                            sliderColorsXMQ = xMQ(composerKN, (i5 >> 12) & 14);
                            i5 &= -897;
                        } else {
                            sliderColorsXMQ = sliderColors2;
                        }
                        if (i7 == 0) {
                            i8 = i5;
                            z4 = true;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1617869097, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1189)");
                        }
                        Modifier modifier5 = modifier3;
                        sliderColors3 = sliderColorsXMQ;
                        O(rangeSliderState, modifier5, z4, sliderColors3, null, null, SliderKt.f27628O, SliderKt.J2, composerKN, (i8 & 14) | 14155776 | (i8 & 112) | ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | ((i8 << 12) & 234881024), 48);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        z5 = z4;
                        modifier4 = modifier5;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        modifier3 = modifier2;
                        sliderColorsXMQ = sliderColors2;
                    }
                    i8 = i5;
                    z4 = z3;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Modifier modifier52 = modifier3;
                    sliderColors3 = sliderColorsXMQ;
                    O(rangeSliderState, modifier52, z4, sliderColors3, null, null, SliderKt.f27628O, SliderKt.J2, composerKN, (i8 & 14) | 14155776 | (i8 & 112) | ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | ((i8 << 12) & 234881024), 48);
                    if (ComposerKt.v()) {
                    }
                    z5 = z4;
                    modifier4 = modifier52;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i11) {
                            this.f27622n.rl(rangeSliderState, modifier4, sliderColors3, z5, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            z3 = z2;
            if ((i3 & 16) != 0) {
            }
            if ((i5 & 9363) == 9362) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 4) == 0) {
                    }
                    if (i7 == 0) {
                        i8 = i5;
                        z4 = z3;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Modifier modifier522 = modifier3;
                    sliderColors3 = sliderColorsXMQ;
                    O(rangeSliderState, modifier522, z4, sliderColors3, null, null, SliderKt.f27628O, SliderKt.J2, composerKN, (i8 & 14) | 14155776 | (i8 & 112) | ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | ((i8 << 12) & 234881024), 48);
                    if (ComposerKt.v()) {
                    }
                    z5 = z4;
                    modifier4 = modifier522;
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
        z3 = z2;
        if ((i3 & 16) != 0) {
        }
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(final SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z2, Composer composer, final int i2, final int i3) {
        final SliderPositions sliderPositions2;
        int i5;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i7;
        boolean z3;
        Modifier modifier3;
        int i8;
        SliderColors sliderColors3;
        boolean z4;
        final long jT2;
        final long jT3;
        final long jRl;
        final long jRl2;
        boolean zNr;
        Object objIF;
        boolean z5;
        final SliderColors sliderColors4;
        final boolean z6;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1546713545);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            sliderPositions2 = sliderPositions;
        } else {
            sliderPositions2 = sliderPositions;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(sliderPositions2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i10 = composerKN.p5(sliderColors2) ? 256 : 128;
                    i5 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 |= i10;
            } else {
                sliderColors2 = sliderColors;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerKN.p5(this) ? 16384 : 8192;
                }
                if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    sliderColors4 = sliderColors2;
                    z6 = z3;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) != 0) {
                            SliderColors sliderColorsXMQ = xMQ(composerKN, (i5 >> 12) & 14);
                            i5 &= -897;
                            sliderColors2 = sliderColorsXMQ;
                        }
                        SliderColors sliderColors5 = sliderColors2;
                        i8 = i5;
                        sliderColors3 = sliderColors5;
                        if (i7 == 0) {
                            z4 = true;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1546713545, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:999)");
                        }
                        int i11 = i8;
                        jT2 = sliderColors3.t(z4, false);
                        jT3 = sliderColors3.t(z4, true);
                        Modifier modifier5 = modifier3;
                        jRl = sliderColors3.rl(z4, false);
                        jRl2 = sliderColors3.rl(z4, true);
                        SliderColors sliderColors6 = sliderColors3;
                        Modifier modifierXMQ = androidx.compose.foundation.layout.SizeKt.xMQ(androidx.compose.foundation.layout.SizeKt.KN(modifier5, 0.0f, 1, null), SliderKt.WPU());
                        zNr = ((i11 & 14) == 4) | composerKN.nr(jT2) | composerKN.nr(jT3) | composerKN.nr(jRl) | composerKN.nr(jRl2);
                        objIF = composerKN.iF();
                        if (zNr || objIF == Composer.INSTANCE.n()) {
                            z5 = z4;
                            Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    n(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void n(DrawScope drawScope) {
                                    long j2;
                                    long j3;
                                    boolean z7 = drawScope.getLayoutDirection() == LayoutDirection.f34161t;
                                    long jN = OffsetKt.n(0.0f, Offset.ty(drawScope.Co()));
                                    long jN2 = OffsetKt.n(Size.gh(drawScope.t()), Offset.ty(drawScope.Co()));
                                    long j4 = jN;
                                    long j5 = z7 ? jN2 : j4;
                                    if (!z7) {
                                        j4 = jN2;
                                    }
                                    float fL = drawScope.l(SliderDefaults.f27553n.ty());
                                    float fL2 = drawScope.l(SliderKt.WPU());
                                    long j6 = jT2;
                                    StrokeCap.Companion companion = StrokeCap.INSTANCE;
                                    DrawScope.mI(drawScope, j6, j5, j4, fL2, companion.rl(), null, 0.0f, null, 0, 480, null);
                                    long j7 = j5;
                                    long j9 = j4;
                                    DrawScope.mI(drawScope, jT3, OffsetKt.n(Offset.az(j5) + ((Offset.az(j4) - Offset.az(j5)) * ((Number) sliderPositions2.n().getStart()).floatValue()), Offset.ty(drawScope.Co())), OffsetKt.n(Offset.az(j5) + ((Offset.az(j4) - Offset.az(j5)) * ((Number) sliderPositions2.n().getEndInclusive()).floatValue()), Offset.ty(drawScope.Co())), fL2, companion.rl(), null, 0.0f, null, 0, 480, null);
                                    float[] fArrRl = sliderPositions2.rl();
                                    SliderPositions sliderPositions3 = sliderPositions2;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    int length = fArrRl.length;
                                    for (int i12 = 0; i12 < length; i12++) {
                                        float f3 = fArrRl[i12];
                                        Boolean boolValueOf = Boolean.valueOf(f3 > ((Number) sliderPositions3.n().getEndInclusive()).floatValue() || f3 < ((Number) sliderPositions3.n().getStart()).floatValue());
                                        Object arrayList = linkedHashMap.get(boolValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            linkedHashMap.put(boolValueOf, arrayList);
                                        }
                                        ((List) arrayList).add(Float.valueOf(f3));
                                    }
                                    long j10 = jRl;
                                    long j11 = jRl2;
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                        List list = (List) entry.getValue();
                                        long j12 = j11;
                                        ArrayList arrayList2 = new ArrayList(list.size());
                                        int size = list.size();
                                        for (int i13 = 0; i13 < size; i13++) {
                                            arrayList2.add(Offset.nr(OffsetKt.n(Offset.az(OffsetKt.rl(j7, j9, ((Number) list.get(i13)).floatValue())), Offset.ty(drawScope.Co()))));
                                        }
                                        long j13 = j7;
                                        long j14 = j9;
                                        int iRl = PointMode.INSTANCE.rl();
                                        if (zBooleanValue) {
                                            j3 = j12;
                                            j2 = j10;
                                        } else {
                                            j2 = j12;
                                            j3 = j2;
                                        }
                                        DrawScope.Fp(drawScope, arrayList2, iRl, j2, fL, StrokeCap.INSTANCE.rl(), null, 0.0f, null, 0, 480, null);
                                        j9 = j14;
                                        j11 = j3;
                                        j7 = j13;
                                    }
                                }
                            };
                            composerKN.o(function1);
                            objIF = function1;
                        } else {
                            z5 = z4;
                        }
                        CanvasKt.rl(modifierXMQ, (Function1) objIF, composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        sliderColors4 = sliderColors6;
                        z6 = z5;
                        modifier4 = modifier5;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        SliderColors sliderColors7 = sliderColors2;
                        i8 = i5;
                        sliderColors3 = sliderColors7;
                        modifier3 = modifier2;
                    }
                    z4 = z3;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    int i112 = i8;
                    jT2 = sliderColors3.t(z4, false);
                    jT3 = sliderColors3.t(z4, true);
                    Modifier modifier52 = modifier3;
                    jRl = sliderColors3.rl(z4, false);
                    jRl2 = sliderColors3.rl(z4, true);
                    SliderColors sliderColors62 = sliderColors3;
                    Modifier modifierXMQ2 = androidx.compose.foundation.layout.SizeKt.xMQ(androidx.compose.foundation.layout.SizeKt.KN(modifier52, 0.0f, 1, null), SliderKt.WPU());
                    zNr = ((i112 & 14) == 4) | composerKN.nr(jT2) | composerKN.nr(jT3) | composerKN.nr(jRl) | composerKN.nr(jRl2);
                    objIF = composerKN.iF();
                    if (zNr) {
                        z5 = z4;
                        Function1<DrawScope, Unit> function12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                n(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void n(DrawScope drawScope) {
                                long j2;
                                long j3;
                                boolean z7 = drawScope.getLayoutDirection() == LayoutDirection.f34161t;
                                long jN = OffsetKt.n(0.0f, Offset.ty(drawScope.Co()));
                                long jN2 = OffsetKt.n(Size.gh(drawScope.t()), Offset.ty(drawScope.Co()));
                                long j4 = jN;
                                long j5 = z7 ? jN2 : j4;
                                if (!z7) {
                                    j4 = jN2;
                                }
                                float fL = drawScope.l(SliderDefaults.f27553n.ty());
                                float fL2 = drawScope.l(SliderKt.WPU());
                                long j6 = jT2;
                                StrokeCap.Companion companion = StrokeCap.INSTANCE;
                                DrawScope.mI(drawScope, j6, j5, j4, fL2, companion.rl(), null, 0.0f, null, 0, 480, null);
                                long j7 = j5;
                                long j9 = j4;
                                DrawScope.mI(drawScope, jT3, OffsetKt.n(Offset.az(j5) + ((Offset.az(j4) - Offset.az(j5)) * ((Number) sliderPositions2.n().getStart()).floatValue()), Offset.ty(drawScope.Co())), OffsetKt.n(Offset.az(j5) + ((Offset.az(j4) - Offset.az(j5)) * ((Number) sliderPositions2.n().getEndInclusive()).floatValue()), Offset.ty(drawScope.Co())), fL2, companion.rl(), null, 0.0f, null, 0, 480, null);
                                float[] fArrRl = sliderPositions2.rl();
                                SliderPositions sliderPositions3 = sliderPositions2;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                int length = fArrRl.length;
                                for (int i12 = 0; i12 < length; i12++) {
                                    float f3 = fArrRl[i12];
                                    Boolean boolValueOf = Boolean.valueOf(f3 > ((Number) sliderPositions3.n().getEndInclusive()).floatValue() || f3 < ((Number) sliderPositions3.n().getStart()).floatValue());
                                    Object arrayList = linkedHashMap.get(boolValueOf);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        linkedHashMap.put(boolValueOf, arrayList);
                                    }
                                    ((List) arrayList).add(Float.valueOf(f3));
                                }
                                long j10 = jRl;
                                long j11 = jRl2;
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                    List list = (List) entry.getValue();
                                    long j12 = j11;
                                    ArrayList arrayList2 = new ArrayList(list.size());
                                    int size = list.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        arrayList2.add(Offset.nr(OffsetKt.n(Offset.az(OffsetKt.rl(j7, j9, ((Number) list.get(i13)).floatValue())), Offset.ty(drawScope.Co()))));
                                    }
                                    long j13 = j7;
                                    long j14 = j9;
                                    int iRl = PointMode.INSTANCE.rl();
                                    if (zBooleanValue) {
                                        j3 = j12;
                                        j2 = j10;
                                    } else {
                                        j2 = j12;
                                        j3 = j2;
                                    }
                                    DrawScope.Fp(drawScope, arrayList2, iRl, j2, fL, StrokeCap.INSTANCE.rl(), null, 0.0f, null, 0, 480, null);
                                    j9 = j14;
                                    j11 = j3;
                                    j7 = j13;
                                }
                            }
                        };
                        composerKN.o(function12);
                        objIF = function12;
                        CanvasKt.rl(modifierXMQ2, (Function1) objIF, composerKN, 0);
                        if (ComposerKt.v()) {
                        }
                        sliderColors4 = sliderColors62;
                        z6 = z5;
                        modifier4 = modifier52;
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$2
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
                            this.f27590n.t(sliderPositions, modifier4, sliderColors4, z6, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            z3 = z2;
            if ((i3 & 16) != 0) {
            }
            if ((i5 & 9363) == 9362) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    SliderColors sliderColors52 = sliderColors2;
                    i8 = i5;
                    sliderColors3 = sliderColors52;
                    if (i7 == 0) {
                        z4 = z3;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    int i1122 = i8;
                    jT2 = sliderColors3.t(z4, false);
                    jT3 = sliderColors3.t(z4, true);
                    Modifier modifier522 = modifier3;
                    jRl = sliderColors3.rl(z4, false);
                    jRl2 = sliderColors3.rl(z4, true);
                    SliderColors sliderColors622 = sliderColors3;
                    Modifier modifierXMQ22 = androidx.compose.foundation.layout.SizeKt.xMQ(androidx.compose.foundation.layout.SizeKt.KN(modifier522, 0.0f, 1, null), SliderKt.WPU());
                    zNr = ((i1122 & 14) == 4) | composerKN.nr(jT2) | composerKN.nr(jT3) | composerKN.nr(jRl) | composerKN.nr(jRl2);
                    objIF = composerKN.iF();
                    if (zNr) {
                    }
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
        z3 = z2;
        if ((i3 & 16) != 0) {
        }
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public final float ty() {
        return TickSize;
    }

    private SliderDefaults() {
    }

    public final SliderColors xMQ(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1376295968, i2, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors sliderColorsAz = az(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return sliderColorsAz;
    }
}
