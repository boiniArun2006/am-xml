package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u008c\u0001\u0010\u0012\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0084\u0001\u0010\u0014\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aj\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001ab\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001av\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001an\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a3\u0010(\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0'2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b(\u0010)\u001aj\u0010+\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u0014\u0010.\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010-\"\u0014\u0010/\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-\"\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100\"\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00100\"\u0014\u00103\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-\"\u0014\u00104\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-\"\u0014\u00106\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "O", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "Uo", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", AppLovinEventTypes.USER_VIEWED_CONTENT, "J2", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "nr", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "rl", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "t", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "controlPointX", "verticalOffset", "radius", "Lkotlin/Pair;", "HI", "(FFF)Lkotlin/Pair;", "shape", c.f62177j, "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "F", "AppBarHeight", "AppBarHorizontalPadding", "Landroidx/compose/ui/Modifier;", "TitleInsetWithoutIcon", "TitleIconModifier", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "Landroidx/compose/foundation/layout/WindowInsets;", "ZeroInsets", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,741:1\n590#1:744\n590#1:745\n590#1:746\n590#1:747\n590#1:748\n590#1:749\n75#2:742\n75#2:743\n149#3:750\n149#3:751\n149#3:752\n149#3:754\n149#3:756\n149#3:757\n149#3:758\n57#4:753\n57#4:755\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n615#1:744\n647#1:745\n648#1:746\n650#1:747\n657#1:748\n658#1:749\n343#1:742\n413#1:743\n727#1:750\n729#1:751\n731#1:752\n733#1:754\n736#1:756\n738#1:757\n740#1:758\n731#1:753\n733#1:755\n*E\n"})
public final class AppBarKt {
    private static final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f21184O;
    private static final WindowInsets Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f21185n = Dp.KN(56);
    private static final Modifier nr;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Modifier f21186t;

    static {
        float f3 = 4;
        float fKN = Dp.KN(f3);
        rl = fKN;
        Modifier.Companion companion = Modifier.INSTANCE;
        f21186t = SizeKt.ViF(companion, Dp.KN(Dp.KN(16) - fKN));
        nr = SizeKt.ViF(SizeKt.nr(companion, 0.0f, 1, null), Dp.KN(Dp.KN(72) - fKN));
        f21184O = Dp.KN(8);
        J2 = Dp.KN(f3);
        Uo = WindowInsetsKt.t(Dp.KN(0), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final Pair HI(float f3, float f4, float f5) {
        Float fValueOf;
        Float fValueOf2;
        Pair pair;
        Float fValueOf3;
        Float fValueOf4;
        float f6 = f4 * f4;
        float f7 = f5 * f5;
        float f8 = (f3 * f3) + f6;
        float f9 = f6 * f7 * (f8 - f7);
        float f10 = f3 * f7;
        double d2 = f9;
        float fSqrt = (f10 - ((float) Math.sqrt(d2))) / f8;
        float fSqrt2 = (f10 + ((float) Math.sqrt(d2))) / f8;
        float fSqrt3 = (float) Math.sqrt(f7 - (fSqrt * fSqrt));
        float fSqrt4 = (float) Math.sqrt(f7 - (fSqrt2 * fSqrt2));
        if (f4 > 0.0f) {
            if (fSqrt3 > fSqrt4) {
                fValueOf3 = Float.valueOf(fSqrt);
                fValueOf4 = Float.valueOf(fSqrt3);
            } else {
                fValueOf3 = Float.valueOf(fSqrt2);
                fValueOf4 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf3, fValueOf4);
        } else {
            if (fSqrt3 < fSqrt4) {
                fValueOf = Float.valueOf(fSqrt);
                fValueOf2 = Float.valueOf(fSqrt3);
            } else {
                fValueOf = Float.valueOf(fSqrt2);
                fValueOf2 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf, fValueOf2);
        }
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        if (fFloatValue < f3) {
            fFloatValue2 = -fFloatValue2;
        }
        return TuplesKt.to(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final WindowInsets windowInsets, Modifier modifier, long j2, long j3, float f3, PaddingValues paddingValues, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        long jJ2;
        long jRl;
        int i7;
        float fT;
        int i8;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final long j4;
        final long j5;
        final float f4;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeGh;
        PaddingValues paddingValuesRl;
        Modifier modifier4;
        long j6;
        float f5;
        long j7;
        Composer composerKN = composer.KN(883764366);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(windowInsets) ? 4 : 2) | i2;
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
                    jJ2 = j2;
                    int i10 = composerKN.nr(jJ2) ? 256 : 128;
                    i5 |= i10;
                } else {
                    jJ2 = j2;
                }
                i5 |= i10;
            } else {
                jJ2 = j2;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    jRl = j3;
                    int i11 = composerKN.nr(jRl) ? 2048 : 1024;
                    i5 |= i11;
                } else {
                    jRl = j3;
                }
                i5 |= i11;
            } else {
                jRl = j3;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    fT = f3;
                    i5 |= composerKN.rl(fT) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        paddingValues2 = paddingValues;
                        i5 |= composerKN.p5(paddingValues2) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function3) ? 1048576 : 524288;
                        }
                        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                                    i5 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    jRl = ColorsKt.rl(jJ2, composerKN, (i5 >> 6) & 14);
                                    i5 &= -7169;
                                }
                                if (i7 != 0) {
                                    fT = AppBarDefaults.f21182n.t();
                                }
                                if (i8 != 0) {
                                    paddingValuesRl = AppBarDefaults.f21182n.rl();
                                    modifier4 = modifier2;
                                    j6 = jRl;
                                    f5 = fT;
                                    j7 = jJ2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(883764366, i5, -1, "androidx.compose.material.TopAppBar (AppBar.kt:224)");
                                }
                                int i12 = i5 >> 6;
                                int i13 = i5 << 15;
                                composer2 = composerKN;
                                n(j7, j6, f5, paddingValuesRl, RectangleShapeKt.n(), windowInsets, modifier4, function3, composer2, (i12 & 7168) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (458752 & i13) | (i13 & 3670016) | ((i5 << 3) & 29360128), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                j4 = j7;
                                j5 = j6;
                                f4 = f5;
                                paddingValues3 = paddingValuesRl;
                                modifier3 = modifier4;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 4) != 0) {
                                    i5 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                }
                            }
                            modifier4 = modifier2;
                            f5 = fT;
                            paddingValuesRl = paddingValues2;
                            j7 = jJ2;
                            j6 = jRl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i122 = i5 >> 6;
                            int i132 = i5 << 15;
                            composer2 = composerKN;
                            n(j7, j6, f5, paddingValuesRl, RectangleShapeKt.n(), windowInsets, modifier4, function3, composer2, (i122 & 7168) | (i122 & 14) | 24576 | (i122 & 112) | (i122 & 896) | (458752 & i132) | (i132 & 3670016) | ((i5 << 3) & 29360128), 0);
                            if (ComposerKt.v()) {
                            }
                            j4 = j7;
                            j5 = j6;
                            f4 = f5;
                            paddingValues3 = paddingValuesRl;
                            modifier3 = modifier4;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier3 = modifier2;
                            j4 = jJ2;
                            j5 = jRl;
                            f4 = fT;
                            paddingValues3 = paddingValues2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i14) {
                                    AppBarKt.J2(windowInsets, modifier3, j4, j5, f4, paddingValues3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                paddingValues2 = paddingValues;
                if ((i3 & 64) != 0) {
                }
                if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            fT = f3;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            paddingValues2 = paddingValues;
            if ((i3 & 64) != 0) {
            }
            if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        fT = f3;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i3 & 64) != 0) {
        }
        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function2 function2, final WindowInsets windowInsets, Modifier modifier, Function2 function22, Function3 function3, long j2, long j3, float f3, Composer composer, final int i2, final int i3) {
        int i5;
        WindowInsets windowInsets2;
        int i7;
        Modifier modifier2;
        int i8;
        final Function2 function23;
        int i9;
        final Function3 function3N;
        long jJ2;
        int i10;
        int i11;
        Composer composer2;
        final Modifier modifier3;
        final Function2 function24;
        final Function3 function32;
        final long j4;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i12;
        long jRl;
        Modifier modifier4;
        long j5;
        float fT;
        Composer composerKN = composer.KN(-763778507);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                windowInsets2 = windowInsets;
                i5 |= composerKN.p5(windowInsets2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function23 = function22;
                        i5 |= composerKN.E2(function23) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            function3N = function3;
                            i5 |= composerKN.E2(function3N) ? 16384 : 8192;
                        }
                        if ((196608 & i2) == 0) {
                            if ((i3 & 32) == 0) {
                                jJ2 = j2;
                                int i13 = composerKN.nr(jJ2) ? 131072 : 65536;
                                i5 |= i13;
                            } else {
                                jJ2 = j2;
                            }
                            i5 |= i13;
                        } else {
                            jJ2 = j2;
                        }
                        if ((1572864 & i2) == 0) {
                            i5 |= ((i3 & 64) == 0 && composerKN.nr(j3)) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.rl(f3) ? 8388608 : 4194304;
                        }
                        i11 = i5;
                        if (composerKN.HI((4793491 & i5) != 4793490, i11 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i8 != 0) {
                                    function23 = null;
                                }
                                if (i9 != 0) {
                                    function3N = ComposableSingletons$AppBarKt.f21717n.n();
                                }
                                if ((i3 & 32) != 0) {
                                    jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                                    i12 = i11 & (-458753);
                                } else {
                                    i12 = i11;
                                }
                                if ((i3 & 64) != 0) {
                                    jRl = ColorsKt.rl(jJ2, composerKN, (i12 >> 15) & 14);
                                    i12 &= -3670017;
                                } else {
                                    jRl = j3;
                                }
                                if (i10 != 0) {
                                    modifier4 = modifier2;
                                    j5 = jRl;
                                    fT = AppBarDefaults.f21182n.t();
                                } else {
                                    modifier4 = modifier2;
                                    j5 = jRl;
                                    fT = f3;
                                }
                            } else {
                                composerKN.wTp();
                                i12 = (i3 & 32) != 0 ? i11 & (-458753) : i11;
                                if ((i3 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                j5 = j3;
                                fT = f3;
                                modifier4 = modifier2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-763778507, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:93)");
                            }
                            int i14 = i12 >> 15;
                            int i15 = i12 << 12;
                            composer2 = composerKN;
                            n(jJ2, j5, fT, AppBarDefaults.f21182n.rl(), RectangleShapeKt.n(), windowInsets2, modifier4, ComposableLambdaKt.nr(1849684359, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public final void n(RowScope rowScope, Composer composer3, int i16) {
                                    if ((i16 & 6) == 0) {
                                        i16 |= composer3.p5(rowScope) ? 4 : 2;
                                    }
                                    if (!composer3.HI((i16 & 19) != 18, i16 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1849684359, i16, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:103)");
                                    }
                                    if (function23 == null) {
                                        composer3.eF(1108917613);
                                        SpacerKt.n(AppBarKt.f21186t, composer3, 6);
                                        composer3.Xw();
                                    } else {
                                        composer3.eF(1108983209);
                                        Modifier modifier5 = AppBarKt.nr;
                                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                        Function2 function25 = function23;
                                        MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ, composer3, 48);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifier5);
                                        ComposeUiNode.Companion companion = ComposeUiNode.te;
                                        Function0 function0N = companion.n();
                                        if (composer3.mUb() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer3.T();
                                        if (composer3.J2()) {
                                            composer3.s7N(function0N);
                                        } else {
                                            composer3.r();
                                        }
                                        Composer composerN = Updater.n(composer3);
                                        Updater.O(composerN, measurePolicyRl, companion.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                                        Function2 function2Rl = companion.rl();
                                        if (composerN.J2() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion.nr());
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                        CompositionLocalKt.rl(ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.t(composer3, 6))), function25, composer3, ProvidedValue.xMQ);
                                        composer3.XQ();
                                        composer3.Xw();
                                    }
                                    Modifier modifierRl = RowScope.rl(rowScope, SizeKt.nr(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                                    Alignment.Vertical verticalXMQ2 = Alignment.INSTANCE.xMQ();
                                    final Function2 function26 = function2;
                                    MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ2, composer3, 48);
                                    int iN2 = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierRl);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.te;
                                    Function0 function0N2 = companion2.n();
                                    if (composer3.mUb() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.J2()) {
                                        composer3.s7N(function0N2);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN2 = Updater.n(composer3);
                                    Updater.O(composerN2, measurePolicyRl2, companion2.t());
                                    Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                                    Function2 function2Rl2 = companion2.rl();
                                    if (composerN2.J2() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO2, companion2.nr());
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                                    TextKt.n(MaterialTheme.f22169n.t(composer3, 6).getH6(), ComposableLambdaKt.nr(-1654084516, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            n(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer4, int i17) {
                                            if (!composer4.HI((i17 & 3) != 2, i17 & 1)) {
                                                composer4.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1654084516, i17, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:116)");
                                            }
                                            CompositionLocalKt.rl(ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.t(composer4, 6))), function26, composer4, ProvidedValue.xMQ);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer3, 54), composer3, 48);
                                    composer3.XQ();
                                    ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.nr(composer3, 6)));
                                    final Function3 function33 = function3N;
                                    CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(2129753671, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            n(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer4, int i17) {
                                            if (!composer4.HI((i17 & 3) != 2, i17 & 1)) {
                                                composer4.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(2129753671, i17, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:124)");
                                            }
                                            Modifier modifierNr = SizeKt.nr(Modifier.INSTANCE, 0.0f, 1, null);
                                            Arrangement.Horizontal horizontalT = Arrangement.f17400n.t();
                                            Alignment.Vertical verticalXMQ3 = Alignment.INSTANCE.xMQ();
                                            Function3 function34 = function33;
                                            MeasurePolicy measurePolicyRl3 = RowKt.rl(horizontalT, verticalXMQ3, composer4, 54);
                                            int iN3 = ComposablesKt.n(composer4, 0);
                                            CompositionLocalMap compositionLocalMapIk3 = composer4.Ik();
                                            Modifier modifierO3 = ComposedModifierKt.O(composer4, modifierNr);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.te;
                                            Function0 function0N3 = companion3.n();
                                            if (composer4.mUb() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer4.T();
                                            if (composer4.J2()) {
                                                composer4.s7N(function0N3);
                                            } else {
                                                composer4.r();
                                            }
                                            Composer composerN3 = Updater.n(composer4);
                                            Updater.O(composerN3, measurePolicyRl3, companion3.t());
                                            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
                                            Function2 function2Rl3 = companion3.rl();
                                            if (composerN3.J2() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                                composerN3.o(Integer.valueOf(iN3));
                                                composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                            }
                                            Updater.O(composerN3, modifierO3, companion3.nr());
                                            function34.invoke(RowScopeInstance.f17780n, composer4, 6);
                                            composer4.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer3, 54), composer3, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    n(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composerKN, 54), composer2, (i14 & 896) | (i14 & 14) | 12610560 | (i14 & 112) | (458752 & i15) | (i15 & 3670016), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function24 = function23;
                            function32 = function3N;
                            j4 = j5;
                            f4 = fT;
                            modifier3 = modifier4;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier3 = modifier2;
                            function24 = function23;
                            function32 = function3N;
                            j4 = j3;
                            f4 = f3;
                        }
                        final long j6 = jJ2;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                                    AppBarKt.O(function2, windowInsets, modifier3, function24, function32, j6, j4, f4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    function3N = function3;
                    if ((196608 & i2) == 0) {
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i5;
                    if (composerKN.HI((4793491 & i5) != 4793490, i11 & 1)) {
                    }
                    final long j62 = jJ2;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function23 = function22;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                function3N = function3;
                if ((196608 & i2) == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i5;
                if (composerKN.HI((4793491 & i5) != 4793490, i11 & 1)) {
                }
                final long j622 = jJ2;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function23 = function22;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            function3N = function3;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i5;
            if (composerKN.HI((4793491 & i5) != 4793490, i11 & 1)) {
            }
            final long j6222 = jJ2;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        windowInsets2 = windowInsets;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function23 = function22;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        function3N = function3;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i5;
        if (composerKN.HI((4793491 & i5) != 4793490, i11 & 1)) {
        }
        final long j62222 = jJ2;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, long j2, long j3, float f3, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function24;
        int i8;
        Function3 function3Rl;
        long jJ2;
        long jRl;
        int i9;
        int i10;
        Composer composer2;
        final float f4;
        final Modifier modifier3;
        final Function2 function25;
        final Function3 function32;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i11;
        float fT;
        Composer composerKN = composer.KN(-2087748139);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
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
                    function24 = function22;
                    i5 |= composerKN.E2(function24) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        function3Rl = function3;
                        i5 |= composerKN.E2(function3Rl) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        jJ2 = j2;
                        i5 |= ((i3 & 16) == 0 && composerKN.nr(jJ2)) ? 16384 : 8192;
                    } else {
                        jJ2 = j2;
                    }
                    if ((196608 & i2) != 0) {
                        jRl = j3;
                        i5 |= ((i3 & 32) == 0 && composerKN.nr(jRl)) ? 131072 : 65536;
                    } else {
                        jRl = j3;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.rl(f3) ? 1048576 : 524288;
                    }
                    i10 = i5;
                    if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        f4 = f3;
                        modifier3 = modifier2;
                        function25 = function24;
                        function32 = function3Rl;
                        j4 = jJ2;
                        j5 = jRl;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                function24 = null;
                            }
                            if (i8 != 0) {
                                function3Rl = ComposableSingletons$AppBarKt.f21717n.rl();
                            }
                            if ((i3 & 16) != 0) {
                                jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                                i11 = i10 & (-57345);
                            } else {
                                i11 = i10;
                            }
                            if ((i3 & 32) != 0) {
                                jRl = ColorsKt.rl(jJ2, composerKN, (i11 >> 12) & 14);
                                i11 &= -458753;
                            }
                            if (i9 != 0) {
                                fT = AppBarDefaults.f21182n.t();
                            }
                            long j6 = jJ2;
                            long j7 = jRl;
                            Modifier modifier4 = modifier2;
                            Function2 function26 = function24;
                            Function3 function33 = function3Rl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-2087748139, i11, -1, "androidx.compose.material.TopAppBar (AppBar.kt:170)");
                            }
                            int i13 = (i11 & 14) | 48;
                            int i14 = i11 << 3;
                            composer2 = composerKN;
                            O(function23, Uo, modifier4, function26, function33, j6, j7, fT, composer2, i13 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            function25 = function26;
                            function32 = function33;
                            j4 = j6;
                            j5 = j7;
                            f4 = fT;
                        } else {
                            composerKN.wTp();
                            i11 = (i3 & 16) != 0 ? i10 & (-57345) : i10;
                            if ((i3 & 32) != 0) {
                                i11 &= -458753;
                            }
                        }
                        fT = f3;
                        long j62 = jJ2;
                        long j72 = jRl;
                        Modifier modifier42 = modifier2;
                        Function2 function262 = function24;
                        Function3 function332 = function3Rl;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i132 = (i11 & 14) | 48;
                        int i142 = i11 << 3;
                        composer2 = composerKN;
                        O(function23, Uo, modifier42, function262, function332, j62, j72, fT, composer2, i132 | (i142 & 896) | (i142 & 7168) | (57344 & i142) | (458752 & i142) | (3670016 & i142) | (i142 & 29360128), 0);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier42;
                        function25 = function262;
                        function32 = function332;
                        j4 = j62;
                        j5 = j72;
                        f4 = fT;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                                AppBarKt.Uo(function2, modifier3, function25, function32, j4, j5, f4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                function3Rl = function3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i5;
                if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function24 = function22;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            function3Rl = function3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i5;
            if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function24 = function22;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        function3Rl = function3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i5;
        if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final long j2, final long j3, final float f3, final PaddingValues paddingValues, final Shape shape, final WindowInsets windowInsets, Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        float f4;
        Shape shape2;
        int i7;
        int i8;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-712505634);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.nr(j3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                f4 = f3;
                i5 |= composerKN.rl(f4) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.p5(paddingValues) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                if ((i2 & 24576) == 0) {
                    shape2 = shape;
                    i5 |= composerKN.p5(shape2) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= composerKN.p5(windowInsets) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i5 |= 1572864;
                    i8 = 1572864;
                    modifier2 = modifier;
                } else {
                    i8 = 1572864;
                    modifier2 = modifier;
                    if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.p5(modifier2) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
                }
                if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
                    Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-712505634, i5, -1, "androidx.compose.material.AppBar (AppBar.kt:704)");
                    }
                    int i9 = i5 << 6;
                    composer2 = composerKN;
                    SurfaceKt.n(modifier4, shape2, j2, j3, null, f4, ComposableLambdaKt.nr(213273114, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i10) {
                            if (!composer3.HI((i10 & 3) != 2, i10 & 1)) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(213273114, i10, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:712)");
                            }
                            ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.nr(composer3, 6)));
                            final WindowInsets windowInsets2 = windowInsets;
                            final PaddingValues paddingValues2 = paddingValues;
                            final Function3 function32 = function3;
                            CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(600325466, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    n(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer4, int i11) {
                                    if (!composer4.HI((i11 & 3) != 2, i11 & 1)) {
                                        composer4.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(600325466, i11, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:713)");
                                    }
                                    Modifier modifierXMQ = SizeKt.xMQ(PaddingKt.KN(WindowInsetsPaddingKt.nr(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), windowInsets2), paddingValues2), AppBarKt.f21185n);
                                    Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
                                    Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                    Function3 function33 = function32;
                                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer4, 54);
                                    int iN = ComposablesKt.n(composer4, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer4, modifierXMQ);
                                    ComposeUiNode.Companion companion = ComposeUiNode.te;
                                    Function0 function0N = companion.n();
                                    if (composer4.mUb() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer4.T();
                                    if (composer4.J2()) {
                                        composer4.s7N(function0N);
                                    } else {
                                        composer4.r();
                                    }
                                    Composer composerN = Updater.n(composer4);
                                    Updater.O(composerN, measurePolicyRl, companion.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                    Function2 function2Rl = companion.rl();
                                    if (composerN.J2() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion.nr());
                                    function33.invoke(RowScopeInstance.f17780n, composer4, 6);
                                    composer4.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.xMQ | 48);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composer2, ((i5 >> 18) & 14) | i8 | ((i5 >> 9) & 112) | (i9 & 896) | (i9 & 7168) | (458752 & (i5 << 9)), 16);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i10) {
                            AppBarKt.n(j2, j3, f3, paddingValues, shape, windowInsets, modifier3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            shape2 = shape;
            if ((i3 & 32) != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        f4 = f3;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        shape2 = shape;
        if ((i3 & 32) != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(Modifier modifier, long j2, long j3, float f3, PaddingValues paddingValues, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jJ2;
        long j4;
        float fT;
        int i7;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f4;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        long j7;
        float f5;
        PaddingValues paddingValuesRl;
        long j9;
        Composer composerKN = composer.KN(1897058582);
        int i8 = i3 & 1;
        if (i8 != 0) {
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
                jJ2 = j2;
                int i9 = composerKN.nr(jJ2) ? 32 : 16;
                i5 |= i9;
            } else {
                jJ2 = j2;
            }
            i5 |= i9;
        } else {
            jJ2 = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j3;
                int i10 = composerKN.nr(j4) ? 256 : 128;
                i5 |= i10;
            } else {
                j4 = j3;
            }
            i5 |= i10;
        } else {
            j4 = j3;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                fT = f3;
                i5 |= composerKN.rl(fT) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    paddingValues2 = paddingValues;
                    i5 |= composerKN.p5(paddingValues2) ? 16384 : 8192;
                }
                if ((i3 & 32) == 0) {
                    if ((i2 & 196608) == 0) {
                        i5 |= composerKN.E2(function3) ? 131072 : 65536;
                    }
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        modifier3 = modifier2;
                        j5 = jJ2;
                        j6 = j4;
                        f4 = fT;
                        paddingValues3 = paddingValues2;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier5 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 2) != 0) {
                                i5 &= -113;
                                jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                            }
                            if ((i3 & 4) != 0) {
                                long jRl = ColorsKt.rl(jJ2, composerKN, (i5 >> 3) & 14);
                                i5 &= -897;
                                j4 = jRl;
                            }
                            if (i11 != 0) {
                                fT = AppBarDefaults.f21182n.t();
                            }
                            if (i7 != 0) {
                                modifier4 = modifier5;
                                j7 = j4;
                                f5 = fT;
                                paddingValuesRl = AppBarDefaults.f21182n.rl();
                                j9 = jJ2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1897058582, i5, -1, "androidx.compose.material.TopAppBar (AppBar.kt:273)");
                                }
                                int i12 = i5 >> 3;
                                composer2 = composerKN;
                                n(j9, j7, f5, paddingValuesRl, RectangleShapeKt.n(), Uo, modifier4, function3, composer2, (i12 & 7168) | (i12 & 14) | 221184 | (i12 & 112) | (i12 & 896) | ((i5 << 18) & 3670016) | ((i5 << 6) & 29360128), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                j5 = j9;
                                j6 = j7;
                                f4 = f5;
                                paddingValues3 = paddingValuesRl;
                                modifier3 = modifier4;
                            } else {
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
                            modifier4 = modifier2;
                        }
                        f5 = fT;
                        j9 = jJ2;
                        paddingValuesRl = paddingValues2;
                        j7 = j4;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i122 = i5 >> 3;
                        composer2 = composerKN;
                        n(j9, j7, f5, paddingValuesRl, RectangleShapeKt.n(), Uo, modifier4, function3, composer2, (i122 & 7168) | (i122 & 14) | 221184 | (i122 & 112) | (i122 & 896) | ((i5 << 18) & 3670016) | ((i5 << 6) & 29360128), 0);
                        if (ComposerKt.v()) {
                        }
                        j5 = j9;
                        j6 = j7;
                        f4 = f5;
                        paddingValues3 = paddingValuesRl;
                        modifier3 = modifier4;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$5
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
                                AppBarKt.nr(modifier3, j5, j6, f4, paddingValues3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            paddingValues2 = paddingValues;
            if ((i3 & 32) == 0) {
            }
            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        fT = f3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i3 & 32) == 0) {
        }
        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final WindowInsets windowInsets, Modifier modifier, long j2, long j3, Shape shape, float f3, PaddingValues paddingValues, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        long jJ2;
        long jRl;
        int i7;
        Shape shape2;
        int i8;
        float fN;
        int i9;
        Composer composer2;
        final Modifier modifier3;
        final long j4;
        final long j5;
        final Shape shape3;
        final float f4;
        final PaddingValues paddingValues2;
        ScopeUpdateScope scopeUpdateScopeGh;
        PaddingValues paddingValuesRl;
        Composer composerKN = composer.KN(382658343);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(windowInsets) ? 4 : 2) | i2;
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
                    jJ2 = j2;
                    int i11 = composerKN.nr(jJ2) ? 256 : 128;
                    i5 |= i11;
                } else {
                    jJ2 = j2;
                }
                i5 |= i11;
            } else {
                jJ2 = j2;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    jRl = j3;
                    int i12 = composerKN.nr(jRl) ? 2048 : 1024;
                    i5 |= i12;
                } else {
                    jRl = j3;
                }
                i5 |= i12;
            } else {
                jRl = j3;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    shape2 = shape;
                    i5 |= composerKN.p5(shape2) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        fN = f3;
                        i5 |= composerKN.rl(fN) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.p5(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
                        }
                        if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                                    i5 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    jRl = ColorsKt.rl(jJ2, composerKN, (i5 >> 6) & 14);
                                    i5 &= -7169;
                                }
                                if (i7 != 0) {
                                    shape2 = null;
                                }
                                if (i8 != 0) {
                                    fN = AppBarDefaults.f21182n.n();
                                }
                                if (i9 != 0) {
                                    paddingValuesRl = AppBarDefaults.f21182n.rl();
                                }
                                Modifier modifier4 = modifier2;
                                Shape shape4 = shape2;
                                float f5 = fN;
                                long j6 = jJ2;
                                long j7 = jRl;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(382658343, i5, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:341)");
                                }
                                FabPlacement fabPlacement = (FabPlacement) composerKN.ty(ScaffoldKt.J2());
                                Shape bottomAppBarCutoutShape = (shape4 == null && fabPlacement != null && fabPlacement.getIsDocked()) ? new BottomAppBarCutoutShape(shape4, fabPlacement) : RectangleShapeKt.n();
                                int i13 = i5 >> 9;
                                int i14 = ((i5 >> 6) & 126) | (i13 & 896) | (i13 & 7168);
                                int i15 = i5 << 15;
                                composer2 = composerKN;
                                n(j6, j7, f5, paddingValuesRl, bottomAppBarCutoutShape, windowInsets, modifier4, function3, composer2, i14 | (458752 & i15) | (i15 & 3670016) | (i5 & 29360128), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                shape3 = shape4;
                                j4 = j6;
                                j5 = j7;
                                f4 = f5;
                                paddingValues2 = paddingValuesRl;
                                modifier3 = modifier4;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 4) != 0) {
                                    i5 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                }
                            }
                            paddingValuesRl = paddingValues;
                            Modifier modifier42 = modifier2;
                            Shape shape42 = shape2;
                            float f53 = fN;
                            long j62 = jJ2;
                            long j72 = jRl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            FabPlacement fabPlacement2 = (FabPlacement) composerKN.ty(ScaffoldKt.J2());
                            if (shape42 == null) {
                                Shape bottomAppBarCutoutShape2 = (shape42 == null && fabPlacement2 != null && fabPlacement2.getIsDocked()) ? new BottomAppBarCutoutShape(shape42, fabPlacement2) : RectangleShapeKt.n();
                                int i132 = i5 >> 9;
                                int i142 = ((i5 >> 6) & 126) | (i132 & 896) | (i132 & 7168);
                                int i152 = i5 << 15;
                                composer2 = composerKN;
                                n(j62, j72, f53, paddingValuesRl, bottomAppBarCutoutShape2, windowInsets, modifier42, function3, composer2, i142 | (458752 & i152) | (i152 & 3670016) | (i5 & 29360128), 0);
                                if (ComposerKt.v()) {
                                }
                                shape3 = shape42;
                                j4 = j62;
                                j5 = j72;
                                f4 = f53;
                                paddingValues2 = paddingValuesRl;
                                modifier3 = modifier42;
                            }
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier3 = modifier2;
                            j4 = jJ2;
                            j5 = jRl;
                            shape3 = shape2;
                            f4 = fN;
                            paddingValues2 = paddingValues;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                                    AppBarKt.rl(windowInsets, modifier3, j4, j5, shape3, f4, paddingValues2, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                fN = f3;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            shape2 = shape;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            fN = f3;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        shape2 = shape;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        fN = f3;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, long j2, long j3, Shape shape, float f3, PaddingValues paddingValues, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        long jJ2;
        long jRl;
        Shape shape2;
        int i7;
        float fN;
        int i8;
        int i9;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier2;
        final long j4;
        final long j5;
        final Shape shape3;
        final float f4;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier3;
        PaddingValues paddingValuesRl;
        Shape shape4;
        float f5;
        int i10;
        long j6;
        Composer composerKN = composer.KN(-1651948973);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                jJ2 = j2;
                int i12 = composerKN.nr(jJ2) ? 32 : 16;
                i5 |= i12;
            } else {
                jJ2 = j2;
            }
            i5 |= i12;
        } else {
            jJ2 = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                jRl = j3;
                int i13 = composerKN.nr(jRl) ? 256 : 128;
                i5 |= i13;
            } else {
                jRl = j3;
            }
            i5 |= i13;
        } else {
            jRl = j3;
        }
        int i14 = i3 & 8;
        if (i14 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                shape2 = shape;
                i5 |= composerKN.p5(shape2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    fN = f3;
                    i5 |= composerKN.rl(fN) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                    i9 = 196608;
                    paddingValues2 = paddingValues;
                } else {
                    i9 = 196608;
                    paddingValues2 = paddingValues;
                    if ((i2 & 196608) == 0) {
                        i5 |= composerKN.p5(paddingValues2) ? 131072 : 65536;
                    }
                }
                if ((i3 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.E2(function3) ? 1048576 : 524288;
                }
                if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i3 & 2) != 0) {
                            jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                            i5 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            jRl = ColorsKt.rl(jJ2, composerKN, (i5 >> 3) & 14);
                            i5 &= -897;
                        }
                        if (i14 != 0) {
                            shape2 = null;
                        }
                        if (i7 != 0) {
                            fN = AppBarDefaults.f21182n.n();
                        }
                        if (i8 != 0) {
                            modifier3 = modifier4;
                            paddingValuesRl = AppBarDefaults.f21182n.rl();
                            shape4 = shape2;
                            f5 = fN;
                            i10 = -1651948973;
                            j6 = jJ2;
                            long j7 = jRl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i10, i5, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:411)");
                            }
                            FabPlacement fabPlacement = (FabPlacement) composerKN.ty(ScaffoldKt.J2());
                            Shape bottomAppBarCutoutShape = (shape4 == null && fabPlacement != null && fabPlacement.getIsDocked()) ? new BottomAppBarCutoutShape(shape4, fabPlacement) : RectangleShapeKt.n();
                            int i15 = i5 >> 3;
                            int i16 = i5 >> 6;
                            composer2 = composerKN;
                            n(j6, j7, f5, paddingValuesRl, bottomAppBarCutoutShape, Uo, modifier3, function3, composer2, (i15 & 112) | (i15 & 14) | i9 | (i16 & 896) | (i16 & 7168) | ((i5 << 18) & 3670016) | (29360128 & (i5 << 3)), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            shape3 = shape4;
                            j4 = j6;
                            j5 = j7;
                            f4 = f5;
                            paddingValues3 = paddingValuesRl;
                            modifier2 = modifier3;
                        } else {
                            modifier3 = modifier4;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        modifier3 = modifier;
                    }
                    shape4 = shape2;
                    paddingValuesRl = paddingValues2;
                    i10 = -1651948973;
                    j6 = jJ2;
                    f5 = fN;
                    long j72 = jRl;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    FabPlacement fabPlacement2 = (FabPlacement) composerKN.ty(ScaffoldKt.J2());
                    if (shape4 == null) {
                        Shape bottomAppBarCutoutShape2 = (shape4 == null && fabPlacement2 != null && fabPlacement2.getIsDocked()) ? new BottomAppBarCutoutShape(shape4, fabPlacement2) : RectangleShapeKt.n();
                        int i152 = i5 >> 3;
                        int i162 = i5 >> 6;
                        composer2 = composerKN;
                        n(j6, j72, f5, paddingValuesRl, bottomAppBarCutoutShape2, Uo, modifier3, function3, composer2, (i152 & 112) | (i152 & 14) | i9 | (i162 & 896) | (i162 & 7168) | ((i5 << 18) & 3670016) | (29360128 & (i5 << 3)), 0);
                        if (ComposerKt.v()) {
                        }
                        shape3 = shape4;
                        j4 = j6;
                        j5 = j72;
                        f4 = f5;
                        paddingValues3 = paddingValuesRl;
                        modifier2 = modifier3;
                    }
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    modifier2 = modifier;
                    j4 = jJ2;
                    j5 = jRl;
                    shape3 = shape2;
                    f4 = fN;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i17) {
                            AppBarKt.t(modifier2, j4, j5, shape3, f4, paddingValues3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            fN = f3;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        shape2 = shape;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        fN = f3;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
