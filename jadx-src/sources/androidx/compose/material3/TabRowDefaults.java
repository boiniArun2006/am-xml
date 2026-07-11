package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.material3.tokens.SecondaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ\u0019\u0010\u0015\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001a\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010!\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0017\u0010#\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&²\u0006\f\u0010$\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/TabRowDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "height", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "", c.f62177j, "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "width", "Landroidx/compose/ui/graphics/Shape;", "shape", "rl", "(Landroidx/compose/ui/Modifier;FFJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "t", "Landroidx/compose/material3/TabPosition;", "currentTabPosition", "xMQ", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TabPosition;)Landroidx/compose/ui/Modifier;", "F", "J2", "()F", "ScrollableTabRowEdgeStartPadding", "nr", "(Landroidx/compose/runtime/Composer;I)J", "primaryContainerColor", "Uo", "secondaryContainerColor", "O", "primaryContentColor", "KN", "secondaryContentColor", "currentTabWidth", "indicatorOffset", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1361:1\n148#2:1362\n148#2:1364\n135#3:1363\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n1227#1:1362\n1158#1:1364\n1267#1:1363\n*E\n"})
public final class TabRowDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TabRowDefaults f28102n = new TabRowDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float ScrollableTabRowEdgeStartPadding = Dp.KN(52);

    public final float J2() {
        return ScrollableTabRowEdgeStartPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Modifier modifier, float f3, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        long j3;
        long jUo;
        final long j4;
        Composer composerKN = composer.KN(1454716052);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            j3 = j2;
            i5 |= ((i3 & 4) == 0 && composerKN.nr(j3)) ? 256 : 128;
        } else {
            j3 = j2;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            j4 = j3;
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if (i7 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i8 != 0) {
                    f3 = PrimaryNavigationTabTokens.f29838n.rl();
                }
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                    jUo = ColorSchemeKt.Uo(MaterialTheme.f26164n.n(composerKN, 6), PrimaryNavigationTabTokens.f29838n.n());
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1454716052, i5, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1209)");
                }
                BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier, 0.0f, 1, null), f3), jUo, null, 2, null), composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                j4 = jUo;
            } else {
                composerKN.wTp();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
            }
            jUo = j3;
            composerKN.S();
            if (ComposerKt.v()) {
            }
            BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier, 0.0f, 1, null), f3), jUo, null, 2, null), composerKN, 0);
            if (ComposerKt.v()) {
            }
            j4 = jUo;
        }
        final Modifier modifier2 = modifier;
        final float f4 = f3;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$Indicator$1
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
                    this.f28104n.n(modifier2, f4, j4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(Modifier modifier, float f3, float f4, long j2, Shape shape, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        float fKN;
        int i7;
        float fRl;
        long jXMQ;
        int i8;
        Shape shapeT;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1895596205);
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
                fKN = f3;
                i5 |= composerKN.rl(fKN) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    fRl = f4;
                    i5 |= composerKN.rl(fRl) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        jXMQ = j2;
                        int i11 = composerKN.nr(jXMQ) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        jXMQ = j2;
                    }
                    i5 |= i11;
                } else {
                    jXMQ = j2;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        shapeT = shape;
                        i5 |= composerKN.p5(shapeT) ? 16384 : 8192;
                    }
                    if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i10 != 0) {
                                fKN = Dp.KN(24);
                            }
                            if (i7 != 0) {
                                fRl = PrimaryNavigationTabTokens.f29838n.rl();
                            }
                            if ((i3 & 8) != 0) {
                                jXMQ = ColorSchemeKt.xMQ(PrimaryNavigationTabTokens.f29838n.n(), composerKN, 6);
                                i5 &= -7169;
                            }
                            if (i8 != 0) {
                                shapeT = PrimaryNavigationTabTokens.f29838n.t();
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            modifier3 = modifier2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1895596205, i5, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1230)");
                        }
                        SpacerKt.n(BackgroundKt.t(SizeKt.o(SizeKt.qie(modifier3, fRl), fKN), jXMQ, shapeT), composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                    }
                    final float f5 = fKN;
                    final float f6 = fRl;
                    final long j3 = jXMQ;
                    final Shape shape2 = shapeT;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
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
                                this.f28111n.rl(modifier3, f5, f6, j3, shape2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                shapeT = shape;
                if ((i5 & 9363) == 9362) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        SpacerKt.n(BackgroundKt.t(SizeKt.o(SizeKt.qie(modifier3, fRl), fKN), jXMQ, shapeT), composerKN, 0);
                        if (ComposerKt.v()) {
                        }
                    }
                }
                final float f53 = fKN;
                final float f62 = fRl;
                final long j32 = jXMQ;
                final Shape shape22 = shapeT;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            fRl = f4;
            if ((i2 & 3072) == 0) {
            }
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            shapeT = shape;
            if ((i5 & 9363) == 9362) {
            }
            final float f532 = fKN;
            final float f622 = fRl;
            final long j322 = jXMQ;
            final Shape shape222 = shapeT;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        fKN = f3;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        fRl = f4;
        if ((i2 & 3072) == 0) {
        }
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        shapeT = shape;
        if ((i5 & 9363) == 9362) {
        }
        final float f5322 = fKN;
        final float f6222 = fRl;
        final long j3222 = jXMQ;
        final Shape shape2222 = shapeT;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(Modifier modifier, float f3, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        long j3;
        long jXMQ;
        final long j4;
        Composer composerKN = composer.KN(-1498258020);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            j3 = j2;
            i5 |= ((i3 & 4) == 0 && composerKN.nr(j3)) ? 256 : 128;
        } else {
            j3 = j2;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            j4 = j3;
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if (i7 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i8 != 0) {
                    f3 = PrimaryNavigationTabTokens.f29838n.rl();
                }
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                    jXMQ = ColorSchemeKt.xMQ(PrimaryNavigationTabTokens.f29838n.n(), composerKN, 6);
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1498258020, i5, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1252)");
                }
                BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier, 0.0f, 1, null), f3), jXMQ, null, 2, null), composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                j4 = jXMQ;
            } else {
                composerKN.wTp();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
            }
            jXMQ = j3;
            composerKN.S();
            if (ComposerKt.v()) {
            }
            BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier, 0.0f, 1, null), f3), jXMQ, null, 2, null), composerKN, 0);
            if (ComposerKt.v()) {
            }
            j4 = jXMQ;
        }
        final Modifier modifier2 = modifier;
        final float f4 = f3;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$SecondaryIndicator$1
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
                    this.f28116n.t(modifier2, f4, j4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    private TabRowDefaults() {
    }

    public final long KN(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1166419479, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1189)");
        }
        long jXMQ = ColorSchemeKt.xMQ(SecondaryNavigationTabTokens.f29859n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final long O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1410362619, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1185)");
        }
        long jXMQ = ColorSchemeKt.xMQ(PrimaryNavigationTabTokens.f29838n.nr(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final long Uo(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1938007129, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1173)");
        }
        long jXMQ = ColorSchemeKt.xMQ(SecondaryNavigationTabTokens.f29859n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final long nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2069154037, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1169)");
        }
        long jXMQ = ColorSchemeKt.xMQ(PrimaryNavigationTabTokens.f29838n.O(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final Modifier xMQ(Modifier modifier, final TabPosition tabPosition) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("tabIndicatorOffset");
                    inspectorInfo.t(tabPosition);
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }
}
