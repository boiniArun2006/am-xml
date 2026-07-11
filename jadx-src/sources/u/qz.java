package u;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class qz {

    static final class j implements Function3 {
        final /* synthetic */ MutableState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f74131O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f74132n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextStyle f74133t;

        j(String str, TextStyle textStyle, String str2, MutableState mutableState) {
            this.f74132n = str;
            this.f74133t = textStyle;
            this.f74131O = str2;
            this.J2 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        public final void n(Function2 innerTextField, Composer composer, int i2) {
            int i3;
            int i5;
            TextStyle textStyle;
            String str;
            MutableState mutableState;
            Modifier.Companion companion;
            ?? r12;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer2.E2(innerTextField) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-247022376, i3, -1, "com.alightcreative.maineditor.templateimport.ui.components.AlightTextField.<anonymous>.<anonymous> (AlightTextField.kt:130)");
            }
            String str2 = this.f74132n;
            TextStyle textStyle2 = this.f74133t;
            String str3 = this.f74131O;
            MutableState mutableState2 = this.J2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion3.qie(), composer2, 0);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N);
            } else {
                composer2.r();
            }
            Composer composerN = Updater.n(composer2);
            Updater.O(composerN, measurePolicyRl, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            composer2.eF(223666899);
            if (str2 != null) {
                textStyle = textStyle2;
                mutableState = mutableState2;
                str = str3;
                r12 = 0;
                companion = companion2;
                i5 = i3;
                TextKt.t(str2, null, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer2 = composer;
                SpacerKt.n(SizeKt.Z(companion, Dp.KN(8)), composer2, 6);
            } else {
                i5 = i3;
                textStyle = textStyle2;
                str = str3;
                mutableState = mutableState2;
                companion = companion2;
                r12 = 0;
            }
            composer2.Xw();
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), r12);
            int iN2 = ComposablesKt.n(composer2, r12);
            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer2, companion);
            Function0 function0N2 = companion4.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N2);
            } else {
                composer2.r();
            }
            Composer composerN2 = Updater.n(composer2);
            Updater.O(composerN2, measurePolicyUo, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            composer2.eF(226564549);
            if (qz.O(mutableState).length() == 0) {
                Composer composer3 = composer2;
                TextKt.t(str, SizeKt.KN(companion, 0.0f, 1, null), aD.w6.n7b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer3, 432, 0, 65528);
                composer2 = composer3;
            }
            composer2.Xw();
            innerTextField.invoke(composer2, Integer.valueOf(i5 & 14));
            composer2.XQ();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final String value, final Function1 onValueChange, Modifier modifier, String str, Integer num, String str2, String str3, String str4, String str5, CornerBasedShape cornerBasedShape, PaddingValues paddingValues, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        String str6;
        int i10;
        Integer num2;
        int i11;
        int i12;
        String str7;
        int i13;
        String str8;
        int i14;
        int i15;
        String str9;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String str10;
        CornerBasedShape cornerBasedShapeT;
        Modifier modifier3;
        PaddingValues paddingValuesRl;
        TextStyle textStyleV;
        PaddingValues paddingValues2;
        TextStyle textStyleXw;
        TextStyle textStyle4;
        TextStyle textStyleIk;
        String str11;
        KeyboardActions keyboardActions2;
        TextStyle textStyle5;
        VisualTransformation visualTransformationT;
        CornerBasedShape cornerBasedShape2;
        TextStyle textStyle6;
        int i23;
        TextStyle textStyle7;
        int i24;
        KeyboardOptions keyboardOptions2;
        PaddingValues paddingValues3;
        TextStyle textStyle8;
        Arrangement arrangement;
        Alignment.Companion companion;
        int iN;
        ComposeUiNode.Companion companion2;
        String str12;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        String str13;
        Function2 function2Rl2;
        Composer composer2;
        String str14;
        TextStyle textStyle9;
        String str15;
        Object objIF;
        Composer.Companion companion3;
        String str16;
        Object obj;
        final MutableState mutableState;
        final CornerBasedShape cornerBasedShape3;
        boolean z2;
        Object objIF2;
        boolean z3;
        Object objIF3;
        TextStyle textStyle10;
        String str17;
        final TextStyle textStyle11;
        final String str18;
        final KeyboardActions keyboardActions3;
        final String str19;
        final Modifier modifier4;
        final Integer num3;
        final VisualTransformation visualTransformation2;
        final String str20;
        final TextStyle textStyle12;
        final String str21;
        final TextStyle textStyle13;
        final CornerBasedShape cornerBasedShape4;
        final String str22;
        final KeyboardOptions keyboardOptions3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerKN = composer.KN(-1908733461);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(value) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(onValueChange) ? 32 : 16;
        }
        int i25 = i7;
        int i26 = i5 & 4;
        if (i26 != 0) {
            i25 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i25 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            int i27 = 1024;
            if (i8 == 0) {
                i25 |= 3072;
                i9 = 48;
            } else {
                i9 = 48;
                if ((i2 & 3072) == 0) {
                    str6 = str;
                    i25 |= composerKN.p5(str6) ? 2048 : 1024;
                }
                i10 = i5 & 16;
                if (i10 != 0) {
                    i25 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        num2 = num;
                        i25 |= composerKN.p5(num2) ? 16384 : 8192;
                    }
                    i11 = i5 & 32;
                    if (i11 == 0) {
                        i25 |= 196608;
                        i12 = 6;
                        str7 = str2;
                    } else {
                        i12 = 6;
                        str7 = str2;
                        if ((i2 & 196608) == 0) {
                            i25 |= composerKN.p5(str7) ? 131072 : 65536;
                        }
                    }
                    i13 = i5 & 64;
                    if (i13 == 0) {
                        i25 |= 1572864;
                        str8 = str3;
                    } else {
                        str8 = str3;
                        if ((i2 & 1572864) == 0) {
                            i25 |= composerKN.p5(str8) ? 1048576 : 524288;
                        }
                    }
                    i14 = i5 & 128;
                    if (i14 == 0) {
                        i25 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i25 |= composerKN.p5(str4) ? 8388608 : 4194304;
                    }
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i25 |= 100663296;
                        str9 = str5;
                    } else {
                        str9 = str5;
                        if ((i2 & 100663296) == 0) {
                            i25 |= composerKN.p5(str9) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i25 |= ((i5 & 512) == 0 && composerKN.p5(cornerBasedShape)) ? 536870912 : 268435456;
                    }
                    i16 = i5 & 1024;
                    if (i16 == 0) {
                        i18 = i3 | 6;
                        i17 = i16;
                    } else if ((i3 & 6) == 0) {
                        i17 = i16;
                        i18 = i3 | (composerKN.p5(paddingValues) ? 4 : 2);
                    } else {
                        i17 = i16;
                        i18 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i18 |= ((i5 & 2048) == 0 && composerKN.p5(textStyle)) ? 32 : 16;
                    }
                    if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i18 |= ((i5 & 4096) == 0 && composerKN.p5(textStyle2)) ? 256 : 128;
                    }
                    if ((i3 & 3072) == 0) {
                        if ((i5 & 8192) == 0 && composerKN.p5(textStyle3)) {
                            i27 = 2048;
                        }
                        i18 |= i27;
                    }
                    int i28 = i18;
                    i19 = i5 & 16384;
                    if (i19 != 0) {
                        i20 = i19;
                        if ((i3 & 24576) == 0) {
                            i28 |= composerKN.p5(keyboardOptions) ? 16384 : 8192;
                        }
                        i21 = i5 & 32768;
                        if (i21 != 0) {
                            i28 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            i28 |= composerKN.p5(keyboardActions) ? 131072 : 65536;
                        }
                        i22 = i5 & 65536;
                        if (i22 != 0) {
                            i28 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i28 |= composerKN.p5(visualTransformation) ? 1048576 : 524288;
                        }
                        if ((i25 & 306783379) == 306783378 && (599187 & i28) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            textStyle12 = textStyle3;
                            keyboardActions3 = keyboardActions;
                            visualTransformation2 = visualTransformation;
                            str21 = str8;
                            str19 = str6;
                            modifier4 = modifier2;
                            str18 = str7;
                            num3 = num2;
                            composer2 = composerKN;
                            str22 = str9;
                            str20 = str4;
                            cornerBasedShape4 = cornerBasedShape;
                            textStyle13 = textStyle;
                            textStyle11 = textStyle2;
                            keyboardOptions3 = keyboardOptions;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i26 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i8 != 0) {
                                    str6 = "";
                                }
                                if (i10 != 0) {
                                    num2 = null;
                                }
                                if (i11 != 0) {
                                    str7 = null;
                                }
                                if (i13 != 0) {
                                    str8 = null;
                                }
                                str10 = i14 == 0 ? null : str4;
                                if (i15 != 0) {
                                    str9 = null;
                                }
                                if ((i5 & 512) == 0) {
                                    cornerBasedShapeT = RoundedCornerShapeKt.t(Dp.KN(12));
                                    i25 &= -1879048193;
                                } else {
                                    cornerBasedShapeT = cornerBasedShape;
                                }
                                if (i17 == 0) {
                                    modifier3 = modifier5;
                                    paddingValuesRl = PaddingKt.rl(Dp.KN(16), Dp.KN(14));
                                } else {
                                    modifier3 = modifier5;
                                    paddingValuesRl = paddingValues;
                                }
                                if ((2048 & i5) == 0) {
                                    textStyleV = H9N.j.f3810n.rl(composerKN, i12).v();
                                    i28 &= -113;
                                } else {
                                    textStyleV = textStyle;
                                }
                                if ((i5 & 4096) == 0) {
                                    paddingValues2 = paddingValuesRl;
                                    textStyleXw = H9N.j.f3810n.rl(composerKN, 6).Xw();
                                    i28 &= -897;
                                } else {
                                    paddingValues2 = paddingValuesRl;
                                    textStyleXw = textStyle2;
                                }
                                if ((8192 & i5) == 0) {
                                    textStyle4 = textStyleV;
                                    textStyleIk = H9N.j.f3810n.rl(composerKN, 6).Ik();
                                    i28 &= -7169;
                                } else {
                                    textStyle4 = textStyleV;
                                    textStyleIk = textStyle3;
                                }
                                KeyboardOptions keyboardOptionsN = i20 == 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                KeyboardActions keyboardActionsN = i21 == 0 ? KeyboardActions.INSTANCE.n() : keyboardActions;
                                if (i22 == 0) {
                                    visualTransformationT = VisualTransformation.INSTANCE.t();
                                    KeyboardActions keyboardActions4 = keyboardActionsN;
                                    str11 = str7;
                                    keyboardActions2 = keyboardActions4;
                                    textStyle5 = textStyle4;
                                } else {
                                    KeyboardActions keyboardActions5 = keyboardActionsN;
                                    str11 = str7;
                                    keyboardActions2 = keyboardActions5;
                                    textStyle5 = textStyle4;
                                    visualTransformationT = visualTransformation;
                                }
                                cornerBasedShape2 = cornerBasedShapeT;
                                textStyle6 = textStyleXw;
                                modifier2 = modifier3;
                                i23 = i28;
                                textStyle7 = textStyleIk;
                                i24 = i25;
                                keyboardOptions2 = keyboardOptionsN;
                                paddingValues3 = paddingValues2;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 512) != 0) {
                                    i25 &= -1879048193;
                                }
                                if ((2048 & i5) != 0) {
                                    i28 &= -113;
                                }
                                if ((i5 & 4096) != 0) {
                                    i28 &= -897;
                                }
                                if ((8192 & i5) != 0) {
                                    i28 &= -7169;
                                }
                                str10 = str4;
                                paddingValues3 = paddingValues;
                                textStyle5 = textStyle;
                                textStyle6 = textStyle2;
                                visualTransformationT = visualTransformation;
                                i23 = i28;
                                i24 = i25;
                                str11 = str7;
                                cornerBasedShape2 = cornerBasedShape;
                                textStyle7 = textStyle3;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                textStyle8 = textStyle7;
                            } else {
                                textStyle8 = textStyle7;
                                ComposerKt.p5(-1908733461, i24, i23, "com.alightcreative.maineditor.templateimport.ui.components.AlightTextField (AlightTextField.kt:63)");
                            }
                            arrangement = Arrangement.f17400n;
                            Arrangement.Vertical verticalUo = arrangement.Uo();
                            companion = Alignment.INSTANCE;
                            int i29 = i24;
                            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion.gh(), composerKN, 0);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier2);
                            companion2 = ComposeUiNode.INSTANCE;
                            str12 = str8;
                            Function0 function0N = companion2.n();
                            if (composerKN.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                                composerKN.r();
                            } else {
                                composerKN.s7N(function0N);
                            }
                            composerN = Updater.n(composerKN);
                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                            Updater.O(composerN, measurePolicyN, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            function2Rl = companion2.rl();
                            if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion2.nr());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                            composerKN.eF(-66920189);
                            if (num2 == null || str11 != null) {
                                Alignment.Vertical verticalXMQ = companion.xMQ();
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), verticalXMQ, composerKN, i9);
                                iN2 = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                                Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion4);
                                Function0 function0N2 = companion2.n();
                                if (composerKN.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composerKN.T();
                                if (composerKN.getInserting()) {
                                    composerKN.r();
                                } else {
                                    composerKN.s7N(function0N2);
                                }
                                composerN2 = Updater.n(composerKN);
                                str13 = str10;
                                Updater.O(composerN2, measurePolicyRl, companion2.t());
                                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                                function2Rl2 = companion2.rl();
                                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                    composerN2.o(Integer.valueOf(iN2));
                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                }
                                Updater.O(composerN2, modifierO2, companion2.nr());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                composerKN.eF(1067895135);
                                if (num2 == null) {
                                    ImageKt.n(PainterResources_androidKt.t(num2.intValue(), composerKN, (i29 >> 12) & 14), null, SizeKt.Z(companion4, Dp.KN(20)), null, null, 0.0f, null, composerKN, 432, b.f61769v);
                                    composer2 = composerKN;
                                    SpacerKt.n(SizeKt.Z(companion4, Dp.KN(8)), composer2, 6);
                                } else {
                                    composer2 = composerKN;
                                }
                                composer2.Xw();
                                composer2.eF(1067906287);
                                if (str11 == null) {
                                    TextKt.t(str11, null, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle6, composer2, ((i29 >> 15) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, (i23 << 12) & 3670016, 65530);
                                    str14 = str11;
                                    textStyle9 = textStyle6;
                                    if (str12 != null) {
                                        SpacerKt.n(SizeKt.Z(companion4, Dp.KN(2)), composer2, 6);
                                    }
                                } else {
                                    str14 = str11;
                                    textStyle9 = textStyle6;
                                }
                                composer2.Xw();
                                composer2.XQ();
                            } else {
                                str13 = str10;
                                composer2 = composerKN;
                                str14 = str11;
                                textStyle9 = textStyle6;
                            }
                            composer2.Xw();
                            composer2.eF(-66893448);
                            if (str12 == null) {
                                TextKt.t(str12, null, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer2, 6).s7N(), composer2, ((i29 >> 18) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                                str15 = str12;
                            } else {
                                str15 = str12;
                            }
                            composer2.Xw();
                            composer2.eF(-66886982);
                            if (str14 == null || str15 != null) {
                                SpacerKt.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(8)), composer2, 6);
                            }
                            composer2.Xw();
                            composer2.eF(-66883113);
                            objIF = composer2.iF();
                            companion3 = Composer.INSTANCE;
                            if (objIF != companion3.n()) {
                                str16 = str14;
                                obj = null;
                                objIF = SnapshotStateKt__SnapshotStateKt.O(value, null, 2, null);
                                composer2.o(objIF);
                            } else {
                                str16 = str14;
                                obj = null;
                            }
                            mutableState = (MutableState) objIF;
                            composer2.Xw();
                            String strO = O(mutableState);
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            String str23 = str15;
                            cornerBasedShape3 = cornerBasedShape2;
                            Modifier modifierRl = ShadowKt.rl(SizeKt.KN(companion5, 0.0f, 1, obj), Dp.KN(1), cornerBasedShape3, false, aD.w6.Aum(), 0L, 20, null);
                            boolean z4 = str13 == null;
                            TextStyle textStyle14 = textStyle9;
                            composer2.eF(-66868155);
                            z2 = (((i29 & 1879048192) ^ com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) <= 536870912 && composer2.p5(cornerBasedShape3)) || (i29 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 536870912;
                            objIF2 = composer2.iF();
                            if (z2 || objIF2 == companion3.n()) {
                                objIF2 = new Function1() { // from class: u.aC
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return qz.Uo(cornerBasedShape3, (Modifier) obj2);
                                    }
                                };
                                composer2.o(objIF2);
                            }
                            composer2.Xw();
                            Modifier modifierKN = PaddingKt.KN(BackgroundKt.nr(ClipKt.n(N.o.n(modifierRl, z4, (Function1) objIF2), cornerBasedShape3), aD.w6.v0j(), null, 2, null), paddingValues3);
                            TextStyle textStyleT = TextStyle.t(textStyle5, aD.w6.s(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                            TextStyle textStyle15 = textStyle5;
                            paddingValues = paddingValues3;
                            SolidColor solidColor = new SolidColor(aD.w6.s(), null);
                            composer2.eF(-66879424);
                            z3 = (i29 & 112) != 32;
                            objIF3 = composer2.iF();
                            if (!z3 || objIF3 == companion3.n()) {
                                objIF3 = new Function1() { // from class: u.C
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return qz.KN(onValueChange, mutableState, (String) obj2);
                                    }
                                };
                                composer2.o(objIF3);
                            }
                            composer2.Xw();
                            int i30 = i23 << 6;
                            KeyboardActions keyboardActions6 = keyboardActions2;
                            BasicTextFieldKt.O(strO, (Function1) objIF3, modifierKN, false, false, textStyleT, keyboardOptions4, keyboardActions6, true, 0, 0, visualTransformationT, null, null, solidColor, ComposableLambdaKt.nr(-247022376, true, new j(str9, textStyle15, str6, mutableState), composer2, 54), composer2, (i30 & 3670016) | 100663296 | (i30 & 29360128), ((i23 >> 15) & 112) | 221184, 13848);
                            composer2.eF(-66826447);
                            if (str13 == null) {
                                SpacerKt.n(SizeKt.Z(companion5, Dp.KN(8)), composer2, 6);
                                textStyle10 = textStyle8;
                                str17 = str13;
                                TextKt.t(str17, PaddingKt.az(companion5, Dp.KN(16), 0.0f, 0.0f, 0.0f, 14, null), aD.w6.o9(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle10, composer2, ((i29 >> 21) & 14) | 432, (i23 << 9) & 3670016, 65528);
                            } else {
                                textStyle10 = textStyle8;
                                str17 = str13;
                            }
                            composer2.Xw();
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            textStyle11 = textStyle14;
                            str18 = str16;
                            keyboardActions3 = keyboardActions6;
                            str19 = str6;
                            modifier4 = modifier2;
                            num3 = num2;
                            visualTransformation2 = visualTransformationT;
                            str20 = str17;
                            textStyle12 = textStyle10;
                            str21 = str23;
                            textStyle13 = textStyle15;
                            cornerBasedShape4 = cornerBasedShape3;
                            str22 = str9;
                            keyboardOptions3 = keyboardOptions4;
                        }
                        final PaddingValues paddingValues4 = paddingValues;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: u.o
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return qz.xMQ(value, onValueChange, modifier4, str19, num3, str18, str21, str20, str22, cornerBasedShape4, paddingValues4, textStyle13, textStyle11, textStyle12, keyboardOptions3, keyboardActions3, visualTransformation2, i2, i3, i5, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i28 |= 24576;
                    i20 = i19;
                    i21 = i5 & 32768;
                    if (i21 != 0) {
                    }
                    i22 = i5 & 65536;
                    if (i22 != 0) {
                    }
                    if ((i25 & 306783379) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i26 == 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 != 0) {
                            }
                            if ((i5 & 512) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if ((2048 & i5) == 0) {
                            }
                            if ((i5 & 4096) == 0) {
                            }
                            if ((8192 & i5) == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            cornerBasedShape2 = cornerBasedShapeT;
                            textStyle6 = textStyleXw;
                            modifier2 = modifier3;
                            i23 = i28;
                            textStyle7 = textStyleIk;
                            i24 = i25;
                            keyboardOptions2 = keyboardOptionsN;
                            paddingValues3 = paddingValues2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            arrangement = Arrangement.f17400n;
                            Arrangement.Vertical verticalUo2 = arrangement.Uo();
                            companion = Alignment.INSTANCE;
                            int i292 = i24;
                            MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion.gh(), composerKN, 0);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifier2);
                            companion2 = ComposeUiNode.INSTANCE;
                            str12 = str8;
                            Function0 function0N3 = companion2.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN = Updater.n(composerKN);
                            KeyboardOptions keyboardOptions42 = keyboardOptions2;
                            Updater.O(composerN, measurePolicyN2, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk3, companion2.O());
                            function2Rl = companion2.rl();
                            if (!composerN.getInserting()) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                                Updater.O(composerN, modifierO3, companion2.nr());
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                                composerKN.eF(-66920189);
                                if (num2 == null) {
                                    Alignment.Vertical verticalXMQ2 = companion.xMQ();
                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.J2(), verticalXMQ2, composerKN, i9);
                                    iN2 = ComposablesKt.n(composerKN, 0);
                                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, companion42);
                                    Function0 function0N22 = companion2.n();
                                    if (composerKN.getApplier() == null) {
                                    }
                                    composerKN.T();
                                    if (composerKN.getInserting()) {
                                    }
                                    composerN2 = Updater.n(composerKN);
                                    str13 = str10;
                                    Updater.O(composerN2, measurePolicyRl2, companion2.t());
                                    Updater.O(composerN2, compositionLocalMapIk22, companion2.O());
                                    function2Rl2 = companion2.rl();
                                    if (!composerN2.getInserting()) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                        Updater.O(composerN2, modifierO22, companion2.nr());
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                                        composerKN.eF(1067895135);
                                        if (num2 == null) {
                                        }
                                        composer2.Xw();
                                        composer2.eF(1067906287);
                                        if (str11 == null) {
                                        }
                                        composer2.Xw();
                                        composer2.XQ();
                                        composer2.Xw();
                                        composer2.eF(-66893448);
                                        if (str12 == null) {
                                        }
                                        composer2.Xw();
                                        composer2.eF(-66886982);
                                        if (str14 == null) {
                                            SpacerKt.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(8)), composer2, 6);
                                            composer2.Xw();
                                            composer2.eF(-66883113);
                                            objIF = composer2.iF();
                                            companion3 = Composer.INSTANCE;
                                            if (objIF != companion3.n()) {
                                            }
                                            mutableState = (MutableState) objIF;
                                            composer2.Xw();
                                            String strO2 = O(mutableState);
                                            Modifier.Companion companion52 = Modifier.INSTANCE;
                                            String str232 = str15;
                                            cornerBasedShape3 = cornerBasedShape2;
                                            Modifier modifierRl2 = ShadowKt.rl(SizeKt.KN(companion52, 0.0f, 1, obj), Dp.KN(1), cornerBasedShape3, false, aD.w6.Aum(), 0L, 20, null);
                                            if (str13 == null) {
                                            }
                                            TextStyle textStyle142 = textStyle9;
                                            composer2.eF(-66868155);
                                            if (((i292 & 1879048192) ^ com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) <= 536870912) {
                                                objIF2 = composer2.iF();
                                                if (z2) {
                                                    objIF2 = new Function1() { // from class: u.aC
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj2) {
                                                            return qz.Uo(cornerBasedShape3, (Modifier) obj2);
                                                        }
                                                    };
                                                    composer2.o(objIF2);
                                                    composer2.Xw();
                                                    Modifier modifierKN2 = PaddingKt.KN(BackgroundKt.nr(ClipKt.n(N.o.n(modifierRl2, z4, (Function1) objIF2), cornerBasedShape3), aD.w6.v0j(), null, 2, null), paddingValues3);
                                                    TextStyle textStyleT2 = TextStyle.t(textStyle5, aD.w6.s(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                                    TextStyle textStyle152 = textStyle5;
                                                    paddingValues = paddingValues3;
                                                    SolidColor solidColor2 = new SolidColor(aD.w6.s(), null);
                                                    composer2.eF(-66879424);
                                                    if ((i292 & 112) != 32) {
                                                    }
                                                    objIF3 = composer2.iF();
                                                    if (!z3) {
                                                        objIF3 = new Function1() { // from class: u.C
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj2) {
                                                                return qz.KN(onValueChange, mutableState, (String) obj2);
                                                            }
                                                        };
                                                        composer2.o(objIF3);
                                                        composer2.Xw();
                                                        int i302 = i23 << 6;
                                                        KeyboardActions keyboardActions62 = keyboardActions2;
                                                        BasicTextFieldKt.O(strO2, (Function1) objIF3, modifierKN2, false, false, textStyleT2, keyboardOptions42, keyboardActions62, true, 0, 0, visualTransformationT, null, null, solidColor2, ComposableLambdaKt.nr(-247022376, true, new j(str9, textStyle152, str6, mutableState), composer2, 54), composer2, (i302 & 3670016) | 100663296 | (i302 & 29360128), ((i23 >> 15) & 112) | 221184, 13848);
                                                        composer2.eF(-66826447);
                                                        if (str13 == null) {
                                                        }
                                                        composer2.Xw();
                                                        composer2.XQ();
                                                        if (ComposerKt.v()) {
                                                        }
                                                        textStyle11 = textStyle142;
                                                        str18 = str16;
                                                        keyboardActions3 = keyboardActions62;
                                                        str19 = str6;
                                                        modifier4 = modifier2;
                                                        num3 = num2;
                                                        visualTransformation2 = visualTransformationT;
                                                        str20 = str17;
                                                        textStyle12 = textStyle10;
                                                        str21 = str232;
                                                        textStyle13 = textStyle152;
                                                        cornerBasedShape4 = cornerBasedShape3;
                                                        str22 = str9;
                                                        keyboardOptions3 = keyboardOptions42;
                                                    }
                                                }
                                            } else {
                                                objIF2 = composer2.iF();
                                                if (z2) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final PaddingValues paddingValues42 = paddingValues;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                num2 = num;
                i11 = i5 & 32;
                if (i11 == 0) {
                }
                i13 = i5 & 64;
                if (i13 == 0) {
                }
                i14 = i5 & 128;
                if (i14 == 0) {
                }
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i16 = i5 & 1024;
                if (i16 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i282 = i18;
                i19 = i5 & 16384;
                if (i19 != 0) {
                }
                i21 = i5 & 32768;
                if (i21 != 0) {
                }
                i22 = i5 & 65536;
                if (i22 != 0) {
                }
                if ((i25 & 306783379) == 306783378) {
                }
                final PaddingValues paddingValues422 = paddingValues;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            str6 = str;
            i10 = i5 & 16;
            if (i10 != 0) {
            }
            num2 = num;
            i11 = i5 & 32;
            if (i11 == 0) {
            }
            i13 = i5 & 64;
            if (i13 == 0) {
            }
            i14 = i5 & 128;
            if (i14 == 0) {
            }
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i16 = i5 & 1024;
            if (i16 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i2822 = i18;
            i19 = i5 & 16384;
            if (i19 != 0) {
            }
            i21 = i5 & 32768;
            if (i21 != 0) {
            }
            i22 = i5 & 65536;
            if (i22 != 0) {
            }
            if ((i25 & 306783379) == 306783378) {
            }
            final PaddingValues paddingValues4222 = paddingValues;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        int i272 = 1024;
        if (i8 == 0) {
        }
        str6 = str;
        i10 = i5 & 16;
        if (i10 != 0) {
        }
        num2 = num;
        i11 = i5 & 32;
        if (i11 == 0) {
        }
        i13 = i5 & 64;
        if (i13 == 0) {
        }
        i14 = i5 & 128;
        if (i14 == 0) {
        }
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i16 = i5 & 1024;
        if (i16 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i28222 = i18;
        i19 = i5 & 16384;
        if (i19 != 0) {
        }
        i21 = i5 & 32768;
        if (i21 != 0) {
        }
        i22 = i5 & 65536;
        if (i22 != 0) {
        }
        if ((i25 & 306783379) == 306783378) {
        }
        final PaddingValues paddingValues42222 = paddingValues;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(String str, Function1 function1, Modifier modifier, String str2, Integer num, String str3, String str4, String str5, String str6, CornerBasedShape cornerBasedShape, PaddingValues paddingValues, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, int i2, int i3, int i5, Composer composer, int i7) {
        nr(str, function1, modifier, str2, num, str3, str4, str5, str6, cornerBasedShape, paddingValues, textStyle, textStyle2, textStyle3, keyboardOptions, keyboardActions, visualTransformation, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Function1 function1, MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        J2(mutableState, it);
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier Uo(CornerBasedShape cornerBasedShape, Modifier runIf) {
        Intrinsics.checkNotNullParameter(runIf, "$this$runIf");
        return BorderKt.J2(runIf, Dp.KN(1), aD.w6.o9(), cornerBasedShape);
    }

    private static final void J2(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(MutableState mutableState) {
        return (String) mutableState.getValue();
    }
}
