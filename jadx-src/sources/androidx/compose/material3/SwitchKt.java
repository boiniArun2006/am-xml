package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001an\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001a\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001c\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017\"\u0014\u0010 \u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017\"\u0014\u0010\"\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020$0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "thumbContent", "enabled", "Landroidx/compose/material3/SwitchColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", c.f62177j, "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/ui/graphics/Shape;", "thumbShape", "rl", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/material3/SwitchColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "F", "xMQ", "()F", "ThumbDiameter", "mUb", "UncheckedThumbDiameter", "t", "SwitchWidth", "nr", "SwitchHeight", "O", "ThumbPadding", "Landroidx/compose/animation/core/SnapSpec;", "", "J2", "Landroidx/compose/animation/core/SnapSpec;", "SnapSpec", "Landroidx/compose/animation/core/TweenSpec;", "Uo", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,625:1\n1223#2,6:626\n71#3:632\n68#3,6:633\n74#3:667\n71#3:669\n69#3,5:670\n74#3:703\n78#3:707\n78#3:711\n78#4,6:639\n85#4,4:654\n89#4,2:664\n78#4,6:675\n85#4,4:690\n89#4,2:700\n93#4:706\n93#4:710\n368#5,9:645\n377#5:666\n368#5,9:681\n377#5:702\n378#5,2:704\n378#5,2:708\n4032#6,6:658\n4032#6,6:694\n71#7:668\n56#7:712\n71#7:713\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n102#1:626,6\n150#1:632\n150#1:633,6\n150#1:667\n155#1:669\n155#1:670,5\n155#1:703\n155#1:707\n150#1:711\n150#1:639,6\n150#1:654,4\n150#1:664,2\n155#1:675,6\n155#1:690,4\n155#1:700,2\n155#1:706\n150#1:710\n150#1:645,9\n150#1:666\n155#1:681,9\n155#1:702\n155#1:704,2\n150#1:708,2\n150#1:658,6\n155#1:694,6\n164#1:668\n622#1:712\n622#1:713\n*E\n"})
public final class SwitchKt {
    private static final SnapSpec J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f28007O;
    private static final TweenSpec Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f28008n;
    private static final float nr;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f28009t;

    static {
        SwitchTokens switchTokens = SwitchTokens.f29933n;
        float fCk = switchTokens.ck();
        f28008n = fCk;
        rl = switchTokens.nY();
        f28009t = switchTokens.WPU();
        float fZ = switchTokens.Z();
        nr = fZ;
        f28007O = Dp.KN(Dp.KN(fZ - fCk) / 2);
        J2 = new SnapSpec(0, 1, null);
        Uo = new TweenSpec(100, 0, null, 6, null);
    }

    public static final float mUb() {
        return rl;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function1 function1, Modifier modifier, Function2 function2, boolean z3, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function22;
        int i8;
        boolean z5;
        SwitchColors switchColorsN;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        int i10;
        boolean z6;
        SwitchColors switchColors2;
        MutableInteractionSource mutableInteractionSource3;
        Function2 function23;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource4;
        Composer composer2;
        final Modifier modifier4;
        final boolean z7;
        final SwitchColors switchColors3;
        final Function2 function24;
        final MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1580463220);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else if ((i2 & 6) == 0) {
            z4 = z2;
            i5 = (composerKN.n(z4) ? 4 : 2) | i2;
        } else {
            z4 = z2;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function22 = function2;
                    i5 |= composerKN.E2(function22) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z5 = z3;
                        i5 |= composerKN.n(z5) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            switchColorsN = switchColors;
                            int i12 = composerKN.p5(switchColorsN) ? 131072 : 65536;
                            i5 |= i12;
                        } else {
                            switchColorsN = switchColors;
                        }
                        i5 |= i12;
                    } else {
                        switchColorsN = switchColors;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i5 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                        if ((i5 & 599187) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier4 = modifier2;
                            composer2 = composerKN;
                            function24 = function22;
                            z7 = z5;
                            switchColors3 = switchColorsN;
                            mutableInteractionSource5 = mutableInteractionSource2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i7 != 0) {
                                    function22 = null;
                                }
                                if (i8 != 0) {
                                    z5 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                    switchColorsN = SwitchDefaults.f28005n.n(composerKN, 6);
                                }
                                if (i9 == 0) {
                                    i10 = i5;
                                    z6 = z5;
                                    switchColors2 = switchColorsN;
                                    mutableInteractionSource3 = null;
                                } else {
                                    i10 = i5;
                                    z6 = z5;
                                    switchColors2 = switchColorsN;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                function23 = function22;
                                modifier3 = modifier5;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                i10 = i5;
                                z6 = z5;
                                switchColors2 = switchColorsN;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function23 = function22;
                                modifier3 = modifier2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1580463220, i10, -1, "androidx.compose.material3.Switch (Switch.kt:99)");
                            }
                            composerKN.eF(783532531);
                            if (mutableInteractionSource3 != null) {
                                Object objIF = composerKN.iF();
                                if (objIF == Composer.INSTANCE.n()) {
                                    objIF = InteractionSourceKt.n();
                                    composerKN.o(objIF);
                                }
                                mutableInteractionSource4 = (MutableInteractionSource) objIF;
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            composerKN.Xw();
                            Modifier modifierN = function1 == null ? ToggleableKt.n(InteractiveComponentSizeKt.rl(Modifier.INSTANCE), z4, mutableInteractionSource4, null, z6, Role.mUb(Role.INSTANCE.Uo()), function1) : Modifier.INSTANCE;
                            int i13 = i10 << 3;
                            int i14 = i10 >> 6;
                            composer2 = composerKN;
                            Modifier modifier6 = modifier3;
                            rl(SizeKt.ck(SizeKt.E2(modifier3.Zmq(modifierN), Alignment.INSTANCE.O(), false, 2, null), f28009t, nr), z2, z6, switchColors2, function23, mutableInteractionSource4, ShapesKt.O(SwitchTokens.f29933n.az(), composerKN, 6), composer2, (i13 & 112) | (i14 & 896) | (i14 & 7168) | (i13 & 57344));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier4 = modifier6;
                            z7 = z6;
                            switchColors3 = switchColors2;
                            function24 = function23;
                            mutableInteractionSource5 = mutableInteractionSource3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt$Switch$1
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
                                    SwitchKt.n(z2, function1, modifier4, function24, z7, switchColors3, mutableInteractionSource5, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i5 & 599187) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i9 == 0) {
                            }
                            function23 = function22;
                            modifier3 = modifier5;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composerKN.eF(783532531);
                            if (mutableInteractionSource3 != null) {
                            }
                            composerKN.Xw();
                            if (function1 == null) {
                            }
                            int i132 = i10 << 3;
                            int i142 = i10 >> 6;
                            composer2 = composerKN;
                            Modifier modifier62 = modifier3;
                            rl(SizeKt.ck(SizeKt.E2(modifier3.Zmq(modifierN), Alignment.INSTANCE.O(), false, 2, null), f28009t, nr), z2, z6, switchColors2, function23, mutableInteractionSource4, ShapesKt.O(SwitchTokens.f29933n.az(), composerKN, 6), composer2, (i132 & 112) | (i142 & 896) | (i142 & 7168) | (i132 & 57344));
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier62;
                            z7 = z6;
                            switchColors3 = switchColors2;
                            function24 = function23;
                            mutableInteractionSource5 = mutableInteractionSource3;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z5 = z3;
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i5 & 599187) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function22 = function2;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            z5 = z3;
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i5 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        function22 = function2;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        z5 = z3;
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final Modifier modifier, boolean z2, final boolean z3, final SwitchColors switchColors, final Function2 function2, final InteractionSource interactionSource, final Shape shape, Composer composer, final int i2) {
        int i3;
        final boolean z4 = z2;
        Composer composerKN = composer.KN(-1594099146);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z4) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(switchColors) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(interactionSource) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.p5(shape) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1594099146, i3, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:144)");
            }
            long jNr = switchColors.nr(z3, z4);
            long jT2 = switchColors.t(z3, z4);
            SwitchTokens switchTokens = SwitchTokens.f29933n;
            Shape shapeO = ShapesKt.O(switchTokens.S(), composerKN, 6);
            int i5 = i3;
            Modifier modifierT = BackgroundKt.t(BorderKt.J2(modifier, switchTokens.XQ(), switchColors.n(z3, z4), shapeO), jNr, shapeO);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            Modifier modifierT2 = BackgroundKt.t(IndicationKt.rl(BoxScopeInstance.f17448n.n(Modifier.INSTANCE, companion.KN()).Zmq(new ThumbElement(interactionSource, z4)), interactionSource, RippleKt.nr(false, Dp.KN(switchTokens.o() / 2), 0L, composerKN, 54, 4)), jT2, shape);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion.O(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT2);
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyUo2, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            composerKN.eF(1163457794);
            z4 = z2;
            if (function2 != null) {
                CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(switchColors.rl(z3, z4))), function2, composerKN, ProvidedValue.xMQ | ((i5 >> 9) & 112));
            }
            composerKN.Xw();
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$2
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
                    SwitchKt.rl(modifier, z4, z3, switchColors, function2, interactionSource, shape, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final float xMQ() {
        return f28008n;
    }
}
