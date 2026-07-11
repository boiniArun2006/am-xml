package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aø\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aø\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010'\u001a\u001e\u0010*\u001a\u00020\u0000*\u00020%2\u0006\u0010)\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001a\u0010,\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a&\u00100\u001a\u00020\u0000*\u00020%2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.H\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001e\u00102\u001a\u00020\u0000*\u00020%2\u0006\u0010/\u001a\u00020.H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u000f\u00104\u001a\u00020%H\u0000¢\u0006\u0004\b4\u00105\u001a\u001b\u00108\u001a\u00020\u0000*\u00020%2\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109\" \u0010>\u001a\b\u0012\u0004\u0012\u00020%0:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\b<\u0010=\"\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020?0:8\u0006¢\u0006\f\n\u0004\b*\u0010;\u001a\u0004\b@\u0010=\"\u0018\u00107\u001a\u00020\u0000*\u0002068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", MRAIDPresenter.ERROR, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "Landroidx/compose/material3/ColorScheme;", "mUb", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "nr", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "rl", "(Landroidx/compose/material3/ColorScheme;J)J", "t", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/ui/unit/Dp;", "elevation", c.f62177j, "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "qie", "(Landroidx/compose/material3/ColorScheme;F)J", "J2", "()Landroidx/compose/material3/ColorScheme;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "Uo", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "KN", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColorScheme", "", "getLocalTonalElevationEnabled", "LocalTonalElevationEnabled", "xMQ", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1011:1\n708#2:1012\n696#2:1013\n77#3:1014\n77#3:1015\n148#4:1016\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n879#1:1012\n879#1:1013\n880#1:1014\n897#1:1015\n916#1:1016\n*E\n"})
public final class ColorSchemeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f25040n = CompositionLocalKt.Uo(new Function0<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ColorScheme invoke() {
            return ColorSchemeKt.gh(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final ProvidableCompositionLocal rl = CompositionLocalKt.Uo(new Function0<Boolean>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ColorScheme O(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i2, int i3, Object obj) {
        long jZ = (i2 & 1) != 0 ? ColorDarkTokens.f29429n.Z() : j2;
        long jMUb = (i2 & 2) != 0 ? ColorDarkTokens.f29429n.mUb() : j3;
        long jXQ = (i2 & 4) != 0 ? ColorDarkTokens.f29429n.XQ() : j4;
        long jGh = (i2 & 8) != 0 ? ColorDarkTokens.f29429n.gh() : j5;
        long jO = (i2 & 16) != 0 ? ColorDarkTokens.f29429n.O() : j6;
        long jWPU = (i2 & 32) != 0 ? ColorDarkTokens.f29429n.WPU() : j7;
        long jQie = (i2 & 64) != 0 ? ColorDarkTokens.f29429n.qie() : j9;
        long jAYN = (i2 & 128) != 0 ? ColorDarkTokens.f29429n.aYN() : j10;
        long j39 = jZ;
        long jAz = (i2 & 256) != 0 ? ColorDarkTokens.f29429n.az() : j11;
        long jT2 = (i2 & 512) != 0 ? ColorDarkTokens.f29429n.T() : j12;
        long jCk = (i2 & 1024) != 0 ? ColorDarkTokens.f29429n.ck() : j13;
        long jN = (i2 & 2048) != 0 ? ColorDarkTokens.f29429n.N() : j14;
        long jIk = (i2 & 4096) != 0 ? ColorDarkTokens.f29429n.Ik() : j15;
        long jN2 = (i2 & 8192) != 0 ? ColorDarkTokens.f29429n.n() : j16;
        long jUo = (i2 & 16384) != 0 ? ColorDarkTokens.f29429n.Uo() : j17;
        long jViF = (i2 & 32768) != 0 ? ColorDarkTokens.f29429n.ViF() : j18;
        long jTy = (i2 & 65536) != 0 ? ColorDarkTokens.f29429n.ty() : j19;
        long jX = (i2 & 131072) != 0 ? ColorDarkTokens.f29429n.X() : j20;
        long jHI = (i2 & 262144) != 0 ? ColorDarkTokens.f29429n.HI() : j21;
        long j40 = (i2 & 524288) != 0 ? j39 : j22;
        long jJ2 = (i2 & 1048576) != 0 ? ColorDarkTokens.f29429n.J2() : j23;
        long jNr = (i2 & 2097152) != 0 ? ColorDarkTokens.f29429n.nr() : j24;
        long jRl = (i2 & 4194304) != 0 ? ColorDarkTokens.f29429n.rl() : j25;
        long jKN = (i2 & 8388608) != 0 ? ColorDarkTokens.f29429n.KN() : j26;
        long jT3 = (i2 & 16777216) != 0 ? ColorDarkTokens.f29429n.t() : j27;
        long jXMQ = (i2 & 33554432) != 0 ? ColorDarkTokens.f29429n.xMQ() : j28;
        long jR = (i2 & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? ColorDarkTokens.f29429n.r() : j29;
        long jO2 = (i2 & 134217728) != 0 ? ColorDarkTokens.f29429n.o() : j30;
        long jS2 = (i2 & 268435456) != 0 ? ColorDarkTokens.f29429n.S() : j31;
        long jNY = (i2 & 536870912) != 0 ? ColorDarkTokens.f29429n.nY() : j32;
        long jG = (i2 & 1073741824) != 0 ? ColorDarkTokens.f29429n.g() : j33;
        long jTe = (i2 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.f29429n.te() : j34;
        long jIF = (i3 & 1) != 0 ? ColorDarkTokens.f29429n.iF() : j35;
        long jFD = (i3 & 2) != 0 ? ColorDarkTokens.f29429n.fD() : j36;
        long jE2 = (i3 & 4) != 0 ? ColorDarkTokens.f29429n.E2() : j37;
        if ((i3 & 8) != 0) {
            j38 = ColorDarkTokens.f29429n.e();
        }
        return nr(j39, jMUb, jXQ, jGh, jO, jWPU, jQie, jAYN, jAz, jT2, jCk, jN, jIk, jN2, jUo, jViF, jTy, jX, jHI, j40, jJ2, jNr, jRl, jKN, jT3, jXMQ, jR, jO2, jS2, jNY, jG, jTe, jIF, jFD, jE2, j38);
    }

    public static /* synthetic */ ColorScheme gh(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i2, int i3, Object obj) {
        long jZ = (i2 & 1) != 0 ? ColorLightTokens.f29444n.Z() : j2;
        long jMUb = (i2 & 2) != 0 ? ColorLightTokens.f29444n.mUb() : j3;
        long jXQ = (i2 & 4) != 0 ? ColorLightTokens.f29444n.XQ() : j4;
        long jGh = (i2 & 8) != 0 ? ColorLightTokens.f29444n.gh() : j5;
        long jO = (i2 & 16) != 0 ? ColorLightTokens.f29444n.O() : j6;
        long jWPU = (i2 & 32) != 0 ? ColorLightTokens.f29444n.WPU() : j7;
        long jQie = (i2 & 64) != 0 ? ColorLightTokens.f29444n.qie() : j9;
        long jAYN = (i2 & 128) != 0 ? ColorLightTokens.f29444n.aYN() : j10;
        long j39 = jZ;
        long jAz = (i2 & 256) != 0 ? ColorLightTokens.f29444n.az() : j11;
        long jT2 = (i2 & 512) != 0 ? ColorLightTokens.f29444n.T() : j12;
        long jCk = (i2 & 1024) != 0 ? ColorLightTokens.f29444n.ck() : j13;
        long jN = (i2 & 2048) != 0 ? ColorLightTokens.f29444n.N() : j14;
        long jIk = (i2 & 4096) != 0 ? ColorLightTokens.f29444n.Ik() : j15;
        long jN2 = (i2 & 8192) != 0 ? ColorLightTokens.f29444n.n() : j16;
        long jUo = (i2 & 16384) != 0 ? ColorLightTokens.f29444n.Uo() : j17;
        long jViF = (i2 & 32768) != 0 ? ColorLightTokens.f29444n.ViF() : j18;
        long jTy = (i2 & 65536) != 0 ? ColorLightTokens.f29444n.ty() : j19;
        long jX = (i2 & 131072) != 0 ? ColorLightTokens.f29444n.X() : j20;
        long jHI = (i2 & 262144) != 0 ? ColorLightTokens.f29444n.HI() : j21;
        long j40 = (i2 & 524288) != 0 ? j39 : j22;
        long jJ2 = (i2 & 1048576) != 0 ? ColorLightTokens.f29444n.J2() : j23;
        long jNr = (i2 & 2097152) != 0 ? ColorLightTokens.f29444n.nr() : j24;
        long jRl = (i2 & 4194304) != 0 ? ColorLightTokens.f29444n.rl() : j25;
        long jKN = (i2 & 8388608) != 0 ? ColorLightTokens.f29444n.KN() : j26;
        long jT3 = (i2 & 16777216) != 0 ? ColorLightTokens.f29444n.t() : j27;
        long jXMQ = (i2 & 33554432) != 0 ? ColorLightTokens.f29444n.xMQ() : j28;
        long jR = (i2 & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? ColorLightTokens.f29444n.r() : j29;
        long jO2 = (i2 & 134217728) != 0 ? ColorLightTokens.f29444n.o() : j30;
        long jS2 = (i2 & 268435456) != 0 ? ColorLightTokens.f29444n.S() : j31;
        long jNY = (i2 & 536870912) != 0 ? ColorLightTokens.f29444n.nY() : j32;
        long jG = (i2 & 1073741824) != 0 ? ColorLightTokens.f29444n.g() : j33;
        long jTe = (i2 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.f29444n.te() : j34;
        long jIF = (i3 & 1) != 0 ? ColorLightTokens.f29444n.iF() : j35;
        long jFD = (i3 & 2) != 0 ? ColorLightTokens.f29444n.fD() : j36;
        long jE2 = (i3 & 4) != 0 ? ColorLightTokens.f29444n.E2() : j37;
        if ((i3 & 8) != 0) {
            j38 = ColorLightTokens.f29444n.e();
        }
        return mUb(j39, jMUb, jXQ, jGh, jO, jWPU, jQie, jAYN, jAz, jT2, jCk, jN, jIk, jN2, jUo, jViF, jTy, jX, jHI, j40, jJ2, jNr, jRl, jKN, jT3, jXMQ, jR, jO2, jS2, jNY, jG, jTe, jIF, jFD, jE2, j38);
    }

    public static final ColorScheme mUb(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j38, j33, j34, j35, j36, j37, null);
    }

    public static final ColorScheme nr(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return new ColorScheme(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j38, j33, j34, j35, j36, j37, null);
    }

    public static final long qie(ColorScheme colorScheme, float f3) {
        if (Dp.mUb(f3, Dp.KN(0))) {
            return colorScheme.getSurface();
        }
        return ColorKt.Uo(Color.az(colorScheme.getSurfaceTint(), ((((float) Math.log(f3 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }

    public static final ColorScheme J2() {
        PaletteTokens paletteTokens = PaletteTokens.f29825n;
        return gh(0L, 0L, 0L, paletteTokens.E(), 0L, 0L, 0L, 0L, paletteTokens.z(), 0L, 0L, 0L, paletteTokens.z(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15, null);
    }

    public static final ProvidableCompositionLocal KN() {
        return f25040n;
    }

    public static final long Uo(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            default:
                return Color.INSTANCE.Uo();
        }
    }

    public static final long n(ColorScheme colorScheme, long j2, float f3, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1610977682, i2, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) composer.ty(rl)).booleanValue();
        if (Color.HI(j2, colorScheme.getSurface()) && zBooleanValue) {
            j2 = qie(colorScheme, f3);
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return j2;
    }

    public static final long rl(ColorScheme colorScheme, long j2) {
        if (Color.HI(j2, colorScheme.getPrimary())) {
            return colorScheme.getOnPrimary();
        }
        if (Color.HI(j2, colorScheme.getSecondary())) {
            return colorScheme.getOnSecondary();
        }
        if (Color.HI(j2, colorScheme.getTertiary())) {
            return colorScheme.getOnTertiary();
        }
        if (Color.HI(j2, colorScheme.getBackground())) {
            return colorScheme.getOnBackground();
        }
        if (Color.HI(j2, colorScheme.getError())) {
            return colorScheme.getOnError();
        }
        if (Color.HI(j2, colorScheme.getPrimaryContainer())) {
            return colorScheme.getOnPrimaryContainer();
        }
        if (Color.HI(j2, colorScheme.getSecondaryContainer())) {
            return colorScheme.getOnSecondaryContainer();
        }
        if (Color.HI(j2, colorScheme.getTertiaryContainer())) {
            return colorScheme.getOnTertiaryContainer();
        }
        if (Color.HI(j2, colorScheme.getErrorContainer())) {
            return colorScheme.getOnErrorContainer();
        }
        if (Color.HI(j2, colorScheme.getInverseSurface())) {
            return colorScheme.getInverseOnSurface();
        }
        if (Color.HI(j2, colorScheme.getSurface())) {
            return colorScheme.getOnSurface();
        }
        if (Color.HI(j2, colorScheme.getSurfaceVariant())) {
            return colorScheme.getOnSurfaceVariant();
        }
        if (Color.HI(j2, colorScheme.getSurfaceBright())) {
            return colorScheme.getOnSurface();
        }
        if (Color.HI(j2, colorScheme.getSurfaceContainer())) {
            return colorScheme.getOnSurface();
        }
        if (Color.HI(j2, colorScheme.getSurfaceContainerHigh())) {
            return colorScheme.getOnSurface();
        }
        if (Color.HI(j2, colorScheme.getSurfaceContainerHighest())) {
            return colorScheme.getOnSurface();
        }
        if (Color.HI(j2, colorScheme.getSurfaceContainerLow())) {
            return colorScheme.getOnSurface();
        }
        if (Color.HI(j2, colorScheme.getSurfaceContainerLowest())) {
            return colorScheme.getOnSurface();
        }
        return Color.INSTANCE.Uo();
    }

    public static final long t(long j2, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(509589638, i2, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.eF(-1680936624);
        long jRl = rl(MaterialTheme.f26164n.n(composer, 6), j2);
        if (jRl == 16) {
            jRl = ((Color) composer.ty(ContentColorKt.n())).getValue();
        }
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jRl;
    }

    public static final long xMQ(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-810780884, i2, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jUo = Uo(MaterialTheme.f26164n.n(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jUo;
    }
}
