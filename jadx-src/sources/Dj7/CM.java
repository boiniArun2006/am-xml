package Dj7;

import Dj7.CM;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CM {

    static final class j implements PointerInputEventHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f1591n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ State f1592t;

        j(MutableState mutableState, State state) {
            this.f1591n = mutableState;
            this.f1592t = state;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            final MutableState mutableState = this.f1591n;
            final State state = this.f1592t;
            Object objAz = TapGestureDetectorKt.az(pointerInputScope, null, null, null, new Function1() { // from class: Dj7.L0y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CM.j.rl(mutableState, state, (Offset) obj);
                }
            }, continuation, 7, null);
            return objAz == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAz : Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit rl(MutableState mutableState, State state, Offset offset) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState.getValue();
            if (textLayoutResult != null) {
                CM.gh(state).invoke(Integer.valueOf(textLayoutResult.aYN(offset.getPackedValue())));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void S(final String text, final TextStyle style, Modifier modifier, long j2, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i2, boolean z2, int i3, Function1 function1, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        int i10;
        long j3;
        int i11;
        FontWeight fontWeight2;
        int i12;
        final TextDecoration textDecoration2;
        int i13;
        TextAlign textAlign2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Function1 function12;
        Composer composer2;
        final long j4;
        final TextAlign textAlign3;
        final int i22;
        final boolean z3;
        final int i23;
        final Function1 function13;
        final FontWeight fontWeight3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer composerKN = composer.KN(-422689865);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(text) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i5 & 48) == 0) {
            i9 |= composerKN.p5(style) ? 32 : 16;
        }
        int i24 = i8 & 4;
        if (i24 != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i10 = i8 & 8;
            if (i10 == 0) {
                i9 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    j3 = j2;
                    i9 |= composerKN.nr(j3) ? 2048 : 1024;
                }
                i11 = i8 & 16;
                if (i11 != 0) {
                    i9 |= 24576;
                } else {
                    if ((i5 & 24576) == 0) {
                        fontWeight2 = fontWeight;
                        i9 |= composerKN.p5(fontWeight2) ? 16384 : 8192;
                    }
                    i12 = i8 & 32;
                    if (i12 == 0) {
                        i9 |= 196608;
                        textDecoration2 = textDecoration;
                    } else {
                        textDecoration2 = textDecoration;
                        if ((i5 & 196608) == 0) {
                            i9 |= composerKN.p5(textDecoration2) ? 131072 : 65536;
                        }
                    }
                    i13 = i8 & 64;
                    if (i13 == 0) {
                        i9 |= 1572864;
                        textAlign2 = textAlign;
                    } else {
                        textAlign2 = textAlign;
                        if ((i5 & 1572864) == 0) {
                            i9 |= composerKN.p5(textAlign2) ? 1048576 : 524288;
                        }
                    }
                    i14 = i8 & 128;
                    if (i14 == 0) {
                        i9 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        i9 |= composerKN.t(i2) ? 8388608 : 4194304;
                    }
                    i15 = i8 & 256;
                    if (i15 == 0) {
                        i9 |= 100663296;
                    } else {
                        if ((i5 & 100663296) == 0) {
                            i16 = i15;
                            i9 |= composerKN.n(z2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i17 = i8 & 512;
                        if (i17 == 0) {
                            if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i18 = i17;
                                i9 |= composerKN.t(i3) ? 536870912 : 268435456;
                            }
                            i19 = i8 & 1024;
                            if (i19 == 0) {
                                i20 = i19;
                                i21 = i7 | 6;
                            } else if ((i7 & 6) == 0) {
                                i20 = i19;
                                i21 = i7 | (composerKN.E2(function1) ? 4 : 2);
                            } else {
                                i20 = i19;
                                i21 = i7;
                            }
                            if ((i9 & 306783379) != 306783378 && (i21 & 3) == 2 && composerKN.xMQ()) {
                                composerKN.wTp();
                                i22 = i2;
                                i23 = i3;
                                textAlign3 = textAlign2;
                                composer2 = composerKN;
                                modifier3 = modifier2;
                                j4 = j3;
                                fontWeight3 = fontWeight2;
                                z3 = z2;
                                function13 = function1;
                            } else {
                                Modifier modifier4 = i24 == 0 ? Modifier.INSTANCE : modifier2;
                                long jUo = i10 == 0 ? Color.INSTANCE.Uo() : j3;
                                FontWeight fontWeight4 = i11 == 0 ? null : fontWeight2;
                                TextDecoration textDecoration3 = i12 == 0 ? null : textDecoration2;
                                TextAlign textAlign4 = i13 == 0 ? null : textAlign2;
                                int iN = i14 == 0 ? TextOverflow.INSTANCE.n() : i2;
                                boolean z4 = i16 == 0 ? true : z2;
                                int i25 = i18 == 0 ? Integer.MAX_VALUE : i3;
                                if (i20 == 0) {
                                    composerKN.eF(-1707807744);
                                    Object objIF = composerKN.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = new Function1() { // from class: Dj7.xuv
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CM.WPU((TextLayoutResult) obj);
                                            }
                                        };
                                        composerKN.o(objIF);
                                    }
                                    composerKN.Xw();
                                    function12 = (Function1) objIF;
                                } else {
                                    function12 = function1;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-422689865, i9, i21, "com.alightcreative.common.compose.components.NonScaledText (Text.kt:93)");
                                }
                                int i26 = i9;
                                int i27 = i21;
                                int i28 = i26 >> 3;
                                int i29 = (i26 & 14) | (i28 & 112) | (i28 & 896) | ((i26 << 9) & 1879048192);
                                int i30 = ((i26 >> 18) & 8176) | ((i27 << 15) & 458752);
                                long j5 = jUo;
                                composer2 = composerKN;
                                TextKt.t(text, modifier4, j5, ((Density) composerKN.ty(CompositionLocalsKt.J2())).ck(Dp.KN(TextUnit.KN(style.qie()))), style.az(), fontWeight4 != null ? style.HI() : fontWeight4, style.mUb(), ((Density) composerKN.ty(CompositionLocalsKt.J2())).ck(Dp.KN(TextUnit.KN(style.Ik()))), textDecoration3 != null ? style.g() : textDecoration3, textAlign4, ((Density) composerKN.ty(CompositionLocalsKt.J2())).ck(Dp.KN(TextUnit.KN(style.o()))), iN, z4, i25, 0, function12, null, composer2, i29, i30, 81920);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                j4 = j5;
                                textAlign3 = textAlign4;
                                i22 = iN;
                                z3 = z4;
                                i23 = i25;
                                function13 = function12;
                                fontWeight3 = fontWeight4;
                                textDecoration2 = textDecoration3;
                                modifier3 = modifier4;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.c7r
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CM.aYN(text, style, modifier3, j4, fontWeight3, textDecoration2, textAlign3, i22, z3, i23, function13, i5, i7, i8, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i18 = i17;
                        i19 = i8 & 1024;
                        if (i19 == 0) {
                        }
                        if ((i9 & 306783379) != 306783378) {
                            if (i24 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (ComposerKt.v()) {
                            }
                            int i262 = i9;
                            if (fontWeight4 != null) {
                            }
                            if (textDecoration3 != null) {
                            }
                            int i272 = i21;
                            int i282 = i262 >> 3;
                            int i292 = (i262 & 14) | (i282 & 112) | (i282 & 896) | ((i262 << 9) & 1879048192);
                            int i302 = ((i262 >> 18) & 8176) | ((i272 << 15) & 458752);
                            long j52 = jUo;
                            composer2 = composerKN;
                            TextKt.t(text, modifier4, j52, ((Density) composerKN.ty(CompositionLocalsKt.J2())).ck(Dp.KN(TextUnit.KN(style.qie()))), style.az(), fontWeight4 != null ? style.HI() : fontWeight4, style.mUb(), ((Density) composerKN.ty(CompositionLocalsKt.J2())).ck(Dp.KN(TextUnit.KN(style.Ik()))), textDecoration3 != null ? style.g() : textDecoration3, textAlign4, ((Density) composerKN.ty(CompositionLocalsKt.J2())).ck(Dp.KN(TextUnit.KN(style.o()))), iN, z4, i25, 0, function12, null, composer2, i292, i302, 81920);
                            if (ComposerKt.v()) {
                            }
                            j4 = j52;
                            textAlign3 = textAlign4;
                            i22 = iN;
                            z3 = z4;
                            i23 = i25;
                            function13 = function12;
                            fontWeight3 = fontWeight4;
                            textDecoration2 = textDecoration3;
                            modifier3 = modifier4;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i16 = i15;
                    i17 = i8 & 512;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    i19 = i8 & 1024;
                    if (i19 == 0) {
                    }
                    if ((i9 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                fontWeight2 = fontWeight;
                i12 = i8 & 32;
                if (i12 == 0) {
                }
                i13 = i8 & 64;
                if (i13 == 0) {
                }
                i14 = i8 & 128;
                if (i14 == 0) {
                }
                i15 = i8 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i8 & 512;
                if (i17 == 0) {
                }
                i18 = i17;
                i19 = i8 & 1024;
                if (i19 == 0) {
                }
                if ((i9 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            j3 = j2;
            i11 = i8 & 16;
            if (i11 != 0) {
            }
            fontWeight2 = fontWeight;
            i12 = i8 & 32;
            if (i12 == 0) {
            }
            i13 = i8 & 64;
            if (i13 == 0) {
            }
            i14 = i8 & 128;
            if (i14 == 0) {
            }
            i15 = i8 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i8 & 512;
            if (i17 == 0) {
            }
            i18 = i17;
            i19 = i8 & 1024;
            if (i19 == 0) {
            }
            if ((i9 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 8;
        if (i10 == 0) {
        }
        j3 = j2;
        i11 = i8 & 16;
        if (i11 != 0) {
        }
        fontWeight2 = fontWeight;
        i12 = i8 & 32;
        if (i12 == 0) {
        }
        i13 = i8 & 64;
        if (i13 == 0) {
        }
        i14 = i8 & 128;
        if (i14 == 0) {
        }
        i15 = i8 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i8 & 512;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i8 & 1024;
        if (i19 == 0) {
        }
        if ((i9 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(List list, MutableState mutableState, MutableState mutableState2, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.J2() || r(mutableState) || list.size() <= 1) {
            o(mutableState, true);
        } else {
            int iIndexOf = list.indexOf(HI(mutableState2)) - 1;
            if (iIndexOf <= 0) {
                Ik(mutableState2, (TextStyle) list.get(iIndexOf));
                o(mutableState, true);
            } else {
                Ik(mutableState2, (TextStyle) list.get(iIndexOf));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(MutableState mutableState, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (r(mutableState)) {
            drawWithContent.l2();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(String str, TextStyle textStyle, Modifier modifier, long j2, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i2, boolean z2, int i3, Function1 function1, int i5, int i7, int i8, Composer composer, int i9) {
        S(str, textStyle, modifier, j2, fontWeight, textDecoration, textAlign, i2, z2, i3, function1, composer, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(String str, Modifier modifier, long j2, TextAlign textAlign, TextStyle textStyle, List list, int i2, int i3, Composer composer, int i5) {
        xMQ(str, modifier, j2, textAlign, textStyle, list, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(String str, List list, Modifier modifier, long j2, TextDecoration textDecoration, TextAlign textAlign, int i2, boolean z2, int i3, int i5, int i7, Composer composer, int i8) {
        ty(str, list, modifier, j2, textDecoration, textAlign, i2, z2, i3, composer, RecomposeScopeImplKt.n(i5 | 1), i7);
        return Unit.INSTANCE;
    }

    public static final TextStyle nY(TextStyle textStyle, float f3) {
        Intrinsics.checkNotNullParameter(textStyle, "<this>");
        long jQie = textStyle.qie();
        TextUnitKt.rl(jQie);
        long jMUb = TextUnitKt.mUb(TextUnit.J2(jQie), TextUnit.KN(jQie) * f3);
        long jO = textStyle.o();
        TextUnitKt.rl(jO);
        return TextStyle.t(textStyle, 0L, jMUb, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.mUb(TextUnit.J2(jO), TextUnit.KN(jO) * f3), null, null, null, 0, 0, null, 16646141, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(MutableState mutableState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ty(final String text, final List styles, Modifier modifier, long j2, TextDecoration textDecoration, TextAlign textAlign, int i2, boolean z2, int i3, Composer composer, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        long j3;
        int i10;
        TextDecoration textDecoration2;
        int i11;
        TextAlign textAlign2;
        int i12;
        int iN;
        int i13;
        int i14;
        int i15;
        int i16;
        final boolean z3;
        final int i17;
        Object objIF;
        Composer.Companion companion;
        final MutableState mutableState;
        Object objIF2;
        final MutableState mutableState2;
        Object objIF3;
        boolean zE2;
        Object objIF4;
        final int i18;
        final TextAlign textAlign3;
        final TextDecoration textDecoration3;
        final long j4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Composer composerKN = composer.KN(-1241161182);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerKN.p5(text) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            i8 |= composerKN.E2(styles) ? 32 : 16;
        }
        int i19 = i7 & 4;
        if (i19 != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    j3 = j2;
                    i8 |= composerKN.nr(j3) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= 24576;
                } else {
                    if ((i5 & 24576) == 0) {
                        textDecoration2 = textDecoration;
                        i8 |= composerKN.p5(textDecoration2) ? 16384 : 8192;
                    }
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                        textAlign2 = textAlign;
                    } else {
                        textAlign2 = textAlign;
                        if ((i5 & 196608) == 0) {
                            i8 |= composerKN.p5(textAlign2) ? 131072 : 65536;
                        }
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                        iN = i2;
                    } else {
                        iN = i2;
                        if ((i5 & 1572864) == 0) {
                            i8 |= composerKN.t(iN) ? 1048576 : 524288;
                        }
                    }
                    i13 = i7 & 128;
                    if (i13 == 0) {
                        i8 |= 12582912;
                    } else {
                        if ((i5 & 12582912) == 0) {
                            i14 = i13;
                            i8 |= composerKN.n(z2) ? 8388608 : 4194304;
                        }
                        i15 = i7 & 256;
                        if (i15 == 0) {
                            if ((i5 & 100663296) == 0) {
                                i16 = i15;
                                i8 |= composerKN.t(i3) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i8 & 38347923) == 38347922 || !composerKN.xMQ()) {
                                Modifier modifier4 = i19 == 0 ? Modifier.INSTANCE : modifier2;
                                long jUo = i9 == 0 ? Color.INSTANCE.Uo() : j3;
                                if (i10 != 0) {
                                    textDecoration2 = null;
                                }
                                if (i11 != 0) {
                                    textAlign2 = null;
                                }
                                if (i12 != 0) {
                                    iN = TextOverflow.INSTANCE.n();
                                }
                                z3 = i14 == 0 ? true : z2;
                                i17 = i16 == 0 ? 2 : i3;
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1241161182, i8, -1, "com.alightcreative.common.compose.components.AutoResizeNonScaledText (Text.kt:44)");
                                }
                                composerKN.eF(995244133);
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                    objIF = SnapshotStateKt__SnapshotStateKt.O(CollectionsKt.last(styles), null, 2, null);
                                    composerKN.o(objIF);
                                }
                                mutableState = (MutableState) objIF;
                                composerKN.Xw();
                                composerKN.eF(995246237);
                                objIF2 = composerKN.iF();
                                if (objIF2 == companion.n()) {
                                    objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                                    composerKN.o(objIF2);
                                }
                                mutableState2 = (MutableState) objIF2;
                                composerKN.Xw();
                                TextStyle textStyleHI = HI(mutableState);
                                composerKN.eF(995278173);
                                objIF3 = composerKN.iF();
                                if (objIF3 == companion.n()) {
                                    objIF3 = new Function1() { // from class: Dj7.t
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CM.Z(mutableState2, (ContentDrawScope) obj);
                                        }
                                    };
                                    composerKN.o(objIF3);
                                }
                                composerKN.Xw();
                                Modifier modifierNr = DrawModifierKt.nr(modifier4, (Function1) objIF3);
                                composerKN.eF(995256796);
                                zE2 = composerKN.E2(styles);
                                Modifier modifier5 = modifier4;
                                objIF4 = composerKN.iF();
                                if (!zE2 || objIF4 == companion.n()) {
                                    objIF4 = new Function1() { // from class: Dj7.cA
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CM.XQ(styles, mutableState2, mutableState, (TextLayoutResult) obj);
                                        }
                                    };
                                    composerKN.o(objIF4);
                                }
                                composerKN.Xw();
                                int i20 = i8 << 3;
                                long j5 = jUo;
                                i18 = iN;
                                textAlign3 = textAlign2;
                                textDecoration3 = textDecoration2;
                                S(text, textStyleHI, modifierNr, j5, null, textDecoration3, textAlign3, i18, z3, i17, (Function1) objIF4, composerKN, (i8 & 7182) | (458752 & i20) | (3670016 & i20) | (29360128 & i20) | (234881024 & i20) | (i20 & 1879048192), 0, 16);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                j4 = j5;
                                modifier3 = modifier5;
                            } else {
                                composerKN.wTp();
                                z3 = z2;
                                textAlign3 = textAlign2;
                                modifier3 = modifier2;
                                textDecoration3 = textDecoration2;
                                i18 = iN;
                                j4 = j3;
                                i17 = i3;
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.g9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CM.ck(text, styles, modifier3, j4, textDecoration3, textAlign3, i18, z3, i17, i5, i7, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= 100663296;
                        i16 = i15;
                        if ((i8 & 38347923) == 38347922) {
                            if (i19 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (ComposerKt.v()) {
                            }
                            composerKN.eF(995244133);
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                            }
                            mutableState = (MutableState) objIF;
                            composerKN.Xw();
                            composerKN.eF(995246237);
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                            }
                            mutableState2 = (MutableState) objIF2;
                            composerKN.Xw();
                            TextStyle textStyleHI2 = HI(mutableState);
                            composerKN.eF(995278173);
                            objIF3 = composerKN.iF();
                            if (objIF3 == companion.n()) {
                            }
                            composerKN.Xw();
                            Modifier modifierNr2 = DrawModifierKt.nr(modifier4, (Function1) objIF3);
                            composerKN.eF(995256796);
                            zE2 = composerKN.E2(styles);
                            Modifier modifier52 = modifier4;
                            objIF4 = composerKN.iF();
                            if (!zE2) {
                                objIF4 = new Function1() { // from class: Dj7.cA
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CM.XQ(styles, mutableState2, mutableState, (TextLayoutResult) obj);
                                    }
                                };
                                composerKN.o(objIF4);
                                composerKN.Xw();
                                int i202 = i8 << 3;
                                long j52 = jUo;
                                i18 = iN;
                                textAlign3 = textAlign2;
                                textDecoration3 = textDecoration2;
                                S(text, textStyleHI2, modifierNr2, j52, null, textDecoration3, textAlign3, i18, z3, i17, (Function1) objIF4, composerKN, (i8 & 7182) | (458752 & i202) | (3670016 & i202) | (29360128 & i202) | (234881024 & i202) | (i202 & 1879048192), 0, 16);
                                if (ComposerKt.v()) {
                                }
                                j4 = j52;
                                modifier3 = modifier52;
                            }
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i14 = i13;
                    i15 = i7 & 256;
                    if (i15 == 0) {
                    }
                    i16 = i15;
                    if ((i8 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                textDecoration2 = textDecoration;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i13 = i7 & 128;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i7 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                if ((i8 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            j3 = j2;
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            textDecoration2 = textDecoration;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i13 = i7 & 128;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i7 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            if ((i8 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        j3 = j2;
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        textDecoration2 = textDecoration;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i13 = i7 & 128;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i7 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        if ((i8 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0143 A[LOOP:0: B:99:0x013d->B:101:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r9v17, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(final String text, Modifier modifier, long j2, TextAlign textAlign, TextStyle textStyle, List list, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        long jUo;
        int i8;
        TextAlign textAlign2;
        TextStyle textStyle2;
        int i9;
        List list2;
        final List<QaP> listEmptyList;
        TextAlign textAlign3;
        TextStyle textStyle3;
        Object objIF;
        boolean z2;
        Modifier modifierZmq;
        Object objIF2;
        Composer composer2;
        final List list3;
        final Modifier modifier3;
        final long j3;
        final TextAlign textAlign4;
        final TextStyle textStyle4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerKN = composer.KN(1293045791);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(text) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
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
                    jUo = j2;
                    i5 |= composerKN.nr(jUo) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        textAlign2 = textAlign;
                        i5 |= composerKN.p5(textAlign2) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            textStyle2 = textStyle;
                            int i11 = composerKN.p5(textStyle2) ? 16384 : 8192;
                            i5 |= i11;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i5 |= i11;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            list2 = list;
                            i5 |= composerKN.E2(list2) ? 131072 : 65536;
                        }
                        if ((i5 & 74899) == 74898 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier3 = modifier2;
                            j3 = jUo;
                            textAlign4 = textAlign2;
                            textStyle4 = textStyle2;
                            list3 = list2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    jUo = Color.INSTANCE.Uo();
                                }
                                if (i8 != 0) {
                                    textAlign2 = null;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    textStyle2 = (TextStyle) composerKN.ty(TextKt.J2());
                                }
                                if (i9 == 0) {
                                    listEmptyList = CollectionsKt.emptyList();
                                    textAlign3 = textAlign2;
                                    textStyle3 = textStyle2;
                                }
                                long j4 = jUo;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1293045791, i5, -1, "com.alightcreative.common.compose.components.AnnotatedText (Text.kt:132)");
                                }
                                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                objectRef.element = P0j.fuX.aYN(text);
                                for (QaP qaP : listEmptyList) {
                                    objectRef.element = P0j.fuX.KN((AnnotatedString) objectRef.element, qaP.n(), qaP.rl());
                                }
                                composerKN.eF(-2064317373);
                                objIF = composerKN.iF();
                                if (objIF == Composer.INSTANCE.n()) {
                                    objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                                    composerKN.o(objIF);
                                }
                                final MutableState mutableState = (MutableState) objIF;
                                composerKN.Xw();
                                if (listEmptyList.isEmpty()) {
                                    z2 = false;
                                    composerKN.eF(-2064310983);
                                    if (z2) {
                                        modifierZmq = modifier2;
                                    } else {
                                        State stateCk = SnapshotStateKt.ck(new Function1() { // from class: Dj7.qYU
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CM.mUb(listEmptyList, objectRef, ((Integer) obj).intValue());
                                            }
                                        }, composerKN, 0);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Unit unit = Unit.INSTANCE;
                                        composerKN.eF(-2064293697);
                                        boolean zP5 = composerKN.p5(stateCk);
                                        Object objIF3 = composerKN.iF();
                                        if (zP5 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new j(mutableState, stateCk);
                                            composerKN.o(objIF3);
                                        }
                                        composerKN.Xw();
                                        modifierZmq = modifier2.Zmq(SuspendingPointerInputFilterKt.nr(companion, unit, (PointerInputEventHandler) objIF3));
                                    }
                                    composerKN.Xw();
                                    AnnotatedString annotatedString = (AnnotatedString) objectRef.element;
                                    composerKN.eF(-2064279970);
                                    objIF2 = composerKN.iF();
                                    if (objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = new Function1() { // from class: Dj7.RGN
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CM.qie(mutableState, (TextLayoutResult) obj);
                                            }
                                        };
                                        composerKN.o(objIF2);
                                    }
                                    composerKN.Xw();
                                    composer2 = composerKN;
                                    TextKt.nr(annotatedString, modifierZmq, j4, 0L, null, null, null, 0L, null, textAlign3, 0L, 0, false, 0, 0, null, (Function1) objIF2, textStyle3, composer2, (i5 & 896) | ((i5 << 18) & 1879048192), ((i5 << 9) & 29360128) | 1572864, 65016);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    list3 = listEmptyList;
                                    modifier3 = modifier2;
                                    j3 = j4;
                                    textAlign4 = textAlign3;
                                    textStyle4 = textStyle3;
                                } else {
                                    Iterator it = listEmptyList.iterator();
                                    while (it.hasNext()) {
                                        if (((QaP) it.next()).rl().KN() != null) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    z2 = false;
                                    composerKN.eF(-2064310983);
                                    if (z2) {
                                    }
                                    composerKN.Xw();
                                    AnnotatedString annotatedString2 = (AnnotatedString) objectRef.element;
                                    composerKN.eF(-2064279970);
                                    objIF2 = composerKN.iF();
                                    if (objIF2 == Composer.INSTANCE.n()) {
                                    }
                                    composerKN.Xw();
                                    composer2 = composerKN;
                                    TextKt.nr(annotatedString2, modifierZmq, j4, 0L, null, null, null, 0L, null, textAlign3, 0L, 0, false, 0, 0, null, (Function1) objIF2, textStyle3, composer2, (i5 & 896) | ((i5 << 18) & 1879048192), ((i5 << 9) & 29360128) | 1572864, 65016);
                                    if (ComposerKt.v()) {
                                    }
                                    list3 = listEmptyList;
                                    modifier3 = modifier2;
                                    j3 = j4;
                                    textAlign4 = textAlign3;
                                    textStyle4 = textStyle3;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                            }
                            textAlign3 = textAlign2;
                            textStyle3 = textStyle2;
                            listEmptyList = list2;
                            long j42 = jUo;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                            objectRef2.element = P0j.fuX.aYN(text);
                            while (r7.hasNext()) {
                            }
                            composerKN.eF(-2064317373);
                            objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                            }
                            final MutableState mutableState2 = (MutableState) objIF;
                            composerKN.Xw();
                            if (listEmptyList.isEmpty()) {
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.B
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CM.az(text, modifier3, j3, textAlign4, textStyle4, list3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    list2 = list;
                    if ((i5 & 74899) == 74898) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i10 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if (i9 == 0) {
                                textAlign3 = textAlign2;
                                textStyle3 = textStyle2;
                                listEmptyList = list2;
                            }
                            long j422 = jUo;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            final Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                            objectRef22.element = P0j.fuX.aYN(text);
                            while (r7.hasNext()) {
                            }
                            composerKN.eF(-2064317373);
                            objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                            }
                            final MutableState mutableState22 = (MutableState) objIF;
                            composerKN.Xw();
                            if (listEmptyList.isEmpty()) {
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                textAlign2 = textAlign;
                if ((i2 & 24576) != 0) {
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                list2 = list;
                if ((i5 & 74899) == 74898) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            jUo = j2;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            textAlign2 = textAlign;
            if ((i2 & 24576) != 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            list2 = list;
            if ((i5 & 74899) == 74898) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        jUo = j2;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        textAlign2 = textAlign;
        if ((i2 & 24576) != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        list2 = list;
        if ((i5 & 74899) == 74898) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private static final TextStyle HI(MutableState mutableState) {
        return (TextStyle) mutableState.getValue();
    }

    private static final void Ik(MutableState mutableState, TextStyle textStyle) {
        mutableState.setValue(textStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 gh(State state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit mUb(List list, Ref.ObjectRef objectRef, int i2) {
        Function0 function0KN;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QaP qaP = (QaP) it.next();
            if (((AnnotatedString.Range) CollectionsKt.firstOrNull(((AnnotatedString) objectRef.element).xMQ(qaP.n(), i2, i2))) != null && (function0KN = qaP.rl().KN()) != null) {
                function0KN.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void o(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final boolean r(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
