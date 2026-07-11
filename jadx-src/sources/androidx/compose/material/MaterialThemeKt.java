package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/material/Typography;", "typography", "Landroidx/compose/material/Shapes;", "shapes", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1247#2,6:114\n1#3:120\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n66#1:114,6\n*E\n"})
public final class MaterialThemeKt {
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Colors colors, Typography typography, Shapes shapes, final Function2 function2, Composer composer, final int i2, final int i3) {
        Colors colorsN;
        int i5;
        final Typography typographyT;
        Shapes shapesRl;
        Colors colors2;
        Object objIF;
        Composer composerKN = composer.KN(-891417079);
        if ((i2 & 6) == 0) {
            if ((i3 & 1) == 0) {
                colorsN = colors;
                int i7 = composerKN.p5(colorsN) ? 4 : 2;
                i5 = i7 | i2;
            } else {
                colorsN = colors;
            }
            i5 = i7 | i2;
        } else {
            colorsN = colors;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                typographyT = typography;
                int i8 = composerKN.p5(typographyT) ? 32 : 16;
                i5 |= i8;
            } else {
                typographyT = typography;
            }
            i5 |= i8;
        } else {
            typographyT = typography;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                shapesRl = shapes;
                int i9 = composerKN.p5(shapesRl) ? 256 : 128;
                i5 |= i9;
            } else {
                shapesRl = shapes;
            }
            i5 |= i9;
        } else {
            shapesRl = shapes;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if (composerKN.HI((i5 & 1171) != 1170, i5 & 1)) {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if ((i3 & 1) != 0) {
                    colorsN = MaterialTheme.f22169n.n(composerKN, 6);
                    i5 &= -15;
                }
                if ((i3 & 2) != 0) {
                    typographyT = MaterialTheme.f22169n.t(composerKN, 6);
                    i5 &= -113;
                }
                if ((i3 & 4) != 0) {
                    shapesRl = MaterialTheme.f22169n.rl(composerKN, 6);
                    i5 &= -897;
                }
                colors2 = colorsN;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-891417079, i5, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:63)");
                }
                objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = colors2.n((8191 & 1) != 0 ? colors2.mUb() : 0L, (8191 & 2) != 0 ? colors2.gh() : 0L, (8191 & 4) != 0 ? colors2.qie() : 0L, (8191 & 8) != 0 ? colors2.az() : 0L, (8191 & 16) != 0 ? colors2.t() : 0L, (8191 & 32) != 0 ? colors2.ty() : 0L, (8191 & 64) != 0 ? colors2.nr() : 0L, (8191 & 128) != 0 ? colors2.Uo() : 0L, (8191 & 256) != 0 ? colors2.KN() : 0L, (8191 & 512) != 0 ? colors2.O() : 0L, (8191 & 1024) != 0 ? colors2.xMQ() : 0L, (8191 & 2048) != 0 ? colors2.J2() : 0L, (8191 & 4096) != 0 ? colors2.HI() : false);
                    composerKN.o(objIF);
                }
                Colors colors3 = (Colors) objIF;
                ColorsKt.xMQ(colors3, colors2);
                CompositionLocalKt.t(new ProvidedValue[]{ColorsKt.O().nr(colors3), ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.t(composerKN, 6))), IndicationKt.n().nr(RippleKt.J2(false, 0.0f, 0L, 7, null)), ShapesKt.n().nr(shapesRl), TextSelectionColorsKt.rl().nr(MaterialTextSelectionColorsKt.O(colors3, composerKN, 0)), TypographyKt.t().nr(typographyT)}, ComposableLambdaKt.nr(-1740102967, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1
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
                        if (!composer2.HI((i10 & 3) != 2, i10 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1740102967, i10, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:81)");
                        }
                        TextStyle body1 = typographyT.getBody1();
                        final Function2 function22 = function2;
                        TextKt.n(body1, ComposableLambdaKt.nr(181426554, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i11) {
                                if (!composer3.HI((i11 & 3) != 2, i11 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(181426554, i11, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:81)");
                                }
                                MaterialTheme_androidKt.n(function22, composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
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
                colors2 = colorsN;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                }
                Colors colors32 = (Colors) objIF;
                ColorsKt.xMQ(colors32, colors2);
                CompositionLocalKt.t(new ProvidedValue[]{ColorsKt.O().nr(colors32), ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.t(composerKN, 6))), IndicationKt.n().nr(RippleKt.J2(false, 0.0f, 0L, 7, null)), ShapesKt.n().nr(shapesRl), TextSelectionColorsKt.rl().nr(MaterialTextSelectionColorsKt.O(colors32, composerKN, 0)), TypographyKt.t().nr(typographyT)}, ComposableLambdaKt.nr(-1740102967, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1
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
                        if (!composer2.HI((i10 & 3) != 2, i10 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1740102967, i10, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:81)");
                        }
                        TextStyle body1 = typographyT.getBody1();
                        final Function2 function22 = function2;
                        TextKt.n(body1, ComposableLambdaKt.nr(181426554, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i11) {
                                if (!composer3.HI((i11 & 3) != 2, i11 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(181426554, i11, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:81)");
                                }
                                MaterialTheme_androidKt.n(function22, composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                if (ComposerKt.v()) {
                }
            }
        } else {
            composerKN.wTp();
            colors2 = colorsN;
        }
        final Typography typography2 = typographyT;
        final Shapes shapes2 = shapesRl;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Colors colors4 = colors2;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$2
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
                    MaterialThemeKt.n(colors4, typography2, shapes2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
