package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.NavigationBarArrangement;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\u001aW\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u009d\u0001\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"\"\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$\"\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$\"\u0014\u0010*\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$\"\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00108\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105\"\u0014\u0010:\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105\"\u0014\u0010;\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00105\"\u0014\u0010=\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00105\"\u0014\u0010?\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010$\"\u001a\u0010C\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\bA\u0010B\"\u001a\u0010F\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010$\u001a\u0004\bE\u0010B\"\u001a\u0010I\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010$\u001a\u0004\bH\u0010B\"\u001a\u0010L\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010$\u001a\u0004\bK\u0010B\"\u001a\u0010O\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010$\u001a\u0004\bN\u0010B\"\u001a\u0010R\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010$\u001a\u0004\bQ\u0010B\"\u001a\u0010U\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010$\u001a\u0004\bT\u0010B\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/NavigationBarArrangement;", "arrangement", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "selected", "onClick", "icon", "enabled", "label", "badge", "Landroidx/compose/material3/NavigationItemIconPosition;", "iconPosition", "Landroidx/compose/material3/NavigationItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "rl", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/NavigationItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "", "itemsCount", "barWidth", "mUb", "(II)I", "Landroidx/compose/ui/unit/Dp;", "F", "IconSize", "TopIconItemActiveIndicatorWidth", "t", "TopIconItemActiveIndicatorHeight", "nr", "StartIconItemActiveIndicatorHeight", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "O", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "J2", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Uo", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIconColor", "KN", "ActiveLabelTextColor", "xMQ", "ActiveIndicatorColor", "InactiveIconColor", "gh", "InactiveLabelTextColor", "qie", "NavigationBarHeight", "az", "getTopIconItemVerticalPadding", "()F", "TopIconItemVerticalPadding", "ty", "getTopIconIndicatorVerticalPadding", "TopIconIndicatorVerticalPadding", "HI", "getTopIconIndicatorHorizontalPadding", "TopIconIndicatorHorizontalPadding", "ck", "getStartIconIndicatorVerticalPadding", "StartIconIndicatorVerticalPadding", "Ik", "getTopIconIndicatorToLabelPadding", "TopIconIndicatorToLabelPadding", "r", "getStartIconIndicatorHorizontalPadding", "StartIconIndicatorHorizontalPadding", "o", "getStartIconToLabelPadding", "StartIconToLabelPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/ExpressiveNavigationBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,459:1\n1223#2,6:460\n158#3:466\n148#3:467\n148#3:468\n148#3:469\n148#3:470\n148#3:471\n148#3:478\n148#3:479\n148#3:480\n56#4:472\n71#4:473\n56#4:474\n71#4:475\n56#4:476\n71#4:477\n*S KotlinDebug\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/ExpressiveNavigationBarKt\n*L\n200#1:460,6\n430#1:466\n431#1:467\n432#1:468\n433#1:469\n443#1:470\n446#1:471\n454#1:478\n456#1:479\n458#1:480\n448#1:472\n448#1:473\n450#1:474\n450#1:475\n452#1:476\n452#1:477\n*E\n"})
public final class ExpressiveNavigationBarKt {
    private static final float HI;
    private static final float Ik;
    private static final ShapeKeyTokens J2;
    private static final ColorSchemeKeyTokens KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final TypographyKeyTokens f25848O;
    private static final ColorSchemeKeyTokens Uo;
    private static final float az;
    private static final float ck;
    private static final ColorSchemeKeyTokens gh;
    private static final ColorSchemeKeyTokens mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f25849n;
    private static final float nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f25850o;
    private static final float qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f25851r;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f25852t;
    private static final float ty;
    private static final ColorSchemeKeyTokens xMQ;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mUb(int i2, int i3) {
        if (i2 > 6) {
            return 0;
        }
        return MathKt.roundToInt((((100 - ((i2 + 3) * 10)) / 2.0f) / 100) * i3);
    }

    static {
        float fKN = Dp.KN((float) 24.0d);
        f25849n = fKN;
        float fKN2 = Dp.KN(56);
        rl = fKN2;
        float fKN3 = Dp.KN(32);
        f25852t = fKN3;
        float fKN4 = Dp.KN(40);
        nr = fKN4;
        f25848O = TypographyKeyTokens.LabelMedium;
        J2 = ShapeKeyTokens.CornerFull;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Secondary;
        Uo = colorSchemeKeyTokens;
        KN = colorSchemeKeyTokens;
        xMQ = ColorSchemeKeyTokens.SecondaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        mUb = colorSchemeKeyTokens2;
        gh = colorSchemeKeyTokens2;
        qie = Dp.KN(64);
        az = Dp.KN(6);
        float f3 = 2;
        ty = Dp.KN(Dp.KN(fKN3 - fKN) / f3);
        HI = Dp.KN(Dp.KN(fKN2 - fKN) / f3);
        ck = Dp.KN(Dp.KN(fKN4 - fKN) / f3);
        float f4 = 4;
        Ik = Dp.KN(f4);
        f25851r = Dp.KN(16);
        f25850o = Dp.KN(f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, long j3, WindowInsets windowInsets, int i2, final Function2 function2, Composer composer, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        long jRl;
        long jT2;
        final WindowInsets windowInsetsNr;
        int i8;
        final Modifier modifier3;
        final int iN;
        long j4;
        long j5;
        Composer composer2;
        final Modifier modifier4;
        final WindowInsets windowInsets2;
        final long j6;
        final int i9;
        final long j7;
        Composer composerKN = composer.KN(-1171105467);
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
                jRl = j2;
                int i11 = composerKN.nr(jRl) ? 32 : 16;
                i7 |= i11;
            } else {
                jRl = j2;
            }
            i7 |= i11;
        } else {
            jRl = j2;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            jT2 = j3;
            i7 |= ((i5 & 4) == 0 && composerKN.nr(jT2)) ? 256 : 128;
        } else {
            jT2 = j3;
        }
        if ((i3 & 3072) == 0) {
            if ((i5 & 8) == 0) {
                windowInsetsNr = windowInsets;
                int i12 = composerKN.p5(windowInsetsNr) ? 2048 : 1024;
                i7 |= i12;
            } else {
                windowInsetsNr = windowInsets;
            }
            i7 |= i12;
        } else {
            windowInsetsNr = windowInsets;
        }
        if ((i3 & 24576) == 0) {
            if ((i5 & 16) == 0) {
                i8 = i2;
                int i13 = composerKN.t(i8) ? 16384 : 8192;
                i7 |= i13;
            } else {
                i8 = i2;
            }
            i7 |= i13;
        } else {
            i8 = i2;
        }
        if ((i5 & 32) != 0) {
            i7 |= 196608;
        } else if ((i3 & 196608) == 0) {
            i7 |= composerKN.E2(function2) ? 131072 : 65536;
        }
        if ((74899 & i7) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
            modifier4 = modifier2;
            j7 = jRl;
            windowInsets2 = windowInsetsNr;
            j6 = jT2;
            i9 = i8;
        } else {
            composerKN.e();
            if ((i3 & 1) == 0 || composerKN.rV9()) {
                modifier3 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i5 & 2) != 0) {
                    jRl = ExpressiveNavigationBarDefaults.f25846n.rl(composerKN, 6);
                    i7 &= -113;
                }
                if ((i5 & 4) != 0) {
                    jT2 = ExpressiveNavigationBarDefaults.f25846n.t(composerKN, 6);
                    i7 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i7 &= -7169;
                    windowInsetsNr = ExpressiveNavigationBarDefaults.f25846n.nr(composerKN, 6);
                }
                if ((i5 & 16) != 0) {
                    iN = ExpressiveNavigationBarDefaults.f25846n.n();
                    i7 &= -57345;
                    j4 = jRl;
                    j5 = jT2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1171105467, i7, -1, "androidx.compose.material3.ExpressiveNavigationBar (ExpressiveNavigationBar.kt:88)");
                }
                int i14 = i7 << 3;
                composer2 = composerKN;
                SurfaceKt.n(null, null, j4, j5, 0.0f, 0.0f, null, ComposableLambdaKt.nr(1573697866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBar$1
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
                        Object centeredContentMeasurePolicy;
                        if ((i15 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1573697866, i15, -1, "androidx.compose.material3.ExpressiveNavigationBar.<anonymous> (ExpressiveNavigationBar.kt:93)");
                        }
                        Modifier modifierN = SelectableGroupKt.n(SizeKt.rl(WindowInsetsPaddingKt.nr(modifier3, windowInsetsNr), 0.0f, ExpressiveNavigationBarKt.qie, 1, null));
                        int i16 = iN;
                        NavigationBarArrangement.Companion companion = NavigationBarArrangement.INSTANCE;
                        if (NavigationBarArrangement.O(i16, companion.rl())) {
                            centeredContentMeasurePolicy = new EqualWeightContentMeasurePolicy();
                        } else {
                            if (!NavigationBarArrangement.O(i16, companion.n())) {
                                throw new IllegalArgumentException("Invalid ItemsArrangement value.");
                            }
                            centeredContentMeasurePolicy = new CenteredContentMeasurePolicy();
                        }
                        Function2 function22 = function2;
                        int iN2 = ComposablesKt.n(composer3, 0);
                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer3.T();
                        if (composer3.getInserting()) {
                            composer3.s7N(function0N);
                        } else {
                            composer3.r();
                        }
                        Composer composerN = Updater.n(composer3);
                        Updater.O(composerN, centeredContentMeasurePolicy, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN2))) {
                            composerN.o(Integer.valueOf(iN2));
                            composerN.az(Integer.valueOf(iN2), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        function22.invoke(composer3, 0);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composer2, (i14 & 896) | 12582912 | (i14 & 7168), 115);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
                windowInsets2 = windowInsetsNr;
                j6 = j5;
                i9 = iN;
                j7 = j4;
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
                if ((i5 & 16) != 0) {
                    i7 &= -57345;
                }
                modifier3 = modifier2;
            }
            j5 = jT2;
            iN = i8;
            j4 = jRl;
            composerKN.S();
            if (ComposerKt.v()) {
            }
            int i142 = i7 << 3;
            composer2 = composerKN;
            SurfaceKt.n(null, null, j4, j5, 0.0f, 0.0f, null, ComposableLambdaKt.nr(1573697866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBar$1
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
                    Object centeredContentMeasurePolicy;
                    if ((i15 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1573697866, i15, -1, "androidx.compose.material3.ExpressiveNavigationBar.<anonymous> (ExpressiveNavigationBar.kt:93)");
                    }
                    Modifier modifierN = SelectableGroupKt.n(SizeKt.rl(WindowInsetsPaddingKt.nr(modifier3, windowInsetsNr), 0.0f, ExpressiveNavigationBarKt.qie, 1, null));
                    int i16 = iN;
                    NavigationBarArrangement.Companion companion = NavigationBarArrangement.INSTANCE;
                    if (NavigationBarArrangement.O(i16, companion.rl())) {
                        centeredContentMeasurePolicy = new EqualWeightContentMeasurePolicy();
                    } else {
                        if (!NavigationBarArrangement.O(i16, companion.n())) {
                            throw new IllegalArgumentException("Invalid ItemsArrangement value.");
                        }
                        centeredContentMeasurePolicy = new CenteredContentMeasurePolicy();
                    }
                    Function2 function22 = function2;
                    int iN2 = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer3.T();
                    if (composer3.getInserting()) {
                        composer3.s7N(function0N);
                    } else {
                        composer3.r();
                    }
                    Composer composerN = Updater.n(composer3);
                    Updater.O(composerN, centeredContentMeasurePolicy, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN2))) {
                        composerN.o(Integer.valueOf(iN2));
                        composerN.az(Integer.valueOf(iN2), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    function22.invoke(composer3, 0);
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composer2, (i142 & 896) | 12582912 | (i142 & 7168), 115);
            if (ComposerKt.v()) {
            }
            modifier4 = modifier3;
            windowInsets2 = windowInsetsNr;
            j6 = j5;
            i9 = iN;
            j7 = j4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBar$2
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
                    ExpressiveNavigationBarKt.n(modifier4, j7, j6, windowInsets2, i9, function2, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, final Function0 function0, final Function2 function2, Modifier modifier, boolean z3, Function2 function22, Function2 function23, int i2, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i3, final int i5) {
        boolean z4;
        int i7;
        Function0 function02;
        Function2 function24;
        int i8;
        Modifier modifier2;
        int i9;
        boolean z5;
        int i10;
        Function2 function25;
        int i11;
        Function2 function26;
        int i12;
        int i13;
        int i14;
        int i15;
        int iN;
        NavigationItemColors navigationItemColorsN;
        int i16;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        NavigationItemColors navigationItemColors2;
        boolean z6;
        Function2 function27;
        Function2 function28;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource4;
        final NavigationItemColors navigationItemColors3;
        final Modifier modifier4;
        final boolean z7;
        final Function2 function29;
        final Function2 function210;
        final int i17;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1250474866);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i3 & 6) == 0) {
                i7 = (composerKN.n(z4) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i3 & 48) == 0) {
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function24 = function2;
                i7 |= composerKN.E2(function24) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z5 = z3;
                        i7 |= composerKN.n(z5) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                    } else {
                        if ((196608 & i3) == 0) {
                            function25 = function22;
                            i7 |= composerKN.E2(function25) ? 131072 : 65536;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else {
                            if ((1572864 & i3) == 0) {
                                function26 = function23;
                                i7 |= composerKN.E2(function26) ? 1048576 : 524288;
                            }
                            i12 = i5 & 128;
                            if (i12 == 0) {
                                i7 |= 12582912;
                            } else {
                                if ((i3 & 12582912) == 0) {
                                    i13 = i12;
                                    i7 |= composerKN.t(i2) ? 8388608 : 4194304;
                                }
                                if ((i3 & 100663296) == 0) {
                                    i7 |= ((i5 & 256) == 0 && composerKN.p5(navigationItemColors)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                i14 = i5 & 512;
                                if (i14 == 0) {
                                    if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i15 = i14;
                                        i7 |= composerKN.p5(mutableInteractionSource) ? 536870912 : 268435456;
                                    }
                                    int i18 = i7;
                                    if ((i7 & 306783379) == 306783378 || !composerKN.xMQ()) {
                                        composerKN.e();
                                        if ((i3 & 1) != 0 || composerKN.rV9()) {
                                            if (i8 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i9 != 0) {
                                                z5 = true;
                                            }
                                            if (i10 != 0) {
                                                function25 = null;
                                            }
                                            if (i11 != 0) {
                                                function26 = null;
                                            }
                                            iN = i13 == 0 ? NavigationItemIconPosition.INSTANCE.n() : i2;
                                            if ((i5 & 256) == 0) {
                                                navigationItemColorsN = ExpressiveNavigationBarItemDefaults.f25847n.n(composerKN, 6);
                                                i16 = i18 & (-234881025);
                                            } else {
                                                navigationItemColorsN = navigationItemColors;
                                                i16 = i18;
                                            }
                                            mutableInteractionSource2 = i15 == 0 ? mutableInteractionSource : null;
                                            modifier3 = modifier2;
                                            navigationItemColors2 = navigationItemColorsN;
                                        } else {
                                            composerKN.wTp();
                                            if ((i5 & 256) != 0) {
                                                iN = i2;
                                                navigationItemColors2 = navigationItemColors;
                                                i16 = i18 & (-234881025);
                                                modifier3 = modifier2;
                                                z6 = z5;
                                                function27 = function25;
                                                function28 = function26;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                composerKN.S();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1250474866, i16, -1, "androidx.compose.material3.ExpressiveNavigationBarItem (ExpressiveNavigationBar.kt:197)");
                                                }
                                                composerKN.eF(-986536477);
                                                if (mutableInteractionSource2 == null) {
                                                    Object objIF = composerKN.iF();
                                                    if (objIF == Composer.INSTANCE.n()) {
                                                        objIF = InteractionSourceKt.n();
                                                        composerKN.o(objIF);
                                                    }
                                                    mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                }
                                                composerKN.Xw();
                                                boolean zNr = NavigationItemIconPosition.nr(iN, NavigationItemIconPosition.INSTANCE.n());
                                                float f3 = zNr ? HI : f25851r;
                                                float f4 = zNr ? ty : ck;
                                                int i19 = i16 >> 3;
                                                composer2 = composerKN;
                                                int i20 = iN;
                                                NavigationItemKt.n(z4, function02, function24, TypographyKt.t(f25848O, composerKN, 6), ShapesKt.O(J2, composerKN, 6), rl, f3, f4, Ik, f25850o, az, navigationItemColors2, modifier3, z6, function27, function28, i20, mutableInteractionSource3, composer2, (i16 & 14) | 906166272 | (i16 & 112) | (i16 & 896), 6 | ((i16 >> 21) & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016));
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                                mutableInteractionSource4 = mutableInteractionSource2;
                                                navigationItemColors3 = navigationItemColors2;
                                                modifier4 = modifier3;
                                                z7 = z6;
                                                function29 = function27;
                                                function210 = function28;
                                                i17 = i20;
                                            } else {
                                                iN = i2;
                                                navigationItemColors2 = navigationItemColors;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                i16 = i18;
                                                modifier3 = modifier2;
                                            }
                                        }
                                        z6 = z5;
                                        function27 = function25;
                                        function28 = function26;
                                        composerKN.S();
                                        if (ComposerKt.v()) {
                                        }
                                        composerKN.eF(-986536477);
                                        if (mutableInteractionSource2 == null) {
                                        }
                                        composerKN.Xw();
                                        boolean zNr2 = NavigationItemIconPosition.nr(iN, NavigationItemIconPosition.INSTANCE.n());
                                        float f32 = zNr2 ? HI : f25851r;
                                        float f42 = zNr2 ? ty : ck;
                                        int i192 = i16 >> 3;
                                        composer2 = composerKN;
                                        int i202 = iN;
                                        NavigationItemKt.n(z4, function02, function24, TypographyKt.t(f25848O, composerKN, 6), ShapesKt.O(J2, composerKN, 6), rl, f32, f42, Ik, f25850o, az, navigationItemColors2, modifier3, z6, function27, function28, i202, mutableInteractionSource3, composer2, (i16 & 14) | 906166272 | (i16 & 112) | (i16 & 896), 6 | ((i16 >> 21) & 112) | (i192 & 896) | (i192 & 7168) | (57344 & i192) | (458752 & i192) | (i192 & 3670016));
                                        if (ComposerKt.v()) {
                                        }
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        navigationItemColors3 = navigationItemColors2;
                                        modifier4 = modifier3;
                                        z7 = z6;
                                        function29 = function27;
                                        function210 = function28;
                                        i17 = i202;
                                    } else {
                                        composerKN.wTp();
                                        i17 = i2;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        composer2 = composerKN;
                                        modifier4 = modifier2;
                                        z7 = z5;
                                        function29 = function25;
                                        function210 = function26;
                                        navigationItemColors3 = navigationItemColors;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBarItem$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i21) {
                                                ExpressiveNavigationBarKt.rl(z2, function0, function2, modifier4, z7, function29, function210, i17, navigationItemColors3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                i15 = i14;
                                int i182 = i7;
                                if ((i7 & 306783379) == 306783378) {
                                    composerKN.e();
                                    if ((i3 & 1) != 0) {
                                        if (i8 != 0) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        if (i10 != 0) {
                                        }
                                        if (i11 != 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        if ((i5 & 256) == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        modifier3 = modifier2;
                                        navigationItemColors2 = navigationItemColorsN;
                                        z6 = z5;
                                        function27 = function25;
                                        function28 = function26;
                                        composerKN.S();
                                        if (ComposerKt.v()) {
                                        }
                                        composerKN.eF(-986536477);
                                        if (mutableInteractionSource2 == null) {
                                        }
                                        composerKN.Xw();
                                        boolean zNr22 = NavigationItemIconPosition.nr(iN, NavigationItemIconPosition.INSTANCE.n());
                                        float f322 = zNr22 ? HI : f25851r;
                                        float f422 = zNr22 ? ty : ck;
                                        int i1922 = i16 >> 3;
                                        composer2 = composerKN;
                                        int i2022 = iN;
                                        NavigationItemKt.n(z4, function02, function24, TypographyKt.t(f25848O, composerKN, 6), ShapesKt.O(J2, composerKN, 6), rl, f322, f422, Ik, f25850o, az, navigationItemColors2, modifier3, z6, function27, function28, i2022, mutableInteractionSource3, composer2, (i16 & 14) | 906166272 | (i16 & 112) | (i16 & 896), 6 | ((i16 >> 21) & 112) | (i1922 & 896) | (i1922 & 7168) | (57344 & i1922) | (458752 & i1922) | (i1922 & 3670016));
                                        if (ComposerKt.v()) {
                                        }
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        navigationItemColors3 = navigationItemColors2;
                                        modifier4 = modifier3;
                                        z7 = z6;
                                        function29 = function27;
                                        function210 = function28;
                                        i17 = i2022;
                                    }
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i13 = i12;
                            if ((i3 & 100663296) == 0) {
                            }
                            i14 = i5 & 512;
                            if (i14 == 0) {
                            }
                            i15 = i14;
                            int i1822 = i7;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        function26 = function23;
                        i12 = i5 & 128;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        if ((i3 & 100663296) == 0) {
                        }
                        i14 = i5 & 512;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        int i18222 = i7;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function25 = function22;
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    function26 = function23;
                    i12 = i5 & 128;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i3 & 100663296) == 0) {
                    }
                    i14 = i5 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    int i182222 = i7;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                z5 = z3;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                function25 = function22;
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                function26 = function23;
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i3 & 100663296) == 0) {
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                int i1822222 = i7;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            z5 = z3;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            function25 = function22;
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            function26 = function23;
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i3 & 100663296) == 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            int i18222222 = i7;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        function24 = function2;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        z5 = z3;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        function25 = function22;
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        function26 = function23;
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i3 & 100663296) == 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        int i182222222 = i7;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
