package eo;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class C {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final ColumnScope UnderlinedText, final String text, long j2, TextStyle textStyle, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        long j3;
        TextStyle textStyle2;
        int i7;
        Function0 function02;
        long jUo;
        TextStyle textStyleKN;
        TextStyle textStyle3;
        int i8;
        final Function0 function03;
        final float fL;
        boolean zRl;
        Object objIF;
        boolean z2;
        Object objIF2;
        Composer composer2;
        final long j4;
        final TextStyle textStyle4;
        final Function0 function04;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(UnderlinedText, "$this$UnderlinedText");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerKN = composer.KN(573817604);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(UnderlinedText) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 1) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(text) ? 32 : 16;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                j3 = j2;
                i5 |= composerKN.nr(j3) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 4) == 0) {
                    textStyle2 = textStyle;
                    int i10 = composerKN.p5(textStyle2) ? 2048 : 1024;
                    i5 |= i10;
                } else {
                    textStyle2 = textStyle;
                }
                i5 |= i10;
            } else {
                textStyle2 = textStyle;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    function02 = function0;
                    i5 |= composerKN.E2(function02) ? 16384 : 8192;
                }
                if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    j4 = j3;
                    textStyle4 = textStyle2;
                    function04 = function02;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        jUo = i9 == 0 ? Color.INSTANCE.Uo() : j3;
                        if ((i3 & 4) == 0) {
                            textStyleKN = H9N.j.f3810n.rl(composerKN, 6).KN();
                            i5 &= -7169;
                        } else {
                            textStyleKN = textStyle2;
                        }
                        if (i7 == 0) {
                            composerKN.eF(1950991797);
                            Object objIF3 = composerKN.iF();
                            if (objIF3 == Composer.INSTANCE.n()) {
                                objIF3 = new Function0() { // from class: eo.CN3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return C.J2();
                                    }
                                };
                                composerKN.o(objIF3);
                            }
                            composerKN.Xw();
                            textStyle3 = textStyleKN;
                            i8 = i5;
                            function03 = (Function0) objIF3;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(573817604, i8, -1, "com.alightcreative.monetization.ui.components.texts.UnderlinedText (UnderlinedText.kt:25)");
                            }
                            fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(Dp.KN(1));
                            Modifier.Companion companion = Modifier.INSTANCE;
                            composerKN.eF(1950996378);
                            zRl = composerKN.rl(fL);
                            objIF = composerKN.iF();
                            if (!zRl || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function1() { // from class: eo.fuX
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return C.Uo(fL, (DrawScope) obj);
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            composerKN.Xw();
                            Modifier modifierAz = PaddingKt.az(UnderlinedText.t(DrawModifierKt.rl(companion, (Function1) objIF), Alignment.INSTANCE.Uo()), 0.0f, 0.0f, 0.0f, Dp.KN(4), 7, null);
                            composerKN.eF(1951008032);
                            z2 = (57344 & i8) == 16384;
                            objIF2 = composerKN.iF();
                            if (!z2 || objIF2 == Composer.INSTANCE.n()) {
                                objIF2 = new Function0() { // from class: eo.Dsr
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return C.KN(function03);
                                    }
                                };
                                composerKN.o(objIF2);
                            }
                            composerKN.Xw();
                            composer2 = composerKN;
                            Function0 function05 = function03;
                            long j5 = jUo;
                            TextKt.t(text, ClickableKt.J2(modifierAz, false, null, null, (Function0) objIF2, 7, null), j5, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, textStyle3, composer2, ((i8 >> 3) & 14) | (i8 & 896), (i8 << 9) & 3670016, 65016);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            j4 = j5;
                            textStyle4 = textStyle3;
                            function04 = function05;
                        } else {
                            textStyle3 = textStyleKN;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -7169;
                        }
                        jUo = j3;
                        textStyle3 = textStyle2;
                    }
                    i8 = i5;
                    function03 = function02;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(Dp.KN(1));
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerKN.eF(1950996378);
                    zRl = composerKN.rl(fL);
                    objIF = composerKN.iF();
                    if (!zRl) {
                        objIF = new Function1() { // from class: eo.fuX
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C.Uo(fL, (DrawScope) obj);
                            }
                        };
                        composerKN.o(objIF);
                        composerKN.Xw();
                        Modifier modifierAz2 = PaddingKt.az(UnderlinedText.t(DrawModifierKt.rl(companion2, (Function1) objIF), Alignment.INSTANCE.Uo()), 0.0f, 0.0f, 0.0f, Dp.KN(4), 7, null);
                        composerKN.eF(1951008032);
                        if ((57344 & i8) == 16384) {
                        }
                        objIF2 = composerKN.iF();
                        if (!z2) {
                            objIF2 = new Function0() { // from class: eo.Dsr
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C.KN(function03);
                                }
                            };
                            composerKN.o(objIF2);
                            composerKN.Xw();
                            composer2 = composerKN;
                            Function0 function052 = function03;
                            long j52 = jUo;
                            TextKt.t(text, ClickableKt.J2(modifierAz2, false, null, null, (Function0) objIF2, 7, null), j52, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, textStyle3, composer2, ((i8 >> 3) & 14) | (i8 & 896), (i8 << 9) & 3670016, 65016);
                            if (ComposerKt.v()) {
                            }
                            j4 = j52;
                            textStyle4 = textStyle3;
                            function04 = function052;
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: eo.aC
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C.xMQ(UnderlinedText, text, j4, textStyle4, function04, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            function02 = function0;
            if ((i5 & 9363) == 9362) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 4) == 0) {
                    }
                    if (i7 == 0) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        j3 = j2;
        if ((i2 & 3072) != 0) {
        }
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        function02 = function0;
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(float f3, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.t() & 4294967295L)) - (f3 / 2);
        DrawScope.mI(drawBehind, aD.w6.dR0(), Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), Offset.O((4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.t() >> 32))) << 32)), f3, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(ColumnScope columnScope, String str, long j2, TextStyle textStyle, Function0 function0, int i2, int i3, Composer composer, int i5) {
        O(columnScope, str, j2, textStyle, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
