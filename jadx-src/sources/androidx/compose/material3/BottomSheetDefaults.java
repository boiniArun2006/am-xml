package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u000b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u000b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010#\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "width", "height", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "", c.f62177j, "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "rl", "F", "t", "()F", "Elevation", "Uo", "SheetPeekHeight", "nr", "J2", "SheetMaxWidth", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "ExpandedShape", "(Landroidx/compose/runtime/Composer;I)J", "ContainerColor", "O", "ScrimColor", "Landroidx/compose/foundation/layout/WindowInsets;", "KN", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n180#2:437\n1223#3,6:438\n148#4:444\n148#4:445\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n*L\n328#1:437\n331#1:438,6\n310#1:444\n313#1:445\n*E\n"})
public final class BottomSheetDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BottomSheetDefaults f24481n = new BottomSheetDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Elevation = SheetBottomTokens.f29877n.J2();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float SheetPeekHeight = Dp.KN(56);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float SheetMaxWidth = Dp.KN(640);

    public final float J2() {
        return SheetMaxWidth;
    }

    public final float Uo() {
        return SheetPeekHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Modifier modifier, float f3, float f4, Shape shape, long j2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        float fO;
        int i7;
        float fNr;
        Shape extraLarge;
        long j3;
        int i8;
        final float f5;
        Shape shape2;
        Modifier modifier3;
        final float f6;
        long jXMQ;
        final String strN;
        boolean zP5;
        Object objIF;
        Composer composer2;
        final Modifier modifier4;
        final float f7;
        final Shape shape3;
        final long j4;
        final float f8;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1364277227);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                fO = f3;
                i5 |= composerKN.rl(fO) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    fNr = f4;
                    i5 |= composerKN.rl(fNr) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        extraLarge = shape;
                        int i11 = composerKN.p5(extraLarge) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        extraLarge = shape;
                    }
                    i5 |= i11;
                } else {
                    extraLarge = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j3 = j2;
                        int i12 = composerKN.nr(j3) ? 16384 : 8192;
                        i5 |= i12;
                    } else {
                        j3 = j2;
                    }
                    i5 |= i12;
                } else {
                    j3 = j2;
                }
                if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier4 = modifier2;
                    f8 = fO;
                    f7 = fNr;
                    shape3 = extraLarge;
                    j4 = j3;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i10 != 0) {
                            fO = SheetBottomTokens.f29877n.O();
                        }
                        if (i7 != 0) {
                            fNr = SheetBottomTokens.f29877n.nr();
                        }
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                            extraLarge = MaterialTheme.f26164n.rl(composerKN, 6).getExtraLarge();
                        }
                        if ((i3 & 16) == 0) {
                            i8 = i5 & (-57345);
                            f5 = fNr;
                            shape2 = extraLarge;
                            modifier3 = modifier2;
                            f6 = fO;
                            jXMQ = ColorSchemeKt.xMQ(SheetBottomTokens.f29877n.t(), composerKN, 6);
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1364277227, i8, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:326)");
                        }
                        Strings.Companion companion = Strings.INSTANCE;
                        strN = Strings_androidKt.n(Strings.n(R.string.f27138t), composerKN, 0);
                        Modifier modifierGh = PaddingKt.gh(modifier3, 0.0f, SheetDefaultsKt.f27525n, 1, null);
                        zP5 = composerKN.p5(strN);
                        objIF = composerKN.iF();
                        if (zP5 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
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
                                    SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                                }
                            };
                            composerKN.o(objIF);
                        }
                        int i13 = i8 >> 6;
                        composer2 = composerKN;
                        SurfaceKt.n(SemanticsModifierKt.nr(modifierGh, false, (Function1) objIF, 1, null), shape2, jXMQ, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                                if ((i14 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1039573072, i14, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:336)");
                                }
                                BoxKt.n(SizeKt.S(Modifier.INSTANCE, f6, f5), composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, (i13 & 112) | 12582912 | (i13 & 896), b.f61769v);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier4 = modifier3;
                        f7 = f5;
                        shape3 = shape2;
                        j4 = jXMQ;
                        f8 = f6;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                    }
                    modifier3 = modifier2;
                    i8 = i5;
                    f6 = fO;
                    f5 = fNr;
                    shape2 = extraLarge;
                    jXMQ = j3;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Strings.Companion companion2 = Strings.INSTANCE;
                    strN = Strings_androidKt.n(Strings.n(R.string.f27138t), composerKN, 0);
                    Modifier modifierGh2 = PaddingKt.gh(modifier3, 0.0f, SheetDefaultsKt.f27525n, 1, null);
                    zP5 = composerKN.p5(strN);
                    objIF = composerKN.iF();
                    if (zP5) {
                        objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
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
                                SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                            }
                        };
                        composerKN.o(objIF);
                        int i132 = i8 >> 6;
                        composer2 = composerKN;
                        SurfaceKt.n(SemanticsModifierKt.nr(modifierGh2, false, (Function1) objIF, 1, null), shape2, jXMQ, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                                if ((i14 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1039573072, i14, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:336)");
                                }
                                BoxKt.n(SizeKt.S(Modifier.INSTANCE, f6, f5), composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, (i132 & 112) | 12582912 | (i132 & 896), b.f61769v);
                        if (ComposerKt.v()) {
                        }
                        modifier4 = modifier3;
                        f7 = f5;
                        shape3 = shape2;
                        j4 = jXMQ;
                        f8 = f6;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
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
                            this.f24489n.n(modifier4, f8, f7, shape3, j4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            fNr = f4;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i5 & 9363) == 9362) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if ((i3 & 16) == 0) {
                        modifier3 = modifier2;
                        i8 = i5;
                        f6 = fO;
                        f5 = fNr;
                        shape2 = extraLarge;
                        jXMQ = j3;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Strings.Companion companion22 = Strings.INSTANCE;
                    strN = Strings_androidKt.n(Strings.n(R.string.f27138t), composerKN, 0);
                    Modifier modifierGh22 = PaddingKt.gh(modifier3, 0.0f, SheetDefaultsKt.f27525n, 1, null);
                    zP5 = composerKN.p5(strN);
                    objIF = composerKN.iF();
                    if (zP5) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        fO = f3;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        fNr = f4;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public final float t() {
        return Elevation;
    }

    private BottomSheetDefaults() {
    }

    public final WindowInsets KN(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-511309409, i2, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:316)");
        }
        WindowInsets windowInsetsKN = WindowInsetsKt.KN(WindowInsets_androidKt.rl(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.O());
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowInsetsKN;
    }

    public final long O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2040719176, i2, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:306)");
        }
        long jAz = Color.az(ColorSchemeKt.xMQ(ScrimTokens.f29851n.n(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jAz;
    }

    public final Shape nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1683783414, i2, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:295)");
        }
        Shape shapeO = ShapesKt.O(SheetBottomTokens.f29877n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final long rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(433375448, i2, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:299)");
        }
        long jXMQ = ColorSchemeKt.xMQ(SheetBottomTokens.f29877n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }
}
