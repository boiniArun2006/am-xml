package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0091\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0091\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/ButtonElevation;", "elevation", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/material/ButtonColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "t", "Landroidx/compose/ui/graphics/Color;", "contentColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,616:1\n1247#2,6:617\n149#3:623\n85#4:624\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n*L\n109#1:617,6\n119#1:623\n110#1:624\n*E\n"})
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevationRl;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final Shape shape2;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource3;
        final ButtonElevation buttonElevation2;
        final ButtonColors buttonColors2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope scopeUpdateScopeGh;
        MutableInteractionSource mutableInteractionSource4;
        int i13;
        Shape small;
        Composer composer3;
        boolean z5;
        int i14;
        boolean z6;
        ButtonColors buttonColorsN;
        final PaddingValues paddingValuesT;
        Shape shape3;
        BorderStroke borderStroke3;
        boolean z7;
        int i15;
        ?? r6;
        ?? r42;
        MutableInteractionSource mutableInteractionSource5;
        Composer composerKN = composer.KN(-2116133464);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
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
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            buttonElevationRl = buttonElevation;
                            int i17 = composerKN.p5(buttonElevationRl) ? 16384 : 8192;
                            i5 |= i17;
                        } else {
                            buttonElevationRl = buttonElevation;
                        }
                        i5 |= i17;
                    } else {
                        buttonElevationRl = buttonElevation;
                    }
                    if ((196608 & i2) == 0) {
                        i5 |= ((i3 & 32) == 0 && composerKN.p5(shape)) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.p5(borderStroke) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i5 |= ((i3 & 128) == 0 && composerKN.p5(buttonColors)) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i5 |= composerKN.p5(paddingValues) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i3 & 512) != 0) {
                            i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i5 |= composerKN.E2(function3) ? 536870912 : 268435456;
                        }
                        i12 = i5;
                        if (composerKN.HI((306783379 & i12) != 306783378, i12 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier4 = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z9 = i7 != 0 ? true : z3;
                                mutableInteractionSource4 = i8 != 0 ? null : mutableInteractionSource2;
                                if ((i3 & 16) != 0) {
                                    i13 = i12 & (-57345);
                                    buttonElevationRl = ButtonDefaults.f21598n.rl(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 196608, 31);
                                } else {
                                    i13 = i12;
                                }
                                if ((i3 & 32) != 0) {
                                    small = MaterialTheme.f22169n.rl(composerKN, 6).getSmall();
                                    i13 &= -458753;
                                } else {
                                    small = shape;
                                }
                                BorderStroke borderStroke4 = i9 != 0 ? null : borderStroke;
                                if ((i3 & 128) != 0) {
                                    z5 = true;
                                    i14 = i11;
                                    z6 = false;
                                    buttonColorsN = ButtonDefaults.f21598n.n(0L, 0L, 0L, 0L, composerKN, 24576, 15);
                                    composer3 = composerKN;
                                    i13 &= -29360129;
                                } else {
                                    composer3 = composerKN;
                                    z5 = true;
                                    i14 = i11;
                                    z6 = false;
                                    buttonColorsN = buttonColors;
                                }
                                paddingValuesT = i14 != 0 ? ButtonDefaults.f21598n.t() : paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke4;
                                z7 = z9;
                                modifier2 = modifier4;
                                i15 = i13;
                                r42 = z5;
                                r6 = z6;
                            } else {
                                composerKN.wTp();
                                i15 = (i3 & 16) != 0 ? i12 & (-57345) : i12;
                                if ((i3 & 32) != 0) {
                                    i15 &= -458753;
                                }
                                if ((i3 & 128) != 0) {
                                    i15 &= -29360129;
                                }
                                shape3 = shape;
                                borderStroke3 = borderStroke;
                                z7 = z3;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                r42 = 1;
                                r6 = 0;
                                paddingValuesT = paddingValues;
                                composer3 = composerKN;
                                buttonColorsN = buttonColors;
                            }
                            composer3.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-2116133464, i15, -1, "androidx.compose.material.Button (Button.kt:106)");
                            }
                            if (mutableInteractionSource4 == null) {
                                composer3.eF(1050689923);
                                Object objIF = composer3.iF();
                                if (objIF == Composer.INSTANCE.n()) {
                                    objIF = InteractionSourceKt.n();
                                    composer3.o(objIF);
                                }
                                mutableInteractionSource5 = (MutableInteractionSource) objIF;
                                composer3.Xw();
                            } else {
                                composer3.eF(-243202092);
                                composer3.Xw();
                                mutableInteractionSource5 = mutableInteractionSource4;
                            }
                            int i18 = i15 >> 6;
                            int i19 = (i18 & 14) | ((i15 >> 18) & 112);
                            final State stateRl = buttonColorsN.rl(z7, composer3, i19);
                            State stateN = null;
                            Modifier modifierNr = SemanticsModifierKt.nr(modifier2, r6, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                                }
                            }, r42, null);
                            long value = ((Color) buttonColorsN.n(z7, composer3, i19).getValue()).getValue();
                            long jAz = Color.az(rl(stateRl), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            if (buttonElevationRl == null) {
                                composer3.eF(1051096580);
                            } else {
                                composer3.eF(-243188323);
                                stateN = buttonElevationRl.n(z7, mutableInteractionSource5, composer3, i18 & 910);
                            }
                            composer3.Xw();
                            Composer composer4 = composer3;
                            SurfaceKt.rl(function0, modifierNr, z7, shape3, value, jAz, borderStroke3, stateN != null ? ((Dp) stateN.getValue()).getValue() : Dp.KN((float) r6), mutableInteractionSource5, ComposableLambdaKt.nr(7524271, r42, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    n(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer5, int i20) {
                                    if (!composer5.HI((i20 & 3) != 2, i20 & 1)) {
                                        composer5.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(7524271, i20, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:121)");
                                    }
                                    ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(Color.ck(ButtonKt.rl(stateRl))));
                                    final PaddingValues paddingValues3 = paddingValuesT;
                                    final Function3 function32 = function3;
                                    CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(-1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            n(composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer6, int i21) {
                                            if (!composer6.HI((i21 & 3) != 2, i21 & 1)) {
                                                composer6.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1699085201, i21, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:122)");
                                            }
                                            TextStyle button = MaterialTheme.f22169n.t(composer6, 6).getButton();
                                            final PaddingValues paddingValues4 = paddingValues3;
                                            final Function3 function33 = function32;
                                            TextKt.n(button, ComposableLambdaKt.nr(-630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                    n(composer7, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer7, int i22) {
                                                    if (!composer7.HI((i22 & 3) != 2, i22 & 1)) {
                                                        composer7.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-630330208, i22, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:123)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    ButtonDefaults buttonDefaults = ButtonDefaults.f21598n;
                                                    Modifier modifierKN = PaddingKt.KN(SizeKt.n(companion, buttonDefaults.O(), buttonDefaults.nr()), paddingValues4);
                                                    Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                                    Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                                    Function3 function34 = function33;
                                                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer7, 54);
                                                    int iN = ComposablesKt.n(composer7, 0);
                                                    CompositionLocalMap compositionLocalMapIk = composer7.Ik();
                                                    Modifier modifierO = ComposedModifierKt.O(composer7, modifierKN);
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0 function0N = companion2.n();
                                                    if (composer7.getApplier() == null) {
                                                        ComposablesKt.t();
                                                    }
                                                    composer7.T();
                                                    if (composer7.getInserting()) {
                                                        composer7.s7N(function0N);
                                                    } else {
                                                        composer7.r();
                                                    }
                                                    Composer composerN = Updater.n(composer7);
                                                    Updater.O(composerN, measurePolicyRl, companion2.t());
                                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                                    Function2 function2Rl = companion2.rl();
                                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                        composerN.o(Integer.valueOf(iN));
                                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                                    }
                                                    Updater.O(composerN, modifierO, companion2.nr());
                                                    function34.invoke(RowScopeInstance.f17780n, composer7, 6);
                                                    composer7.XQ();
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer6, 54), composer6, 48);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer5, 54), composer5, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer3, 54), composer4, (i18 & 7168) | (i15 & 14) | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT | (i15 & 896) | (i15 & 3670016), 0);
                            composer2 = composer4;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            ButtonElevation buttonElevation3 = buttonElevationRl;
                            paddingValues2 = paddingValuesT;
                            buttonElevation2 = buttonElevation3;
                            modifier3 = modifier2;
                            buttonColors2 = buttonColorsN;
                            z4 = z7;
                            shape2 = shape3;
                            borderStroke2 = borderStroke3;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            shape2 = shape;
                            borderStroke2 = borderStroke;
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            buttonElevation2 = buttonElevationRl;
                            buttonColors2 = buttonColors;
                            paddingValues2 = paddingValues;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    n(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer5, int i20) {
                                    ButtonKt.n(function0, modifier3, z4, mutableInteractionSource3, buttonElevation2, shape2, borderStroke2, buttonColors2, paddingValues2, function3, composer5, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i11 = i10;
                    if ((i3 & 512) != 0) {
                    }
                    i12 = i5;
                    if (composerKN.HI((306783379 & i12) != 306783378, i12 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 512) != 0) {
                }
                i12 = i5;
                if (composerKN.HI((306783379 & i12) != 306783378, i12 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 512) != 0) {
            }
            i12 = i5;
            if (composerKN.HI((306783379 & i12) != 306783378, i12 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 512) != 0) {
        }
        i12 = i5;
        if (composerKN.HI((306783379 & i12) != 306783378, i12 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final void t(Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3 function3, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z3 = (i3 & 4) != 0 ? true : z2;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 8) != 0 ? null : mutableInteractionSource;
        ButtonElevation buttonElevation2 = (i3 & 16) != 0 ? null : buttonElevation;
        Shape small = (i3 & 32) != 0 ? MaterialTheme.f22169n.rl(composer, 6).getSmall() : shape;
        BorderStroke borderStroke2 = (i3 & 64) == 0 ? borderStroke : null;
        ButtonColors buttonColorsUo = (i3 & 128) != 0 ? ButtonDefaults.f21598n.Uo(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues paddingValuesJ2 = (i3 & 256) != 0 ? ButtonDefaults.f21598n.J2() : paddingValues;
        if (ComposerKt.v()) {
            ComposerKt.p5(288797557, i2, -1, "androidx.compose.material.TextButton (Button.kt:241)");
        }
        n(function0, modifier2, z3, mutableInteractionSource2, buttonElevation2, small, borderStroke2, buttonColorsUo, paddingValuesJ2, function3, composer, i2 & 2147483646, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rl(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
