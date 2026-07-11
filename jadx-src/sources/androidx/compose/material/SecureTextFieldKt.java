package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aô\u0001\u0010 \u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aô\u0001\u0010\"\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010!\"\u0014\u0010$\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationMode", "", "textObfuscationCharacter", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onKeyboardAction", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "rl", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;ICLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", c.f62177j, "Landroidx/compose/foundation/text/KeyboardOptions;", "SecureTextFieldKeyboardOptions", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecureTextField.kt\nandroidx/compose/material/SecureTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n75#2:312\n75#2:321\n75#2:330\n1247#3,6:313\n1247#3,6:322\n708#4:319\n696#4:320\n708#4:328\n696#4:329\n1#5:331\n*S KotlinDebug\n*F\n+ 1 SecureTextField.kt\nandroidx/compose/material/SecureTextFieldKt\n*L\n108#1:312\n231#1:321\n252#1:330\n124#1:313,6\n247#1:322,6\n126#1:319\n126#1:320\n249#1:328\n249#1:329\n*E\n"})
public final class SecureTextFieldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final KeyboardOptions f22703n = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.J2(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, (DefaultConstructorMarker) null);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final TextFieldState textFieldState, Modifier modifier, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, InputTransformation inputTransformation, int i2, char c2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        boolean z4;
        int i10;
        Function2 function25;
        int i11;
        Function2 function26;
        int i12;
        Function2 function27;
        int i13;
        Function2 function28;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Composer composer2;
        final TextStyle textStyle2;
        final char c4;
        final KeyboardOptions keyboardOptions2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final Modifier modifier3;
        final Function2 function212;
        final boolean z5;
        final boolean z6;
        final InputTransformation inputTransformation2;
        final int i26;
        final KeyboardActionHandler keyboardActionHandler2;
        final Shape shape2;
        ScopeUpdateScope scopeUpdateScopeGh;
        TextStyle textStyle3;
        Function2 function213;
        InputTransformation inputTransformation3;
        int iRl;
        char c5;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler keyboardActionHandler3;
        Shape shapeKN;
        Composer composer3;
        TextFieldColors textFieldColorsQie;
        int i27;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors3;
        int i28;
        TextStyle textStyle4;
        int i29;
        boolean z7;
        MutableInteractionSource mutableInteractionSource4;
        TextStyle textStyle5;
        final MutableInteractionSource mutableInteractionSource5;
        Modifier modifierAz;
        Composer composerKN = composer.KN(-1990728840);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(textFieldState) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        int i30 = i7 & 2;
        if (i30 != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z4 = z2;
                    i8 |= composerKN.n(z4) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    i8 |= ((i7 & 8) == 0 && composerKN.p5(textStyle)) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                int i31 = 8192;
                if (i10 != 0) {
                    i8 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        function25 = function2;
                        i8 |= composerKN.E2(function25) ? 16384 : 8192;
                    }
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i3 & 196608) == 0) {
                            i8 |= composerKN.E2(function26) ? 131072 : 65536;
                        }
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                        function27 = function23;
                    } else {
                        function27 = function23;
                        if ((i3 & 1572864) == 0) {
                            i8 |= composerKN.E2(function27) ? 1048576 : 524288;
                        }
                    }
                    i13 = i7 & 128;
                    if (i13 == 0) {
                        i8 |= 12582912;
                        function28 = function24;
                    } else {
                        function28 = function24;
                        if ((i3 & 12582912) == 0) {
                            i8 |= composerKN.E2(function28) ? 8388608 : 4194304;
                        }
                    }
                    i14 = i7 & 256;
                    if (i14 == 0) {
                        i8 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i15 = i14;
                            i8 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 == 0) {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.p5(inputTransformation) ? 536870912 : 268435456;
                            }
                            if ((i5 & 6) != 0) {
                                i18 = i5 | (((i7 & 1024) == 0 && composerKN.t(i2)) ? 4 : 2);
                            } else {
                                i18 = i5;
                            }
                            i19 = i7 & 2048;
                            if (i19 == 0) {
                                i18 |= 48;
                                i20 = i19;
                            } else if ((i5 & 48) == 0) {
                                i20 = i19;
                                i18 |= composerKN.O(c2) ? 32 : 16;
                            } else {
                                i20 = i19;
                            }
                            int i32 = i18;
                            i21 = i7 & 4096;
                            if (i21 == 0) {
                                i22 = i32 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i33 = i32;
                                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i33 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                }
                                i22 = i33;
                            }
                            i23 = i7 & 8192;
                            if (i23 == 0) {
                                i24 = i22 | 3072;
                            } else {
                                int i34 = i22;
                                if ((i5 & 3072) == 0) {
                                    i24 = i34 | (composerKN.p5(keyboardActionHandler) ? 2048 : 1024);
                                } else {
                                    i24 = i34;
                                }
                            }
                            if ((i5 & 24576) == 0) {
                                if ((i7 & 16384) == 0 && composerKN.p5(shape)) {
                                    i31 = 16384;
                                }
                                i24 |= i31;
                            }
                            if ((i5 & 196608) == 0) {
                                i24 |= ((i7 & 32768) == 0 && composerKN.p5(textFieldColors)) ? 131072 : 65536;
                            }
                            i25 = i7 & 65536;
                            if (i25 == 0) {
                                i24 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i24 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
                            }
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                textStyle2 = textStyle;
                                c4 = c2;
                                keyboardOptions2 = keyboardOptions;
                                textFieldColors2 = textFieldColors;
                                mutableInteractionSource2 = mutableInteractionSource;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                modifier3 = modifier2;
                                function212 = function28;
                                z5 = z4;
                                z6 = z3;
                                inputTransformation2 = inputTransformation;
                                i26 = i2;
                                keyboardActionHandler2 = keyboardActionHandler;
                                shape2 = shape;
                            } else {
                                composerKN.e();
                                if ((i3 & 1) == 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i30 != 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z9 = i9 != 0 ? true : z4;
                                    if ((i7 & 8) != 0) {
                                        i8 &= -7169;
                                        textStyle3 = (TextStyle) composerKN.ty(TextKt.J2());
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    int i35 = i8;
                                    Function2 function214 = i10 != 0 ? null : function25;
                                    Function2 function215 = i11 != 0 ? null : function26;
                                    Function2 function216 = i12 != 0 ? null : function27;
                                    function213 = i13 != 0 ? null : function28;
                                    boolean z10 = i15 != 0 ? false : z3;
                                    inputTransformation3 = i17 != 0 ? null : inputTransformation;
                                    if ((i7 & 1024) != 0) {
                                        i24 &= -15;
                                        iRl = TextObfuscationMode.INSTANCE.rl();
                                    } else {
                                        iRl = i2;
                                    }
                                    c5 = i20 != 0 ? (char) 8226 : c2;
                                    keyboardOptions3 = i21 != 0 ? f22703n : keyboardOptions;
                                    keyboardActionHandler3 = i23 != 0 ? null : keyboardActionHandler;
                                    if ((i7 & 16384) != 0) {
                                        i24 &= -57345;
                                        shapeKN = TextFieldDefaults.f23471n.KN(composerKN, 6);
                                    } else {
                                        shapeKN = shape;
                                    }
                                    int i36 = i24;
                                    if ((i7 & 32768) != 0) {
                                        textFieldColorsQie = TextFieldDefaults.f23471n.qie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 48, 2097151);
                                        composer3 = composerKN;
                                        i27 = i36 & (-458753);
                                    } else {
                                        composer3 = composerKN;
                                        textFieldColorsQie = textFieldColors;
                                        i27 = i36;
                                    }
                                    if (i25 != 0) {
                                        modifier2 = modifier4;
                                        textFieldColors3 = textFieldColorsQie;
                                        i28 = i27;
                                        z4 = z9;
                                        textStyle4 = textStyle3;
                                        i29 = i35;
                                        function25 = function214;
                                        function26 = function215;
                                        function27 = function216;
                                        z7 = z10;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier2 = modifier4;
                                        textFieldColors3 = textFieldColorsQie;
                                        i28 = i27;
                                        z4 = z9;
                                        textStyle4 = textStyle3;
                                        i29 = i35;
                                        function25 = function214;
                                        function26 = function215;
                                        function27 = function216;
                                        z7 = z10;
                                    }
                                } else {
                                    composerKN.wTp();
                                    if ((i7 & 8) != 0) {
                                        i8 &= -7169;
                                    }
                                    if ((i7 & 1024) != 0) {
                                        i24 &= -15;
                                    }
                                    if ((i7 & 16384) != 0) {
                                        i24 &= -57345;
                                    }
                                    if ((i7 & 32768) != 0) {
                                        i24 &= -458753;
                                    }
                                    textStyle4 = textStyle;
                                    z7 = z3;
                                    inputTransformation3 = inputTransformation;
                                    iRl = i2;
                                    c5 = c2;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActionHandler3 = keyboardActionHandler;
                                    shapeKN = shape;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    composer3 = composerKN;
                                    i29 = i8;
                                    function213 = function28;
                                    i28 = i24;
                                    textFieldColors3 = textFieldColors;
                                }
                                composer3.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1990728840, i29, i28, "androidx.compose.material.OutlinedSecureTextField (SecureTextField.kt:244)");
                                }
                                if (mutableInteractionSource3 == null) {
                                    composer3.eF(345378573);
                                    Object objIF = composer3.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = InteractionSourceKt.n();
                                        composer3.o(objIF);
                                    }
                                    mutableInteractionSource4 = (MutableInteractionSource) objIF;
                                    composer3.Xw();
                                } else {
                                    composer3.eF(842424586);
                                    composer3.Xw();
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                composer3.eF(842430332);
                                long jKN = textStyle4.KN();
                                if (jKN == 16) {
                                    jKN = ((Color) textFieldColors3.t(z4, composer3, ((i29 >> 6) & 14) | ((i28 >> 12) & 112)).getValue()).getValue();
                                }
                                long j2 = jKN;
                                composer3.Xw();
                                TextStyle textStyleNHg = textStyle4.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                Density density = (Density) composer3.ty(CompositionLocalsKt.J2());
                                if (function25 != null) {
                                    textStyle5 = textStyle4;
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    modifierAz = PaddingKt.az(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$1
                                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            n(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }
                                    }), 0.0f, density.Z(OutlinedTextFieldKt.ty()), 0.0f, 0.0f, 13, null);
                                } else {
                                    textStyle5 = textStyle4;
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    modifierAz = Modifier.INSTANCE;
                                }
                                Modifier modifierT = TextFieldImplKt.t(modifier2.Zmq(modifierAz), z7, Strings_androidKt.n(Strings.INSTANCE.t(), composer3, 6));
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f23471n;
                                final boolean z11 = z7;
                                final Function2 function217 = function25;
                                final TextFieldColors textFieldColors4 = textFieldColors3;
                                final Function2 function218 = function26;
                                final Function2 function219 = function27;
                                final boolean z12 = z4;
                                final Function2 function220 = function213;
                                final Shape shape3 = shapeKN;
                                int i37 = i28 << 9;
                                Composer composer4 = composer3;
                                BasicSecureTextFieldKt.rl(textFieldState, SizeKt.n(modifierT, textFieldDefaults.Uo(), textFieldDefaults.J2()), z12, inputTransformation3, textStyleNHg, keyboardOptions3, keyboardActionHandler3, null, mutableInteractionSource5, new SolidColor(((Color) textFieldColors3.xMQ(z7, composer3, ((i29 >> 24) & 14) | ((i28 >> 12) & 112)).getValue()).getValue(), null), new TextFieldDecorator() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$3
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
                                    public final void n(Function2 function221, Composer composer5, int i38) {
                                        composer5.eF(-1518484896);
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1518484896, i38, -1, "androidx.compose.material.OutlinedSecureTextField.<no name provided>.Decoration (SecureTextField.kt:284)");
                                        }
                                        TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f23471n;
                                        String string = textFieldState.xMQ().toString();
                                        VisualTransformation visualTransformationT = VisualTransformation.INSTANCE.t();
                                        final boolean z13 = z12;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                        final boolean z14 = z11;
                                        Function2 function222 = function217;
                                        Function2 function223 = function218;
                                        Function2 function224 = function219;
                                        Function2 function225 = function220;
                                        final Shape shape4 = shape3;
                                        final TextFieldColors textFieldColors5 = textFieldColors4;
                                        textFieldDefaults2.t(string, function221, z13, true, visualTransformationT, mutableInteractionSource6, z14, function222, function223, function224, function225, shape4, textFieldColors5, null, ComposableLambdaKt.nr(-1223036728, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$3$Decoration$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                n(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer6, int i39) {
                                                if (!composer6.HI((i39 & 3) != 2, i39 & 1)) {
                                                    composer6.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1223036728, i39, -1, "androidx.compose.material.OutlinedSecureTextField.<no name provided>.Decoration.<anonymous> (SecureTextField.kt:299)");
                                                }
                                                TextFieldDefaults.f23471n.n(z13, z14, mutableInteractionSource6, textFieldColors5, shape4, 0.0f, 0.0f, composer6, 12582912, 96);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer5, 54), composer5, ((i38 << 3) & 112) | 27648, 221184, 8192);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        composer5.Xw();
                                    }
                                }, iRl, c5, composer4, (i29 & 910) | ((i29 >> 18) & 7168) | (458752 & i37) | (i37 & 3670016), (i28 << 3) & 1008, 128);
                                composer2 = composer4;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                textFieldColors2 = textFieldColors4;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                modifier3 = modifier2;
                                z5 = z4;
                                textStyle2 = textStyle5;
                                z6 = z11;
                                inputTransformation2 = inputTransformation3;
                                i26 = iRl;
                                c4 = c5;
                                keyboardOptions2 = keyboardOptions3;
                                keyboardActionHandler2 = keyboardActionHandler3;
                                shape2 = shapeKN;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                function212 = function213;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i38) {
                                        SecureTextFieldKt.n(textFieldState, modifier3, z5, textStyle2, function29, function210, function211, function212, z6, inputTransformation2, i26, c4, keyboardOptions2, keyboardActionHandler2, shape2, textFieldColors2, mutableInteractionSource2, composer5, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i17 = i16;
                        if ((i5 & 6) != 0) {
                        }
                        i19 = i7 & 2048;
                        if (i19 == 0) {
                        }
                        int i322 = i18;
                        i21 = i7 & 4096;
                        if (i21 == 0) {
                        }
                        i23 = i7 & 8192;
                        if (i23 == 0) {
                        }
                        if ((i5 & 24576) == 0) {
                        }
                        if ((i5 & 196608) == 0) {
                        }
                        i25 = i7 & 65536;
                        if (i25 == 0) {
                        }
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    if ((i5 & 6) != 0) {
                    }
                    i19 = i7 & 2048;
                    if (i19 == 0) {
                    }
                    int i3222 = i18;
                    i21 = i7 & 4096;
                    if (i21 == 0) {
                    }
                    i23 = i7 & 8192;
                    if (i23 == 0) {
                    }
                    if ((i5 & 24576) == 0) {
                    }
                    if ((i5 & 196608) == 0) {
                    }
                    i25 = i7 & 65536;
                    if (i25 == 0) {
                    }
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function25 = function2;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i13 = i7 & 128;
                if (i13 == 0) {
                }
                i14 = i7 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                if ((i5 & 6) != 0) {
                }
                i19 = i7 & 2048;
                if (i19 == 0) {
                }
                int i32222 = i18;
                i21 = i7 & 4096;
                if (i21 == 0) {
                }
                i23 = i7 & 8192;
                if (i23 == 0) {
                }
                if ((i5 & 24576) == 0) {
                }
                if ((i5 & 196608) == 0) {
                }
                i25 = i7 & 65536;
                if (i25 == 0) {
                }
                if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            if ((i3 & 3072) == 0) {
            }
            i10 = i7 & 16;
            int i312 = 8192;
            if (i10 != 0) {
            }
            function25 = function2;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i13 = i7 & 128;
            if (i13 == 0) {
            }
            i14 = i7 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            if ((i5 & 6) != 0) {
            }
            i19 = i7 & 2048;
            if (i19 == 0) {
            }
            int i322222 = i18;
            i21 = i7 & 4096;
            if (i21 == 0) {
            }
            i23 = i7 & 8192;
            if (i23 == 0) {
            }
            if ((i5 & 24576) == 0) {
            }
            if ((i5 & 196608) == 0) {
            }
            i25 = i7 & 65536;
            if (i25 == 0) {
            }
            if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        z4 = z2;
        if ((i3 & 3072) == 0) {
        }
        i10 = i7 & 16;
        int i3122 = 8192;
        if (i10 != 0) {
        }
        function25 = function2;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i13 = i7 & 128;
        if (i13 == 0) {
        }
        i14 = i7 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        if ((i5 & 6) != 0) {
        }
        i19 = i7 & 2048;
        if (i19 == 0) {
        }
        int i3222222 = i18;
        i21 = i7 & 4096;
        if (i21 == 0) {
        }
        i23 = i7 & 8192;
        if (i23 == 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        if ((i5 & 196608) == 0) {
        }
        i25 = i7 & 65536;
        if (i25 == 0) {
        }
        if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final TextFieldState textFieldState, Modifier modifier, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, InputTransformation inputTransformation, int i2, char c2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        boolean z4;
        int i10;
        Function2 function25;
        int i11;
        Function2 function26;
        int i12;
        Function2 function27;
        int i13;
        Function2 function28;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Composer composer2;
        final TextStyle textStyle2;
        final char c4;
        final KeyboardOptions keyboardOptions2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final Modifier modifier3;
        final Function2 function212;
        final boolean z5;
        final boolean z6;
        final InputTransformation inputTransformation2;
        final int i26;
        final KeyboardActionHandler keyboardActionHandler2;
        final Shape shape2;
        ScopeUpdateScope scopeUpdateScopeGh;
        TextStyle textStyle3;
        Function2 function213;
        boolean z7;
        InputTransformation inputTransformation3;
        int iRl;
        char c5;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler keyboardActionHandler3;
        Shape shapeXMQ;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColorsHI;
        int i27;
        MutableInteractionSource mutableInteractionSource4;
        int i28;
        TextStyle textStyle4;
        int i29;
        MutableInteractionSource mutableInteractionSource5;
        Composer composerKN = composer.KN(-454549898);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(textFieldState) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        int i30 = i7 & 2;
        if (i30 != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z4 = z2;
                    i8 |= composerKN.n(z4) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    i8 |= ((i7 & 8) == 0 && composerKN.p5(textStyle)) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                int i31 = 8192;
                if (i10 != 0) {
                    i8 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        function25 = function2;
                        i8 |= composerKN.E2(function25) ? 16384 : 8192;
                    }
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i3 & 196608) == 0) {
                            i8 |= composerKN.E2(function26) ? 131072 : 65536;
                        }
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                        function27 = function23;
                    } else {
                        function27 = function23;
                        if ((i3 & 1572864) == 0) {
                            i8 |= composerKN.E2(function27) ? 1048576 : 524288;
                        }
                    }
                    i13 = i7 & 128;
                    if (i13 == 0) {
                        i8 |= 12582912;
                        function28 = function24;
                    } else {
                        function28 = function24;
                        if ((i3 & 12582912) == 0) {
                            i8 |= composerKN.E2(function28) ? 8388608 : 4194304;
                        }
                    }
                    i14 = i7 & 256;
                    if (i14 == 0) {
                        i8 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i15 = i14;
                            i8 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 == 0) {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.p5(inputTransformation) ? 536870912 : 268435456;
                            }
                            if ((i5 & 6) != 0) {
                                i18 = i5 | (((i7 & 1024) == 0 && composerKN.t(i2)) ? 4 : 2);
                            } else {
                                i18 = i5;
                            }
                            i19 = i7 & 2048;
                            if (i19 == 0) {
                                i18 |= 48;
                                i20 = i19;
                            } else if ((i5 & 48) == 0) {
                                i20 = i19;
                                i18 |= composerKN.O(c2) ? 32 : 16;
                            } else {
                                i20 = i19;
                            }
                            int i32 = i18;
                            i21 = i7 & 4096;
                            if (i21 == 0) {
                                i22 = i32 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i33 = i32;
                                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i33 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                }
                                i22 = i33;
                            }
                            i23 = i7 & 8192;
                            if (i23 == 0) {
                                i24 = i22 | 3072;
                            } else {
                                int i34 = i22;
                                if ((i5 & 3072) == 0) {
                                    i24 = i34 | (composerKN.p5(keyboardActionHandler) ? 2048 : 1024);
                                } else {
                                    i24 = i34;
                                }
                            }
                            if ((i5 & 24576) == 0) {
                                if ((i7 & 16384) == 0 && composerKN.p5(shape)) {
                                    i31 = 16384;
                                }
                                i24 |= i31;
                            }
                            if ((i5 & 196608) == 0) {
                                i24 |= ((i7 & 32768) == 0 && composerKN.p5(textFieldColors)) ? 131072 : 65536;
                            }
                            i25 = i7 & 65536;
                            if (i25 == 0) {
                                i24 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i24 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
                            }
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                textStyle2 = textStyle;
                                c4 = c2;
                                keyboardOptions2 = keyboardOptions;
                                textFieldColors2 = textFieldColors;
                                mutableInteractionSource2 = mutableInteractionSource;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                modifier3 = modifier2;
                                function212 = function28;
                                z5 = z4;
                                z6 = z3;
                                inputTransformation2 = inputTransformation;
                                i26 = i2;
                                keyboardActionHandler2 = keyboardActionHandler;
                                shape2 = shape;
                            } else {
                                composerKN.e();
                                if ((i3 & 1) == 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i30 != 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z9 = i9 != 0 ? true : z4;
                                    if ((i7 & 8) != 0) {
                                        i8 &= -7169;
                                        textStyle3 = (TextStyle) composerKN.ty(TextKt.J2());
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    int i35 = i8;
                                    Function2 function214 = i10 != 0 ? null : function25;
                                    Function2 function215 = i11 != 0 ? null : function26;
                                    Function2 function216 = i12 != 0 ? null : function27;
                                    function213 = i13 != 0 ? null : function28;
                                    z7 = i15 != 0 ? false : z3;
                                    inputTransformation3 = i17 != 0 ? null : inputTransformation;
                                    if ((i7 & 1024) != 0) {
                                        i24 &= -15;
                                        iRl = TextObfuscationMode.INSTANCE.rl();
                                    } else {
                                        iRl = i2;
                                    }
                                    c5 = i20 != 0 ? (char) 8226 : c2;
                                    keyboardOptions3 = i21 != 0 ? f22703n : keyboardOptions;
                                    keyboardActionHandler3 = i23 != 0 ? null : keyboardActionHandler;
                                    if ((i7 & 16384) != 0) {
                                        i24 &= -57345;
                                        shapeXMQ = TextFieldDefaults.f23471n.xMQ(composerKN, 6);
                                    } else {
                                        shapeXMQ = shape;
                                    }
                                    int i36 = i24;
                                    if ((i7 & 32768) != 0) {
                                        mutableInteractionSource3 = null;
                                        textFieldColorsHI = TextFieldDefaults.f23471n.HI(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 48, 2097151);
                                        composer3 = composerKN;
                                        i27 = i36 & (-458753);
                                    } else {
                                        composer3 = composerKN;
                                        mutableInteractionSource3 = null;
                                        textFieldColorsHI = textFieldColors;
                                        i27 = i36;
                                    }
                                    if (i25 != 0) {
                                        modifier2 = modifier4;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    } else {
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        modifier2 = modifier4;
                                    }
                                    i28 = i27;
                                    z4 = z9;
                                    textStyle4 = textStyle3;
                                    i29 = i35;
                                    function25 = function214;
                                    function26 = function215;
                                    function27 = function216;
                                } else {
                                    composerKN.wTp();
                                    if ((i7 & 8) != 0) {
                                        i8 &= -7169;
                                    }
                                    if ((i7 & 1024) != 0) {
                                        i24 &= -15;
                                    }
                                    if ((i7 & 16384) != 0) {
                                        i24 &= -57345;
                                    }
                                    if ((i7 & 32768) != 0) {
                                        i24 &= -458753;
                                    }
                                    composer3 = composerKN;
                                    textStyle4 = textStyle;
                                    z7 = z3;
                                    inputTransformation3 = inputTransformation;
                                    iRl = i2;
                                    c5 = c2;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActionHandler3 = keyboardActionHandler;
                                    shapeXMQ = shape;
                                    textFieldColorsHI = textFieldColors;
                                    i29 = i8;
                                    function213 = function28;
                                    i28 = i24;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                }
                                composer3.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-454549898, i29, i28, "androidx.compose.material.SecureTextField (SecureTextField.kt:121)");
                                }
                                if (mutableInteractionSource4 == null) {
                                    composer3.eF(-86676725);
                                    Object objIF = composer3.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = InteractionSourceKt.n();
                                        composer3.o(objIF);
                                    }
                                    mutableInteractionSource5 = (MutableInteractionSource) objIF;
                                    composer3.Xw();
                                } else {
                                    composer3.eF(-1665364660);
                                    composer3.Xw();
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                }
                                composer3.eF(-1665358914);
                                long jKN = textStyle4.KN();
                                if (jKN == 16) {
                                    jKN = ((Color) textFieldColorsHI.t(z4, composer3, ((i29 >> 6) & 14) | ((i28 >> 12) & 112)).getValue()).getValue();
                                }
                                long j2 = jKN;
                                composer3.Xw();
                                TextStyle textStyleNHg = textStyle4.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f23471n;
                                final TextFieldColors textFieldColors3 = textFieldColorsHI;
                                Modifier modifier5 = modifier2;
                                final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                final boolean z10 = z4;
                                final boolean z11 = z7;
                                TextStyle textStyle5 = textStyle4;
                                Modifier modifierN = SizeKt.n(TextFieldImplKt.t(TextFieldDefaults.gh(textFieldDefaults, modifier5, z10, z11, mutableInteractionSource6, textFieldColors3, 0.0f, 0.0f, 48, null), z11, Strings_androidKt.n(Strings.INSTANCE.t(), composer3, 6)), textFieldDefaults.Uo(), textFieldDefaults.J2());
                                SolidColor solidColor = new SolidColor(((Color) textFieldColors3.xMQ(z11, composer3, ((i29 >> 24) & 14) | ((i28 >> 12) & 112)).getValue()).getValue(), null);
                                final Function2 function217 = function25;
                                final Function2 function218 = function26;
                                final Function2 function219 = function27;
                                final Function2 function220 = function213;
                                final Shape shape3 = shapeXMQ;
                                int i37 = (i29 & 910) | ((i29 >> 18) & 7168);
                                int i38 = i28 << 9;
                                Composer composer4 = composer3;
                                BasicSecureTextFieldKt.rl(textFieldState, modifierN, z10, inputTransformation3, textStyleNHg, keyboardOptions3, keyboardActionHandler3, null, mutableInteractionSource6, solidColor, new TextFieldDecorator() { // from class: androidx.compose.material.SecureTextFieldKt$SecureTextField$1
                                    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
                                    public final void n(Function2 function221, Composer composer5, int i39) {
                                        composer5.eF(-1548786338);
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1548786338, i39, -1, "androidx.compose.material.SecureTextField.<no name provided>.Decoration (SecureTextField.kt:149)");
                                        }
                                        TextFieldDefaults.f23471n.O(textFieldState.xMQ().toString(), function221, z10, true, VisualTransformation.INSTANCE.t(), mutableInteractionSource6, z11, function217, function218, function219, function220, shape3, textFieldColors3, null, composer5, ((i39 << 3) & 112) | 27648, 24576, 8192);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        composer5.Xw();
                                    }
                                }, iRl, c5, composer4, i37 | (i38 & 458752) | (i38 & 3670016), (i28 << 3) & 1008, 128);
                                composer2 = composer4;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                function29 = function25;
                                mutableInteractionSource2 = mutableInteractionSource4;
                                function210 = function26;
                                function211 = function27;
                                textFieldColors2 = textFieldColors3;
                                modifier3 = modifier5;
                                textStyle2 = textStyle5;
                                function212 = function213;
                                inputTransformation2 = inputTransformation3;
                                i26 = iRl;
                                c4 = c5;
                                keyboardOptions2 = keyboardOptions3;
                                keyboardActionHandler2 = keyboardActionHandler3;
                                z6 = z11;
                                z5 = z4;
                                shape2 = shapeXMQ;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SecureTextFieldKt$SecureTextField$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i39) {
                                        SecureTextFieldKt.rl(textFieldState, modifier3, z5, textStyle2, function29, function210, function211, function212, z6, inputTransformation2, i26, c4, keyboardOptions2, keyboardActionHandler2, shape2, textFieldColors2, mutableInteractionSource2, composer5, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i17 = i16;
                        if ((i5 & 6) != 0) {
                        }
                        i19 = i7 & 2048;
                        if (i19 == 0) {
                        }
                        int i322 = i18;
                        i21 = i7 & 4096;
                        if (i21 == 0) {
                        }
                        i23 = i7 & 8192;
                        if (i23 == 0) {
                        }
                        if ((i5 & 24576) == 0) {
                        }
                        if ((i5 & 196608) == 0) {
                        }
                        i25 = i7 & 65536;
                        if (i25 == 0) {
                        }
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    if ((i5 & 6) != 0) {
                    }
                    i19 = i7 & 2048;
                    if (i19 == 0) {
                    }
                    int i3222 = i18;
                    i21 = i7 & 4096;
                    if (i21 == 0) {
                    }
                    i23 = i7 & 8192;
                    if (i23 == 0) {
                    }
                    if ((i5 & 24576) == 0) {
                    }
                    if ((i5 & 196608) == 0) {
                    }
                    i25 = i7 & 65536;
                    if (i25 == 0) {
                    }
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function25 = function2;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i13 = i7 & 128;
                if (i13 == 0) {
                }
                i14 = i7 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                if ((i5 & 6) != 0) {
                }
                i19 = i7 & 2048;
                if (i19 == 0) {
                }
                int i32222 = i18;
                i21 = i7 & 4096;
                if (i21 == 0) {
                }
                i23 = i7 & 8192;
                if (i23 == 0) {
                }
                if ((i5 & 24576) == 0) {
                }
                if ((i5 & 196608) == 0) {
                }
                i25 = i7 & 65536;
                if (i25 == 0) {
                }
                if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            if ((i3 & 3072) == 0) {
            }
            i10 = i7 & 16;
            int i312 = 8192;
            if (i10 != 0) {
            }
            function25 = function2;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i13 = i7 & 128;
            if (i13 == 0) {
            }
            i14 = i7 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            if ((i5 & 6) != 0) {
            }
            i19 = i7 & 2048;
            if (i19 == 0) {
            }
            int i322222 = i18;
            i21 = i7 & 4096;
            if (i21 == 0) {
            }
            i23 = i7 & 8192;
            if (i23 == 0) {
            }
            if ((i5 & 24576) == 0) {
            }
            if ((i5 & 196608) == 0) {
            }
            i25 = i7 & 65536;
            if (i25 == 0) {
            }
            if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        z4 = z2;
        if ((i3 & 3072) == 0) {
        }
        i10 = i7 & 16;
        int i3122 = 8192;
        if (i10 != 0) {
        }
        function25 = function2;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i13 = i7 & 128;
        if (i13 == 0) {
        }
        i14 = i7 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        if ((i5 & 6) != 0) {
        }
        i19 = i7 & 2048;
        if (i19 == 0) {
        }
        int i3222222 = i18;
        i21 = i7 & 4096;
        if (i21 == 0) {
        }
        i23 = i7 & 8192;
        if (i23 == 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        if ((i5 & 196608) == 0) {
        }
        i25 = i7 & 65536;
        if (i25 == 0) {
        }
        if (composerKN.HI((i8 & 306783379) == 306783378 || (i24 & 599187) != 599186, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
