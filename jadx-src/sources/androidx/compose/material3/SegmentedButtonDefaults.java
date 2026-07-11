package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJC\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\"\u001a\u00020\u0004*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/SegmentedButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/SegmentedButtonColors;", "O", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SegmentedButtonColors;", "", c.f62177j, "(Landroidx/compose/runtime/Composer;I)V", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "activeContent", "inactiveContent", "rl", "(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/foundation/BorderStroke;", "t", "(JF)Landroidx/compose/foundation/BorderStroke;", "F", "J2", "()F", "BorderWidth", "KN", "IconSize", "Landroidx/compose/material3/ColorScheme;", "Uo", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SegmentedButtonColors;", "defaultSegmentedButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,774:1\n1#2:775\n*E\n"})
public final class SegmentedButtonDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SegmentedButtonDefaults f27433n = new SegmentedButtonDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float BorderWidth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    static {
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.f29772n;
        BorderWidth = outlinedSegmentedButtonTokens.KN();
        IconSize = outlinedSegmentedButtonTokens.O();
    }

    public static /* synthetic */ BorderStroke nr(SegmentedButtonDefaults segmentedButtonDefaults, long j2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = BorderWidth;
        }
        return segmentedButtonDefaults.t(j2, f3);
    }

    public final float J2() {
        return BorderWidth;
    }

    public final float KN() {
        return IconSize;
    }

    public final SegmentedButtonColors Uo(ColorScheme colorScheme) {
        SegmentedButtonColors defaultSegmentedButtonColorsCached = colorScheme.getDefaultSegmentedButtonColorsCached();
        if (defaultSegmentedButtonColorsCached != null) {
            return defaultSegmentedButtonColorsCached;
        }
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.f29772n;
        SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.xMQ()), ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.mUb()), ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.Uo()), colorScheme.getSurface(), ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.gh()), ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.Uo()), ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.xMQ()), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.rl()), outlinedSegmentedButtonTokens.t(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.Uo()), outlinedSegmentedButtonTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface(), ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.rl()), ColorSchemeKt.Uo(colorScheme, outlinedSegmentedButtonTokens.Uo()), null);
        colorScheme.HBN(segmentedButtonColors);
        return segmentedButtonColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(final boolean z2, Function2 function2, Function2 function22, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i5;
        Function2 function23;
        int i7;
        Function2 function24;
        final Function2 function2N;
        final Function2 function25;
        final Function2 function26;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(683517296);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function23 = function2;
                i5 |= composerKN.E2(function23) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function24 = function22;
                    i5 |= composerKN.E2(function24) ? 256 : 128;
                }
                if ((i5 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    function2N = function23;
                    function26 = function24;
                } else {
                    function2N = i8 == 0 ? ComposableSingletons$SegmentedButtonKt.f25106n.n() : function23;
                    function25 = i7 == 0 ? null : function24;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(683517296, i5, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:566)");
                    }
                    if (function25 != null) {
                        composerKN.eF(1631306250);
                        AnimatedVisibilityKt.mUb(z3, null, EnterExitTransitionKt.HI(AnimationSpecKt.ty(350, 0, null, 6, null), 0.0f, 2, null).t(EnterExitTransitionKt.r(AnimationSpecKt.ty(350, 0, null, 6, null), 0.0f, TransformOriginKt.n(0.0f, 1.0f))), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(-750750819, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonDefaults$Icon$1
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                n(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, int i9) {
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-750750819, i9, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:579)");
                                }
                                function2N.invoke(composer2, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i5 & 14) | 196608, 18);
                        composerKN = composerKN;
                        composerKN.Xw();
                    } else {
                        composerKN.eF(1631842116);
                        CrossfadeKt.rl(Boolean.valueOf(z2), null, null, null, ComposableLambdaKt.nr(-1364873619, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonDefaults$Icon$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                                n(bool.booleanValue(), composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(boolean z4, Composer composer2, int i9) {
                                Function2 function27;
                                if ((i9 & 6) == 0) {
                                    i9 |= composer2.n(z4) ? 4 : 2;
                                }
                                if ((i9 & 19) == 18 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1364873619, i9, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:582)");
                                }
                                if (z4) {
                                    composer2.eF(94251810);
                                    function27 = function2N;
                                } else {
                                    composer2.eF(94252484);
                                    function27 = function25;
                                }
                                function27.invoke(composer2, 0);
                                composer2.Xw();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i5 & 14) | 24576, 14);
                        composerKN.Xw();
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    function26 = function25;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonDefaults$Icon$3
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
                            this.f27441n.rl(z2, function2N, function26, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            function24 = function22;
            if ((i5 & 147) == 146) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                if (function25 != null) {
                }
                if (ComposerKt.v()) {
                }
                function26 = function25;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function23 = function2;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        function24 = function22;
        if ((i5 & 147) == 146) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private SegmentedButtonDefaults() {
    }

    public final SegmentedButtonColors O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(679457321, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:431)");
        }
        SegmentedButtonColors segmentedButtonColorsUo = Uo(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return segmentedButtonColorsUo;
    }

    public final void n(Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composerKN = composer.KN(-1273041460);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(this)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1273041460, i3, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:545)");
            }
            IconKt.nr(CheckKt.n(Icons.Filled.f23862n), null, SizeKt.Z(Modifier.INSTANCE, IconSize), 0L, composerKN, 48, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonDefaults$ActiveIcon$1
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
                    this.f27435n.n(composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public final BorderStroke t(long color, float width) {
        return BorderStrokeKt.n(width, color);
    }
}
