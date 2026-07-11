package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.utils.Float16;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a@\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aF\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "colorScheme", "Landroidx/compose/material3/Shapes;", "shapes", "Landroidx/compose/material3/Typography;", "typography", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "t", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalUsingExpressiveTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalUsingExpressiveTheme", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,172:1\n77#2:173\n1223#3,6:174\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n*L\n135#1:173\n162#1:174,6\n*E\n"})
public final class MaterialThemeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f26165n = CompositionLocalKt.Uo(new Function0<Boolean>() { // from class: androidx.compose.material3.MaterialThemeKt$LocalUsingExpressiveTheme$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    public static final void n(final ColorScheme colorScheme, final Shapes shapes, Typography typography, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        final Typography typography2;
        Composer composerKN = composer.KN(-1399457222);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(colorScheme) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(shapes) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(typography) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            typography2 = typography;
        } else {
            if (i7 != 0) {
                colorScheme = null;
            }
            if (i8 != 0) {
                shapes = null;
            }
            final Typography typography3 = i9 == 0 ? typography : null;
            if (ComposerKt.v()) {
                ComposerKt.p5(-1399457222, i5, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:133)");
            }
            ProvidableCompositionLocal providableCompositionLocal = f26165n;
            if (((Boolean) composerKN.ty(providableCompositionLocal)).booleanValue()) {
                composerKN.eF(547059915);
                composerKN.eF(1126027167);
                ColorScheme colorSchemeN = colorScheme == null ? MaterialTheme.f26164n.n(composerKN, 6) : colorScheme;
                composerKN.Xw();
                composerKN.eF(1126029309);
                Typography typographyT = typography3 == null ? MaterialTheme.f26164n.t(composerKN, 6) : typography3;
                composerKN.Xw();
                composerKN.eF(1126031253);
                Shapes shapesRl = shapes == null ? MaterialTheme.f26164n.rl(composerKN, 6) : shapes;
                composerKN.Xw();
                rl(colorSchemeN, shapesRl, typographyT, function2, composerKN, i5 & 7168, 0);
                composerKN.Xw();
            } else {
                composerKN.eF(547327197);
                CompositionLocalKt.rl(providableCompositionLocal.nr(Boolean.TRUE), ComposableLambdaKt.nr(2050809758, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialExpressiveTheme$1
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
                        if ((i10 & 3) == 2 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(2050809758, i10, -1, "androidx.compose.material3.MaterialExpressiveTheme.<anonymous> (MaterialTheme.kt:143)");
                        }
                        ColorScheme colorSchemeJ2 = colorScheme;
                        if (colorSchemeJ2 == null) {
                            colorSchemeJ2 = ColorSchemeKt.J2();
                        }
                        ColorScheme colorScheme2 = colorSchemeJ2;
                        Shapes shapes2 = shapes;
                        Shapes shapes3 = shapes2 == null ? new Shapes(null, null, null, null, null, 31, null) : shapes2;
                        Typography typography4 = typography3;
                        MaterialThemeKt.rl(colorScheme2, shapes3, typography4 == null ? new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Float16.EXPONENT_SIGNIFICAND_MASK, null) : typography4, function2, composer2, 0, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            typography2 = typography3;
        }
        final ColorScheme colorScheme2 = colorScheme;
        final Shapes shapes2 = shapes;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialExpressiveTheme$2
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
                    MaterialThemeKt.n(colorScheme2, shapes2, typography2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(ColorScheme colorScheme, Shapes shapes, Typography typography, final Function2 function2, Composer composer, final int i2, final int i3) {
        final ColorScheme colorSchemeN;
        int i5;
        Shapes shapesRl;
        Typography typographyT;
        final Typography typography2;
        final Shapes shapes2;
        Composer composerKN = composer.KN(-2127166334);
        if ((i2 & 6) == 0) {
            if ((i3 & 1) == 0) {
                colorSchemeN = colorScheme;
                int i7 = composerKN.p5(colorSchemeN) ? 4 : 2;
                i5 = i7 | i2;
            } else {
                colorSchemeN = colorScheme;
            }
            i5 = i7 | i2;
        } else {
            colorSchemeN = colorScheme;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                shapesRl = shapes;
                int i8 = composerKN.p5(shapesRl) ? 32 : 16;
                i5 |= i8;
            } else {
                shapesRl = shapes;
            }
            i5 |= i8;
        } else {
            shapesRl = shapes;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                typographyT = typography;
                int i9 = composerKN.p5(typographyT) ? 256 : 128;
                i5 |= i9;
            } else {
                typographyT = typography;
            }
            i5 |= i9;
        } else {
            typographyT = typography;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            shapes2 = shapesRl;
            typography2 = typographyT;
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if ((i3 & 1) != 0) {
                    colorSchemeN = MaterialTheme.f26164n.n(composerKN, 6);
                    i5 &= -15;
                }
                if ((i3 & 2) != 0) {
                    shapesRl = MaterialTheme.f26164n.rl(composerKN, 6);
                    i5 &= -113;
                }
                if ((i3 & 4) != 0) {
                    typographyT = MaterialTheme.f26164n.t(composerKN, 6);
                    i5 &= -897;
                }
                int i10 = i5;
                final Typography typography3 = typographyT;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-2127166334, i10, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:55)");
                }
                CompositionLocalKt.t(new ProvidedValue[]{ColorSchemeKt.KN().nr(colorSchemeN), IndicationKt.n().nr(RippleKt.nr(false, 0.0f, 0L, composerKN, 0, 7)), RippleThemeKt.nr().nr(CompatRippleTheme.rl), ShapesKt.nr().nr(shapesRl), TextSelectionColorsKt.rl().nr(t(colorSchemeN, composerKN, i10 & 14)), TypographyKt.rl().nr(typography3)}, ComposableLambdaKt.nr(-1066563262, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
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
                        if ((i11 & 3) == 2 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1066563262, i11, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:68)");
                        }
                        TextKt.n(typography3.getBodyLarge(), function2, composer2, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                Shapes shapes3 = shapesRl;
                typography2 = typography3;
                shapes2 = shapes3;
            } else {
                composerKN.wTp();
                if ((i3 & 1) != 0) {
                    i5 &= -15;
                }
                if ((i3 & 2) != 0) {
                    i5 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                int i102 = i5;
                final Typography typography32 = typographyT;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                CompositionLocalKt.t(new ProvidedValue[]{ColorSchemeKt.KN().nr(colorSchemeN), IndicationKt.n().nr(RippleKt.nr(false, 0.0f, 0L, composerKN, 0, 7)), RippleThemeKt.nr().nr(CompatRippleTheme.rl), ShapesKt.nr().nr(shapesRl), TextSelectionColorsKt.rl().nr(t(colorSchemeN, composerKN, i102 & 14)), TypographyKt.rl().nr(typography32)}, ComposableLambdaKt.nr(-1066563262, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
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
                        if ((i11 & 3) == 2 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1066563262, i11, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:68)");
                        }
                        TextKt.n(typography32.getBodyLarge(), function2, composer2, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                if (ComposerKt.v()) {
                }
                Shapes shapes32 = shapesRl;
                typography2 = typography32;
                shapes2 = shapes32;
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
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
                    MaterialThemeKt.rl(colorSchemeN, shapes2, typography2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    public static final SelectionColors t(ColorScheme colorScheme, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1866455512, i2, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)");
        }
        long primary = colorScheme.getPrimary();
        boolean zNr = composer.nr(primary);
        Object objIF = composer.iF();
        if (zNr || objIF == Composer.INSTANCE.n()) {
            SelectionColors selectionColors = new SelectionColors(primary, Color.az(primary, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            composer.o(selectionColors);
            objIF = selectionColors;
        }
        SelectionColors selectionColors2 = (SelectionColors) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return selectionColors2;
    }
}
