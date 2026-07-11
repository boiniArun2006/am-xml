package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0091\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0091\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0091\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u0091\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u0091\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/ButtonColors;", "colors", "Landroidx/compose/material3/ButtonElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rl", "t", "nr", "O", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1108:1\n1223#2,6:1109\n148#3:1115\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt\n*L\n121#1:1109,6\n124#1:1115\n*E\n"})
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function0 function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shapeS;
        ButtonColors buttonColorsViF;
        int i8;
        ButtonElevation buttonElevation2;
        int i9;
        BorderStroke borderStroke2;
        int i10;
        int i11;
        int i12;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape2;
        final ButtonColors buttonColors2;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2106428362);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
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
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shapeS = shape;
                        int i15 = composerKN.p5(shapeS) ? 2048 : 1024;
                        i5 |= i15;
                    } else {
                        shapeS = shape;
                    }
                    i5 |= i15;
                } else {
                    shapeS = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColorsViF = buttonColors;
                        int i16 = composerKN.p5(buttonColorsViF) ? 16384 : 8192;
                        i5 |= i16;
                    } else {
                        buttonColorsViF = buttonColors;
                    }
                    i5 |= i16;
                } else {
                    buttonColorsViF = buttonColors;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        buttonElevation2 = buttonElevation;
                        i5 |= composerKN.p5(buttonElevation2) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else {
                        if ((1572864 & i2) == 0) {
                            borderStroke2 = borderStroke;
                            i5 |= composerKN.p5(borderStroke2) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i11 = i10;
                                i5 |= composerKN.p5(paddingValues) ? 8388608 : 4194304;
                            }
                            i12 = i3 & 256;
                            if (i12 == 0) {
                                i5 |= 100663296;
                            } else {
                                if ((i2 & 100663296) == 0) {
                                    i13 = i12;
                                    i5 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                if ((i3 & 512) == 0) {
                                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i5 |= composerKN.E2(function3) ? 536870912 : 268435456;
                                    }
                                    if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                                        composerKN.e();
                                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                                            if (i14 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i7 != 0) {
                                                z3 = true;
                                            }
                                            if ((i3 & 8) != 0) {
                                                i5 &= -7169;
                                                shapeS = ButtonDefaults.f24588n.S(composerKN, 6);
                                            }
                                            if ((i3 & 16) != 0) {
                                                i5 &= -57345;
                                                buttonColorsViF = ButtonDefaults.f24588n.ViF(composerKN, 6);
                                            }
                                            if (i8 != 0) {
                                                buttonElevation2 = null;
                                            }
                                            if (i9 != 0) {
                                                borderStroke2 = null;
                                            }
                                            PaddingValues paddingValuesXQ = i11 == 0 ? ButtonDefaults.f24588n.XQ() : paddingValues;
                                            mutableInteractionSource2 = i13 == 0 ? null : mutableInteractionSource;
                                            paddingValues2 = paddingValuesXQ;
                                        } else {
                                            composerKN.wTp();
                                            if ((i3 & 8) != 0) {
                                                i5 &= -7169;
                                            }
                                            if ((i3 & 16) != 0) {
                                                i5 &= -57345;
                                            }
                                            paddingValues2 = paddingValues;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        Modifier modifier4 = modifier2;
                                        Shape shape3 = shapeS;
                                        ButtonColors buttonColors3 = buttonColorsViF;
                                        ButtonElevation buttonElevation4 = buttonElevation2;
                                        BorderStroke borderStroke4 = borderStroke2;
                                        boolean z5 = z3;
                                        composerKN.S();
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-2106428362, i5, -1, "androidx.compose.material3.TextButton (Button.kt:430)");
                                        }
                                        composer2 = composerKN;
                                        n(function02, modifier4, z5, shape3, buttonColors3, buttonElevation4, borderStroke4, paddingValues2, mutableInteractionSource2, function3, composer2, i5 & 2147483646, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        modifier3 = modifier4;
                                        z4 = z5;
                                        shape2 = shape3;
                                        buttonColors2 = buttonColors3;
                                        buttonElevation3 = buttonElevation4;
                                        borderStroke3 = borderStroke4;
                                        paddingValues3 = paddingValues2;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    } else {
                                        composerKN.wTp();
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        composer2 = composerKN;
                                        modifier3 = modifier2;
                                        z4 = z3;
                                        shape2 = shapeS;
                                        buttonColors2 = buttonColorsViF;
                                        buttonElevation3 = buttonElevation2;
                                        borderStroke3 = borderStroke2;
                                        paddingValues3 = paddingValues;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
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
                                                ButtonKt.O(function0, modifier3, z4, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues3, mutableInteractionSource3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                if ((i5 & 306783379) == 306783378) {
                                    composerKN.e();
                                    if ((i2 & 1) != 0) {
                                        if (i14 != 0) {
                                        }
                                        if (i7 != 0) {
                                        }
                                        if ((i3 & 8) != 0) {
                                        }
                                        if ((i3 & 16) != 0) {
                                        }
                                        if (i8 != 0) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        if (i11 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        paddingValues2 = paddingValuesXQ;
                                        Modifier modifier42 = modifier2;
                                        Shape shape32 = shapeS;
                                        ButtonColors buttonColors32 = buttonColorsViF;
                                        ButtonElevation buttonElevation42 = buttonElevation2;
                                        BorderStroke borderStroke42 = borderStroke2;
                                        boolean z52 = z3;
                                        composerKN.S();
                                        if (ComposerKt.v()) {
                                        }
                                        composer2 = composerKN;
                                        n(function02, modifier42, z52, shape32, buttonColors32, buttonElevation42, borderStroke42, paddingValues2, mutableInteractionSource2, function3, composer2, i5 & 2147483646, 0);
                                        if (ComposerKt.v()) {
                                        }
                                        modifier3 = modifier42;
                                        z4 = z52;
                                        shape2 = shape32;
                                        buttonColors2 = buttonColors32;
                                        buttonElevation3 = buttonElevation42;
                                        borderStroke3 = borderStroke42;
                                        paddingValues3 = paddingValues2;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i13 = i12;
                            if ((i3 & 512) == 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & 256;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        if ((i3 & 512) == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i3 & 512) == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                borderStroke2 = borderStroke;
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i3 & 512) == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            buttonElevation2 = buttonElevation;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            borderStroke2 = borderStroke;
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i3 & 512) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        buttonElevation2 = buttonElevation;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        borderStroke2 = borderStroke;
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i3 & 512) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /* JADX WARN: Type inference failed for: r24v1, types: [androidx.compose.foundation.interaction.MutableInteractionSource] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.foundation.interaction.InteractionSource] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v17, types: [androidx.compose.material3.ButtonElevation] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.compose.material3.ButtonElevation] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.foundation.interaction.MutableInteractionSource] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation2;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shapeZ;
        ButtonColors buttonColorsN;
        Modifier modifier3;
        BorderStroke borderStroke3;
        int i13;
        ButtonElevation buttonElevationT;
        final PaddingValues paddingValuesKN;
        Object obj;
        int i14;
        Shape shape3;
        int i15;
        Modifier modifier4;
        BorderStroke borderStroke4;
        boolean z4;
        ?? r9;
        ?? r52;
        final PaddingValues paddingValues2;
        final Modifier modifier5;
        final ButtonColors buttonColors3;
        Composer composer2;
        final ?? r6;
        final boolean z5;
        final Shape shape4;
        final BorderStroke borderStroke5;
        final ?? r92;
        ScopeUpdateScope scopeUpdateScopeGh;
        ButtonElevation buttonElevation3;
        int i16;
        ButtonElevation buttonElevation4;
        Composer composerKN = composer.KN(650121315);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
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
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shape2 = shape;
                        int i18 = composerKN.p5(shape2) ? 2048 : 1024;
                        i5 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    i5 |= i18;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i19 = composerKN.p5(buttonColors2) ? 16384 : 8192;
                        i5 |= i19;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i5 |= i19;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        ButtonElevation buttonElevation5 = buttonElevation;
                        boolean zP5 = composerKN.p5(buttonElevation5);
                        buttonElevation3 = buttonElevation5;
                        if (zP5) {
                            i16 = 131072;
                            buttonElevation4 = buttonElevation5;
                        }
                        i5 |= i16;
                        buttonElevation2 = buttonElevation4;
                    } else {
                        buttonElevation3 = buttonElevation;
                    }
                    i16 = 65536;
                    buttonElevation4 = buttonElevation3;
                    i5 |= i16;
                    buttonElevation2 = buttonElevation4;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else {
                    if ((1572864 & i2) == 0) {
                        borderStroke2 = borderStroke;
                        i5 |= composerKN.p5(borderStroke2) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.p5(paddingValues) ? 8388608 : 4194304;
                        }
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i3 & 512) != 0) {
                            i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i5 |= composerKN.E2(function3) ? 536870912 : 268435456;
                        }
                        if ((306783379 & i5) == 306783378 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier5 = modifier2;
                            z5 = z3;
                            shape4 = shape2;
                            composer2 = composerKN;
                            buttonColors3 = buttonColors2;
                            r6 = buttonElevation2;
                            borderStroke5 = borderStroke2;
                            paddingValues2 = paddingValues;
                            r92 = mutableInteractionSource;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier6 = i10 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z6 = i7 == 0 ? true : z3;
                                if ((i3 & 8) == 0) {
                                    i5 &= -7169;
                                    shapeZ = ButtonDefaults.f24588n.Z(composerKN, 6);
                                } else {
                                    shapeZ = shape2;
                                }
                                if ((i3 & 16) == 0) {
                                    i5 &= -57345;
                                    buttonColorsN = ButtonDefaults.f24588n.n(composerKN, 6);
                                } else {
                                    buttonColorsN = buttonColors2;
                                }
                                int i20 = i5;
                                if ((i3 & 32) == 0) {
                                    modifier3 = modifier6;
                                    borderStroke3 = null;
                                    buttonElevationT = ButtonDefaults.f24588n.t(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 196608, 31);
                                    i13 = i20 & (-458753);
                                } else {
                                    modifier3 = modifier6;
                                    borderStroke3 = null;
                                    i13 = i20;
                                    buttonElevationT = buttonElevation2;
                                }
                                if (i8 != 0) {
                                    borderStroke2 = borderStroke3;
                                }
                                paddingValuesKN = i9 == 0 ? ButtonDefaults.f24588n.KN() : paddingValues;
                                obj = i12 == 0 ? borderStroke3 : mutableInteractionSource;
                                i14 = i13;
                                buttonColors2 = buttonColorsN;
                                shape3 = shapeZ;
                                i15 = 650121315;
                                modifier4 = modifier3;
                                borderStroke4 = borderStroke2;
                                z4 = z6;
                                r9 = buttonElevationT;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                i14 = i5;
                                shape3 = shape2;
                                borderStroke4 = borderStroke2;
                                modifier4 = modifier;
                                paddingValuesKN = paddingValues;
                                obj = mutableInteractionSource;
                                z4 = z3;
                                i15 = 650121315;
                                r9 = buttonElevation2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i15, i14, -1, "androidx.compose.material3.Button (Button.kt:118)");
                            }
                            composerKN.eF(-239156623);
                            if (obj != null) {
                                Object objIF = composerKN.iF();
                                if (objIF == Composer.INSTANCE.n()) {
                                    objIF = InteractionSourceKt.n();
                                    composerKN.o(objIF);
                                }
                                r52 = (MutableInteractionSource) objIF;
                            } else {
                                r52 = obj;
                            }
                            composerKN.Xw();
                            long jN = buttonColors2.n(z4);
                            Modifier modifier7 = modifier4;
                            final long jRl = buttonColors2.rl(z4);
                            composerKN.eF(-239150048);
                            State stateO = r9 != 0 ? null : r9.O(z4, r52, composerKN, ((i14 >> 9) & 896) | ((i14 >> 6) & 14));
                            composerKN.Xw();
                            Object obj2 = obj;
                            SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier7, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                                }
                            }, 1, null), z4, shape3, jN, jRl, 0.0f, stateO == null ? ((Dp) stateO.getValue()).getValue() : Dp.KN(0), borderStroke4, r52, ComposableLambdaKt.nr(956488494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$2
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
                                    if ((i21 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(956488494, i21, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)");
                                    }
                                    long j2 = jRl;
                                    TextStyle labelLarge = MaterialTheme.f26164n.t(composer3, 6).getLabelLarge();
                                    final PaddingValues paddingValues3 = paddingValuesKN;
                                    final Function3 function32 = function3;
                                    ProvideContentColorTextStyleKt.n(j2, labelLarge, ComposableLambdaKt.nr(1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            n(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer4, int i22) {
                                            if ((i22 & 3) == 2 && composer4.xMQ()) {
                                                composer4.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1327513942, i22, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            ButtonDefaults buttonDefaults = ButtonDefaults.f24588n;
                                            Modifier modifierKN = PaddingKt.KN(SizeKt.n(companion, buttonDefaults.r(), buttonDefaults.Ik()), paddingValues3);
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                            Function3 function33 = function32;
                                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer4, 54);
                                            int iN = ComposablesKt.n(composer4, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer4, modifierKN);
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion2.n();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer4.T();
                                            if (composer4.getInserting()) {
                                                composer4.s7N(function0N);
                                            } else {
                                                composer4.r();
                                            }
                                            Composer composerN = Updater.n(composer4);
                                            Updater.O(composerN, measurePolicyRl, companion2.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                            Function2 function2Rl = companion2.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion2.nr());
                                            function33.invoke(RowScopeInstance.f17780n, composer4, 6);
                                            composer4.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer3, 54), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i14 & 8078) | (234881024 & (i14 << 6)), 6, 64);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            ButtonColors buttonColors4 = buttonColors2;
                            paddingValues2 = paddingValuesKN;
                            modifier5 = modifier7;
                            buttonColors3 = buttonColors4;
                            composer2 = composerKN;
                            r6 = r9;
                            z5 = z4;
                            shape4 = shape3;
                            borderStroke5 = borderStroke4;
                            r92 = obj2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$3
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
                                    ButtonKt.n(function0, modifier5, z5, shape4, buttonColors3, r6, borderStroke5, paddingValues2, r92, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i12 = i11;
                    if ((i3 & 512) != 0) {
                    }
                    if ((306783379 & i5) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i3 & 8) == 0) {
                            }
                            if ((i3 & 16) == 0) {
                            }
                            int i202 = i5;
                            if ((i3 & 32) == 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            i14 = i13;
                            buttonColors2 = buttonColorsN;
                            shape3 = shapeZ;
                            i15 = 650121315;
                            modifier4 = modifier3;
                            borderStroke4 = borderStroke2;
                            z4 = z6;
                            r9 = buttonElevationT;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composerKN.eF(-239156623);
                            if (obj != null) {
                            }
                            composerKN.Xw();
                            long jN2 = buttonColors2.n(z4);
                            Modifier modifier72 = modifier4;
                            final long jRl2 = buttonColors2.rl(z4);
                            composerKN.eF(-239150048);
                            if (r9 != 0) {
                            }
                            composerKN.Xw();
                            Object obj22 = obj;
                            SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier72, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                                }
                            }, 1, null), z4, shape3, jN2, jRl2, 0.0f, stateO == null ? ((Dp) stateO.getValue()).getValue() : Dp.KN(0), borderStroke4, r52, ComposableLambdaKt.nr(956488494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$2
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
                                    if ((i21 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(956488494, i21, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)");
                                    }
                                    long j2 = jRl2;
                                    TextStyle labelLarge = MaterialTheme.f26164n.t(composer3, 6).getLabelLarge();
                                    final PaddingValues paddingValues3 = paddingValuesKN;
                                    final Function3 function32 = function3;
                                    ProvideContentColorTextStyleKt.n(j2, labelLarge, ComposableLambdaKt.nr(1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            n(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer4, int i22) {
                                            if ((i22 & 3) == 2 && composer4.xMQ()) {
                                                composer4.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1327513942, i22, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            ButtonDefaults buttonDefaults = ButtonDefaults.f24588n;
                                            Modifier modifierKN = PaddingKt.KN(SizeKt.n(companion, buttonDefaults.r(), buttonDefaults.Ik()), paddingValues3);
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                            Function3 function33 = function32;
                                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer4, 54);
                                            int iN = ComposablesKt.n(composer4, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer4, modifierKN);
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion2.n();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer4.T();
                                            if (composer4.getInserting()) {
                                                composer4.s7N(function0N);
                                            } else {
                                                composer4.r();
                                            }
                                            Composer composerN = Updater.n(composer4);
                                            Updater.O(composerN, measurePolicyRl, companion2.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                            Function2 function2Rl = companion2.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion2.nr());
                                            function33.invoke(RowScopeInstance.f17780n, composer4, 6);
                                            composer4.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer3, 54), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i14 & 8078) | (234881024 & (i14 << 6)), 6, 64);
                            if (ComposerKt.v()) {
                            }
                            ButtonColors buttonColors42 = buttonColors2;
                            paddingValues2 = paddingValuesKN;
                            modifier5 = modifier72;
                            buttonColors3 = buttonColors42;
                            composer2 = composerKN;
                            r6 = r9;
                            z5 = z4;
                            shape4 = shape3;
                            borderStroke5 = borderStroke4;
                            r92 = obj22;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                borderStroke2 = borderStroke;
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i3 & 512) != 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            borderStroke2 = borderStroke;
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & 512) != 0) {
            }
            if ((306783379 & i5) == 306783378) {
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
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        borderStroke2 = borderStroke;
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & 512) != 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final Function0 function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shapeO;
        ButtonColors buttonColorsAYN;
        int i8;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        int i9;
        int i10;
        int i11;
        BorderStroke borderStrokeWPU;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Modifier modifier3;
        BorderStroke borderStroke3;
        boolean z4;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation3;
        int i12;
        Composer composer2;
        final Modifier modifier4;
        final boolean z5;
        final Shape shape3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation4;
        final BorderStroke borderStroke4;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1694808287);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
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
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shapeO = shape;
                        int i14 = composerKN.p5(shapeO) ? 2048 : 1024;
                        i5 |= i14;
                    } else {
                        shapeO = shape;
                    }
                    i5 |= i14;
                } else {
                    shapeO = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColorsAYN = buttonColors;
                        int i15 = composerKN.p5(buttonColorsAYN) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        buttonColorsAYN = buttonColors;
                    }
                    i5 |= i15;
                } else {
                    buttonColorsAYN = buttonColors;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        buttonElevation2 = buttonElevation;
                        i5 |= composerKN.p5(buttonElevation2) ? 131072 : 65536;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            int i16 = composerKN.p5(borderStroke2) ? 1048576 : 524288;
                            i5 |= i16;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i5 |= i16;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.p5(paddingValues) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i5 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i5 |= composerKN.E2(function3) ? 536870912 : 268435456;
                            }
                            if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    if (i13 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 8) != 0) {
                                        i5 &= -7169;
                                        shapeO = ButtonDefaults.f24588n.o(composerKN, 6);
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                        buttonColorsAYN = ButtonDefaults.f24588n.aYN(composerKN, 6);
                                    }
                                    if (i8 != 0) {
                                        buttonElevation2 = null;
                                    }
                                    if ((i3 & 64) == 0) {
                                        borderStrokeWPU = ButtonDefaults.f24588n.WPU(z3, composerKN, ((i5 >> 6) & 14) | 48, 0);
                                        i5 &= -3670017;
                                    } else {
                                        borderStrokeWPU = borderStroke2;
                                    }
                                    PaddingValues paddingValuesKN = i9 == 0 ? ButtonDefaults.f24588n.KN() : paddingValues;
                                    mutableInteractionSource2 = i11 == 0 ? null : mutableInteractionSource;
                                    paddingValues2 = paddingValuesKN;
                                    modifier3 = modifier2;
                                    borderStroke3 = borderStrokeWPU;
                                    z4 = z3;
                                    shape2 = shapeO;
                                    buttonColors2 = buttonColorsAYN;
                                    buttonElevation3 = buttonElevation2;
                                    i12 = -1694808287;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 8) != 0) {
                                        i5 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z4 = z3;
                                    shape2 = shapeO;
                                    buttonColors2 = buttonColorsAYN;
                                    buttonElevation3 = buttonElevation2;
                                    borderStroke3 = borderStroke2;
                                    i12 = -1694808287;
                                    modifier3 = modifier2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i12, i5, -1, "androidx.compose.material3.OutlinedButton (Button.kt:357)");
                                }
                                composer2 = composerKN;
                                n(function02, modifier3, z4, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, composer2, i5 & 2147483646, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier4 = modifier3;
                                z5 = z4;
                                shape3 = shape2;
                                buttonColors3 = buttonColors2;
                                buttonElevation4 = buttonElevation3;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                composerKN.wTp();
                                mutableInteractionSource3 = mutableInteractionSource;
                                composer2 = composerKN;
                                modifier4 = modifier2;
                                z5 = z3;
                                shape3 = shapeO;
                                buttonColors3 = buttonColorsAYN;
                                buttonElevation4 = buttonElevation2;
                                borderStroke4 = borderStroke2;
                                paddingValues3 = paddingValues;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
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
                                        ButtonKt.nr(function0, modifier4, z5, shape3, buttonColors3, buttonElevation4, borderStroke4, paddingValues3, mutableInteractionSource3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        if ((i5 & 306783379) == 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i13 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if ((i3 & 8) != 0) {
                                }
                                if ((i3 & 16) != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                paddingValues2 = paddingValuesKN;
                                modifier3 = modifier2;
                                borderStroke3 = borderStrokeWPU;
                                z4 = z3;
                                shape2 = shapeO;
                                buttonColors2 = buttonColorsAYN;
                                buttonElevation3 = buttonElevation2;
                                i12 = -1694808287;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                composer2 = composerKN;
                                n(function02, modifier3, z4, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, composer2, i5 & 2147483646, 0);
                                if (ComposerKt.v()) {
                                }
                                modifier4 = modifier3;
                                z5 = z4;
                                shape3 = shape2;
                                buttonColors3 = buttonColors2;
                                buttonElevation4 = buttonElevation3;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i11 = i10;
                    if ((i3 & 512) == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                if ((1572864 & i2) != 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i3 & 512) == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            buttonElevation2 = buttonElevation;
            if ((1572864 & i2) != 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i3 & 512) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        buttonElevation2 = buttonElevation;
        if ((1572864 & i2) != 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i3 & 512) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevationO;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        int i10;
        int i11;
        Shape shapeTy;
        ButtonColors buttonColorsNr;
        ButtonElevation buttonElevation2;
        boolean z4;
        Shape shape3;
        ButtonColors buttonColors3;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        BorderStroke borderStroke3;
        Modifier modifier3;
        int i12;
        Composer composer2;
        final Modifier modifier4;
        final boolean z5;
        final Shape shape4;
        final ButtonColors buttonColors4;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke4;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1466887385);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
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
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shape2 = shape;
                        int i14 = composerKN.p5(shape2) ? 2048 : 1024;
                        i5 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i5 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i15 = composerKN.p5(buttonColors2) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i5 |= i15;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        buttonElevationO = buttonElevation;
                        int i16 = composerKN.p5(buttonElevationO) ? 131072 : 65536;
                        i5 |= i16;
                    } else {
                        buttonElevationO = buttonElevation;
                    }
                    i5 |= i16;
                } else {
                    buttonElevationO = buttonElevation;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else {
                    if ((1572864 & i2) == 0) {
                        borderStroke2 = borderStroke;
                        i5 |= composerKN.p5(borderStroke2) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.p5(paddingValues) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i5 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i5 |= composerKN.E2(function3) ? 536870912 : 268435456;
                            }
                            if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier5 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z6 = i7 == 0 ? true : z3;
                                    if ((i3 & 8) == 0) {
                                        i5 &= -7169;
                                        shapeTy = ButtonDefaults.f24588n.ty(composerKN, 6);
                                    } else {
                                        shapeTy = shape2;
                                    }
                                    if ((i3 & 16) == 0) {
                                        i5 &= -57345;
                                        buttonColorsNr = ButtonDefaults.f24588n.nr(composerKN, 6);
                                    } else {
                                        buttonColorsNr = buttonColors2;
                                    }
                                    int i17 = i5;
                                    if ((i3 & 32) == 0) {
                                        buttonElevationO = ButtonDefaults.f24588n.O(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 196608, 31);
                                        i5 = i17 & (-458753);
                                    } else {
                                        i5 = i17;
                                    }
                                    if (i8 != 0) {
                                        borderStroke2 = null;
                                    }
                                    PaddingValues paddingValuesKN = i9 == 0 ? ButtonDefaults.f24588n.KN() : paddingValues;
                                    buttonElevation2 = buttonElevationO;
                                    z4 = z6;
                                    shape3 = shapeTy;
                                    if (i11 == 0) {
                                        buttonColors3 = buttonColorsNr;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        buttonColors3 = buttonColorsNr;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    paddingValues2 = paddingValuesKN;
                                    borderStroke3 = borderStroke2;
                                    modifier3 = modifier5;
                                    i12 = 1466887385;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 8) != 0) {
                                        i5 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i5 &= -458753;
                                    }
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z4 = z3;
                                    shape3 = shape2;
                                    buttonColors3 = buttonColors2;
                                    buttonElevation2 = buttonElevationO;
                                    borderStroke3 = borderStroke2;
                                    i12 = 1466887385;
                                    modifier3 = modifier2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i12, i5, -1, "androidx.compose.material3.ElevatedButton (Button.kt:212)");
                                }
                                n(function02, modifier3, z4, shape3, buttonColors3, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, function3, composerKN, i5 & 2147483646, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer2 = composerKN;
                                modifier4 = modifier3;
                                z5 = z4;
                                shape4 = shape3;
                                buttonColors4 = buttonColors3;
                                buttonElevation3 = buttonElevation2;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                composerKN.wTp();
                                modifier4 = modifier2;
                                z5 = z3;
                                shape4 = shape2;
                                composer2 = composerKN;
                                buttonColors4 = buttonColors2;
                                buttonElevation3 = buttonElevationO;
                                borderStroke4 = borderStroke2;
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$ElevatedButton$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i18) {
                                        ButtonKt.rl(function0, modifier4, z5, shape4, buttonColors4, buttonElevation3, borderStroke4, paddingValues3, mutableInteractionSource3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        if ((i5 & 306783379) == 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i13 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if ((i3 & 8) == 0) {
                                }
                                if ((i3 & 16) == 0) {
                                }
                                int i172 = i5;
                                if ((i3 & 32) == 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 == 0) {
                                }
                                buttonElevation2 = buttonElevationO;
                                z4 = z6;
                                shape3 = shapeTy;
                                if (i11 == 0) {
                                }
                                paddingValues2 = paddingValuesKN;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier5;
                                i12 = 1466887385;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                n(function02, modifier3, z4, shape3, buttonColors3, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, function3, composerKN, i5 & 2147483646, 0);
                                if (ComposerKt.v()) {
                                }
                                composer2 = composerKN;
                                modifier4 = modifier3;
                                z5 = z4;
                                shape4 = shape3;
                                buttonColors4 = buttonColors3;
                                buttonElevation3 = buttonElevation2;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i11 = i10;
                    if ((i3 & 512) == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                borderStroke2 = borderStroke;
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i3 & 512) == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            borderStroke2 = borderStroke;
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i3 & 512) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        borderStroke2 = borderStroke;
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i3 & 512) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function0 function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevationUo;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        int i10;
        int i11;
        Shape shapeHI;
        ButtonColors buttonColorsJ2;
        ButtonElevation buttonElevation2;
        boolean z4;
        Shape shape3;
        ButtonColors buttonColors3;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        BorderStroke borderStroke3;
        Modifier modifier3;
        int i12;
        Composer composer2;
        final Modifier modifier4;
        final boolean z5;
        final Shape shape4;
        final ButtonColors buttonColors4;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke4;
        final PaddingValues paddingValues3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1717924381);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
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
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shape2 = shape;
                        int i14 = composerKN.p5(shape2) ? 2048 : 1024;
                        i5 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i5 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i15 = composerKN.p5(buttonColors2) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i5 |= i15;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        buttonElevationUo = buttonElevation;
                        int i16 = composerKN.p5(buttonElevationUo) ? 131072 : 65536;
                        i5 |= i16;
                    } else {
                        buttonElevationUo = buttonElevation;
                    }
                    i5 |= i16;
                } else {
                    buttonElevationUo = buttonElevation;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else {
                    if ((1572864 & i2) == 0) {
                        borderStroke2 = borderStroke;
                        i5 |= composerKN.p5(borderStroke2) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.p5(paddingValues) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i5 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i5 |= composerKN.E2(function3) ? 536870912 : 268435456;
                            }
                            if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier5 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z6 = i7 == 0 ? true : z3;
                                    if ((i3 & 8) == 0) {
                                        i5 &= -7169;
                                        shapeHI = ButtonDefaults.f24588n.HI(composerKN, 6);
                                    } else {
                                        shapeHI = shape2;
                                    }
                                    if ((i3 & 16) == 0) {
                                        i5 &= -57345;
                                        buttonColorsJ2 = ButtonDefaults.f24588n.J2(composerKN, 6);
                                    } else {
                                        buttonColorsJ2 = buttonColors2;
                                    }
                                    int i17 = i5;
                                    if ((i3 & 32) == 0) {
                                        buttonElevationUo = ButtonDefaults.f24588n.Uo(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 196608, 31);
                                        i5 = i17 & (-458753);
                                    } else {
                                        i5 = i17;
                                    }
                                    if (i8 != 0) {
                                        borderStroke2 = null;
                                    }
                                    PaddingValues paddingValuesKN = i9 == 0 ? ButtonDefaults.f24588n.KN() : paddingValues;
                                    buttonElevation2 = buttonElevationUo;
                                    z4 = z6;
                                    shape3 = shapeHI;
                                    if (i11 == 0) {
                                        buttonColors3 = buttonColorsJ2;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        buttonColors3 = buttonColorsJ2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    paddingValues2 = paddingValuesKN;
                                    borderStroke3 = borderStroke2;
                                    modifier3 = modifier5;
                                    i12 = -1717924381;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 8) != 0) {
                                        i5 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i5 &= -458753;
                                    }
                                    paddingValues2 = paddingValues;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z4 = z3;
                                    shape3 = shape2;
                                    buttonColors3 = buttonColors2;
                                    buttonElevation2 = buttonElevationUo;
                                    borderStroke3 = borderStroke2;
                                    i12 = -1717924381;
                                    modifier3 = modifier2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i12, i5, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:285)");
                                }
                                n(function02, modifier3, z4, shape3, buttonColors3, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, function3, composerKN, i5 & 2147483646, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer2 = composerKN;
                                modifier4 = modifier3;
                                z5 = z4;
                                shape4 = shape3;
                                buttonColors4 = buttonColors3;
                                buttonElevation3 = buttonElevation2;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                composerKN.wTp();
                                modifier4 = modifier2;
                                z5 = z3;
                                shape4 = shape2;
                                composer2 = composerKN;
                                buttonColors4 = buttonColors2;
                                buttonElevation3 = buttonElevationUo;
                                borderStroke4 = borderStroke2;
                                paddingValues3 = paddingValues;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$FilledTonalButton$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i18) {
                                        ButtonKt.t(function0, modifier4, z5, shape4, buttonColors4, buttonElevation3, borderStroke4, paddingValues3, mutableInteractionSource3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        if ((i5 & 306783379) == 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i13 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if ((i3 & 8) == 0) {
                                }
                                if ((i3 & 16) == 0) {
                                }
                                int i172 = i5;
                                if ((i3 & 32) == 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 == 0) {
                                }
                                buttonElevation2 = buttonElevationUo;
                                z4 = z6;
                                shape3 = shapeHI;
                                if (i11 == 0) {
                                }
                                paddingValues2 = paddingValuesKN;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier5;
                                i12 = -1717924381;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                n(function02, modifier3, z4, shape3, buttonColors3, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, function3, composerKN, i5 & 2147483646, 0);
                                if (ComposerKt.v()) {
                                }
                                composer2 = composerKN;
                                modifier4 = modifier3;
                                z5 = z4;
                                shape4 = shape3;
                                buttonColors4 = buttonColors3;
                                buttonElevation3 = buttonElevation2;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i11 = i10;
                    if ((i3 & 512) == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                borderStroke2 = borderStroke;
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i3 & 512) == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            borderStroke2 = borderStroke;
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i3 & 512) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        borderStroke2 = borderStroke;
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i3 & 512) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
