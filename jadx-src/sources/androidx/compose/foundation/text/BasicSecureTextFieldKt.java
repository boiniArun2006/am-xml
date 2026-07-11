package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d8q.jqQ.QTafcm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÔ\u0001\u0010#\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r28\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u0010\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f¢\u0006\u0002\b\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a!\u0010&\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b&\u0010'\u001a\"\u0010*\u001a\u00020\u00162\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0002\b(H\u0003¢\u0006\u0004\b*\u0010+\u001aÊ\u0001\u0010,\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r28\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u0010\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f¢\u0006\u0002\b\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onKeyboardAction", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getResult", "", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "decorator", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationMode", "", "textObfuscationCharacter", "t", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "next", "KN", "(Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/InputTransformation;)Landroidx/compose/foundation/text/input/InputTransformation;", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "O", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rl", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,373:1\n1247#2,6:374\n1247#2,6:380\n1247#2,6:386\n1247#2,6:392\n1247#2,6:399\n75#3:398\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt\n*L\n136#1:374,6\n137#1:380,6\n148#1:386,6\n155#1:392,6\n309#1:399,6\n307#1:398\n*E\n"})
public final class BasicSecureTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final TextFieldState textFieldState, Modifier modifier, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i2, char c2, Composer composer, final int i3, final int i5, final int i7) {
        TextFieldState textFieldState2;
        int i8;
        Modifier modifier2;
        int i9;
        boolean z3;
        int i10;
        InputTransformation inputTransformation2;
        int i11;
        TextStyle textStyle2;
        int i12;
        KeyboardOptions keyboardOptions2;
        int i13;
        KeyboardActionHandler keyboardActionHandler2;
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
        final Function2 function22;
        final int i26;
        final boolean z4;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final Modifier modifier3;
        final KeyboardActionHandler keyboardActionHandler3;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final TextFieldDecorator textFieldDecorator2;
        final char c4;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i27;
        Modifier modifier4;
        int i28;
        TextStyle textStyleN;
        Composer composerKN = composer.KN(1399310985);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
            textFieldState2 = textFieldState;
        } else if ((i3 & 6) == 0) {
            textFieldState2 = textFieldState;
            i8 = (composerKN.p5(textFieldState2) ? 4 : 2) | i3;
        } else {
            textFieldState2 = textFieldState;
            i8 = i3;
        }
        int i29 = i7 & 2;
        if (i29 != 0) {
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
                    z3 = z2;
                    i8 |= composerKN.n(z3) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        inputTransformation2 = inputTransformation;
                        i8 |= composerKN.p5(inputTransformation2) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            textStyle2 = textStyle;
                            i8 |= composerKN.p5(textStyle2) ? 16384 : 8192;
                        }
                        i12 = i7 & 32;
                        if (i12 != 0) {
                            i8 |= 196608;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i3 & 196608) == 0) {
                                i8 |= composerKN.p5(keyboardOptions2) ? 131072 : 65536;
                            }
                        }
                        i13 = i7 & 64;
                        if (i13 != 0) {
                            i8 |= 1572864;
                            keyboardActionHandler2 = keyboardActionHandler;
                        } else {
                            keyboardActionHandler2 = keyboardActionHandler;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.p5(keyboardActionHandler2) ? 1048576 : 524288;
                            }
                        }
                        i14 = i7 & 128;
                        if (i14 != 0) {
                            i8 |= 12582912;
                        } else {
                            if ((i3 & 12582912) == 0) {
                                i15 = i14;
                                i8 |= composerKN.E2(function2) ? 8388608 : 4194304;
                            }
                            i16 = i7 & 256;
                            if (i16 == 0) {
                                i8 |= 100663296;
                            } else {
                                if ((i3 & 100663296) == 0) {
                                    i17 = i16;
                                    i8 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                i18 = i7 & 512;
                                if (i18 == 0) {
                                    if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i19 = i18;
                                        i8 |= composerKN.p5(brush) ? 536870912 : 268435456;
                                    }
                                    i20 = i7 & 1024;
                                    if (i20 == 0) {
                                        i21 = i5 | 6;
                                    } else if ((i5 & 6) == 0) {
                                        i21 = i5 | ((i5 & 8) == 0 ? composerKN.p5(textFieldDecorator) : composerKN.E2(textFieldDecorator) ? 4 : 2);
                                    } else {
                                        i21 = i5;
                                    }
                                    i22 = i7 & 2048;
                                    if (i22 == 0) {
                                        i21 |= 48;
                                        i23 = i22;
                                    } else if ((i5 & 48) == 0) {
                                        i23 = i22;
                                        i21 |= composerKN.t(i2) ? 32 : 16;
                                    } else {
                                        i23 = i22;
                                    }
                                    int i30 = i21;
                                    i24 = i7 & 4096;
                                    if (i24 == 0) {
                                        i25 = i30 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                    } else if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i25 = i30 | (composerKN.O(c2) ? 256 : 128);
                                    } else {
                                        i25 = i30;
                                    }
                                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i25 & 147) != 146, i8 & 1)) {
                                        composer2 = composerKN;
                                        composer2.wTp();
                                        function22 = function2;
                                        i26 = i2;
                                        z4 = z3;
                                        inputTransformation3 = inputTransformation2;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        modifier3 = modifier2;
                                        keyboardActionHandler3 = keyboardActionHandler2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        brush2 = brush;
                                        textFieldDecorator2 = textFieldDecorator;
                                        c4 = c2;
                                    } else {
                                        if (i29 != 0) {
                                            modifier4 = Modifier.INSTANCE;
                                            i27 = i10;
                                        } else {
                                            i27 = i10;
                                            modifier4 = modifier2;
                                        }
                                        boolean z5 = i9 != 0 ? true : z3;
                                        InputTransformation inputTransformation4 = i27 != 0 ? null : inputTransformation2;
                                        if (i11 != 0) {
                                            textStyleN = TextStyle.INSTANCE.n();
                                            i28 = i12;
                                        } else {
                                            i28 = i12;
                                            textStyleN = textStyle2;
                                        }
                                        KeyboardOptions keyboardOptionsRl = i28 != 0 ? KeyboardOptions.INSTANCE.rl() : keyboardOptions2;
                                        KeyboardActionHandler keyboardActionHandler4 = i13 != 0 ? null : keyboardActionHandler2;
                                        Function2 function23 = i15 != 0 ? null : function2;
                                        MutableInteractionSource mutableInteractionSource3 = i17 != 0 ? null : mutableInteractionSource;
                                        Brush solidColor = i19 != 0 ? new SolidColor(Color.INSTANCE.n(), null) : brush;
                                        TextFieldDecorator textFieldDecorator3 = i20 != 0 ? null : textFieldDecorator;
                                        int iRl = i23 != 0 ? TextObfuscationMode.INSTANCE.rl() : i2;
                                        char c5 = i24 != 0 ? (char) 8226 : c2;
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1399310985, i8, i25, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:354)");
                                        }
                                        int i31 = i8 << 3;
                                        int i32 = i25 << 3;
                                        composer2 = composerKN;
                                        t(textFieldState2, modifier4, z5, false, inputTransformation4, textStyleN, keyboardOptionsRl, keyboardActionHandler4, function23, mutableInteractionSource3, solidColor, textFieldDecorator3, iRl, c5, composer2, (i8 & 14) | 3072 | (i8 & 112) | (i8 & 896) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), ((i8 >> 27) & 14) | (i32 & 112) | (i32 & 896) | (i32 & 7168), 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        modifier3 = modifier4;
                                        z4 = z5;
                                        inputTransformation3 = inputTransformation4;
                                        textStyle3 = textStyleN;
                                        keyboardOptions3 = keyboardOptionsRl;
                                        keyboardActionHandler3 = keyboardActionHandler4;
                                        function22 = function23;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        brush2 = solidColor;
                                        textFieldDecorator2 = textFieldDecorator3;
                                        i26 = iRl;
                                        c4 = c5;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i33) {
                                                BasicSecureTextFieldKt.rl(textFieldState, modifier3, z4, inputTransformation3, textStyle3, keyboardOptions3, keyboardActionHandler3, function22, mutableInteractionSource2, brush2, textFieldDecorator2, i26, c4, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                i19 = i18;
                                i20 = i7 & 1024;
                                if (i20 == 0) {
                                }
                                i22 = i7 & 2048;
                                if (i22 == 0) {
                                }
                                int i302 = i21;
                                i24 = i7 & 4096;
                                if (i24 == 0) {
                                }
                                if (composerKN.HI((i8 & 306783379) == 306783378 || (i25 & 147) != 146, i8 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i17 = i16;
                            i18 = i7 & 512;
                            if (i18 == 0) {
                            }
                            i19 = i18;
                            i20 = i7 & 1024;
                            if (i20 == 0) {
                            }
                            i22 = i7 & 2048;
                            if (i22 == 0) {
                            }
                            int i3022 = i21;
                            i24 = i7 & 4096;
                            if (i24 == 0) {
                            }
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (i25 & 147) != 146, i8 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        i15 = i14;
                        i16 = i7 & 256;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        i18 = i7 & 512;
                        if (i18 == 0) {
                        }
                        i19 = i18;
                        i20 = i7 & 1024;
                        if (i20 == 0) {
                        }
                        i22 = i7 & 2048;
                        if (i22 == 0) {
                        }
                        int i30222 = i21;
                        i24 = i7 & 4096;
                        if (i24 == 0) {
                        }
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (i25 & 147) != 146, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    textStyle2 = textStyle;
                    i12 = i7 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i7 & 256;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 512;
                    if (i18 == 0) {
                    }
                    i19 = i18;
                    i20 = i7 & 1024;
                    if (i20 == 0) {
                    }
                    i22 = i7 & 2048;
                    if (i22 == 0) {
                    }
                    int i302222 = i21;
                    i24 = i7 & 4096;
                    if (i24 == 0) {
                    }
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i25 & 147) != 146, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                inputTransformation2 = inputTransformation;
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                textStyle2 = textStyle;
                i12 = i7 & 32;
                if (i12 != 0) {
                }
                i13 = i7 & 64;
                if (i13 != 0) {
                }
                i14 = i7 & 128;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i7 & 256;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i7 & 512;
                if (i18 == 0) {
                }
                i19 = i18;
                i20 = i7 & 1024;
                if (i20 == 0) {
                }
                i22 = i7 & 2048;
                if (i22 == 0) {
                }
                int i3022222 = i21;
                i24 = i7 & 4096;
                if (i24 == 0) {
                }
                if (composerKN.HI((i8 & 306783379) == 306783378 || (i25 & 147) != 146, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            inputTransformation2 = inputTransformation;
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            textStyle2 = textStyle;
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i13 = i7 & 64;
            if (i13 != 0) {
            }
            i14 = i7 & 128;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i7 & 256;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i7 & 512;
            if (i18 == 0) {
            }
            i19 = i18;
            i20 = i7 & 1024;
            if (i20 == 0) {
            }
            i22 = i7 & 2048;
            if (i22 == 0) {
            }
            int i30222222 = i21;
            i24 = i7 & 4096;
            if (i24 == 0) {
            }
            if (composerKN.HI((i8 & 306783379) == 306783378 || (i25 & 147) != 146, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        z3 = z2;
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        inputTransformation2 = inputTransformation;
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        textStyle2 = textStyle;
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i13 = i7 & 64;
        if (i13 != 0) {
        }
        i14 = i7 & 128;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i7 & 256;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i7 & 512;
        if (i18 == 0) {
        }
        i19 = i18;
        i20 = i7 & 1024;
        if (i20 == 0) {
        }
        i22 = i7 & 2048;
        if (i22 == 0) {
        }
        int i302222222 = i21;
        i24 = i7 & 4096;
        if (i24 == 0) {
        }
        if (composerKN.HI((i8 & 306783379) == 306783378 || (i25 & 147) != 146, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i2, char c2, Composer composer, final int i3, final int i5, final int i7) {
        TextFieldState textFieldState2;
        int i8;
        Modifier modifier2;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        int i11;
        InputTransformation inputTransformation2;
        int i12;
        TextStyle textStyle2;
        int i13;
        KeyboardOptions keyboardOptionsRl;
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
        int i26;
        int i27;
        final KeyboardActionHandler keyboardActionHandler2;
        final Function2 function22;
        final int i28;
        Composer composer2;
        final boolean z6;
        final boolean z7;
        final InputTransformation inputTransformation3;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final TextFieldDecorator textFieldDecorator2;
        final KeyboardOptions keyboardOptions2;
        final TextStyle textStyle3;
        final char c4;
        ScopeUpdateScope scopeUpdateScopeGh;
        CodepointTransformation codepointTransformation;
        Composer composerKN = composer.KN(-817513499);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
            textFieldState2 = textFieldState;
        } else if ((i3 & 6) == 0) {
            textFieldState2 = textFieldState;
            i8 = (composerKN.p5(textFieldState2) ? 4 : 2) | i3;
        } else {
            textFieldState2 = textFieldState;
            i8 = i3;
        }
        int i29 = i7 & 2;
        if (i29 != 0) {
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
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        z5 = z3;
                        i8 |= composerKN.n(z5) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            inputTransformation2 = inputTransformation;
                            i8 |= composerKN.p5(inputTransformation2) ? 16384 : 8192;
                        }
                        i12 = i7 & 32;
                        if (i12 != 0) {
                            i8 |= 196608;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i3 & 196608) == 0) {
                                i8 |= composerKN.p5(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i13 = i7 & 64;
                        if (i13 != 0) {
                            i8 |= 1572864;
                            keyboardOptionsRl = keyboardOptions;
                        } else {
                            keyboardOptionsRl = keyboardOptions;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.p5(keyboardOptionsRl) ? 1048576 : 524288;
                            }
                        }
                        i14 = i7 & 128;
                        if (i14 != 0) {
                            i8 |= 12582912;
                        } else {
                            if ((i3 & 12582912) == 0) {
                                i15 = i14;
                                i8 |= composerKN.p5(keyboardActionHandler) ? 8388608 : 4194304;
                            }
                            i16 = i7 & 256;
                            if (i16 == 0) {
                                i8 |= 100663296;
                            } else {
                                if ((i3 & 100663296) == 0) {
                                    i17 = i16;
                                    i8 |= composerKN.E2(function2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                i18 = i7 & 512;
                                if (i18 == 0) {
                                    if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i19 = i18;
                                        i8 |= composerKN.p5(mutableInteractionSource) ? 536870912 : 268435456;
                                    }
                                    i20 = i7 & 1024;
                                    if (i20 == 0) {
                                        i22 = i5 | 6;
                                        i21 = i20;
                                    } else if ((i5 & 6) == 0) {
                                        i21 = i20;
                                        i22 = i5 | (composerKN.p5(brush) ? 4 : 2);
                                    } else {
                                        i21 = i20;
                                        i22 = i5;
                                    }
                                    i23 = i7 & 2048;
                                    if (i23 == 0) {
                                        i22 |= 48;
                                    } else if ((i5 & 48) == 0) {
                                        i22 |= (i5 & 64) == 0 ? composerKN.p5(textFieldDecorator) : composerKN.E2(textFieldDecorator) ? 32 : 16;
                                    }
                                    int i30 = i22;
                                    i24 = i7 & 4096;
                                    if (i24 == 0) {
                                        i25 = i30 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                    } else {
                                        int i31 = i30;
                                        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                            i31 |= composerKN.t(i2) ? 256 : 128;
                                        }
                                        i25 = i31;
                                    }
                                    i26 = i7 & 8192;
                                    if (i26 == 0) {
                                        i27 = i25 | 3072;
                                    } else {
                                        int i32 = i25;
                                        if ((i5 & 3072) == 0) {
                                            i27 = i32 | (composerKN.O(c2) ? 2048 : 1024);
                                        } else {
                                            i27 = i32;
                                        }
                                    }
                                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i27 & 1171) != 1170, i8 & 1)) {
                                        composerKN.wTp();
                                        keyboardActionHandler2 = keyboardActionHandler;
                                        function22 = function2;
                                        i28 = i2;
                                        composer2 = composerKN;
                                        z6 = z4;
                                        z7 = z5;
                                        inputTransformation3 = inputTransformation2;
                                        modifier3 = modifier2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        brush2 = brush;
                                        textFieldDecorator2 = textFieldDecorator;
                                        keyboardOptions2 = keyboardOptionsRl;
                                        textStyle3 = textStyle2;
                                        c4 = c2;
                                    } else {
                                        Modifier modifier4 = i29 != 0 ? Modifier.INSTANCE : modifier2;
                                        final boolean z9 = i9 != 0 ? true : z4;
                                        final boolean z10 = i10 != 0 ? false : z5;
                                        final InputTransformation inputTransformation4 = i11 != 0 ? null : inputTransformation2;
                                        final TextStyle textStyleN = i12 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                        if (i13 != 0) {
                                            keyboardOptionsRl = KeyboardOptions.INSTANCE.rl();
                                        }
                                        final KeyboardOptions keyboardOptions3 = keyboardOptionsRl;
                                        final KeyboardActionHandler keyboardActionHandler3 = i15 != 0 ? null : keyboardActionHandler;
                                        final Function2 function23 = i17 != 0 ? null : function2;
                                        final MutableInteractionSource mutableInteractionSource3 = i19 != 0 ? null : mutableInteractionSource;
                                        final Brush solidColor = i21 != 0 ? new SolidColor(Color.INSTANCE.n(), null) : brush;
                                        final TextFieldDecorator textFieldDecorator3 = i23 != 0 ? null : textFieldDecorator;
                                        int iRl = i24 != 0 ? TextObfuscationMode.INSTANCE.rl() : i2;
                                        char c5 = i26 != 0 ? Typography.bullet : c2;
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-817513499, i8, i27, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:133)");
                                        }
                                        final State stateCk = SnapshotStateKt.ck(Character.valueOf(c5), composerKN, (i27 >> 9) & 14);
                                        Object objIF = composerKN.iF();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objIF == companion.n()) {
                                            objIF = new SecureTextFieldController(stateCk);
                                            composerKN.o(objIF);
                                        }
                                        final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) objIF;
                                        boolean zE2 = composerKN.E2(secureTextFieldController);
                                        Object objIF2 = composerKN.iF();
                                        if (zE2 || objIF2 == companion.n()) {
                                            objIF2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                                            composerKN.o(objIF2);
                                        }
                                        EffectsKt.O(secureTextFieldController, (Function2) objIF2, composerKN, 0);
                                        TextObfuscationMode.Companion companion2 = TextObfuscationMode.INSTANCE;
                                        final boolean zO = TextObfuscationMode.O(iRl, companion2.rl());
                                        Boolean boolValueOf = Boolean.valueOf(zO);
                                        boolean zN = composerKN.n(zO) | composerKN.E2(secureTextFieldController);
                                        Object objIF3 = composerKN.iF();
                                        if (zN || objIF3 == companion.n()) {
                                            objIF3 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(zO, secureTextFieldController, null);
                                            composerKN.o(objIF3);
                                        }
                                        EffectsKt.O(boolValueOf, (Function2) objIF3, composerKN, 0);
                                        boolean z11 = (i27 & 896) == 256;
                                        Object objIF4 = composerKN.iF();
                                        if (z11 || objIF4 == companion.n()) {
                                            if (TextObfuscationMode.O(iRl, companion2.rl())) {
                                                codepointTransformation = secureTextFieldController.getCodepointTransformation();
                                            } else if (TextObfuscationMode.O(iRl, companion2.n())) {
                                                codepointTransformation = new CodepointTransformation() { // from class: androidx.compose.foundation.text.j
                                                    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
                                                    public final int n(int i33, int i34) {
                                                        return BasicSecureTextFieldKt.nr(stateCk, i33, i34);
                                                    }
                                                };
                                            } else {
                                                objIF4 = null;
                                                composerKN.o(objIF4);
                                            }
                                            objIF4 = codepointTransformation;
                                            composerKN.o(objIF4);
                                        }
                                        final CodepointTransformation codepointTransformation2 = (CodepointTransformation) objIF4;
                                        final Modifier modifierZmq = KeyInputModifierKt.rl(SemanticsModifierKt.nr(modifier4, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.GR(semanticsPropertyReceiver, ContentType.INSTANCE.n());
                                            }
                                        }, 1, null), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                                return n(keyEvent.getNativeKeyEvent());
                                            }

                                            public final Boolean n(android.view.KeyEvent keyEvent) {
                                                boolean z12;
                                                KeyCommand keyCommandN = KeyMapping_androidKt.n().n(keyEvent);
                                                if (keyCommandN != KeyCommand.f19711U && keyCommandN != KeyCommand.M7) {
                                                    z12 = false;
                                                } else {
                                                    z12 = true;
                                                }
                                                return Boolean.valueOf(z12);
                                            }
                                        }).Zmq(zO ? secureTextFieldController.getFocusChangeModifier() : Modifier.INSTANCE);
                                        final TextFieldState textFieldState3 = textFieldState2;
                                        O(ComposableLambdaKt.nr(252521481, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i33) {
                                                if (!composer3.HI((i33 & 3) != 2, i33 & 1)) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(252521481, i33, -1, QTafcm.glwBAcviZAAPfW);
                                                }
                                                BasicTextFieldKt.rl(textFieldState3, modifierZmq, z9, z10, zO ? BasicSecureTextFieldKt.KN(inputTransformation4, secureTextFieldController.getPasswordInputTransformation()) : inputTransformation4, textStyleN, keyboardOptions3, keyboardActionHandler3, TextFieldLineLimits.SingleLine.rl, function23, mutableInteractionSource3, solidColor, codepointTransformation2, null, textFieldDecorator3, null, true, composer3, 100663296, 1572864, 40960);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54), composerKN, 6);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        i28 = iRl;
                                        composer2 = composerKN;
                                        c4 = c5;
                                        z6 = z9;
                                        z7 = z10;
                                        inputTransformation3 = inputTransformation4;
                                        textStyle3 = textStyleN;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActionHandler2 = keyboardActionHandler3;
                                        function22 = function23;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        brush2 = solidColor;
                                        textFieldDecorator2 = textFieldDecorator3;
                                        modifier3 = modifier4;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i33) {
                                                BasicSecureTextFieldKt.t(textFieldState, modifier3, z6, z7, inputTransformation3, textStyle3, keyboardOptions2, keyboardActionHandler2, function22, mutableInteractionSource2, brush2, textFieldDecorator2, i28, c4, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                i19 = i18;
                                i20 = i7 & 1024;
                                if (i20 == 0) {
                                }
                                i23 = i7 & 2048;
                                if (i23 == 0) {
                                }
                                int i302 = i22;
                                i24 = i7 & 4096;
                                if (i24 == 0) {
                                }
                                i26 = i7 & 8192;
                                if (i26 == 0) {
                                }
                                if (composerKN.HI((i8 & 306783379) == 306783378 || (i27 & 1171) != 1170, i8 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i17 = i16;
                            i18 = i7 & 512;
                            if (i18 == 0) {
                            }
                            i19 = i18;
                            i20 = i7 & 1024;
                            if (i20 == 0) {
                            }
                            i23 = i7 & 2048;
                            if (i23 == 0) {
                            }
                            int i3022 = i22;
                            i24 = i7 & 4096;
                            if (i24 == 0) {
                            }
                            i26 = i7 & 8192;
                            if (i26 == 0) {
                            }
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (i27 & 1171) != 1170, i8 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        i15 = i14;
                        i16 = i7 & 256;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        i18 = i7 & 512;
                        if (i18 == 0) {
                        }
                        i19 = i18;
                        i20 = i7 & 1024;
                        if (i20 == 0) {
                        }
                        i23 = i7 & 2048;
                        if (i23 == 0) {
                        }
                        int i30222 = i22;
                        i24 = i7 & 4096;
                        if (i24 == 0) {
                        }
                        i26 = i7 & 8192;
                        if (i26 == 0) {
                        }
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (i27 & 1171) != 1170, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
                    i12 = i7 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i7 & 256;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 512;
                    if (i18 == 0) {
                    }
                    i19 = i18;
                    i20 = i7 & 1024;
                    if (i20 == 0) {
                    }
                    i23 = i7 & 2048;
                    if (i23 == 0) {
                    }
                    int i302222 = i22;
                    i24 = i7 & 4096;
                    if (i24 == 0) {
                    }
                    i26 = i7 & 8192;
                    if (i26 == 0) {
                    }
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i27 & 1171) != 1170, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                z5 = z3;
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                inputTransformation2 = inputTransformation;
                i12 = i7 & 32;
                if (i12 != 0) {
                }
                i13 = i7 & 64;
                if (i13 != 0) {
                }
                i14 = i7 & 128;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i7 & 256;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i7 & 512;
                if (i18 == 0) {
                }
                i19 = i18;
                i20 = i7 & 1024;
                if (i20 == 0) {
                }
                i23 = i7 & 2048;
                if (i23 == 0) {
                }
                int i3022222 = i22;
                i24 = i7 & 4096;
                if (i24 == 0) {
                }
                i26 = i7 & 8192;
                if (i26 == 0) {
                }
                if (composerKN.HI((i8 & 306783379) == 306783378 || (i27 & 1171) != 1170, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            z5 = z3;
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            inputTransformation2 = inputTransformation;
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i13 = i7 & 64;
            if (i13 != 0) {
            }
            i14 = i7 & 128;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i7 & 256;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i7 & 512;
            if (i18 == 0) {
            }
            i19 = i18;
            i20 = i7 & 1024;
            if (i20 == 0) {
            }
            i23 = i7 & 2048;
            if (i23 == 0) {
            }
            int i30222222 = i22;
            i24 = i7 & 4096;
            if (i24 == 0) {
            }
            i26 = i7 & 8192;
            if (i26 == 0) {
            }
            if (composerKN.HI((i8 & 306783379) == 306783378 || (i27 & 1171) != 1170, i8 & 1)) {
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
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        z5 = z3;
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        inputTransformation2 = inputTransformation;
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i13 = i7 & 64;
        if (i13 != 0) {
        }
        i14 = i7 & 128;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i7 & 256;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i7 & 512;
        if (i18 == 0) {
        }
        i19 = i18;
        i20 = i7 & 1024;
        if (i20 == 0) {
        }
        i23 = i7 & 2048;
        if (i23 == 0) {
        }
        int i302222222 = i22;
        i24 = i7 & 4096;
        if (i24 == 0) {
        }
        i26 = i7 & 8192;
        if (i26 == 0) {
        }
        if (composerKN.HI((i8 & 306783379) == 306783378 || (i27 & 1171) != 1170, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputTransformation KN(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.n(inputTransformation, inputTransformation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        Composer composerKN = composer.KN(-1085555050);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1085555050, i3, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:305)");
            }
            final TextToolbar textToolbar = (TextToolbar) composerKN.ty(CompositionLocalsKt.o());
            boolean zP5 = composerKN.p5(textToolbar);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    private final /* synthetic */ TextToolbar f19200n;

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.f19200n.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void n() {
                        this.f19200n.n();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void rl(Rect rect, Function0 onCopyRequested, Function0 onPasteRequested, Function0 onCutRequested, Function0 onSelectAllRequested) {
                        this.f19200n.rl(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested);
                    }

                    {
                        this.f19200n = this.rl;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void nr(Rect rect, Function0 onCopyRequested, Function0 onPasteRequested, Function0 onCutRequested, Function0 onSelectAllRequested, Function0 onAutofillRequested) {
                        this.rl.nr(rect, null, onPasteRequested, null, onSelectAllRequested, onAutofillRequested);
                    }
                };
                composerKN.o(objIF);
            }
            CompositionLocalKt.rl(CompositionLocalsKt.o().nr((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) objIF), function2, composerKN, ((i3 << 3) & 112) | ProvidedValue.xMQ);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$1
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
                    BasicSecureTextFieldKt.O(function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nr(State state, int i2, int i3) {
        return ((Character) state.getValue()).charValue();
    }
}
